package asn.aosamesan.functionbuilder.builder;

import asn.aosamesan.functionbuilder.functions.UnivariateFunction;
import asn.aosamesan.functionbuilder.listeners.FunctionBuilderListener;
import asn.aosamesan.functionbuilder.parser.FunctionGrammarLexer;
import asn.aosamesan.functionbuilder.parser.FunctionGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class FunctionBuilder {
    public static UnivariateFunction build(String input) {
        var stream = CharStreams.fromString(input);
        var lexer = new FunctionGrammarLexer(stream);
        var tokenStream = new CommonTokenStream(lexer);
        var parser = new FunctionGrammarParser(tokenStream);
        var listener = new FunctionBuilderListener();
        var tree = parser.start();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        return listener.build();
    }
}
