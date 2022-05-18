// Generated from /home/john/IdeaProjects/Souffle_Ide_Plugin/grammar/Preprocessor.g4 by ANTLR 4.10.1
package preprocessor;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PreprocessorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEW_LINE=1, WS=2, INCLUDE=3, DEFINE=4, IF_PRE=5, ELSE=6, IFNDEF=7, IFDEF=8, 
		ENDIF=9, MACRO_BODY=10, LPAREN=11, RPAREN=12, BACKSLASH=13, IDENT=14, 
		DECL=15, FUNCTOR=16, INPUT_DECL=17, OUTPUT_DECL=18, PRINTSIZE_DECL=19, 
		LIMITSIZE_DECL=20, TYPE=21, COMPONENT=22, INSTANTIATE=23, NUMBER_TYPE=24, 
		SYMBOL_TYPE=25, OVERRIDE=26, PRAGMA=27, PLAN=28, PIPE=29, LBRACKET=30, 
		RBRACKET=31, DOLLAR=32, PLUS=33, MINUS=34, COMMA=35, COLON=36, SEMICOLON=37, 
		SUBTYPE=38, LE=39, GE=40, NE=41, EQUALS=42, EXCLAMATION=43, STAR=44, AT=45, 
		SLASH=46, CARET=47, PERCENT=48, LBRACE=49, RBRACE=50, LT=51, GT=52, IF=53, 
		DOT=54, NUMBER=55, FLOAT=56, UNSIGNED=57, AUTOINC=58, BW_AND=59, BW_OR=60, 
		BW_XOR=61, BW_NOT=62, BW_SHIFT_L=63, BW_SHIFT_R=64, BW_SHIFT_R_UNSIGNED=65, 
		L_AND=66, L_OR=67, L_XOR=68, L_NOT=69, OUTPUT_QUALIFIER=70, INPUT_QUALIFIER=71, 
		OVERRIDABLE_QUALIFIER=72, PRINTSIZE_QUALIFIER=73, EQREL_QUALIFIER=74, 
		INLINE_QUALIFIER=75, NO_INLINE_QUALIFIER=76, MAGIC_QUALIFIER=77, NO_MAGIC_QUALIFIER=78, 
		BRIE_QUALIFIER=79, BTREE_DELETE_QUALIFIER=80, BTREE_QUALIFIER=81, UNDERSCORE=82, 
		TRUELIT=83, FALSELIT=84, TOFLOAT=85, TONUMBER=86, TOSTRING=87, TOUNSIGNED=88, 
		CHOICEDOMAIN=89, STRING=90, COMMENT=91, LINE_COMMENT=92, ANY_TEXT=93;
	public static final int
		RULE_program = 0, RULE_program_text = 1, RULE_non_empty_directive_list = 2, 
		RULE_ifdef_directive = 3, RULE_include_directive = 4, RULE_define_directive = 5, 
		RULE_macro_def = 6, RULE_macro_body = 7, RULE_macro_args = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program_text", "non_empty_directive_list", "ifdef_directive", 
			"include_directive", "define_directive", "macro_def", "macro_body", "macro_args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'#include'", "'#define'", "'#if'", "'#else'", "'#ifndef'", 
			"'#ifdef'", "'#endif'", null, "'('", "')'", "'\\'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'|'", "'['", "']'", "'$'", "'+'", "'-'", "','", "':'", "';'", "'<:'", 
			"'<='", "'>='", "'!='", "'='", "'!'", "'*'", "'@'", "'/'", "'^'", "'%'", 
			"'{'", "'}'", "'<'", "'>'", "':-'", "'.'", null, null, null, "'autoinc'", 
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
			"IFDEF", "ENDIF", "MACRO_BODY", "LPAREN", "RPAREN", "BACKSLASH", "IDENT", 
			"DECL", "FUNCTOR", "INPUT_DECL", "OUTPUT_DECL", "PRINTSIZE_DECL", "LIMITSIZE_DECL", 
			"TYPE", "COMPONENT", "INSTANTIATE", "NUMBER_TYPE", "SYMBOL_TYPE", "OVERRIDE", 
			"PRAGMA", "PLAN", "PIPE", "LBRACKET", "RBRACKET", "DOLLAR", "PLUS", "MINUS", 
			"COMMA", "COLON", "SEMICOLON", "SUBTYPE", "LE", "GE", "NE", "EQUALS", 
			"EXCLAMATION", "STAR", "AT", "SLASH", "CARET", "PERCENT", "LBRACE", "RBRACE", 
			"LT", "GT", "IF", "DOT", "NUMBER", "FLOAT", "UNSIGNED", "AUTOINC", "BW_AND", 
			"BW_OR", "BW_XOR", "BW_NOT", "BW_SHIFT_L", "BW_SHIFT_R", "BW_SHIFT_R_UNSIGNED", 
			"L_AND", "L_OR", "L_XOR", "L_NOT", "OUTPUT_QUALIFIER", "INPUT_QUALIFIER", 
			"OVERRIDABLE_QUALIFIER", "PRINTSIZE_QUALIFIER", "EQREL_QUALIFIER", "INLINE_QUALIFIER", 
			"NO_INLINE_QUALIFIER", "MAGIC_QUALIFIER", "NO_MAGIC_QUALIFIER", "BRIE_QUALIFIER", 
			"BTREE_DELETE_QUALIFIER", "BTREE_QUALIFIER", "UNDERSCORE", "TRUELIT", 
			"FALSELIT", "TOFLOAT", "TONUMBER", "TOSTRING", "TOUNSIGNED", "CHOICEDOMAIN", 
			"STRING", "COMMENT", "LINE_COMMENT", "ANY_TEXT"
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
		public TerminalNode EOF() { return getToken(PreprocessorParser.EOF, 0); }
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
			setState(18);
			program_text();
			setState(19);
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
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case NEW_LINE:
			case INCLUDE:
			case DEFINE:
			case IF_PRE:
			case ELSE:
			case IFNDEF:
			case IFDEF:
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
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(56);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENT:
						{
						setState(22);
						match(IDENT);
						}
						break;
					case LPAREN:
						{
						setState(23);
						match(LPAREN);
						}
						break;
					case RPAREN:
						{
						setState(24);
						match(RPAREN);
						}
						break;
					case STRING:
						{
						setState(25);
						match(STRING);
						}
						break;
					case COLON:
						{
						setState(26);
						match(COLON);
						}
						break;
					case SEMICOLON:
						{
						setState(27);
						match(SEMICOLON);
						}
						break;
					case COMMA:
						{
						setState(28);
						match(COMMA);
						}
						break;
					case DOT:
						{
						setState(29);
						match(DOT);
						}
						break;
					case UNDERSCORE:
						{
						setState(30);
						match(UNDERSCORE);
						}
						break;
					case LBRACE:
						{
						setState(31);
						match(LBRACE);
						}
						break;
					case RBRACE:
						{
						setState(32);
						match(RBRACE);
						}
						break;
					case LE:
						{
						setState(33);
						match(LE);
						}
						break;
					case GE:
						{
						setState(34);
						match(GE);
						}
						break;
					case TRUELIT:
						{
						setState(35);
						match(TRUELIT);
						}
						break;
					case FALSELIT:
						{
						setState(36);
						match(FALSELIT);
						}
						break;
					case NUMBER:
						{
						setState(37);
						match(NUMBER);
						}
						break;
					case UNSIGNED:
						{
						setState(38);
						match(UNSIGNED);
						}
						break;
					case FLOAT:
						{
						setState(39);
						match(FLOAT);
						}
						break;
					case LT:
						{
						setState(40);
						match(LT);
						}
						break;
					case GT:
						{
						setState(41);
						match(GT);
						}
						break;
					case EQUALS:
						{
						setState(42);
						match(EQUALS);
						}
						break;
					case PLUS:
						{
						setState(43);
						match(PLUS);
						}
						break;
					case MINUS:
						{
						setState(44);
						match(MINUS);
						}
						break;
					case AT:
						{
						setState(45);
						match(AT);
						}
						break;
					case DOLLAR:
						{
						setState(46);
						match(DOLLAR);
						}
						break;
					case RBRACKET:
						{
						setState(47);
						match(RBRACKET);
						}
						break;
					case LBRACKET:
						{
						setState(48);
						match(LBRACKET);
						}
						break;
					case STAR:
						{
						setState(49);
						match(STAR);
						}
						break;
					case EXCLAMATION:
						{
						setState(50);
						match(EXCLAMATION);
						}
						break;
					case PERCENT:
						{
						setState(51);
						match(PERCENT);
						}
						break;
					case SLASH:
						{
						setState(52);
						match(SLASH);
						}
						break;
					case CARET:
						{
						setState(53);
						match(CARET);
						}
						break;
					case NEW_LINE:
						{
						setState(54);
						match(NEW_LINE);
						}
						break;
					case INCLUDE:
					case DEFINE:
					case IF_PRE:
					case ELSE:
					case IFNDEF:
					case IFDEF:
						{
						setState(55);
						non_empty_directive_list();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW_LINE) | (1L << INCLUDE) | (1L << DEFINE) | (1L << IF_PRE) | (1L << ELSE) | (1L << IFNDEF) | (1L << IFDEF) | (1L << LPAREN) | (1L << RPAREN) | (1L << IDENT) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << DOLLAR) | (1L << PLUS) | (1L << MINUS) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON) | (1L << LE) | (1L << GE) | (1L << EQUALS) | (1L << EXCLAMATION) | (1L << STAR) | (1L << AT) | (1L << SLASH) | (1L << CARET) | (1L << PERCENT) | (1L << LBRACE) | (1L << RBRACE) | (1L << LT) | (1L << GT) | (1L << DOT) | (1L << NUMBER) | (1L << FLOAT) | (1L << UNSIGNED))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (UNDERSCORE - 82)) | (1L << (TRUELIT - 82)) | (1L << (FALSELIT - 82)) | (1L << (STRING - 82)))) != 0) );
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(62);
						define_directive();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(65); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case INCLUDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(67);
						include_directive();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(70); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case IF_PRE:
			case ELSE:
			case IFNDEF:
			case IFDEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(73); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(72);
						ifdef_directive();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(75); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Ifdef_directiveContext extends ParserRuleContext {
		public TerminalNode IFNDEF() { return getToken(PreprocessorParser.IFNDEF, 0); }
		public TerminalNode IDENT() { return getToken(PreprocessorParser.IDENT, 0); }
		public Program_textContext program_text() {
			return getRuleContext(Program_textContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(PreprocessorParser.ENDIF, 0); }
		public TerminalNode IFDEF() { return getToken(PreprocessorParser.IFDEF, 0); }
		public TerminalNode IF_PRE() { return getToken(PreprocessorParser.IF_PRE, 0); }
		public TerminalNode ELSE() { return getToken(PreprocessorParser.ELSE, 0); }
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
		enterRule(_localctx, 6, RULE_ifdef_directive);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFNDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(IFNDEF);
				setState(80);
				match(IDENT);
				setState(81);
				program_text();
				setState(82);
				match(ENDIF);
				}
				break;
			case IFDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(IFDEF);
				setState(85);
				match(IDENT);
				setState(86);
				program_text();
				setState(87);
				match(ENDIF);
				}
				break;
			case IF_PRE:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(IF_PRE);
				setState(90);
				match(IDENT);
				setState(91);
				program_text();
				setState(92);
				match(ENDIF);
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(ELSE);
				setState(95);
				program_text();
				setState(96);
				match(ENDIF);
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
		enterRule(_localctx, 8, RULE_include_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(INCLUDE);
			setState(101);
			match(STRING);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					match(NEW_LINE);
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 10, RULE_define_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(DEFINE);
			setState(109);
			macro_def();
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					match(NEW_LINE);
					}
					} 
				}
				setState(115);
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
		enterRule(_localctx, 12, RULE_macro_def);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(IDENT);
				setState(117);
				match(LPAREN);
				setState(118);
				match(RPAREN);
				setState(119);
				macro_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(IDENT);
				setState(121);
				match(LPAREN);
				setState(122);
				macro_args(0);
				setState(123);
				match(RPAREN);
				setState(124);
				macro_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(IDENT);
				setState(127);
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
		enterRule(_localctx, 14, RULE_macro_body);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MACRO_BODY:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(MACRO_BODY);
				}
				break;
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
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << RPAREN) | (1L << IDENT) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << DOLLAR) | (1L << PLUS) | (1L << MINUS) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON) | (1L << LE) | (1L << GE) | (1L << EQUALS) | (1L << EXCLAMATION) | (1L << STAR) | (1L << AT) | (1L << SLASH) | (1L << CARET) | (1L << PERCENT) | (1L << LBRACE) | (1L << RBRACE) | (1L << LT) | (1L << GT) | (1L << DOT) | (1L << NUMBER) | (1L << FLOAT) | (1L << UNSIGNED))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (UNDERSCORE - 82)) | (1L << (TRUELIT - 82)) | (1L << (FALSELIT - 82)) | (1L << (STRING - 82)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << RPAREN) | (1L << IDENT) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << DOLLAR) | (1L << PLUS) | (1L << MINUS) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON) | (1L << LE) | (1L << GE) | (1L << EQUALS) | (1L << EXCLAMATION) | (1L << STAR) | (1L << AT) | (1L << SLASH) | (1L << CARET) | (1L << PERCENT) | (1L << LBRACE) | (1L << RBRACE) | (1L << LT) | (1L << GT) | (1L << DOT) | (1L << NUMBER) | (1L << FLOAT) | (1L << UNSIGNED))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (UNDERSCORE - 82)) | (1L << (TRUELIT - 82)) | (1L << (FALSELIT - 82)) | (1L << (STRING - 82)))) != 0) );
				setState(136);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_macro_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(140);
			match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Macro_argsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_macro_args);
					setState(142);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(143);
					match(COMMA);
					setState(144);
					match(IDENT);
					}
					} 
				}
				setState(149);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return macro_args_sempred((Macro_argsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean macro_args_sempred(Macro_argsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001]\u0097\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u00019\b\u0001\u000b\u0001"+
		"\f\u0001:\u0003\u0001=\b\u0001\u0001\u0002\u0004\u0002@\b\u0002\u000b"+
		"\u0002\f\u0002A\u0001\u0002\u0004\u0002E\b\u0002\u000b\u0002\f\u0002F"+
		"\u0001\u0002\u0004\u0002J\b\u0002\u000b\u0002\f\u0002K\u0003\u0002N\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003c\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004h\b\u0004\n\u0004\f\u0004k\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005p\b\u0005\n\u0005\f\u0005s\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0081\b\u0006\u0001\u0007\u0001\u0007\u0004\u0007\u0085\b\u0007"+
		"\u000b\u0007\f\u0007\u0086\u0001\u0007\u0003\u0007\u008a\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0092\b\b\n\b\f\b\u0095"+
		"\t\b\u0001\b\u0000\u0001\u0010\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0000\u0002\u0003\u0000\u000e\u000e78ZZ\b\u0000\u000b\f\u000e\u000e\u001e"+
		"%\'(*469RTZZ\u00bf\u0000\u0012\u0001\u0000\u0000\u0000\u0002<\u0001\u0000"+
		"\u0000\u0000\u0004M\u0001\u0000\u0000\u0000\u0006b\u0001\u0000\u0000\u0000"+
		"\bd\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000\u0000\f\u0080\u0001\u0000"+
		"\u0000\u0000\u000e\u0089\u0001\u0000\u0000\u0000\u0010\u008b\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0003\u0002\u0001\u0000\u0013\u0014\u0005\u0000"+
		"\u0000\u0001\u0014\u0001\u0001\u0000\u0000\u0000\u0015=\u0001\u0000\u0000"+
		"\u0000\u00169\u0005\u000e\u0000\u0000\u00179\u0005\u000b\u0000\u0000\u0018"+
		"9\u0005\f\u0000\u0000\u00199\u0005Z\u0000\u0000\u001a9\u0005$\u0000\u0000"+
		"\u001b9\u0005%\u0000\u0000\u001c9\u0005#\u0000\u0000\u001d9\u00056\u0000"+
		"\u0000\u001e9\u0005R\u0000\u0000\u001f9\u00051\u0000\u0000 9\u00052\u0000"+
		"\u0000!9\u0005\'\u0000\u0000\"9\u0005(\u0000\u0000#9\u0005S\u0000\u0000"+
		"$9\u0005T\u0000\u0000%9\u00057\u0000\u0000&9\u00059\u0000\u0000\'9\u0005"+
		"8\u0000\u0000(9\u00053\u0000\u0000)9\u00054\u0000\u0000*9\u0005*\u0000"+
		"\u0000+9\u0005!\u0000\u0000,9\u0005\"\u0000\u0000-9\u0005-\u0000\u0000"+
		".9\u0005 \u0000\u0000/9\u0005\u001f\u0000\u000009\u0005\u001e\u0000\u0000"+
		"19\u0005,\u0000\u000029\u0005+\u0000\u000039\u00050\u0000\u000049\u0005"+
		".\u0000\u000059\u0005/\u0000\u000069\u0005\u0001\u0000\u000079\u0003\u0004"+
		"\u0002\u00008\u0016\u0001\u0000\u0000\u00008\u0017\u0001\u0000\u0000\u0000"+
		"8\u0018\u0001\u0000\u0000\u00008\u0019\u0001\u0000\u0000\u00008\u001a"+
		"\u0001\u0000\u0000\u00008\u001b\u0001\u0000\u0000\u00008\u001c\u0001\u0000"+
		"\u0000\u00008\u001d\u0001\u0000\u0000\u00008\u001e\u0001\u0000\u0000\u0000"+
		"8\u001f\u0001\u0000\u0000\u00008 \u0001\u0000\u0000\u00008!\u0001\u0000"+
		"\u0000\u00008\"\u0001\u0000\u0000\u00008#\u0001\u0000\u0000\u00008$\u0001"+
		"\u0000\u0000\u00008%\u0001\u0000\u0000\u00008&\u0001\u0000\u0000\u0000"+
		"8\'\u0001\u0000\u0000\u00008(\u0001\u0000\u0000\u00008)\u0001\u0000\u0000"+
		"\u00008*\u0001\u0000\u0000\u00008+\u0001\u0000\u0000\u00008,\u0001\u0000"+
		"\u0000\u00008-\u0001\u0000\u0000\u00008.\u0001\u0000\u0000\u00008/\u0001"+
		"\u0000\u0000\u000080\u0001\u0000\u0000\u000081\u0001\u0000\u0000\u0000"+
		"82\u0001\u0000\u0000\u000083\u0001\u0000\u0000\u000084\u0001\u0000\u0000"+
		"\u000085\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000087\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<\u0015\u0001\u0000\u0000"+
		"\u0000<8\u0001\u0000\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>@\u0003"+
		"\n\u0005\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BN\u0001\u0000\u0000\u0000"+
		"CE\u0003\b\u0004\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GN\u0001\u0000\u0000"+
		"\u0000HJ\u0003\u0006\u0003\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001"+
		"\u0000\u0000\u0000M?\u0001\u0000\u0000\u0000MD\u0001\u0000\u0000\u0000"+
		"MI\u0001\u0000\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OP\u0005\u0007"+
		"\u0000\u0000PQ\u0005\u000e\u0000\u0000QR\u0003\u0002\u0001\u0000RS\u0005"+
		"\t\u0000\u0000Sc\u0001\u0000\u0000\u0000TU\u0005\b\u0000\u0000UV\u0005"+
		"\u000e\u0000\u0000VW\u0003\u0002\u0001\u0000WX\u0005\t\u0000\u0000Xc\u0001"+
		"\u0000\u0000\u0000YZ\u0005\u0005\u0000\u0000Z[\u0005\u000e\u0000\u0000"+
		"[\\\u0003\u0002\u0001\u0000\\]\u0005\t\u0000\u0000]c\u0001\u0000\u0000"+
		"\u0000^_\u0005\u0006\u0000\u0000_`\u0003\u0002\u0001\u0000`a\u0005\t\u0000"+
		"\u0000ac\u0001\u0000\u0000\u0000bO\u0001\u0000\u0000\u0000bT\u0001\u0000"+
		"\u0000\u0000bY\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000c\u0007"+
		"\u0001\u0000\u0000\u0000de\u0005\u0003\u0000\u0000ei\u0005Z\u0000\u0000"+
		"fh\u0005\u0001\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\t\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\u0004\u0000\u0000mq\u0003"+
		"\f\u0006\u0000np\u0005\u0001\u0000\u0000on\u0001\u0000\u0000\u0000ps\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"r\u000b\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005\u000e"+
		"\u0000\u0000uv\u0005\u000b\u0000\u0000vw\u0005\f\u0000\u0000w\u0081\u0003"+
		"\u000e\u0007\u0000xy\u0005\u000e\u0000\u0000yz\u0005\u000b\u0000\u0000"+
		"z{\u0003\u0010\b\u0000{|\u0005\f\u0000\u0000|}\u0003\u000e\u0007\u0000"+
		"}\u0081\u0001\u0000\u0000\u0000~\u007f\u0005\u000e\u0000\u0000\u007f\u0081"+
		"\u0007\u0000\u0000\u0000\u0080t\u0001\u0000\u0000\u0000\u0080x\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\r\u0001\u0000\u0000"+
		"\u0000\u0082\u008a\u0005\n\u0000\u0000\u0083\u0085\u0007\u0001\u0000\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0005\u0001\u0000\u0000"+
		"\u0089\u0082\u0001\u0000\u0000\u0000\u0089\u0084\u0001\u0000\u0000\u0000"+
		"\u008a\u000f\u0001\u0000\u0000\u0000\u008b\u008c\u0006\b\uffff\uffff\u0000"+
		"\u008c\u008d\u0005\u000e\u0000\u0000\u008d\u0093\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\n\u0001\u0000\u0000\u008f\u0090\u0005#\u0000\u0000\u0090"+
		"\u0092\u0005\u000e\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0092"+
		"\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0011\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u000e8:<AFKMbiq\u0080\u0086\u0089\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}