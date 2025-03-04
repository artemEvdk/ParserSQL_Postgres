// Generated from D:/�����/2 ����/������/ParserSQL_Postgres/src/main/java/org/example/Parser/PostgreSQL.g4 by ANTLR 4.13.2
package org.example.Parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PostgreSQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SELECT=2, FROM=3, WHERE=4, GROUP=5, BY=6, HAVING=7, ORDER=8, ASC=9, 
		DESC=10, LIMIT=11, OFFSET=12, DISTINCT=13, COUNT=14, MAX=15, MIN=16, AVG=17, 
		SUM=18, AS=19, NULL=20, TRUE=21, FALSE=22, OR=23, AND=24, JOIN=25, INNER=26, 
		LEFT=27, RIGHT=28, FULL=29, OUTER=30, CROSS=31, NATURAL=32, ON=33, USING=34, 
		GT=35, LT=36, GTE=37, LTE=38, NE=39, EQ=40, PLUS=41, MINUS=42, ASTERISK=43, 
		SLASH=44, POWER=45, LPAREN=46, RPAREN=47, COMMA=48, SEMI=49, STRING=50, 
		INTEGER=51, FLOAT=52, ID=53, QUOTED_ID=54, WS=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "SELECT", "FROM", "WHERE", "GROUP", "BY", "HAVING", "ORDER", 
			"ASC", "DESC", "LIMIT", "OFFSET", "DISTINCT", "COUNT", "MAX", "MIN", 
			"AVG", "SUM", "AS", "NULL", "TRUE", "FALSE", "OR", "AND", "JOIN", "INNER", 
			"LEFT", "RIGHT", "FULL", "OUTER", "CROSS", "NATURAL", "ON", "USING", 
			"GT", "LT", "GTE", "LTE", "NE", "EQ", "PLUS", "MINUS", "ASTERISK", "SLASH", 
			"POWER", "LPAREN", "RPAREN", "COMMA", "SEMI", "STRING", "INTEGER", "FLOAT", 
			"ID", "QUOTED_ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'SELECT'", "'FROM'", "'WHERE'", "'GROUP'", "'BY'", "'HAVING'", 
			"'ORDER'", "'ASC'", "'DESC'", "'LIMIT'", "'OFFSET'", "'DISTINCT'", "'COUNT'", 
			"'MAX'", "'MIN'", "'AVG'", "'SUM'", "'AS'", "'NULL'", "'TRUE'", "'FALSE'", 
			"'OR'", "'AND'", "'JOIN'", "'INNER'", "'LEFT'", "'RIGHT'", "'FULL'", 
			"'OUTER'", "'CROSS'", "'NATURAL'", "'ON'", "'USING'", "'>'", "'<'", "'>='", 
			"'<='", "'<>'", "'='", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", 
			"','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SELECT", "FROM", "WHERE", "GROUP", "BY", "HAVING", "ORDER", 
			"ASC", "DESC", "LIMIT", "OFFSET", "DISTINCT", "COUNT", "MAX", "MIN", 
			"AVG", "SUM", "AS", "NULL", "TRUE", "FALSE", "OR", "AND", "JOIN", "INNER", 
			"LEFT", "RIGHT", "FULL", "OUTER", "CROSS", "NATURAL", "ON", "USING", 
			"GT", "LT", "GTE", "LTE", "NE", "EQ", "PLUS", "MINUS", "ASTERISK", "SLASH", 
			"POWER", "LPAREN", "RPAREN", "COMMA", "SEMI", "STRING", "INTEGER", "FLOAT", 
			"ID", "QUOTED_ID", "WS"
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


	public PostgreSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PostgreSQL.g4"; }

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
		"\u0004\u00007\u0176\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001,\u0001"+
		",\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00011\u0001"+
		"1\u00011\u00011\u00051\u0146\b1\n1\f1\u0149\t1\u00011\u00011\u00012\u0004"+
		"2\u014e\b2\u000b2\f2\u014f\u00013\u00043\u0153\b3\u000b3\f3\u0154\u0001"+
		"3\u00013\u00053\u0159\b3\n3\f3\u015c\t3\u00014\u00014\u00054\u0160\b4"+
		"\n4\f4\u0163\t4\u00015\u00015\u00015\u00015\u00055\u0169\b5\n5\f5\u016c"+
		"\t5\u00015\u00015\u00016\u00046\u0171\b6\u000b6\f6\u0172\u00016\u0001"+
		"6\u0000\u00007\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7\u0001\u0000\u0006\u0001"+
		"\u0000\'\'\u0001\u000009\u0002\u0000__az\u0003\u000009__az\u0001\u0000"+
		"\"\"\u0003\u0000\t\n\r\r  \u017e\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I"+
		"\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000"+
		"\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000"+
		"\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W"+
		"\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000"+
		"\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000"+
		"\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e"+
		"\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000"+
		"\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000"+
		"\u0001o\u0001\u0000\u0000\u0000\u0003q\u0001\u0000\u0000\u0000\u0005x"+
		"\u0001\u0000\u0000\u0000\u0007}\u0001\u0000\u0000\u0000\t\u0083\u0001"+
		"\u0000\u0000\u0000\u000b\u0089\u0001\u0000\u0000\u0000\r\u008c\u0001\u0000"+
		"\u0000\u0000\u000f\u0093\u0001\u0000\u0000\u0000\u0011\u0099\u0001\u0000"+
		"\u0000\u0000\u0013\u009d\u0001\u0000\u0000\u0000\u0015\u00a2\u0001\u0000"+
		"\u0000\u0000\u0017\u00a8\u0001\u0000\u0000\u0000\u0019\u00af\u0001\u0000"+
		"\u0000\u0000\u001b\u00b8\u0001\u0000\u0000\u0000\u001d\u00be\u0001\u0000"+
		"\u0000\u0000\u001f\u00c2\u0001\u0000\u0000\u0000!\u00c6\u0001\u0000\u0000"+
		"\u0000#\u00ca\u0001\u0000\u0000\u0000%\u00ce\u0001\u0000\u0000\u0000\'"+
		"\u00d1\u0001\u0000\u0000\u0000)\u00d6\u0001\u0000\u0000\u0000+\u00db\u0001"+
		"\u0000\u0000\u0000-\u00e1\u0001\u0000\u0000\u0000/\u00e4\u0001\u0000\u0000"+
		"\u00001\u00e8\u0001\u0000\u0000\u00003\u00ed\u0001\u0000\u0000\u00005"+
		"\u00f3\u0001\u0000\u0000\u00007\u00f8\u0001\u0000\u0000\u00009\u00fe\u0001"+
		"\u0000\u0000\u0000;\u0103\u0001\u0000\u0000\u0000=\u0109\u0001\u0000\u0000"+
		"\u0000?\u010f\u0001\u0000\u0000\u0000A\u0117\u0001\u0000\u0000\u0000C"+
		"\u011a\u0001\u0000\u0000\u0000E\u0120\u0001\u0000\u0000\u0000G\u0122\u0001"+
		"\u0000\u0000\u0000I\u0124\u0001\u0000\u0000\u0000K\u0127\u0001\u0000\u0000"+
		"\u0000M\u012a\u0001\u0000\u0000\u0000O\u012d\u0001\u0000\u0000\u0000Q"+
		"\u012f\u0001\u0000\u0000\u0000S\u0131\u0001\u0000\u0000\u0000U\u0133\u0001"+
		"\u0000\u0000\u0000W\u0135\u0001\u0000\u0000\u0000Y\u0137\u0001\u0000\u0000"+
		"\u0000[\u0139\u0001\u0000\u0000\u0000]\u013b\u0001\u0000\u0000\u0000_"+
		"\u013d\u0001\u0000\u0000\u0000a\u013f\u0001\u0000\u0000\u0000c\u0141\u0001"+
		"\u0000\u0000\u0000e\u014d\u0001\u0000\u0000\u0000g\u0152\u0001\u0000\u0000"+
		"\u0000i\u015d\u0001\u0000\u0000\u0000k\u0164\u0001\u0000\u0000\u0000m"+
		"\u0170\u0001\u0000\u0000\u0000op\u0005.\u0000\u0000p\u0002\u0001\u0000"+
		"\u0000\u0000qr\u0005S\u0000\u0000rs\u0005E\u0000\u0000st\u0005L\u0000"+
		"\u0000tu\u0005E\u0000\u0000uv\u0005C\u0000\u0000vw\u0005T\u0000\u0000"+
		"w\u0004\u0001\u0000\u0000\u0000xy\u0005F\u0000\u0000yz\u0005R\u0000\u0000"+
		"z{\u0005O\u0000\u0000{|\u0005M\u0000\u0000|\u0006\u0001\u0000\u0000\u0000"+
		"}~\u0005W\u0000\u0000~\u007f\u0005H\u0000\u0000\u007f\u0080\u0005E\u0000"+
		"\u0000\u0080\u0081\u0005R\u0000\u0000\u0081\u0082\u0005E\u0000\u0000\u0082"+
		"\b\u0001\u0000\u0000\u0000\u0083\u0084\u0005G\u0000\u0000\u0084\u0085"+
		"\u0005R\u0000\u0000\u0085\u0086\u0005O\u0000\u0000\u0086\u0087\u0005U"+
		"\u0000\u0000\u0087\u0088\u0005P\u0000\u0000\u0088\n\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0005B\u0000\u0000\u008a\u008b\u0005Y\u0000\u0000\u008b"+
		"\f\u0001\u0000\u0000\u0000\u008c\u008d\u0005H\u0000\u0000\u008d\u008e"+
		"\u0005A\u0000\u0000\u008e\u008f\u0005V\u0000\u0000\u008f\u0090\u0005I"+
		"\u0000\u0000\u0090\u0091\u0005N\u0000\u0000\u0091\u0092\u0005G\u0000\u0000"+
		"\u0092\u000e\u0001\u0000\u0000\u0000\u0093\u0094\u0005O\u0000\u0000\u0094"+
		"\u0095\u0005R\u0000\u0000\u0095\u0096\u0005D\u0000\u0000\u0096\u0097\u0005"+
		"E\u0000\u0000\u0097\u0098\u0005R\u0000\u0000\u0098\u0010\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005A\u0000\u0000\u009a\u009b\u0005S\u0000\u0000\u009b"+
		"\u009c\u0005C\u0000\u0000\u009c\u0012\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005D\u0000\u0000\u009e\u009f\u0005E\u0000\u0000\u009f\u00a0\u0005S"+
		"\u0000\u0000\u00a0\u00a1\u0005C\u0000\u0000\u00a1\u0014\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005L\u0000\u0000\u00a3\u00a4\u0005I\u0000\u0000\u00a4"+
		"\u00a5\u0005M\u0000\u0000\u00a5\u00a6\u0005I\u0000\u0000\u00a6\u00a7\u0005"+
		"T\u0000\u0000\u00a7\u0016\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005O\u0000"+
		"\u0000\u00a9\u00aa\u0005F\u0000\u0000\u00aa\u00ab\u0005F\u0000\u0000\u00ab"+
		"\u00ac\u0005S\u0000\u0000\u00ac\u00ad\u0005E\u0000\u0000\u00ad\u00ae\u0005"+
		"T\u0000\u0000\u00ae\u0018\u0001\u0000\u0000\u0000\u00af\u00b0\u0005D\u0000"+
		"\u0000\u00b0\u00b1\u0005I\u0000\u0000\u00b1\u00b2\u0005S\u0000\u0000\u00b2"+
		"\u00b3\u0005T\u0000\u0000\u00b3\u00b4\u0005I\u0000\u0000\u00b4\u00b5\u0005"+
		"N\u0000\u0000\u00b5\u00b6\u0005C\u0000\u0000\u00b6\u00b7\u0005T\u0000"+
		"\u0000\u00b7\u001a\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005C\u0000\u0000"+
		"\u00b9\u00ba\u0005O\u0000\u0000\u00ba\u00bb\u0005U\u0000\u0000\u00bb\u00bc"+
		"\u0005N\u0000\u0000\u00bc\u00bd\u0005T\u0000\u0000\u00bd\u001c\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005M\u0000\u0000\u00bf\u00c0\u0005A\u0000\u0000"+
		"\u00c0\u00c1\u0005X\u0000\u0000\u00c1\u001e\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005M\u0000\u0000\u00c3\u00c4\u0005I\u0000\u0000\u00c4\u00c5\u0005"+
		"N\u0000\u0000\u00c5 \u0001\u0000\u0000\u0000\u00c6\u00c7\u0005A\u0000"+
		"\u0000\u00c7\u00c8\u0005V\u0000\u0000\u00c8\u00c9\u0005G\u0000\u0000\u00c9"+
		"\"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005S\u0000\u0000\u00cb\u00cc"+
		"\u0005U\u0000\u0000\u00cc\u00cd\u0005M\u0000\u0000\u00cd$\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0005A\u0000\u0000\u00cf\u00d0\u0005S\u0000\u0000"+
		"\u00d0&\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005N\u0000\u0000\u00d2\u00d3"+
		"\u0005U\u0000\u0000\u00d3\u00d4\u0005L\u0000\u0000\u00d4\u00d5\u0005L"+
		"\u0000\u0000\u00d5(\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005T\u0000\u0000"+
		"\u00d7\u00d8\u0005R\u0000\u0000\u00d8\u00d9\u0005U\u0000\u0000\u00d9\u00da"+
		"\u0005E\u0000\u0000\u00da*\u0001\u0000\u0000\u0000\u00db\u00dc\u0005F"+
		"\u0000\u0000\u00dc\u00dd\u0005A\u0000\u0000\u00dd\u00de\u0005L\u0000\u0000"+
		"\u00de\u00df\u0005S\u0000\u0000\u00df\u00e0\u0005E\u0000\u0000\u00e0,"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005O\u0000\u0000\u00e2\u00e3\u0005"+
		"R\u0000\u0000\u00e3.\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005A\u0000"+
		"\u0000\u00e5\u00e6\u0005N\u0000\u0000\u00e6\u00e7\u0005D\u0000\u0000\u00e7"+
		"0\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005J\u0000\u0000\u00e9\u00ea\u0005"+
		"O\u0000\u0000\u00ea\u00eb\u0005I\u0000\u0000\u00eb\u00ec\u0005N\u0000"+
		"\u0000\u00ec2\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005I\u0000\u0000\u00ee"+
		"\u00ef\u0005N\u0000\u0000\u00ef\u00f0\u0005N\u0000\u0000\u00f0\u00f1\u0005"+
		"E\u0000\u0000\u00f1\u00f2\u0005R\u0000\u0000\u00f24\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0005L\u0000\u0000\u00f4\u00f5\u0005E\u0000\u0000\u00f5"+
		"\u00f6\u0005F\u0000\u0000\u00f6\u00f7\u0005T\u0000\u0000\u00f76\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0005R\u0000\u0000\u00f9\u00fa\u0005I\u0000"+
		"\u0000\u00fa\u00fb\u0005G\u0000\u0000\u00fb\u00fc\u0005H\u0000\u0000\u00fc"+
		"\u00fd\u0005T\u0000\u0000\u00fd8\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005"+
		"F\u0000\u0000\u00ff\u0100\u0005U\u0000\u0000\u0100\u0101\u0005L\u0000"+
		"\u0000\u0101\u0102\u0005L\u0000\u0000\u0102:\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0005O\u0000\u0000\u0104\u0105\u0005U\u0000\u0000\u0105\u0106\u0005"+
		"T\u0000\u0000\u0106\u0107\u0005E\u0000\u0000\u0107\u0108\u0005R\u0000"+
		"\u0000\u0108<\u0001\u0000\u0000\u0000\u0109\u010a\u0005C\u0000\u0000\u010a"+
		"\u010b\u0005R\u0000\u0000\u010b\u010c\u0005O\u0000\u0000\u010c\u010d\u0005"+
		"S\u0000\u0000\u010d\u010e\u0005S\u0000\u0000\u010e>\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0005N\u0000\u0000\u0110\u0111\u0005A\u0000\u0000\u0111"+
		"\u0112\u0005T\u0000\u0000\u0112\u0113\u0005U\u0000\u0000\u0113\u0114\u0005"+
		"R\u0000\u0000\u0114\u0115\u0005A\u0000\u0000\u0115\u0116\u0005L\u0000"+
		"\u0000\u0116@\u0001\u0000\u0000\u0000\u0117\u0118\u0005O\u0000\u0000\u0118"+
		"\u0119\u0005N\u0000\u0000\u0119B\u0001\u0000\u0000\u0000\u011a\u011b\u0005"+
		"U\u0000\u0000\u011b\u011c\u0005S\u0000\u0000\u011c\u011d\u0005I\u0000"+
		"\u0000\u011d\u011e\u0005N\u0000\u0000\u011e\u011f\u0005G\u0000\u0000\u011f"+
		"D\u0001\u0000\u0000\u0000\u0120\u0121\u0005>\u0000\u0000\u0121F\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0005<\u0000\u0000\u0123H\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0005>\u0000\u0000\u0125\u0126\u0005=\u0000\u0000\u0126"+
		"J\u0001\u0000\u0000\u0000\u0127\u0128\u0005<\u0000\u0000\u0128\u0129\u0005"+
		"=\u0000\u0000\u0129L\u0001\u0000\u0000\u0000\u012a\u012b\u0005<\u0000"+
		"\u0000\u012b\u012c\u0005>\u0000\u0000\u012cN\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0005=\u0000\u0000\u012eP\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		"+\u0000\u0000\u0130R\u0001\u0000\u0000\u0000\u0131\u0132\u0005-\u0000"+
		"\u0000\u0132T\u0001\u0000\u0000\u0000\u0133\u0134\u0005*\u0000\u0000\u0134"+
		"V\u0001\u0000\u0000\u0000\u0135\u0136\u0005/\u0000\u0000\u0136X\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0005^\u0000\u0000\u0138Z\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0005(\u0000\u0000\u013a\\\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0005)\u0000\u0000\u013c^\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0005,\u0000\u0000\u013e`\u0001\u0000\u0000\u0000\u013f\u0140\u0005;"+
		"\u0000\u0000\u0140b\u0001\u0000\u0000\u0000\u0141\u0147\u0005\'\u0000"+
		"\u0000\u0142\u0146\b\u0000\u0000\u0000\u0143\u0144\u0005\'\u0000\u0000"+
		"\u0144\u0146\u0005\'\u0000\u0000\u0145\u0142\u0001\u0000\u0000\u0000\u0145"+
		"\u0143\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000\u0000\u0147"+
		"\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148"+
		"\u014a\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0005\'\u0000\u0000\u014bd\u0001\u0000\u0000\u0000\u014c\u014e"+
		"\u0007\u0001\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0001\u0000\u0000\u0000\u0150f\u0001\u0000\u0000\u0000\u0151\u0153\u0007"+
		"\u0001\u0000\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001"+
		"\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u015a\u0005"+
		".\u0000\u0000\u0157\u0159\u0007\u0001\u0000\u0000\u0158\u0157\u0001\u0000"+
		"\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015bh\u0001\u0000\u0000"+
		"\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u0161\u0007\u0002\u0000"+
		"\u0000\u015e\u0160\u0007\u0003\u0000\u0000\u015f\u015e\u0001\u0000\u0000"+
		"\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162j\u0001\u0000\u0000\u0000"+
		"\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u016a\u0005\"\u0000\u0000\u0165"+
		"\u0169\b\u0004\u0000\u0000\u0166\u0167\u0005\"\u0000\u0000\u0167\u0169"+
		"\u0005\"\u0000\u0000\u0168\u0165\u0001\u0000\u0000\u0000\u0168\u0166\u0001"+
		"\u0000\u0000\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001"+
		"\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u016e\u0005"+
		"\"\u0000\u0000\u016el\u0001\u0000\u0000\u0000\u016f\u0171\u0007\u0005"+
		"\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000"+
		"\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175\u00066\u0000"+
		"\u0000\u0175n\u0001\u0000\u0000\u0000\n\u0000\u0145\u0147\u014f\u0154"+
		"\u015a\u0161\u0168\u016a\u0172\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}