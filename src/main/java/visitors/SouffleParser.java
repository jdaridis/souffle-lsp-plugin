// Generated from /home/john/IdeaProjects/Souffle_Ide_Plugin/grammar/Souffle.g4 by ANTLR 4.10.1
package visitors;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SouffleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, DECL=2, FUNCTOR=3, INPUT_DECL=4, OUTPUT_DECL=5, PRINTSIZE_DECL=6, 
		LIMITSIZE_DECL=7, TYPE=8, COMPONENT=9, INSTANTIATE=10, NUMBER_TYPE=11, 
		SYMBOL_TYPE=12, OVERRIDE=13, PRAGMA=14, PLAN=15, AUTOINC=16, BW_AND=17, 
		BW_OR=18, BW_XOR=19, BW_NOT=20, BW_SHIFT_L=21, BW_SHIFT_R=22, BW_SHIFT_R_UNSIGNED=23, 
		L_AND=24, L_OR=25, L_XOR=26, L_NOT=27, TMATCH=28, MEAN=29, CAT=30, ORD=31, 
		RANGE=32, STRLEN=33, SUBSTR=34, STATEFUL=35, TCONTAINS=36, OUTPUT_QUALIFIER=37, 
		INPUT_QUALIFIER=38, OVERRIDABLE_QUALIFIER=39, PRINTSIZE_QUALIFIER=40, 
		EQREL_QUALIFIER=41, INLINE_QUALIFIER=42, NO_INLINE_QUALIFIER=43, MAGIC_QUALIFIER=44, 
		NO_MAGIC_QUALIFIER=45, BRIE_QUALIFIER=46, BTREE_DELETE_QUALIFIER=47, BTREE_QUALIFIER=48, 
		MIN=49, MAX=50, AS=51, NIL=52, UNDERSCORE=53, COUNT=54, SUM=55, TRUELIT=56, 
		FALSELIT=57, TOFLOAT=58, TONUMBER=59, TOSTRING=60, TOUNSIGNED=61, CHOICEDOMAIN=62, 
		PIPE=63, LBRACKET=64, RBRACKET=65, DOLLAR=66, PLUS=67, MINUS=68, LPAREN=69, 
		RPAREN=70, COMMA=71, COLON=72, SEMICOLON=73, SUBTYPE=74, LE=75, GE=76, 
		NE=77, EQUALS=78, EXCLAMATION=79, STAR=80, AT=81, SLASH=82, CARET=83, 
		PERCENT=84, LBRACE=85, RBRACE=86, LT=87, GT=88, IF=89, DOT=90, NUMBER=91, 
		FLOAT=92, UNSIGNED=93, IDENT=94, STRING=95, COMMENT=96, LINE_COMMENT=97, 
		PREPROCESSOR=98, PREPROCESSOR_MULTILINE=99, PREPROCESSOR_ID=100;
	public static final int
		RULE_preprocessor_macro = 0, RULE_macro_args = 1, RULE_non_empty_macro_args = 2, 
		RULE_macro_arg = 3, RULE_program = 4, RULE_unit = 5, RULE_qualified_name = 6, 
		RULE_type_decl = 7, RULE_record_type_list = 8, RULE_union_type_list = 9, 
		RULE_adt_branch_list = 10, RULE_adt_branch = 11, RULE_relation_decl = 12, 
		RULE_relation_names = 13, RULE_attributes_list = 14, RULE_non_empty_attributes = 15, 
		RULE_attribute = 16, RULE_relation_tags = 17, RULE_non_empty_attribute_names = 18, 
		RULE_dependency = 19, RULE_dependency_list_aux = 20, RULE_dependency_list = 21, 
		RULE_fact = 22, RULE_souffle_rule = 23, RULE_rule_def = 24, RULE_head = 25, 
		RULE_body = 26, RULE_disjunction = 27, RULE_conjunction = 28, RULE_term = 29, 
		RULE_atom = 30, RULE_constraint = 31, RULE_arg_list = 32, RULE_non_empty_arg_list = 33, 
		RULE_arg = 34, RULE_functor_built_in = 35, RULE_aggregate_func = 36, RULE_aggregate_body = 37, 
		RULE_query_plan = 38, RULE_query_plan_list = 39, RULE_plan_order = 40, 
		RULE_non_empty_plan_order_list = 41, RULE_component_decl = 42, RULE_component_head = 43, 
		RULE_component_type = 44, RULE_component_type_params = 45, RULE_component_param_list = 46, 
		RULE_component_body = 47, RULE_component_init = 48, RULE_functor_decl = 49, 
		RULE_functor_arg_type_list = 50, RULE_non_empty_functor_arg_type_list = 51, 
		RULE_functor_attribute = 52, RULE_pragma = 53, RULE_directive_head = 54, 
		RULE_directive_head_decl = 55, RULE_directive_list = 56, RULE_relation_directive_list = 57, 
		RULE_non_empty_key_value_pairs = 58, RULE_kvp_value = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"preprocessor_macro", "macro_args", "non_empty_macro_args", "macro_arg", 
			"program", "unit", "qualified_name", "type_decl", "record_type_list", 
			"union_type_list", "adt_branch_list", "adt_branch", "relation_decl", 
			"relation_names", "attributes_list", "non_empty_attributes", "attribute", 
			"relation_tags", "non_empty_attribute_names", "dependency", "dependency_list_aux", 
			"dependency_list", "fact", "souffle_rule", "rule_def", "head", "body", 
			"disjunction", "conjunction", "term", "atom", "constraint", "arg_list", 
			"non_empty_arg_list", "arg", "functor_built_in", "aggregate_func", "aggregate_body", 
			"query_plan", "query_plan_list", "plan_order", "non_empty_plan_order_list", 
			"component_decl", "component_head", "component_type", "component_type_params", 
			"component_param_list", "component_body", "component_init", "functor_decl", 
			"functor_arg_type_list", "non_empty_functor_arg_type_list", "functor_attribute", 
			"pragma", "directive_head", "directive_head_decl", "directive_list", 
			"relation_directive_list", "non_empty_key_value_pairs", "kvp_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'autoinc'", "'band'", "'bor'", "'bxor'", "'bnot'", 
			"'bshl'", "'bshr'", "'bshru'", "'land'", "'lor'", "'lxor'", "'lnot'", 
			"'match'", "'mean'", "'cat'", "'ord'", "'range'", "'strlen'", "'substr'", 
			"'stateful'", "'contains'", "'output'", "'input'", "'overridable'", "'printsize'", 
			"'eqrel'", "'inline'", "'no_inline'", "'magic'", "'no_magic'", "'brie'", 
			"'btree_delete'", "'btree'", "'min'", "'max'", "'as'", "'nil'", "'_'", 
			"'count'", "'sum'", "'true'", "'false'", "'to_float'", "'to_number'", 
			"'to_string'", "'to_unsigned'", "'choice-domain'", "'|'", "'['", "']'", 
			"'$'", "'+'", "'-'", "'('", "')'", "','", "':'", "';'", "'<:'", "'<='", 
			"'>='", "'!='", "'='", "'!'", "'*'", "'@'", "'/'", "'^'", "'%'", "'{'", 
			"'}'", "'<'", "'>'", "':-'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "DECL", "FUNCTOR", "INPUT_DECL", "OUTPUT_DECL", "PRINTSIZE_DECL", 
			"LIMITSIZE_DECL", "TYPE", "COMPONENT", "INSTANTIATE", "NUMBER_TYPE", 
			"SYMBOL_TYPE", "OVERRIDE", "PRAGMA", "PLAN", "AUTOINC", "BW_AND", "BW_OR", 
			"BW_XOR", "BW_NOT", "BW_SHIFT_L", "BW_SHIFT_R", "BW_SHIFT_R_UNSIGNED", 
			"L_AND", "L_OR", "L_XOR", "L_NOT", "TMATCH", "MEAN", "CAT", "ORD", "RANGE", 
			"STRLEN", "SUBSTR", "STATEFUL", "TCONTAINS", "OUTPUT_QUALIFIER", "INPUT_QUALIFIER", 
			"OVERRIDABLE_QUALIFIER", "PRINTSIZE_QUALIFIER", "EQREL_QUALIFIER", "INLINE_QUALIFIER", 
			"NO_INLINE_QUALIFIER", "MAGIC_QUALIFIER", "NO_MAGIC_QUALIFIER", "BRIE_QUALIFIER", 
			"BTREE_DELETE_QUALIFIER", "BTREE_QUALIFIER", "MIN", "MAX", "AS", "NIL", 
			"UNDERSCORE", "COUNT", "SUM", "TRUELIT", "FALSELIT", "TOFLOAT", "TONUMBER", 
			"TOSTRING", "TOUNSIGNED", "CHOICEDOMAIN", "PIPE", "LBRACKET", "RBRACKET", 
			"DOLLAR", "PLUS", "MINUS", "LPAREN", "RPAREN", "COMMA", "COLON", "SEMICOLON", 
			"SUBTYPE", "LE", "GE", "NE", "EQUALS", "EXCLAMATION", "STAR", "AT", "SLASH", 
			"CARET", "PERCENT", "LBRACE", "RBRACE", "LT", "GT", "IF", "DOT", "NUMBER", 
			"FLOAT", "UNSIGNED", "IDENT", "STRING", "COMMENT", "LINE_COMMENT", "PREPROCESSOR", 
			"PREPROCESSOR_MULTILINE", "PREPROCESSOR_ID"
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
	public String getGrammarFileName() { return "Souffle.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SouffleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Preprocessor_macroContext extends ParserRuleContext {
		public TerminalNode PREPROCESSOR_ID() { return getToken(SouffleParser.PREPROCESSOR_ID, 0); }
		public TerminalNode LPAREN() { return getToken(SouffleParser.LPAREN, 0); }
		public Macro_argsContext macro_args() {
			return getRuleContext(Macro_argsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SouffleParser.RPAREN, 0); }
		public Preprocessor_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor_macro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitPreprocessor_macro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Preprocessor_macroContext preprocessor_macro() throws RecognitionException {
		Preprocessor_macroContext _localctx = new Preprocessor_macroContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_preprocessor_macro);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(PREPROCESSOR_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(PREPROCESSOR_ID);
				setState(122);
				match(LPAREN);
				setState(123);
				macro_args();
				setState(124);
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

	public static class Macro_argsContext extends ParserRuleContext {
		public Non_empty_macro_argsContext non_empty_macro_args() {
			return getRuleContext(Non_empty_macro_argsContext.class,0);
		}
		public Macro_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitMacro_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_argsContext macro_args() throws RecognitionException {
		Macro_argsContext _localctx = new Macro_argsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_macro_args);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACKET:
			case RPAREN:
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case AUTOINC:
			case BW_NOT:
			case L_NOT:
			case TMATCH:
			case MEAN:
			case CAT:
			case ORD:
			case RANGE:
			case STRLEN:
			case SUBSTR:
			case TCONTAINS:
			case MIN:
			case MAX:
			case AS:
			case NIL:
			case UNDERSCORE:
			case COUNT:
			case SUM:
			case TRUELIT:
			case FALSELIT:
			case TOFLOAT:
			case TONUMBER:
			case TOSTRING:
			case TOUNSIGNED:
			case LBRACKET:
			case DOLLAR:
			case MINUS:
			case LPAREN:
			case EXCLAMATION:
			case AT:
			case NUMBER:
			case FLOAT:
			case UNSIGNED:
			case IDENT:
			case STRING:
			case PREPROCESSOR_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				non_empty_macro_args(0);
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

	public static class Non_empty_macro_argsContext extends ParserRuleContext {
		public Macro_argContext macro_arg() {
			return getRuleContext(Macro_argContext.class,0);
		}
		public Non_empty_macro_argsContext non_empty_macro_args() {
			return getRuleContext(Non_empty_macro_argsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public Non_empty_macro_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_empty_macro_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitNon_empty_macro_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_empty_macro_argsContext non_empty_macro_args() throws RecognitionException {
		return non_empty_macro_args(0);
	}

	private Non_empty_macro_argsContext non_empty_macro_args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Non_empty_macro_argsContext _localctx = new Non_empty_macro_argsContext(_ctx, _parentState);
		Non_empty_macro_argsContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_non_empty_macro_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(133);
			macro_arg(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_macro_argsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_macro_args);
					setState(135);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(136);
					match(COMMA);
					setState(137);
					macro_arg(0);
					}
					} 
				}
				setState(142);
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

	public static class Macro_argContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SouffleParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(SouffleParser.FLOAT, 0); }
		public TerminalNode UNSIGNED() { return getToken(SouffleParser.UNSIGNED, 0); }
		public TerminalNode NUMBER() { return getToken(SouffleParser.NUMBER, 0); }
		public TerminalNode UNDERSCORE() { return getToken(SouffleParser.UNDERSCORE, 0); }
		public TerminalNode DOLLAR() { return getToken(SouffleParser.DOLLAR, 0); }
		public TerminalNode AUTOINC() { return getToken(SouffleParser.AUTOINC, 0); }
		public TerminalNode LPAREN() { return getToken(SouffleParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SouffleParser.RPAREN, 0); }
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public TerminalNode NIL() { return getToken(SouffleParser.NIL, 0); }
		public TerminalNode LBRACKET() { return getToken(SouffleParser.LBRACKET, 0); }
		public Macro_argsContext macro_args() {
			return getRuleContext(Macro_argsContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(SouffleParser.RBRACKET, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public List<Macro_argContext> macro_arg() {
			return getRuleContexts(Macro_argContext.class);
		}
		public Macro_argContext macro_arg(int i) {
			return getRuleContext(Macro_argContext.class,i);
		}
		public TerminalNode AS() { return getToken(SouffleParser.AS, 0); }
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public TerminalNode AT() { return getToken(SouffleParser.AT, 0); }
		public Functor_built_inContext functor_built_in() {
			return getRuleContext(Functor_built_inContext.class,0);
		}
		public Aggregate_funcContext aggregate_func() {
			return getRuleContext(Aggregate_funcContext.class,0);
		}
		public Non_empty_arg_listContext non_empty_arg_list() {
			return getRuleContext(Non_empty_arg_listContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SouffleParser.MINUS, 0); }
		public TerminalNode BW_NOT() { return getToken(SouffleParser.BW_NOT, 0); }
		public TerminalNode L_NOT() { return getToken(SouffleParser.L_NOT, 0); }
		public TerminalNode EXCLAMATION() { return getToken(SouffleParser.EXCLAMATION, 0); }
		public TerminalNode TMATCH() { return getToken(SouffleParser.TMATCH, 0); }
		public TerminalNode TCONTAINS() { return getToken(SouffleParser.TCONTAINS, 0); }
		public TerminalNode TRUELIT() { return getToken(SouffleParser.TRUELIT, 0); }
		public TerminalNode FALSELIT() { return getToken(SouffleParser.FALSELIT, 0); }
		public TerminalNode COLON() { return getToken(SouffleParser.COLON, 0); }
		public Aggregate_bodyContext aggregate_body() {
			return getRuleContext(Aggregate_bodyContext.class,0);
		}
		public Preprocessor_macroContext preprocessor_macro() {
			return getRuleContext(Preprocessor_macroContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SouffleParser.SEMICOLON, 0); }
		public TerminalNode LT() { return getToken(SouffleParser.LT, 0); }
		public TerminalNode GT() { return getToken(SouffleParser.GT, 0); }
		public TerminalNode LE() { return getToken(SouffleParser.LE, 0); }
		public TerminalNode GE() { return getToken(SouffleParser.GE, 0); }
		public TerminalNode EQUALS() { return getToken(SouffleParser.EQUALS, 0); }
		public TerminalNode NE() { return getToken(SouffleParser.NE, 0); }
		public TerminalNode PLUS() { return getToken(SouffleParser.PLUS, 0); }
		public TerminalNode STAR() { return getToken(SouffleParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(SouffleParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SouffleParser.PERCENT, 0); }
		public TerminalNode CARET() { return getToken(SouffleParser.CARET, 0); }
		public TerminalNode L_AND() { return getToken(SouffleParser.L_AND, 0); }
		public TerminalNode L_OR() { return getToken(SouffleParser.L_OR, 0); }
		public TerminalNode L_XOR() { return getToken(SouffleParser.L_XOR, 0); }
		public TerminalNode BW_AND() { return getToken(SouffleParser.BW_AND, 0); }
		public TerminalNode BW_OR() { return getToken(SouffleParser.BW_OR, 0); }
		public TerminalNode BW_XOR() { return getToken(SouffleParser.BW_XOR, 0); }
		public TerminalNode BW_SHIFT_L() { return getToken(SouffleParser.BW_SHIFT_L, 0); }
		public TerminalNode BW_SHIFT_R() { return getToken(SouffleParser.BW_SHIFT_R, 0); }
		public TerminalNode BW_SHIFT_R_UNSIGNED() { return getToken(SouffleParser.BW_SHIFT_R_UNSIGNED, 0); }
		public Macro_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_arg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitMacro_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_argContext macro_arg() throws RecognitionException {
		return macro_arg(0);
	}

	private Macro_argContext macro_arg(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Macro_argContext _localctx = new Macro_argContext(_ctx, _parentState);
		Macro_argContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_macro_arg, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(144);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(145);
				match(FLOAT);
				}
				break;
			case 3:
				{
				setState(146);
				match(UNSIGNED);
				}
				break;
			case 4:
				{
				setState(147);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(148);
				match(UNDERSCORE);
				}
				break;
			case 6:
				{
				setState(149);
				match(DOLLAR);
				}
				break;
			case 7:
				{
				setState(150);
				match(AUTOINC);
				setState(151);
				match(LPAREN);
				setState(152);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(153);
				match(IDENT);
				}
				break;
			case 9:
				{
				setState(154);
				match(NIL);
				}
				break;
			case 10:
				{
				setState(155);
				match(LBRACKET);
				setState(156);
				macro_args();
				setState(157);
				match(RBRACKET);
				}
				break;
			case 11:
				{
				setState(159);
				match(DOLLAR);
				setState(160);
				qualified_name(0);
				setState(161);
				match(LPAREN);
				setState(162);
				macro_args();
				setState(163);
				match(RPAREN);
				}
				break;
			case 12:
				{
				setState(165);
				match(LPAREN);
				setState(166);
				macro_arg(0);
				setState(167);
				match(RPAREN);
				}
				break;
			case 13:
				{
				setState(169);
				match(AS);
				setState(170);
				match(LPAREN);
				setState(171);
				macro_arg(0);
				setState(172);
				match(COMMA);
				setState(173);
				qualified_name(0);
				setState(174);
				match(RPAREN);
				}
				break;
			case 14:
				{
				setState(176);
				match(AT);
				setState(177);
				match(IDENT);
				setState(178);
				match(LPAREN);
				setState(179);
				macro_args();
				setState(180);
				match(RPAREN);
				}
				break;
			case 15:
				{
				setState(182);
				functor_built_in();
				setState(183);
				match(LPAREN);
				setState(184);
				macro_args();
				setState(185);
				match(RPAREN);
				}
				break;
			case 16:
				{
				setState(187);
				aggregate_func();
				setState(188);
				match(LPAREN);
				setState(189);
				macro_arg(0);
				setState(190);
				match(COMMA);
				setState(191);
				non_empty_arg_list(0);
				setState(192);
				match(RPAREN);
				}
				break;
			case 17:
				{
				setState(194);
				match(MINUS);
				setState(195);
				macro_arg(34);
				}
				break;
			case 18:
				{
				setState(196);
				match(BW_NOT);
				setState(197);
				macro_arg(33);
				}
				break;
			case 19:
				{
				setState(198);
				match(L_NOT);
				setState(199);
				macro_arg(32);
				}
				break;
			case 20:
				{
				setState(200);
				match(EXCLAMATION);
				setState(201);
				macro_arg(31);
				}
				break;
			case 21:
				{
				setState(202);
				match(AT);
				setState(203);
				match(IDENT);
				}
				break;
			case 22:
				{
				setState(204);
				match(TMATCH);
				setState(205);
				match(LPAREN);
				setState(206);
				macro_arg(0);
				setState(207);
				match(COMMA);
				setState(208);
				macro_arg(0);
				setState(209);
				match(RPAREN);
				}
				break;
			case 23:
				{
				setState(211);
				match(TCONTAINS);
				setState(212);
				match(LPAREN);
				setState(213);
				macro_arg(0);
				setState(214);
				match(COMMA);
				setState(215);
				macro_arg(0);
				setState(216);
				match(RPAREN);
				}
				break;
			case 24:
				{
				setState(218);
				match(TRUELIT);
				}
				break;
			case 25:
				{
				setState(219);
				match(FALSELIT);
				}
				break;
			case 26:
				{
				setState(220);
				aggregate_func();
				setState(221);
				macro_args();
				setState(222);
				match(COLON);
				setState(223);
				aggregate_body();
				}
				break;
			case 27:
				{
				setState(225);
				match(IDENT);
				setState(226);
				match(LPAREN);
				setState(227);
				macro_args();
				setState(228);
				match(RPAREN);
				}
				break;
			case 28:
				{
				setState(230);
				preprocessor_macro();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(233);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(234);
						match(SEMICOLON);
						setState(235);
						macro_arg(30);
						}
						break;
					case 2:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(236);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(237);
						match(LT);
						setState(238);
						macro_arg(29);
						}
						break;
					case 3:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(239);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(240);
						match(GT);
						setState(241);
						macro_arg(28);
						}
						break;
					case 4:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(242);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(243);
						match(LE);
						setState(244);
						macro_arg(27);
						}
						break;
					case 5:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(245);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(246);
						match(GE);
						setState(247);
						macro_arg(26);
						}
						break;
					case 6:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(248);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(249);
						match(EQUALS);
						setState(250);
						macro_arg(25);
						}
						break;
					case 7:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(251);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(252);
						match(NE);
						setState(253);
						macro_arg(24);
						}
						break;
					case 8:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(254);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(255);
						match(PLUS);
						setState(256);
						macro_arg(19);
						}
						break;
					case 9:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(257);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(258);
						match(MINUS);
						setState(259);
						macro_arg(18);
						}
						break;
					case 10:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(260);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(261);
						match(STAR);
						setState(262);
						macro_arg(17);
						}
						break;
					case 11:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(263);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(264);
						match(SLASH);
						setState(265);
						macro_arg(16);
						}
						break;
					case 12:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(266);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(267);
						match(PERCENT);
						setState(268);
						macro_arg(15);
						}
						break;
					case 13:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(269);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(270);
						match(CARET);
						setState(271);
						macro_arg(14);
						}
						break;
					case 14:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(272);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(273);
						match(L_AND);
						setState(274);
						macro_arg(13);
						}
						break;
					case 15:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(275);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(276);
						match(L_OR);
						setState(277);
						macro_arg(12);
						}
						break;
					case 16:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(278);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(279);
						match(L_XOR);
						setState(280);
						macro_arg(11);
						}
						break;
					case 17:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(281);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(282);
						match(BW_AND);
						setState(283);
						macro_arg(10);
						}
						break;
					case 18:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(284);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(285);
						match(BW_OR);
						setState(286);
						macro_arg(9);
						}
						break;
					case 19:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(287);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(288);
						match(BW_XOR);
						setState(289);
						macro_arg(8);
						}
						break;
					case 20:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(290);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(291);
						match(BW_SHIFT_L);
						setState(292);
						macro_arg(7);
						}
						break;
					case 21:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(293);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(294);
						match(BW_SHIFT_R);
						setState(295);
						macro_arg(6);
						}
						break;
					case 22:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(296);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(297);
						match(BW_SHIFT_R_UNSIGNED);
						setState(298);
						macro_arg(5);
						}
						break;
					}
					} 
				}
				setState(303);
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

	public static class ProgramContext extends ParserRuleContext {
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SouffleParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			unit(0);
			setState(305);
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

	public static class UnitContext extends ParserRuleContext {
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public Directive_headContext directive_head() {
			return getRuleContext(Directive_headContext.class,0);
		}
		public Souffle_ruleContext souffle_rule() {
			return getRuleContext(Souffle_ruleContext.class,0);
		}
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public Component_declContext component_decl() {
			return getRuleContext(Component_declContext.class,0);
		}
		public Component_initContext component_init() {
			return getRuleContext(Component_initContext.class,0);
		}
		public PragmaContext pragma() {
			return getRuleContext(PragmaContext.class,0);
		}
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public Functor_declContext functor_decl() {
			return getRuleContext(Functor_declContext.class,0);
		}
		public Relation_declContext relation_decl() {
			return getRuleContext(Relation_declContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		return unit(0);
	}

	private UnitContext unit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnitContext _localctx = new UnitContext(_ctx, _parentState);
		UnitContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_unit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(308);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(309);
						directive_head();
						}
						break;
					case 2:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(310);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(311);
						souffle_rule();
						}
						break;
					case 3:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(312);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(313);
						fact();
						}
						break;
					case 4:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(314);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(315);
						component_decl();
						}
						break;
					case 5:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(316);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(317);
						component_init();
						}
						break;
					case 6:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(318);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(319);
						pragma();
						}
						break;
					case 7:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(320);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(321);
						type_decl();
						}
						break;
					case 8:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(322);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(323);
						functor_decl();
						}
						break;
					case 9:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(324);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(325);
						relation_decl();
						}
						break;
					}
					} 
				}
				setState(330);
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

	public static class Qualified_nameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public Preprocessor_macroContext preprocessor_macro() {
			return getRuleContext(Preprocessor_macroContext.class,0);
		}
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SouffleParser.DOT, 0); }
		public Qualified_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitQualified_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_nameContext qualified_name() throws RecognitionException {
		return qualified_name(0);
	}

	private Qualified_nameContext qualified_name(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Qualified_nameContext _localctx = new Qualified_nameContext(_ctx, _parentState);
		Qualified_nameContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_qualified_name, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(332);
				match(IDENT);
				}
				break;
			case PREPROCESSOR_ID:
				{
				setState(333);
				preprocessor_macro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Qualified_nameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_qualified_name);
					setState(336);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(337);
					match(DOT);
					setState(338);
					match(IDENT);
					}
					} 
				}
				setState(343);
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

	public static class Type_declContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(SouffleParser.TYPE, 0); }
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public TerminalNode SUBTYPE() { return getToken(SouffleParser.SUBTYPE, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(SouffleParser.EQUALS, 0); }
		public Union_type_listContext union_type_list() {
			return getRuleContext(Union_type_listContext.class,0);
		}
		public Record_type_listContext record_type_list() {
			return getRuleContext(Record_type_listContext.class,0);
		}
		public Adt_branch_listContext adt_branch_list() {
			return getRuleContext(Adt_branch_listContext.class,0);
		}
		public TerminalNode NUMBER_TYPE() { return getToken(SouffleParser.NUMBER_TYPE, 0); }
		public TerminalNode SYMBOL_TYPE() { return getToken(SouffleParser.SYMBOL_TYPE, 0); }
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitType_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type_decl);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(TYPE);
				setState(345);
				match(IDENT);
				setState(346);
				match(SUBTYPE);
				setState(347);
				qualified_name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(TYPE);
				setState(349);
				match(IDENT);
				setState(350);
				match(EQUALS);
				setState(351);
				union_type_list(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				match(TYPE);
				setState(353);
				match(IDENT);
				setState(354);
				match(EQUALS);
				setState(355);
				record_type_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(TYPE);
				setState(357);
				match(IDENT);
				setState(358);
				match(EQUALS);
				setState(359);
				adt_branch_list(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(360);
				match(NUMBER_TYPE);
				setState(361);
				match(IDENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				match(SYMBOL_TYPE);
				setState(363);
				match(IDENT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(364);
				match(TYPE);
				setState(365);
				match(IDENT);
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

	public static class Record_type_listContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(SouffleParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(SouffleParser.RBRACKET, 0); }
		public Non_empty_attributesContext non_empty_attributes() {
			return getRuleContext(Non_empty_attributesContext.class,0);
		}
		public Record_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_type_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitRecord_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_type_listContext record_type_list() throws RecognitionException {
		Record_type_listContext _localctx = new Record_type_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_record_type_list);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(LBRACKET);
				setState(369);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(LBRACKET);
				setState(371);
				non_empty_attributes(0);
				setState(372);
				match(RBRACKET);
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

	public static class Union_type_listContext extends ParserRuleContext {
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public Union_type_listContext union_type_list() {
			return getRuleContext(Union_type_listContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(SouffleParser.PIPE, 0); }
		public Union_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_type_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitUnion_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_type_listContext union_type_list() throws RecognitionException {
		return union_type_list(0);
	}

	private Union_type_listContext union_type_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Union_type_listContext _localctx = new Union_type_listContext(_ctx, _parentState);
		Union_type_listContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_union_type_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(377);
			qualified_name(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Union_type_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_union_type_list);
					setState(379);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(380);
					match(PIPE);
					setState(381);
					qualified_name(0);
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Adt_branch_listContext extends ParserRuleContext {
		public Adt_branchContext adt_branch() {
			return getRuleContext(Adt_branchContext.class,0);
		}
		public Adt_branch_listContext adt_branch_list() {
			return getRuleContext(Adt_branch_listContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(SouffleParser.PIPE, 0); }
		public Adt_branch_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adt_branch_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitAdt_branch_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Adt_branch_listContext adt_branch_list() throws RecognitionException {
		return adt_branch_list(0);
	}

	private Adt_branch_listContext adt_branch_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Adt_branch_listContext _localctx = new Adt_branch_listContext(_ctx, _parentState);
		Adt_branch_listContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_adt_branch_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(388);
			adt_branch();
			}
			_ctx.stop = _input.LT(-1);
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Adt_branch_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_adt_branch_list);
					setState(390);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(391);
					match(PIPE);
					setState(392);
					adt_branch();
					}
					} 
				}
				setState(397);
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

	public static class Adt_branchContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public TerminalNode LBRACE() { return getToken(SouffleParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SouffleParser.RBRACE, 0); }
		public Non_empty_attributesContext non_empty_attributes() {
			return getRuleContext(Non_empty_attributesContext.class,0);
		}
		public Adt_branchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adt_branch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitAdt_branch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Adt_branchContext adt_branch() throws RecognitionException {
		Adt_branchContext _localctx = new Adt_branchContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_adt_branch);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(IDENT);
				setState(399);
				match(LBRACE);
				setState(400);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(IDENT);
				setState(402);
				match(LBRACE);
				setState(403);
				non_empty_attributes(0);
				setState(404);
				match(RBRACE);
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

	public static class Relation_declContext extends ParserRuleContext {
		public TerminalNode DECL() { return getToken(SouffleParser.DECL, 0); }
		public Relation_namesContext relation_names() {
			return getRuleContext(Relation_namesContext.class,0);
		}
		public Attributes_listContext attributes_list() {
			return getRuleContext(Attributes_listContext.class,0);
		}
		public Relation_tagsContext relation_tags() {
			return getRuleContext(Relation_tagsContext.class,0);
		}
		public Dependency_listContext dependency_list() {
			return getRuleContext(Dependency_listContext.class,0);
		}
		public Relation_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitRelation_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_declContext relation_decl() throws RecognitionException {
		Relation_declContext _localctx = new Relation_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relation_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(DECL);
			setState(409);
			relation_names(0);
			setState(410);
			attributes_list();
			setState(411);
			relation_tags(0);
			setState(412);
			dependency_list();
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

	public static class Relation_namesContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public Relation_namesContext relation_names() {
			return getRuleContext(Relation_namesContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public Relation_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_names; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitRelation_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_namesContext relation_names() throws RecognitionException {
		return relation_names(0);
	}

	private Relation_namesContext relation_names(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relation_namesContext _localctx = new Relation_namesContext(_ctx, _parentState);
		Relation_namesContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_relation_names, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(415);
			match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Relation_namesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relation_names);
					setState(417);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(418);
					match(COMMA);
					setState(419);
					match(IDENT);
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Attributes_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SouffleParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SouffleParser.RPAREN, 0); }
		public Non_empty_attributesContext non_empty_attributes() {
			return getRuleContext(Non_empty_attributesContext.class,0);
		}
		public Attributes_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitAttributes_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attributes_listContext attributes_list() throws RecognitionException {
		Attributes_listContext _localctx = new Attributes_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attributes_list);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(LPAREN);
				setState(426);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(LPAREN);
				setState(428);
				non_empty_attributes(0);
				setState(429);
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

	public static class Non_empty_attributesContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public Non_empty_attributesContext non_empty_attributes() {
			return getRuleContext(Non_empty_attributesContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public Non_empty_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_empty_attributes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitNon_empty_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_empty_attributesContext non_empty_attributes() throws RecognitionException {
		return non_empty_attributes(0);
	}

	private Non_empty_attributesContext non_empty_attributes(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Non_empty_attributesContext _localctx = new Non_empty_attributesContext(_ctx, _parentState);
		Non_empty_attributesContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_non_empty_attributes, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(434);
			attribute();
			}
			_ctx.stop = _input.LT(-1);
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_attributesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_attributes);
					setState(436);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(437);
					match(COMMA);
					setState(438);
					attribute();
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(SouffleParser.COLON, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(IDENT);
			setState(445);
			match(COLON);
			setState(446);
			qualified_name(0);
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

	public static class Relation_tagsContext extends ParserRuleContext {
		public Relation_tagsContext relation_tags() {
			return getRuleContext(Relation_tagsContext.class,0);
		}
		public TerminalNode OVERRIDABLE_QUALIFIER() { return getToken(SouffleParser.OVERRIDABLE_QUALIFIER, 0); }
		public TerminalNode INLINE_QUALIFIER() { return getToken(SouffleParser.INLINE_QUALIFIER, 0); }
		public TerminalNode NO_INLINE_QUALIFIER() { return getToken(SouffleParser.NO_INLINE_QUALIFIER, 0); }
		public TerminalNode MAGIC_QUALIFIER() { return getToken(SouffleParser.MAGIC_QUALIFIER, 0); }
		public TerminalNode NO_MAGIC_QUALIFIER() { return getToken(SouffleParser.NO_MAGIC_QUALIFIER, 0); }
		public TerminalNode BRIE_QUALIFIER() { return getToken(SouffleParser.BRIE_QUALIFIER, 0); }
		public TerminalNode BTREE_QUALIFIER() { return getToken(SouffleParser.BTREE_QUALIFIER, 0); }
		public TerminalNode BTREE_DELETE_QUALIFIER() { return getToken(SouffleParser.BTREE_DELETE_QUALIFIER, 0); }
		public TerminalNode EQREL_QUALIFIER() { return getToken(SouffleParser.EQREL_QUALIFIER, 0); }
		public TerminalNode OUTPUT_QUALIFIER() { return getToken(SouffleParser.OUTPUT_QUALIFIER, 0); }
		public TerminalNode INPUT_QUALIFIER() { return getToken(SouffleParser.INPUT_QUALIFIER, 0); }
		public TerminalNode PRINTSIZE_QUALIFIER() { return getToken(SouffleParser.PRINTSIZE_QUALIFIER, 0); }
		public Relation_tagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_tags; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitRelation_tags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_tagsContext relation_tags() throws RecognitionException {
		return relation_tags(0);
	}

	private Relation_tagsContext relation_tags(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relation_tagsContext _localctx = new Relation_tagsContext(_ctx, _parentState);
		Relation_tagsContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_relation_tags, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(473);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(449);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(450);
						match(OVERRIDABLE_QUALIFIER);
						}
						break;
					case 2:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(451);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(452);
						match(INLINE_QUALIFIER);
						}
						break;
					case 3:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(453);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(454);
						match(NO_INLINE_QUALIFIER);
						}
						break;
					case 4:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(455);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(456);
						match(MAGIC_QUALIFIER);
						}
						break;
					case 5:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(457);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(458);
						match(NO_MAGIC_QUALIFIER);
						}
						break;
					case 6:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(459);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(460);
						match(BRIE_QUALIFIER);
						}
						break;
					case 7:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(461);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(462);
						match(BTREE_QUALIFIER);
						}
						break;
					case 8:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(463);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(464);
						match(BTREE_DELETE_QUALIFIER);
						}
						break;
					case 9:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(465);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(466);
						match(EQREL_QUALIFIER);
						}
						break;
					case 10:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(467);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(468);
						match(OUTPUT_QUALIFIER);
						}
						break;
					case 11:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(469);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(470);
						match(INPUT_QUALIFIER);
						}
						break;
					case 12:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(471);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(472);
						match(PRINTSIZE_QUALIFIER);
						}
						break;
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Non_empty_attribute_namesContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public Preprocessor_macroContext preprocessor_macro() {
			return getRuleContext(Preprocessor_macroContext.class,0);
		}
		public Non_empty_attribute_namesContext non_empty_attribute_names() {
			return getRuleContext(Non_empty_attribute_namesContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public Non_empty_attribute_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_empty_attribute_names; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitNon_empty_attribute_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_empty_attribute_namesContext non_empty_attribute_names() throws RecognitionException {
		return non_empty_attribute_names(0);
	}

	private Non_empty_attribute_namesContext non_empty_attribute_names(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Non_empty_attribute_namesContext _localctx = new Non_empty_attribute_namesContext(_ctx, _parentState);
		Non_empty_attribute_namesContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_non_empty_attribute_names, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(479);
				match(IDENT);
				}
				break;
			case PREPROCESSOR_ID:
				{
				setState(480);
				preprocessor_macro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_attribute_namesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_attribute_names);
					setState(483);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(484);
					match(COMMA);
					setState(485);
					match(IDENT);
					}
					} 
				}
				setState(490);
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

	public static class DependencyContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(SouffleParser.LPAREN, 0); }
		public Non_empty_attribute_namesContext non_empty_attribute_names() {
			return getRuleContext(Non_empty_attribute_namesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SouffleParser.RPAREN, 0); }
		public DependencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependency; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitDependency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependencyContext dependency() throws RecognitionException {
		DependencyContext _localctx = new DependencyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dependency);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				match(IDENT);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(LPAREN);
				setState(493);
				non_empty_attribute_names(0);
				setState(494);
				match(RPAREN);
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

	public static class Dependency_list_auxContext extends ParserRuleContext {
		public DependencyContext dependency() {
			return getRuleContext(DependencyContext.class,0);
		}
		public Dependency_list_auxContext dependency_list_aux() {
			return getRuleContext(Dependency_list_auxContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public Dependency_list_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependency_list_aux; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitDependency_list_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependency_list_auxContext dependency_list_aux() throws RecognitionException {
		return dependency_list_aux(0);
	}

	private Dependency_list_auxContext dependency_list_aux(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dependency_list_auxContext _localctx = new Dependency_list_auxContext(_ctx, _parentState);
		Dependency_list_auxContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_dependency_list_aux, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(499);
			dependency();
			}
			_ctx.stop = _input.LT(-1);
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dependency_list_auxContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dependency_list_aux);
					setState(501);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(502);
					match(COMMA);
					setState(503);
					dependency();
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Dependency_listContext extends ParserRuleContext {
		public TerminalNode CHOICEDOMAIN() { return getToken(SouffleParser.CHOICEDOMAIN, 0); }
		public Dependency_list_auxContext dependency_list_aux() {
			return getRuleContext(Dependency_list_auxContext.class,0);
		}
		public Dependency_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependency_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitDependency_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependency_listContext dependency_list() throws RecognitionException {
		Dependency_listContext _localctx = new Dependency_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dependency_list);
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(CHOICEDOMAIN);
				setState(511);
				dependency_list_aux(0);
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

	public static class FactContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SouffleParser.DOT, 0); }
		public Preprocessor_macroContext preprocessor_macro() {
			return getRuleContext(Preprocessor_macroContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fact);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				atom();
				setState(515);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				preprocessor_macro();
				setState(519);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(518);
					match(DOT);
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

	public static class Souffle_ruleContext extends ParserRuleContext {
		public Rule_defContext rule_def() {
			return getRuleContext(Rule_defContext.class,0);
		}
		public Query_planContext query_plan() {
			return getRuleContext(Query_planContext.class,0);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode LE() { return getToken(SouffleParser.LE, 0); }
		public TerminalNode IF() { return getToken(SouffleParser.IF, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SouffleParser.DOT, 0); }
		public Souffle_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_souffle_rule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitSouffle_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Souffle_ruleContext souffle_rule() throws RecognitionException {
		Souffle_ruleContext _localctx = new Souffle_ruleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_souffle_rule);
		try {
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				rule_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				rule_def();
				setState(525);
				query_plan();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				atom();
				setState(528);
				match(LE);
				setState(529);
				atom();
				setState(530);
				match(IF);
				setState(531);
				body();
				setState(532);
				match(DOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(534);
				atom();
				setState(535);
				match(LE);
				setState(536);
				atom();
				setState(537);
				match(IF);
				setState(538);
				body();
				setState(539);
				match(DOT);
				setState(540);
				query_plan();
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

	public static class Rule_defContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode IF() { return getToken(SouffleParser.IF, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SouffleParser.DOT, 0); }
		public Rule_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitRule_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_defContext rule_def() throws RecognitionException {
		Rule_defContext _localctx = new Rule_defContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rule_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			head(0);
			setState(545);
			match(IF);
			setState(546);
			body();
			setState(547);
			match(DOT);
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

	public static class HeadContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		return head(0);
	}

	private HeadContext head(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		HeadContext _localctx = new HeadContext(_ctx, _parentState);
		HeadContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_head, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(550);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new HeadContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_head);
					setState(552);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(553);
					match(COMMA);
					setState(554);
					atom();
					}
					} 
				}
				setState(559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class BodyContext extends ParserRuleContext {
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			disjunction(0);
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

	public static class DisjunctionContext extends ParserRuleContext {
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SouffleParser.SEMICOLON, 0); }
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		return disjunction(0);
	}

	private DisjunctionContext disjunction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, _parentState);
		DisjunctionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_disjunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(563);
			conjunction(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DisjunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_disjunction);
					setState(565);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(566);
					match(SEMICOLON);
					setState(567);
					conjunction(0);
					}
					} 
				}
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class ConjunctionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		return conjunction(0);
	}

	private ConjunctionContext conjunction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, _parentState);
		ConjunctionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_conjunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(574);
			term();
			}
			_ctx.stop = _input.LT(-1);
			setState(581);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConjunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conjunction);
					setState(576);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(577);
					match(COMMA);
					setState(578);
					term();
					}
					} 
				}
				setState(583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SouffleParser.LPAREN, 0); }
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SouffleParser.RPAREN, 0); }
		public TerminalNode EXCLAMATION() { return getToken(SouffleParser.EXCLAMATION, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Preprocessor_macroContext preprocessor_macro() {
			return getRuleContext(Preprocessor_macroContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_term);
		try {
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(586);
				match(LPAREN);
				setState(587);
				disjunction(0);
				setState(588);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(590);
				match(EXCLAMATION);
				setState(591);
				term();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(592);
				preprocessor_macro();
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
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SouffleParser.LPAREN, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SouffleParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			qualified_name(0);
			setState(596);
			match(LPAREN);
			setState(597);
			arg_list();
			setState(598);
			match(RPAREN);
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

	public static class ConstraintContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode LT() { return getToken(SouffleParser.LT, 0); }
		public TerminalNode GT() { return getToken(SouffleParser.GT, 0); }
		public TerminalNode LE() { return getToken(SouffleParser.LE, 0); }
		public TerminalNode GE() { return getToken(SouffleParser.GE, 0); }
		public TerminalNode EQUALS() { return getToken(SouffleParser.EQUALS, 0); }
		public TerminalNode NE() { return getToken(SouffleParser.NE, 0); }
		public TerminalNode TMATCH() { return getToken(SouffleParser.TMATCH, 0); }
		public TerminalNode LPAREN() { return getToken(SouffleParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(SouffleParser.RPAREN, 0); }
		public TerminalNode TCONTAINS() { return getToken(SouffleParser.TCONTAINS, 0); }
		public TerminalNode TRUELIT() { return getToken(SouffleParser.TRUELIT, 0); }
		public TerminalNode FALSELIT() { return getToken(SouffleParser.FALSELIT, 0); }
		public Preprocessor_macroContext preprocessor_macro() {
			return getRuleContext(Preprocessor_macroContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constraint);
		try {
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				arg(0);
				setState(601);
				match(LT);
				setState(602);
				arg(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				arg(0);
				setState(605);
				match(GT);
				setState(606);
				arg(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				arg(0);
				setState(609);
				match(LE);
				setState(610);
				arg(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(612);
				arg(0);
				setState(613);
				match(GE);
				setState(614);
				arg(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(616);
				arg(0);
				setState(617);
				match(EQUALS);
				setState(618);
				arg(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(620);
				arg(0);
				setState(621);
				match(NE);
				setState(622);
				arg(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(624);
				match(TMATCH);
				setState(625);
				match(LPAREN);
				setState(626);
				arg(0);
				setState(627);
				match(COMMA);
				setState(628);
				arg(0);
				setState(629);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(631);
				match(TCONTAINS);
				setState(632);
				match(LPAREN);
				setState(633);
				arg(0);
				setState(634);
				match(COMMA);
				setState(635);
				arg(0);
				setState(636);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(638);
				match(TRUELIT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(639);
				match(FALSELIT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(640);
				preprocessor_macro();
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

	public static class Arg_listContext extends ParserRuleContext {
		public Non_empty_arg_listContext non_empty_arg_list() {
			return getRuleContext(Non_empty_arg_listContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitArg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arg_list);
		try {
			setState(645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACKET:
			case RPAREN:
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case AUTOINC:
			case BW_NOT:
			case L_NOT:
			case MEAN:
			case CAT:
			case ORD:
			case RANGE:
			case STRLEN:
			case SUBSTR:
			case MIN:
			case MAX:
			case AS:
			case NIL:
			case UNDERSCORE:
			case COUNT:
			case SUM:
			case TOFLOAT:
			case TONUMBER:
			case TOSTRING:
			case TOUNSIGNED:
			case LBRACKET:
			case DOLLAR:
			case MINUS:
			case LPAREN:
			case AT:
			case NUMBER:
			case FLOAT:
			case UNSIGNED:
			case IDENT:
			case STRING:
			case PREPROCESSOR_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				non_empty_arg_list(0);
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

	public static class Non_empty_arg_listContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public Non_empty_arg_listContext non_empty_arg_list() {
			return getRuleContext(Non_empty_arg_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public Non_empty_arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_empty_arg_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitNon_empty_arg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_empty_arg_listContext non_empty_arg_list() throws RecognitionException {
		return non_empty_arg_list(0);
	}

	private Non_empty_arg_listContext non_empty_arg_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Non_empty_arg_listContext _localctx = new Non_empty_arg_listContext(_ctx, _parentState);
		Non_empty_arg_listContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_non_empty_arg_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(648);
			arg(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_arg_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_arg_list);
					setState(650);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(651);
					match(COMMA);
					setState(652);
					arg(0);
					}
					} 
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SouffleParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(SouffleParser.FLOAT, 0); }
		public TerminalNode UNSIGNED() { return getToken(SouffleParser.UNSIGNED, 0); }
		public TerminalNode NUMBER() { return getToken(SouffleParser.NUMBER, 0); }
		public TerminalNode UNDERSCORE() { return getToken(SouffleParser.UNDERSCORE, 0); }
		public TerminalNode DOLLAR() { return getToken(SouffleParser.DOLLAR, 0); }
		public TerminalNode AUTOINC() { return getToken(SouffleParser.AUTOINC, 0); }
		public TerminalNode LPAREN() { return getToken(SouffleParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SouffleParser.RPAREN, 0); }
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public TerminalNode NIL() { return getToken(SouffleParser.NIL, 0); }
		public TerminalNode LBRACKET() { return getToken(SouffleParser.LBRACKET, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(SouffleParser.RBRACKET, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode AS() { return getToken(SouffleParser.AS, 0); }
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public TerminalNode AT() { return getToken(SouffleParser.AT, 0); }
		public Functor_built_inContext functor_built_in() {
			return getRuleContext(Functor_built_inContext.class,0);
		}
		public Aggregate_funcContext aggregate_func() {
			return getRuleContext(Aggregate_funcContext.class,0);
		}
		public Non_empty_arg_listContext non_empty_arg_list() {
			return getRuleContext(Non_empty_arg_listContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SouffleParser.MINUS, 0); }
		public TerminalNode BW_NOT() { return getToken(SouffleParser.BW_NOT, 0); }
		public TerminalNode L_NOT() { return getToken(SouffleParser.L_NOT, 0); }
		public TerminalNode COLON() { return getToken(SouffleParser.COLON, 0); }
		public Aggregate_bodyContext aggregate_body() {
			return getRuleContext(Aggregate_bodyContext.class,0);
		}
		public Preprocessor_macroContext preprocessor_macro() {
			return getRuleContext(Preprocessor_macroContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SouffleParser.PLUS, 0); }
		public TerminalNode STAR() { return getToken(SouffleParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(SouffleParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SouffleParser.PERCENT, 0); }
		public TerminalNode CARET() { return getToken(SouffleParser.CARET, 0); }
		public TerminalNode L_AND() { return getToken(SouffleParser.L_AND, 0); }
		public TerminalNode L_OR() { return getToken(SouffleParser.L_OR, 0); }
		public TerminalNode L_XOR() { return getToken(SouffleParser.L_XOR, 0); }
		public TerminalNode BW_AND() { return getToken(SouffleParser.BW_AND, 0); }
		public TerminalNode BW_OR() { return getToken(SouffleParser.BW_OR, 0); }
		public TerminalNode BW_XOR() { return getToken(SouffleParser.BW_XOR, 0); }
		public TerminalNode BW_SHIFT_L() { return getToken(SouffleParser.BW_SHIFT_L, 0); }
		public TerminalNode BW_SHIFT_R() { return getToken(SouffleParser.BW_SHIFT_R, 0); }
		public TerminalNode BW_SHIFT_R_UNSIGNED() { return getToken(SouffleParser.BW_SHIFT_R_UNSIGNED, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		return arg(0);
	}

	private ArgContext arg(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgContext _localctx = new ArgContext(_ctx, _parentState);
		ArgContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_arg, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(659);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(660);
				match(FLOAT);
				}
				break;
			case 3:
				{
				setState(661);
				match(UNSIGNED);
				}
				break;
			case 4:
				{
				setState(662);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(663);
				match(UNDERSCORE);
				}
				break;
			case 6:
				{
				setState(664);
				match(DOLLAR);
				}
				break;
			case 7:
				{
				setState(665);
				match(AUTOINC);
				setState(666);
				match(LPAREN);
				setState(667);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(668);
				match(IDENT);
				}
				break;
			case 9:
				{
				setState(669);
				match(NIL);
				}
				break;
			case 10:
				{
				setState(670);
				match(LBRACKET);
				setState(671);
				arg_list();
				setState(672);
				match(RBRACKET);
				}
				break;
			case 11:
				{
				setState(674);
				match(DOLLAR);
				setState(675);
				qualified_name(0);
				setState(676);
				match(LPAREN);
				setState(677);
				arg_list();
				setState(678);
				match(RPAREN);
				}
				break;
			case 12:
				{
				setState(680);
				match(LPAREN);
				setState(681);
				arg(0);
				setState(682);
				match(RPAREN);
				}
				break;
			case 13:
				{
				setState(684);
				match(AS);
				setState(685);
				match(LPAREN);
				setState(686);
				arg(0);
				setState(687);
				match(COMMA);
				setState(688);
				qualified_name(0);
				setState(689);
				match(RPAREN);
				}
				break;
			case 14:
				{
				setState(691);
				match(AT);
				setState(692);
				match(IDENT);
				setState(693);
				match(LPAREN);
				setState(694);
				arg_list();
				setState(695);
				match(RPAREN);
				}
				break;
			case 15:
				{
				setState(697);
				functor_built_in();
				setState(698);
				match(LPAREN);
				setState(699);
				arg_list();
				setState(700);
				match(RPAREN);
				}
				break;
			case 16:
				{
				setState(702);
				aggregate_func();
				setState(703);
				match(LPAREN);
				setState(704);
				arg(0);
				setState(705);
				match(COMMA);
				setState(706);
				non_empty_arg_list(0);
				setState(707);
				match(RPAREN);
				}
				break;
			case 17:
				{
				setState(709);
				match(MINUS);
				setState(710);
				arg(20);
				}
				break;
			case 18:
				{
				setState(711);
				match(BW_NOT);
				setState(712);
				arg(19);
				}
				break;
			case 19:
				{
				setState(713);
				match(L_NOT);
				setState(714);
				arg(18);
				}
				break;
			case 20:
				{
				setState(715);
				aggregate_func();
				setState(716);
				arg_list();
				setState(717);
				match(COLON);
				setState(718);
				aggregate_body();
				}
				break;
			case 21:
				{
				setState(720);
				preprocessor_macro();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(770);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(768);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(723);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(724);
						match(PLUS);
						setState(725);
						arg(18);
						}
						break;
					case 2:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(726);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(727);
						match(MINUS);
						setState(728);
						arg(17);
						}
						break;
					case 3:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(729);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(730);
						match(STAR);
						setState(731);
						arg(16);
						}
						break;
					case 4:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(732);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(733);
						match(SLASH);
						setState(734);
						arg(15);
						}
						break;
					case 5:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(735);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(736);
						match(PERCENT);
						setState(737);
						arg(14);
						}
						break;
					case 6:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(738);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(739);
						match(CARET);
						setState(740);
						arg(13);
						}
						break;
					case 7:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(741);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(742);
						match(L_AND);
						setState(743);
						arg(12);
						}
						break;
					case 8:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(744);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(745);
						match(L_OR);
						setState(746);
						arg(11);
						}
						break;
					case 9:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(747);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(748);
						match(L_XOR);
						setState(749);
						arg(10);
						}
						break;
					case 10:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(750);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(751);
						match(BW_AND);
						setState(752);
						arg(9);
						}
						break;
					case 11:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(753);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(754);
						match(BW_OR);
						setState(755);
						arg(8);
						}
						break;
					case 12:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(756);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(757);
						match(BW_XOR);
						setState(758);
						arg(7);
						}
						break;
					case 13:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(759);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(760);
						match(BW_SHIFT_L);
						setState(761);
						arg(6);
						}
						break;
					case 14:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(762);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(763);
						match(BW_SHIFT_R);
						setState(764);
						arg(5);
						}
						break;
					case 15:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(765);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(766);
						match(BW_SHIFT_R_UNSIGNED);
						setState(767);
						arg(4);
						}
						break;
					}
					} 
				}
				setState(772);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class Functor_built_inContext extends ParserRuleContext {
		public TerminalNode CAT() { return getToken(SouffleParser.CAT, 0); }
		public TerminalNode ORD() { return getToken(SouffleParser.ORD, 0); }
		public TerminalNode RANGE() { return getToken(SouffleParser.RANGE, 0); }
		public TerminalNode STRLEN() { return getToken(SouffleParser.STRLEN, 0); }
		public TerminalNode SUBSTR() { return getToken(SouffleParser.SUBSTR, 0); }
		public TerminalNode TOFLOAT() { return getToken(SouffleParser.TOFLOAT, 0); }
		public TerminalNode TONUMBER() { return getToken(SouffleParser.TONUMBER, 0); }
		public TerminalNode TOSTRING() { return getToken(SouffleParser.TOSTRING, 0); }
		public TerminalNode TOUNSIGNED() { return getToken(SouffleParser.TOUNSIGNED, 0); }
		public Functor_built_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functor_built_in; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitFunctor_built_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functor_built_inContext functor_built_in() throws RecognitionException {
		Functor_built_inContext _localctx = new Functor_built_inContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functor_built_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CAT) | (1L << ORD) | (1L << RANGE) | (1L << STRLEN) | (1L << SUBSTR) | (1L << TOFLOAT) | (1L << TONUMBER) | (1L << TOSTRING) | (1L << TOUNSIGNED))) != 0)) ) {
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

	public static class Aggregate_funcContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(SouffleParser.COUNT, 0); }
		public TerminalNode MAX() { return getToken(SouffleParser.MAX, 0); }
		public TerminalNode MEAN() { return getToken(SouffleParser.MEAN, 0); }
		public TerminalNode MIN() { return getToken(SouffleParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(SouffleParser.SUM, 0); }
		public Aggregate_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitAggregate_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_funcContext aggregate_func() throws RecognitionException {
		Aggregate_funcContext _localctx = new Aggregate_funcContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_aggregate_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MEAN) | (1L << MIN) | (1L << MAX) | (1L << COUNT) | (1L << SUM))) != 0)) ) {
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

	public static class Aggregate_bodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SouffleParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SouffleParser.RBRACE, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Aggregate_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitAggregate_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_bodyContext aggregate_body() throws RecognitionException {
		Aggregate_bodyContext _localctx = new Aggregate_bodyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_aggregate_body);
		try {
			setState(782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				match(LBRACE);
				setState(778);
				body();
				setState(779);
				match(RBRACE);
				}
				break;
			case IDENT:
			case PREPROCESSOR_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				atom();
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

	public static class Query_planContext extends ParserRuleContext {
		public TerminalNode PLAN() { return getToken(SouffleParser.PLAN, 0); }
		public Query_plan_listContext query_plan_list() {
			return getRuleContext(Query_plan_listContext.class,0);
		}
		public Query_planContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_plan; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitQuery_plan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_planContext query_plan() throws RecognitionException {
		Query_planContext _localctx = new Query_planContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_query_plan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(PLAN);
			setState(785);
			query_plan_list(0);
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

	public static class Query_plan_listContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SouffleParser.NUMBER, 0); }
		public TerminalNode COLON() { return getToken(SouffleParser.COLON, 0); }
		public Plan_orderContext plan_order() {
			return getRuleContext(Plan_orderContext.class,0);
		}
		public Query_plan_listContext query_plan_list() {
			return getRuleContext(Query_plan_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public Query_plan_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_plan_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitQuery_plan_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_plan_listContext query_plan_list() throws RecognitionException {
		return query_plan_list(0);
	}

	private Query_plan_listContext query_plan_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Query_plan_listContext _localctx = new Query_plan_listContext(_ctx, _parentState);
		Query_plan_listContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_query_plan_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(788);
			match(NUMBER);
			setState(789);
			match(COLON);
			setState(790);
			plan_order();
			}
			_ctx.stop = _input.LT(-1);
			setState(799);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Query_plan_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_query_plan_list);
					setState(792);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(793);
					match(COMMA);
					setState(794);
					match(NUMBER);
					setState(795);
					match(COLON);
					setState(796);
					plan_order();
					}
					} 
				}
				setState(801);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class Plan_orderContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SouffleParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SouffleParser.RPAREN, 0); }
		public Non_empty_plan_order_listContext non_empty_plan_order_list() {
			return getRuleContext(Non_empty_plan_order_listContext.class,0);
		}
		public Plan_orderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plan_order; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitPlan_order(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plan_orderContext plan_order() throws RecognitionException {
		Plan_orderContext _localctx = new Plan_orderContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_plan_order);
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				match(LPAREN);
				setState(803);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				match(LPAREN);
				setState(805);
				non_empty_plan_order_list(0);
				setState(806);
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

	public static class Non_empty_plan_order_listContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SouffleParser.NUMBER, 0); }
		public Non_empty_plan_order_listContext non_empty_plan_order_list() {
			return getRuleContext(Non_empty_plan_order_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public Non_empty_plan_order_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_empty_plan_order_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitNon_empty_plan_order_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_empty_plan_order_listContext non_empty_plan_order_list() throws RecognitionException {
		return non_empty_plan_order_list(0);
	}

	private Non_empty_plan_order_listContext non_empty_plan_order_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Non_empty_plan_order_listContext _localctx = new Non_empty_plan_order_listContext(_ctx, _parentState);
		Non_empty_plan_order_listContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_non_empty_plan_order_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(811);
			match(NUMBER);
			}
			_ctx.stop = _input.LT(-1);
			setState(818);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_plan_order_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_plan_order_list);
					setState(813);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(814);
					match(COMMA);
					setState(815);
					match(NUMBER);
					}
					} 
				}
				setState(820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class Component_declContext extends ParserRuleContext {
		public Component_headContext component_head() {
			return getRuleContext(Component_headContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(SouffleParser.LBRACE, 0); }
		public Component_bodyContext component_body() {
			return getRuleContext(Component_bodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SouffleParser.RBRACE, 0); }
		public Component_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitComponent_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_declContext component_decl() throws RecognitionException {
		Component_declContext _localctx = new Component_declContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_component_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			component_head(0);
			setState(822);
			match(LBRACE);
			setState(823);
			component_body(0);
			setState(824);
			match(RBRACE);
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

	public static class Component_headContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(SouffleParser.COMPONENT, 0); }
		public Component_typeContext component_type() {
			return getRuleContext(Component_typeContext.class,0);
		}
		public Component_headContext component_head() {
			return getRuleContext(Component_headContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SouffleParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public Component_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitComponent_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_headContext component_head() throws RecognitionException {
		return component_head(0);
	}

	private Component_headContext component_head(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Component_headContext _localctx = new Component_headContext(_ctx, _parentState);
		Component_headContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_component_head, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(827);
			match(COMPONENT);
			setState(828);
			component_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(838);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(836);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new Component_headContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_head);
						setState(830);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(831);
						match(COLON);
						setState(832);
						component_type();
						}
						break;
					case 2:
						{
						_localctx = new Component_headContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_head);
						setState(833);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(834);
						match(COMMA);
						setState(835);
						component_type();
						}
						break;
					}
					} 
				}
				setState(840);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class Component_typeContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public Component_type_paramsContext component_type_params() {
			return getRuleContext(Component_type_paramsContext.class,0);
		}
		public Component_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitComponent_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_typeContext component_type() throws RecognitionException {
		Component_typeContext _localctx = new Component_typeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_component_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(IDENT);
			setState(842);
			component_type_params();
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

	public static class Component_type_paramsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SouffleParser.LT, 0); }
		public Component_param_listContext component_param_list() {
			return getRuleContext(Component_param_listContext.class,0);
		}
		public TerminalNode GT() { return getToken(SouffleParser.GT, 0); }
		public Component_type_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_type_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitComponent_type_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_type_paramsContext component_type_params() throws RecognitionException {
		Component_type_paramsContext _localctx = new Component_type_paramsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_component_type_params);
		try {
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				match(LT);
				setState(846);
				component_param_list(0);
				setState(847);
				match(GT);
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

	public static class Component_param_listContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public Preprocessor_macroContext preprocessor_macro() {
			return getRuleContext(Preprocessor_macroContext.class,0);
		}
		public Component_param_listContext component_param_list() {
			return getRuleContext(Component_param_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public Component_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_param_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitComponent_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_param_listContext component_param_list() throws RecognitionException {
		return component_param_list(0);
	}

	private Component_param_listContext component_param_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Component_param_listContext _localctx = new Component_param_listContext(_ctx, _parentState);
		Component_param_listContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_component_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(852);
				match(IDENT);
				}
				break;
			case PREPROCESSOR_ID:
				{
				setState(853);
				preprocessor_macro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(861);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Component_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_component_param_list);
					setState(856);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(857);
					match(COMMA);
					setState(858);
					match(IDENT);
					}
					} 
				}
				setState(863);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class Component_bodyContext extends ParserRuleContext {
		public Component_bodyContext component_body() {
			return getRuleContext(Component_bodyContext.class,0);
		}
		public Directive_headContext directive_head() {
			return getRuleContext(Directive_headContext.class,0);
		}
		public Souffle_ruleContext souffle_rule() {
			return getRuleContext(Souffle_ruleContext.class,0);
		}
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TerminalNode OVERRIDE() { return getToken(SouffleParser.OVERRIDE, 0); }
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public Component_initContext component_init() {
			return getRuleContext(Component_initContext.class,0);
		}
		public Component_declContext component_decl() {
			return getRuleContext(Component_declContext.class,0);
		}
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public Relation_declContext relation_decl() {
			return getRuleContext(Relation_declContext.class,0);
		}
		public Component_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitComponent_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_bodyContext component_body() throws RecognitionException {
		return component_body(0);
	}

	private Component_bodyContext component_body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Component_bodyContext _localctx = new Component_bodyContext(_ctx, _parentState);
		Component_bodyContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_component_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(884);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(882);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(865);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(866);
						directive_head();
						}
						break;
					case 2:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(867);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(868);
						souffle_rule();
						}
						break;
					case 3:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(869);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(870);
						fact();
						}
						break;
					case 4:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(871);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(872);
						match(OVERRIDE);
						setState(873);
						match(IDENT);
						}
						break;
					case 5:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(874);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(875);
						component_init();
						}
						break;
					case 6:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(876);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(877);
						component_decl();
						}
						break;
					case 7:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(878);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(879);
						type_decl();
						}
						break;
					case 8:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(880);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(881);
						relation_decl();
						}
						break;
					}
					} 
				}
				setState(886);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class Component_initContext extends ParserRuleContext {
		public TerminalNode INSTANTIATE() { return getToken(SouffleParser.INSTANTIATE, 0); }
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public TerminalNode EQUALS() { return getToken(SouffleParser.EQUALS, 0); }
		public Component_typeContext component_type() {
			return getRuleContext(Component_typeContext.class,0);
		}
		public Component_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitComponent_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_initContext component_init() throws RecognitionException {
		Component_initContext _localctx = new Component_initContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_component_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(INSTANTIATE);
			setState(888);
			match(IDENT);
			setState(889);
			match(EQUALS);
			setState(890);
			component_type();
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

	public static class Functor_declContext extends ParserRuleContext {
		public TerminalNode FUNCTOR() { return getToken(SouffleParser.FUNCTOR, 0); }
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(SouffleParser.LPAREN, 0); }
		public Functor_arg_type_listContext functor_arg_type_list() {
			return getRuleContext(Functor_arg_type_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SouffleParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(SouffleParser.COLON, 0); }
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public TerminalNode STATEFUL() { return getToken(SouffleParser.STATEFUL, 0); }
		public Functor_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functor_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitFunctor_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functor_declContext functor_decl() throws RecognitionException {
		Functor_declContext _localctx = new Functor_declContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_functor_decl);
		try {
			setState(909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				match(FUNCTOR);
				setState(893);
				match(IDENT);
				setState(894);
				match(LPAREN);
				setState(895);
				functor_arg_type_list();
				setState(896);
				match(RPAREN);
				setState(897);
				match(COLON);
				setState(898);
				qualified_name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				match(FUNCTOR);
				setState(901);
				match(IDENT);
				setState(902);
				match(LPAREN);
				setState(903);
				functor_arg_type_list();
				setState(904);
				match(RPAREN);
				setState(905);
				match(COLON);
				setState(906);
				qualified_name(0);
				setState(907);
				match(STATEFUL);
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

	public static class Functor_arg_type_listContext extends ParserRuleContext {
		public Non_empty_functor_arg_type_listContext non_empty_functor_arg_type_list() {
			return getRuleContext(Non_empty_functor_arg_type_listContext.class,0);
		}
		public Functor_arg_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functor_arg_type_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitFunctor_arg_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functor_arg_type_listContext functor_arg_type_list() throws RecognitionException {
		Functor_arg_type_listContext _localctx = new Functor_arg_type_listContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_functor_arg_type_list);
		try {
			setState(913);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IDENT:
			case PREPROCESSOR_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				non_empty_functor_arg_type_list(0);
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

	public static class Non_empty_functor_arg_type_listContext extends ParserRuleContext {
		public Functor_attributeContext functor_attribute() {
			return getRuleContext(Functor_attributeContext.class,0);
		}
		public Non_empty_functor_arg_type_listContext non_empty_functor_arg_type_list() {
			return getRuleContext(Non_empty_functor_arg_type_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public Non_empty_functor_arg_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_empty_functor_arg_type_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitNon_empty_functor_arg_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_empty_functor_arg_type_listContext non_empty_functor_arg_type_list() throws RecognitionException {
		return non_empty_functor_arg_type_list(0);
	}

	private Non_empty_functor_arg_type_listContext non_empty_functor_arg_type_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Non_empty_functor_arg_type_listContext _localctx = new Non_empty_functor_arg_type_listContext(_ctx, _parentState);
		Non_empty_functor_arg_type_listContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_non_empty_functor_arg_type_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(916);
			functor_attribute();
			}
			_ctx.stop = _input.LT(-1);
			setState(923);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_functor_arg_type_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_functor_arg_type_list);
					setState(918);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(919);
					match(COMMA);
					setState(920);
					functor_attribute();
					}
					} 
				}
				setState(925);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class Functor_attributeContext extends ParserRuleContext {
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(SouffleParser.COLON, 0); }
		public Functor_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functor_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitFunctor_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functor_attributeContext functor_attribute() throws RecognitionException {
		Functor_attributeContext _localctx = new Functor_attributeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_functor_attribute);
		try {
			setState(930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				qualified_name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				match(IDENT);
				setState(928);
				match(COLON);
				setState(929);
				qualified_name(0);
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

	public static class PragmaContext extends ParserRuleContext {
		public TerminalNode PRAGMA() { return getToken(SouffleParser.PRAGMA, 0); }
		public List<TerminalNode> STRING() { return getTokens(SouffleParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SouffleParser.STRING, i);
		}
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitPragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_pragma);
		try {
			setState(937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				match(PRAGMA);
				setState(933);
				match(STRING);
				setState(934);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				match(PRAGMA);
				setState(936);
				match(STRING);
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

	public static class Directive_headContext extends ParserRuleContext {
		public Directive_head_declContext directive_head_decl() {
			return getRuleContext(Directive_head_declContext.class,0);
		}
		public Directive_listContext directive_list() {
			return getRuleContext(Directive_listContext.class,0);
		}
		public Directive_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitDirective_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_headContext directive_head() throws RecognitionException {
		Directive_headContext _localctx = new Directive_headContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_directive_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			directive_head_decl();
			setState(940);
			directive_list();
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

	public static class Directive_head_declContext extends ParserRuleContext {
		public TerminalNode INPUT_DECL() { return getToken(SouffleParser.INPUT_DECL, 0); }
		public TerminalNode OUTPUT_DECL() { return getToken(SouffleParser.OUTPUT_DECL, 0); }
		public TerminalNode PRINTSIZE_DECL() { return getToken(SouffleParser.PRINTSIZE_DECL, 0); }
		public TerminalNode LIMITSIZE_DECL() { return getToken(SouffleParser.LIMITSIZE_DECL, 0); }
		public Directive_head_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_head_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitDirective_head_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_head_declContext directive_head_decl() throws RecognitionException {
		Directive_head_declContext _localctx = new Directive_head_declContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_directive_head_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INPUT_DECL) | (1L << OUTPUT_DECL) | (1L << PRINTSIZE_DECL) | (1L << LIMITSIZE_DECL))) != 0)) ) {
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

	public static class Directive_listContext extends ParserRuleContext {
		public Relation_directive_listContext relation_directive_list() {
			return getRuleContext(Relation_directive_listContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SouffleParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SouffleParser.RPAREN, 0); }
		public Non_empty_key_value_pairsContext non_empty_key_value_pairs() {
			return getRuleContext(Non_empty_key_value_pairsContext.class,0);
		}
		public Directive_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitDirective_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_listContext directive_list() throws RecognitionException {
		Directive_listContext _localctx = new Directive_listContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_directive_list);
		try {
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				relation_directive_list(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				relation_directive_list(0);
				setState(946);
				match(LPAREN);
				setState(947);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(949);
				relation_directive_list(0);
				setState(950);
				match(LPAREN);
				setState(951);
				non_empty_key_value_pairs(0);
				setState(952);
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

	public static class Relation_directive_listContext extends ParserRuleContext {
		public Qualified_nameContext qualified_name() {
			return getRuleContext(Qualified_nameContext.class,0);
		}
		public Relation_directive_listContext relation_directive_list() {
			return getRuleContext(Relation_directive_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public Relation_directive_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_directive_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitRelation_directive_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_directive_listContext relation_directive_list() throws RecognitionException {
		return relation_directive_list(0);
	}

	private Relation_directive_listContext relation_directive_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relation_directive_listContext _localctx = new Relation_directive_listContext(_ctx, _parentState);
		Relation_directive_listContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_relation_directive_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(957);
			qualified_name(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(964);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Relation_directive_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relation_directive_list);
					setState(959);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(960);
					match(COMMA);
					setState(961);
					qualified_name(0);
					}
					} 
				}
				setState(966);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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

	public static class Non_empty_key_value_pairsContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public TerminalNode EQUALS() { return getToken(SouffleParser.EQUALS, 0); }
		public Kvp_valueContext kvp_value() {
			return getRuleContext(Kvp_valueContext.class,0);
		}
		public Non_empty_key_value_pairsContext non_empty_key_value_pairs() {
			return getRuleContext(Non_empty_key_value_pairsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
		public Non_empty_key_value_pairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_empty_key_value_pairs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitNon_empty_key_value_pairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_empty_key_value_pairsContext non_empty_key_value_pairs() throws RecognitionException {
		return non_empty_key_value_pairs(0);
	}

	private Non_empty_key_value_pairsContext non_empty_key_value_pairs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Non_empty_key_value_pairsContext _localctx = new Non_empty_key_value_pairsContext(_ctx, _parentState);
		Non_empty_key_value_pairsContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_non_empty_key_value_pairs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(968);
			match(IDENT);
			setState(969);
			match(EQUALS);
			setState(970);
			kvp_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(979);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_key_value_pairsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_key_value_pairs);
					setState(972);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(973);
					match(COMMA);
					setState(974);
					match(IDENT);
					setState(975);
					match(EQUALS);
					setState(976);
					kvp_value();
					}
					} 
				}
				setState(981);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class Kvp_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SouffleParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public TerminalNode NUMBER() { return getToken(SouffleParser.NUMBER, 0); }
		public TerminalNode TRUELIT() { return getToken(SouffleParser.TRUELIT, 0); }
		public TerminalNode FALSELIT() { return getToken(SouffleParser.FALSELIT, 0); }
		public Preprocessor_macroContext preprocessor_macro() {
			return getRuleContext(Preprocessor_macroContext.class,0);
		}
		public Kvp_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kvp_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SouffleVisitor ) return ((SouffleVisitor<? extends T>)visitor).visitKvp_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kvp_valueContext kvp_value() throws RecognitionException {
		Kvp_valueContext _localctx = new Kvp_valueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_kvp_value);
		try {
			setState(988);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				match(STRING);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
				match(IDENT);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(984);
				match(NUMBER);
				}
				break;
			case TRUELIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(985);
				match(TRUELIT);
				}
				break;
			case FALSELIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(986);
				match(FALSELIT);
				}
				break;
			case PREPROCESSOR_ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(987);
				preprocessor_macro();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return non_empty_macro_args_sempred((Non_empty_macro_argsContext)_localctx, predIndex);
		case 3:
			return macro_arg_sempred((Macro_argContext)_localctx, predIndex);
		case 5:
			return unit_sempred((UnitContext)_localctx, predIndex);
		case 6:
			return qualified_name_sempred((Qualified_nameContext)_localctx, predIndex);
		case 9:
			return union_type_list_sempred((Union_type_listContext)_localctx, predIndex);
		case 10:
			return adt_branch_list_sempred((Adt_branch_listContext)_localctx, predIndex);
		case 13:
			return relation_names_sempred((Relation_namesContext)_localctx, predIndex);
		case 15:
			return non_empty_attributes_sempred((Non_empty_attributesContext)_localctx, predIndex);
		case 17:
			return relation_tags_sempred((Relation_tagsContext)_localctx, predIndex);
		case 18:
			return non_empty_attribute_names_sempred((Non_empty_attribute_namesContext)_localctx, predIndex);
		case 20:
			return dependency_list_aux_sempred((Dependency_list_auxContext)_localctx, predIndex);
		case 25:
			return head_sempred((HeadContext)_localctx, predIndex);
		case 27:
			return disjunction_sempred((DisjunctionContext)_localctx, predIndex);
		case 28:
			return conjunction_sempred((ConjunctionContext)_localctx, predIndex);
		case 33:
			return non_empty_arg_list_sempred((Non_empty_arg_listContext)_localctx, predIndex);
		case 34:
			return arg_sempred((ArgContext)_localctx, predIndex);
		case 39:
			return query_plan_list_sempred((Query_plan_listContext)_localctx, predIndex);
		case 41:
			return non_empty_plan_order_list_sempred((Non_empty_plan_order_listContext)_localctx, predIndex);
		case 43:
			return component_head_sempred((Component_headContext)_localctx, predIndex);
		case 46:
			return component_param_list_sempred((Component_param_listContext)_localctx, predIndex);
		case 47:
			return component_body_sempred((Component_bodyContext)_localctx, predIndex);
		case 51:
			return non_empty_functor_arg_type_list_sempred((Non_empty_functor_arg_type_listContext)_localctx, predIndex);
		case 57:
			return relation_directive_list_sempred((Relation_directive_listContext)_localctx, predIndex);
		case 58:
			return non_empty_key_value_pairs_sempred((Non_empty_key_value_pairsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean non_empty_macro_args_sempred(Non_empty_macro_argsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean macro_arg_sempred(Macro_argContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 29);
		case 2:
			return precpred(_ctx, 28);
		case 3:
			return precpred(_ctx, 27);
		case 4:
			return precpred(_ctx, 26);
		case 5:
			return precpred(_ctx, 25);
		case 6:
			return precpred(_ctx, 24);
		case 7:
			return precpred(_ctx, 23);
		case 8:
			return precpred(_ctx, 18);
		case 9:
			return precpred(_ctx, 17);
		case 10:
			return precpred(_ctx, 16);
		case 11:
			return precpred(_ctx, 15);
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 13);
		case 14:
			return precpred(_ctx, 12);
		case 15:
			return precpred(_ctx, 11);
		case 16:
			return precpred(_ctx, 10);
		case 17:
			return precpred(_ctx, 9);
		case 18:
			return precpred(_ctx, 8);
		case 19:
			return precpred(_ctx, 7);
		case 20:
			return precpred(_ctx, 6);
		case 21:
			return precpred(_ctx, 5);
		case 22:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean unit_sempred(UnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 9);
		case 24:
			return precpred(_ctx, 8);
		case 25:
			return precpred(_ctx, 7);
		case 26:
			return precpred(_ctx, 6);
		case 27:
			return precpred(_ctx, 5);
		case 28:
			return precpred(_ctx, 4);
		case 29:
			return precpred(_ctx, 3);
		case 30:
			return precpred(_ctx, 2);
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean qualified_name_sempred(Qualified_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean union_type_list_sempred(Union_type_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean adt_branch_list_sempred(Adt_branch_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_names_sempred(Relation_namesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_attributes_sempred(Non_empty_attributesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_tags_sempred(Relation_tagsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 12);
		case 38:
			return precpred(_ctx, 11);
		case 39:
			return precpred(_ctx, 10);
		case 40:
			return precpred(_ctx, 9);
		case 41:
			return precpred(_ctx, 8);
		case 42:
			return precpred(_ctx, 7);
		case 43:
			return precpred(_ctx, 6);
		case 44:
			return precpred(_ctx, 5);
		case 45:
			return precpred(_ctx, 4);
		case 46:
			return precpred(_ctx, 3);
		case 47:
			return precpred(_ctx, 2);
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_attribute_names_sempred(Non_empty_attribute_namesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean dependency_list_aux_sempred(Dependency_list_auxContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean head_sempred(HeadContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean disjunction_sempred(DisjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conjunction_sempred(ConjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_arg_list_sempred(Non_empty_arg_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arg_sempred(ArgContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 17);
		case 56:
			return precpred(_ctx, 16);
		case 57:
			return precpred(_ctx, 15);
		case 58:
			return precpred(_ctx, 14);
		case 59:
			return precpred(_ctx, 13);
		case 60:
			return precpred(_ctx, 12);
		case 61:
			return precpred(_ctx, 11);
		case 62:
			return precpred(_ctx, 10);
		case 63:
			return precpred(_ctx, 9);
		case 64:
			return precpred(_ctx, 8);
		case 65:
			return precpred(_ctx, 7);
		case 66:
			return precpred(_ctx, 6);
		case 67:
			return precpred(_ctx, 5);
		case 68:
			return precpred(_ctx, 4);
		case 69:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean query_plan_list_sempred(Query_plan_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 70:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_plan_order_list_sempred(Non_empty_plan_order_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 71:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean component_head_sempred(Component_headContext _localctx, int predIndex) {
		switch (predIndex) {
		case 72:
			return precpred(_ctx, 2);
		case 73:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean component_param_list_sempred(Component_param_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 74:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean component_body_sempred(Component_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 75:
			return precpred(_ctx, 8);
		case 76:
			return precpred(_ctx, 7);
		case 77:
			return precpred(_ctx, 6);
		case 78:
			return precpred(_ctx, 5);
		case 79:
			return precpred(_ctx, 4);
		case 80:
			return precpred(_ctx, 3);
		case 81:
			return precpred(_ctx, 2);
		case 82:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_functor_arg_type_list_sempred(Non_empty_functor_arg_type_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 83:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_directive_list_sempred(Relation_directive_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 84:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_key_value_pairs_sempred(Non_empty_key_value_pairsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 85:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001d\u03df\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u007f\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u0083\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u008b\b\u0002\n\u0002\f\u0002\u008e\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00e8\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u012c"+
		"\b\u0003\n\u0003\f\u0003\u012f\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u0147\b\u0005\n\u0005\f\u0005\u014a\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u014f\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0154\b\u0006\n\u0006\f\u0006\u0157\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u016f\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0177\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u017f\b\t\n\t\f\t\u0182"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u018a\b\n"+
		"\n\n\f\n\u018d\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0197\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u01a5\b\r\n\r\f\r\u01a8\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01b0"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u01b8\b\u000f\n\u000f\f\u000f\u01bb\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u01da\b\u0011"+
		"\n\u0011\f\u0011\u01dd\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u01e2\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01e7"+
		"\b\u0012\n\u0012\f\u0012\u01ea\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u01f1\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01f9\b\u0014"+
		"\n\u0014\f\u0014\u01fc\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0201\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0208\b\u0016\u0003\u0016\u020a\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u021f\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u022c\b\u0019\n\u0019\f\u0019\u022f\t\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u0239\b\u001b\n\u001b\f\u001b\u023c\t\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u0244\b\u001c\n\u001c\f\u001c\u0247\t\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u0252\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0282\b\u001f\u0001 \u0001 \u0003 \u0286"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u028e\b!\n!\f!\u0291"+
		"\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u02d2\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u0301\b\"\n\"\f\"\u0304\t\"\u0001#\u0001#\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u030f\b%\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u031e\b\'\n\'\f\'\u0321\t\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0003(\u0329\b(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0005)\u0331\b)\n)\f)\u0334\t)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0005+\u0345\b+\n+\f+\u0348\t+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0003-\u0352\b-\u0001.\u0001.\u0001.\u0003.\u0357\b.\u0001"+
		".\u0001.\u0001.\u0005.\u035c\b.\n.\f.\u035f\t.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0005/\u0373\b/\n/\f/\u0376\t/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00031\u038e\b1\u00012\u00012\u00032\u0392\b2\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00053\u039a\b3\n3\f3\u039d\t3\u00014\u00014\u00014\u0001"+
		"4\u00034\u03a3\b4\u00015\u00015\u00015\u00015\u00015\u00035\u03aa\b5\u0001"+
		"6\u00016\u00016\u00017\u00017\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00038\u03bb\b8\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00059\u03c3\b9\n9\f9\u03c6\t9\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0005:\u03d2\b:\n:\f:\u03d5"+
		"\t:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u03dd\b;\u0001;\u0000"+
		"\u0018\u0004\u0006\n\f\u0012\u0014\u001a\u001e\"$(268BDNRV\\^frt<\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\u0000\u0003\u0002"+
		"\u0000\u001e\":=\u0003\u0000\u001d\u001d1267\u0001\u0000\u0004\u0007\u0459"+
		"\u0000~\u0001\u0000\u0000\u0000\u0002\u0082\u0001\u0000\u0000\u0000\u0004"+
		"\u0084\u0001\u0000\u0000\u0000\u0006\u00e7\u0001\u0000\u0000\u0000\b\u0130"+
		"\u0001\u0000\u0000\u0000\n\u0133\u0001\u0000\u0000\u0000\f\u014e\u0001"+
		"\u0000\u0000\u0000\u000e\u016e\u0001\u0000\u0000\u0000\u0010\u0176\u0001"+
		"\u0000\u0000\u0000\u0012\u0178\u0001\u0000\u0000\u0000\u0014\u0183\u0001"+
		"\u0000\u0000\u0000\u0016\u0196\u0001\u0000\u0000\u0000\u0018\u0198\u0001"+
		"\u0000\u0000\u0000\u001a\u019e\u0001\u0000\u0000\u0000\u001c\u01af\u0001"+
		"\u0000\u0000\u0000\u001e\u01b1\u0001\u0000\u0000\u0000 \u01bc\u0001\u0000"+
		"\u0000\u0000\"\u01c0\u0001\u0000\u0000\u0000$\u01e1\u0001\u0000\u0000"+
		"\u0000&\u01f0\u0001\u0000\u0000\u0000(\u01f2\u0001\u0000\u0000\u0000*"+
		"\u0200\u0001\u0000\u0000\u0000,\u0209\u0001\u0000\u0000\u0000.\u021e\u0001"+
		"\u0000\u0000\u00000\u0220\u0001\u0000\u0000\u00002\u0225\u0001\u0000\u0000"+
		"\u00004\u0230\u0001\u0000\u0000\u00006\u0232\u0001\u0000\u0000\u00008"+
		"\u023d\u0001\u0000\u0000\u0000:\u0251\u0001\u0000\u0000\u0000<\u0253\u0001"+
		"\u0000\u0000\u0000>\u0281\u0001\u0000\u0000\u0000@\u0285\u0001\u0000\u0000"+
		"\u0000B\u0287\u0001\u0000\u0000\u0000D\u02d1\u0001\u0000\u0000\u0000F"+
		"\u0305\u0001\u0000\u0000\u0000H\u0307\u0001\u0000\u0000\u0000J\u030e\u0001"+
		"\u0000\u0000\u0000L\u0310\u0001\u0000\u0000\u0000N\u0313\u0001\u0000\u0000"+
		"\u0000P\u0328\u0001\u0000\u0000\u0000R\u032a\u0001\u0000\u0000\u0000T"+
		"\u0335\u0001\u0000\u0000\u0000V\u033a\u0001\u0000\u0000\u0000X\u0349\u0001"+
		"\u0000\u0000\u0000Z\u0351\u0001\u0000\u0000\u0000\\\u0356\u0001\u0000"+
		"\u0000\u0000^\u0360\u0001\u0000\u0000\u0000`\u0377\u0001\u0000\u0000\u0000"+
		"b\u038d\u0001\u0000\u0000\u0000d\u0391\u0001\u0000\u0000\u0000f\u0393"+
		"\u0001\u0000\u0000\u0000h\u03a2\u0001\u0000\u0000\u0000j\u03a9\u0001\u0000"+
		"\u0000\u0000l\u03ab\u0001\u0000\u0000\u0000n\u03ae\u0001\u0000\u0000\u0000"+
		"p\u03ba\u0001\u0000\u0000\u0000r\u03bc\u0001\u0000\u0000\u0000t\u03c7"+
		"\u0001\u0000\u0000\u0000v\u03dc\u0001\u0000\u0000\u0000x\u007f\u0005d"+
		"\u0000\u0000yz\u0005d\u0000\u0000z{\u0005E\u0000\u0000{|\u0003\u0002\u0001"+
		"\u0000|}\u0005F\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~x\u0001\u0000"+
		"\u0000\u0000~y\u0001\u0000\u0000\u0000\u007f\u0001\u0001\u0000\u0000\u0000"+
		"\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u0083\u0003\u0004\u0002\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0003\u0001\u0000\u0000\u0000\u0084\u0085\u0006\u0002\uffff\uffff"+
		"\u0000\u0085\u0086\u0003\u0006\u0003\u0000\u0086\u008c\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\n\u0001\u0000\u0000\u0088\u0089\u0005G\u0000\u0000"+
		"\u0089\u008b\u0003\u0006\u0003\u0000\u008a\u0087\u0001\u0000\u0000\u0000"+
		"\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0005\u0001\u0000\u0000\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0006\u0003\uffff\uffff"+
		"\u0000\u0090\u00e8\u0005_\u0000\u0000\u0091\u00e8\u0005\\\u0000\u0000"+
		"\u0092\u00e8\u0005]\u0000\u0000\u0093\u00e8\u0005[\u0000\u0000\u0094\u00e8"+
		"\u00055\u0000\u0000\u0095\u00e8\u0005B\u0000\u0000\u0096\u0097\u0005\u0010"+
		"\u0000\u0000\u0097\u0098\u0005E\u0000\u0000\u0098\u00e8\u0005F\u0000\u0000"+
		"\u0099\u00e8\u0005^\u0000\u0000\u009a\u00e8\u00054\u0000\u0000\u009b\u009c"+
		"\u0005@\u0000\u0000\u009c\u009d\u0003\u0002\u0001\u0000\u009d\u009e\u0005"+
		"A\u0000\u0000\u009e\u00e8\u0001\u0000\u0000\u0000\u009f\u00a0\u0005B\u0000"+
		"\u0000\u00a0\u00a1\u0003\f\u0006\u0000\u00a1\u00a2\u0005E\u0000\u0000"+
		"\u00a2\u00a3\u0003\u0002\u0001\u0000\u00a3\u00a4\u0005F\u0000\u0000\u00a4"+
		"\u00e8\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005E\u0000\u0000\u00a6\u00a7"+
		"\u0003\u0006\u0003\u0000\u00a7\u00a8\u0005F\u0000\u0000\u00a8\u00e8\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u00053\u0000\u0000\u00aa\u00ab\u0005E\u0000"+
		"\u0000\u00ab\u00ac\u0003\u0006\u0003\u0000\u00ac\u00ad\u0005G\u0000\u0000"+
		"\u00ad\u00ae\u0003\f\u0006\u0000\u00ae\u00af\u0005F\u0000\u0000\u00af"+
		"\u00e8\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005Q\u0000\u0000\u00b1\u00b2"+
		"\u0005^\u0000\u0000\u00b2\u00b3\u0005E\u0000\u0000\u00b3\u00b4\u0003\u0002"+
		"\u0001\u0000\u00b4\u00b5\u0005F\u0000\u0000\u00b5\u00e8\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0003F#\u0000\u00b7\u00b8\u0005E\u0000\u0000\u00b8"+
		"\u00b9\u0003\u0002\u0001\u0000\u00b9\u00ba\u0005F\u0000\u0000\u00ba\u00e8"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003H$\u0000\u00bc\u00bd\u0005E"+
		"\u0000\u0000\u00bd\u00be\u0003\u0006\u0003\u0000\u00be\u00bf\u0005G\u0000"+
		"\u0000\u00bf\u00c0\u0003B!\u0000\u00c0\u00c1\u0005F\u0000\u0000\u00c1"+
		"\u00e8\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005D\u0000\u0000\u00c3\u00e8"+
		"\u0003\u0006\u0003\"\u00c4\u00c5\u0005\u0014\u0000\u0000\u00c5\u00e8\u0003"+
		"\u0006\u0003!\u00c6\u00c7\u0005\u001b\u0000\u0000\u00c7\u00e8\u0003\u0006"+
		"\u0003 \u00c8\u00c9\u0005O\u0000\u0000\u00c9\u00e8\u0003\u0006\u0003\u001f"+
		"\u00ca\u00cb\u0005Q\u0000\u0000\u00cb\u00e8\u0005^\u0000\u0000\u00cc\u00cd"+
		"\u0005\u001c\u0000\u0000\u00cd\u00ce\u0005E\u0000\u0000\u00ce\u00cf\u0003"+
		"\u0006\u0003\u0000\u00cf\u00d0\u0005G\u0000\u0000\u00d0\u00d1\u0003\u0006"+
		"\u0003\u0000\u00d1\u00d2\u0005F\u0000\u0000\u00d2\u00e8\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0005$\u0000\u0000\u00d4\u00d5\u0005E\u0000\u0000\u00d5"+
		"\u00d6\u0003\u0006\u0003\u0000\u00d6\u00d7\u0005G\u0000\u0000\u00d7\u00d8"+
		"\u0003\u0006\u0003\u0000\u00d8\u00d9\u0005F\u0000\u0000\u00d9\u00e8\u0001"+
		"\u0000\u0000\u0000\u00da\u00e8\u00058\u0000\u0000\u00db\u00e8\u00059\u0000"+
		"\u0000\u00dc\u00dd\u0003H$\u0000\u00dd\u00de\u0003\u0002\u0001\u0000\u00de"+
		"\u00df\u0005H\u0000\u0000\u00df\u00e0\u0003J%\u0000\u00e0\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0005^\u0000\u0000\u00e2\u00e3\u0005E\u0000"+
		"\u0000\u00e3\u00e4\u0003\u0002\u0001\u0000\u00e4\u00e5\u0005F\u0000\u0000"+
		"\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e8\u0003\u0000\u0000\u0000"+
		"\u00e7\u008f\u0001\u0000\u0000\u0000\u00e7\u0091\u0001\u0000\u0000\u0000"+
		"\u00e7\u0092\u0001\u0000\u0000\u0000\u00e7\u0093\u0001\u0000\u0000\u0000"+
		"\u00e7\u0094\u0001\u0000\u0000\u0000\u00e7\u0095\u0001\u0000\u0000\u0000"+
		"\u00e7\u0096\u0001\u0000\u0000\u0000\u00e7\u0099\u0001\u0000\u0000\u0000"+
		"\u00e7\u009a\u0001\u0000\u0000\u0000\u00e7\u009b\u0001\u0000\u0000\u0000"+
		"\u00e7\u009f\u0001\u0000\u0000\u0000\u00e7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00a9\u0001\u0000\u0000\u0000\u00e7\u00b0\u0001\u0000\u0000\u0000"+
		"\u00e7\u00b6\u0001\u0000\u0000\u0000\u00e7\u00bb\u0001\u0000\u0000\u0000"+
		"\u00e7\u00c2\u0001\u0000\u0000\u0000\u00e7\u00c4\u0001\u0000\u0000\u0000"+
		"\u00e7\u00c6\u0001\u0000\u0000\u0000\u00e7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00e7\u00ca\u0001\u0000\u0000\u0000\u00e7\u00cc\u0001\u0000\u0000\u0000"+
		"\u00e7\u00d3\u0001\u0000\u0000\u0000\u00e7\u00da\u0001\u0000\u0000\u0000"+
		"\u00e7\u00db\u0001\u0000\u0000\u0000\u00e7\u00dc\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e1\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e8\u012d\u0001\u0000\u0000\u0000\u00e9\u00ea\n\u001d\u0000\u0000\u00ea"+
		"\u00eb\u0005I\u0000\u0000\u00eb\u012c\u0003\u0006\u0003\u001e\u00ec\u00ed"+
		"\n\u001c\u0000\u0000\u00ed\u00ee\u0005W\u0000\u0000\u00ee\u012c\u0003"+
		"\u0006\u0003\u001d\u00ef\u00f0\n\u001b\u0000\u0000\u00f0\u00f1\u0005X"+
		"\u0000\u0000\u00f1\u012c\u0003\u0006\u0003\u001c\u00f2\u00f3\n\u001a\u0000"+
		"\u0000\u00f3\u00f4\u0005K\u0000\u0000\u00f4\u012c\u0003\u0006\u0003\u001b"+
		"\u00f5\u00f6\n\u0019\u0000\u0000\u00f6\u00f7\u0005L\u0000\u0000\u00f7"+
		"\u012c\u0003\u0006\u0003\u001a\u00f8\u00f9\n\u0018\u0000\u0000\u00f9\u00fa"+
		"\u0005N\u0000\u0000\u00fa\u012c\u0003\u0006\u0003\u0019\u00fb\u00fc\n"+
		"\u0017\u0000\u0000\u00fc\u00fd\u0005M\u0000\u0000\u00fd\u012c\u0003\u0006"+
		"\u0003\u0018\u00fe\u00ff\n\u0012\u0000\u0000\u00ff\u0100\u0005C\u0000"+
		"\u0000\u0100\u012c\u0003\u0006\u0003\u0013\u0101\u0102\n\u0011\u0000\u0000"+
		"\u0102\u0103\u0005D\u0000\u0000\u0103\u012c\u0003\u0006\u0003\u0012\u0104"+
		"\u0105\n\u0010\u0000\u0000\u0105\u0106\u0005P\u0000\u0000\u0106\u012c"+
		"\u0003\u0006\u0003\u0011\u0107\u0108\n\u000f\u0000\u0000\u0108\u0109\u0005"+
		"R\u0000\u0000\u0109\u012c\u0003\u0006\u0003\u0010\u010a\u010b\n\u000e"+
		"\u0000\u0000\u010b\u010c\u0005T\u0000\u0000\u010c\u012c\u0003\u0006\u0003"+
		"\u000f\u010d\u010e\n\r\u0000\u0000\u010e\u010f\u0005S\u0000\u0000\u010f"+
		"\u012c\u0003\u0006\u0003\u000e\u0110\u0111\n\f\u0000\u0000\u0111\u0112"+
		"\u0005\u0018\u0000\u0000\u0112\u012c\u0003\u0006\u0003\r\u0113\u0114\n"+
		"\u000b\u0000\u0000\u0114\u0115\u0005\u0019\u0000\u0000\u0115\u012c\u0003"+
		"\u0006\u0003\f\u0116\u0117\n\n\u0000\u0000\u0117\u0118\u0005\u001a\u0000"+
		"\u0000\u0118\u012c\u0003\u0006\u0003\u000b\u0119\u011a\n\t\u0000\u0000"+
		"\u011a\u011b\u0005\u0011\u0000\u0000\u011b\u012c\u0003\u0006\u0003\n\u011c"+
		"\u011d\n\b\u0000\u0000\u011d\u011e\u0005\u0012\u0000\u0000\u011e\u012c"+
		"\u0003\u0006\u0003\t\u011f\u0120\n\u0007\u0000\u0000\u0120\u0121\u0005"+
		"\u0013\u0000\u0000\u0121\u012c\u0003\u0006\u0003\b\u0122\u0123\n\u0006"+
		"\u0000\u0000\u0123\u0124\u0005\u0015\u0000\u0000\u0124\u012c\u0003\u0006"+
		"\u0003\u0007\u0125\u0126\n\u0005\u0000\u0000\u0126\u0127\u0005\u0016\u0000"+
		"\u0000\u0127\u012c\u0003\u0006\u0003\u0006\u0128\u0129\n\u0004\u0000\u0000"+
		"\u0129\u012a\u0005\u0017\u0000\u0000\u012a\u012c\u0003\u0006\u0003\u0005"+
		"\u012b\u00e9\u0001\u0000\u0000\u0000\u012b\u00ec\u0001\u0000\u0000\u0000"+
		"\u012b\u00ef\u0001\u0000\u0000\u0000\u012b\u00f2\u0001\u0000\u0000\u0000"+
		"\u012b\u00f5\u0001\u0000\u0000\u0000\u012b\u00f8\u0001\u0000\u0000\u0000"+
		"\u012b\u00fb\u0001\u0000\u0000\u0000\u012b\u00fe\u0001\u0000\u0000\u0000"+
		"\u012b\u0101\u0001\u0000\u0000\u0000\u012b\u0104\u0001\u0000\u0000\u0000"+
		"\u012b\u0107\u0001\u0000\u0000\u0000\u012b\u010a\u0001\u0000\u0000\u0000"+
		"\u012b\u010d\u0001\u0000\u0000\u0000\u012b\u0110\u0001\u0000\u0000\u0000"+
		"\u012b\u0113\u0001\u0000\u0000\u0000\u012b\u0116\u0001\u0000\u0000\u0000"+
		"\u012b\u0119\u0001\u0000\u0000\u0000\u012b\u011c\u0001\u0000\u0000\u0000"+
		"\u012b\u011f\u0001\u0000\u0000\u0000\u012b\u0122\u0001\u0000\u0000\u0000"+
		"\u012b\u0125\u0001\u0000\u0000\u0000\u012b\u0128\u0001\u0000\u0000\u0000"+
		"\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0007\u0001\u0000\u0000\u0000"+
		"\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0131\u0003\n\u0005\u0000\u0131"+
		"\u0132\u0005\u0000\u0000\u0001\u0132\t\u0001\u0000\u0000\u0000\u0133\u0148"+
		"\u0006\u0005\uffff\uffff\u0000\u0134\u0135\n\t\u0000\u0000\u0135\u0147"+
		"\u0003l6\u0000\u0136\u0137\n\b\u0000\u0000\u0137\u0147\u0003.\u0017\u0000"+
		"\u0138\u0139\n\u0007\u0000\u0000\u0139\u0147\u0003,\u0016\u0000\u013a"+
		"\u013b\n\u0006\u0000\u0000\u013b\u0147\u0003T*\u0000\u013c\u013d\n\u0005"+
		"\u0000\u0000\u013d\u0147\u0003`0\u0000\u013e\u013f\n\u0004\u0000\u0000"+
		"\u013f\u0147\u0003j5\u0000\u0140\u0141\n\u0003\u0000\u0000\u0141\u0147"+
		"\u0003\u000e\u0007\u0000\u0142\u0143\n\u0002\u0000\u0000\u0143\u0147\u0003"+
		"b1\u0000\u0144\u0145\n\u0001\u0000\u0000\u0145\u0147\u0003\u0018\f\u0000"+
		"\u0146\u0134\u0001\u0000\u0000\u0000\u0146\u0136\u0001\u0000\u0000\u0000"+
		"\u0146\u0138\u0001\u0000\u0000\u0000\u0146\u013a\u0001\u0000\u0000\u0000"+
		"\u0146\u013c\u0001\u0000\u0000\u0000\u0146\u013e\u0001\u0000\u0000\u0000"+
		"\u0146\u0140\u0001\u0000\u0000\u0000\u0146\u0142\u0001\u0000\u0000\u0000"+
		"\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000"+
		"\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000"+
		"\u0149\u000b\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0006\u0006\uffff\uffff\u0000\u014c\u014f\u0005^\u0000\u0000"+
		"\u014d\u014f\u0003\u0000\u0000\u0000\u014e\u014b\u0001\u0000\u0000\u0000"+
		"\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0155\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\n\u0002\u0000\u0000\u0151\u0152\u0005Z\u0000\u0000\u0152"+
		"\u0154\u0005^\u0000\u0000\u0153\u0150\u0001\u0000\u0000\u0000\u0154\u0157"+
		"\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156"+
		"\u0001\u0000\u0000\u0000\u0156\r\u0001\u0000\u0000\u0000\u0157\u0155\u0001"+
		"\u0000\u0000\u0000\u0158\u0159\u0005\b\u0000\u0000\u0159\u015a\u0005^"+
		"\u0000\u0000\u015a\u015b\u0005J\u0000\u0000\u015b\u016f\u0003\f\u0006"+
		"\u0000\u015c\u015d\u0005\b\u0000\u0000\u015d\u015e\u0005^\u0000\u0000"+
		"\u015e\u015f\u0005N\u0000\u0000\u015f\u016f\u0003\u0012\t\u0000\u0160"+
		"\u0161\u0005\b\u0000\u0000\u0161\u0162\u0005^\u0000\u0000\u0162\u0163"+
		"\u0005N\u0000\u0000\u0163\u016f\u0003\u0010\b\u0000\u0164\u0165\u0005"+
		"\b\u0000\u0000\u0165\u0166\u0005^\u0000\u0000\u0166\u0167\u0005N\u0000"+
		"\u0000\u0167\u016f\u0003\u0014\n\u0000\u0168\u0169\u0005\u000b\u0000\u0000"+
		"\u0169\u016f\u0005^\u0000\u0000\u016a\u016b\u0005\f\u0000\u0000\u016b"+
		"\u016f\u0005^\u0000\u0000\u016c\u016d\u0005\b\u0000\u0000\u016d\u016f"+
		"\u0005^\u0000\u0000\u016e\u0158\u0001\u0000\u0000\u0000\u016e\u015c\u0001"+
		"\u0000\u0000\u0000\u016e\u0160\u0001\u0000\u0000\u0000\u016e\u0164\u0001"+
		"\u0000\u0000\u0000\u016e\u0168\u0001\u0000\u0000\u0000\u016e\u016a\u0001"+
		"\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u000f\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0005@\u0000\u0000\u0171\u0177\u0005A\u0000"+
		"\u0000\u0172\u0173\u0005@\u0000\u0000\u0173\u0174\u0003\u001e\u000f\u0000"+
		"\u0174\u0175\u0005A\u0000\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176"+
		"\u0170\u0001\u0000\u0000\u0000\u0176\u0172\u0001\u0000\u0000\u0000\u0177"+
		"\u0011\u0001\u0000\u0000\u0000\u0178\u0179\u0006\t\uffff\uffff\u0000\u0179"+
		"\u017a\u0003\f\u0006\u0000\u017a\u0180\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\n\u0001\u0000\u0000\u017c\u017d\u0005?\u0000\u0000\u017d\u017f\u0003"+
		"\f\u0006\u0000\u017e\u017b\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000"+
		"\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000"+
		"\u0000\u0000\u0181\u0013\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0006\n\uffff\uffff\u0000\u0184\u0185\u0003\u0016"+
		"\u000b\u0000\u0185\u018b\u0001\u0000\u0000\u0000\u0186\u0187\n\u0001\u0000"+
		"\u0000\u0187\u0188\u0005?\u0000\u0000\u0188\u018a\u0003\u0016\u000b\u0000"+
		"\u0189\u0186\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000\u0000"+
		"\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000"+
		"\u018c\u0015\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000"+
		"\u018e\u018f\u0005^\u0000\u0000\u018f\u0190\u0005U\u0000\u0000\u0190\u0197"+
		"\u0005V\u0000\u0000\u0191\u0192\u0005^\u0000\u0000\u0192\u0193\u0005U"+
		"\u0000\u0000\u0193\u0194\u0003\u001e\u000f\u0000\u0194\u0195\u0005V\u0000"+
		"\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u018e\u0001\u0000\u0000"+
		"\u0000\u0196\u0191\u0001\u0000\u0000\u0000\u0197\u0017\u0001\u0000\u0000"+
		"\u0000\u0198\u0199\u0005\u0002\u0000\u0000\u0199\u019a\u0003\u001a\r\u0000"+
		"\u019a\u019b\u0003\u001c\u000e\u0000\u019b\u019c\u0003\"\u0011\u0000\u019c"+
		"\u019d\u0003*\u0015\u0000\u019d\u0019\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0006\r\uffff\uffff\u0000\u019f\u01a0\u0005^\u0000\u0000\u01a0\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\n\u0001\u0000\u0000\u01a2\u01a3\u0005"+
		"G\u0000\u0000\u01a3\u01a5\u0005^\u0000\u0000\u01a4\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u001b\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005E\u0000\u0000"+
		"\u01aa\u01b0\u0005F\u0000\u0000\u01ab\u01ac\u0005E\u0000\u0000\u01ac\u01ad"+
		"\u0003\u001e\u000f\u0000\u01ad\u01ae\u0005F\u0000\u0000\u01ae\u01b0\u0001"+
		"\u0000\u0000\u0000\u01af\u01a9\u0001\u0000\u0000\u0000\u01af\u01ab\u0001"+
		"\u0000\u0000\u0000\u01b0\u001d\u0001\u0000\u0000\u0000\u01b1\u01b2\u0006"+
		"\u000f\uffff\uffff\u0000\u01b2\u01b3\u0003 \u0010\u0000\u01b3\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b5\n\u0001\u0000\u0000\u01b5\u01b6\u0005G"+
		"\u0000\u0000\u01b6\u01b8\u0003 \u0010\u0000\u01b7\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u001f\u0001\u0000\u0000"+
		"\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005^\u0000\u0000"+
		"\u01bd\u01be\u0005H\u0000\u0000\u01be\u01bf\u0003\f\u0006\u0000\u01bf"+
		"!\u0001\u0000\u0000\u0000\u01c0\u01db\u0006\u0011\uffff\uffff\u0000\u01c1"+
		"\u01c2\n\f\u0000\u0000\u01c2\u01da\u0005\'\u0000\u0000\u01c3\u01c4\n\u000b"+
		"\u0000\u0000\u01c4\u01da\u0005*\u0000\u0000\u01c5\u01c6\n\n\u0000\u0000"+
		"\u01c6\u01da\u0005+\u0000\u0000\u01c7\u01c8\n\t\u0000\u0000\u01c8\u01da"+
		"\u0005,\u0000\u0000\u01c9\u01ca\n\b\u0000\u0000\u01ca\u01da\u0005-\u0000"+
		"\u0000\u01cb\u01cc\n\u0007\u0000\u0000\u01cc\u01da\u0005.\u0000\u0000"+
		"\u01cd\u01ce\n\u0006\u0000\u0000\u01ce\u01da\u00050\u0000\u0000\u01cf"+
		"\u01d0\n\u0005\u0000\u0000\u01d0\u01da\u0005/\u0000\u0000\u01d1\u01d2"+
		"\n\u0004\u0000\u0000\u01d2\u01da\u0005)\u0000\u0000\u01d3\u01d4\n\u0003"+
		"\u0000\u0000\u01d4\u01da\u0005%\u0000\u0000\u01d5\u01d6\n\u0002\u0000"+
		"\u0000\u01d6\u01da\u0005&\u0000\u0000\u01d7\u01d8\n\u0001\u0000\u0000"+
		"\u01d8\u01da\u0005(\u0000\u0000\u01d9\u01c1\u0001\u0000\u0000\u0000\u01d9"+
		"\u01c3\u0001\u0000\u0000\u0000\u01d9\u01c5\u0001\u0000\u0000\u0000\u01d9"+
		"\u01c7\u0001\u0000\u0000\u0000\u01d9\u01c9\u0001\u0000\u0000\u0000\u01d9"+
		"\u01cb\u0001\u0000\u0000\u0000\u01d9\u01cd\u0001\u0000\u0000\u0000\u01d9"+
		"\u01cf\u0001\u0000\u0000\u0000\u01d9\u01d1\u0001\u0000\u0000\u0000\u01d9"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d9\u01d5\u0001\u0000\u0000\u0000\u01d9"+
		"\u01d7\u0001\u0000\u0000\u0000\u01da\u01dd\u0001\u0000\u0000\u0000\u01db"+
		"\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc"+
		"#\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0006\u0012\uffff\uffff\u0000\u01df\u01e2\u0005^\u0000\u0000\u01e0\u01e2"+
		"\u0003\u0000\u0000\u0000\u01e1\u01de\u0001\u0000\u0000\u0000\u01e1\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e8\u0001\u0000\u0000\u0000\u01e3\u01e4"+
		"\n\u0002\u0000\u0000\u01e4\u01e5\u0005G\u0000\u0000\u01e5\u01e7\u0005"+
		"^\u0000\u0000\u01e6\u01e3\u0001\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e9%\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000"+
		"\u0000\u01eb\u01f1\u0005^\u0000\u0000\u01ec\u01ed\u0005E\u0000\u0000\u01ed"+
		"\u01ee\u0003$\u0012\u0000\u01ee\u01ef\u0005F\u0000\u0000\u01ef\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f0\u01eb\u0001\u0000\u0000\u0000\u01f0\u01ec\u0001"+
		"\u0000\u0000\u0000\u01f1\'\u0001\u0000\u0000\u0000\u01f2\u01f3\u0006\u0014"+
		"\uffff\uffff\u0000\u01f3\u01f4\u0003&\u0013\u0000\u01f4\u01fa\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\n\u0001\u0000\u0000\u01f6\u01f7\u0005G\u0000"+
		"\u0000\u01f7\u01f9\u0003&\u0013\u0000\u01f8\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fc\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb)\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fd\u0201\u0001\u0000\u0000\u0000\u01fe"+
		"\u01ff\u0005>\u0000\u0000\u01ff\u0201\u0003(\u0014\u0000\u0200\u01fd\u0001"+
		"\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0201+\u0001\u0000"+
		"\u0000\u0000\u0202\u0203\u0003<\u001e\u0000\u0203\u0204\u0005Z\u0000\u0000"+
		"\u0204\u020a\u0001\u0000\u0000\u0000\u0205\u0207\u0003\u0000\u0000\u0000"+
		"\u0206\u0208\u0005Z\u0000\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0207"+
		"\u0208\u0001\u0000\u0000\u0000\u0208\u020a\u0001\u0000\u0000\u0000\u0209"+
		"\u0202\u0001\u0000\u0000\u0000\u0209\u0205\u0001\u0000\u0000\u0000\u020a"+
		"-\u0001\u0000\u0000\u0000\u020b\u021f\u00030\u0018\u0000\u020c\u020d\u0003"+
		"0\u0018\u0000\u020d\u020e\u0003L&\u0000\u020e\u021f\u0001\u0000\u0000"+
		"\u0000\u020f\u0210\u0003<\u001e\u0000\u0210\u0211\u0005K\u0000\u0000\u0211"+
		"\u0212\u0003<\u001e\u0000\u0212\u0213\u0005Y\u0000\u0000\u0213\u0214\u0003"+
		"4\u001a\u0000\u0214\u0215\u0005Z\u0000\u0000\u0215\u021f\u0001\u0000\u0000"+
		"\u0000\u0216\u0217\u0003<\u001e\u0000\u0217\u0218\u0005K\u0000\u0000\u0218"+
		"\u0219\u0003<\u001e\u0000\u0219\u021a\u0005Y\u0000\u0000\u021a\u021b\u0003"+
		"4\u001a\u0000\u021b\u021c\u0005Z\u0000\u0000\u021c\u021d\u0003L&\u0000"+
		"\u021d\u021f\u0001\u0000\u0000\u0000\u021e\u020b\u0001\u0000\u0000\u0000"+
		"\u021e\u020c\u0001\u0000\u0000\u0000\u021e\u020f\u0001\u0000\u0000\u0000"+
		"\u021e\u0216\u0001\u0000\u0000\u0000\u021f/\u0001\u0000\u0000\u0000\u0220"+
		"\u0221\u00032\u0019\u0000\u0221\u0222\u0005Y\u0000\u0000\u0222\u0223\u0003"+
		"4\u001a\u0000\u0223\u0224\u0005Z\u0000\u0000\u02241\u0001\u0000\u0000"+
		"\u0000\u0225\u0226\u0006\u0019\uffff\uffff\u0000\u0226\u0227\u0003<\u001e"+
		"\u0000\u0227\u022d\u0001\u0000\u0000\u0000\u0228\u0229\n\u0001\u0000\u0000"+
		"\u0229\u022a\u0005G\u0000\u0000\u022a\u022c\u0003<\u001e\u0000\u022b\u0228"+
		"\u0001\u0000\u0000\u0000\u022c\u022f\u0001\u0000\u0000\u0000\u022d\u022b"+
		"\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e3\u0001"+
		"\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u0230\u0231\u0003"+
		"6\u001b\u0000\u02315\u0001\u0000\u0000\u0000\u0232\u0233\u0006\u001b\uffff"+
		"\uffff\u0000\u0233\u0234\u00038\u001c\u0000\u0234\u023a\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\n\u0001\u0000\u0000\u0236\u0237\u0005I\u0000\u0000"+
		"\u0237\u0239\u00038\u001c\u0000\u0238\u0235\u0001\u0000\u0000\u0000\u0239"+
		"\u023c\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a"+
		"\u023b\u0001\u0000\u0000\u0000\u023b7\u0001\u0000\u0000\u0000\u023c\u023a"+
		"\u0001\u0000\u0000\u0000\u023d\u023e\u0006\u001c\uffff\uffff\u0000\u023e"+
		"\u023f\u0003:\u001d\u0000\u023f\u0245\u0001\u0000\u0000\u0000\u0240\u0241"+
		"\n\u0001\u0000\u0000\u0241\u0242\u0005G\u0000\u0000\u0242\u0244\u0003"+
		":\u001d\u0000\u0243\u0240\u0001\u0000\u0000\u0000\u0244\u0247\u0001\u0000"+
		"\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000"+
		"\u0000\u0000\u02469\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000"+
		"\u0000\u0248\u0252\u0003<\u001e\u0000\u0249\u0252\u0003>\u001f\u0000\u024a"+
		"\u024b\u0005E\u0000\u0000\u024b\u024c\u00036\u001b\u0000\u024c\u024d\u0005"+
		"F\u0000\u0000\u024d\u0252\u0001\u0000\u0000\u0000\u024e\u024f\u0005O\u0000"+
		"\u0000\u024f\u0252\u0003:\u001d\u0000\u0250\u0252\u0003\u0000\u0000\u0000"+
		"\u0251\u0248\u0001\u0000\u0000\u0000\u0251\u0249\u0001\u0000\u0000\u0000"+
		"\u0251\u024a\u0001\u0000\u0000\u0000\u0251\u024e\u0001\u0000\u0000\u0000"+
		"\u0251\u0250\u0001\u0000\u0000\u0000\u0252;\u0001\u0000\u0000\u0000\u0253"+
		"\u0254\u0003\f\u0006\u0000\u0254\u0255\u0005E\u0000\u0000\u0255\u0256"+
		"\u0003@ \u0000\u0256\u0257\u0005F\u0000\u0000\u0257=\u0001\u0000\u0000"+
		"\u0000\u0258\u0259\u0003D\"\u0000\u0259\u025a\u0005W\u0000\u0000\u025a"+
		"\u025b\u0003D\"\u0000\u025b\u0282\u0001\u0000\u0000\u0000\u025c\u025d"+
		"\u0003D\"\u0000\u025d\u025e\u0005X\u0000\u0000\u025e\u025f\u0003D\"\u0000"+
		"\u025f\u0282\u0001\u0000\u0000\u0000\u0260\u0261\u0003D\"\u0000\u0261"+
		"\u0262\u0005K\u0000\u0000\u0262\u0263\u0003D\"\u0000\u0263\u0282\u0001"+
		"\u0000\u0000\u0000\u0264\u0265\u0003D\"\u0000\u0265\u0266\u0005L\u0000"+
		"\u0000\u0266\u0267\u0003D\"\u0000\u0267\u0282\u0001\u0000\u0000\u0000"+
		"\u0268\u0269\u0003D\"\u0000\u0269\u026a\u0005N\u0000\u0000\u026a\u026b"+
		"\u0003D\"\u0000\u026b\u0282\u0001\u0000\u0000\u0000\u026c\u026d\u0003"+
		"D\"\u0000\u026d\u026e\u0005M\u0000\u0000\u026e\u026f\u0003D\"\u0000\u026f"+
		"\u0282\u0001\u0000\u0000\u0000\u0270\u0271\u0005\u001c\u0000\u0000\u0271"+
		"\u0272\u0005E\u0000\u0000\u0272\u0273\u0003D\"\u0000\u0273\u0274\u0005"+
		"G\u0000\u0000\u0274\u0275\u0003D\"\u0000\u0275\u0276\u0005F\u0000\u0000"+
		"\u0276\u0282\u0001\u0000\u0000\u0000\u0277\u0278\u0005$\u0000\u0000\u0278"+
		"\u0279\u0005E\u0000\u0000\u0279\u027a\u0003D\"\u0000\u027a\u027b\u0005"+
		"G\u0000\u0000\u027b\u027c\u0003D\"\u0000\u027c\u027d\u0005F\u0000\u0000"+
		"\u027d\u0282\u0001\u0000\u0000\u0000\u027e\u0282\u00058\u0000\u0000\u027f"+
		"\u0282\u00059\u0000\u0000\u0280\u0282\u0003\u0000\u0000\u0000\u0281\u0258"+
		"\u0001\u0000\u0000\u0000\u0281\u025c\u0001\u0000\u0000\u0000\u0281\u0260"+
		"\u0001\u0000\u0000\u0000\u0281\u0264\u0001\u0000\u0000\u0000\u0281\u0268"+
		"\u0001\u0000\u0000\u0000\u0281\u026c\u0001\u0000\u0000\u0000\u0281\u0270"+
		"\u0001\u0000\u0000\u0000\u0281\u0277\u0001\u0000\u0000\u0000\u0281\u027e"+
		"\u0001\u0000\u0000\u0000\u0281\u027f\u0001\u0000\u0000\u0000\u0281\u0280"+
		"\u0001\u0000\u0000\u0000\u0282?\u0001\u0000\u0000\u0000\u0283\u0286\u0001"+
		"\u0000\u0000\u0000\u0284\u0286\u0003B!\u0000\u0285\u0283\u0001\u0000\u0000"+
		"\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0286A\u0001\u0000\u0000\u0000"+
		"\u0287\u0288\u0006!\uffff\uffff\u0000\u0288\u0289\u0003D\"\u0000\u0289"+
		"\u028f\u0001\u0000\u0000\u0000\u028a\u028b\n\u0001\u0000\u0000\u028b\u028c"+
		"\u0005G\u0000\u0000\u028c\u028e\u0003D\"\u0000\u028d\u028a\u0001\u0000"+
		"\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f\u028d\u0001\u0000"+
		"\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290C\u0001\u0000\u0000"+
		"\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u0293\u0006\"\uffff\uffff"+
		"\u0000\u0293\u02d2\u0005_\u0000\u0000\u0294\u02d2\u0005\\\u0000\u0000"+
		"\u0295\u02d2\u0005]\u0000\u0000\u0296\u02d2\u0005[\u0000\u0000\u0297\u02d2"+
		"\u00055\u0000\u0000\u0298\u02d2\u0005B\u0000\u0000\u0299\u029a\u0005\u0010"+
		"\u0000\u0000\u029a\u029b\u0005E\u0000\u0000\u029b\u02d2\u0005F\u0000\u0000"+
		"\u029c\u02d2\u0005^\u0000\u0000\u029d\u02d2\u00054\u0000\u0000\u029e\u029f"+
		"\u0005@\u0000\u0000\u029f\u02a0\u0003@ \u0000\u02a0\u02a1\u0005A\u0000"+
		"\u0000\u02a1\u02d2\u0001\u0000\u0000\u0000\u02a2\u02a3\u0005B\u0000\u0000"+
		"\u02a3\u02a4\u0003\f\u0006\u0000\u02a4\u02a5\u0005E\u0000\u0000\u02a5"+
		"\u02a6\u0003@ \u0000\u02a6\u02a7\u0005F\u0000\u0000\u02a7\u02d2\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a9\u0005E\u0000\u0000\u02a9\u02aa\u0003D\""+
		"\u0000\u02aa\u02ab\u0005F\u0000\u0000\u02ab\u02d2\u0001\u0000\u0000\u0000"+
		"\u02ac\u02ad\u00053\u0000\u0000\u02ad\u02ae\u0005E\u0000\u0000\u02ae\u02af"+
		"\u0003D\"\u0000\u02af\u02b0\u0005G\u0000\u0000\u02b0\u02b1\u0003\f\u0006"+
		"\u0000\u02b1\u02b2\u0005F\u0000\u0000\u02b2\u02d2\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b4\u0005Q\u0000\u0000\u02b4\u02b5\u0005^\u0000\u0000\u02b5\u02b6"+
		"\u0005E\u0000\u0000\u02b6\u02b7\u0003@ \u0000\u02b7\u02b8\u0005F\u0000"+
		"\u0000\u02b8\u02d2\u0001\u0000\u0000\u0000\u02b9\u02ba\u0003F#\u0000\u02ba"+
		"\u02bb\u0005E\u0000\u0000\u02bb\u02bc\u0003@ \u0000\u02bc\u02bd\u0005"+
		"F\u0000\u0000\u02bd\u02d2\u0001\u0000\u0000\u0000\u02be\u02bf\u0003H$"+
		"\u0000\u02bf\u02c0\u0005E\u0000\u0000\u02c0\u02c1\u0003D\"\u0000\u02c1"+
		"\u02c2\u0005G\u0000\u0000\u02c2\u02c3\u0003B!\u0000\u02c3\u02c4\u0005"+
		"F\u0000\u0000\u02c4\u02d2\u0001\u0000\u0000\u0000\u02c5\u02c6\u0005D\u0000"+
		"\u0000\u02c6\u02d2\u0003D\"\u0014\u02c7\u02c8\u0005\u0014\u0000\u0000"+
		"\u02c8\u02d2\u0003D\"\u0013\u02c9\u02ca\u0005\u001b\u0000\u0000\u02ca"+
		"\u02d2\u0003D\"\u0012\u02cb\u02cc\u0003H$\u0000\u02cc\u02cd\u0003@ \u0000"+
		"\u02cd\u02ce\u0005H\u0000\u0000\u02ce\u02cf\u0003J%\u0000\u02cf\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d0\u02d2\u0003\u0000\u0000\u0000\u02d1\u0292"+
		"\u0001\u0000\u0000\u0000\u02d1\u0294\u0001\u0000\u0000\u0000\u02d1\u0295"+
		"\u0001\u0000\u0000\u0000\u02d1\u0296\u0001\u0000\u0000\u0000\u02d1\u0297"+
		"\u0001\u0000\u0000\u0000\u02d1\u0298\u0001\u0000\u0000\u0000\u02d1\u0299"+
		"\u0001\u0000\u0000\u0000\u02d1\u029c\u0001\u0000\u0000\u0000\u02d1\u029d"+
		"\u0001\u0000\u0000\u0000\u02d1\u029e\u0001\u0000\u0000\u0000\u02d1\u02a2"+
		"\u0001\u0000\u0000\u0000\u02d1\u02a8\u0001\u0000\u0000\u0000\u02d1\u02ac"+
		"\u0001\u0000\u0000\u0000\u02d1\u02b3\u0001\u0000\u0000\u0000\u02d1\u02b9"+
		"\u0001\u0000\u0000\u0000\u02d1\u02be\u0001\u0000\u0000\u0000\u02d1\u02c5"+
		"\u0001\u0000\u0000\u0000\u02d1\u02c7\u0001\u0000\u0000\u0000\u02d1\u02c9"+
		"\u0001\u0000\u0000\u0000\u02d1\u02cb\u0001\u0000\u0000\u0000\u02d1\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d2\u0302\u0001\u0000\u0000\u0000\u02d3\u02d4"+
		"\n\u0011\u0000\u0000\u02d4\u02d5\u0005C\u0000\u0000\u02d5\u0301\u0003"+
		"D\"\u0012\u02d6\u02d7\n\u0010\u0000\u0000\u02d7\u02d8\u0005D\u0000\u0000"+
		"\u02d8\u0301\u0003D\"\u0011\u02d9\u02da\n\u000f\u0000\u0000\u02da\u02db"+
		"\u0005P\u0000\u0000\u02db\u0301\u0003D\"\u0010\u02dc\u02dd\n\u000e\u0000"+
		"\u0000\u02dd\u02de\u0005R\u0000\u0000\u02de\u0301\u0003D\"\u000f\u02df"+
		"\u02e0\n\r\u0000\u0000\u02e0\u02e1\u0005T\u0000\u0000\u02e1\u0301\u0003"+
		"D\"\u000e\u02e2\u02e3\n\f\u0000\u0000\u02e3\u02e4\u0005S\u0000\u0000\u02e4"+
		"\u0301\u0003D\"\r\u02e5\u02e6\n\u000b\u0000\u0000\u02e6\u02e7\u0005\u0018"+
		"\u0000\u0000\u02e7\u0301\u0003D\"\f\u02e8\u02e9\n\n\u0000\u0000\u02e9"+
		"\u02ea\u0005\u0019\u0000\u0000\u02ea\u0301\u0003D\"\u000b\u02eb\u02ec"+
		"\n\t\u0000\u0000\u02ec\u02ed\u0005\u001a\u0000\u0000\u02ed\u0301\u0003"+
		"D\"\n\u02ee\u02ef\n\b\u0000\u0000\u02ef\u02f0\u0005\u0011\u0000\u0000"+
		"\u02f0\u0301\u0003D\"\t\u02f1\u02f2\n\u0007\u0000\u0000\u02f2\u02f3\u0005"+
		"\u0012\u0000\u0000\u02f3\u0301\u0003D\"\b\u02f4\u02f5\n\u0006\u0000\u0000"+
		"\u02f5\u02f6\u0005\u0013\u0000\u0000\u02f6\u0301\u0003D\"\u0007\u02f7"+
		"\u02f8\n\u0005\u0000\u0000\u02f8\u02f9\u0005\u0015\u0000\u0000\u02f9\u0301"+
		"\u0003D\"\u0006\u02fa\u02fb\n\u0004\u0000\u0000\u02fb\u02fc\u0005\u0016"+
		"\u0000\u0000\u02fc\u0301\u0003D\"\u0005\u02fd\u02fe\n\u0003\u0000\u0000"+
		"\u02fe\u02ff\u0005\u0017\u0000\u0000\u02ff\u0301\u0003D\"\u0004\u0300"+
		"\u02d3\u0001\u0000\u0000\u0000\u0300\u02d6\u0001\u0000\u0000\u0000\u0300"+
		"\u02d9\u0001\u0000\u0000\u0000\u0300\u02dc\u0001\u0000\u0000\u0000\u0300"+
		"\u02df\u0001\u0000\u0000\u0000\u0300\u02e2\u0001\u0000\u0000\u0000\u0300"+
		"\u02e5\u0001\u0000\u0000\u0000\u0300\u02e8\u0001\u0000\u0000\u0000\u0300"+
		"\u02eb\u0001\u0000\u0000\u0000\u0300\u02ee\u0001\u0000\u0000\u0000\u0300"+
		"\u02f1\u0001\u0000\u0000\u0000\u0300\u02f4\u0001\u0000\u0000\u0000\u0300"+
		"\u02f7\u0001\u0000\u0000\u0000\u0300\u02fa\u0001\u0000\u0000\u0000\u0300"+
		"\u02fd\u0001\u0000\u0000\u0000\u0301\u0304\u0001\u0000\u0000\u0000\u0302"+
		"\u0300\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000\u0303"+
		"E\u0001\u0000\u0000\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0305\u0306"+
		"\u0007\u0000\u0000\u0000\u0306G\u0001\u0000\u0000\u0000\u0307\u0308\u0007"+
		"\u0001\u0000\u0000\u0308I\u0001\u0000\u0000\u0000\u0309\u030a\u0005U\u0000"+
		"\u0000\u030a\u030b\u00034\u001a\u0000\u030b\u030c\u0005V\u0000\u0000\u030c"+
		"\u030f\u0001\u0000\u0000\u0000\u030d\u030f\u0003<\u001e\u0000\u030e\u0309"+
		"\u0001\u0000\u0000\u0000\u030e\u030d\u0001\u0000\u0000\u0000\u030fK\u0001"+
		"\u0000\u0000\u0000\u0310\u0311\u0005\u000f\u0000\u0000\u0311\u0312\u0003"+
		"N\'\u0000\u0312M\u0001\u0000\u0000\u0000\u0313\u0314\u0006\'\uffff\uffff"+
		"\u0000\u0314\u0315\u0005[\u0000\u0000\u0315\u0316\u0005H\u0000\u0000\u0316"+
		"\u0317\u0003P(\u0000\u0317\u031f\u0001\u0000\u0000\u0000\u0318\u0319\n"+
		"\u0001\u0000\u0000\u0319\u031a\u0005G\u0000\u0000\u031a\u031b\u0005[\u0000"+
		"\u0000\u031b\u031c\u0005H\u0000\u0000\u031c\u031e\u0003P(\u0000\u031d"+
		"\u0318\u0001\u0000\u0000\u0000\u031e\u0321\u0001\u0000\u0000\u0000\u031f"+
		"\u031d\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320"+
		"O\u0001\u0000\u0000\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0322\u0323"+
		"\u0005E\u0000\u0000\u0323\u0329\u0005F\u0000\u0000\u0324\u0325\u0005E"+
		"\u0000\u0000\u0325\u0326\u0003R)\u0000\u0326\u0327\u0005F\u0000\u0000"+
		"\u0327\u0329\u0001\u0000\u0000\u0000\u0328\u0322\u0001\u0000\u0000\u0000"+
		"\u0328\u0324\u0001\u0000\u0000\u0000\u0329Q\u0001\u0000\u0000\u0000\u032a"+
		"\u032b\u0006)\uffff\uffff\u0000\u032b\u032c\u0005[\u0000\u0000\u032c\u0332"+
		"\u0001\u0000\u0000\u0000\u032d\u032e\n\u0001\u0000\u0000\u032e\u032f\u0005"+
		"G\u0000\u0000\u032f\u0331\u0005[\u0000\u0000\u0330\u032d\u0001\u0000\u0000"+
		"\u0000\u0331\u0334\u0001\u0000\u0000\u0000\u0332\u0330\u0001\u0000\u0000"+
		"\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333S\u0001\u0000\u0000\u0000"+
		"\u0334\u0332\u0001\u0000\u0000\u0000\u0335\u0336\u0003V+\u0000\u0336\u0337"+
		"\u0005U\u0000\u0000\u0337\u0338\u0003^/\u0000\u0338\u0339\u0005V\u0000"+
		"\u0000\u0339U\u0001\u0000\u0000\u0000\u033a\u033b\u0006+\uffff\uffff\u0000"+
		"\u033b\u033c\u0005\t\u0000\u0000\u033c\u033d\u0003X,\u0000\u033d\u0346"+
		"\u0001\u0000\u0000\u0000\u033e\u033f\n\u0002\u0000\u0000\u033f\u0340\u0005"+
		"H\u0000\u0000\u0340\u0345\u0003X,\u0000\u0341\u0342\n\u0001\u0000\u0000"+
		"\u0342\u0343\u0005G\u0000\u0000\u0343\u0345\u0003X,\u0000\u0344\u033e"+
		"\u0001\u0000\u0000\u0000\u0344\u0341\u0001\u0000\u0000\u0000\u0345\u0348"+
		"\u0001\u0000\u0000\u0000\u0346\u0344\u0001\u0000\u0000\u0000\u0346\u0347"+
		"\u0001\u0000\u0000\u0000\u0347W\u0001\u0000\u0000\u0000\u0348\u0346\u0001"+
		"\u0000\u0000\u0000\u0349\u034a\u0005^\u0000\u0000\u034a\u034b\u0003Z-"+
		"\u0000\u034bY\u0001\u0000\u0000\u0000\u034c\u0352\u0001\u0000\u0000\u0000"+
		"\u034d\u034e\u0005W\u0000\u0000\u034e\u034f\u0003\\.\u0000\u034f\u0350"+
		"\u0005X\u0000\u0000\u0350\u0352\u0001\u0000\u0000\u0000\u0351\u034c\u0001"+
		"\u0000\u0000\u0000\u0351\u034d\u0001\u0000\u0000\u0000\u0352[\u0001\u0000"+
		"\u0000\u0000\u0353\u0354\u0006.\uffff\uffff\u0000\u0354\u0357\u0005^\u0000"+
		"\u0000\u0355\u0357\u0003\u0000\u0000\u0000\u0356\u0353\u0001\u0000\u0000"+
		"\u0000\u0356\u0355\u0001\u0000\u0000\u0000\u0357\u035d\u0001\u0000\u0000"+
		"\u0000\u0358\u0359\n\u0002\u0000\u0000\u0359\u035a\u0005G\u0000\u0000"+
		"\u035a\u035c\u0005^\u0000\u0000\u035b\u0358\u0001\u0000\u0000\u0000\u035c"+
		"\u035f\u0001\u0000\u0000\u0000\u035d\u035b\u0001\u0000\u0000\u0000\u035d"+
		"\u035e\u0001\u0000\u0000\u0000\u035e]\u0001\u0000\u0000\u0000\u035f\u035d"+
		"\u0001\u0000\u0000\u0000\u0360\u0374\u0006/\uffff\uffff\u0000\u0361\u0362"+
		"\n\b\u0000\u0000\u0362\u0373\u0003l6\u0000\u0363\u0364\n\u0007\u0000\u0000"+
		"\u0364\u0373\u0003.\u0017\u0000\u0365\u0366\n\u0006\u0000\u0000\u0366"+
		"\u0373\u0003,\u0016\u0000\u0367\u0368\n\u0005\u0000\u0000\u0368\u0369"+
		"\u0005\r\u0000\u0000\u0369\u0373\u0005^\u0000\u0000\u036a\u036b\n\u0004"+
		"\u0000\u0000\u036b\u0373\u0003`0\u0000\u036c\u036d\n\u0003\u0000\u0000"+
		"\u036d\u0373\u0003T*\u0000\u036e\u036f\n\u0002\u0000\u0000\u036f\u0373"+
		"\u0003\u000e\u0007\u0000\u0370\u0371\n\u0001\u0000\u0000\u0371\u0373\u0003"+
		"\u0018\f\u0000\u0372\u0361\u0001\u0000\u0000\u0000\u0372\u0363\u0001\u0000"+
		"\u0000\u0000\u0372\u0365\u0001\u0000\u0000\u0000\u0372\u0367\u0001\u0000"+
		"\u0000\u0000\u0372\u036a\u0001\u0000\u0000\u0000\u0372\u036c\u0001\u0000"+
		"\u0000\u0000\u0372\u036e\u0001\u0000\u0000\u0000\u0372\u0370\u0001\u0000"+
		"\u0000\u0000\u0373\u0376\u0001\u0000\u0000\u0000\u0374\u0372\u0001\u0000"+
		"\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375_\u0001\u0000\u0000"+
		"\u0000\u0376\u0374\u0001\u0000\u0000\u0000\u0377\u0378\u0005\n\u0000\u0000"+
		"\u0378\u0379\u0005^\u0000\u0000\u0379\u037a\u0005N\u0000\u0000\u037a\u037b"+
		"\u0003X,\u0000\u037ba\u0001\u0000\u0000\u0000\u037c\u037d\u0005\u0003"+
		"\u0000\u0000\u037d\u037e\u0005^\u0000\u0000\u037e\u037f\u0005E\u0000\u0000"+
		"\u037f\u0380\u0003d2\u0000\u0380\u0381\u0005F\u0000\u0000\u0381\u0382"+
		"\u0005H\u0000\u0000\u0382\u0383\u0003\f\u0006\u0000\u0383\u038e\u0001"+
		"\u0000\u0000\u0000\u0384\u0385\u0005\u0003\u0000\u0000\u0385\u0386\u0005"+
		"^\u0000\u0000\u0386\u0387\u0005E\u0000\u0000\u0387\u0388\u0003d2\u0000"+
		"\u0388\u0389\u0005F\u0000\u0000\u0389\u038a\u0005H\u0000\u0000\u038a\u038b"+
		"\u0003\f\u0006\u0000\u038b\u038c\u0005#\u0000\u0000\u038c\u038e\u0001"+
		"\u0000\u0000\u0000\u038d\u037c\u0001\u0000\u0000\u0000\u038d\u0384\u0001"+
		"\u0000\u0000\u0000\u038ec\u0001\u0000\u0000\u0000\u038f\u0392\u0001\u0000"+
		"\u0000\u0000\u0390\u0392\u0003f3\u0000\u0391\u038f\u0001\u0000\u0000\u0000"+
		"\u0391\u0390\u0001\u0000\u0000\u0000\u0392e\u0001\u0000\u0000\u0000\u0393"+
		"\u0394\u00063\uffff\uffff\u0000\u0394\u0395\u0003h4\u0000\u0395\u039b"+
		"\u0001\u0000\u0000\u0000\u0396\u0397\n\u0001\u0000\u0000\u0397\u0398\u0005"+
		"G\u0000\u0000\u0398\u039a\u0003h4\u0000\u0399\u0396\u0001\u0000\u0000"+
		"\u0000\u039a\u039d\u0001\u0000\u0000\u0000\u039b\u0399\u0001\u0000\u0000"+
		"\u0000\u039b\u039c\u0001\u0000\u0000\u0000\u039cg\u0001\u0000\u0000\u0000"+
		"\u039d\u039b\u0001\u0000\u0000\u0000\u039e\u03a3\u0003\f\u0006\u0000\u039f"+
		"\u03a0\u0005^\u0000\u0000\u03a0\u03a1\u0005H\u0000\u0000\u03a1\u03a3\u0003"+
		"\f\u0006\u0000\u03a2\u039e\u0001\u0000\u0000\u0000\u03a2\u039f\u0001\u0000"+
		"\u0000\u0000\u03a3i\u0001\u0000\u0000\u0000\u03a4\u03a5\u0005\u000e\u0000"+
		"\u0000\u03a5\u03a6\u0005_\u0000\u0000\u03a6\u03aa\u0005_\u0000\u0000\u03a7"+
		"\u03a8\u0005\u000e\u0000\u0000\u03a8\u03aa\u0005_\u0000\u0000\u03a9\u03a4"+
		"\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03aak\u0001"+
		"\u0000\u0000\u0000\u03ab\u03ac\u0003n7\u0000\u03ac\u03ad\u0003p8\u0000"+
		"\u03adm\u0001\u0000\u0000\u0000\u03ae\u03af\u0007\u0002\u0000\u0000\u03af"+
		"o\u0001\u0000\u0000\u0000\u03b0\u03bb\u0003r9\u0000\u03b1\u03b2\u0003"+
		"r9\u0000\u03b2\u03b3\u0005E\u0000\u0000\u03b3\u03b4\u0005F\u0000\u0000"+
		"\u03b4\u03bb\u0001\u0000\u0000\u0000\u03b5\u03b6\u0003r9\u0000\u03b6\u03b7"+
		"\u0005E\u0000\u0000\u03b7\u03b8\u0003t:\u0000\u03b8\u03b9\u0005F\u0000"+
		"\u0000\u03b9\u03bb\u0001\u0000\u0000\u0000\u03ba\u03b0\u0001\u0000\u0000"+
		"\u0000\u03ba\u03b1\u0001\u0000\u0000\u0000\u03ba\u03b5\u0001\u0000\u0000"+
		"\u0000\u03bbq\u0001\u0000\u0000\u0000\u03bc\u03bd\u00069\uffff\uffff\u0000"+
		"\u03bd\u03be\u0003\f\u0006\u0000\u03be\u03c4\u0001\u0000\u0000\u0000\u03bf"+
		"\u03c0\n\u0001\u0000\u0000\u03c0\u03c1\u0005G\u0000\u0000\u03c1\u03c3"+
		"\u0003\f\u0006\u0000\u03c2\u03bf\u0001\u0000\u0000\u0000\u03c3\u03c6\u0001"+
		"\u0000\u0000\u0000\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c4\u03c5\u0001"+
		"\u0000\u0000\u0000\u03c5s\u0001\u0000\u0000\u0000\u03c6\u03c4\u0001\u0000"+
		"\u0000\u0000\u03c7\u03c8\u0006:\uffff\uffff\u0000\u03c8\u03c9\u0005^\u0000"+
		"\u0000\u03c9\u03ca\u0005N\u0000\u0000\u03ca\u03cb\u0003v;\u0000\u03cb"+
		"\u03d3\u0001\u0000\u0000\u0000\u03cc\u03cd\n\u0001\u0000\u0000\u03cd\u03ce"+
		"\u0005G\u0000\u0000\u03ce\u03cf\u0005^\u0000\u0000\u03cf\u03d0\u0005N"+
		"\u0000\u0000\u03d0\u03d2\u0003v;\u0000\u03d1\u03cc\u0001\u0000\u0000\u0000"+
		"\u03d2\u03d5\u0001\u0000\u0000\u0000\u03d3\u03d1\u0001\u0000\u0000\u0000"+
		"\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4u\u0001\u0000\u0000\u0000\u03d5"+
		"\u03d3\u0001\u0000\u0000\u0000\u03d6\u03dd\u0005_\u0000\u0000\u03d7\u03dd"+
		"\u0005^\u0000\u0000\u03d8\u03dd\u0005[\u0000\u0000\u03d9\u03dd\u00058"+
		"\u0000\u0000\u03da\u03dd\u00059\u0000\u0000\u03db\u03dd\u0003\u0000\u0000"+
		"\u0000\u03dc\u03d6\u0001\u0000\u0000\u0000\u03dc\u03d7\u0001\u0000\u0000"+
		"\u0000\u03dc\u03d8\u0001\u0000\u0000\u0000\u03dc\u03d9\u0001\u0000\u0000"+
		"\u0000\u03dc\u03da\u0001\u0000\u0000\u0000\u03dc\u03db\u0001\u0000\u0000"+
		"\u0000\u03ddw\u0001\u0000\u0000\u0000:~\u0082\u008c\u00e7\u012b\u012d"+
		"\u0146\u0148\u014e\u0155\u016e\u0176\u0180\u018b\u0196\u01a6\u01af\u01b9"+
		"\u01d9\u01db\u01e1\u01e8\u01f0\u01fa\u0200\u0207\u0209\u021e\u022d\u023a"+
		"\u0245\u0251\u0281\u0285\u028f\u02d1\u0300\u0302\u030e\u031f\u0328\u0332"+
		"\u0344\u0346\u0351\u0356\u035d\u0372\u0374\u038d\u0391\u039b\u03a2\u03a9"+
		"\u03ba\u03c4\u03d3\u03dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}