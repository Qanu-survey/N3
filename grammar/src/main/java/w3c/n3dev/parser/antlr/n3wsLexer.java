// Generated from n3ws.g4 by ANTLR 4.7.2

    package w3c.n3dev.parser.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class n3wsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, COMMENT=28, BooleanLiteral=29, DefBoolLiteral=30, 
		AtBoolLiteral=31, String=32, IRIREF=33, PNAME_NS=34, PNAME_LN=35, BLANK_NODE_LABEL=36, 
		LANGTAG=37, INTEGER=38, DECIMAL=39, DOUBLE=40, EXPONENT=41, STRING_LITERAL_LONG_SINGLE_QUOTE=42, 
		STRING_LITERAL_LONG_QUOTE=43, STRING_LITERAL_QUOTE=44, STRING_LITERAL_SINGLE_QUOTE=45, 
		UCHAR=46, ECHAR=47, WS=48, ANON=49, QuickVarName=50, PN_CHARS_U=51, PN_CHARS_BASE=52, 
		PN_CHARS=53, BASE=54, PREFIX=55, PN_PREFIX=56, PN_LOCAL=57, PLX=58, PERCENT=59, 
		HEX=60, PN_LOCAL_ESC=61;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "COMMENT", "BooleanLiteral", "DefBoolLiteral", "AtBoolLiteral", 
			"String", "IRIREF", "PNAME_NS", "PNAME_LN", "BLANK_NODE_LABEL", "LANGTAG", 
			"INTEGER", "DECIMAL", "DOUBLE", "EXPONENT", "STRING_LITERAL_LONG_SINGLE_QUOTE", 
			"STRING_LITERAL_LONG_QUOTE", "STRING_LITERAL_QUOTE", "STRING_LITERAL_SINGLE_QUOTE", 
			"UCHAR", "ECHAR", "WS", "ANON", "QuickVarName", "PN_CHARS_U", "PN_CHARS_BASE", 
			"PN_CHARS", "BASE", "PREFIX", "PN_PREFIX", "PN_LOCAL", "PLX", "PERCENT", 
			"HEX", "PN_LOCAL_ESC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'@prefix'", "'@base'", "';'", "','", "'a'", "'@a'", "'has'", 
			"'@has'", "'is'", "'of'", "'@is'", "'@of'", "'='", "'<='", "'=>'", "'^'", 
			"'!'", "'['", "']'", "'('", "')'", "'{'", "'}'", "'^^'", "'@forSome'", 
			"'@forAll'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "COMMENT", "BooleanLiteral", "DefBoolLiteral", 
			"AtBoolLiteral", "String", "IRIREF", "PNAME_NS", "PNAME_LN", "BLANK_NODE_LABEL", 
			"LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "EXPONENT", "STRING_LITERAL_LONG_SINGLE_QUOTE", 
			"STRING_LITERAL_LONG_QUOTE", "STRING_LITERAL_QUOTE", "STRING_LITERAL_SINGLE_QUOTE", 
			"UCHAR", "ECHAR", "WS", "ANON", "QuickVarName", "PN_CHARS_U", "PN_CHARS_BASE", 
			"PN_CHARS", "BASE", "PREFIX", "PN_PREFIX", "PN_LOCAL", "PLX", "PERCENT", 
			"HEX", "PN_LOCAL_ESC"
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


	public n3wsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "n3ws.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u022c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\7\35\u00dc\n\35\f\35\16\35\u00df\13\35\3\35\3\35\3\36"+
		"\3\36\5\36\u00e5\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u00f0\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00fd\n \3!\3!\3!\3!\5"+
		"!\u0103\n!\3\"\3\"\3\"\3\"\7\"\u0109\n\"\f\"\16\"\u010c\13\"\3\"\3\"\3"+
		"#\5#\u0111\n#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\5%\u011d\n%\3%\3%\7%\u0121"+
		"\n%\f%\16%\u0124\13%\3%\5%\u0127\n%\3&\3&\6&\u012b\n&\r&\16&\u012c\3&"+
		"\3&\6&\u0131\n&\r&\16&\u0132\7&\u0135\n&\f&\16&\u0138\13&\3\'\5\'\u013b"+
		"\n\'\3\'\6\'\u013e\n\'\r\'\16\'\u013f\3(\5(\u0143\n(\3(\7(\u0146\n(\f"+
		"(\16(\u0149\13(\3(\3(\6(\u014d\n(\r(\16(\u014e\3)\5)\u0152\n)\3)\6)\u0155"+
		"\n)\r)\16)\u0156\3)\3)\7)\u015b\n)\f)\16)\u015e\13)\3)\3)\3)\6)\u0163"+
		"\n)\r)\16)\u0164\3)\3)\6)\u0169\n)\r)\16)\u016a\3)\5)\u016e\n)\3*\3*\5"+
		"*\u0172\n*\3*\6*\u0175\n*\r*\16*\u0176\3+\3+\3+\3+\3+\3+\3+\5+\u0180\n"+
		"+\3+\3+\3+\5+\u0185\n+\7+\u0187\n+\f+\16+\u018a\13+\3+\3+\3+\3+\3,\3,"+
		"\3,\3,\3,\3,\3,\5,\u0197\n,\3,\3,\3,\5,\u019c\n,\7,\u019e\n,\f,\16,\u01a1"+
		"\13,\3,\3,\3,\3,\3-\3-\3-\3-\7-\u01ab\n-\f-\16-\u01ae\13-\3-\3-\3.\3."+
		"\3.\3.\7.\u01b6\n.\f.\16.\u01b9\13.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u01d1\n/\3\60\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\7\62\u01da\n\62\f\62\16\62\u01dd\13\62\3\62\3\62\3\63\3\63\3"+
		"\63\7\63\u01e4\n\63\f\63\16\63\u01e7\13\63\3\64\3\64\5\64\u01eb\n\64\3"+
		"\65\5\65\u01ee\n\65\3\66\3\66\5\66\u01f2\n\66\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\38\38\39\39\39\79\u0203\n9\f9\169\u0206\139\39\59\u0209"+
		"\n9\3:\3:\3:\5:\u020e\n:\3:\3:\3:\7:\u0213\n:\f:\16:\u0216\13:\3:\3:\3"+
		":\5:\u021b\n:\5:\u021d\n:\3;\3;\5;\u0221\n;\3<\3<\3<\3<\3=\5=\u0228\n"+
		"=\3>\3>\3>\2\2?\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?\3\2\34\4\2\f\f\16\17\n\2\2\"$$>>@@^^``bb"+
		"}\177\3\2\62;\4\2C\\c|\5\2\62;C\\c|\4\2--//\4\2GGgg\4\2))^^\4\2$$^^\6"+
		"\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\n\2$$))^^ddhhppttvv\5\2\13\f\17\17"+
		"\"\"\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001"+
		"\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff"+
		"\7\2//\62;\u00b9\u00b9\u0302\u0371\u2041\u2042\4\2DDdd\4\2CCcc\4\2UUu"+
		"u\4\2RRrr\4\2TTtt\4\2HHhh\4\2KKkk\4\2ZZzz\4\2\60\60<<\5\2\62;CHch\t\2"+
		"##%\61==??ABaa\u0080\u0080\2\u026c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\177\3\2\2\2\7"+
		"\u0087\3\2\2\2\t\u008d\3\2\2\2\13\u008f\3\2\2\2\r\u0091\3\2\2\2\17\u0093"+
		"\3\2\2\2\21\u0096\3\2\2\2\23\u009a\3\2\2\2\25\u009f\3\2\2\2\27\u00a2\3"+
		"\2\2\2\31\u00a5\3\2\2\2\33\u00a9\3\2\2\2\35\u00ad\3\2\2\2\37\u00af\3\2"+
		"\2\2!\u00b2\3\2\2\2#\u00b5\3\2\2\2%\u00b7\3\2\2\2\'\u00b9\3\2\2\2)\u00bb"+
		"\3\2\2\2+\u00bd\3\2\2\2-\u00bf\3\2\2\2/\u00c1\3\2\2\2\61\u00c3\3\2\2\2"+
		"\63\u00c5\3\2\2\2\65\u00c8\3\2\2\2\67\u00d1\3\2\2\29\u00d9\3\2\2\2;\u00e4"+
		"\3\2\2\2=\u00ef\3\2\2\2?\u00fc\3\2\2\2A\u0102\3\2\2\2C\u0104\3\2\2\2E"+
		"\u0110\3\2\2\2G\u0114\3\2\2\2I\u0117\3\2\2\2K\u0128\3\2\2\2M\u013a\3\2"+
		"\2\2O\u0142\3\2\2\2Q\u0151\3\2\2\2S\u016f\3\2\2\2U\u0178\3\2\2\2W\u018f"+
		"\3\2\2\2Y\u01a6\3\2\2\2[\u01b1\3\2\2\2]\u01d0\3\2\2\2_\u01d2\3\2\2\2a"+
		"\u01d5\3\2\2\2c\u01d7\3\2\2\2e\u01e0\3\2\2\2g\u01ea\3\2\2\2i\u01ed\3\2"+
		"\2\2k\u01f1\3\2\2\2m\u01f3\3\2\2\2o\u01f8\3\2\2\2q\u01ff\3\2\2\2s\u020d"+
		"\3\2\2\2u\u0220\3\2\2\2w\u0222\3\2\2\2y\u0227\3\2\2\2{\u0229\3\2\2\2}"+
		"~\7\60\2\2~\4\3\2\2\2\177\u0080\7B\2\2\u0080\u0081\7r\2\2\u0081\u0082"+
		"\7t\2\2\u0082\u0083\7g\2\2\u0083\u0084\7h\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7z\2\2\u0086\6\3\2\2\2\u0087\u0088\7B\2\2\u0088\u0089\7d\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c\b\3\2\2\2\u008d"+
		"\u008e\7=\2\2\u008e\n\3\2\2\2\u008f\u0090\7.\2\2\u0090\f\3\2\2\2\u0091"+
		"\u0092\7c\2\2\u0092\16\3\2\2\2\u0093\u0094\7B\2\2\u0094\u0095\7c\2\2\u0095"+
		"\20\3\2\2\2\u0096\u0097\7j\2\2\u0097\u0098\7c\2\2\u0098\u0099\7u\2\2\u0099"+
		"\22\3\2\2\2\u009a\u009b\7B\2\2\u009b\u009c\7j\2\2\u009c\u009d\7c\2\2\u009d"+
		"\u009e\7u\2\2\u009e\24\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7u\2\2\u00a1"+
		"\26\3\2\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7h\2\2\u00a4\30\3\2\2\2\u00a5"+
		"\u00a6\7B\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7u\2\2\u00a8\32\3\2\2\2\u00a9"+
		"\u00aa\7B\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7h\2\2\u00ac\34\3\2\2\2\u00ad"+
		"\u00ae\7?\2\2\u00ae\36\3\2\2\2\u00af\u00b0\7>\2\2\u00b0\u00b1\7?\2\2\u00b1"+
		" \3\2\2\2\u00b2\u00b3\7?\2\2\u00b3\u00b4\7@\2\2\u00b4\"\3\2\2\2\u00b5"+
		"\u00b6\7`\2\2\u00b6$\3\2\2\2\u00b7\u00b8\7#\2\2\u00b8&\3\2\2\2\u00b9\u00ba"+
		"\7]\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7_\2\2\u00bc*\3\2\2\2\u00bd\u00be\7"+
		"*\2\2\u00be,\3\2\2\2\u00bf\u00c0\7+\2\2\u00c0.\3\2\2\2\u00c1\u00c2\7}"+
		"\2\2\u00c2\60\3\2\2\2\u00c3\u00c4\7\177\2\2\u00c4\62\3\2\2\2\u00c5\u00c6"+
		"\7`\2\2\u00c6\u00c7\7`\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\7B\2\2\u00c9\u00ca"+
		"\7h\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7U\2\2\u00cd"+
		"\u00ce\7q\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0\7g\2\2\u00d0\66\3\2\2\2\u00d1"+
		"\u00d2\7B\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7t\2\2"+
		"\u00d5\u00d6\7C\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7n\2\2\u00d88\3\2\2"+
		"\2\u00d9\u00dd\7%\2\2\u00da\u00dc\n\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00df"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e1\b\35\2\2\u00e1:\3\2\2\2\u00e2\u00e5\5=\37\2"+
		"\u00e3\u00e5\5? \2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5<\3\2"+
		"\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7w\2\2\u00e9\u00f0"+
		"\7g\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7n\2\2\u00ed"+
		"\u00ee\7u\2\2\u00ee\u00f0\7g\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00ea\3\2\2"+
		"\2\u00f0>\3\2\2\2\u00f1\u00f2\7B\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7"+
		"t\2\2\u00f4\u00f5\7w\2\2\u00f5\u00fd\7g\2\2\u00f6\u00f7\7B\2\2\u00f7\u00f8"+
		"\7h\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7u\2\2\u00fb"+
		"\u00fd\7g\2\2\u00fc\u00f1\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fd@\3\2\2\2\u00fe"+
		"\u0103\5Y-\2\u00ff\u0103\5[.\2\u0100\u0103\5U+\2\u0101\u0103\5W,\2\u0102"+
		"\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2"+
		"\2\2\u0103B\3\2\2\2\u0104\u010a\7>\2\2\u0105\u0109\n\3\2\2\u0106\u0109"+
		"\5]/\2\u0107\u0109\5a\61\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7@\2\2\u010e"+
		"D\3\2\2\2\u010f\u0111\5q9\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\7<\2\2\u0113F\3\2\2\2\u0114\u0115\5E#\2\u0115"+
		"\u0116\5s:\2\u0116H\3\2\2\2\u0117\u0118\7a\2\2\u0118\u0119\7<\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u011d\5g\64\2\u011b\u011d\t\4\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011b\3\2\2\2\u011d\u0126\3\2\2\2\u011e\u0121\5k\66\2\u011f"+
		"\u0121\7\60\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3"+
		"\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0127\5k\66\2\u0126\u0122\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127J\3\2\2\2\u0128\u012a\7B\2\2\u0129\u012b\t\5\2\2\u012a\u0129"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u0136\3\2\2\2\u012e\u0130\7/\2\2\u012f\u0131\t\6\2\2\u0130\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0135\3\2\2\2\u0134\u012e\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137L\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b"+
		"\t\7\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c"+
		"\u013e\t\4\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140N\3\2\2\2\u0141\u0143\t\7\2\2\u0142\u0141"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0147\3\2\2\2\u0144\u0146\t\4\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014c\7\60\2\2\u014b"+
		"\u014d\t\4\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014fP\3\2\2\2\u0150\u0152\t\7\2\2\u0151\u0150"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u016d\3\2\2\2\u0153\u0155\t\4\2\2\u0154"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u015c\7\60\2\2\u0159\u015b\t\4\2\2\u015a"+
		"\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u016e\5S*\2\u0160\u0162"+
		"\7\60\2\2\u0161\u0163\t\4\2\2\u0162\u0161\3\2\2\2\u0163\u0164\3\2\2\2"+
		"\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016e"+
		"\5S*\2\u0167\u0169\t\4\2\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\5S"+
		"*\2\u016d\u0154\3\2\2\2\u016d\u0160\3\2\2\2\u016d\u0168\3\2\2\2\u016e"+
		"R\3\2\2\2\u016f\u0171\t\b\2\2\u0170\u0172\t\7\2\2\u0171\u0170\3\2\2\2"+
		"\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0175\t\4\2\2\u0174\u0173"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"T\3\2\2\2\u0178\u0179\7)\2\2\u0179\u017a\7)\2\2\u017a\u017b\7)\2\2\u017b"+
		"\u0188\3\2\2\2\u017c\u0180\7)\2\2\u017d\u017e\7)\2\2\u017e\u0180\7)\2"+
		"\2\u017f\u017c\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0184"+
		"\3\2\2\2\u0181\u0185\n\t\2\2\u0182\u0185\5_\60\2\u0183\u0185\5]/\2\u0184"+
		"\u0181\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185\u0187\3\2"+
		"\2\2\u0186\u017f\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7)"+
		"\2\2\u018c\u018d\7)\2\2\u018d\u018e\7)\2\2\u018eV\3\2\2\2\u018f\u0190"+
		"\7$\2\2\u0190\u0191\7$\2\2\u0191\u0192\7$\2\2\u0192\u019f\3\2\2\2\u0193"+
		"\u0197\7$\2\2\u0194\u0195\7$\2\2\u0195\u0197\7$\2\2\u0196\u0193\3\2\2"+
		"\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019b\3\2\2\2\u0198\u019c"+
		"\n\n\2\2\u0199\u019c\5_\60\2\u019a\u019c\5]/\2\u019b\u0198\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u0196\3\2"+
		"\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7$\2\2\u01a3\u01a4\7$\2"+
		"\2\u01a4\u01a5\7$\2\2\u01a5X\3\2\2\2\u01a6\u01ac\7$\2\2\u01a7\u01ab\n"+
		"\13\2\2\u01a8\u01ab\5_\60\2\u01a9\u01ab\5]/\2\u01aa\u01a7\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2"+
		"\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af"+
		"\u01b0\7$\2\2\u01b0Z\3\2\2\2\u01b1\u01b7\7)\2\2\u01b2\u01b6\n\f\2\2\u01b3"+
		"\u01b6\5_\60\2\u01b4\u01b6\5]/\2\u01b5\u01b2\3\2\2\2\u01b5\u01b3\3\2\2"+
		"\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\7)\2\2\u01bb"+
		"\\\3\2\2\2\u01bc\u01bd\7^\2\2\u01bd\u01be\7w\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c0\5y=\2\u01c0\u01c1\5y=\2\u01c1\u01c2\5y=\2\u01c2\u01c3\5y=\2\u01c3"+
		"\u01d1\3\2\2\2\u01c4\u01c5\7^\2\2\u01c5\u01c6\7W\2\2\u01c6\u01c7\3\2\2"+
		"\2\u01c7\u01c8\5y=\2\u01c8\u01c9\5y=\2\u01c9\u01ca\5y=\2\u01ca\u01cb\5"+
		"y=\2\u01cb\u01cc\5y=\2\u01cc\u01cd\5y=\2\u01cd\u01ce\5y=\2\u01ce\u01cf"+
		"\5y=\2\u01cf\u01d1\3\2\2\2\u01d0\u01bc\3\2\2\2\u01d0\u01c4\3\2\2\2\u01d1"+
		"^\3\2\2\2\u01d2\u01d3\7^\2\2\u01d3\u01d4\t\r\2\2\u01d4`\3\2\2\2\u01d5"+
		"\u01d6\t\16\2\2\u01d6b\3\2\2\2\u01d7\u01db\7]\2\2\u01d8\u01da\5a\61\2"+
		"\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\7_\2\2\u01df"+
		"d\3\2\2\2\u01e0\u01e1\7A\2\2\u01e1\u01e5\5g\64\2\u01e2\u01e4\5k\66\2\u01e3"+
		"\u01e2\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6f\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\5i\65\2\u01e9\u01eb"+
		"\7a\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01ebh\3\2\2\2\u01ec\u01ee"+
		"\t\17\2\2\u01ed\u01ec\3\2\2\2\u01eej\3\2\2\2\u01ef\u01f2\5g\64\2\u01f0"+
		"\u01f2\t\20\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2l\3\2\2\2"+
		"\u01f3\u01f4\t\21\2\2\u01f4\u01f5\t\22\2\2\u01f5\u01f6\t\23\2\2\u01f6"+
		"\u01f7\t\b\2\2\u01f7n\3\2\2\2\u01f8\u01f9\t\24\2\2\u01f9\u01fa\t\25\2"+
		"\2\u01fa\u01fb\t\b\2\2\u01fb\u01fc\t\26\2\2\u01fc\u01fd\t\27\2\2\u01fd"+
		"\u01fe\t\30\2\2\u01fep\3\2\2\2\u01ff\u0208\5i\65\2\u0200\u0203\5k\66\2"+
		"\u0201\u0203\7\60\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203\u0206"+
		"\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0207\u0209\5k\66\2\u0208\u0204\3\2\2\2\u0208\u0209\3\2"+
		"\2\2\u0209r\3\2\2\2\u020a\u020e\5g\64\2\u020b\u020e\4\62<\2\u020c\u020e"+
		"\5u;\2\u020d\u020a\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020e"+
		"\u021c\3\2\2\2\u020f\u0213\5k\66\2\u0210\u0213\t\31\2\2\u0211\u0213\5"+
		"u;\2\u0212\u020f\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213"+
		"\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u021a\3\2"+
		"\2\2\u0216\u0214\3\2\2\2\u0217\u021b\5k\66\2\u0218\u021b\7<\2\2\u0219"+
		"\u021b\5u;\2\u021a\u0217\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2"+
		"\2\u021b\u021d\3\2\2\2\u021c\u0214\3\2\2\2\u021c\u021d\3\2\2\2\u021dt"+
		"\3\2\2\2\u021e\u0221\5w<\2\u021f\u0221\5{>\2\u0220\u021e\3\2\2\2\u0220"+
		"\u021f\3\2\2\2\u0221v\3\2\2\2\u0222\u0223\7\'\2\2\u0223\u0224\5y=\2\u0224"+
		"\u0225\5y=\2\u0225x\3\2\2\2\u0226\u0228\t\32\2\2\u0227\u0226\3\2\2\2\u0228"+
		"z\3\2\2\2\u0229\u022a\7^\2\2\u022a\u022b\t\33\2\2\u022b|\3\2\2\29\2\u00dd"+
		"\u00e4\u00ef\u00fc\u0102\u0108\u010a\u0110\u011c\u0120\u0122\u0126\u012c"+
		"\u0132\u0136\u013a\u013f\u0142\u0147\u014e\u0151\u0156\u015c\u0164\u016a"+
		"\u016d\u0171\u0176\u017f\u0184\u0188\u0196\u019b\u019f\u01aa\u01ac\u01b5"+
		"\u01b7\u01d0\u01db\u01e5\u01ea\u01ed\u01f1\u0202\u0204\u0208\u020d\u0212"+
		"\u0214\u021a\u021c\u0220\u0227\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}