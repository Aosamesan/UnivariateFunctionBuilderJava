// Generated from /Users/aosamesan/IdeaProjects/function-builder/src/main/java/asn/aosamesan/functionbuilder/parser/FunctionGrammar.g4 by ANTLR 4.9.1
package asn.aosamesan.functionbuilder.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunctionGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, VARIABLE=3, PLUS=4, MINUS=5, ASTER=6, SLASH=7, POWER=8, 
		PERCENT=9, FACTORIAL=10, EULER=11, PI=12, MODULUS=13, SIN=14, COSEC=15, 
		COS=16, SEC=17, TAN=18, COT=19, ARCSIN=20, ARCCSC=21, ARCCOS=22, ARCSEC=23, 
		ARCTAN=24, ARCCOT=25, SINH=26, COSH=27, TANH=28, CSCH=29, SECH=30, COTH=31, 
		ASINH=32, ACOSH=33, ATANH=34, ACSCH=35, ASECH=36, ACOTH=37, LOG10=38, 
		LOG=39, EXP=40, SQRT=41, GAMMA=42, FACT=43, NUMBER=44, WHITESPACE=45;
	public static final int
		RULE_start = 0, RULE_addition = 1, RULE_modulus = 2, RULE_multiplication = 3, 
		RULE_power_without_percentage = 4, RULE_power = 5, RULE_signed_atom = 6, 
		RULE_atom_without_percentage = 7, RULE_atom = 8, RULE_variable_with_scalar_product = 9, 
		RULE_variable_with_power = 10, RULE_factorial = 11, RULE_functional = 12, 
		RULE_function_name = 13, RULE_number = 14, RULE_variable = 15, RULE_constant = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "addition", "modulus", "multiplication", "power_without_percentage", 
			"power", "signed_atom", "atom_without_percentage", "atom", "variable_with_scalar_product", 
			"variable_with_power", "factorial", "functional", "function_name", "number", 
			"variable", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'x'", "'+'", "'-'", null, null, "'^'", "'%'", "'!'", 
			"'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "VARIABLE", "PLUS", "MINUS", "ASTER", "SLASH", 
			"POWER", "PERCENT", "FACTORIAL", "EULER", "PI", "MODULUS", "SIN", "COSEC", 
			"COS", "SEC", "TAN", "COT", "ARCSIN", "ARCCSC", "ARCCOS", "ARCSEC", "ARCTAN", 
			"ARCCOT", "SINH", "COSH", "TANH", "CSCH", "SECH", "COTH", "ASINH", "ACOSH", 
			"ATANH", "ACSCH", "ASECH", "ACOTH", "LOG10", "LOG", "EXP", "SQRT", "GAMMA", 
			"FACT", "NUMBER", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FunctionGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FunctionGrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			addition(0);
			setState(35);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionContext extends ParserRuleContext {
		public Token op;
		public ModulusContext modulus() {
			return getRuleContext(ModulusContext.class,0);
		}
		public List<AdditionContext> addition() {
			return getRuleContexts(AdditionContext.class);
		}
		public AdditionContext addition(int i) {
			return getRuleContext(AdditionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(FunctionGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionGrammarParser.MINUS, 0); }
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitAddition(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		return addition(0);
	}

	private AdditionContext addition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditionContext _localctx = new AdditionContext(_ctx, _parentState);
		AdditionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_addition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(38);
			modulus(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_addition);
					setState(40);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(41);
					((AdditionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((AdditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(42);
					addition(2);
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ModulusContext extends ParserRuleContext {
		public Token op;
		public MultiplicationContext multiplication() {
			return getRuleContext(MultiplicationContext.class,0);
		}
		public List<ModulusContext> modulus() {
			return getRuleContexts(ModulusContext.class);
		}
		public ModulusContext modulus(int i) {
			return getRuleContext(ModulusContext.class,i);
		}
		public TerminalNode MODULUS() { return getToken(FunctionGrammarParser.MODULUS, 0); }
		public TerminalNode PERCENT() { return getToken(FunctionGrammarParser.PERCENT, 0); }
		public TerminalNode LPAREN() { return getToken(FunctionGrammarParser.LPAREN, 0); }
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FunctionGrammarParser.RPAREN, 0); }
		public ModulusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterModulus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitModulus(this);
		}
	}

	public final ModulusContext modulus() throws RecognitionException {
		return modulus(0);
	}

	private ModulusContext modulus(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ModulusContext _localctx = new ModulusContext(_ctx, _parentState);
		ModulusContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_modulus, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(49);
			multiplication(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(60);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ModulusContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_modulus);
						setState(51);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(52);
						((ModulusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PERCENT || _la==MODULUS) ) {
							((ModulusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(53);
						modulus(3);
						}
						break;
					case 2:
						{
						_localctx = new ModulusContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_modulus);
						setState(54);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(55);
						((ModulusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PERCENT || _la==MODULUS) ) {
							((ModulusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(56);
						match(LPAREN);
						setState(57);
						addition(0);
						setState(58);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicationContext extends ParserRuleContext {
		public Token op;
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public Signed_atomContext signed_atom() {
			return getRuleContext(Signed_atomContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FunctionGrammarParser.LPAREN, 0); }
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FunctionGrammarParser.RPAREN, 0); }
		public List<MultiplicationContext> multiplication() {
			return getRuleContexts(MultiplicationContext.class);
		}
		public MultiplicationContext multiplication(int i) {
			return getRuleContext(MultiplicationContext.class,i);
		}
		public TerminalNode ASTER() { return getToken(FunctionGrammarParser.ASTER, 0); }
		public TerminalNode SLASH() { return getToken(FunctionGrammarParser.SLASH, 0); }
		public Power_without_percentageContext power_without_percentage() {
			return getRuleContext(Power_without_percentageContext.class,0);
		}
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitMultiplication(this);
		}
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		return multiplication(0);
	}

	private MultiplicationContext multiplication(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, _parentState);
		MultiplicationContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_multiplication, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(66);
				power(0);
				}
				break;
			case 2:
				{
				setState(67);
				signed_atom();
				}
				break;
			case 3:
				{
				setState(68);
				match(LPAREN);
				setState(69);
				addition(0);
				setState(70);
				match(RPAREN);
				setState(71);
				multiplication(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(80);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplication);
						setState(75);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(76);
						((MultiplicationContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ASTER || _la==SLASH) ) {
							((MultiplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(77);
						multiplication(4);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplication);
						setState(78);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(79);
						power_without_percentage(0);
						}
						break;
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Power_without_percentageContext extends ParserRuleContext {
		public Token op;
		public Atom_without_percentageContext atom_without_percentage() {
			return getRuleContext(Atom_without_percentageContext.class,0);
		}
		public Power_without_percentageContext power_without_percentage() {
			return getRuleContext(Power_without_percentageContext.class,0);
		}
		public TerminalNode POWER() { return getToken(FunctionGrammarParser.POWER, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public Signed_atomContext signed_atom() {
			return getRuleContext(Signed_atomContext.class,0);
		}
		public Power_without_percentageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power_without_percentage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterPower_without_percentage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitPower_without_percentage(this);
		}
	}

	public final Power_without_percentageContext power_without_percentage() throws RecognitionException {
		return power_without_percentage(0);
	}

	private Power_without_percentageContext power_without_percentage(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Power_without_percentageContext _localctx = new Power_without_percentageContext(_ctx, _parentState);
		Power_without_percentageContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_power_without_percentage, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(86);
			atom_without_percentage();
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Power_without_percentageContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_power_without_percentage);
					setState(88);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(89);
					((Power_without_percentageContext)_localctx).op = match(POWER);
					setState(92);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAREN:
					case VARIABLE:
					case SIN:
					case COSEC:
					case COS:
					case SEC:
					case TAN:
					case COT:
					case ARCSIN:
					case ARCCSC:
					case ARCCOS:
					case ARCSEC:
					case ARCTAN:
					case ARCCOT:
					case SINH:
					case COSH:
					case TANH:
					case CSCH:
					case SECH:
					case COTH:
					case ASINH:
					case ACOSH:
					case ATANH:
					case ACSCH:
					case ASECH:
					case ACOTH:
					case LOG10:
					case LOG:
					case EXP:
					case SQRT:
					case GAMMA:
					case FACT:
					case NUMBER:
						{
						setState(90);
						power(0);
						}
						break;
					case PLUS:
					case MINUS:
						{
						setState(91);
						signed_atom();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PowerContext extends ParserRuleContext {
		public Token op;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
		}
		public TerminalNode POWER() { return getToken(FunctionGrammarParser.POWER, 0); }
		public Signed_atomContext signed_atom() {
			return getRuleContext(Signed_atomContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		return power(0);
	}

	private PowerContext power(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PowerContext _localctx = new PowerContext(_ctx, _parentState);
		PowerContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_power, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(100);
			atom(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PowerContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_power);
					setState(102);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(103);
					((PowerContext)_localctx).op = match(POWER);
					setState(106);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAREN:
					case VARIABLE:
					case SIN:
					case COSEC:
					case COS:
					case SEC:
					case TAN:
					case COT:
					case ARCSIN:
					case ARCCSC:
					case ARCCOS:
					case ARCSEC:
					case ARCTAN:
					case ARCCOT:
					case SINH:
					case COSH:
					case TANH:
					case CSCH:
					case SECH:
					case COTH:
					case ASINH:
					case ACOSH:
					case ATANH:
					case ACSCH:
					case ASECH:
					case ACOTH:
					case LOG10:
					case LOG:
					case EXP:
					case SQRT:
					case GAMMA:
					case FACT:
					case NUMBER:
						{
						setState(104);
						power(0);
						}
						break;
					case PLUS:
					case MINUS:
						{
						setState(105);
						signed_atom();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Signed_atomContext extends ParserRuleContext {
		public Token sign;
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(FunctionGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionGrammarParser.MINUS, 0); }
		public Signed_atomContext signed_atom() {
			return getRuleContext(Signed_atomContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FunctionGrammarParser.LPAREN, 0); }
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FunctionGrammarParser.RPAREN, 0); }
		public Signed_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterSigned_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitSigned_atom(this);
		}
	}

	public final Signed_atomContext signed_atom() throws RecognitionException {
		Signed_atomContext _localctx = new Signed_atomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_signed_atom);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((Signed_atomContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Signed_atomContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				power(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				((Signed_atomContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Signed_atomContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				signed_atom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				((Signed_atomContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Signed_atomContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				match(LPAREN);
				setState(119);
				addition(0);
				setState(120);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atom_without_percentageContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FunctionalContext functional() {
			return getRuleContext(FunctionalContext.class,0);
		}
		public Variable_with_scalar_productContext variable_with_scalar_product() {
			return getRuleContext(Variable_with_scalar_productContext.class,0);
		}
		public Variable_with_powerContext variable_with_power() {
			return getRuleContext(Variable_with_powerContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FunctionGrammarParser.LPAREN, 0); }
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FunctionGrammarParser.RPAREN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public FactorialContext factorial() {
			return getRuleContext(FactorialContext.class,0);
		}
		public Atom_without_percentageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_without_percentage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterAtom_without_percentage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitAtom_without_percentage(this);
		}
	}

	public final Atom_without_percentageContext atom_without_percentage() throws RecognitionException {
		Atom_without_percentageContext _localctx = new Atom_without_percentageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atom_without_percentage);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				functional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				variable_with_scalar_product();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				variable_with_power();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				match(LPAREN);
				setState(129);
				addition(0);
				setState(130);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				atom(0);
				setState(133);
				factorial();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public FunctionalContext functional() {
			return getRuleContext(FunctionalContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Variable_with_scalar_productContext variable_with_scalar_product() {
			return getRuleContext(Variable_with_scalar_productContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FunctionGrammarParser.LPAREN, 0); }
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FunctionGrammarParser.RPAREN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public FactorialContext factorial() {
			return getRuleContext(FactorialContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		return atom(0);
	}

	private AtomContext atom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AtomContext _localctx = new AtomContext(_ctx, _parentState);
		AtomContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_atom, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(138);
				number();
				}
				break;
			case 2:
				{
				setState(139);
				functional();
				}
				break;
			case 3:
				{
				setState(140);
				variable();
				}
				break;
			case 4:
				{
				setState(141);
				variable_with_scalar_product();
				}
				break;
			case 5:
				{
				setState(142);
				match(LPAREN);
				setState(143);
				addition(0);
				setState(144);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AtomContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_atom);
					setState(148);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(149);
					factorial();
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Variable_with_scalar_productContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Variable_with_scalar_productContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_with_scalar_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterVariable_with_scalar_product(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitVariable_with_scalar_product(this);
		}
	}

	public final Variable_with_scalar_productContext variable_with_scalar_product() throws RecognitionException {
		Variable_with_scalar_productContext _localctx = new Variable_with_scalar_productContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_with_scalar_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			number();
			setState(156);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_with_powerContext extends ParserRuleContext {
		public Token sign;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode POWER() { return getToken(FunctionGrammarParser.POWER, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public Signed_atomContext signed_atom() {
			return getRuleContext(Signed_atomContext.class,0);
		}
		public Variable_with_powerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_with_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterVariable_with_power(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitVariable_with_power(this);
		}
	}

	public final Variable_with_powerContext variable_with_power() throws RecognitionException {
		Variable_with_powerContext _localctx = new Variable_with_powerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable_with_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			variable();
			setState(159);
			((Variable_with_powerContext)_localctx).sign = match(POWER);
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case VARIABLE:
			case SIN:
			case COSEC:
			case COS:
			case SEC:
			case TAN:
			case COT:
			case ARCSIN:
			case ARCCSC:
			case ARCCOS:
			case ARCSEC:
			case ARCTAN:
			case ARCCOT:
			case SINH:
			case COSH:
			case TANH:
			case CSCH:
			case SECH:
			case COTH:
			case ASINH:
			case ACOSH:
			case ATANH:
			case ACSCH:
			case ASECH:
			case ACOTH:
			case LOG10:
			case LOG:
			case EXP:
			case SQRT:
			case GAMMA:
			case FACT:
			case NUMBER:
				{
				setState(160);
				power(0);
				}
				break;
			case PLUS:
			case MINUS:
				{
				setState(161);
				signed_atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorialContext extends ParserRuleContext {
		public TerminalNode FACTORIAL() { return getToken(FunctionGrammarParser.FACTORIAL, 0); }
		public FactorialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterFactorial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitFactorial(this);
		}
	}

	public final FactorialContext factorial() throws RecognitionException {
		FactorialContext _localctx = new FactorialContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factorial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(FACTORIAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionalContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Signed_atomContext signed_atom() {
			return getRuleContext(Signed_atomContext.class,0);
		}
		public FunctionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterFunctional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitFunctional(this);
		}
	}

	public final FunctionalContext functional() throws RecognitionException {
		FunctionalContext _localctx = new FunctionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functional);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				function_name();
				setState(167);
				atom(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				function_name();
				setState(170);
				signed_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode SQRT() { return getToken(FunctionGrammarParser.SQRT, 0); }
		public TerminalNode SIN() { return getToken(FunctionGrammarParser.SIN, 0); }
		public TerminalNode COS() { return getToken(FunctionGrammarParser.COS, 0); }
		public TerminalNode TAN() { return getToken(FunctionGrammarParser.TAN, 0); }
		public TerminalNode COSEC() { return getToken(FunctionGrammarParser.COSEC, 0); }
		public TerminalNode SEC() { return getToken(FunctionGrammarParser.SEC, 0); }
		public TerminalNode COT() { return getToken(FunctionGrammarParser.COT, 0); }
		public TerminalNode ARCSIN() { return getToken(FunctionGrammarParser.ARCSIN, 0); }
		public TerminalNode ARCCOS() { return getToken(FunctionGrammarParser.ARCCOS, 0); }
		public TerminalNode ARCTAN() { return getToken(FunctionGrammarParser.ARCTAN, 0); }
		public TerminalNode ARCCSC() { return getToken(FunctionGrammarParser.ARCCSC, 0); }
		public TerminalNode ARCSEC() { return getToken(FunctionGrammarParser.ARCSEC, 0); }
		public TerminalNode ARCCOT() { return getToken(FunctionGrammarParser.ARCCOT, 0); }
		public TerminalNode SINH() { return getToken(FunctionGrammarParser.SINH, 0); }
		public TerminalNode COSH() { return getToken(FunctionGrammarParser.COSH, 0); }
		public TerminalNode TANH() { return getToken(FunctionGrammarParser.TANH, 0); }
		public TerminalNode CSCH() { return getToken(FunctionGrammarParser.CSCH, 0); }
		public TerminalNode SECH() { return getToken(FunctionGrammarParser.SECH, 0); }
		public TerminalNode COTH() { return getToken(FunctionGrammarParser.COTH, 0); }
		public TerminalNode ASINH() { return getToken(FunctionGrammarParser.ASINH, 0); }
		public TerminalNode ACOSH() { return getToken(FunctionGrammarParser.ACOSH, 0); }
		public TerminalNode ATANH() { return getToken(FunctionGrammarParser.ATANH, 0); }
		public TerminalNode ACSCH() { return getToken(FunctionGrammarParser.ACSCH, 0); }
		public TerminalNode ASECH() { return getToken(FunctionGrammarParser.ASECH, 0); }
		public TerminalNode ACOTH() { return getToken(FunctionGrammarParser.ACOTH, 0); }
		public TerminalNode LOG() { return getToken(FunctionGrammarParser.LOG, 0); }
		public TerminalNode LOG10() { return getToken(FunctionGrammarParser.LOG10, 0); }
		public TerminalNode EXP() { return getToken(FunctionGrammarParser.EXP, 0); }
		public TerminalNode GAMMA() { return getToken(FunctionGrammarParser.GAMMA, 0); }
		public TerminalNode FACT() { return getToken(FunctionGrammarParser.FACT, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIN) | (1L << COSEC) | (1L << COS) | (1L << SEC) | (1L << TAN) | (1L << COT) | (1L << ARCSIN) | (1L << ARCCSC) | (1L << ARCCOS) | (1L << ARCSEC) | (1L << ARCTAN) | (1L << ARCCOT) | (1L << SINH) | (1L << COSH) | (1L << TANH) | (1L << CSCH) | (1L << SECH) | (1L << COTH) | (1L << ASINH) | (1L << ACOSH) | (1L << ATANH) | (1L << ACSCH) | (1L << ASECH) | (1L << ACOTH) | (1L << LOG10) | (1L << LOG) | (1L << EXP) | (1L << SQRT) | (1L << GAMMA) | (1L << FACT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(FunctionGrammarParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(FunctionGrammarParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(FunctionGrammarParser.PI, 0); }
		public TerminalNode EULER() { return getToken(FunctionGrammarParser.EULER, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionGrammarListener ) ((FunctionGrammarListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==EULER || _la==PI) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return addition_sempred((AdditionContext)_localctx, predIndex);
		case 2:
			return modulus_sempred((ModulusContext)_localctx, predIndex);
		case 3:
			return multiplication_sempred((MultiplicationContext)_localctx, predIndex);
		case 4:
			return power_without_percentage_sempred((Power_without_percentageContext)_localctx, predIndex);
		case 5:
			return power_sempred((PowerContext)_localctx, predIndex);
		case 8:
			return atom_sempred((AtomContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean addition_sempred(AdditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean modulus_sempred(ModulusContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplication_sempred(MultiplicationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean power_without_percentage_sempred(Power_without_percentageContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean power_sempred(PowerContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean atom_sempred(AtomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\5\3\5\3\5\3\5\3\5\7\5S\n\5\f\5\16"+
		"\5V\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\7\6a\n\6\f\6\16\6d\13\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7m\n\7\7\7o\n\7\f\7\16\7r\13\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b}\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u008a\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0095"+
		"\n\n\3\n\3\n\7\n\u0099\n\n\f\n\16\n\u009c\13\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\5\f\u00a5\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00af"+
		"\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\2\b\4\6\b\n\f\22\23"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\7\3\2\6\7\4\2\13\13\17\17"+
		"\3\2\b\t\3\2\20-\3\2\r\16\2\u00c0\2$\3\2\2\2\4\'\3\2\2\2\6\62\3\2\2\2"+
		"\bK\3\2\2\2\nW\3\2\2\2\fe\3\2\2\2\16|\3\2\2\2\20\u0089\3\2\2\2\22\u0094"+
		"\3\2\2\2\24\u009d\3\2\2\2\26\u00a0\3\2\2\2\30\u00a6\3\2\2\2\32\u00ae\3"+
		"\2\2\2\34\u00b0\3\2\2\2\36\u00b2\3\2\2\2 \u00b4\3\2\2\2\"\u00b6\3\2\2"+
		"\2$%\5\4\3\2%&\7\2\2\3&\3\3\2\2\2\'(\b\3\1\2()\5\6\4\2)/\3\2\2\2*+\f\3"+
		"\2\2+,\t\2\2\2,.\5\4\3\4-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60"+
		"\5\3\2\2\2\61/\3\2\2\2\62\63\b\4\1\2\63\64\5\b\5\2\64@\3\2\2\2\65\66\f"+
		"\4\2\2\66\67\t\3\2\2\67?\5\6\4\589\f\3\2\29:\t\3\2\2:;\7\3\2\2;<\5\4\3"+
		"\2<=\7\4\2\2=?\3\2\2\2>\65\3\2\2\2>8\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2A\7\3\2\2\2B@\3\2\2\2CD\b\5\1\2DL\5\f\7\2EL\5\16\b\2FG\7\3\2\2GH\5"+
		"\4\3\2HI\7\4\2\2IJ\5\b\5\4JL\3\2\2\2KC\3\2\2\2KE\3\2\2\2KF\3\2\2\2LT\3"+
		"\2\2\2MN\f\5\2\2NO\t\4\2\2OS\5\b\5\6PQ\f\3\2\2QS\5\n\6\2RM\3\2\2\2RP\3"+
		"\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\t\3\2\2\2VT\3\2\2\2WX\b\6\1\2XY"+
		"\5\20\t\2Yb\3\2\2\2Z[\f\3\2\2[^\7\n\2\2\\_\5\f\7\2]_\5\16\b\2^\\\3\2\2"+
		"\2^]\3\2\2\2_a\3\2\2\2`Z\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\13\3\2"+
		"\2\2db\3\2\2\2ef\b\7\1\2fg\5\22\n\2gp\3\2\2\2hi\f\3\2\2il\7\n\2\2jm\5"+
		"\f\7\2km\5\16\b\2lj\3\2\2\2lk\3\2\2\2mo\3\2\2\2nh\3\2\2\2or\3\2\2\2pn"+
		"\3\2\2\2pq\3\2\2\2q\r\3\2\2\2rp\3\2\2\2st\t\2\2\2t}\5\f\7\2uv\t\2\2\2"+
		"v}\5\16\b\2wx\t\2\2\2xy\7\3\2\2yz\5\4\3\2z{\7\4\2\2{}\3\2\2\2|s\3\2\2"+
		"\2|u\3\2\2\2|w\3\2\2\2}\17\3\2\2\2~\u008a\5\"\22\2\177\u008a\5\32\16\2"+
		"\u0080\u008a\5\24\13\2\u0081\u008a\5\26\f\2\u0082\u0083\7\3\2\2\u0083"+
		"\u0084\5\4\3\2\u0084\u0085\7\4\2\2\u0085\u008a\3\2\2\2\u0086\u0087\5\22"+
		"\n\2\u0087\u0088\5\30\r\2\u0088\u008a\3\2\2\2\u0089~\3\2\2\2\u0089\177"+
		"\3\2\2\2\u0089\u0080\3\2\2\2\u0089\u0081\3\2\2\2\u0089\u0082\3\2\2\2\u0089"+
		"\u0086\3\2\2\2\u008a\21\3\2\2\2\u008b\u008c\b\n\1\2\u008c\u0095\5\36\20"+
		"\2\u008d\u0095\5\32\16\2\u008e\u0095\5 \21\2\u008f\u0095\5\24\13\2\u0090"+
		"\u0091\7\3\2\2\u0091\u0092\5\4\3\2\u0092\u0093\7\4\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u008b\3\2\2\2\u0094\u008d\3\2\2\2\u0094\u008e\3\2\2\2\u0094"+
		"\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0095\u009a\3\2\2\2\u0096\u0097\f\3"+
		"\2\2\u0097\u0099\5\30\r\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\23\3\2\2\2\u009c\u009a\3\2\2"+
		"\2\u009d\u009e\5\36\20\2\u009e\u009f\5 \21\2\u009f\25\3\2\2\2\u00a0\u00a1"+
		"\5 \21\2\u00a1\u00a4\7\n\2\2\u00a2\u00a5\5\f\7\2\u00a3\u00a5\5\16\b\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\27\3\2\2\2\u00a6\u00a7"+
		"\7\f\2\2\u00a7\31\3\2\2\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa\5\22\n\2\u00aa"+
		"\u00af\3\2\2\2\u00ab\u00ac\5\34\17\2\u00ac\u00ad\5\16\b\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\33\3\2\2\2\u00b0"+
		"\u00b1\t\5\2\2\u00b1\35\3\2\2\2\u00b2\u00b3\7.\2\2\u00b3\37\3\2\2\2\u00b4"+
		"\u00b5\7\5\2\2\u00b5!\3\2\2\2\u00b6\u00b7\t\6\2\2\u00b7#\3\2\2\2\22/>"+
		"@KRT^blp|\u0089\u0094\u009a\u00a4\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}