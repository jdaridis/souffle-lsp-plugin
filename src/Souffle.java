// Generated from /home/john/IdeaProjects/Souffle Ide Plugin/grammar/Souffle.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Souffle extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, DECL=2, FUNCTOR=3, INPUT_DECL=4, OUTPUT_DECL=5, PRINTSIZE_DECL=6, 
		LIMITSIZE_DECL=7, TYPE=8, COMPONENT=9, INSTANSIATE=10, NUMBER_TYPE=11, 
		SYMBOL_TYPE=12, OVERRIDE=13, PRAGMA=14, PLAN=15, AUTOINC=16, BW_AND=17, 
		BW_OR=18, BW_XOR=19, BW_NOT=20, BW_SHIFT_L=21, BW_SHIFT_R=22, BW_SHIFT_R_UNSIGNED=23, 
		L_AND=24, L_OR=25, L_XOR=26, L_NOT=27, TMATCH=28, MEAN=29, CAT=30, ORD=31, 
		RANGE=32, STRLEN=33, SUBSTR=34, STATEFUL=35, TCONTAINS=36, OUTPUT_QUALIFIER=37, 
		INPUT_QUALIFIER=38, OVERRIDABLE_QUALIFIER=39, PRINTSIZE_QUALIFIER=40, 
		EQREL_QUALIFIER=41, INLINE_QUALIFIER=42, NO_INLINE_QUALIFIER=43, MAGIC_QUALIFIER=44, 
		NO_MAGIC_QUALIFIER=45, BRIE_QUALIFIER=46, BTREE_DELETE_QUALIFIER=47, BTREE_QUALIFIER=48, 
		MIN=49, MAX=50, AS=51, NIL=52, UNDERSCORE=53, COUNT=54, SUM=55, TRUE=56, 
		FALSE=57, TOFLOAT=58, TONUMBER=59, TOSTRING=60, TOUNSIGNED=61, CHOICEDOMAIN=62, 
		PIPE=63, LBRACKET=64, RBRACKET=65, DOLLAR=66, PLUS=67, MINUS=68, LPAREN=69, 
		RPAREN=70, COMMA=71, COLON=72, SEMICOLON=73, DOT=74, SUBTYPE=75, LE=76, 
		GE=77, NE=78, EQUALS=79, EXCLAMATION=80, STAR=81, AT=82, SLASH=83, CARET=84, 
		PERCENT=85, LBRACE=86, RBRACE=87, LT=88, GT=89, IF=90, NUMBER=91, FLOAT=92, 
		UNSIGNED=93, IDENT=94, STRING=95, COMMENT=96, END=97;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "DECL", "FUNCTOR", "INPUT_DECL", "OUTPUT_DECL", "PRINTSIZE_DECL", 
			"LIMITSIZE_DECL", "TYPE", "COMPONENT", "INSTANSIATE", "NUMBER_TYPE", 
			"SYMBOL_TYPE", "OVERRIDE", "PRAGMA", "PLAN", "AUTOINC", "BW_AND", "BW_OR", 
			"BW_XOR", "BW_NOT", "BW_SHIFT_L", "BW_SHIFT_R", "BW_SHIFT_R_UNSIGNED", 
			"L_AND", "L_OR", "L_XOR", "L_NOT", "TMATCH", "MEAN", "CAT", "ORD", "RANGE", 
			"STRLEN", "SUBSTR", "STATEFUL", "TCONTAINS", "OUTPUT_QUALIFIER", "INPUT_QUALIFIER", 
			"OVERRIDABLE_QUALIFIER", "PRINTSIZE_QUALIFIER", "EQREL_QUALIFIER", "INLINE_QUALIFIER", 
			"NO_INLINE_QUALIFIER", "MAGIC_QUALIFIER", "NO_MAGIC_QUALIFIER", "BRIE_QUALIFIER", 
			"BTREE_DELETE_QUALIFIER", "BTREE_QUALIFIER", "MIN", "MAX", "AS", "NIL", 
			"UNDERSCORE", "COUNT", "SUM", "TRUE", "FALSE", "TOFLOAT", "TONUMBER", 
			"TOSTRING", "TOUNSIGNED", "CHOICEDOMAIN", "PIPE", "LBRACKET", "RBRACKET", 
			"DOLLAR", "PLUS", "MINUS", "LPAREN", "RPAREN", "COMMA", "COLON", "SEMICOLON", 
			"DOT", "SUBTYPE", "LE", "GE", "NE", "EQUALS", "EXCLAMATION", "STAR", 
			"AT", "SLASH", "CARET", "PERCENT", "LBRACE", "RBRACE", "LT", "GT", "IF", 
			"NUMBER", "FLOAT", "UNSIGNED", "IDENT", "STRING", "ESC", "UNICODE", "HEX", 
			"COMMENT", "END"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'.decl'", "'.functor'", "'.input'", "'.output'", "'.printsize'", 
			"'.limitsize'", "'.type'", "'.comp'", "'.init'", "'.number_type'", "'.symbol_type'", 
			"'.override'", "'.pragma'", "'.plan'", "'autoinc'", "'band'", "'bor'", 
			"'bxor'", "'bnot'", "'bshl'", "'bshr'", "'bshru'", "'land'", "'lor'", 
			"'lxor'", "'lnot'", "'match'", "'mean'", "'cat'", "'ord'", "'range'", 
			"'strlen'", "'substr'", "'stateful'", "'contains'", "'output'", "'input'", 
			"'overridable'", "'printsize'", "'eqrel'", "'inline'", "'no_inline'", 
			"'magic'", "'no_magic'", "'brie'", "'btree_delete'", "'btree'", "'min'", 
			"'max'", "'as'", "'nil'", "'_'", "'count'", "'sum'", "'true'", "'false'", 
			"'to_float'", "'to_number'", "'to_string'", "'to_unsigned'", "'choice-domain'", 
			"'|'", "'['", "']'", "'$'", "'+'", "'-'", "'('", "')'", "','", "':'", 
			"';'", "'.'", "'<:'", "'<='", "'>='", "'!='", "'='", "'!'", "'*'", "'@'", 
			"'/'", "'^'", "'%'", "'{'", "'}'", "'<'", "'>'", "':-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "DECL", "FUNCTOR", "INPUT_DECL", "OUTPUT_DECL", "PRINTSIZE_DECL", 
			"LIMITSIZE_DECL", "TYPE", "COMPONENT", "INSTANSIATE", "NUMBER_TYPE", 
			"SYMBOL_TYPE", "OVERRIDE", "PRAGMA", "PLAN", "AUTOINC", "BW_AND", "BW_OR", 
			"BW_XOR", "BW_NOT", "BW_SHIFT_L", "BW_SHIFT_R", "BW_SHIFT_R_UNSIGNED", 
			"L_AND", "L_OR", "L_XOR", "L_NOT", "TMATCH", "MEAN", "CAT", "ORD", "RANGE", 
			"STRLEN", "SUBSTR", "STATEFUL", "TCONTAINS", "OUTPUT_QUALIFIER", "INPUT_QUALIFIER", 
			"OVERRIDABLE_QUALIFIER", "PRINTSIZE_QUALIFIER", "EQREL_QUALIFIER", "INLINE_QUALIFIER", 
			"NO_INLINE_QUALIFIER", "MAGIC_QUALIFIER", "NO_MAGIC_QUALIFIER", "BRIE_QUALIFIER", 
			"BTREE_DELETE_QUALIFIER", "BTREE_QUALIFIER", "MIN", "MAX", "AS", "NIL", 
			"UNDERSCORE", "COUNT", "SUM", "TRUE", "FALSE", "TOFLOAT", "TONUMBER", 
			"TOSTRING", "TOUNSIGNED", "CHOICEDOMAIN", "PIPE", "LBRACKET", "RBRACKET", 
			"DOLLAR", "PLUS", "MINUS", "LPAREN", "RPAREN", "COMMA", "COLON", "SEMICOLON", 
			"DOT", "SUBTYPE", "LE", "GE", "NE", "EQUALS", "EXCLAMATION", "STAR", 
			"AT", "SLASH", "CARET", "PERCENT", "LBRACE", "RBRACE", "LT", "GT", "IF", 
			"NUMBER", "FLOAT", "UNSIGNED", "IDENT", "STRING", "COMMENT", "END"
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


	public Souffle(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Souffle.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2c\u0347\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\3\2\6\2\u00cd\n\2\r\2\16\2\u00ce\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3"+
		"G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P\3"+
		"P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3"+
		"[\3\\\6\\\u02be\n\\\r\\\16\\\u02bf\3\\\3\\\6\\\u02c4\n\\\r\\\16\\\u02c5"+
		"\3\\\3\\\6\\\u02ca\n\\\r\\\16\\\u02cb\3\\\3\\\6\\\u02d0\n\\\r\\\16\\\u02d1"+
		"\3\\\6\\\u02d5\n\\\r\\\16\\\u02d6\3\\\3\\\3\\\3\\\6\\\u02dd\n\\\r\\\16"+
		"\\\u02de\3\\\3\\\3\\\3\\\6\\\u02e5\n\\\r\\\16\\\u02e6\5\\\u02e9\n\\\3"+
		"]\6]\u02ec\n]\r]\16]\u02ed\3]\3]\6]\u02f2\n]\r]\16]\u02f3\3^\6^\u02f7"+
		"\n^\r^\16^\u02f8\3^\3^\3^\3^\3^\6^\u0300\n^\r^\16^\u0301\3^\3^\3^\3^\3"+
		"^\6^\u0309\n^\r^\16^\u030a\3^\5^\u030e\n^\3_\3_\3_\6_\u0313\n_\r_\16_"+
		"\u0314\5_\u0317\n_\3`\3`\3`\7`\u031c\n`\f`\16`\u031f\13`\3`\3`\3a\3a\3"+
		"a\5a\u0326\na\3b\3b\3b\3b\3b\3b\3c\3c\3d\3d\3d\3d\7d\u0334\nd\fd\16d\u0337"+
		"\13d\3d\3d\3d\3d\3d\3d\7d\u033f\nd\fd\16d\u0342\13d\5d\u0344\nd\3e\3e"+
		"\3\u0335\2f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f"+
		"Q\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3"+
		"[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1\2\u00c3\2\u00c5\2\u00c7"+
		"b\u00c9c\3\2\r\5\2\13\f\17\17\"\"\3\2\62;\3\2\62\63\5\2\62;CHch\3\2\60"+
		"\60\5\2AAC\\c|\6\2AAC\\aac|\7\2\62;AAC\\aac|\4\2$$^^\n\2$$\61\61^^ddh"+
		"hppttvv\4\2\f\f\17\17\2\u035d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3"+
		"\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7"+
		"\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2"+
		"\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\3\u00cc\3\2\2\2\5\u00d2\3\2\2\2\7\u00d8"+
		"\3\2\2\2\t\u00e1\3\2\2\2\13\u00e8\3\2\2\2\r\u00f0\3\2\2\2\17\u00fb\3\2"+
		"\2\2\21\u0106\3\2\2\2\23\u010c\3\2\2\2\25\u0112\3\2\2\2\27\u0118\3\2\2"+
		"\2\31\u0125\3\2\2\2\33\u0132\3\2\2\2\35\u013c\3\2\2\2\37\u0144\3\2\2\2"+
		"!\u014a\3\2\2\2#\u0152\3\2\2\2%\u0157\3\2\2\2\'\u015b\3\2\2\2)\u0160\3"+
		"\2\2\2+\u0165\3\2\2\2-\u016a\3\2\2\2/\u016f\3\2\2\2\61\u0175\3\2\2\2\63"+
		"\u017a\3\2\2\2\65\u017e\3\2\2\2\67\u0183\3\2\2\29\u0188\3\2\2\2;\u018e"+
		"\3\2\2\2=\u0193\3\2\2\2?\u0197\3\2\2\2A\u019b\3\2\2\2C\u01a1\3\2\2\2E"+
		"\u01a8\3\2\2\2G\u01af\3\2\2\2I\u01b8\3\2\2\2K\u01c1\3\2\2\2M\u01c8\3\2"+
		"\2\2O\u01ce\3\2\2\2Q\u01da\3\2\2\2S\u01e4\3\2\2\2U\u01ea\3\2\2\2W\u01f1"+
		"\3\2\2\2Y\u01fb\3\2\2\2[\u0201\3\2\2\2]\u020a\3\2\2\2_\u020f\3\2\2\2a"+
		"\u021c\3\2\2\2c\u0222\3\2\2\2e\u0226\3\2\2\2g\u022a\3\2\2\2i\u022d\3\2"+
		"\2\2k\u0231\3\2\2\2m\u0233\3\2\2\2o\u0239\3\2\2\2q\u023d\3\2\2\2s\u0242"+
		"\3\2\2\2u\u0248\3\2\2\2w\u0251\3\2\2\2y\u025b\3\2\2\2{\u0265\3\2\2\2}"+
		"\u0271\3\2\2\2\177\u027f\3\2\2\2\u0081\u0281\3\2\2\2\u0083\u0283\3\2\2"+
		"\2\u0085\u0285\3\2\2\2\u0087\u0287\3\2\2\2\u0089\u0289\3\2\2\2\u008b\u028b"+
		"\3\2\2\2\u008d\u028d\3\2\2\2\u008f\u028f\3\2\2\2\u0091\u0291\3\2\2\2\u0093"+
		"\u0293\3\2\2\2\u0095\u0295\3\2\2\2\u0097\u0297\3\2\2\2\u0099\u029a\3\2"+
		"\2\2\u009b\u029d\3\2\2\2\u009d\u02a0\3\2\2\2\u009f\u02a3\3\2\2\2\u00a1"+
		"\u02a5\3\2\2\2\u00a3\u02a7\3\2\2\2\u00a5\u02a9\3\2\2\2\u00a7\u02ab\3\2"+
		"\2\2\u00a9\u02ad\3\2\2\2\u00ab\u02af\3\2\2\2\u00ad\u02b1\3\2\2\2\u00af"+
		"\u02b3\3\2\2\2\u00b1\u02b5\3\2\2\2\u00b3\u02b7\3\2\2\2\u00b5\u02b9\3\2"+
		"\2\2\u00b7\u02e8\3\2\2\2\u00b9\u02eb\3\2\2\2\u00bb\u030d\3\2\2\2\u00bd"+
		"\u0316\3\2\2\2\u00bf\u0318\3\2\2\2\u00c1\u0322\3\2\2\2\u00c3\u0327\3\2"+
		"\2\2\u00c5\u032d\3\2\2\2\u00c7\u0343\3\2\2\2\u00c9\u0345\3\2\2\2\u00cb"+
		"\u00cd\t\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\2\2\2\u00d1"+
		"\4\3\2\2\2\u00d2\u00d3\7\60\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5\7g\2\2"+
		"\u00d5\u00d6\7e\2\2\u00d6\u00d7\7n\2\2\u00d7\6\3\2\2\2\u00d8\u00d9\7\60"+
		"\2\2\u00d9\u00da\7h\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd"+
		"\7e\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0"+
		"\b\3\2\2\2\u00e1\u00e2\7\60\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7p\2\2"+
		"\u00e4\u00e5\7r\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7v\2\2\u00e7\n\3\2"+
		"\2\2\u00e8\u00e9\7\60\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7w\2\2\u00eb"+
		"\u00ec\7v\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef\7v\2\2"+
		"\u00ef\f\3\2\2\2\u00f0\u00f1\7\60\2\2\u00f1\u00f2\7r\2\2\u00f2\u00f3\7"+
		"t\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7"+
		"\7u\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7|\2\2\u00f9\u00fa\7g\2\2\u00fa"+
		"\16\3\2\2\2\u00fb\u00fc\7\60\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7k\2\2"+
		"\u00fe\u00ff\7o\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7v\2\2\u0101\u0102"+
		"\7u\2\2\u0102\u0103\7k\2\2\u0103\u0104\7|\2\2\u0104\u0105\7g\2\2\u0105"+
		"\20\3\2\2\2\u0106\u0107\7\60\2\2\u0107\u0108\7v\2\2\u0108\u0109\7{\2\2"+
		"\u0109\u010a\7r\2\2\u010a\u010b\7g\2\2\u010b\22\3\2\2\2\u010c\u010d\7"+
		"\60\2\2\u010d\u010e\7e\2\2\u010e\u010f\7q\2\2\u010f\u0110\7o\2\2\u0110"+
		"\u0111\7r\2\2\u0111\24\3\2\2\2\u0112\u0113\7\60\2\2\u0113\u0114\7k\2\2"+
		"\u0114\u0115\7p\2\2\u0115\u0116\7k\2\2\u0116\u0117\7v\2\2\u0117\26\3\2"+
		"\2\2\u0118\u0119\7\60\2\2\u0119\u011a\7p\2\2\u011a\u011b\7w\2\2\u011b"+
		"\u011c\7o\2\2\u011c\u011d\7d\2\2\u011d\u011e\7g\2\2\u011e\u011f\7t\2\2"+
		"\u011f\u0120\7a\2\2\u0120\u0121\7v\2\2\u0121\u0122\7{\2\2\u0122\u0123"+
		"\7r\2\2\u0123\u0124\7g\2\2\u0124\30\3\2\2\2\u0125\u0126\7\60\2\2\u0126"+
		"\u0127\7u\2\2\u0127\u0128\7{\2\2\u0128\u0129\7o\2\2\u0129\u012a\7d\2\2"+
		"\u012a\u012b\7q\2\2\u012b\u012c\7n\2\2\u012c\u012d\7a\2\2\u012d\u012e"+
		"\7v\2\2\u012e\u012f\7{\2\2\u012f\u0130\7r\2\2\u0130\u0131\7g\2\2\u0131"+
		"\32\3\2\2\2\u0132\u0133\7\60\2\2\u0133\u0134\7q\2\2\u0134\u0135\7x\2\2"+
		"\u0135\u0136\7g\2\2\u0136\u0137\7t\2\2\u0137\u0138\7t\2\2\u0138\u0139"+
		"\7k\2\2\u0139\u013a\7f\2\2\u013a\u013b\7g\2\2\u013b\34\3\2\2\2\u013c\u013d"+
		"\7\60\2\2\u013d\u013e\7r\2\2\u013e\u013f\7t\2\2\u013f\u0140\7c\2\2\u0140"+
		"\u0141\7i\2\2\u0141\u0142\7o\2\2\u0142\u0143\7c\2\2\u0143\36\3\2\2\2\u0144"+
		"\u0145\7\60\2\2\u0145\u0146\7r\2\2\u0146\u0147\7n\2\2\u0147\u0148\7c\2"+
		"\2\u0148\u0149\7p\2\2\u0149 \3\2\2\2\u014a\u014b\7c\2\2\u014b\u014c\7"+
		"w\2\2\u014c\u014d\7v\2\2\u014d\u014e\7q\2\2\u014e\u014f\7k\2\2\u014f\u0150"+
		"\7p\2\2\u0150\u0151\7e\2\2\u0151\"\3\2\2\2\u0152\u0153\7d\2\2\u0153\u0154"+
		"\7c\2\2\u0154\u0155\7p\2\2\u0155\u0156\7f\2\2\u0156$\3\2\2\2\u0157\u0158"+
		"\7d\2\2\u0158\u0159\7q\2\2\u0159\u015a\7t\2\2\u015a&\3\2\2\2\u015b\u015c"+
		"\7d\2\2\u015c\u015d\7z\2\2\u015d\u015e\7q\2\2\u015e\u015f\7t\2\2\u015f"+
		"(\3\2\2\2\u0160\u0161\7d\2\2\u0161\u0162\7p\2\2\u0162\u0163\7q\2\2\u0163"+
		"\u0164\7v\2\2\u0164*\3\2\2\2\u0165\u0166\7d\2\2\u0166\u0167\7u\2\2\u0167"+
		"\u0168\7j\2\2\u0168\u0169\7n\2\2\u0169,\3\2\2\2\u016a\u016b\7d\2\2\u016b"+
		"\u016c\7u\2\2\u016c\u016d\7j\2\2\u016d\u016e\7t\2\2\u016e.\3\2\2\2\u016f"+
		"\u0170\7d\2\2\u0170\u0171\7u\2\2\u0171\u0172\7j\2\2\u0172\u0173\7t\2\2"+
		"\u0173\u0174\7w\2\2\u0174\60\3\2\2\2\u0175\u0176\7n\2\2\u0176\u0177\7"+
		"c\2\2\u0177\u0178\7p\2\2\u0178\u0179\7f\2\2\u0179\62\3\2\2\2\u017a\u017b"+
		"\7n\2\2\u017b\u017c\7q\2\2\u017c\u017d\7t\2\2\u017d\64\3\2\2\2\u017e\u017f"+
		"\7n\2\2\u017f\u0180\7z\2\2\u0180\u0181\7q\2\2\u0181\u0182\7t\2\2\u0182"+
		"\66\3\2\2\2\u0183\u0184\7n\2\2\u0184\u0185\7p\2\2\u0185\u0186\7q\2\2\u0186"+
		"\u0187\7v\2\2\u01878\3\2\2\2\u0188\u0189\7o\2\2\u0189\u018a\7c\2\2\u018a"+
		"\u018b\7v\2\2\u018b\u018c\7e\2\2\u018c\u018d\7j\2\2\u018d:\3\2\2\2\u018e"+
		"\u018f\7o\2\2\u018f\u0190\7g\2\2\u0190\u0191\7c\2\2\u0191\u0192\7p\2\2"+
		"\u0192<\3\2\2\2\u0193\u0194\7e\2\2\u0194\u0195\7c\2\2\u0195\u0196\7v\2"+
		"\2\u0196>\3\2\2\2\u0197\u0198\7q\2\2\u0198\u0199\7t\2\2\u0199\u019a\7"+
		"f\2\2\u019a@\3\2\2\2\u019b\u019c\7t\2\2\u019c\u019d\7c\2\2\u019d\u019e"+
		"\7p\2\2\u019e\u019f\7i\2\2\u019f\u01a0\7g\2\2\u01a0B\3\2\2\2\u01a1\u01a2"+
		"\7u\2\2\u01a2\u01a3\7v\2\2\u01a3\u01a4\7t\2\2\u01a4\u01a5\7n\2\2\u01a5"+
		"\u01a6\7g\2\2\u01a6\u01a7\7p\2\2\u01a7D\3\2\2\2\u01a8\u01a9\7u\2\2\u01a9"+
		"\u01aa\7w\2\2\u01aa\u01ab\7d\2\2\u01ab\u01ac\7u\2\2\u01ac\u01ad\7v\2\2"+
		"\u01ad\u01ae\7t\2\2\u01aeF\3\2\2\2\u01af\u01b0\7u\2\2\u01b0\u01b1\7v\2"+
		"\2\u01b1\u01b2\7c\2\2\u01b2\u01b3\7v\2\2\u01b3\u01b4\7g\2\2\u01b4\u01b5"+
		"\7h\2\2\u01b5\u01b6\7w\2\2\u01b6\u01b7\7n\2\2\u01b7H\3\2\2\2\u01b8\u01b9"+
		"\7e\2\2\u01b9\u01ba\7q\2\2\u01ba\u01bb\7p\2\2\u01bb\u01bc\7v\2\2\u01bc"+
		"\u01bd\7c\2\2\u01bd\u01be\7k\2\2\u01be\u01bf\7p\2\2\u01bf\u01c0\7u\2\2"+
		"\u01c0J\3\2\2\2\u01c1\u01c2\7q\2\2\u01c2\u01c3\7w\2\2\u01c3\u01c4\7v\2"+
		"\2\u01c4\u01c5\7r\2\2\u01c5\u01c6\7w\2\2\u01c6\u01c7\7v\2\2\u01c7L\3\2"+
		"\2\2\u01c8\u01c9\7k\2\2\u01c9\u01ca\7p\2\2\u01ca\u01cb\7r\2\2\u01cb\u01cc"+
		"\7w\2\2\u01cc\u01cd\7v\2\2\u01cdN\3\2\2\2\u01ce\u01cf\7q\2\2\u01cf\u01d0"+
		"\7x\2\2\u01d0\u01d1\7g\2\2\u01d1\u01d2\7t\2\2\u01d2\u01d3\7t\2\2\u01d3"+
		"\u01d4\7k\2\2\u01d4\u01d5\7f\2\2\u01d5\u01d6\7c\2\2\u01d6\u01d7\7d\2\2"+
		"\u01d7\u01d8\7n\2\2\u01d8\u01d9\7g\2\2\u01d9P\3\2\2\2\u01da\u01db\7r\2"+
		"\2\u01db\u01dc\7t\2\2\u01dc\u01dd\7k\2\2\u01dd\u01de\7p\2\2\u01de\u01df"+
		"\7v\2\2\u01df\u01e0\7u\2\2\u01e0\u01e1\7k\2\2\u01e1\u01e2\7|\2\2\u01e2"+
		"\u01e3\7g\2\2\u01e3R\3\2\2\2\u01e4\u01e5\7g\2\2\u01e5\u01e6\7s\2\2\u01e6"+
		"\u01e7\7t\2\2\u01e7\u01e8\7g\2\2\u01e8\u01e9\7n\2\2\u01e9T\3\2\2\2\u01ea"+
		"\u01eb\7k\2\2\u01eb\u01ec\7p\2\2\u01ec\u01ed\7n\2\2\u01ed\u01ee\7k\2\2"+
		"\u01ee\u01ef\7p\2\2\u01ef\u01f0\7g\2\2\u01f0V\3\2\2\2\u01f1\u01f2\7p\2"+
		"\2\u01f2\u01f3\7q\2\2\u01f3\u01f4\7a\2\2\u01f4\u01f5\7k\2\2\u01f5\u01f6"+
		"\7p\2\2\u01f6\u01f7\7n\2\2\u01f7\u01f8\7k\2\2\u01f8\u01f9\7p\2\2\u01f9"+
		"\u01fa\7g\2\2\u01faX\3\2\2\2\u01fb\u01fc\7o\2\2\u01fc\u01fd\7c\2\2\u01fd"+
		"\u01fe\7i\2\2\u01fe\u01ff\7k\2\2\u01ff\u0200\7e\2\2\u0200Z\3\2\2\2\u0201"+
		"\u0202\7p\2\2\u0202\u0203\7q\2\2\u0203\u0204\7a\2\2\u0204\u0205\7o\2\2"+
		"\u0205\u0206\7c\2\2\u0206\u0207\7i\2\2\u0207\u0208\7k\2\2\u0208\u0209"+
		"\7e\2\2\u0209\\\3\2\2\2\u020a\u020b\7d\2\2\u020b\u020c\7t\2\2\u020c\u020d"+
		"\7k\2\2\u020d\u020e\7g\2\2\u020e^\3\2\2\2\u020f\u0210\7d\2\2\u0210\u0211"+
		"\7v\2\2\u0211\u0212\7t\2\2\u0212\u0213\7g\2\2\u0213\u0214\7g\2\2\u0214"+
		"\u0215\7a\2\2\u0215\u0216\7f\2\2\u0216\u0217\7g\2\2\u0217\u0218\7n\2\2"+
		"\u0218\u0219\7g\2\2\u0219\u021a\7v\2\2\u021a\u021b\7g\2\2\u021b`\3\2\2"+
		"\2\u021c\u021d\7d\2\2\u021d\u021e\7v\2\2\u021e\u021f\7t\2\2\u021f\u0220"+
		"\7g\2\2\u0220\u0221\7g\2\2\u0221b\3\2\2\2\u0222\u0223\7o\2\2\u0223\u0224"+
		"\7k\2\2\u0224\u0225\7p\2\2\u0225d\3\2\2\2\u0226\u0227\7o\2\2\u0227\u0228"+
		"\7c\2\2\u0228\u0229\7z\2\2\u0229f\3\2\2\2\u022a\u022b\7c\2\2\u022b\u022c"+
		"\7u\2\2\u022ch\3\2\2\2\u022d\u022e\7p\2\2\u022e\u022f\7k\2\2\u022f\u0230"+
		"\7n\2\2\u0230j\3\2\2\2\u0231\u0232\7a\2\2\u0232l\3\2\2\2\u0233\u0234\7"+
		"e\2\2\u0234\u0235\7q\2\2\u0235\u0236\7w\2\2\u0236\u0237\7p\2\2\u0237\u0238"+
		"\7v\2\2\u0238n\3\2\2\2\u0239\u023a\7u\2\2\u023a\u023b\7w\2\2\u023b\u023c"+
		"\7o\2\2\u023cp\3\2\2\2\u023d\u023e\7v\2\2\u023e\u023f\7t\2\2\u023f\u0240"+
		"\7w\2\2\u0240\u0241\7g\2\2\u0241r\3\2\2\2\u0242\u0243\7h\2\2\u0243\u0244"+
		"\7c\2\2\u0244\u0245\7n\2\2\u0245\u0246\7u\2\2\u0246\u0247\7g\2\2\u0247"+
		"t\3\2\2\2\u0248\u0249\7v\2\2\u0249\u024a\7q\2\2\u024a\u024b\7a\2\2\u024b"+
		"\u024c\7h\2\2\u024c\u024d\7n\2\2\u024d\u024e\7q\2\2\u024e\u024f\7c\2\2"+
		"\u024f\u0250\7v\2\2\u0250v\3\2\2\2\u0251\u0252\7v\2\2\u0252\u0253\7q\2"+
		"\2\u0253\u0254\7a\2\2\u0254\u0255\7p\2\2\u0255\u0256\7w\2\2\u0256\u0257"+
		"\7o\2\2\u0257\u0258\7d\2\2\u0258\u0259\7g\2\2\u0259\u025a\7t\2\2\u025a"+
		"x\3\2\2\2\u025b\u025c\7v\2\2\u025c\u025d\7q\2\2\u025d\u025e\7a\2\2\u025e"+
		"\u025f\7u\2\2\u025f\u0260\7v\2\2\u0260\u0261\7t\2\2\u0261\u0262\7k\2\2"+
		"\u0262\u0263\7p\2\2\u0263\u0264\7i\2\2\u0264z\3\2\2\2\u0265\u0266\7v\2"+
		"\2\u0266\u0267\7q\2\2\u0267\u0268\7a\2\2\u0268\u0269\7w\2\2\u0269\u026a"+
		"\7p\2\2\u026a\u026b\7u\2\2\u026b\u026c\7k\2\2\u026c\u026d\7i\2\2\u026d"+
		"\u026e\7p\2\2\u026e\u026f\7g\2\2\u026f\u0270\7f\2\2\u0270|\3\2\2\2\u0271"+
		"\u0272\7e\2\2\u0272\u0273\7j\2\2\u0273\u0274\7q\2\2\u0274\u0275\7k\2\2"+
		"\u0275\u0276\7e\2\2\u0276\u0277\7g\2\2\u0277\u0278\7/\2\2\u0278\u0279"+
		"\7f\2\2\u0279\u027a\7q\2\2\u027a\u027b\7o\2\2\u027b\u027c\7c\2\2\u027c"+
		"\u027d\7k\2\2\u027d\u027e\7p\2\2\u027e~\3\2\2\2\u027f\u0280\7~\2\2\u0280"+
		"\u0080\3\2\2\2\u0281\u0282\7]\2\2\u0282\u0082\3\2\2\2\u0283\u0284\7_\2"+
		"\2\u0284\u0084\3\2\2\2\u0285\u0286\7&\2\2\u0286\u0086\3\2\2\2\u0287\u0288"+
		"\7-\2\2\u0288\u0088\3\2\2\2\u0289\u028a\7/\2\2\u028a\u008a\3\2\2\2\u028b"+
		"\u028c\7*\2\2\u028c\u008c\3\2\2\2\u028d\u028e\7+\2\2\u028e\u008e\3\2\2"+
		"\2\u028f\u0290\7.\2\2\u0290\u0090\3\2\2\2\u0291\u0292\7<\2\2\u0292\u0092"+
		"\3\2\2\2\u0293\u0294\7=\2\2\u0294\u0094\3\2\2\2\u0295\u0296\7\60\2\2\u0296"+
		"\u0096\3\2\2\2\u0297\u0298\7>\2\2\u0298\u0299\7<\2\2\u0299\u0098\3\2\2"+
		"\2\u029a\u029b\7>\2\2\u029b\u029c\7?\2\2\u029c\u009a\3\2\2\2\u029d\u029e"+
		"\7@\2\2\u029e\u029f\7?\2\2\u029f\u009c\3\2\2\2\u02a0\u02a1\7#\2\2\u02a1"+
		"\u02a2\7?\2\2\u02a2\u009e\3\2\2\2\u02a3\u02a4\7?\2\2\u02a4\u00a0\3\2\2"+
		"\2\u02a5\u02a6\7#\2\2\u02a6\u00a2\3\2\2\2\u02a7\u02a8\7,\2\2\u02a8\u00a4"+
		"\3\2\2\2\u02a9\u02aa\7B\2\2\u02aa\u00a6\3\2\2\2\u02ab\u02ac\7\61\2\2\u02ac"+
		"\u00a8\3\2\2\2\u02ad\u02ae\7`\2\2\u02ae\u00aa\3\2\2\2\u02af\u02b0\7\'"+
		"\2\2\u02b0\u00ac\3\2\2\2\u02b1\u02b2\7}\2\2\u02b2\u00ae\3\2\2\2\u02b3"+
		"\u02b4\7\177\2\2\u02b4\u00b0\3\2\2\2\u02b5\u02b6\7>\2\2\u02b6\u00b2\3"+
		"\2\2\2\u02b7\u02b8\7@\2\2\u02b8\u00b4\3\2\2\2\u02b9\u02ba\7<\2\2\u02ba"+
		"\u02bb\7/\2\2\u02bb\u00b6\3\2\2\2\u02bc\u02be\t\3\2\2\u02bd\u02bc\3\2"+
		"\2\2\u02be\u02bf\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02c3\7\60\2\2\u02c2\u02c4\t\3\2\2\u02c3\u02c2\3"+
		"\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7\u02c9\7\60\2\2\u02c8\u02ca\t\3\2\2\u02c9\u02c8\3"+
		"\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cd\u02cf\7\60\2\2\u02ce\u02d0\t\3\2\2\u02cf\u02ce\3"+
		"\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02e9\3\2\2\2\u02d3\u02d5\t\3\2\2\u02d4\u02d3\3\2\2\2\u02d5\u02d6\3\2"+
		"\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02e9\3\2\2\2\u02d8"+
		"\u02d9\7\62\2\2\u02d9\u02da\7d\2\2\u02da\u02dc\3\2\2\2\u02db\u02dd\t\4"+
		"\2\2\u02dc\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02dc\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e9\3\2\2\2\u02e0\u02e1\7\62\2\2\u02e1\u02e2\7"+
		"z\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02e5\t\5\2\2\u02e4\u02e3\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\3\2"+
		"\2\2\u02e8\u02bd\3\2\2\2\u02e8\u02d4\3\2\2\2\u02e8\u02d8\3\2\2\2\u02e8"+
		"\u02e0\3\2\2\2\u02e9\u00b8\3\2\2\2\u02ea\u02ec\t\3\2\2\u02eb\u02ea\3\2"+
		"\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f1\t\6\2\2\u02f0\u02f2\t\3\2\2\u02f1\u02f0\3\2"+
		"\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u00ba\3\2\2\2\u02f5\u02f7\t\3\2\2\u02f6\u02f5\3\2\2\2\u02f7\u02f8\3\2"+
		"\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u030e\7w\2\2\u02fb\u02fc\7\62\2\2\u02fc\u02fd\7d\2\2\u02fd\u02ff\3\2"+
		"\2\2\u02fe\u0300\t\4\2\2\u02ff\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301"+
		"\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u030e\7w"+
		"\2\2\u0304\u0305\7\62\2\2\u0305\u0306\7z\2\2\u0306\u0308\3\2\2\2\u0307"+
		"\u0309\t\5\2\2\u0308\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u0308\3\2"+
		"\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\7w\2\2\u030d"+
		"\u02f6\3\2\2\2\u030d\u02fb\3\2\2\2\u030d\u0304\3\2\2\2\u030e\u00bc\3\2"+
		"\2\2\u030f\u0317\t\7\2\2\u0310\u0312\t\b\2\2\u0311\u0313\t\t\2\2\u0312"+
		"\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2"+
		"\2\2\u0315\u0317\3\2\2\2\u0316\u030f\3\2\2\2\u0316\u0310\3\2\2\2\u0317"+
		"\u00be\3\2\2\2\u0318\u031d\7$\2\2\u0319\u031c\5\u00c1a\2\u031a\u031c\n"+
		"\n\2\2\u031b\u0319\3\2\2\2\u031b\u031a\3\2\2\2\u031c\u031f\3\2\2\2\u031d"+
		"\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\3\2\2\2\u031f\u031d\3\2"+
		"\2\2\u0320\u0321\7$\2\2\u0321\u00c0\3\2\2\2\u0322\u0325\7^\2\2\u0323\u0326"+
		"\t\13\2\2\u0324\u0326\5\u00c3b\2\u0325\u0323\3\2\2\2\u0325\u0324\3\2\2"+
		"\2\u0326\u00c2\3\2\2\2\u0327\u0328\7w\2\2\u0328\u0329\5\u00c5c\2\u0329"+
		"\u032a\5\u00c5c\2\u032a\u032b\5\u00c5c\2\u032b\u032c\5\u00c5c\2\u032c"+
		"\u00c4\3\2\2\2\u032d\u032e\t\5\2\2\u032e\u00c6\3\2\2\2\u032f\u0330\7\61"+
		"\2\2\u0330\u0331\7,\2\2\u0331\u0335\3\2\2\2\u0332\u0334\13\2\2\2\u0333"+
		"\u0332\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0336\3\2\2\2\u0335\u0333\3\2"+
		"\2\2\u0336\u0338\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u0339\7,\2\2\u0339"+
		"\u0344\7\61\2\2\u033a\u033b\7\61\2\2\u033b\u033c\7\61\2\2\u033c\u0340"+
		"\3\2\2\2\u033d\u033f\n\f\2\2\u033e\u033d\3\2\2\2\u033f\u0342\3\2\2\2\u0340"+
		"\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2"+
		"\2\2\u0343\u032f\3\2\2\2\u0343\u033a\3\2\2\2\u0344\u00c8\3\2\2\2\u0345"+
		"\u0346\7\2\2\3\u0346\u00ca\3\2\2\2\32\2\u00ce\u02bf\u02c5\u02cb\u02d1"+
		"\u02d6\u02de\u02e6\u02e8\u02ed\u02f3\u02f8\u0301\u030a\u030d\u0314\u0316"+
		"\u031b\u031d\u0325\u0335\u0340\u0343\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}