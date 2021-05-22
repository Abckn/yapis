// Generated from D:/Antlr/src/main/java\Gramma.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUMINT=2, INT=3, FLOAT=4, PLUS=5, MINUS=6, MULTIPLICATION=7, DIVISION=8, 
		POW=9, RAVNO=10, NERAVNO=11, BOLSHE=12, MENSHE=13, BOLSHEILIRAVNO=14, 
		MENSHEILIRAVNO=15, Name=16, Whitespace=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "NUMINT", "INT", "FLOAT", "PLUS", "MINUS", "MULTIPLICATION", 
			"DIVISION", "POW", "RAVNO", "NERAVNO", "BOLSHE", "MENSHE", "BOLSHEILIRAVNO", 
			"MENSHEILIRAVNO", "Name", "Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", null, "'int'", "'float'", "'+'", "'-'", "'*'", "'/'", "'^'", 
			"'=='", "'!='", "'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NUMINT", "INT", "FLOAT", "PLUS", "MINUS", "MULTIPLICATION", 
			"DIVISION", "POW", "RAVNO", "NERAVNO", "BOLSHE", "MENSHE", "BOLSHEILIRAVNO", 
			"MENSHEILIRAVNO", "Name", "Whitespace"
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


	public GrammaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23c\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\6\3)\n\3\r\3\16\3*\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\6\21R\n\21\r\21"+
		"\16\21S\3\21\6\21W\n\21\r\21\16\21X\5\21[\n\21\3\22\6\22^\n\22\r\22\16"+
		"\22_\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23\3\2\6\3\2\62;\3\2c|\3\2C\\\4\2\13\f"+
		"\17\17\2g\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\3%\3\2\2\2\5(\3\2\2\2\7,\3\2\2\2\t\60\3\2\2\2\13\66\3\2"+
		"\2\2\r8\3\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25@\3\2\2\2\27C\3"+
		"\2\2\2\31F\3\2\2\2\33H\3\2\2\2\35J\3\2\2\2\37M\3\2\2\2!Z\3\2\2\2#]\3\2"+
		"\2\2%&\7?\2\2&\4\3\2\2\2\')\t\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3"+
		"\2\2\2+\6\3\2\2\2,-\7k\2\2-.\7p\2\2./\7v\2\2/\b\3\2\2\2\60\61\7h\2\2\61"+
		"\62\7n\2\2\62\63\7q\2\2\63\64\7c\2\2\64\65\7v\2\2\65\n\3\2\2\2\66\67\7"+
		"-\2\2\67\f\3\2\2\289\7/\2\29\16\3\2\2\2:;\7,\2\2;\20\3\2\2\2<=\7\61\2"+
		"\2=\22\3\2\2\2>?\7`\2\2?\24\3\2\2\2@A\7?\2\2AB\7?\2\2B\26\3\2\2\2CD\7"+
		"#\2\2DE\7?\2\2E\30\3\2\2\2FG\7@\2\2G\32\3\2\2\2HI\7>\2\2I\34\3\2\2\2J"+
		"K\7@\2\2KL\7?\2\2L\36\3\2\2\2MN\7>\2\2NO\7?\2\2O \3\2\2\2PR\t\3\2\2QP"+
		"\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T[\3\2\2\2UW\t\4\2\2VU\3\2\2\2W"+
		"X\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZQ\3\2\2\2ZV\3\2\2\2[\"\3\2\2\2"+
		"\\^\t\5\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\b\22"+
		"\2\2b$\3\2\2\2\b\2*SXZ_\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}