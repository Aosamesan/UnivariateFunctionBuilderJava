package asn.aosamesan.functionbuilder.listeners;

import asn.aosamesan.functionbuilder.domain.Domain;
import asn.aosamesan.functionbuilder.functions.UnivariateFunction;
import asn.aosamesan.functionbuilder.parser.FunctionGrammarBaseListener;
import asn.aosamesan.functionbuilder.parser.FunctionGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

import static asn.aosamesan.functionbuilder.functions.BinaryOperator.BinaryOperators.*;

public final class FunctionBuilderListener extends FunctionGrammarBaseListener {
    private Stack<UnivariateFunction> stack = new Stack<>();
    private Domain domain = Domain.RealNumber;

    public UnivariateFunction build() {
        if (stack.size() != 1) {
            throw new RuntimeException("Stack size failed :" + stack.size());
        }
        return stack.pop();
    }

    @Override
    public void exitAddition(FunctionGrammarParser.AdditionContext context) {
        if (context.op != null) {
            var op = context.op.getText().toLowerCase();
            var post = stack.pop();
            var prev = stack.pop();

            switch (op) {
                case "+" -> stack.push(ADD.operate(prev, post));
                case "-" -> stack.push(SUB.operate(prev, post));
            }
        }
    }

    @Override
    public void exitModulus(FunctionGrammarParser.ModulusContext context) {
        if (context.op != null) {
            var op = context.op.getText().toLowerCase();
            var post = stack.pop();
            var prev = stack.pop();

            switch (op) {
                case "%", "mod" -> stack.push(MOD.operate(prev, post));
            }
        }
    }

    @Override
    public void exitMultiplication(FunctionGrammarParser.MultiplicationContext context) {
        if (context.power() == null && context.signed_atom() == null) {
            var post = stack.pop();
            var prev = stack.pop();
            if (context.op != null) {
                var op = context.op.getText().toLowerCase();

                switch (op) {
                    case "*", "×" -> stack.push(MUL.operate(prev, post));
                    case "/", "÷" -> stack.push(DIV.operate(prev, post));
                }
            } else {
                stack.push(MUL.operate(prev, post));
            }
        }
    }

    @Override
    public void exitPower_without_percentage(FunctionGrammarParser.Power_without_percentageContext context) {
        if (context.op != null) {
            var op = context.op.getText().toLowerCase();
            var post = stack.pop();
            var prev = stack.pop();

            if ("^".equals(op)) {
                stack.push(POW.operate(prev, post));
            }
        }
    }

    @Override
    public void exitPower(FunctionGrammarParser.PowerContext context) {
        if (context.op != null) {
            var op = context.op.getText().toLowerCase();
            var post = stack.pop();
            var prev = stack.pop();

            if ("^".equals(op)) {
                stack.push(POW.operate(prev, post));
            }
        }
    }

    @Override
    public void exitSigned_atom(FunctionGrammarParser.Signed_atomContext context) {
        if (context.sign != null) {
            var top = stack.pop();
            stack.push(top.composeOutter(UnivariateFunction.Negative));
        }
    }

    @Override
    public void exitAtom_without_percentage(FunctionGrammarParser.Atom_without_percentageContext context) {
        if (context.factorial() != null) {
            var top = stack.pop();
            stack.push(top.composeOutter(UnivariateFunction.TranscendentalFunctions.FACTORIAL));
        }
    }

    @Override
    public void exitVariable_with_scalar_product(FunctionGrammarParser.Variable_with_scalar_productContext context) {
        var post = stack.pop();
        var prev = stack.pop();
        stack.push(MUL.operate(prev, post));
    }

    @Override
    public void exitVariable_with_power(FunctionGrammarParser.Variable_with_powerContext context) {
        var post = stack.pop();
        var prev = stack.pop();
        stack.push(POW.operate(prev, post));
    }

    @Override
    public void exitFunctional(FunctionGrammarParser.FunctionalContext context) {
        var functionName = context.function_name().getText();
        var top = stack.pop();
        UnivariateFunction function = UnivariateFunction.IrrationalFunctions.getFunction(functionName);
        if (function == null) {
            function = UnivariateFunction.TranscendentalFunctions.getFunction(functionName);
        }
        domain = Domain.intersect(domain, function.getDomain());
        stack.push(top.composeOutter(function));
    }

    @Override
    public void exitNumber(FunctionGrammarParser.NumberContext context) {
        stack.push(x -> Double.parseDouble(context.NUMBER().getText()));
    }

    @Override
    public void exitVariable(FunctionGrammarParser.VariableContext context) {
        stack.push(UnivariateFunction.Identity);
    }

    @Override
    public void exitConstant(FunctionGrammarParser.ConstantContext context) {
        var constant = switch (context.getText().toLowerCase()) {
            case "pi", "π" -> Math.PI;
            case "e" -> Math.E;
            default -> throw new RuntimeException("Unexpected token :" + context.getText());
        };
        stack.push(x -> constant);
    }
}
