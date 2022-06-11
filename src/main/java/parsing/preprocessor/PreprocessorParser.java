// Generated from /home/john/IdeaProjects/Souffle_Ide_Plugin/grammar/Preprocessor.g4 by ANTLR 4.10.1
package parsing.preprocessor;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PreprocessorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEW_LINE=1, WS=2, INCLUDE=3, DEFINE=4, IF_PRE=5, ELSE=6, IFNDEF=7, IFDEF=8, 
		ENDIF=9, PREPROCESSOR_PRAGMA=10, HASH=11, MACRO_BODY=12, LPAREN=13, RPAREN=14, 
		BACKSLASH=15, IDENT=16, VARARGS=17, DECL=18, FUNCTOR=19, INPUT_DECL=20, 
		OUTPUT_DECL=21, PRINTSIZE_DECL=22, LIMITSIZE_DECL=23, TYPE=24, COMPONENT=25, 
		INSTANTIATE=26, NUMBER_TYPE=27, SYMBOL_TYPE=28, OVERRIDE=29, PRAGMA=30, 
		PLAN=31, PIPE=32, LBRACKET=33, RBRACKET=34, DOLLAR=35, PLUS=36, MINUS=37, 
		COMMA=38, COLON=39, SEMICOLON=40, SUBTYPE=41, LE=42, GE=43, NE=44, EQUALS=45, 
		EXCLAMATION=46, STAR=47, AT=48, SLASH=49, CARET=50, PERCENT=51, LBRACE=52, 
		RBRACE=53, LT=54, GT=55, IF=56, DOT=57, NUMBER=58, FLOAT=59, UNSIGNED=60, 
		AUTOINC=61, BW_AND=62, BW_OR=63, BW_XOR=64, BW_NOT=65, BW_SHIFT_L=66, 
		BW_SHIFT_R=67, BW_SHIFT_R_UNSIGNED=68, L_AND=69, L_OR=70, L_XOR=71, L_NOT=72, 
		OUTPUT_QUALIFIER=73, INPUT_QUALIFIER=74, OVERRIDABLE_QUALIFIER=75, PRINTSIZE_QUALIFIER=76, 
		EQREL_QUALIFIER=77, INLINE_QUALIFIER=78, NO_INLINE_QUALIFIER=79, MAGIC_QUALIFIER=80, 
		NO_MAGIC_QUALIFIER=81, BRIE_QUALIFIER=82, BTREE_DELETE_QUALIFIER=83, BTREE_QUALIFIER=84, 
		UNDERSCORE=85, TRUELIT=86, FALSELIT=87, TOFLOAT=88, TONUMBER=89, TOSTRING=90, 
		TOUNSIGNED=91, CHOICEDOMAIN=92, STRING=93, COMMENT=94, LINE_COMMENT=95, 
		ANY_TEXT=96;
	public static final int
		RULE_program = 0, RULE_program_text = 1, RULE_non_empty_directive_list = 2, 
		RULE_pragma_directive = 3, RULE_ifdef_directive = 4, RULE_else_directive = 5, 
		RULE_include_directive = 6, RULE_define_directive = 7, RULE_macro_def = 8, 
		RULE_macro_body = 9, RULE_macro_args = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program_text", "non_empty_directive_list", "pragma_directive", 
			"ifdef_directive", "else_directive", "include_directive", "define_directive", 
			"macro_def", "macro_body", "macro_args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'#if'", "'#else'", "'#ifndef'", "'#ifdef'", 
			"'#endif'", "'#pragma'", "'#'", null, "'('", "')'", "'\\'", null, "'...'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'|'", "'['", "']'", "'$'", "'+'", "'-'", "','", "':'", "';'", 
			"'<:'", "'<='", "'>='", "'!='", "'='", "'!'", "'*'", "'@'", "'/'", "'^'", 
			"'%'", "'{'", "'}'", "'<'", "'>'", "':-'", "'.'", null, null, null, "'autoinc'", 
			"'band'", "'bor'", "'bxor'", "'bnot'", "'bshl'", "'bshr'", "'bshru'", 
			"'land'", "'lor'", "'lxor'", "'lnot'", "'output'", "'input'", "'overridable'", 
			"'printsize'", "'eqrel'", "'inline'", "'no_inline'", "'magic'", "'no_magic'", 
			"'brie'", "'btree_delete'", "'btree'", "'_'", "'true'", "'false'", "'to_float'", 
			"'to_number'", "'to_string'", "'to_unsigned'", "'choice-domain'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEW_LINE", "WS", "INCLUDE", "DEFINE", "IF_PRE", "ELSE", "IFNDEF", 
			"IFDEF", "ENDIF", "PREPROCESSOR_PRAGMA", "HASH", "MACRO_BODY", "LPAREN", 
			"RPAREN", "BACKSLASH", "IDENT", "VARARGS", "DECL", "FUNCTOR", "INPUT_DECL", 
			"OUTPUT_DECL", "PRINTSIZE_DECL", "LIMITSIZE_DECL", "TYPE", "COMPONENT", 
			"INSTANTIATE", "NUMBER_TYPE", "SYMBOL_TYPE", "OVERRIDE", "PRAGMA", "PLAN", 
			"PIPE", "LBRACKET", "RBRACKET", "DOLLAR", "PLUS", "MINUS", "COMMA", "COLON", 
			"SEMICOLON", "SUBTYPE", "LE", "GE", "NE", "EQUALS", "EXCLAMATION", "STAR", 
			"AT", "SLASH", "CARET", "PERCENT", "LBRACE", "RBRACE", "LT", "GT", "IF", 
			"DOT", "NUMBER", "FLOAT", "UNSIGNED", "AUTOINC", "BW_AND", "BW_OR", "BW_XOR", 
			"BW_NOT", "BW_SHIFT_L", "BW_SHIFT_R", "BW_SHIFT_R_UNSIGNED", "L_AND", 
			"L_OR", "L_XOR", "L_NOT", "OUTPUT_QUALIFIER", "INPUT_QUALIFIER", "OVERRIDABLE_QUALIFIER", 
			"PRINTSIZE_QUALIFIER", "EQREL_QUALIFIER", "INLINE_QUALIFIER", "NO_INLINE_QUALIFIER", 
			"MAGIC_QUALIFIER", "NO_MAGIC_QUALIFIER", "BRIE_QUALIFIER", "BTREE_DELETE_QUALIFIER", 
			"BTREE_QUALIFIER", "UNDERSCORE", "TRUELIT", "FALSELIT", "TOFLOAT", "TONUMBER", 
			"TOSTRING", "TOUNSIGNED", "CHOICEDOMAIN", "STRING", "COMMENT", "LINE_COMMENT", 
			"ANY_TEXT"
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
	public String getGrammarFileName() { return "Preprocessor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PreprocessorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program_textContext program_text() {
			return getRuleContext(Program_textContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PreprocessorVisitor ) return ((PreprocessorVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			program_text();
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

	public static class Program_textContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(PreprocessorParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(PreprocessorParser.IDENT, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(PreprocessorParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PreprocessorParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PreprocessorParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PreprocessorParser.RPAREN, i);
		}
		public List<TerminalNode> STRING() { return getTokens(PreprocessorParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PreprocessorParser.STRING, i);
		}
		public List<TerminalNode> COLON() { return getTokens(PreprocessorParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PreprocessorParser.COLON, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PreprocessorParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PreprocessorParser.SEMICOLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PreprocessorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PreprocessorParser.COMMA, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PreprocessorParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PreprocessorParser.DOT, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(PreprocessorParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(PreprocessorParser.UNDERSCORE, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(PreprocessorParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(PreprocessorParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(PreprocessorParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(PreprocessorParser.RBRACE, i);
		}
		public List<TerminalNode> LE() { return getTokens(PreprocessorParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(PreprocessorParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(PreprocessorParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(PreprocessorParser.GE, i);
		}
		public List<TerminalNode> TRUELIT() { return getTokens(PreprocessorParser.TRUELIT); }
		public TerminalNode TRUELIT(int i) {
			return getToken(PreprocessorParser.TRUELIT, i);
		}
		public List<TerminalNode> FALSELIT() { return getTokens(PreprocessorParser.FALSELIT); }
		public TerminalNode FALSELIT(int i) {
			return getToken(PreprocessorParser.FALSELIT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PreprocessorParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PreprocessorParser.NUMBER, i);
		}
		public List<TerminalNode> UNSIGNED() { return getTokens(PreprocessorParser.UNSIGNED); }
		public TerminalNode UNSIGNED(int i) {
			return getToken(PreprocessorParser.UNSIGNED, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(PreprocessorParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(PreprocessorParser.FLOAT, i);
		}
		public List<TerminalNode> LT() { return getTokens(PreprocessorParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(PreprocessorParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(PreprocessorParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(PreprocessorParser.GT, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(PreprocessorParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(PreprocessorParser.EQUALS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PreprocessorParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PreprocessorParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PreprocessorParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PreprocessorParser.MINUS, i);
		}
		public List<TerminalNode> AT() { return getTokens(PreprocessorParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(PreprocessorParser.AT, i);
		}
		public List<TerminalNode> DOLLAR() { return getTokens(PreprocessorParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(PreprocessorParser.DOLLAR, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(PreprocessorParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(PreprocessorParser.RBRACKET, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(PreprocessorParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(PreprocessorParser.LBRACKET, i);
		}
		public List<TerminalNode> STAR() { return getTokens(PreprocessorParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PreprocessorParser.STAR, i);
		}
		public List<TerminalNode> EXCLAMATION() { return getTokens(PreprocessorParser.EXCLAMATION); }
		public TerminalNode EXCLAMATION(int i) {
			return getToken(PreprocessorParser.EXCLAMATION, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(PreprocessorParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(PreprocessorParser.PERCENT, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(PreprocessorParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(PreprocessorParser.SLASH, i);
		}
		public List<TerminalNode> CARET() { return getTokens(PreprocessorParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(PreprocessorParser.CARET, i);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(PreprocessorParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(PreprocessorParser.NEW_LINE, i);
		}
		public List<Non_empty_directive_listContext> non_empty_directive_list() {
			return getRuleContexts(Non_empty_directive_listContext.class);
		}
		public Non_empty_directive_listContext non_empty_directive_list(int i) {
			return getRuleContext(Non_empty_directive_listContext.class,i);
		}
		public Program_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_text; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PreprocessorVisitor ) return ((PreprocessorVisitor<? extends T>)visitor).visitProgram_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Program_textContext program_text() throws RecognitionException {
		Program_textContext _localctx = new Program_textContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program_text);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case ELSE:
			case ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case NEW_LINE:
			case INCLUDE:
			case DEFINE:
			case IF_PRE:
			case IFNDEF:
			case IFDEF:
			case PREPROCESSOR_PRAGMA:
			case LPAREN:
			case RPAREN:
			case IDENT:
			case LBRACKET:
			case RBRACKET:
			case DOLLAR:
			case PLUS:
			case MINUS:
			case COMMA:
			case COLON:
			case SEMICOLON:
			case LE:
			case GE:
			case EQUALS:
			case EXCLAMATION:
			case STAR:
			case AT:
			case SLASH:
			case CARET:
			case PERCENT:
			case LBRACE:
			case RBRACE:
			case LT:
			case GT:
			case DOT:
			case NUMBER:
			case FLOAT:
			case UNSIGNED:
			case UNDERSCORE:
			case TRUELIT:
			case FALSELIT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(59);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENT:
						{
						setState(25);
						match(IDENT);
						}
						break;
					case LPAREN:
						{
						setState(26);
						match(LPAREN);
						}
						break;
					case RPAREN:
						{
						setState(27);
						match(RPAREN);
						}
						break;
					case STRING:
						{
						setState(28);
						match(STRING);
						}
						break;
					case COLON:
						{
						setState(29);
						match(COLON);
						}
						break;
					case SEMICOLON:
						{
						setState(30);
						match(SEMICOLON);
						}
						break;
					case COMMA:
						{
						setState(31);
						match(COMMA);
						}
						break;
					case DOT:
						{
						setState(32);
						match(DOT);
						}
						break;
					case UNDERSCORE:
						{
						setState(33);
						match(UNDERSCORE);
						}
						break;
					case LBRACE:
						{
						setState(34);
						match(LBRACE);
						}
						break;
					case RBRACE:
						{
						setState(35);
						match(RBRACE);
						}
						break;
					case LE:
						{
						setState(36);
						match(LE);
						}
						break;
					case GE:
						{
						setState(37);
						match(GE);
						}
						break;
					case TRUELIT:
						{
						setState(38);
						match(TRUELIT);
						}
						break;
					case FALSELIT:
						{
						setState(39);
						match(FALSELIT);
						}
						break;
					case NUMBER:
						{
						setState(40);
						match(NUMBER);
						}
						break;
					case UNSIGNED:
						{
						setState(41);
						match(UNSIGNED);
						}
						break;
					case FLOAT:
						{
						setState(42);
						match(FLOAT);
						}
						break;
					case LT:
						{
						setState(43);
						match(LT);
						}
						break;
					case GT:
						{
						setState(44);
						match(GT);
						}
						break;
					case EQUALS:
						{
						setState(45);
						match(EQUALS);
						}
						break;
					case PLUS:
						{
						setState(46);
						match(PLUS);
						}
						break;
					case MINUS:
						{
						setState(47);
						match(MINUS);
						}
						break;
					case AT:
						{
						setState(48);
						match(AT);
						}
						break;
					case DOLLAR:
						{
						setState(49);
						match(DOLLAR);
						}
						break;
					case RBRACKET:
						{
						setState(50);
						match(RBRACKET);
						}
						break;
					case LBRACKET:
						{
						setState(51);
						match(LBRACKET);
						}
						break;
					case STAR:
						{
						setState(52);
						match(STAR);
						}
						break;
					case EXCLAMATION:
						{
						setState(53);
						match(EXCLAMATION);
						}
						break;
					case PERCENT:
						{
						setState(54);
						match(PERCENT);
						}
						break;
					case SLASH:
						{
						setState(55);
						match(SLASH);
						}
						break;
					case CARET:
						{
						setState(56);
						match(CARET);
						}
						break;
					case NEW_LINE:
						{
						setState(57);
						match(NEW_LINE);
						}
						break;
					case INCLUDE:
					case DEFINE:
					case IF_PRE:
					case IFNDEF:
					case IFDEF:
					case PREPROCESSOR_PRAGMA:
						{
						setState(58);
						non_empty_directive_list();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW_LINE) | (1L << INCLUDE) | (1L << DEFINE) | (1L << IF_PRE) | (1L << IFNDEF) | (1L << IFDEF) | (1L << PREPROCESSOR_PRAGMA) | (1L << LPAREN) | (1L << RPAREN) | (1L << IDENT) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << DOLLAR) | (1L << PLUS) | (1L << MINUS) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON) | (1L << LE) | (1L << GE) | (1L << EQUALS) | (1L << EXCLAMATION) | (1L << STAR) | (1L << AT) | (1L << SLASH) | (1L << CARET) | (1L << PERCENT) | (1L << LBRACE) | (1L << RBRACE) | (1L << LT) | (1L << GT) | (1L << DOT) | (1L << NUMBER) | (1L << FLOAT) | (1L << UNSIGNED))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (UNDERSCORE - 85)) | (1L << (TRUELIT - 85)) | (1L << (FALSELIT - 85)) | (1L << (STRING - 85)))) != 0) );
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

	public static class Non_empty_directive_listContext extends ParserRuleContext {
		public List<Define_directiveContext> define_directive() {
			return getRuleContexts(Define_directiveContext.class);
		}
		public Define_directiveContext define_directive(int i) {
			return getRuleContext(Define_directiveContext.class,i);
		}
		public List<Include_directiveContext> include_directive() {
			return getRuleContexts(Include_directiveContext.class);
		}
		public Include_directiveContext include_directive(int i) {
			return getRuleContext(Include_directiveContext.class,i);
		}
		public List<Ifdef_directiveContext> ifdef_directive() {
			return getRuleContexts(Ifdef_directiveContext.class);
		}
		public Ifdef_directiveContext ifdef_directive(int i) {
			return getRuleContext(Ifdef_directiveContext.class,i);
		}
		public List<Pragma_directiveContext> pragma_directive() {
			return getRuleContexts(Pragma_directiveContext.class);
		}
		public Pragma_directiveContext pragma_directive(int i) {
			return getRuleContext(Pragma_directiveContext.class,i);
		}
		public Non_empty_directive_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_empty_directive_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PreprocessorVisitor ) return ((PreprocessorVisitor<? extends T>)visitor).visitNon_empty_directive_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_empty_directive_listContext non_empty_directive_list() throws RecognitionException {
		Non_empty_directive_listContext _localctx = new Non_empty_directive_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_non_empty_directive_list);
		try {
			int _alt;
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(65);
						define_directive();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(68); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case INCLUDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(70);
						include_directive();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(73); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case IF_PRE:
			case IFNDEF:
			case IFDEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(76); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(75);
						ifdef_directive();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(78); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case PREPROCESSOR_PRAGMA:
				enterOuterAlt(_localctx, 4);
				{
				setState(81); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(80);
						pragma_directive();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(83); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Pragma_directiveContext extends ParserRuleContext {
		public TerminalNode PREPROCESSOR_PRAGMA() { return getToken(PreprocessorParser.PREPROCESSOR_PRAGMA, 0); }
		public TerminalNode IDENT() { return getToken(PreprocessorParser.IDENT, 0); }
		public Pragma_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PreprocessorVisitor ) return ((PreprocessorVisitor<? extends T>)visitor).visitPragma_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_directiveContext pragma_directive() throws RecognitionException {
		Pragma_directiveContext _localctx = new Pragma_directiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pragma_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(PREPROCESSOR_PRAGMA);
			setState(88);
			match(IDENT);
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

	public static class Ifdef_directiveContext extends ParserRuleContext {
		public TerminalNode IFNDEF() { return getToken(PreprocessorParser.IFNDEF, 0); }
		public TerminalNode IDENT() { return getToken(PreprocessorParser.IDENT, 0); }
		public Program_textContext program_text() {
			return getRuleContext(Program_textContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(PreprocessorParser.ENDIF, 0); }
		public Else_directiveContext else_directive() {
			return getRuleContext(Else_directiveContext.class,0);
		}
		public TerminalNode IFDEF() { return getToken(PreprocessorParser.IFDEF, 0); }
		public TerminalNode IF_PRE() { return getToken(PreprocessorParser.IF_PRE, 0); }
		public TerminalNode NUMBER() { return getToken(PreprocessorParser.NUMBER, 0); }
		public TerminalNode LPAREN() { return getToken(PreprocessorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PreprocessorParser.RPAREN, 0); }
		public Ifdef_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdef_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PreprocessorVisitor ) return ((PreprocessorVisitor<? extends T>)visitor).visitIfdef_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifdef_directiveContext ifdef_directive() throws RecognitionException {
		Ifdef_directiveContext _localctx = new Ifdef_directiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifdef_directive);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(IFNDEF);
				setState(91);
				match(IDENT);
				setState(92);
				program_text();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(93);
					else_directive();
					}
				}

				setState(96);
				match(ENDIF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(IFDEF);
				setState(99);
				match(IDENT);
				setState(100);
				program_text();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(101);
					else_directive();
					}
				}

				setState(104);
				match(ENDIF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(IF_PRE);
				setState(107);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(108);
				program_text();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(109);
					else_directive();
					}
				}

				setState(112);
				match(ENDIF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(IF_PRE);
				setState(115);
				match(LPAREN);
				setState(116);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(117);
				match(RPAREN);
				setState(118);
				program_text();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(119);
					else_directive();
					}
				}

				setState(122);
				match(ENDIF);
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

	public static class Else_directiveContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PreprocessorParser.ELSE, 0); }
		public Program_textContext program_text() {
			return getRuleContext(Program_textContext.class,0);
		}
		public Else_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PreprocessorVisitor ) return ((PreprocessorVisitor<? extends T>)visitor).visitElse_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_directiveContext else_directive() throws RecognitionException {
		Else_directiveContext _localctx = new Else_directiveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_else_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ELSE);
			setState(127);
			program_text();
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

	public static class Include_directiveContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(PreprocessorParser.INCLUDE, 0); }
		public TerminalNode STRING() { return getToken(PreprocessorParser.STRING, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(PreprocessorParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(PreprocessorParser.NEW_LINE, i);
		}
		public Include_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PreprocessorVisitor ) return ((PreprocessorVisitor<? extends T>)visitor).visitInclude_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Include_directiveContext include_directive() throws RecognitionException {
		Include_directiveContext _localctx = new Include_directiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_include_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(INCLUDE);
			setState(130);
			match(STRING);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					match(NEW_LINE);
					}
					} 
				}
				setState(136);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Define_directiveContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(PreprocessorParser.DEFINE, 0); }
		public Macro_defContext macro_def() {
			return getRuleContext(Macro_defContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(PreprocessorParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(PreprocessorParser.NEW_LINE, i);
		}
		public Define_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_directive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PreprocessorVisitor ) return ((PreprocessorVisitor<? extends T>)visitor).visitDefine_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_directiveContext define_directive() throws RecognitionException {
		Define_directiveContext _localctx = new Define_directiveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_define_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(DEFINE);
			setState(138);
			macro_def();
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					match(NEW_LINE);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Macro_defContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(PreprocessorParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(PreprocessorParser.IDENT, i);
		}
		public TerminalNode LPAREN() { return getToken(PreprocessorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PreprocessorParser.RPAREN, 0); }
		public Macro_bodyContext macro_body() {
			return getRuleContext(Macro_bodyContext.class,0);
		}
		public Macro_argsContext macro_args() {
			return getRuleContext(Macro_argsContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(PreprocessorParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(PreprocessorParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(PreprocessorParser.FLOAT, 0); }
		public Macro_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PreprocessorVisitor ) return ((PreprocessorVisitor<? extends T>)visitor).visitMacro_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_defContext macro_def() throws RecognitionException {
		Macro_defContext _localctx = new Macro_defContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_macro_def);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(IDENT);
				setState(146);
				match(LPAREN);
				setState(147);
				match(RPAREN);
				setState(148);
				macro_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(IDENT);
				setState(150);
				match(LPAREN);
				setState(151);
				macro_args(0);
				setState(152);
				match(RPAREN);
				setState(153);
				macro_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(IDENT);
				setState(157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(156);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENT) | (1L << NUMBER) | (1L << FLOAT))) != 0) || _la==STRING) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
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

	public static class Macro_bodyContext extends ParserRuleContext {
		public TerminalNode MACRO_BODY() { return getToken(PreprocessorParser.MACRO_BODY, 0); }
		public TerminalNode NEW_LINE() { return getToken(PreprocessorParser.NEW_LINE, 0); }
		public List<TerminalNode> IDENT() { return getTokens(PreprocessorParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(PreprocessorParser.IDENT, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(PreprocessorParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PreprocessorParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PreprocessorParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PreprocessorParser.RPAREN, i);
		}
		public List<TerminalNode> STRING() { return getTokens(PreprocessorParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PreprocessorParser.STRING, i);
		}
		public List<TerminalNode> COLON() { return getTokens(PreprocessorParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PreprocessorParser.COLON, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PreprocessorParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PreprocessorParser.SEMICOLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PreprocessorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PreprocessorParser.COMMA, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PreprocessorParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PreprocessorParser.DOT, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(PreprocessorParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(PreprocessorParser.UNDERSCORE, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(PreprocessorParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(PreprocessorParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(PreprocessorParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(PreprocessorParser.RBRACE, i);
		}
		public List<TerminalNode> LE() { return getTokens(PreprocessorParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(PreprocessorParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(PreprocessorParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(PreprocessorParser.GE, i);
		}
		public List<TerminalNode> TRUELIT() { return getTokens(PreprocessorParser.TRUELIT); }
		public TerminalNode TRUELIT(int i) {
			return getToken(PreprocessorParser.TRUELIT, i);
		}
		public List<TerminalNode> FALSELIT() { return getTokens(PreprocessorParser.FALSELIT); }
		public TerminalNode FALSELIT(int i) {
			return getToken(PreprocessorParser.FALSELIT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PreprocessorParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PreprocessorParser.NUMBER, i);
		}
		public List<TerminalNode> UNSIGNED() { return getTokens(PreprocessorParser.UNSIGNED); }
		public TerminalNode UNSIGNED(int i) {
			return getToken(PreprocessorParser.UNSIGNED, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(PreprocessorParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(PreprocessorParser.FLOAT, i);
		}
		public List<TerminalNode> LT() { return getTokens(PreprocessorParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(PreprocessorParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(PreprocessorParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(PreprocessorParser.GT, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(PreprocessorParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(PreprocessorParser.EQUALS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PreprocessorParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PreprocessorParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PreprocessorParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PreprocessorParser.MINUS, i);
		}
		public List<TerminalNode> AT() { return getTokens(PreprocessorParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(PreprocessorParser.AT, i);
		}
		public List<TerminalNode> DOLLAR() { return getTokens(PreprocessorParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(PreprocessorParser.DOLLAR, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(PreprocessorParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(PreprocessorParser.RBRACKET, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(PreprocessorParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(PreprocessorParser.LBRACKET, i);
		}
		public List<TerminalNode> STAR() { return getTokens(PreprocessorParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PreprocessorParser.STAR, i);
		}
		public List<TerminalNode> EXCLAMATION() { return getTokens(PreprocessorParser.EXCLAMATION); }
		public TerminalNode EXCLAMATION(int i) {
			return getToken(PreprocessorParser.EXCLAMATION, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(PreprocessorParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(PreprocessorParser.PERCENT, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(PreprocessorParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(PreprocessorParser.SLASH, i);
		}
		public List<TerminalNode> BACKSLASH() { return getTokens(PreprocessorParser.BACKSLASH); }
		public TerminalNode BACKSLASH(int i) {
			return getToken(PreprocessorParser.BACKSLASH, i);
		}
		public List<TerminalNode> CARET() { return getTokens(PreprocessorParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(PreprocessorParser.CARET, i);
		}
		public Macro_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PreprocessorVisitor ) return ((PreprocessorVisitor<? extends T>)visitor).visitMacro_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_bodyContext macro_body() throws RecognitionException {
		Macro_bodyContext _localctx = new Macro_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_macro_body);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MACRO_BODY:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(MACRO_BODY);
				}
				break;
			case NEW_LINE:
			case LPAREN:
			case RPAREN:
			case BACKSLASH:
			case IDENT:
			case LBRACKET:
			case RBRACKET:
			case DOLLAR:
			case PLUS:
			case MINUS:
			case COMMA:
			case COLON:
			case SEMICOLON:
			case LE:
			case GE:
			case EQUALS:
			case EXCLAMATION:
			case STAR:
			case AT:
			case SLASH:
			case CARET:
			case PERCENT:
			case LBRACE:
			case RBRACE:
			case LT:
			case GT:
			case DOT:
			case NUMBER:
			case FLOAT:
			case UNSIGNED:
			case UNDERSCORE:
			case TRUELIT:
			case FALSELIT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << RPAREN) | (1L << BACKSLASH) | (1L << IDENT) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << DOLLAR) | (1L << PLUS) | (1L << MINUS) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON) | (1L << LE) | (1L << GE) | (1L << EQUALS) | (1L << EXCLAMATION) | (1L << STAR) | (1L << AT) | (1L << SLASH) | (1L << CARET) | (1L << PERCENT) | (1L << LBRACE) | (1L << RBRACE) | (1L << LT) | (1L << GT) | (1L << DOT) | (1L << NUMBER) | (1L << FLOAT) | (1L << UNSIGNED))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (UNDERSCORE - 85)) | (1L << (TRUELIT - 85)) | (1L << (FALSELIT - 85)) | (1L << (STRING - 85)))) != 0)) {
					{
					{
					setState(162);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << RPAREN) | (1L << BACKSLASH) | (1L << IDENT) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << DOLLAR) | (1L << PLUS) | (1L << MINUS) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON) | (1L << LE) | (1L << GE) | (1L << EQUALS) | (1L << EXCLAMATION) | (1L << STAR) | (1L << AT) | (1L << SLASH) | (1L << CARET) | (1L << PERCENT) | (1L << LBRACE) | (1L << RBRACE) | (1L << LT) | (1L << GT) | (1L << DOT) | (1L << NUMBER) | (1L << FLOAT) | (1L << UNSIGNED))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (UNDERSCORE - 85)) | (1L << (TRUELIT - 85)) | (1L << (FALSELIT - 85)) | (1L << (STRING - 85)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				match(NEW_LINE);
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

	public static class Macro_argsContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PreprocessorParser.IDENT, 0); }
		public TerminalNode VARARGS() { return getToken(PreprocessorParser.VARARGS, 0); }
		public Macro_argsContext macro_args() {
			return getRuleContext(Macro_argsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PreprocessorParser.COMMA, 0); }
		public Macro_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PreprocessorVisitor ) return ((PreprocessorVisitor<? extends T>)visitor).visitMacro_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_argsContext macro_args() throws RecognitionException {
		return macro_args(0);
	}

	private Macro_argsContext macro_args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Macro_argsContext _localctx = new Macro_argsContext(_ctx, _parentState);
		Macro_argsContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_macro_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(172);
				match(IDENT);
				}
				break;
			case VARARGS:
				{
				setState(173);
				match(VARARGS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Macro_argsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_args);
						setState(176);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(177);
						match(COMMA);
						setState(178);
						match(IDENT);
						}
						break;
					case 2:
						{
						_localctx = new Macro_argsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_args);
						setState(179);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(180);
						match(COMMA);
						setState(181);
						match(VARARGS);
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return macro_args_sempred((Macro_argsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean macro_args_sempred(Macro_argsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001`\u00bc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001<\b"+
		"\u0001\u000b\u0001\f\u0001=\u0003\u0001@\b\u0001\u0001\u0002\u0004\u0002"+
		"C\b\u0002\u000b\u0002\f\u0002D\u0001\u0002\u0004\u0002H\b\u0002\u000b"+
		"\u0002\f\u0002I\u0001\u0002\u0004\u0002M\b\u0002\u000b\u0002\f\u0002N"+
		"\u0001\u0002\u0004\u0002R\b\u0002\u000b\u0002\f\u0002S\u0003\u0002V\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004_\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004g\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004o\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004y\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004}\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0085\b\u0006\n"+
		"\u0006\f\u0006\u0088\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u008d\b\u0007\n\u0007\f\u0007\u0090\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u009e\b\b\u0003\b\u00a0\b\b\u0001\t\u0001\t\u0005\t\u00a4\b"+
		"\t\n\t\f\t\u00a7\t\t\u0001\t\u0003\t\u00aa\b\t\u0001\n\u0001\n\u0001\n"+
		"\u0003\n\u00af\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00b7\b\n\n\n\f\n\u00ba\t\n\u0001\n\u0000\u0001\u0014\u000b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0003\u0002\u0000\u0010"+
		"\u0010::\u0003\u0000\u0010\u0010:;]]\u0007\u0000\r\u0010!(*+-79<UW]]\u00eb"+
		"\u0000\u0016\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000\u0004"+
		"U\u0001\u0000\u0000\u0000\u0006W\u0001\u0000\u0000\u0000\b|\u0001\u0000"+
		"\u0000\u0000\n~\u0001\u0000\u0000\u0000\f\u0081\u0001\u0000\u0000\u0000"+
		"\u000e\u0089\u0001\u0000\u0000\u0000\u0010\u009f\u0001\u0000\u0000\u0000"+
		"\u0012\u00a9\u0001\u0000\u0000\u0000\u0014\u00ae\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0001\u0001\u0000\u0000\u0000"+
		"\u0018@\u0001\u0000\u0000\u0000\u0019<\u0005\u0010\u0000\u0000\u001a<"+
		"\u0005\r\u0000\u0000\u001b<\u0005\u000e\u0000\u0000\u001c<\u0005]\u0000"+
		"\u0000\u001d<\u0005\'\u0000\u0000\u001e<\u0005(\u0000\u0000\u001f<\u0005"+
		"&\u0000\u0000 <\u00059\u0000\u0000!<\u0005U\u0000\u0000\"<\u00054\u0000"+
		"\u0000#<\u00055\u0000\u0000$<\u0005*\u0000\u0000%<\u0005+\u0000\u0000"+
		"&<\u0005V\u0000\u0000\'<\u0005W\u0000\u0000(<\u0005:\u0000\u0000)<\u0005"+
		"<\u0000\u0000*<\u0005;\u0000\u0000+<\u00056\u0000\u0000,<\u00057\u0000"+
		"\u0000-<\u0005-\u0000\u0000.<\u0005$\u0000\u0000/<\u0005%\u0000\u0000"+
		"0<\u00050\u0000\u00001<\u0005#\u0000\u00002<\u0005\"\u0000\u00003<\u0005"+
		"!\u0000\u00004<\u0005/\u0000\u00005<\u0005.\u0000\u00006<\u00053\u0000"+
		"\u00007<\u00051\u0000\u00008<\u00052\u0000\u00009<\u0005\u0001\u0000\u0000"+
		":<\u0003\u0004\u0002\u0000;\u0019\u0001\u0000\u0000\u0000;\u001a\u0001"+
		"\u0000\u0000\u0000;\u001b\u0001\u0000\u0000\u0000;\u001c\u0001\u0000\u0000"+
		"\u0000;\u001d\u0001\u0000\u0000\u0000;\u001e\u0001\u0000\u0000\u0000;"+
		"\u001f\u0001\u0000\u0000\u0000; \u0001\u0000\u0000\u0000;!\u0001\u0000"+
		"\u0000\u0000;\"\u0001\u0000\u0000\u0000;#\u0001\u0000\u0000\u0000;$\u0001"+
		"\u0000\u0000\u0000;%\u0001\u0000\u0000\u0000;&\u0001\u0000\u0000\u0000"+
		";\'\u0001\u0000\u0000\u0000;(\u0001\u0000\u0000\u0000;)\u0001\u0000\u0000"+
		"\u0000;*\u0001\u0000\u0000\u0000;+\u0001\u0000\u0000\u0000;,\u0001\u0000"+
		"\u0000\u0000;-\u0001\u0000\u0000\u0000;.\u0001\u0000\u0000\u0000;/\u0001"+
		"\u0000\u0000\u0000;0\u0001\u0000\u0000\u0000;1\u0001\u0000\u0000\u0000"+
		";2\u0001\u0000\u0000\u0000;3\u0001\u0000\u0000\u0000;4\u0001\u0000\u0000"+
		"\u0000;5\u0001\u0000\u0000\u0000;6\u0001\u0000\u0000\u0000;7\u0001\u0000"+
		"\u0000\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?\u0018\u0001\u0000"+
		"\u0000\u0000?;\u0001\u0000\u0000\u0000@\u0003\u0001\u0000\u0000\u0000"+
		"AC\u0003\u000e\u0007\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EV\u0001\u0000"+
		"\u0000\u0000FH\u0003\f\u0006\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JV\u0001"+
		"\u0000\u0000\u0000KM\u0003\b\u0004\u0000LK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OV\u0001\u0000\u0000\u0000PR\u0003\u0006\u0003\u0000QP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TV\u0001\u0000\u0000\u0000UB\u0001\u0000\u0000\u0000UG\u0001"+
		"\u0000\u0000\u0000UL\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000"+
		"V\u0005\u0001\u0000\u0000\u0000WX\u0005\n\u0000\u0000XY\u0005\u0010\u0000"+
		"\u0000Y\u0007\u0001\u0000\u0000\u0000Z[\u0005\u0007\u0000\u0000[\\\u0005"+
		"\u0010\u0000\u0000\\^\u0003\u0002\u0001\u0000]_\u0003\n\u0005\u0000^]"+
		"\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`a\u0005\t\u0000\u0000a}\u0001\u0000\u0000\u0000bc\u0005\b\u0000"+
		"\u0000cd\u0005\u0010\u0000\u0000df\u0003\u0002\u0001\u0000eg\u0003\n\u0005"+
		"\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hi\u0005\t\u0000\u0000i}\u0001\u0000\u0000\u0000jk\u0005\u0005"+
		"\u0000\u0000kl\u0007\u0000\u0000\u0000ln\u0003\u0002\u0001\u0000mo\u0003"+
		"\n\u0005\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pq\u0005\t\u0000\u0000q}\u0001\u0000\u0000\u0000rs\u0005"+
		"\u0005\u0000\u0000st\u0005\r\u0000\u0000tu\u0007\u0000\u0000\u0000uv\u0005"+
		"\u000e\u0000\u0000vx\u0003\u0002\u0001\u0000wy\u0003\n\u0005\u0000xw\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z{\u0005\t\u0000\u0000{}\u0001\u0000\u0000\u0000|Z\u0001\u0000\u0000\u0000"+
		"|b\u0001\u0000\u0000\u0000|j\u0001\u0000\u0000\u0000|r\u0001\u0000\u0000"+
		"\u0000}\t\u0001\u0000\u0000\u0000~\u007f\u0005\u0006\u0000\u0000\u007f"+
		"\u0080\u0003\u0002\u0001\u0000\u0080\u000b\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0005\u0003\u0000\u0000\u0082\u0086\u0005]\u0000\u0000\u0083\u0085"+
		"\u0005\u0001\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0088"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\r\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\u0004\u0000\u0000\u008a\u008e\u0003"+
		"\u0010\b\u0000\u008b\u008d\u0005\u0001\u0000\u0000\u008c\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u000f\u0001\u0000"+
		"\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0010"+
		"\u0000\u0000\u0092\u0093\u0005\r\u0000\u0000\u0093\u0094\u0005\u000e\u0000"+
		"\u0000\u0094\u00a0\u0003\u0012\t\u0000\u0095\u0096\u0005\u0010\u0000\u0000"+
		"\u0096\u0097\u0005\r\u0000\u0000\u0097\u0098\u0003\u0014\n\u0000\u0098"+
		"\u0099\u0005\u000e\u0000\u0000\u0099\u009a\u0003\u0012\t\u0000\u009a\u00a0"+
		"\u0001\u0000\u0000\u0000\u009b\u009d\u0005\u0010\u0000\u0000\u009c\u009e"+
		"\u0007\u0001\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u0091"+
		"\u0001\u0000\u0000\u0000\u009f\u0095\u0001\u0000\u0000\u0000\u009f\u009b"+
		"\u0001\u0000\u0000\u0000\u00a0\u0011\u0001\u0000\u0000\u0000\u00a1\u00aa"+
		"\u0005\f\u0000\u0000\u00a2\u00a4\u0007\u0002\u0000\u0000\u00a3\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00aa\u0005"+
		"\u0001\u0000\u0000\u00a9\u00a1\u0001\u0000\u0000\u0000\u00a9\u00a5\u0001"+
		"\u0000\u0000\u0000\u00aa\u0013\u0001\u0000\u0000\u0000\u00ab\u00ac\u0006"+
		"\n\uffff\uffff\u0000\u00ac\u00af\u0005\u0010\u0000\u0000\u00ad\u00af\u0005"+
		"\u0011\u0000\u0000\u00ae\u00ab\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b8\u0001\u0000\u0000\u0000\u00b0\u00b1\n\u0002"+
		"\u0000\u0000\u00b1\u00b2\u0005&\u0000\u0000\u00b2\u00b7\u0005\u0010\u0000"+
		"\u0000\u00b3\u00b4\n\u0001\u0000\u0000\u00b4\u00b5\u0005&\u0000\u0000"+
		"\u00b5\u00b7\u0005\u0011\u0000\u0000\u00b6\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u0015\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u0016;=?DINSU^fnx|\u0086\u008e\u009d\u009f\u00a5\u00a9\u00ae\u00b6\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}