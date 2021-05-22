package gen;
// Generated from D:/Antlr/src/main/java\Gramma.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, PT=19, NUM=20, TYPE=21, MULT=22, DIV=23, PLUS=24, MINUS=25, 
		LOGIC=26, COMPARE=27, UNARY_OPERATOR=28, MAIN_FUNCTION_ID=29, NAME=30, 
		Whitespace=31;
	public static final int
		RULE_dbl = 0, RULE_parametr = 1, RULE_identifier = 2, RULE_unary_operator = 3, 
		RULE_expression = 4, RULE_function = 5, RULE_mainFunction = 6, RULE_function_call = 7, 
		RULE_return_rule = 8, RULE_if_rule = 9, RULE_else_rule = 10, RULE_while_rule = 11, 
		RULE_for_rule = 12, RULE_break_rule = 13, RULE_continue_rule = 14, RULE_print_rule = 15, 
		RULE_statement_rules = 16, RULE_statement = 17, RULE_program = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"dbl", "parametr", "identifier", "unary_operator", "expression", "function", 
			"mainFunction", "function_call", "return_rule", "if_rule", "else_rule", 
			"while_rule", "for_rule", "break_rule", "continue_rule", "print_rule", 
			"statement_rules", "statement", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'^'", "'!'", "','", "'{'", "'}'", "'()'", 
			"'return'", "'if'", "'else'", "'while'", "'for'", "';'", "'break'", "'continue'", 
			"'print'", "'.'", null, null, "'*'", "'/'", "'+'", "'-'", null, null, 
			null, "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "PT", "NUM", "TYPE", "MULT", 
			"DIV", "PLUS", "MINUS", "LOGIC", "COMPARE", "UNARY_OPERATOR", "MAIN_FUNCTION_ID", 
			"NAME", "Whitespace"
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
	public String getGrammarFileName() { return "Gramma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DblContext extends ParserRuleContext {
		public TerminalNode PT() { return getToken(GrammaParser.PT, 0); }
		public List<TerminalNode> NUM() { return getTokens(GrammaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GrammaParser.NUM, i);
		}
		public DblContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterDbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitDbl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitDbl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DblContext dbl() throws RecognitionException {
		DblContext _localctx = new DblContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dbl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				match(NUM);
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUM );
			setState(43);
			match(PT);
			setState(45); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(44);
					match(NUM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(47); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ParametrContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GrammaParser.TYPE, 0); }
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public TerminalNode NUM() { return getToken(GrammaParser.NUM, 0); }
		public ParametrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterParametr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitParametr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitParametr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrContext parametr() throws RecognitionException {
		ParametrContext _localctx = new ParametrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parametr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(49);
				match(TYPE);
				setState(50);
				match(NAME);
				}
				break;
			case NUM:
				{
				setState(51);
				match(NUM);
				}
				break;
			case NAME:
				{
				setState(52);
				match(NAME);
				}
				break;
			case T__2:
			case T__5:
				break;
			default:
				break;
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public TerminalNode NUM() { return getToken(GrammaParser.NUM, 0); }
		public DblContext dbl() {
			return getRuleContext(DblContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(NAME);
			setState(56);
			match(T__0);
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(57);
				match(NUM);
				}
				break;
			case 2:
				{
				setState(58);
				dbl();
				}
				break;
			case 3:
				{
				setState(59);
				function_call();
				}
				break;
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	 
		public Unary_operatorContext() { }
		public void copyFrom(Unary_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RigthContext extends Unary_operatorContext {
		public TerminalNode UNARY_OPERATOR() { return getToken(GrammaParser.UNARY_OPERATOR, 0); }
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public RigthContext(Unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterRigth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitRigth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitRigth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftContext extends Unary_operatorContext {
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public TerminalNode UNARY_OPERATOR() { return getToken(GrammaParser.UNARY_OPERATOR, 0); }
		public LeftContext(Unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unary_operator);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new LeftContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(NAME);
				setState(63);
				match(UNARY_OPERATOR);
				}
				break;
			case UNARY_OPERATOR:
				_localctx = new RigthContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(UNARY_OPERATOR);
				setState(65);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParensContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusContext extends ExpressionContext {
		public Token operation;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GrammaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammaParser.MINUS, 0); }
		public PlusMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareContext extends ExpressionContext {
		public Token operation;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMPARE() { return getToken(GrammaParser.COMPARE, 0); }
		public CompareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOperatorContext extends ExpressionContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public UnaryOperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends ExpressionContext {
		public TerminalNode NUM() { return getToken(GrammaParser.NUM, 0); }
		public DblContext dbl() {
			return getRuleContext(DblContext.class,0);
		}
		public NumContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExpressionContext {
		public Token operation;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(GrammaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(GrammaParser.DIV, 0); }
		public MulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConverterContext extends ExpressionContext {
		public TerminalNode TYPE() { return getToken(GrammaParser.TYPE, 0); }
		public TerminalNode NUM() { return getToken(GrammaParser.NUM, 0); }
		public DblContext dbl() {
			return getRuleContext(DblContext.class,0);
		}
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public TypeConverterContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterTypeConverter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitTypeConverter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitTypeConverter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdkContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdkContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterIdk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitIdk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitIdk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarEqlsFuncContext extends ExpressionContext {
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarEqlsFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterVarEqlsFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitVarEqlsFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitVarEqlsFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameContext extends ExpressionContext {
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public NameContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefineVarContext extends ExpressionContext {
		public TerminalNode TYPE() { return getToken(GrammaParser.TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefineVarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterDefineVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitDefineVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitDefineVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicContext extends ExpressionContext {
		public Token operation;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGIC() { return getToken(GrammaParser.LOGIC, 0); }
		public LogicContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(69);
				unary_operator();
				}
				break;
			case 2:
				{
				_localctx = new DefineVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(TYPE);
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(71);
					identifier();
					}
					break;
				case 2:
					{
					{
					setState(72);
					match(NAME);
					}
					}
					break;
				case 3:
					{
					{
					setState(73);
					match(NAME);
					setState(74);
					match(T__0);
					setState(75);
					expression(0);
					}
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(T__1);
				setState(79);
				expression(0);
				setState(80);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(T__4);
				setState(83);
				expression(6);
				}
				break;
			case 5:
				{
				_localctx = new VarEqlsFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(NAME);
				setState(85);
				match(T__0);
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(86);
					function_call();
					}
					break;
				case 2:
					{
					setState(87);
					expression(0);
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(90);
					match(NUM);
					}
					break;
				case 2:
					{
					setState(91);
					dbl();
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new NameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(NAME);
				}
				break;
			case 8:
				{
				_localctx = new TypeConverterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(T__1);
				setState(96);
				match(TYPE);
				setState(97);
				match(T__2);
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(98);
					match(NUM);
					}
					break;
				case 2:
					{
					setState(99);
					dbl();
					}
					break;
				case 3:
					{
					setState(100);
					match(NAME);
					}
					break;
				}
				}
				break;
			case 9:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				identifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(107);
						((MulDivContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MulDivContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(109);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(110);
						((PlusMinusContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(111);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new CompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(112);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(113);
						((CompareContext)_localctx).operation = match(COMPARE);
						setState(114);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new LogicContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(115);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(116);
						((LogicContext)_localctx).operation = match(LOGIC);
						setState(117);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new IdkContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(119);
						match(T__3);
						setState(120);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GrammaParser.TYPE, 0); }
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public List<ParametrContext> parametr() {
			return getRuleContexts(ParametrContext.class);
		}
		public ParametrContext parametr(int i) {
			return getRuleContext(ParametrContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(TYPE);
			setState(127);
			match(NAME);
			setState(128);
			match(T__1);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(129);
				parametr();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(130);
					match(T__5);
					setState(131);
					parametr();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(139);
			match(T__2);
			setState(140);
			match(T__6);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << NUM) | (1L << TYPE) | (1L << UNARY_OPERATOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(141);
				statement();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			return_rule();
			setState(148);
			match(T__7);
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

	public static class MainFunctionContext extends ParserRuleContext {
		public TerminalNode MAIN_FUNCTION_ID() { return getToken(GrammaParser.MAIN_FUNCTION_ID, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitMainFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(MAIN_FUNCTION_ID);
			setState(151);
			match(T__8);
			setState(152);
			match(T__6);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << NUM) | (1L << TYPE) | (1L << UNARY_OPERATOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(153);
				statement();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(T__7);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public List<ParametrContext> parametr() {
			return getRuleContexts(ParametrContext.class);
		}
		public ParametrContext parametr(int i) {
			return getRuleContext(ParametrContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(NAME);
			setState(162);
			match(T__1);
			{
			setState(163);
			parametr();
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(164);
				match(T__5);
				setState(165);
				parametr();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__2);
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

	public static class Return_ruleContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterReturn_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitReturn_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitReturn_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_ruleContext return_rule() throws RecognitionException {
		Return_ruleContext _localctx = new Return_ruleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_return_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__9);
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				{
				setState(174);
				expression(0);
				}
				}
				break;
			case 2:
				{
				setState(175);
				function_call();
				}
				break;
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

	public static class If_ruleContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Else_ruleContext else_rule() {
			return getRuleContext(Else_ruleContext.class,0);
		}
		public If_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterIf_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitIf_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitIf_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_ruleContext if_rule() throws RecognitionException {
		If_ruleContext _localctx = new If_ruleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__10);
			setState(179);
			match(T__1);
			setState(180);
			expression(0);
			setState(181);
			match(T__2);
			setState(182);
			match(T__6);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << NUM) | (1L << TYPE) | (1L << UNARY_OPERATOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(183);
				statement();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(T__7);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(190);
				else_rule();
				}
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

	public static class Else_ruleContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Else_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterElse_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitElse_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitElse_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_ruleContext else_rule() throws RecognitionException {
		Else_ruleContext _localctx = new Else_ruleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_else_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(193);
			match(T__11);
			setState(194);
			match(T__6);
			setState(196); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(195);
				statement();
				}
				}
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << NUM) | (1L << TYPE) | (1L << UNARY_OPERATOR) | (1L << NAME))) != 0) );
			setState(200);
			match(T__7);
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

	public static class While_ruleContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public While_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterWhile_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitWhile_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitWhile_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_ruleContext while_rule() throws RecognitionException {
		While_ruleContext _localctx = new While_ruleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__12);
			setState(203);
			match(T__1);
			setState(204);
			expression(0);
			setState(205);
			match(T__2);
			setState(206);
			match(T__6);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << NUM) | (1L << TYPE) | (1L << UNARY_OPERATOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(207);
				statement();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(T__7);
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

	public static class For_ruleContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterFor_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitFor_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitFor_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_ruleContext for_rule() throws RecognitionException {
		For_ruleContext _localctx = new For_ruleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__13);
			setState(216);
			match(T__1);
			setState(217);
			expression(0);
			setState(218);
			match(T__14);
			setState(219);
			expression(0);
			setState(220);
			match(T__14);
			setState(221);
			expression(0);
			setState(222);
			match(T__2);
			setState(223);
			match(T__6);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << NUM) | (1L << TYPE) | (1L << UNARY_OPERATOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(224);
				statement();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(T__7);
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

	public static class Break_ruleContext extends ParserRuleContext {
		public Break_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterBreak_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitBreak_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitBreak_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_ruleContext break_rule() throws RecognitionException {
		Break_ruleContext _localctx = new Break_ruleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_break_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__15);
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

	public static class Continue_ruleContext extends ParserRuleContext {
		public Continue_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterContinue_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitContinue_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitContinue_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_ruleContext continue_rule() throws RecognitionException {
		Continue_ruleContext _localctx = new Continue_ruleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_continue_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__16);
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

	public static class Print_ruleContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public Print_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterPrint_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitPrint_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitPrint_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_ruleContext print_rule() throws RecognitionException {
		Print_ruleContext _localctx = new Print_ruleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__17);
			setState(237);
			match(T__1);
			setState(238);
			match(NAME);
			setState(239);
			match(T__2);
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

	public static class Statement_rulesContext extends ParserRuleContext {
		public If_ruleContext if_rule() {
			return getRuleContext(If_ruleContext.class,0);
		}
		public Print_ruleContext print_rule() {
			return getRuleContext(Print_ruleContext.class,0);
		}
		public While_ruleContext while_rule() {
			return getRuleContext(While_ruleContext.class,0);
		}
		public For_ruleContext for_rule() {
			return getRuleContext(For_ruleContext.class,0);
		}
		public Break_ruleContext break_rule() {
			return getRuleContext(Break_ruleContext.class,0);
		}
		public Continue_ruleContext continue_rule() {
			return getRuleContext(Continue_ruleContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Statement_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterStatement_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitStatement_rules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitStatement_rules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_rulesContext statement_rules() throws RecognitionException {
		Statement_rulesContext _localctx = new Statement_rulesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement_rules);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(241);
				if_rule();
				}
				break;
			case 2:
				{
				setState(242);
				print_rule();
				}
				break;
			case 3:
				{
				setState(243);
				while_rule();
				}
				break;
			case 4:
				{
				setState(244);
				for_rule();
				}
				break;
			case 5:
				{
				setState(245);
				break_rule();
				}
				break;
			case 6:
				{
				setState(246);
				continue_rule();
				}
				break;
			case 7:
				{
				setState(248); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(247);
						expression(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(250); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 8:
				{
				setState(252);
				function_call();
				}
				break;
			case 9:
				{
				setState(253);
				function();
				}
				break;
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

	public static class StatementContext extends ParserRuleContext {
		public List<Statement_rulesContext> statement_rules() {
			return getRuleContexts(Statement_rulesContext.class);
		}
		public Statement_rulesContext statement_rules(int i) {
			return getRuleContext(Statement_rulesContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(256);
					statement_rules();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(259); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ProgramContext extends ParserRuleContext {
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener ) ((GrammaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor ) return ((GrammaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(261);
				function();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			mainFunction();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(268);
				function();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0115\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\2\3\2\6\2\60\n\2\r\2\16"+
		"\2\61\3\3\3\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3"+
		"\5\3\5\5\5E\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\6\3\6\5\6_\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6h\n\6\3\6\5\6k\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6|\n\6\f\6\16\6\177\13\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u0087\n\7\f\7\16\7\u008a\13\7\5\7\u008c\n\7\3\7\3\7\3\7\7\7\u0091"+
		"\n\7\f\7\16\7\u0094\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u009d\n\b\f\b"+
		"\16\b\u00a0\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u00a9\n\t\f\t\16\t\u00ac"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\5\n\u00b3\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u00bb\n\13\f\13\16\13\u00be\13\13\3\13\3\13\5\13\u00c2\n\13\3\f"+
		"\3\f\3\f\6\f\u00c7\n\f\r\f\16\f\u00c8\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u00d3\n\r\f\r\16\r\u00d6\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u00e4\n\16\f\16\16\16\u00e7\13\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\6\22\u00fb\n\22\r\22\16\22\u00fc\3\22\3\22\5\22\u0101\n"+
		"\22\3\23\6\23\u0104\n\23\r\23\16\23\u0105\3\24\7\24\u0109\n\24\f\24\16"+
		"\24\u010c\13\24\3\24\3\24\7\24\u0110\n\24\f\24\16\24\u0113\13\24\3\24"+
		"\2\3\n\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\4\3\2\30\31\3"+
		"\2\32\33\2\u0133\2)\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\bD\3\2\2\2\nj\3\2"+
		"\2\2\f\u0080\3\2\2\2\16\u0098\3\2\2\2\20\u00a3\3\2\2\2\22\u00af\3\2\2"+
		"\2\24\u00b4\3\2\2\2\26\u00c3\3\2\2\2\30\u00cc\3\2\2\2\32\u00d9\3\2\2\2"+
		"\34\u00ea\3\2\2\2\36\u00ec\3\2\2\2 \u00ee\3\2\2\2\"\u0100\3\2\2\2$\u0103"+
		"\3\2\2\2&\u010a\3\2\2\2(*\7\26\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2"+
		"\2\2,-\3\2\2\2-/\7\25\2\2.\60\7\26\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2"+
		"\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\64\7\27\2\2\648\7 \2\2\658\7\26\2\2"+
		"\668\7 \2\2\67\63\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\2\678\3\2\2\28\5\3"+
		"\2\2\29:\7 \2\2:>\7\3\2\2;?\7\26\2\2<?\5\2\2\2=?\5\20\t\2>;\3\2\2\2><"+
		"\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@A\7 \2\2AE\7\36\2\2BC\7\36\2\2CE\7 \2\2"+
		"D@\3\2\2\2DB\3\2\2\2E\t\3\2\2\2FG\b\6\1\2Gk\5\b\5\2HN\7\27\2\2IO\5\6\4"+
		"\2JO\7 \2\2KL\7 \2\2LM\7\3\2\2MO\5\n\6\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2"+
		"Ok\3\2\2\2PQ\7\4\2\2QR\5\n\6\2RS\7\5\2\2Sk\3\2\2\2TU\7\7\2\2Uk\5\n\6\b"+
		"VW\7 \2\2WZ\7\3\2\2X[\5\20\t\2Y[\5\n\6\2ZX\3\2\2\2ZY\3\2\2\2[k\3\2\2\2"+
		"\\_\7\26\2\2]_\5\2\2\2^\\\3\2\2\2^]\3\2\2\2_k\3\2\2\2`k\7 \2\2ab\7\4\2"+
		"\2bc\7\27\2\2cg\7\5\2\2dh\7\26\2\2eh\5\2\2\2fh\7 \2\2gd\3\2\2\2ge\3\2"+
		"\2\2gf\3\2\2\2hk\3\2\2\2ik\5\6\4\2jF\3\2\2\2jH\3\2\2\2jP\3\2\2\2jT\3\2"+
		"\2\2jV\3\2\2\2j^\3\2\2\2j`\3\2\2\2ja\3\2\2\2ji\3\2\2\2k}\3\2\2\2lm\f\r"+
		"\2\2mn\t\2\2\2n|\5\n\6\16op\f\f\2\2pq\t\3\2\2q|\5\n\6\rrs\f\13\2\2st\7"+
		"\35\2\2t|\5\n\6\fuv\f\n\2\2vw\7\34\2\2w|\5\n\6\13xy\f\t\2\2yz\7\6\2\2"+
		"z|\5\n\6\n{l\3\2\2\2{o\3\2\2\2{r\3\2\2\2{u\3\2\2\2{x\3\2\2\2|\177\3\2"+
		"\2\2}{\3\2\2\2}~\3\2\2\2~\13\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\27\2\2"+
		"\u0081\u0082\7 \2\2\u0082\u008b\7\4\2\2\u0083\u0088\5\4\3\2\u0084\u0085"+
		"\7\b\2\2\u0085\u0087\5\4\3\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\u0083\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\7\5\2\2\u008e\u0092\7\t\2\2\u008f\u0091\5$\23\2\u0090\u008f\3\2"+
		"\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\5\22\n\2\u0096\u0097\7"+
		"\n\2\2\u0097\r\3\2\2\2\u0098\u0099\7\37\2\2\u0099\u009a\7\13\2\2\u009a"+
		"\u009e\7\t\2\2\u009b\u009d\5$\23\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a2\7\n\2\2\u00a2\17\3\2\2\2\u00a3\u00a4\7 \2\2"+
		"\u00a4\u00a5\7\4\2\2\u00a5\u00aa\5\4\3\2\u00a6\u00a7\7\b\2\2\u00a7\u00a9"+
		"\5\4\3\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\5"+
		"\2\2\u00ae\21\3\2\2\2\u00af\u00b2\7\f\2\2\u00b0\u00b3\5\n\6\2\u00b1\u00b3"+
		"\5\20\t\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\23\3\2\2\2\u00b4"+
		"\u00b5\7\r\2\2\u00b5\u00b6\7\4\2\2\u00b6\u00b7\5\n\6\2\u00b7\u00b8\7\5"+
		"\2\2\u00b8\u00bc\7\t\2\2\u00b9\u00bb\5$\23\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\7\n\2\2\u00c0\u00c2\5\26\f\2\u00c1"+
		"\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\25\3\2\2\2\u00c3\u00c4\7\16\2"+
		"\2\u00c4\u00c6\7\t\2\2\u00c5\u00c7\5$\23\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\7\n\2\2\u00cb\27\3\2\2\2\u00cc\u00cd\7\17\2\2\u00cd\u00ce\7\4\2"+
		"\2\u00ce\u00cf\5\n\6\2\u00cf\u00d0\7\5\2\2\u00d0\u00d4\7\t\2\2\u00d1\u00d3"+
		"\5$\23\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\n"+
		"\2\2\u00d8\31\3\2\2\2\u00d9\u00da\7\20\2\2\u00da\u00db\7\4\2\2\u00db\u00dc"+
		"\5\n\6\2\u00dc\u00dd\7\21\2\2\u00dd\u00de\5\n\6\2\u00de\u00df\7\21\2\2"+
		"\u00df\u00e0\5\n\6\2\u00e0\u00e1\7\5\2\2\u00e1\u00e5\7\t\2\2\u00e2\u00e4"+
		"\5$\23\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\n"+
		"\2\2\u00e9\33\3\2\2\2\u00ea\u00eb\7\22\2\2\u00eb\35\3\2\2\2\u00ec\u00ed"+
		"\7\23\2\2\u00ed\37\3\2\2\2\u00ee\u00ef\7\24\2\2\u00ef\u00f0\7\4\2\2\u00f0"+
		"\u00f1\7 \2\2\u00f1\u00f2\7\5\2\2\u00f2!\3\2\2\2\u00f3\u0101\5\24\13\2"+
		"\u00f4\u0101\5 \21\2\u00f5\u0101\5\30\r\2\u00f6\u0101\5\32\16\2\u00f7"+
		"\u0101\5\34\17\2\u00f8\u0101\5\36\20\2\u00f9\u00fb\5\n\6\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u0101\3\2\2\2\u00fe\u0101\5\20\t\2\u00ff\u0101\5\f\7\2\u0100\u00f3\3"+
		"\2\2\2\u0100\u00f4\3\2\2\2\u0100\u00f5\3\2\2\2\u0100\u00f6\3\2\2\2\u0100"+
		"\u00f7\3\2\2\2\u0100\u00f8\3\2\2\2\u0100\u00fa\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0100\u00ff\3\2\2\2\u0101#\3\2\2\2\u0102\u0104\5\"\22\2\u0103\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"%\3\2\2\2\u0107\u0109\5\f\7\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2"+
		"\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010d\u0111\5\16\b\2\u010e\u0110\5\f\7\2\u010f\u010e\3\2\2\2"+
		"\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\'\3"+
		"\2\2\2\u0113\u0111\3\2\2\2\36+\61\67>DNZ^gj{}\u0088\u008b\u0092\u009e"+
		"\u00aa\u00b2\u00bc\u00c1\u00c8\u00d4\u00e5\u00fc\u0100\u0105\u010a\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}