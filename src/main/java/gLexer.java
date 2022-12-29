// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DIGIT=1, NUMBER=2, STRING=3, EQ=4, NE=5, GT=6, LT=7, GTE=8, LTE=9, AND=10, 
		OR=11, NOT=12, TO=13, CONTAINS=14, FIELD=15, LPAREN=16, RPAREN=17, LBRACK=18, 
		RBRACK=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "NUMBER", "STRING", "EQ", "NE", "GT", "LT", "GTE", "LTE", "AND", 
			"OR", "NOT", "TO", "CONTAINS", "FIELD", "LPAREN", "RPAREN", "LBRACK", 
			"RBRACK", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'='", "'!='", "'>'", "'<'", "'>='", "'<='", 
			null, null, null, null, null, null, "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DIGIT", "NUMBER", "STRING", "EQ", "NE", "GT", "LT", "GTE", "LTE", 
			"AND", "OR", "NOT", "TO", "CONTAINS", "FIELD", "LPAREN", "RPAREN", "LBRACK", 
			"RBRACK", "WS"
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


	public gLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "g.g4"; }

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
		"\u0004\u0000\u0014\u009c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001"+
		"\u0001\u0002\u0004\u00024\b\u0002\u000b\u0002\f\u00025\u0001\u0002\u0004"+
		"\u00029\b\u0002\u000b\u0002\f\u0002:\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002@\b\u0002\u000b\u0002\f\u0002A\u0001\u0002\u0004\u0002E\b"+
		"\u0002\u000b\u0002\f\u0002F\u0001\u0002\u0004\u0002J\b\u0002\u000b\u0002"+
		"\f\u0002K\u0001\u0002\u0004\u0002O\b\u0002\u000b\u0002\f\u0002P\u0001"+
		"\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0004\u000e"+
		"~\b\u000e\u000b\u000e\f\u000e\u007f\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0084\b\u000e\n\u000e\f\u000e\u0087\t\u000e\u0005\u000e\u0089\b\u000e"+
		"\n\u000e\f\u000e\u008c\t\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0004"+
		"\u0013\u0097\b\u0013\u000b\u0013\f\u0013\u0098\u0001\u0013\u0001\u0013"+
		"\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001"+
		"\u0000\u000e\u0001\u000009\u0002\u0000AAaa\u0002\u0000NNnn\u0002\u0000"+
		"DDdd\u0002\u0000OOoo\u0002\u0000RRrr\u0002\u0000TTtt\u0002\u0000CCcc\u0002"+
		"\u0000IIii\u0002\u0000SSss\u0006\u0000**..09?Z__az\u0002\u0000::__\u0002"+
		"\u0000AZaz\u0003\u0000\t\n\r\r  \u00a7\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0001)\u0001\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005"+
		"T\u0001\u0000\u0000\u0000\u0007V\u0001\u0000\u0000\u0000\tX\u0001\u0000"+
		"\u0000\u0000\u000b[\u0001\u0000\u0000\u0000\r]\u0001\u0000\u0000\u0000"+
		"\u000f_\u0001\u0000\u0000\u0000\u0011b\u0001\u0000\u0000\u0000\u0013e"+
		"\u0001\u0000\u0000\u0000\u0015i\u0001\u0000\u0000\u0000\u0017l\u0001\u0000"+
		"\u0000\u0000\u0019p\u0001\u0000\u0000\u0000\u001bs\u0001\u0000\u0000\u0000"+
		"\u001d}\u0001\u0000\u0000\u0000\u001f\u008d\u0001\u0000\u0000\u0000!\u008f"+
		"\u0001\u0000\u0000\u0000#\u0091\u0001\u0000\u0000\u0000%\u0093\u0001\u0000"+
		"\u0000\u0000\'\u0096\u0001\u0000\u0000\u0000)*\u0007\u0000\u0000\u0000"+
		"*\u0002\u0001\u0000\u0000\u0000+/\u0003\u0001\u0000\u0000,.\u0003\u0001"+
		"\u0000\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000\u0004\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000024\u0005\"\u0000\u000032\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u000068\u0001\u0000\u0000\u000079\u0003\u001d\u000e\u000087\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0005\"\u0000\u0000"+
		"=U\u0001\u0000\u0000\u0000>@\u0005\"\u0000\u0000?>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BD\u0001\u0000\u0000\u0000CE\u0003\u001d\u000e\u0000DC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HJ\u0003\'\u0013\u0000IH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MO\u0003\u001d\u000e"+
		"\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005"+
		"\"\u0000\u0000SU\u0001\u0000\u0000\u0000T3\u0001\u0000\u0000\u0000T?\u0001"+
		"\u0000\u0000\u0000U\u0006\u0001\u0000\u0000\u0000VW\u0005=\u0000\u0000"+
		"W\b\u0001\u0000\u0000\u0000XY\u0005!\u0000\u0000YZ\u0005=\u0000\u0000"+
		"Z\n\u0001\u0000\u0000\u0000[\\\u0005>\u0000\u0000\\\f\u0001\u0000\u0000"+
		"\u0000]^\u0005<\u0000\u0000^\u000e\u0001\u0000\u0000\u0000_`\u0005>\u0000"+
		"\u0000`a\u0005=\u0000\u0000a\u0010\u0001\u0000\u0000\u0000bc\u0005<\u0000"+
		"\u0000cd\u0005=\u0000\u0000d\u0012\u0001\u0000\u0000\u0000ef\u0007\u0001"+
		"\u0000\u0000fg\u0007\u0002\u0000\u0000gh\u0007\u0003\u0000\u0000h\u0014"+
		"\u0001\u0000\u0000\u0000ij\u0007\u0004\u0000\u0000jk\u0007\u0005\u0000"+
		"\u0000k\u0016\u0001\u0000\u0000\u0000lm\u0007\u0002\u0000\u0000mn\u0007"+
		"\u0004\u0000\u0000no\u0007\u0006\u0000\u0000o\u0018\u0001\u0000\u0000"+
		"\u0000pq\u0007\u0006\u0000\u0000qr\u0007\u0004\u0000\u0000r\u001a\u0001"+
		"\u0000\u0000\u0000st\u0007\u0007\u0000\u0000tu\u0007\u0004\u0000\u0000"+
		"uv\u0007\u0002\u0000\u0000vw\u0007\u0006\u0000\u0000wx\u0007\u0001\u0000"+
		"\u0000xy\u0007\b\u0000\u0000yz\u0007\u0002\u0000\u0000z{\u0007\t\u0000"+
		"\u0000{\u001c\u0001\u0000\u0000\u0000|~\u0007\n\u0000\u0000}|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u008a\u0001\u0000\u0000\u0000"+
		"\u0081\u0085\u0007\u000b\u0000\u0000\u0082\u0084\u0007\f\u0000\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088"+
		"\u0081\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u001e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0005(\u0000\u0000\u008e \u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		")\u0000\u0000\u0090\"\u0001\u0000\u0000\u0000\u0091\u0092\u0005[\u0000"+
		"\u0000\u0092$\u0001\u0000\u0000\u0000\u0093\u0094\u0005]\u0000\u0000\u0094"+
		"&\u0001\u0000\u0000\u0000\u0095\u0097\u0007\r\u0000\u0000\u0096\u0095"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0006\u0013\u0000\u0000\u009b(\u0001"+
		"\u0000\u0000\u0000\r\u0000/5:AFKPT\u007f\u0085\u008a\u0098\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}