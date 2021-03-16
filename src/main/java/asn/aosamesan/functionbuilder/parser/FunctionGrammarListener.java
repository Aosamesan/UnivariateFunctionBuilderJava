// Generated from /Users/aosamesan/IdeaProjects/function-builder/src/main/java/asn/aosamesan/functionbuilder/parser/FunctionGrammar.g4 by ANTLR 4.9.1
package asn.aosamesan.functionbuilder.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionGrammarParser}.
 */
public interface FunctionGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(FunctionGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(FunctionGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(FunctionGrammarParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(FunctionGrammarParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#modulus}.
	 * @param ctx the parse tree
	 */
	void enterModulus(FunctionGrammarParser.ModulusContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#modulus}.
	 * @param ctx the parse tree
	 */
	void exitModulus(FunctionGrammarParser.ModulusContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(FunctionGrammarParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#multiplication}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(FunctionGrammarParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#power_without_percentage}.
	 * @param ctx the parse tree
	 */
	void enterPower_without_percentage(FunctionGrammarParser.Power_without_percentageContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#power_without_percentage}.
	 * @param ctx the parse tree
	 */
	void exitPower_without_percentage(FunctionGrammarParser.Power_without_percentageContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(FunctionGrammarParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(FunctionGrammarParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#signed_atom}.
	 * @param ctx the parse tree
	 */
	void enterSigned_atom(FunctionGrammarParser.Signed_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#signed_atom}.
	 * @param ctx the parse tree
	 */
	void exitSigned_atom(FunctionGrammarParser.Signed_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#atom_without_percentage}.
	 * @param ctx the parse tree
	 */
	void enterAtom_without_percentage(FunctionGrammarParser.Atom_without_percentageContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#atom_without_percentage}.
	 * @param ctx the parse tree
	 */
	void exitAtom_without_percentage(FunctionGrammarParser.Atom_without_percentageContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(FunctionGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(FunctionGrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#variable_with_scalar_product}.
	 * @param ctx the parse tree
	 */
	void enterVariable_with_scalar_product(FunctionGrammarParser.Variable_with_scalar_productContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#variable_with_scalar_product}.
	 * @param ctx the parse tree
	 */
	void exitVariable_with_scalar_product(FunctionGrammarParser.Variable_with_scalar_productContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#variable_with_power}.
	 * @param ctx the parse tree
	 */
	void enterVariable_with_power(FunctionGrammarParser.Variable_with_powerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#variable_with_power}.
	 * @param ctx the parse tree
	 */
	void exitVariable_with_power(FunctionGrammarParser.Variable_with_powerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#factorial}.
	 * @param ctx the parse tree
	 */
	void enterFactorial(FunctionGrammarParser.FactorialContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#factorial}.
	 * @param ctx the parse tree
	 */
	void exitFactorial(FunctionGrammarParser.FactorialContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#functional}.
	 * @param ctx the parse tree
	 */
	void enterFunctional(FunctionGrammarParser.FunctionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#functional}.
	 * @param ctx the parse tree
	 */
	void exitFunctional(FunctionGrammarParser.FunctionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(FunctionGrammarParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(FunctionGrammarParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(FunctionGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(FunctionGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(FunctionGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(FunctionGrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionGrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(FunctionGrammarParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionGrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(FunctionGrammarParser.ConstantContext ctx);
}