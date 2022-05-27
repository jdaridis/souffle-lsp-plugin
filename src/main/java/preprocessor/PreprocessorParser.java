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
		ENDIF=9, PREPROCESSOR_PRAGMA=10, MACRO_BODY=11, LPAREN=12, RPAREN=13, 
		BACKSLASH=14, IDENT=15, DECL=16, FUNCTOR=17, INPUT_DECL=18, OUTPUT_DECL=19, 
		PRINTSIZE_DECL=20, LIMITSIZE_DECL=21, TYPE=22, COMPONENT=23, INSTANTIATE=24, 
		NUMBER_TYPE=25, SYMBOL_TYPE=26, OVERRIDE=27, PRAGMA=28, PLAN=29, PIPE=30, 
		LBRACKET=31, RBRACKET=32, DOLLAR=33, PLUS=34, MINUS=35, COMMA=36, COLON=37, 
		SEMICOLON=38, SUBTYPE=39, LE=40, GE=41, NE=42, EQUALS=43, EXCLAMATION=44, 
		STAR=45, AT=46, SLASH=47, CARET=48, PERCENT=49, LBRACE=50, RBRACE=51, 
		LT=52, GT=53, IF=54, DOT=55, NUMBER=56, FLOAT=57, UNSIGNED=58, AUTOINC=59, 
		BW_AND=60, BW_OR=61, BW_XOR=62, BW_NOT=63, BW_SHIFT_L=64, BW_SHIFT_R=65, 
		BW_SHIFT_R_UNSIGNED=66, L_AND=67, L_OR=68, L_XOR=69, L_NOT=70, OUTPUT_QUALIFIER=71, 
		INPUT_QUALIFIER=72, OVERRIDABLE_QUALIFIER=73, PRINTSIZE_QUALIFIER=74, 
		EQREL_QUALIFIER=75, INLINE_QUALIFIER=76, NO_INLINE_QUALIFIER=77, MAGIC_QUALIFIER=78, 
		NO_MAGIC_QUALIFIER=79, BRIE_QUALIFIER=80, BTREE_DELETE_QUALIFIER=81, BTREE_QUALIFIER=82, 
		UNDERSCORE=83, TRUELIT=84, FALSELIT=85, TOFLOAT=86, TONUMBER=87, TOSTRING=88, 
		TOUNSIGNED=89, CHOICEDOMAIN=90, STRING=91, COMMENT=92, LINE_COMMENT=93, 
		ANY_TEXT=94;
	public static final int
		RULE_program = 0, RULE_program_text = 1, RULE_non_empty_directive_list = 2, 
		RULE_pragma_directive = 3, RULE_ifdef_directive = 4, RULE_include_directive = 5, 
		RULE_define_directive = 6, RULE_macro_def = 7, RULE_macro_body = 8, RULE_macro_args = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program_text", "non_empty_directive_list", "pragma_directive", 
			"ifdef_directive", "include_directive", "define_directive", "macro_def", 
			"macro_body", "macro_args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'#include'", "'#define'", "'#if'", "'#else'", "'#ifndef'", 
			"'#ifdef'", "'#endif'", "'#pragma'", null, "'('", "')'", "'\\'", null, 
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
			"IFDEF", "ENDIF", "PREPROCESSOR_PRAGMA", "MACRO_BODY", "LPAREN", "RPAREN", 
			"BACKSLASH", "IDENT", "DECL", "FUNCTOR", "INPUT_DECL", "OUTPUT_DECL", 
			"PRINTSIZE_DECL", "LIMITSIZE_DECL", "TYPE", "COMPONENT", "INSTANTIATE", 
			"NUMBER_TYPE", "SYMBOL_TYPE", "OVERRIDE", "PRAGMA", "PLAN", "PIPE", "LBRACKET", 
			"RBRACKET", "DOLLAR", "PLUS", "MINUS", "COMMA", "COLON", "SEMICOLON", 
			"SUBTYPE", "LE", "GE", "NE", "EQUALS", "EXCLAMATION", "STAR", "AT", "SLASH", 
			"CARET", "PERCENT", "LBRACE", "RBRACE", "LT", "GT", "IF", "DOT", "NUMBER", 
			"FLOAT", "UNSIGNED", "AUTOINC", "BW_AND", "BW_OR", "BW_XOR", "BW_NOT", 
			"BW_SHIFT_L", "BW_SHIFT_R", "BW_SHIFT_R_UNSIGNED", "L_AND", "L_OR", "L_XOR", 
			"L_NOT", "OUTPUT_QUALIFIER", "INPUT_QUALIFIER", "OVERRIDABLE_QUALIFIER", 
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
			setState(20);
			program_text();
			setState(21);
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
			setState(62);
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
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(58);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENT:
						{
						setState(24);
						match(IDENT);
						}
						break;
					case LPAREN:
						{
						setState(25);
						match(LPAREN);
						}
						break;
					case RPAREN:
						{
						setState(26);
						match(RPAREN);
						}
						break;
					case STRING:
						{
						setState(27);
						match(STRING);
						}
						break;
					case COLON:
						{
						setState(28);
						match(COLON);
						}
						break;
					case SEMICOLON:
						{
						setState(29);
						match(SEMICOLON);
						}
						break;
					case COMMA:
						{
						setState(30);
						match(COMMA);
						}
						break;
					case DOT:
						{
						setState(31);
						match(DOT);
						}
						break;
					case UNDERSCORE:
						{
						setState(32);
						match(UNDERSCORE);
						}
						break;
					case LBRACE:
						{
						setState(33);
						match(LBRACE);
						}
						break;
					case RBRACE:
						{
						setState(34);
						match(RBRACE);
						}
						break;
					case LE:
						{
						setState(35);
						match(LE);
						}
						break;
					case GE:
						{
						setState(36);
						match(GE);
						}
						break;
					case TRUELIT:
						{
						setState(37);
						match(TRUELIT);
						}
						break;
					case FALSELIT:
						{
						setState(38);
						match(FALSELIT);
						}
						break;
					case NUMBER:
						{
						setState(39);
						match(NUMBER);
						}
						break;
					case UNSIGNED:
						{
						setState(40);
						match(UNSIGNED);
						}
						break;
					case FLOAT:
						{
						setState(41);
						match(FLOAT);
						}
						break;
					case LT:
						{
						setState(42);
						match(LT);
						}
						break;
					case GT:
						{
						setState(43);
						match(GT);
						}
						break;
					case EQUALS:
						{
						setState(44);
						match(EQUALS);
						}
						break;
					case PLUS:
						{
						setState(45);
						match(PLUS);
						}
						break;
					case MINUS:
						{
						setState(46);
						match(MINUS);
						}
						break;
					case AT:
						{
						setState(47);
						match(AT);
						}
						break;
					case DOLLAR:
						{
						setState(48);
						match(DOLLAR);
						}
						break;
					case RBRACKET:
						{
						setState(49);
						match(RBRACKET);
						}
						break;
					case LBRACKET:
						{
						setState(50);
						match(LBRACKET);
						}
						break;
					case STAR:
						{
						setState(51);
						match(STAR);
						}
						break;
					case EXCLAMATION:
						{
						setState(52);
						match(EXCLAMATION);
						}
						break;
					case PERCENT:
						{
						setState(53);
						match(PERCENT);
						}
						break;
					case SLASH:
						{
						setState(54);
						match(SLASH);
						}
						break;
					case CARET:
						{
						setState(55);
						match(CARET);
						}
						break;
					case NEW_LINE:
						{
						setState(56);
						match(NEW_LINE);
						}
						break;
					case INCLUDE:
					case DEFINE:
					case IF_PRE:
					case ELSE:
					case IFNDEF:
					case IFDEF:
					case PREPROCESSOR_PRAGMA:
						{
						setState(57);
						non_empty_directive_list();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW_LINE) | (1L << INCLUDE) | (1L << DEFINE) | (1L << IF_PRE) | (1L << ELSE) | (1L << IFNDEF) | (1L << IFDEF) | (1L << PREPROCESSOR_PRAGMA) | (1L << LPAREN) | (1L << RPAREN) | (1L << IDENT) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << DOLLAR) | (1L << PLUS) | (1L << MINUS) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON) | (1L << LE) | (1L << GE) | (1L << EQUALS) | (1L << EXCLAMATION) | (1L << STAR) | (1L << AT) | (1L << SLASH) | (1L << CARET) | (1L << PERCENT) | (1L << LBRACE) | (1L << RBRACE) | (1L << LT) | (1L << GT) | (1L << DOT) | (1L << NUMBER) | (1L << FLOAT) | (1L << UNSIGNED))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (UNDERSCORE - 83)) | (1L << (TRUELIT - 83)) | (1L << (FALSELIT - 83)) | (1L << (STRING - 83)))) != 0) );
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
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(64);
						define_directive();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(67); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case INCLUDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(69);
						include_directive();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(72); 
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
				setState(75); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(74);
						ifdef_directive();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(77); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case PREPROCESSOR_PRAGMA:
				enterOuterAlt(_localctx, 4);
				{
				setState(80); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(79);
						pragma_directive();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(82); 
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
			setState(86);
			match(PREPROCESSOR_PRAGMA);
			setState(87);
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
		enterRule(_localctx, 8, RULE_ifdef_directive);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFNDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(IFNDEF);
				setState(90);
				match(IDENT);
				setState(91);
				program_text();
				setState(92);
				match(ENDIF);
				}
				break;
			case IFDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(IFDEF);
				setState(95);
				match(IDENT);
				setState(96);
				program_text();
				setState(97);
				match(ENDIF);
				}
				break;
			case IF_PRE:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(IF_PRE);
				setState(100);
				match(IDENT);
				setState(101);
				program_text();
				setState(102);
				match(ENDIF);
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(ELSE);
				setState(105);
				program_text();
				setState(106);
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
		enterRule(_localctx, 10, RULE_include_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(INCLUDE);
			setState(111);
			match(STRING);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					match(NEW_LINE);
					}
					} 
				}
				setState(117);
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
		enterRule(_localctx, 12, RULE_define_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(DEFINE);
			setState(119);
			macro_def();
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					match(NEW_LINE);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 14, RULE_macro_def);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(IDENT);
				setState(127);
				match(LPAREN);
				setState(128);
				match(RPAREN);
				setState(129);
				macro_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(IDENT);
				setState(131);
				match(LPAREN);
				setState(132);
				macro_args(0);
				setState(133);
				match(RPAREN);
				setState(134);
				macro_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(IDENT);
				setState(137);
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
		enterRule(_localctx, 16, RULE_macro_body);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MACRO_BODY:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(MACRO_BODY);
				}
				break;
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
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << RPAREN) | (1L << BACKSLASH) | (1L << IDENT) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << DOLLAR) | (1L << PLUS) | (1L << MINUS) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON) | (1L << LE) | (1L << GE) | (1L << EQUALS) | (1L << EXCLAMATION) | (1L << STAR) | (1L << AT) | (1L << SLASH) | (1L << CARET) | (1L << PERCENT) | (1L << LBRACE) | (1L << RBRACE) | (1L << LT) | (1L << GT) | (1L << DOT) | (1L << NUMBER) | (1L << FLOAT) | (1L << UNSIGNED))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (UNDERSCORE - 83)) | (1L << (TRUELIT - 83)) | (1L << (FALSELIT - 83)) | (1L << (STRING - 83)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << RPAREN) | (1L << BACKSLASH) | (1L << IDENT) | (1L << LBRACKET) | (1L << RBRACKET) | (1L << DOLLAR) | (1L << PLUS) | (1L << MINUS) | (1L << COMMA) | (1L << COLON) | (1L << SEMICOLON) | (1L << LE) | (1L << GE) | (1L << EQUALS) | (1L << EXCLAMATION) | (1L << STAR) | (1L << AT) | (1L << SLASH) | (1L << CARET) | (1L << PERCENT) | (1L << LBRACE) | (1L << RBRACE) | (1L << LT) | (1L << GT) | (1L << DOT) | (1L << NUMBER) | (1L << FLOAT) | (1L << UNSIGNED))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (UNDERSCORE - 83)) | (1L << (TRUELIT - 83)) | (1L << (FALSELIT - 83)) | (1L << (STRING - 83)))) != 0) );
				setState(146);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_macro_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(150);
			match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Macro_argsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_macro_args);
					setState(152);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(153);
					match(COMMA);
					setState(154);
					match(IDENT);
					}
					} 
				}
				setState(159);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
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
		"\u0004\u0001^\u00a1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001;\b\u0001"+
		"\u000b\u0001\f\u0001<\u0003\u0001?\b\u0001\u0001\u0002\u0004\u0002B\b"+
		"\u0002\u000b\u0002\f\u0002C\u0001\u0002\u0004\u0002G\b\u0002\u000b\u0002"+
		"\f\u0002H\u0001\u0002\u0004\u0002L\b\u0002\u000b\u0002\f\u0002M\u0001"+
		"\u0002\u0004\u0002Q\b\u0002\u000b\u0002\f\u0002R\u0003\u0002U\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004m\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005r\b\u0005\n\u0005\f\u0005"+
		"u\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006z\b\u0006\n\u0006"+
		"\f\u0006}\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u008b\b\u0007\u0001\b\u0001\b\u0004\b\u008f"+
		"\b\b\u000b\b\f\b\u0090\u0001\b\u0003\b\u0094\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u009c\b\t\n\t\f\t\u009f\t\t\u0001\t"+
		"\u0000\u0001\u0012\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000"+
		"\u0002\u0003\u0000\u000f\u000f89[[\u0007\u0000\f\u000f\u001f&()+57:SU"+
		"[[\u00ca\u0000\u0014\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000"+
		"\u0000\u0004T\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\b"+
		"l\u0001\u0000\u0000\u0000\nn\u0001\u0000\u0000\u0000\fv\u0001\u0000\u0000"+
		"\u0000\u000e\u008a\u0001\u0000\u0000\u0000\u0010\u0093\u0001\u0000\u0000"+
		"\u0000\u0012\u0095\u0001\u0000\u0000\u0000\u0014\u0015\u0003\u0002\u0001"+
		"\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0001\u0001\u0000\u0000"+
		"\u0000\u0017?\u0001\u0000\u0000\u0000\u0018;\u0005\u000f\u0000\u0000\u0019"+
		";\u0005\f\u0000\u0000\u001a;\u0005\r\u0000\u0000\u001b;\u0005[\u0000\u0000"+
		"\u001c;\u0005%\u0000\u0000\u001d;\u0005&\u0000\u0000\u001e;\u0005$\u0000"+
		"\u0000\u001f;\u00057\u0000\u0000 ;\u0005S\u0000\u0000!;\u00052\u0000\u0000"+
		"\";\u00053\u0000\u0000#;\u0005(\u0000\u0000$;\u0005)\u0000\u0000%;\u0005"+
		"T\u0000\u0000&;\u0005U\u0000\u0000\';\u00058\u0000\u0000(;\u0005:\u0000"+
		"\u0000);\u00059\u0000\u0000*;\u00054\u0000\u0000+;\u00055\u0000\u0000"+
		",;\u0005+\u0000\u0000-;\u0005\"\u0000\u0000.;\u0005#\u0000\u0000/;\u0005"+
		".\u0000\u00000;\u0005!\u0000\u00001;\u0005 \u0000\u00002;\u0005\u001f"+
		"\u0000\u00003;\u0005-\u0000\u00004;\u0005,\u0000\u00005;\u00051\u0000"+
		"\u00006;\u0005/\u0000\u00007;\u00050\u0000\u00008;\u0005\u0001\u0000\u0000"+
		"9;\u0003\u0004\u0002\u0000:\u0018\u0001\u0000\u0000\u0000:\u0019\u0001"+
		"\u0000\u0000\u0000:\u001a\u0001\u0000\u0000\u0000:\u001b\u0001\u0000\u0000"+
		"\u0000:\u001c\u0001\u0000\u0000\u0000:\u001d\u0001\u0000\u0000\u0000:"+
		"\u001e\u0001\u0000\u0000\u0000:\u001f\u0001\u0000\u0000\u0000: \u0001"+
		"\u0000\u0000\u0000:!\u0001\u0000\u0000\u0000:\"\u0001\u0000\u0000\u0000"+
		":#\u0001\u0000\u0000\u0000:$\u0001\u0000\u0000\u0000:%\u0001\u0000\u0000"+
		"\u0000:&\u0001\u0000\u0000\u0000:\'\u0001\u0000\u0000\u0000:(\u0001\u0000"+
		"\u0000\u0000:)\u0001\u0000\u0000\u0000:*\u0001\u0000\u0000\u0000:+\u0001"+
		"\u0000\u0000\u0000:,\u0001\u0000\u0000\u0000:-\u0001\u0000\u0000\u0000"+
		":.\u0001\u0000\u0000\u0000:/\u0001\u0000\u0000\u0000:0\u0001\u0000\u0000"+
		"\u0000:1\u0001\u0000\u0000\u0000:2\u0001\u0000\u0000\u0000:3\u0001\u0000"+
		"\u0000\u0000:4\u0001\u0000\u0000\u0000:5\u0001\u0000\u0000\u0000:6\u0001"+
		"\u0000\u0000\u0000:7\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000>\u0017\u0001"+
		"\u0000\u0000\u0000>:\u0001\u0000\u0000\u0000?\u0003\u0001\u0000\u0000"+
		"\u0000@B\u0003\f\u0006\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DU\u0001\u0000"+
		"\u0000\u0000EG\u0003\n\u0005\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IU\u0001"+
		"\u0000\u0000\u0000JL\u0003\b\u0004\u0000KJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NU\u0001\u0000\u0000\u0000OQ\u0003\u0006\u0003\u0000PO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000SU\u0001\u0000\u0000\u0000TA\u0001\u0000\u0000\u0000TF\u0001"+
		"\u0000\u0000\u0000TK\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000"+
		"U\u0005\u0001\u0000\u0000\u0000VW\u0005\n\u0000\u0000WX\u0005\u000f\u0000"+
		"\u0000X\u0007\u0001\u0000\u0000\u0000YZ\u0005\u0007\u0000\u0000Z[\u0005"+
		"\u000f\u0000\u0000[\\\u0003\u0002\u0001\u0000\\]\u0005\t\u0000\u0000]"+
		"m\u0001\u0000\u0000\u0000^_\u0005\b\u0000\u0000_`\u0005\u000f\u0000\u0000"+
		"`a\u0003\u0002\u0001\u0000ab\u0005\t\u0000\u0000bm\u0001\u0000\u0000\u0000"+
		"cd\u0005\u0005\u0000\u0000de\u0005\u000f\u0000\u0000ef\u0003\u0002\u0001"+
		"\u0000fg\u0005\t\u0000\u0000gm\u0001\u0000\u0000\u0000hi\u0005\u0006\u0000"+
		"\u0000ij\u0003\u0002\u0001\u0000jk\u0005\t\u0000\u0000km\u0001\u0000\u0000"+
		"\u0000lY\u0001\u0000\u0000\u0000l^\u0001\u0000\u0000\u0000lc\u0001\u0000"+
		"\u0000\u0000lh\u0001\u0000\u0000\u0000m\t\u0001\u0000\u0000\u0000no\u0005"+
		"\u0003\u0000\u0000os\u0005[\u0000\u0000pr\u0005\u0001\u0000\u0000qp\u0001"+
		"\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000t\u000b\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000vw\u0005\u0004\u0000\u0000w{\u0003\u000e\u0007\u0000xz\u0005"+
		"\u0001\u0000\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\r\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005\u000f\u0000\u0000\u007f"+
		"\u0080\u0005\f\u0000\u0000\u0080\u0081\u0005\r\u0000\u0000\u0081\u008b"+
		"\u0003\u0010\b\u0000\u0082\u0083\u0005\u000f\u0000\u0000\u0083\u0084\u0005"+
		"\f\u0000\u0000\u0084\u0085\u0003\u0012\t\u0000\u0085\u0086\u0005\r\u0000"+
		"\u0000\u0086\u0087\u0003\u0010\b\u0000\u0087\u008b\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0005\u000f\u0000\u0000\u0089\u008b\u0007\u0000\u0000\u0000"+
		"\u008a~\u0001\u0000\u0000\u0000\u008a\u0082\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008b\u000f\u0001\u0000\u0000\u0000\u008c"+
		"\u0094\u0005\u000b\u0000\u0000\u008d\u008f\u0007\u0001\u0000\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0005\u0001\u0000\u0000\u0093"+
		"\u008c\u0001\u0000\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0094"+
		"\u0011\u0001\u0000\u0000\u0000\u0095\u0096\u0006\t\uffff\uffff\u0000\u0096"+
		"\u0097\u0005\u000f\u0000\u0000\u0097\u009d\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\n\u0001\u0000\u0000\u0099\u009a\u0005$\u0000\u0000\u009a\u009c"+
		"\u0005\u000f\u0000\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009c\u009f"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u0013\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u000f:<>CHMRTls{\u008a\u0090\u0093\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}