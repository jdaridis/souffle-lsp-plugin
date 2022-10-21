// Generated from /home/john/IdeaProjects/Souffle_Ide_Plugin/grammar/Souffle.g4 by ANTLR 4.10.1
package parsing.souffle;
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
		INCLUDE=98, PREPROCESSOR_PRAGMA=99, PREPROCESSOR_DEFINE=100, PREPROCESSOR_MULTILINE=101, 
		PREPROCESSOR_MULTILINE_CONT=102, PREPROCESSOR=103, PREPROCESSOR_ID=104;
	public static final int
		RULE_program = 0, RULE_unit = 1, RULE_qualified_name = 2, RULE_type_decl = 3, 
		RULE_record_type_list = 4, RULE_union_type_list = 5, RULE_adt_branch_list = 6, 
		RULE_adt_branch = 7, RULE_relation_decl = 8, RULE_relation_names = 9, 
		RULE_attributes_list = 10, RULE_non_empty_attributes = 11, RULE_attribute = 12, 
		RULE_relation_tags = 13, RULE_non_empty_attribute_names = 14, RULE_dependency = 15, 
		RULE_dependency_list_aux = 16, RULE_dependency_list = 17, RULE_fact = 18, 
		RULE_souffle_rule = 19, RULE_rule_def = 20, RULE_head = 21, RULE_body = 22, 
		RULE_disjunction = 23, RULE_conjunction = 24, RULE_term = 25, RULE_atom = 26, 
		RULE_constraint = 27, RULE_arg_list = 28, RULE_non_empty_arg_list = 29, 
		RULE_arg = 30, RULE_functor_built_in = 31, RULE_aggregate_func = 32, RULE_aggregate_body = 33, 
		RULE_query_plan = 34, RULE_query_plan_list = 35, RULE_plan_order = 36, 
		RULE_non_empty_plan_order_list = 37, RULE_component_decl = 38, RULE_component_head = 39, 
		RULE_component_type = 40, RULE_component_type_params = 41, RULE_component_param_list = 42, 
		RULE_component_body = 43, RULE_component_init = 44, RULE_functor_decl = 45, 
		RULE_functor_arg_type_list = 46, RULE_non_empty_functor_arg_type_list = 47, 
		RULE_functor_attribute = 48, RULE_pragma = 49, RULE_directive_head = 50, 
		RULE_directive_head_decl = 51, RULE_directive_list = 52, RULE_relation_directive_list = 53, 
		RULE_non_empty_key_value_pairs = 54, RULE_kvp_value = 55, RULE_preprocessor_macro = 56, 
		RULE_macro_args = 57, RULE_non_empty_macro_args = 58, RULE_macro_arg = 59;
	private static String[] makeRuleNames() {
		return new String[] {
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
			"relation_directive_list", "non_empty_key_value_pairs", "kvp_value", 
			"preprocessor_macro", "macro_args", "non_empty_macro_args", "macro_arg"
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
			"FLOAT", "UNSIGNED", "IDENT", "STRING", "COMMENT", "LINE_COMMENT", "INCLUDE", 
			"PREPROCESSOR_PRAGMA", "PREPROCESSOR_DEFINE", "PREPROCESSOR_MULTILINE", 
			"PREPROCESSOR_MULTILINE_CONT", "PREPROCESSOR", "PREPROCESSOR_ID"
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
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			unit(0);
			setState(121);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_unit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(124);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(125);
						directive_head();
						}
						break;
					case 2:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(126);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(127);
						souffle_rule();
						}
						break;
					case 3:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(128);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(129);
						fact();
						}
						break;
					case 4:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(130);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(131);
						component_decl();
						}
						break;
					case 5:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						component_init();
						}
						break;
					case 6:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(134);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(135);
						pragma();
						}
						break;
					case 7:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(136);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(137);
						type_decl();
						}
						break;
					case 8:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(138);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(139);
						functor_decl();
						}
						break;
					case 9:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(140);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(141);
						relation_decl();
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_qualified_name, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(148);
				match(IDENT);
				}
				break;
			case PREPROCESSOR_ID:
				{
				setState(149);
				preprocessor_macro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Qualified_nameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_qualified_name);
					setState(152);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(153);
					match(DOT);
					setState(154);
					match(IDENT);
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		enterRule(_localctx, 6, RULE_type_decl);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(TYPE);
				setState(161);
				match(IDENT);
				setState(162);
				match(SUBTYPE);
				setState(163);
				qualified_name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(TYPE);
				setState(165);
				match(IDENT);
				setState(166);
				match(EQUALS);
				setState(167);
				union_type_list(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(TYPE);
				setState(169);
				match(IDENT);
				setState(170);
				match(EQUALS);
				setState(171);
				record_type_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(TYPE);
				setState(173);
				match(IDENT);
				setState(174);
				match(EQUALS);
				setState(175);
				adt_branch_list(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				match(NUMBER_TYPE);
				setState(177);
				match(IDENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				match(SYMBOL_TYPE);
				setState(179);
				match(IDENT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(180);
				match(TYPE);
				setState(181);
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
		enterRule(_localctx, 8, RULE_record_type_list);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(LBRACKET);
				setState(185);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(LBRACKET);
				setState(187);
				non_empty_attributes(0);
				setState(188);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_union_type_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(193);
			qualified_name(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Union_type_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_union_type_list);
					setState(195);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(196);
					match(PIPE);
					setState(197);
					qualified_name(0);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_adt_branch_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(204);
			adt_branch();
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Adt_branch_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_adt_branch_list);
					setState(206);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(207);
					match(PIPE);
					setState(208);
					adt_branch();
					}
					} 
				}
				setState(213);
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
		enterRule(_localctx, 14, RULE_adt_branch);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(IDENT);
				setState(215);
				match(LBRACE);
				setState(216);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(IDENT);
				setState(218);
				match(LBRACE);
				setState(219);
				non_empty_attributes(0);
				setState(220);
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
		enterRule(_localctx, 16, RULE_relation_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(DECL);
			setState(225);
			relation_names(0);
			setState(226);
			attributes_list();
			setState(227);
			relation_tags(0);
			setState(228);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_relation_names, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(231);
			match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Relation_namesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relation_names);
					setState(233);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(234);
					match(COMMA);
					setState(235);
					match(IDENT);
					}
					} 
				}
				setState(240);
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
		enterRule(_localctx, 20, RULE_attributes_list);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(LPAREN);
				setState(242);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(LPAREN);
				setState(244);
				non_empty_attributes(0);
				setState(245);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_non_empty_attributes, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(250);
			attribute();
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_attributesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_attributes);
					setState(252);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(253);
					match(COMMA);
					setState(254);
					attribute();
					}
					} 
				}
				setState(259);
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
		enterRule(_localctx, 24, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(IDENT);
			setState(261);
			match(COLON);
			setState(262);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_relation_tags, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(265);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(266);
						match(OVERRIDABLE_QUALIFIER);
						}
						break;
					case 2:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(267);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(268);
						match(INLINE_QUALIFIER);
						}
						break;
					case 3:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(269);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(270);
						match(NO_INLINE_QUALIFIER);
						}
						break;
					case 4:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(271);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(272);
						match(MAGIC_QUALIFIER);
						}
						break;
					case 5:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(273);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(274);
						match(NO_MAGIC_QUALIFIER);
						}
						break;
					case 6:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(275);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(276);
						match(BRIE_QUALIFIER);
						}
						break;
					case 7:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(277);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(278);
						match(BTREE_QUALIFIER);
						}
						break;
					case 8:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(279);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(280);
						match(BTREE_DELETE_QUALIFIER);
						}
						break;
					case 9:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(281);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(282);
						match(EQREL_QUALIFIER);
						}
						break;
					case 10:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(283);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(284);
						match(OUTPUT_QUALIFIER);
						}
						break;
					case 11:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(285);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(286);
						match(INPUT_QUALIFIER);
						}
						break;
					case 12:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(287);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(288);
						match(PRINTSIZE_QUALIFIER);
						}
						break;
					}
					} 
				}
				setState(293);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_non_empty_attribute_names, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(295);
				match(IDENT);
				}
				break;
			case PREPROCESSOR_ID:
				{
				setState(296);
				preprocessor_macro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_attribute_namesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_attribute_names);
					setState(299);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(300);
					match(COMMA);
					setState(301);
					match(IDENT);
					}
					} 
				}
				setState(306);
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
		enterRule(_localctx, 30, RULE_dependency);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(IDENT);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(LPAREN);
				setState(309);
				non_empty_attribute_names(0);
				setState(310);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_dependency_list_aux, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(315);
			dependency();
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dependency_list_auxContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dependency_list_aux);
					setState(317);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(318);
					match(COMMA);
					setState(319);
					dependency();
					}
					} 
				}
				setState(324);
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
		enterRule(_localctx, 34, RULE_dependency_list);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(CHOICEDOMAIN);
				setState(327);
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
		enterRule(_localctx, 36, RULE_fact);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				atom();
				setState(331);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				preprocessor_macro();
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(334);
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
		enterRule(_localctx, 38, RULE_souffle_rule);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				rule_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				rule_def();
				setState(341);
				query_plan();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				atom();
				setState(344);
				match(LE);
				setState(345);
				atom();
				setState(346);
				match(IF);
				setState(347);
				body();
				setState(348);
				match(DOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				atom();
				setState(351);
				match(LE);
				setState(352);
				atom();
				setState(353);
				match(IF);
				setState(354);
				body();
				setState(355);
				match(DOT);
				setState(356);
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
		enterRule(_localctx, 40, RULE_rule_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			head(0);
			setState(361);
			match(IF);
			setState(362);
			body();
			setState(363);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_head, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(366);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new HeadContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_head);
					setState(368);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(369);
					match(COMMA);
					setState(370);
					atom();
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 44, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_disjunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(379);
			conjunction(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DisjunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_disjunction);
					setState(381);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(382);
					match(SEMICOLON);
					setState(383);
					conjunction(0);
					}
					} 
				}
				setState(388);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_conjunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(390);
			term();
			}
			_ctx.stop = _input.LT(-1);
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConjunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conjunction);
					setState(392);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(393);
					match(COMMA);
					setState(394);
					term();
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 50, RULE_term);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				match(LPAREN);
				setState(403);
				disjunction(0);
				setState(404);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				match(EXCLAMATION);
				setState(407);
				term();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(408);
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
		enterRule(_localctx, 52, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			qualified_name(0);
			setState(412);
			match(LPAREN);
			setState(413);
			arg_list();
			setState(414);
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
		enterRule(_localctx, 54, RULE_constraint);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				arg(0);
				setState(417);
				match(LT);
				setState(418);
				arg(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				arg(0);
				setState(421);
				match(GT);
				setState(422);
				arg(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				arg(0);
				setState(425);
				match(LE);
				setState(426);
				arg(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				arg(0);
				setState(429);
				match(GE);
				setState(430);
				arg(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				arg(0);
				setState(433);
				match(EQUALS);
				setState(434);
				arg(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(436);
				arg(0);
				setState(437);
				match(NE);
				setState(438);
				arg(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(440);
				match(TMATCH);
				setState(441);
				match(LPAREN);
				setState(442);
				arg(0);
				setState(443);
				match(COMMA);
				setState(444);
				arg(0);
				setState(445);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(447);
				match(TCONTAINS);
				setState(448);
				match(LPAREN);
				setState(449);
				arg(0);
				setState(450);
				match(COMMA);
				setState(451);
				arg(0);
				setState(452);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(454);
				match(TRUELIT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(455);
				match(FALSELIT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(456);
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
		enterRule(_localctx, 56, RULE_arg_list);
		try {
			setState(461);
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
				setState(460);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_non_empty_arg_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(464);
			arg(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_arg_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_arg_list);
					setState(466);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(467);
					match(COMMA);
					setState(468);
					arg(0);
					}
					} 
				}
				setState(473);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_arg, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(475);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(476);
				match(FLOAT);
				}
				break;
			case 3:
				{
				setState(477);
				match(UNSIGNED);
				}
				break;
			case 4:
				{
				setState(478);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(479);
				match(UNDERSCORE);
				}
				break;
			case 6:
				{
				setState(480);
				match(DOLLAR);
				}
				break;
			case 7:
				{
				setState(481);
				match(AUTOINC);
				setState(482);
				match(LPAREN);
				setState(483);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(484);
				match(IDENT);
				}
				break;
			case 9:
				{
				setState(485);
				match(NIL);
				}
				break;
			case 10:
				{
				setState(486);
				match(LBRACKET);
				setState(487);
				arg_list();
				setState(488);
				match(RBRACKET);
				}
				break;
			case 11:
				{
				setState(490);
				match(DOLLAR);
				setState(491);
				qualified_name(0);
				setState(492);
				match(LPAREN);
				setState(493);
				arg_list();
				setState(494);
				match(RPAREN);
				}
				break;
			case 12:
				{
				setState(496);
				match(LPAREN);
				setState(497);
				arg(0);
				setState(498);
				match(RPAREN);
				}
				break;
			case 13:
				{
				setState(500);
				match(AS);
				setState(501);
				match(LPAREN);
				setState(502);
				arg(0);
				setState(503);
				match(COMMA);
				setState(504);
				qualified_name(0);
				setState(505);
				match(RPAREN);
				}
				break;
			case 14:
				{
				setState(507);
				match(AT);
				setState(508);
				match(IDENT);
				setState(509);
				match(LPAREN);
				setState(510);
				arg_list();
				setState(511);
				match(RPAREN);
				}
				break;
			case 15:
				{
				setState(513);
				functor_built_in();
				setState(514);
				match(LPAREN);
				setState(515);
				arg_list();
				setState(516);
				match(RPAREN);
				}
				break;
			case 16:
				{
				setState(518);
				aggregate_func();
				setState(519);
				match(LPAREN);
				setState(520);
				arg(0);
				setState(521);
				match(COMMA);
				setState(522);
				non_empty_arg_list(0);
				setState(523);
				match(RPAREN);
				}
				break;
			case 17:
				{
				setState(525);
				match(MINUS);
				setState(526);
				arg(20);
				}
				break;
			case 18:
				{
				setState(527);
				match(BW_NOT);
				setState(528);
				arg(19);
				}
				break;
			case 19:
				{
				setState(529);
				match(L_NOT);
				setState(530);
				arg(18);
				}
				break;
			case 20:
				{
				setState(531);
				aggregate_func();
				setState(532);
				arg_list();
				setState(533);
				match(COLON);
				setState(534);
				aggregate_body();
				}
				break;
			case 21:
				{
				setState(536);
				preprocessor_macro();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(584);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(539);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(540);
						match(PLUS);
						setState(541);
						arg(18);
						}
						break;
					case 2:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(542);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(543);
						match(MINUS);
						setState(544);
						arg(17);
						}
						break;
					case 3:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(545);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(546);
						match(STAR);
						setState(547);
						arg(16);
						}
						break;
					case 4:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(548);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(549);
						match(SLASH);
						setState(550);
						arg(15);
						}
						break;
					case 5:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(551);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(552);
						match(PERCENT);
						setState(553);
						arg(14);
						}
						break;
					case 6:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(554);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(555);
						match(CARET);
						setState(556);
						arg(13);
						}
						break;
					case 7:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(557);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(558);
						match(L_AND);
						setState(559);
						arg(12);
						}
						break;
					case 8:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(560);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(561);
						match(L_OR);
						setState(562);
						arg(11);
						}
						break;
					case 9:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(563);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(564);
						match(L_XOR);
						setState(565);
						arg(10);
						}
						break;
					case 10:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(566);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(567);
						match(BW_AND);
						setState(568);
						arg(9);
						}
						break;
					case 11:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(569);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(570);
						match(BW_OR);
						setState(571);
						arg(8);
						}
						break;
					case 12:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(572);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(573);
						match(BW_XOR);
						setState(574);
						arg(7);
						}
						break;
					case 13:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(575);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(576);
						match(BW_SHIFT_L);
						setState(577);
						arg(6);
						}
						break;
					case 14:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(578);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(579);
						match(BW_SHIFT_R);
						setState(580);
						arg(5);
						}
						break;
					case 15:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(581);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(582);
						match(BW_SHIFT_R_UNSIGNED);
						setState(583);
						arg(4);
						}
						break;
					}
					} 
				}
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 62, RULE_functor_built_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
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
		enterRule(_localctx, 64, RULE_aggregate_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
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
		enterRule(_localctx, 66, RULE_aggregate_body);
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				match(LBRACE);
				setState(594);
				body();
				setState(595);
				match(RBRACE);
				}
				break;
			case IDENT:
			case PREPROCESSOR_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
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
		enterRule(_localctx, 68, RULE_query_plan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(PLAN);
			setState(601);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_query_plan_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(604);
			match(NUMBER);
			setState(605);
			match(COLON);
			setState(606);
			plan_order();
			}
			_ctx.stop = _input.LT(-1);
			setState(615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Query_plan_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_query_plan_list);
					setState(608);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(609);
					match(COMMA);
					setState(610);
					match(NUMBER);
					setState(611);
					match(COLON);
					setState(612);
					plan_order();
					}
					} 
				}
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 72, RULE_plan_order);
		try {
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				match(LPAREN);
				setState(619);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				match(LPAREN);
				setState(621);
				non_empty_plan_order_list(0);
				setState(622);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_non_empty_plan_order_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(627);
			match(NUMBER);
			}
			_ctx.stop = _input.LT(-1);
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_plan_order_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_plan_order_list);
					setState(629);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(630);
					match(COMMA);
					setState(631);
					match(NUMBER);
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 76, RULE_component_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			component_head(0);
			setState(638);
			match(LBRACE);
			setState(639);
			component_body(0);
			setState(640);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_component_head, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(643);
			match(COMPONENT);
			setState(644);
			component_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(652);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new Component_headContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_head);
						setState(646);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(647);
						match(COLON);
						setState(648);
						component_type();
						}
						break;
					case 2:
						{
						_localctx = new Component_headContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_head);
						setState(649);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(650);
						match(COMMA);
						setState(651);
						component_type();
						}
						break;
					}
					} 
				}
				setState(656);
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

	public static class Component_typeContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public Component_type_paramsContext component_type_params() {
			return getRuleContext(Component_type_paramsContext.class,0);
		}
		public TerminalNode PREPROCESSOR_ID() { return getToken(SouffleParser.PREPROCESSOR_ID, 0); }
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
		enterRule(_localctx, 80, RULE_component_type);
		try {
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				match(IDENT);
				setState(658);
				component_type_params();
				}
				break;
			case PREPROCESSOR_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				match(PREPROCESSOR_ID);
				setState(660);
				component_type_params();
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
		enterRule(_localctx, 82, RULE_component_type_params);
		try {
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				match(LT);
				setState(665);
				component_param_list(0);
				setState(666);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_component_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(671);
				match(IDENT);
				}
				break;
			case PREPROCESSOR_ID:
				{
				setState(672);
				preprocessor_macro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Component_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_component_param_list);
					setState(675);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(676);
					match(COMMA);
					setState(677);
					match(IDENT);
					}
					} 
				}
				setState(682);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_component_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(703);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(701);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(684);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(685);
						directive_head();
						}
						break;
					case 2:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(686);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(687);
						souffle_rule();
						}
						break;
					case 3:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(688);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(689);
						fact();
						}
						break;
					case 4:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(690);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(691);
						match(OVERRIDE);
						setState(692);
						match(IDENT);
						}
						break;
					case 5:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(693);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(694);
						component_init();
						}
						break;
					case 6:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(695);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(696);
						component_decl();
						}
						break;
					case 7:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(697);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(698);
						type_decl();
						}
						break;
					case 8:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(699);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(700);
						relation_decl();
						}
						break;
					}
					} 
				}
				setState(705);
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
		enterRule(_localctx, 88, RULE_component_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(INSTANTIATE);
			setState(707);
			match(IDENT);
			setState(708);
			match(EQUALS);
			setState(709);
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
		enterRule(_localctx, 90, RULE_functor_decl);
		try {
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				match(FUNCTOR);
				setState(712);
				match(IDENT);
				setState(713);
				match(LPAREN);
				setState(714);
				functor_arg_type_list();
				setState(715);
				match(RPAREN);
				setState(716);
				match(COLON);
				setState(717);
				qualified_name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				match(FUNCTOR);
				setState(720);
				match(IDENT);
				setState(721);
				match(LPAREN);
				setState(722);
				functor_arg_type_list();
				setState(723);
				match(RPAREN);
				setState(724);
				match(COLON);
				setState(725);
				qualified_name(0);
				setState(726);
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
		enterRule(_localctx, 92, RULE_functor_arg_type_list);
		try {
			setState(732);
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
				setState(731);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_non_empty_functor_arg_type_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(735);
			functor_attribute();
			}
			_ctx.stop = _input.LT(-1);
			setState(742);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_functor_arg_type_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_functor_arg_type_list);
					setState(737);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(738);
					match(COMMA);
					setState(739);
					functor_attribute();
					}
					} 
				}
				setState(744);
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
		enterRule(_localctx, 96, RULE_functor_attribute);
		try {
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				qualified_name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				match(IDENT);
				setState(747);
				match(COLON);
				setState(748);
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
		enterRule(_localctx, 98, RULE_pragma);
		try {
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				match(PRAGMA);
				setState(752);
				match(STRING);
				setState(753);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				match(PRAGMA);
				setState(755);
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
		enterRule(_localctx, 100, RULE_directive_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			directive_head_decl();
			setState(759);
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
		enterRule(_localctx, 102, RULE_directive_head_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
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
		enterRule(_localctx, 104, RULE_directive_list);
		try {
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				relation_directive_list(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				relation_directive_list(0);
				setState(765);
				match(LPAREN);
				setState(766);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(768);
				relation_directive_list(0);
				setState(769);
				match(LPAREN);
				setState(770);
				non_empty_key_value_pairs(0);
				setState(771);
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
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_relation_directive_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(776);
			qualified_name(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Relation_directive_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relation_directive_list);
					setState(778);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(779);
					match(COMMA);
					setState(780);
					qualified_name(0);
					}
					} 
				}
				setState(785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_non_empty_key_value_pairs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(787);
			match(IDENT);
			setState(788);
			match(EQUALS);
			setState(789);
			kvp_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(798);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_key_value_pairsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_key_value_pairs);
					setState(791);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(792);
					match(COMMA);
					setState(793);
					match(IDENT);
					setState(794);
					match(EQUALS);
					setState(795);
					kvp_value();
					}
					} 
				}
				setState(800);
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
		enterRule(_localctx, 110, RULE_kvp_value);
		try {
			setState(807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				match(STRING);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				match(IDENT);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(803);
				match(NUMBER);
				}
				break;
			case TRUELIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(804);
				match(TRUELIT);
				}
				break;
			case FALSELIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(805);
				match(FALSELIT);
				}
				break;
			case PREPROCESSOR_ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(806);
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
		enterRule(_localctx, 112, RULE_preprocessor_macro);
		try {
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				match(PREPROCESSOR_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				match(PREPROCESSOR_ID);
				setState(811);
				match(LPAREN);
				setState(812);
				macro_args();
				setState(813);
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
		enterRule(_localctx, 114, RULE_macro_args);
		try {
			setState(819);
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
			case LE:
			case GE:
			case NE:
			case EQUALS:
			case EXCLAMATION:
			case AT:
			case LT:
			case GT:
			case NUMBER:
			case FLOAT:
			case UNSIGNED:
			case IDENT:
			case STRING:
			case PREPROCESSOR_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_non_empty_macro_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(822);
			macro_arg(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(829);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_macro_argsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_macro_args);
					setState(824);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(825);
					match(COMMA);
					setState(826);
					macro_arg(0);
					}
					} 
				}
				setState(831);
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
		public TerminalNode DOT() { return getToken(SouffleParser.DOT, 0); }
		public TerminalNode TMATCH() { return getToken(SouffleParser.TMATCH, 0); }
		public TerminalNode TCONTAINS() { return getToken(SouffleParser.TCONTAINS, 0); }
		public TerminalNode TRUELIT() { return getToken(SouffleParser.TRUELIT, 0); }
		public TerminalNode FALSELIT() { return getToken(SouffleParser.FALSELIT, 0); }
		public TerminalNode EQUALS() { return getToken(SouffleParser.EQUALS, 0); }
		public TerminalNode LE() { return getToken(SouffleParser.LE, 0); }
		public TerminalNode GE() { return getToken(SouffleParser.GE, 0); }
		public TerminalNode LT() { return getToken(SouffleParser.LT, 0); }
		public TerminalNode GT() { return getToken(SouffleParser.GT, 0); }
		public TerminalNode NE() { return getToken(SouffleParser.NE, 0); }
		public TerminalNode COLON() { return getToken(SouffleParser.COLON, 0); }
		public Aggregate_bodyContext aggregate_body() {
			return getRuleContext(Aggregate_bodyContext.class,0);
		}
		public Preprocessor_macroContext preprocessor_macro() {
			return getRuleContext(Preprocessor_macroContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SouffleParser.SEMICOLON, 0); }
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_macro_arg, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(833);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(834);
				match(FLOAT);
				}
				break;
			case 3:
				{
				setState(835);
				match(UNSIGNED);
				}
				break;
			case 4:
				{
				setState(836);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(837);
				match(UNDERSCORE);
				}
				break;
			case 6:
				{
				setState(838);
				match(DOLLAR);
				}
				break;
			case 7:
				{
				setState(839);
				match(AUTOINC);
				setState(840);
				match(LPAREN);
				setState(841);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(842);
				match(IDENT);
				}
				break;
			case 9:
				{
				setState(843);
				match(NIL);
				}
				break;
			case 10:
				{
				setState(844);
				match(LBRACKET);
				setState(845);
				macro_args();
				setState(846);
				match(RBRACKET);
				}
				break;
			case 11:
				{
				setState(848);
				match(DOLLAR);
				setState(849);
				qualified_name(0);
				setState(850);
				match(LPAREN);
				setState(851);
				macro_args();
				setState(852);
				match(RPAREN);
				}
				break;
			case 12:
				{
				setState(854);
				match(LPAREN);
				setState(855);
				macro_arg(0);
				setState(856);
				match(RPAREN);
				}
				break;
			case 13:
				{
				setState(858);
				match(AS);
				setState(859);
				match(LPAREN);
				setState(860);
				macro_arg(0);
				setState(861);
				match(COMMA);
				setState(862);
				qualified_name(0);
				setState(863);
				match(RPAREN);
				}
				break;
			case 14:
				{
				setState(865);
				match(AT);
				setState(866);
				match(IDENT);
				setState(867);
				match(LPAREN);
				setState(868);
				macro_args();
				setState(869);
				match(RPAREN);
				}
				break;
			case 15:
				{
				setState(871);
				functor_built_in();
				setState(872);
				match(LPAREN);
				setState(873);
				macro_args();
				setState(874);
				match(RPAREN);
				}
				break;
			case 16:
				{
				setState(876);
				aggregate_func();
				setState(877);
				match(LPAREN);
				setState(878);
				macro_arg(0);
				setState(879);
				match(COMMA);
				setState(880);
				non_empty_arg_list(0);
				setState(881);
				match(RPAREN);
				}
				break;
			case 17:
				{
				setState(883);
				match(MINUS);
				setState(884);
				macro_arg(41);
				}
				break;
			case 18:
				{
				setState(885);
				match(BW_NOT);
				setState(886);
				macro_arg(40);
				}
				break;
			case 19:
				{
				setState(887);
				match(L_NOT);
				setState(888);
				macro_arg(39);
				}
				break;
			case 20:
				{
				setState(889);
				match(EXCLAMATION);
				setState(890);
				macro_arg(38);
				}
				break;
			case 21:
				{
				setState(891);
				match(IDENT);
				setState(892);
				match(DOT);
				setState(893);
				macro_arg(37);
				}
				break;
			case 22:
				{
				setState(894);
				match(AT);
				setState(895);
				match(IDENT);
				}
				break;
			case 23:
				{
				setState(896);
				match(TMATCH);
				setState(897);
				match(LPAREN);
				setState(898);
				macro_arg(0);
				setState(899);
				match(COMMA);
				setState(900);
				macro_arg(0);
				setState(901);
				match(RPAREN);
				}
				break;
			case 24:
				{
				setState(903);
				match(TCONTAINS);
				setState(904);
				match(LPAREN);
				setState(905);
				macro_arg(0);
				setState(906);
				match(COMMA);
				setState(907);
				macro_arg(0);
				setState(908);
				match(RPAREN);
				}
				break;
			case 25:
				{
				setState(910);
				match(TRUELIT);
				}
				break;
			case 26:
				{
				setState(911);
				match(FALSELIT);
				}
				break;
			case 27:
				{
				setState(912);
				match(EQUALS);
				}
				break;
			case 28:
				{
				setState(913);
				match(LE);
				}
				break;
			case 29:
				{
				setState(914);
				match(GE);
				}
				break;
			case 30:
				{
				setState(915);
				match(LT);
				}
				break;
			case 31:
				{
				setState(916);
				match(GT);
				}
				break;
			case 32:
				{
				setState(917);
				match(NE);
				}
				break;
			case 33:
				{
				setState(918);
				aggregate_func();
				setState(919);
				macro_args();
				setState(920);
				match(COLON);
				setState(921);
				aggregate_body();
				}
				break;
			case 34:
				{
				setState(923);
				match(IDENT);
				setState(924);
				match(LPAREN);
				setState(925);
				macro_args();
				setState(926);
				match(RPAREN);
				}
				break;
			case 35:
				{
				setState(928);
				preprocessor_macro();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(999);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(997);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(931);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(932);
						match(SEMICOLON);
						setState(933);
						macro_arg(36);
						}
						break;
					case 2:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(934);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(935);
						match(LT);
						setState(936);
						macro_arg(35);
						}
						break;
					case 3:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(937);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(938);
						match(GT);
						setState(939);
						macro_arg(34);
						}
						break;
					case 4:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(940);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(941);
						match(LE);
						setState(942);
						macro_arg(33);
						}
						break;
					case 5:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(943);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(944);
						match(GE);
						setState(945);
						macro_arg(32);
						}
						break;
					case 6:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(946);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(947);
						match(EQUALS);
						setState(948);
						macro_arg(31);
						}
						break;
					case 7:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(949);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(950);
						match(NE);
						setState(951);
						macro_arg(30);
						}
						break;
					case 8:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(952);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(953);
						match(PLUS);
						setState(954);
						macro_arg(19);
						}
						break;
					case 9:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(955);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(956);
						match(MINUS);
						setState(957);
						macro_arg(18);
						}
						break;
					case 10:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(958);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(959);
						match(STAR);
						setState(960);
						macro_arg(17);
						}
						break;
					case 11:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(961);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(962);
						match(SLASH);
						setState(963);
						macro_arg(16);
						}
						break;
					case 12:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(964);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(965);
						match(PERCENT);
						setState(966);
						macro_arg(15);
						}
						break;
					case 13:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(967);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(968);
						match(CARET);
						setState(969);
						macro_arg(14);
						}
						break;
					case 14:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(970);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(971);
						match(L_AND);
						setState(972);
						macro_arg(13);
						}
						break;
					case 15:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(973);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(974);
						match(L_OR);
						setState(975);
						macro_arg(12);
						}
						break;
					case 16:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(976);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(977);
						match(L_XOR);
						setState(978);
						macro_arg(11);
						}
						break;
					case 17:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(979);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(980);
						match(BW_AND);
						setState(981);
						macro_arg(10);
						}
						break;
					case 18:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(982);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(983);
						match(BW_OR);
						setState(984);
						macro_arg(9);
						}
						break;
					case 19:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(985);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(986);
						match(BW_XOR);
						setState(987);
						macro_arg(8);
						}
						break;
					case 20:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(988);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(989);
						match(BW_SHIFT_L);
						setState(990);
						macro_arg(7);
						}
						break;
					case 21:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(991);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(992);
						match(BW_SHIFT_R);
						setState(993);
						macro_arg(6);
						}
						break;
					case 22:
						{
						_localctx = new Macro_argContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_macro_arg);
						setState(994);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(995);
						match(BW_SHIFT_R_UNSIGNED);
						setState(996);
						macro_arg(5);
						}
						break;
					}
					} 
				}
				setState(1001);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		case 1:
			return unit_sempred((UnitContext)_localctx, predIndex);
		case 2:
			return qualified_name_sempred((Qualified_nameContext)_localctx, predIndex);
		case 5:
			return union_type_list_sempred((Union_type_listContext)_localctx, predIndex);
		case 6:
			return adt_branch_list_sempred((Adt_branch_listContext)_localctx, predIndex);
		case 9:
			return relation_names_sempred((Relation_namesContext)_localctx, predIndex);
		case 11:
			return non_empty_attributes_sempred((Non_empty_attributesContext)_localctx, predIndex);
		case 13:
			return relation_tags_sempred((Relation_tagsContext)_localctx, predIndex);
		case 14:
			return non_empty_attribute_names_sempred((Non_empty_attribute_namesContext)_localctx, predIndex);
		case 16:
			return dependency_list_aux_sempred((Dependency_list_auxContext)_localctx, predIndex);
		case 21:
			return head_sempred((HeadContext)_localctx, predIndex);
		case 23:
			return disjunction_sempred((DisjunctionContext)_localctx, predIndex);
		case 24:
			return conjunction_sempred((ConjunctionContext)_localctx, predIndex);
		case 29:
			return non_empty_arg_list_sempred((Non_empty_arg_listContext)_localctx, predIndex);
		case 30:
			return arg_sempred((ArgContext)_localctx, predIndex);
		case 35:
			return query_plan_list_sempred((Query_plan_listContext)_localctx, predIndex);
		case 37:
			return non_empty_plan_order_list_sempred((Non_empty_plan_order_listContext)_localctx, predIndex);
		case 39:
			return component_head_sempred((Component_headContext)_localctx, predIndex);
		case 42:
			return component_param_list_sempred((Component_param_listContext)_localctx, predIndex);
		case 43:
			return component_body_sempred((Component_bodyContext)_localctx, predIndex);
		case 47:
			return non_empty_functor_arg_type_list_sempred((Non_empty_functor_arg_type_listContext)_localctx, predIndex);
		case 53:
			return relation_directive_list_sempred((Relation_directive_listContext)_localctx, predIndex);
		case 54:
			return non_empty_key_value_pairs_sempred((Non_empty_key_value_pairsContext)_localctx, predIndex);
		case 58:
			return non_empty_macro_args_sempred((Non_empty_macro_argsContext)_localctx, predIndex);
		case 59:
			return macro_arg_sempred((Macro_argContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean unit_sempred(UnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean qualified_name_sempred(Qualified_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean union_type_list_sempred(Union_type_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean adt_branch_list_sempred(Adt_branch_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_names_sempred(Relation_namesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_attributes_sempred(Non_empty_attributesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_tags_sempred(Relation_tagsContext _localctx, int predIndex) {
		switch (predIndex) {
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
		case 23:
			return precpred(_ctx, 3);
		case 24:
			return precpred(_ctx, 2);
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_attribute_names_sempred(Non_empty_attribute_namesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean dependency_list_aux_sempred(Dependency_list_auxContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean head_sempred(HeadContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean disjunction_sempred(DisjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conjunction_sempred(ConjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_arg_list_sempred(Non_empty_arg_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arg_sempred(ArgContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 17);
		case 33:
			return precpred(_ctx, 16);
		case 34:
			return precpred(_ctx, 15);
		case 35:
			return precpred(_ctx, 14);
		case 36:
			return precpred(_ctx, 13);
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
		}
		return true;
	}
	private boolean query_plan_list_sempred(Query_plan_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_plan_order_list_sempred(Non_empty_plan_order_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean component_head_sempred(Component_headContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 2);
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean component_param_list_sempred(Component_param_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean component_body_sempred(Component_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 8);
		case 53:
			return precpred(_ctx, 7);
		case 54:
			return precpred(_ctx, 6);
		case 55:
			return precpred(_ctx, 5);
		case 56:
			return precpred(_ctx, 4);
		case 57:
			return precpred(_ctx, 3);
		case 58:
			return precpred(_ctx, 2);
		case 59:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_functor_arg_type_list_sempred(Non_empty_functor_arg_type_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 60:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_directive_list_sempred(Relation_directive_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 61:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_key_value_pairs_sempred(Non_empty_key_value_pairsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 62:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_macro_args_sempred(Non_empty_macro_argsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 63:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean macro_arg_sempred(Macro_argContext _localctx, int predIndex) {
		switch (predIndex) {
		case 64:
			return precpred(_ctx, 35);
		case 65:
			return precpred(_ctx, 34);
		case 66:
			return precpred(_ctx, 33);
		case 67:
			return precpred(_ctx, 32);
		case 68:
			return precpred(_ctx, 31);
		case 69:
			return precpred(_ctx, 30);
		case 70:
			return precpred(_ctx, 29);
		case 71:
			return precpred(_ctx, 18);
		case 72:
			return precpred(_ctx, 17);
		case 73:
			return precpred(_ctx, 16);
		case 74:
			return precpred(_ctx, 15);
		case 75:
			return precpred(_ctx, 14);
		case 76:
			return precpred(_ctx, 13);
		case 77:
			return precpred(_ctx, 12);
		case 78:
			return precpred(_ctx, 11);
		case 79:
			return precpred(_ctx, 10);
		case 80:
			return precpred(_ctx, 9);
		case 81:
			return precpred(_ctx, 8);
		case 82:
			return precpred(_ctx, 7);
		case 83:
			return precpred(_ctx, 6);
		case 84:
			return precpred(_ctx, 5);
		case 85:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001h\u03eb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u008f\b\u0001\n"+
		"\u0001\f\u0001\u0092\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0097\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u009c"+
		"\b\u0002\n\u0002\f\u0002\u009f\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00b7\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00bf\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00c7\b\u0005\n\u0005\f\u0005\u00ca\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00d2\b\u0006\n"+
		"\u0006\f\u0006\u00d5\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00df"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ed\b\t\n\t\f\t\u00f0\t\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f8\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0100\b\u000b\n\u000b\f\u000b\u0103\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u0122\b\r\n\r\f\r\u0125\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u012a\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u012f"+
		"\b\u000e\n\u000e\f\u000e\u0132\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0139\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0141\b\u0010"+
		"\n\u0010\f\u0010\u0144\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0149\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0150\b\u0012\u0003\u0012\u0152\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0167\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u0174\b\u0015\n\u0015\f\u0015\u0177\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0181\b\u0017\n\u0017\f\u0017\u0184\t\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u018c\b\u0018\n\u0018\f\u0018\u018f\t\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u019a\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01ca\b\u001b\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u01ce\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u01d6\b\u001d\n\u001d\f\u001d\u01d9\t\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u021a\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u0249\b\u001e\n\u001e\f\u001e\u024c"+
		"\t\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u0257\b!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#"+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u0266\b#\n#\f"+
		"#\u0269\t#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0271\b$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u0279\b%\n%\f%\u027c\t%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u028d\b\'\n\'\f\'\u0290"+
		"\t\'\u0001(\u0001(\u0001(\u0001(\u0003(\u0296\b(\u0001)\u0001)\u0001)"+
		"\u0001)\u0001)\u0003)\u029d\b)\u0001*\u0001*\u0001*\u0003*\u02a2\b*\u0001"+
		"*\u0001*\u0001*\u0005*\u02a7\b*\n*\f*\u02aa\t*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0005+\u02be\b+\n+\f+\u02c1\t+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0003-\u02d9\b-\u0001.\u0001.\u0003.\u02dd\b.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0005/\u02e5\b/\n/\f/\u02e8\t/\u00010\u00010\u00010\u0001"+
		"0\u00030\u02ee\b0\u00011\u00011\u00011\u00011\u00011\u00031\u02f5\b1\u0001"+
		"2\u00012\u00012\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00034\u0306\b4\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00055\u030e\b5\n5\f5\u0311\t5\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00056\u031d\b6\n6\f6\u0320"+
		"\t6\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u0328\b7\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00038\u0330\b8\u00019\u00019\u00039\u0334"+
		"\b9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0005:\u033c\b:\n:\f:\u033f"+
		"\t:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u03a2\b;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0005;\u03e6\b;\n;\f;\u03e9\t;\u0001"+
		";\u0000\u0018\u0002\u0004\n\f\u0012\u0016\u001a\u001c *.0:<FJNTV^jltv"+
		"<\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\u0000\u0003"+
		"\u0002\u0000\u001e\":=\u0003\u0000\u001d\u001d1267\u0001\u0000\u0004\u0007"+
		"\u046d\u0000x\u0001\u0000\u0000\u0000\u0002{\u0001\u0000\u0000\u0000\u0004"+
		"\u0096\u0001\u0000\u0000\u0000\u0006\u00b6\u0001\u0000\u0000\u0000\b\u00be"+
		"\u0001\u0000\u0000\u0000\n\u00c0\u0001\u0000\u0000\u0000\f\u00cb\u0001"+
		"\u0000\u0000\u0000\u000e\u00de\u0001\u0000\u0000\u0000\u0010\u00e0\u0001"+
		"\u0000\u0000\u0000\u0012\u00e6\u0001\u0000\u0000\u0000\u0014\u00f7\u0001"+
		"\u0000\u0000\u0000\u0016\u00f9\u0001\u0000\u0000\u0000\u0018\u0104\u0001"+
		"\u0000\u0000\u0000\u001a\u0108\u0001\u0000\u0000\u0000\u001c\u0129\u0001"+
		"\u0000\u0000\u0000\u001e\u0138\u0001\u0000\u0000\u0000 \u013a\u0001\u0000"+
		"\u0000\u0000\"\u0148\u0001\u0000\u0000\u0000$\u0151\u0001\u0000\u0000"+
		"\u0000&\u0166\u0001\u0000\u0000\u0000(\u0168\u0001\u0000\u0000\u0000*"+
		"\u016d\u0001\u0000\u0000\u0000,\u0178\u0001\u0000\u0000\u0000.\u017a\u0001"+
		"\u0000\u0000\u00000\u0185\u0001\u0000\u0000\u00002\u0199\u0001\u0000\u0000"+
		"\u00004\u019b\u0001\u0000\u0000\u00006\u01c9\u0001\u0000\u0000\u00008"+
		"\u01cd\u0001\u0000\u0000\u0000:\u01cf\u0001\u0000\u0000\u0000<\u0219\u0001"+
		"\u0000\u0000\u0000>\u024d\u0001\u0000\u0000\u0000@\u024f\u0001\u0000\u0000"+
		"\u0000B\u0256\u0001\u0000\u0000\u0000D\u0258\u0001\u0000\u0000\u0000F"+
		"\u025b\u0001\u0000\u0000\u0000H\u0270\u0001\u0000\u0000\u0000J\u0272\u0001"+
		"\u0000\u0000\u0000L\u027d\u0001\u0000\u0000\u0000N\u0282\u0001\u0000\u0000"+
		"\u0000P\u0295\u0001\u0000\u0000\u0000R\u029c\u0001\u0000\u0000\u0000T"+
		"\u02a1\u0001\u0000\u0000\u0000V\u02ab\u0001\u0000\u0000\u0000X\u02c2\u0001"+
		"\u0000\u0000\u0000Z\u02d8\u0001\u0000\u0000\u0000\\\u02dc\u0001\u0000"+
		"\u0000\u0000^\u02de\u0001\u0000\u0000\u0000`\u02ed\u0001\u0000\u0000\u0000"+
		"b\u02f4\u0001\u0000\u0000\u0000d\u02f6\u0001\u0000\u0000\u0000f\u02f9"+
		"\u0001\u0000\u0000\u0000h\u0305\u0001\u0000\u0000\u0000j\u0307\u0001\u0000"+
		"\u0000\u0000l\u0312\u0001\u0000\u0000\u0000n\u0327\u0001\u0000\u0000\u0000"+
		"p\u032f\u0001\u0000\u0000\u0000r\u0333\u0001\u0000\u0000\u0000t\u0335"+
		"\u0001\u0000\u0000\u0000v\u03a1\u0001\u0000\u0000\u0000xy\u0003\u0002"+
		"\u0001\u0000yz\u0005\u0000\u0000\u0001z\u0001\u0001\u0000\u0000\u0000"+
		"{\u0090\u0006\u0001\uffff\uffff\u0000|}\n\t\u0000\u0000}\u008f\u0003d"+
		"2\u0000~\u007f\n\b\u0000\u0000\u007f\u008f\u0003&\u0013\u0000\u0080\u0081"+
		"\n\u0007\u0000\u0000\u0081\u008f\u0003$\u0012\u0000\u0082\u0083\n\u0006"+
		"\u0000\u0000\u0083\u008f\u0003L&\u0000\u0084\u0085\n\u0005\u0000\u0000"+
		"\u0085\u008f\u0003X,\u0000\u0086\u0087\n\u0004\u0000\u0000\u0087\u008f"+
		"\u0003b1\u0000\u0088\u0089\n\u0003\u0000\u0000\u0089\u008f\u0003\u0006"+
		"\u0003\u0000\u008a\u008b\n\u0002\u0000\u0000\u008b\u008f\u0003Z-\u0000"+
		"\u008c\u008d\n\u0001\u0000\u0000\u008d\u008f\u0003\u0010\b\u0000\u008e"+
		"|\u0001\u0000\u0000\u0000\u008e~\u0001\u0000\u0000\u0000\u008e\u0080\u0001"+
		"\u0000\u0000\u0000\u008e\u0082\u0001\u0000\u0000\u0000\u008e\u0084\u0001"+
		"\u0000\u0000\u0000\u008e\u0086\u0001\u0000\u0000\u0000\u008e\u0088\u0001"+
		"\u0000\u0000\u0000\u008e\u008a\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0003\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0006"+
		"\u0002\uffff\uffff\u0000\u0094\u0097\u0005^\u0000\u0000\u0095\u0097\u0003"+
		"p8\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u009d\u0001\u0000\u0000\u0000\u0098\u0099\n\u0002\u0000\u0000"+
		"\u0099\u009a\u0005Z\u0000\u0000\u009a\u009c\u0005^\u0000\u0000\u009b\u0098"+
		"\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u0005"+
		"\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0005\b\u0000\u0000\u00a1\u00a2\u0005^\u0000\u0000\u00a2\u00a3\u0005"+
		"J\u0000\u0000\u00a3\u00b7\u0003\u0004\u0002\u0000\u00a4\u00a5\u0005\b"+
		"\u0000\u0000\u00a5\u00a6\u0005^\u0000\u0000\u00a6\u00a7\u0005N\u0000\u0000"+
		"\u00a7\u00b7\u0003\n\u0005\u0000\u00a8\u00a9\u0005\b\u0000\u0000\u00a9"+
		"\u00aa\u0005^\u0000\u0000\u00aa\u00ab\u0005N\u0000\u0000\u00ab\u00b7\u0003"+
		"\b\u0004\u0000\u00ac\u00ad\u0005\b\u0000\u0000\u00ad\u00ae\u0005^\u0000"+
		"\u0000\u00ae\u00af\u0005N\u0000\u0000\u00af\u00b7\u0003\f\u0006\u0000"+
		"\u00b0\u00b1\u0005\u000b\u0000\u0000\u00b1\u00b7\u0005^\u0000\u0000\u00b2"+
		"\u00b3\u0005\f\u0000\u0000\u00b3\u00b7\u0005^\u0000\u0000\u00b4\u00b5"+
		"\u0005\b\u0000\u0000\u00b5\u00b7\u0005^\u0000\u0000\u00b6\u00a0\u0001"+
		"\u0000\u0000\u0000\u00b6\u00a4\u0001\u0000\u0000\u0000\u00b6\u00a8\u0001"+
		"\u0000\u0000\u0000\u00b6\u00ac\u0001\u0000\u0000\u0000\u00b6\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b7\u0007\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005"+
		"@\u0000\u0000\u00b9\u00bf\u0005A\u0000\u0000\u00ba\u00bb\u0005@\u0000"+
		"\u0000\u00bb\u00bc\u0003\u0016\u000b\u0000\u00bc\u00bd\u0005A\u0000\u0000"+
		"\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00b8\u0001\u0000\u0000\u0000"+
		"\u00be\u00ba\u0001\u0000\u0000\u0000\u00bf\t\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0006\u0005\uffff\uffff\u0000\u00c1\u00c2\u0003\u0004\u0002\u0000"+
		"\u00c2\u00c8\u0001\u0000\u0000\u0000\u00c3\u00c4\n\u0001\u0000\u0000\u00c4"+
		"\u00c5\u0005?\u0000\u0000\u00c5\u00c7\u0003\u0004\u0002\u0000\u00c6\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u000b"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0006\u0006\uffff\uffff\u0000\u00cc\u00cd\u0003\u000e\u0007\u0000\u00cd"+
		"\u00d3\u0001\u0000\u0000\u0000\u00ce\u00cf\n\u0001\u0000\u0000\u00cf\u00d0"+
		"\u0005?\u0000\u0000\u00d0\u00d2\u0003\u000e\u0007\u0000\u00d1\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\r\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005^\u0000"+
		"\u0000\u00d7\u00d8\u0005U\u0000\u0000\u00d8\u00df\u0005V\u0000\u0000\u00d9"+
		"\u00da\u0005^\u0000\u0000\u00da\u00db\u0005U\u0000\u0000\u00db\u00dc\u0003"+
		"\u0016\u000b\u0000\u00dc\u00dd\u0005V\u0000\u0000\u00dd\u00df\u0001\u0000"+
		"\u0000\u0000\u00de\u00d6\u0001\u0000\u0000\u0000\u00de\u00d9\u0001\u0000"+
		"\u0000\u0000\u00df\u000f\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0002"+
		"\u0000\u0000\u00e1\u00e2\u0003\u0012\t\u0000\u00e2\u00e3\u0003\u0014\n"+
		"\u0000\u00e3\u00e4\u0003\u001a\r\u0000\u00e4\u00e5\u0003\"\u0011\u0000"+
		"\u00e5\u0011\u0001\u0000\u0000\u0000\u00e6\u00e7\u0006\t\uffff\uffff\u0000"+
		"\u00e7\u00e8\u0005^\u0000\u0000\u00e8\u00ee\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\n\u0001\u0000\u0000\u00ea\u00eb\u0005G\u0000\u0000\u00eb\u00ed"+
		"\u0005^\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef\u0013\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005E\u0000\u0000\u00f2\u00f8\u0005F\u0000"+
		"\u0000\u00f3\u00f4\u0005E\u0000\u0000\u00f4\u00f5\u0003\u0016\u000b\u0000"+
		"\u00f5\u00f6\u0005F\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f7\u00f3\u0001\u0000\u0000\u0000\u00f8"+
		"\u0015\u0001\u0000\u0000\u0000\u00f9\u00fa\u0006\u000b\uffff\uffff\u0000"+
		"\u00fa\u00fb\u0003\u0018\f\u0000\u00fb\u0101\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\n\u0001\u0000\u0000\u00fd\u00fe\u0005G\u0000\u0000\u00fe\u0100"+
		"\u0003\u0018\f\u0000\u00ff\u00fc\u0001\u0000\u0000\u0000\u0100\u0103\u0001"+
		"\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001"+
		"\u0000\u0000\u0000\u0102\u0017\u0001\u0000\u0000\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0005^\u0000\u0000\u0105\u0106\u0005H\u0000"+
		"\u0000\u0106\u0107\u0003\u0004\u0002\u0000\u0107\u0019\u0001\u0000\u0000"+
		"\u0000\u0108\u0123\u0006\r\uffff\uffff\u0000\u0109\u010a\n\f\u0000\u0000"+
		"\u010a\u0122\u0005\'\u0000\u0000\u010b\u010c\n\u000b\u0000\u0000\u010c"+
		"\u0122\u0005*\u0000\u0000\u010d\u010e\n\n\u0000\u0000\u010e\u0122\u0005"+
		"+\u0000\u0000\u010f\u0110\n\t\u0000\u0000\u0110\u0122\u0005,\u0000\u0000"+
		"\u0111\u0112\n\b\u0000\u0000\u0112\u0122\u0005-\u0000\u0000\u0113\u0114"+
		"\n\u0007\u0000\u0000\u0114\u0122\u0005.\u0000\u0000\u0115\u0116\n\u0006"+
		"\u0000\u0000\u0116\u0122\u00050\u0000\u0000\u0117\u0118\n\u0005\u0000"+
		"\u0000\u0118\u0122\u0005/\u0000\u0000\u0119\u011a\n\u0004\u0000\u0000"+
		"\u011a\u0122\u0005)\u0000\u0000\u011b\u011c\n\u0003\u0000\u0000\u011c"+
		"\u0122\u0005%\u0000\u0000\u011d\u011e\n\u0002\u0000\u0000\u011e\u0122"+
		"\u0005&\u0000\u0000\u011f\u0120\n\u0001\u0000\u0000\u0120\u0122\u0005"+
		"(\u0000\u0000\u0121\u0109\u0001\u0000\u0000\u0000\u0121\u010b\u0001\u0000"+
		"\u0000\u0000\u0121\u010d\u0001\u0000\u0000\u0000\u0121\u010f\u0001\u0000"+
		"\u0000\u0000\u0121\u0111\u0001\u0000\u0000\u0000\u0121\u0113\u0001\u0000"+
		"\u0000\u0000\u0121\u0115\u0001\u0000\u0000\u0000\u0121\u0117\u0001\u0000"+
		"\u0000\u0000\u0121\u0119\u0001\u0000\u0000\u0000\u0121\u011b\u0001\u0000"+
		"\u0000\u0000\u0121\u011d\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u001b\u0001\u0000"+
		"\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0127\u0006\u000e"+
		"\uffff\uffff\u0000\u0127\u012a\u0005^\u0000\u0000\u0128\u012a\u0003p8"+
		"\u0000\u0129\u0126\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000\u0000"+
		"\u0000\u012a\u0130\u0001\u0000\u0000\u0000\u012b\u012c\n\u0002\u0000\u0000"+
		"\u012c\u012d\u0005G\u0000\u0000\u012d\u012f\u0005^\u0000\u0000\u012e\u012b"+
		"\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e"+
		"\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u001d"+
		"\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0139"+
		"\u0005^\u0000\u0000\u0134\u0135\u0005E\u0000\u0000\u0135\u0136\u0003\u001c"+
		"\u000e\u0000\u0136\u0137\u0005F\u0000\u0000\u0137\u0139\u0001\u0000\u0000"+
		"\u0000\u0138\u0133\u0001\u0000\u0000\u0000\u0138\u0134\u0001\u0000\u0000"+
		"\u0000\u0139\u001f\u0001\u0000\u0000\u0000\u013a\u013b\u0006\u0010\uffff"+
		"\uffff\u0000\u013b\u013c\u0003\u001e\u000f\u0000\u013c\u0142\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\n\u0001\u0000\u0000\u013e\u013f\u0005G\u0000"+
		"\u0000\u013f\u0141\u0003\u001e\u000f\u0000\u0140\u013d\u0001\u0000\u0000"+
		"\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143!\u0001\u0000\u0000\u0000"+
		"\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0149\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0005>\u0000\u0000\u0147\u0149\u0003 \u0010\u0000\u0148\u0145"+
		"\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149#\u0001"+
		"\u0000\u0000\u0000\u014a\u014b\u00034\u001a\u0000\u014b\u014c\u0005Z\u0000"+
		"\u0000\u014c\u0152\u0001\u0000\u0000\u0000\u014d\u014f\u0003p8\u0000\u014e"+
		"\u0150\u0005Z\u0000\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0001\u0000\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014a"+
		"\u0001\u0000\u0000\u0000\u0151\u014d\u0001\u0000\u0000\u0000\u0152%\u0001"+
		"\u0000\u0000\u0000\u0153\u0167\u0003(\u0014\u0000\u0154\u0155\u0003(\u0014"+
		"\u0000\u0155\u0156\u0003D\"\u0000\u0156\u0167\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u00034\u001a\u0000\u0158\u0159\u0005K\u0000\u0000\u0159\u015a"+
		"\u00034\u001a\u0000\u015a\u015b\u0005Y\u0000\u0000\u015b\u015c\u0003,"+
		"\u0016\u0000\u015c\u015d\u0005Z\u0000\u0000\u015d\u0167\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u00034\u001a\u0000\u015f\u0160\u0005K\u0000\u0000\u0160"+
		"\u0161\u00034\u001a\u0000\u0161\u0162\u0005Y\u0000\u0000\u0162\u0163\u0003"+
		",\u0016\u0000\u0163\u0164\u0005Z\u0000\u0000\u0164\u0165\u0003D\"\u0000"+
		"\u0165\u0167\u0001\u0000\u0000\u0000\u0166\u0153\u0001\u0000\u0000\u0000"+
		"\u0166\u0154\u0001\u0000\u0000\u0000\u0166\u0157\u0001\u0000\u0000\u0000"+
		"\u0166\u015e\u0001\u0000\u0000\u0000\u0167\'\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0003*\u0015\u0000\u0169\u016a\u0005Y\u0000\u0000\u016a\u016b\u0003"+
		",\u0016\u0000\u016b\u016c\u0005Z\u0000\u0000\u016c)\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0006\u0015\uffff\uffff\u0000\u016e\u016f\u00034\u001a"+
		"\u0000\u016f\u0175\u0001\u0000\u0000\u0000\u0170\u0171\n\u0001\u0000\u0000"+
		"\u0171\u0172\u0005G\u0000\u0000\u0172\u0174\u00034\u001a\u0000\u0173\u0170"+
		"\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0173"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176+\u0001"+
		"\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u0179\u0003"+
		".\u0017\u0000\u0179-\u0001\u0000\u0000\u0000\u017a\u017b\u0006\u0017\uffff"+
		"\uffff\u0000\u017b\u017c\u00030\u0018\u0000\u017c\u0182\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\n\u0001\u0000\u0000\u017e\u017f\u0005I\u0000\u0000"+
		"\u017f\u0181\u00030\u0018\u0000\u0180\u017d\u0001\u0000\u0000\u0000\u0181"+
		"\u0184\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0001\u0000\u0000\u0000\u0183/\u0001\u0000\u0000\u0000\u0184\u0182"+
		"\u0001\u0000\u0000\u0000\u0185\u0186\u0006\u0018\uffff\uffff\u0000\u0186"+
		"\u0187\u00032\u0019\u0000\u0187\u018d\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\n\u0001\u0000\u0000\u0189\u018a\u0005G\u0000\u0000\u018a\u018c\u0003"+
		"2\u0019\u0000\u018b\u0188\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000"+
		"\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000"+
		"\u0000\u0000\u018e1\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000"+
		"\u0000\u0190\u019a\u00034\u001a\u0000\u0191\u019a\u00036\u001b\u0000\u0192"+
		"\u0193\u0005E\u0000\u0000\u0193\u0194\u0003.\u0017\u0000\u0194\u0195\u0005"+
		"F\u0000\u0000\u0195\u019a\u0001\u0000\u0000\u0000\u0196\u0197\u0005O\u0000"+
		"\u0000\u0197\u019a\u00032\u0019\u0000\u0198\u019a\u0003p8\u0000\u0199"+
		"\u0190\u0001\u0000\u0000\u0000\u0199\u0191\u0001\u0000\u0000\u0000\u0199"+
		"\u0192\u0001\u0000\u0000\u0000\u0199\u0196\u0001\u0000\u0000\u0000\u0199"+
		"\u0198\u0001\u0000\u0000\u0000\u019a3\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0003\u0004\u0002\u0000\u019c\u019d\u0005E\u0000\u0000\u019d\u019e\u0003"+
		"8\u001c\u0000\u019e\u019f\u0005F\u0000\u0000\u019f5\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0003<\u001e\u0000\u01a1\u01a2\u0005W\u0000\u0000\u01a2"+
		"\u01a3\u0003<\u001e\u0000\u01a3\u01ca\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\u0003<\u001e\u0000\u01a5\u01a6\u0005X\u0000\u0000\u01a6\u01a7\u0003<"+
		"\u001e\u0000\u01a7\u01ca\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003<\u001e"+
		"\u0000\u01a9\u01aa\u0005K\u0000\u0000\u01aa\u01ab\u0003<\u001e\u0000\u01ab"+
		"\u01ca\u0001\u0000\u0000\u0000\u01ac\u01ad\u0003<\u001e\u0000\u01ad\u01ae"+
		"\u0005L\u0000\u0000\u01ae\u01af\u0003<\u001e\u0000\u01af\u01ca\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0003<\u001e\u0000\u01b1\u01b2\u0005N\u0000\u0000"+
		"\u01b2\u01b3\u0003<\u001e\u0000\u01b3\u01ca\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0003<\u001e\u0000\u01b5\u01b6\u0005M\u0000\u0000\u01b6\u01b7\u0003"+
		"<\u001e\u0000\u01b7\u01ca\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005\u001c"+
		"\u0000\u0000\u01b9\u01ba\u0005E\u0000\u0000\u01ba\u01bb\u0003<\u001e\u0000"+
		"\u01bb\u01bc\u0005G\u0000\u0000\u01bc\u01bd\u0003<\u001e\u0000\u01bd\u01be"+
		"\u0005F\u0000\u0000\u01be\u01ca\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005"+
		"$\u0000\u0000\u01c0\u01c1\u0005E\u0000\u0000\u01c1\u01c2\u0003<\u001e"+
		"\u0000\u01c2\u01c3\u0005G\u0000\u0000\u01c3\u01c4\u0003<\u001e\u0000\u01c4"+
		"\u01c5\u0005F\u0000\u0000\u01c5\u01ca\u0001\u0000\u0000\u0000\u01c6\u01ca"+
		"\u00058\u0000\u0000\u01c7\u01ca\u00059\u0000\u0000\u01c8\u01ca\u0003p"+
		"8\u0000\u01c9\u01a0\u0001\u0000\u0000\u0000\u01c9\u01a4\u0001\u0000\u0000"+
		"\u0000\u01c9\u01a8\u0001\u0000\u0000\u0000\u01c9\u01ac\u0001\u0000\u0000"+
		"\u0000\u01c9\u01b0\u0001\u0000\u0000\u0000\u01c9\u01b4\u0001\u0000\u0000"+
		"\u0000\u01c9\u01b8\u0001\u0000\u0000\u0000\u01c9\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c9\u01c6\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca7\u0001\u0000\u0000\u0000"+
		"\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ce\u0003:\u001d\u0000\u01cd"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce"+
		"9\u0001\u0000\u0000\u0000\u01cf\u01d0\u0006\u001d\uffff\uffff\u0000\u01d0"+
		"\u01d1\u0003<\u001e\u0000\u01d1\u01d7\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\n\u0001\u0000\u0000\u01d3\u01d4\u0005G\u0000\u0000\u01d4\u01d6\u0003"+
		"<\u001e\u0000\u01d5\u01d2\u0001\u0000\u0000\u0000\u01d6\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d8;\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0006\u001e\uffff\uffff\u0000\u01db\u021a\u0005_\u0000"+
		"\u0000\u01dc\u021a\u0005\\\u0000\u0000\u01dd\u021a\u0005]\u0000\u0000"+
		"\u01de\u021a\u0005[\u0000\u0000\u01df\u021a\u00055\u0000\u0000\u01e0\u021a"+
		"\u0005B\u0000\u0000\u01e1\u01e2\u0005\u0010\u0000\u0000\u01e2\u01e3\u0005"+
		"E\u0000\u0000\u01e3\u021a\u0005F\u0000\u0000\u01e4\u021a\u0005^\u0000"+
		"\u0000\u01e5\u021a\u00054\u0000\u0000\u01e6\u01e7\u0005@\u0000\u0000\u01e7"+
		"\u01e8\u00038\u001c\u0000\u01e8\u01e9\u0005A\u0000\u0000\u01e9\u021a\u0001"+
		"\u0000\u0000\u0000\u01ea\u01eb\u0005B\u0000\u0000\u01eb\u01ec\u0003\u0004"+
		"\u0002\u0000\u01ec\u01ed\u0005E\u0000\u0000\u01ed\u01ee\u00038\u001c\u0000"+
		"\u01ee\u01ef\u0005F\u0000\u0000\u01ef\u021a\u0001\u0000\u0000\u0000\u01f0"+
		"\u01f1\u0005E\u0000\u0000\u01f1\u01f2\u0003<\u001e\u0000\u01f2\u01f3\u0005"+
		"F\u0000\u0000\u01f3\u021a\u0001\u0000\u0000\u0000\u01f4\u01f5\u00053\u0000"+
		"\u0000\u01f5\u01f6\u0005E\u0000\u0000\u01f6\u01f7\u0003<\u001e\u0000\u01f7"+
		"\u01f8\u0005G\u0000\u0000\u01f8\u01f9\u0003\u0004\u0002\u0000\u01f9\u01fa"+
		"\u0005F\u0000\u0000\u01fa\u021a\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005"+
		"Q\u0000\u0000\u01fc\u01fd\u0005^\u0000\u0000\u01fd\u01fe\u0005E\u0000"+
		"\u0000\u01fe\u01ff\u00038\u001c\u0000\u01ff\u0200\u0005F\u0000\u0000\u0200"+
		"\u021a\u0001\u0000\u0000\u0000\u0201\u0202\u0003>\u001f\u0000\u0202\u0203"+
		"\u0005E\u0000\u0000\u0203\u0204\u00038\u001c\u0000\u0204\u0205\u0005F"+
		"\u0000\u0000\u0205\u021a\u0001\u0000\u0000\u0000\u0206\u0207\u0003@ \u0000"+
		"\u0207\u0208\u0005E\u0000\u0000\u0208\u0209\u0003<\u001e\u0000\u0209\u020a"+
		"\u0005G\u0000\u0000\u020a\u020b\u0003:\u001d\u0000\u020b\u020c\u0005F"+
		"\u0000\u0000\u020c\u021a\u0001\u0000\u0000\u0000\u020d\u020e\u0005D\u0000"+
		"\u0000\u020e\u021a\u0003<\u001e\u0014\u020f\u0210\u0005\u0014\u0000\u0000"+
		"\u0210\u021a\u0003<\u001e\u0013\u0211\u0212\u0005\u001b\u0000\u0000\u0212"+
		"\u021a\u0003<\u001e\u0012\u0213\u0214\u0003@ \u0000\u0214\u0215\u0003"+
		"8\u001c\u0000\u0215\u0216\u0005H\u0000\u0000\u0216\u0217\u0003B!\u0000"+
		"\u0217\u021a\u0001\u0000\u0000\u0000\u0218\u021a\u0003p8\u0000\u0219\u01da"+
		"\u0001\u0000\u0000\u0000\u0219\u01dc\u0001\u0000\u0000\u0000\u0219\u01dd"+
		"\u0001\u0000\u0000\u0000\u0219\u01de\u0001\u0000\u0000\u0000\u0219\u01df"+
		"\u0001\u0000\u0000\u0000\u0219\u01e0\u0001\u0000\u0000\u0000\u0219\u01e1"+
		"\u0001\u0000\u0000\u0000\u0219\u01e4\u0001\u0000\u0000\u0000\u0219\u01e5"+
		"\u0001\u0000\u0000\u0000\u0219\u01e6\u0001\u0000\u0000\u0000\u0219\u01ea"+
		"\u0001\u0000\u0000\u0000\u0219\u01f0\u0001\u0000\u0000\u0000\u0219\u01f4"+
		"\u0001\u0000\u0000\u0000\u0219\u01fb\u0001\u0000\u0000\u0000\u0219\u0201"+
		"\u0001\u0000\u0000\u0000\u0219\u0206\u0001\u0000\u0000\u0000\u0219\u020d"+
		"\u0001\u0000\u0000\u0000\u0219\u020f\u0001\u0000\u0000\u0000\u0219\u0211"+
		"\u0001\u0000\u0000\u0000\u0219\u0213\u0001\u0000\u0000\u0000\u0219\u0218"+
		"\u0001\u0000\u0000\u0000\u021a\u024a\u0001\u0000\u0000\u0000\u021b\u021c"+
		"\n\u0011\u0000\u0000\u021c\u021d\u0005C\u0000\u0000\u021d\u0249\u0003"+
		"<\u001e\u0012\u021e\u021f\n\u0010\u0000\u0000\u021f\u0220\u0005D\u0000"+
		"\u0000\u0220\u0249\u0003<\u001e\u0011\u0221\u0222\n\u000f\u0000\u0000"+
		"\u0222\u0223\u0005P\u0000\u0000\u0223\u0249\u0003<\u001e\u0010\u0224\u0225"+
		"\n\u000e\u0000\u0000\u0225\u0226\u0005R\u0000\u0000\u0226\u0249\u0003"+
		"<\u001e\u000f\u0227\u0228\n\r\u0000\u0000\u0228\u0229\u0005T\u0000\u0000"+
		"\u0229\u0249\u0003<\u001e\u000e\u022a\u022b\n\f\u0000\u0000\u022b\u022c"+
		"\u0005S\u0000\u0000\u022c\u0249\u0003<\u001e\r\u022d\u022e\n\u000b\u0000"+
		"\u0000\u022e\u022f\u0005\u0018\u0000\u0000\u022f\u0249\u0003<\u001e\f"+
		"\u0230\u0231\n\n\u0000\u0000\u0231\u0232\u0005\u0019\u0000\u0000\u0232"+
		"\u0249\u0003<\u001e\u000b\u0233\u0234\n\t\u0000\u0000\u0234\u0235\u0005"+
		"\u001a\u0000\u0000\u0235\u0249\u0003<\u001e\n\u0236\u0237\n\b\u0000\u0000"+
		"\u0237\u0238\u0005\u0011\u0000\u0000\u0238\u0249\u0003<\u001e\t\u0239"+
		"\u023a\n\u0007\u0000\u0000\u023a\u023b\u0005\u0012\u0000\u0000\u023b\u0249"+
		"\u0003<\u001e\b\u023c\u023d\n\u0006\u0000\u0000\u023d\u023e\u0005\u0013"+
		"\u0000\u0000\u023e\u0249\u0003<\u001e\u0007\u023f\u0240\n\u0005\u0000"+
		"\u0000\u0240\u0241\u0005\u0015\u0000\u0000\u0241\u0249\u0003<\u001e\u0006"+
		"\u0242\u0243\n\u0004\u0000\u0000\u0243\u0244\u0005\u0016\u0000\u0000\u0244"+
		"\u0249\u0003<\u001e\u0005\u0245\u0246\n\u0003\u0000\u0000\u0246\u0247"+
		"\u0005\u0017\u0000\u0000\u0247\u0249\u0003<\u001e\u0004\u0248\u021b\u0001"+
		"\u0000\u0000\u0000\u0248\u021e\u0001\u0000\u0000\u0000\u0248\u0221\u0001"+
		"\u0000\u0000\u0000\u0248\u0224\u0001\u0000\u0000\u0000\u0248\u0227\u0001"+
		"\u0000\u0000\u0000\u0248\u022a\u0001\u0000\u0000\u0000\u0248\u022d\u0001"+
		"\u0000\u0000\u0000\u0248\u0230\u0001\u0000\u0000\u0000\u0248\u0233\u0001"+
		"\u0000\u0000\u0000\u0248\u0236\u0001\u0000\u0000\u0000\u0248\u0239\u0001"+
		"\u0000\u0000\u0000\u0248\u023c\u0001\u0000\u0000\u0000\u0248\u023f\u0001"+
		"\u0000\u0000\u0000\u0248\u0242\u0001\u0000\u0000\u0000\u0248\u0245\u0001"+
		"\u0000\u0000\u0000\u0249\u024c\u0001\u0000\u0000\u0000\u024a\u0248\u0001"+
		"\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b=\u0001\u0000"+
		"\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024d\u024e\u0007\u0000"+
		"\u0000\u0000\u024e?\u0001\u0000\u0000\u0000\u024f\u0250\u0007\u0001\u0000"+
		"\u0000\u0250A\u0001\u0000\u0000\u0000\u0251\u0252\u0005U\u0000\u0000\u0252"+
		"\u0253\u0003,\u0016\u0000\u0253\u0254\u0005V\u0000\u0000\u0254\u0257\u0001"+
		"\u0000\u0000\u0000\u0255\u0257\u00034\u001a\u0000\u0256\u0251\u0001\u0000"+
		"\u0000\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0257C\u0001\u0000\u0000"+
		"\u0000\u0258\u0259\u0005\u000f\u0000\u0000\u0259\u025a\u0003F#\u0000\u025a"+
		"E\u0001\u0000\u0000\u0000\u025b\u025c\u0006#\uffff\uffff\u0000\u025c\u025d"+
		"\u0005[\u0000\u0000\u025d\u025e\u0005H\u0000\u0000\u025e\u025f\u0003H"+
		"$\u0000\u025f\u0267\u0001\u0000\u0000\u0000\u0260\u0261\n\u0001\u0000"+
		"\u0000\u0261\u0262\u0005G\u0000\u0000\u0262\u0263\u0005[\u0000\u0000\u0263"+
		"\u0264\u0005H\u0000\u0000\u0264\u0266\u0003H$\u0000\u0265\u0260\u0001"+
		"\u0000\u0000\u0000\u0266\u0269\u0001\u0000\u0000\u0000\u0267\u0265\u0001"+
		"\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268G\u0001\u0000"+
		"\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u026a\u026b\u0005E\u0000"+
		"\u0000\u026b\u0271\u0005F\u0000\u0000\u026c\u026d\u0005E\u0000\u0000\u026d"+
		"\u026e\u0003J%\u0000\u026e\u026f\u0005F\u0000\u0000\u026f\u0271\u0001"+
		"\u0000\u0000\u0000\u0270\u026a\u0001\u0000\u0000\u0000\u0270\u026c\u0001"+
		"\u0000\u0000\u0000\u0271I\u0001\u0000\u0000\u0000\u0272\u0273\u0006%\uffff"+
		"\uffff\u0000\u0273\u0274\u0005[\u0000\u0000\u0274\u027a\u0001\u0000\u0000"+
		"\u0000\u0275\u0276\n\u0001\u0000\u0000\u0276\u0277\u0005G\u0000\u0000"+
		"\u0277\u0279\u0005[\u0000\u0000\u0278\u0275\u0001\u0000\u0000\u0000\u0279"+
		"\u027c\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027a"+
		"\u027b\u0001\u0000\u0000\u0000\u027bK\u0001\u0000\u0000\u0000\u027c\u027a"+
		"\u0001\u0000\u0000\u0000\u027d\u027e\u0003N\'\u0000\u027e\u027f\u0005"+
		"U\u0000\u0000\u027f\u0280\u0003V+\u0000\u0280\u0281\u0005V\u0000\u0000"+
		"\u0281M\u0001\u0000\u0000\u0000\u0282\u0283\u0006\'\uffff\uffff\u0000"+
		"\u0283\u0284\u0005\t\u0000\u0000\u0284\u0285\u0003P(\u0000\u0285\u028e"+
		"\u0001\u0000\u0000\u0000\u0286\u0287\n\u0002\u0000\u0000\u0287\u0288\u0005"+
		"H\u0000\u0000\u0288\u028d\u0003P(\u0000\u0289\u028a\n\u0001\u0000\u0000"+
		"\u028a\u028b\u0005G\u0000\u0000\u028b\u028d\u0003P(\u0000\u028c\u0286"+
		"\u0001\u0000\u0000\u0000\u028c\u0289\u0001\u0000\u0000\u0000\u028d\u0290"+
		"\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000\u028e\u028f"+
		"\u0001\u0000\u0000\u0000\u028fO\u0001\u0000\u0000\u0000\u0290\u028e\u0001"+
		"\u0000\u0000\u0000\u0291\u0292\u0005^\u0000\u0000\u0292\u0296\u0003R)"+
		"\u0000\u0293\u0294\u0005h\u0000\u0000\u0294\u0296\u0003R)\u0000\u0295"+
		"\u0291\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0296"+
		"Q\u0001\u0000\u0000\u0000\u0297\u029d\u0001\u0000\u0000\u0000\u0298\u0299"+
		"\u0005W\u0000\u0000\u0299\u029a\u0003T*\u0000\u029a\u029b\u0005X\u0000"+
		"\u0000\u029b\u029d\u0001\u0000\u0000\u0000\u029c\u0297\u0001\u0000\u0000"+
		"\u0000\u029c\u0298\u0001\u0000\u0000\u0000\u029dS\u0001\u0000\u0000\u0000"+
		"\u029e\u029f\u0006*\uffff\uffff\u0000\u029f\u02a2\u0005^\u0000\u0000\u02a0"+
		"\u02a2\u0003p8\u0000\u02a1\u029e\u0001\u0000\u0000\u0000\u02a1\u02a0\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a8\u0001\u0000\u0000\u0000\u02a3\u02a4\n\u0002"+
		"\u0000\u0000\u02a4\u02a5\u0005G\u0000\u0000\u02a5\u02a7\u0005^\u0000\u0000"+
		"\u02a6\u02a3\u0001\u0000\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000"+
		"\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000"+
		"\u02a9U\u0001\u0000\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02ab"+
		"\u02bf\u0006+\uffff\uffff\u0000\u02ac\u02ad\n\b\u0000\u0000\u02ad\u02be"+
		"\u0003d2\u0000\u02ae\u02af\n\u0007\u0000\u0000\u02af\u02be\u0003&\u0013"+
		"\u0000\u02b0\u02b1\n\u0006\u0000\u0000\u02b1\u02be\u0003$\u0012\u0000"+
		"\u02b2\u02b3\n\u0005\u0000\u0000\u02b3\u02b4\u0005\r\u0000\u0000\u02b4"+
		"\u02be\u0005^\u0000\u0000\u02b5\u02b6\n\u0004\u0000\u0000\u02b6\u02be"+
		"\u0003X,\u0000\u02b7\u02b8\n\u0003\u0000\u0000\u02b8\u02be\u0003L&\u0000"+
		"\u02b9\u02ba\n\u0002\u0000\u0000\u02ba\u02be\u0003\u0006\u0003\u0000\u02bb"+
		"\u02bc\n\u0001\u0000\u0000\u02bc\u02be\u0003\u0010\b\u0000\u02bd\u02ac"+
		"\u0001\u0000\u0000\u0000\u02bd\u02ae\u0001\u0000\u0000\u0000\u02bd\u02b0"+
		"\u0001\u0000\u0000\u0000\u02bd\u02b2\u0001\u0000\u0000\u0000\u02bd\u02b5"+
		"\u0001\u0000\u0000\u0000\u02bd\u02b7\u0001\u0000\u0000\u0000\u02bd\u02b9"+
		"\u0001\u0000\u0000\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000\u02be\u02c1"+
		"\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000\u02bf\u02c0"+
		"\u0001\u0000\u0000\u0000\u02c0W\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001"+
		"\u0000\u0000\u0000\u02c2\u02c3\u0005\n\u0000\u0000\u02c3\u02c4\u0005^"+
		"\u0000\u0000\u02c4\u02c5\u0005N\u0000\u0000\u02c5\u02c6\u0003P(\u0000"+
		"\u02c6Y\u0001\u0000\u0000\u0000\u02c7\u02c8\u0005\u0003\u0000\u0000\u02c8"+
		"\u02c9\u0005^\u0000\u0000\u02c9\u02ca\u0005E\u0000\u0000\u02ca\u02cb\u0003"+
		"\\.\u0000\u02cb\u02cc\u0005F\u0000\u0000\u02cc\u02cd\u0005H\u0000\u0000"+
		"\u02cd\u02ce\u0003\u0004\u0002\u0000\u02ce\u02d9\u0001\u0000\u0000\u0000"+
		"\u02cf\u02d0\u0005\u0003\u0000\u0000\u02d0\u02d1\u0005^\u0000\u0000\u02d1"+
		"\u02d2\u0005E\u0000\u0000\u02d2\u02d3\u0003\\.\u0000\u02d3\u02d4\u0005"+
		"F\u0000\u0000\u02d4\u02d5\u0005H\u0000\u0000\u02d5\u02d6\u0003\u0004\u0002"+
		"\u0000\u02d6\u02d7\u0005#\u0000\u0000\u02d7\u02d9\u0001\u0000\u0000\u0000"+
		"\u02d8\u02c7\u0001\u0000\u0000\u0000\u02d8\u02cf\u0001\u0000\u0000\u0000"+
		"\u02d9[\u0001\u0000\u0000\u0000\u02da\u02dd\u0001\u0000\u0000\u0000\u02db"+
		"\u02dd\u0003^/\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dc\u02db\u0001"+
		"\u0000\u0000\u0000\u02dd]\u0001\u0000\u0000\u0000\u02de\u02df\u0006/\uffff"+
		"\uffff\u0000\u02df\u02e0\u0003`0\u0000\u02e0\u02e6\u0001\u0000\u0000\u0000"+
		"\u02e1\u02e2\n\u0001\u0000\u0000\u02e2\u02e3\u0005G\u0000\u0000\u02e3"+
		"\u02e5\u0003`0\u0000\u02e4\u02e1\u0001\u0000\u0000\u0000\u02e5\u02e8\u0001"+
		"\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001"+
		"\u0000\u0000\u0000\u02e7_\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001\u0000"+
		"\u0000\u0000\u02e9\u02ee\u0003\u0004\u0002\u0000\u02ea\u02eb\u0005^\u0000"+
		"\u0000\u02eb\u02ec\u0005H\u0000\u0000\u02ec\u02ee\u0003\u0004\u0002\u0000"+
		"\u02ed\u02e9\u0001\u0000\u0000\u0000\u02ed\u02ea\u0001\u0000\u0000\u0000"+
		"\u02eea\u0001\u0000\u0000\u0000\u02ef\u02f0\u0005\u000e\u0000\u0000\u02f0"+
		"\u02f1\u0005_\u0000\u0000\u02f1\u02f5\u0005_\u0000\u0000\u02f2\u02f3\u0005"+
		"\u000e\u0000\u0000\u02f3\u02f5\u0005_\u0000\u0000\u02f4\u02ef\u0001\u0000"+
		"\u0000\u0000\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f5c\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f7\u0003f3\u0000\u02f7\u02f8\u0003h4\u0000\u02f8e\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fa\u0007\u0002\u0000\u0000\u02fag\u0001\u0000"+
		"\u0000\u0000\u02fb\u0306\u0003j5\u0000\u02fc\u02fd\u0003j5\u0000\u02fd"+
		"\u02fe\u0005E\u0000\u0000\u02fe\u02ff\u0005F\u0000\u0000\u02ff\u0306\u0001"+
		"\u0000\u0000\u0000\u0300\u0301\u0003j5\u0000\u0301\u0302\u0005E\u0000"+
		"\u0000\u0302\u0303\u0003l6\u0000\u0303\u0304\u0005F\u0000\u0000\u0304"+
		"\u0306\u0001\u0000\u0000\u0000\u0305\u02fb\u0001\u0000\u0000\u0000\u0305"+
		"\u02fc\u0001\u0000\u0000\u0000\u0305\u0300\u0001\u0000\u0000\u0000\u0306"+
		"i\u0001\u0000\u0000\u0000\u0307\u0308\u00065\uffff\uffff\u0000\u0308\u0309"+
		"\u0003\u0004\u0002\u0000\u0309\u030f\u0001\u0000\u0000\u0000\u030a\u030b"+
		"\n\u0001\u0000\u0000\u030b\u030c\u0005G\u0000\u0000\u030c\u030e\u0003"+
		"\u0004\u0002\u0000\u030d\u030a\u0001\u0000\u0000\u0000\u030e\u0311\u0001"+
		"\u0000\u0000\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u030f\u0310\u0001"+
		"\u0000\u0000\u0000\u0310k\u0001\u0000\u0000\u0000\u0311\u030f\u0001\u0000"+
		"\u0000\u0000\u0312\u0313\u00066\uffff\uffff\u0000\u0313\u0314\u0005^\u0000"+
		"\u0000\u0314\u0315\u0005N\u0000\u0000\u0315\u0316\u0003n7\u0000\u0316"+
		"\u031e\u0001\u0000\u0000\u0000\u0317\u0318\n\u0001\u0000\u0000\u0318\u0319"+
		"\u0005G\u0000\u0000\u0319\u031a\u0005^\u0000\u0000\u031a\u031b\u0005N"+
		"\u0000\u0000\u031b\u031d\u0003n7\u0000\u031c\u0317\u0001\u0000\u0000\u0000"+
		"\u031d\u0320\u0001\u0000\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000"+
		"\u031e\u031f\u0001\u0000\u0000\u0000\u031fm\u0001\u0000\u0000\u0000\u0320"+
		"\u031e\u0001\u0000\u0000\u0000\u0321\u0328\u0005_\u0000\u0000\u0322\u0328"+
		"\u0005^\u0000\u0000\u0323\u0328\u0005[\u0000\u0000\u0324\u0328\u00058"+
		"\u0000\u0000\u0325\u0328\u00059\u0000\u0000\u0326\u0328\u0003p8\u0000"+
		"\u0327\u0321\u0001\u0000\u0000\u0000\u0327\u0322\u0001\u0000\u0000\u0000"+
		"\u0327\u0323\u0001\u0000\u0000\u0000\u0327\u0324\u0001\u0000\u0000\u0000"+
		"\u0327\u0325\u0001\u0000\u0000\u0000\u0327\u0326\u0001\u0000\u0000\u0000"+
		"\u0328o\u0001\u0000\u0000\u0000\u0329\u0330\u0005h\u0000\u0000\u032a\u032b"+
		"\u0005h\u0000\u0000\u032b\u032c\u0005E\u0000\u0000\u032c\u032d\u0003r"+
		"9\u0000\u032d\u032e\u0005F\u0000\u0000\u032e\u0330\u0001\u0000\u0000\u0000"+
		"\u032f\u0329\u0001\u0000\u0000\u0000\u032f\u032a\u0001\u0000\u0000\u0000"+
		"\u0330q\u0001\u0000\u0000\u0000\u0331\u0334\u0001\u0000\u0000\u0000\u0332"+
		"\u0334\u0003t:\u0000\u0333\u0331\u0001\u0000\u0000\u0000\u0333\u0332\u0001"+
		"\u0000\u0000\u0000\u0334s\u0001\u0000\u0000\u0000\u0335\u0336\u0006:\uffff"+
		"\uffff\u0000\u0336\u0337\u0003v;\u0000\u0337\u033d\u0001\u0000\u0000\u0000"+
		"\u0338\u0339\n\u0001\u0000\u0000\u0339\u033a\u0005G\u0000\u0000\u033a"+
		"\u033c\u0003v;\u0000\u033b\u0338\u0001\u0000\u0000\u0000\u033c\u033f\u0001"+
		"\u0000\u0000\u0000\u033d\u033b\u0001\u0000\u0000\u0000\u033d\u033e\u0001"+
		"\u0000\u0000\u0000\u033eu\u0001\u0000\u0000\u0000\u033f\u033d\u0001\u0000"+
		"\u0000\u0000\u0340\u0341\u0006;\uffff\uffff\u0000\u0341\u03a2\u0005_\u0000"+
		"\u0000\u0342\u03a2\u0005\\\u0000\u0000\u0343\u03a2\u0005]\u0000\u0000"+
		"\u0344\u03a2\u0005[\u0000\u0000\u0345\u03a2\u00055\u0000\u0000\u0346\u03a2"+
		"\u0005B\u0000\u0000\u0347\u0348\u0005\u0010\u0000\u0000\u0348\u0349\u0005"+
		"E\u0000\u0000\u0349\u03a2\u0005F\u0000\u0000\u034a\u03a2\u0005^\u0000"+
		"\u0000\u034b\u03a2\u00054\u0000\u0000\u034c\u034d\u0005@\u0000\u0000\u034d"+
		"\u034e\u0003r9\u0000\u034e\u034f\u0005A\u0000\u0000\u034f\u03a2\u0001"+
		"\u0000\u0000\u0000\u0350\u0351\u0005B\u0000\u0000\u0351\u0352\u0003\u0004"+
		"\u0002\u0000\u0352\u0353\u0005E\u0000\u0000\u0353\u0354\u0003r9\u0000"+
		"\u0354\u0355\u0005F\u0000\u0000\u0355\u03a2\u0001\u0000\u0000\u0000\u0356"+
		"\u0357\u0005E\u0000\u0000\u0357\u0358\u0003v;\u0000\u0358\u0359\u0005"+
		"F\u0000\u0000\u0359\u03a2\u0001\u0000\u0000\u0000\u035a\u035b\u00053\u0000"+
		"\u0000\u035b\u035c\u0005E\u0000\u0000\u035c\u035d\u0003v;\u0000\u035d"+
		"\u035e\u0005G\u0000\u0000\u035e\u035f\u0003\u0004\u0002\u0000\u035f\u0360"+
		"\u0005F\u0000\u0000\u0360\u03a2\u0001\u0000\u0000\u0000\u0361\u0362\u0005"+
		"Q\u0000\u0000\u0362\u0363\u0005^\u0000\u0000\u0363\u0364\u0005E\u0000"+
		"\u0000\u0364\u0365\u0003r9\u0000\u0365\u0366\u0005F\u0000\u0000\u0366"+
		"\u03a2\u0001\u0000\u0000\u0000\u0367\u0368\u0003>\u001f\u0000\u0368\u0369"+
		"\u0005E\u0000\u0000\u0369\u036a\u0003r9\u0000\u036a\u036b\u0005F\u0000"+
		"\u0000\u036b\u03a2\u0001\u0000\u0000\u0000\u036c\u036d\u0003@ \u0000\u036d"+
		"\u036e\u0005E\u0000\u0000\u036e\u036f\u0003v;\u0000\u036f\u0370\u0005"+
		"G\u0000\u0000\u0370\u0371\u0003:\u001d\u0000\u0371\u0372\u0005F\u0000"+
		"\u0000\u0372\u03a2\u0001\u0000\u0000\u0000\u0373\u0374\u0005D\u0000\u0000"+
		"\u0374\u03a2\u0003v;)\u0375\u0376\u0005\u0014\u0000\u0000\u0376\u03a2"+
		"\u0003v;(\u0377\u0378\u0005\u001b\u0000\u0000\u0378\u03a2\u0003v;\'\u0379"+
		"\u037a\u0005O\u0000\u0000\u037a\u03a2\u0003v;&\u037b\u037c\u0005^\u0000"+
		"\u0000\u037c\u037d\u0005Z\u0000\u0000\u037d\u03a2\u0003v;%\u037e\u037f"+
		"\u0005Q\u0000\u0000\u037f\u03a2\u0005^\u0000\u0000\u0380\u0381\u0005\u001c"+
		"\u0000\u0000\u0381\u0382\u0005E\u0000\u0000\u0382\u0383\u0003v;\u0000"+
		"\u0383\u0384\u0005G\u0000\u0000\u0384\u0385\u0003v;\u0000\u0385\u0386"+
		"\u0005F\u0000\u0000\u0386\u03a2\u0001\u0000\u0000\u0000\u0387\u0388\u0005"+
		"$\u0000\u0000\u0388\u0389\u0005E\u0000\u0000\u0389\u038a\u0003v;\u0000"+
		"\u038a\u038b\u0005G\u0000\u0000\u038b\u038c\u0003v;\u0000\u038c\u038d"+
		"\u0005F\u0000\u0000\u038d\u03a2\u0001\u0000\u0000\u0000\u038e\u03a2\u0005"+
		"8\u0000\u0000\u038f\u03a2\u00059\u0000\u0000\u0390\u03a2\u0005N\u0000"+
		"\u0000\u0391\u03a2\u0005K\u0000\u0000\u0392\u03a2\u0005L\u0000\u0000\u0393"+
		"\u03a2\u0005W\u0000\u0000\u0394\u03a2\u0005X\u0000\u0000\u0395\u03a2\u0005"+
		"M\u0000\u0000\u0396\u0397\u0003@ \u0000\u0397\u0398\u0003r9\u0000\u0398"+
		"\u0399\u0005H\u0000\u0000\u0399\u039a\u0003B!\u0000\u039a\u03a2\u0001"+
		"\u0000\u0000\u0000\u039b\u039c\u0005^\u0000\u0000\u039c\u039d\u0005E\u0000"+
		"\u0000\u039d\u039e\u0003r9\u0000\u039e\u039f\u0005F\u0000\u0000\u039f"+
		"\u03a2\u0001\u0000\u0000\u0000\u03a0\u03a2\u0003p8\u0000\u03a1\u0340\u0001"+
		"\u0000\u0000\u0000\u03a1\u0342\u0001\u0000\u0000\u0000\u03a1\u0343\u0001"+
		"\u0000\u0000\u0000\u03a1\u0344\u0001\u0000\u0000\u0000\u03a1\u0345\u0001"+
		"\u0000\u0000\u0000\u03a1\u0346\u0001\u0000\u0000\u0000\u03a1\u0347\u0001"+
		"\u0000\u0000\u0000\u03a1\u034a\u0001\u0000\u0000\u0000\u03a1\u034b\u0001"+
		"\u0000\u0000\u0000\u03a1\u034c\u0001\u0000\u0000\u0000\u03a1\u0350\u0001"+
		"\u0000\u0000\u0000\u03a1\u0356\u0001\u0000\u0000\u0000\u03a1\u035a\u0001"+
		"\u0000\u0000\u0000\u03a1\u0361\u0001\u0000\u0000\u0000\u03a1\u0367\u0001"+
		"\u0000\u0000\u0000\u03a1\u036c\u0001\u0000\u0000\u0000\u03a1\u0373\u0001"+
		"\u0000\u0000\u0000\u03a1\u0375\u0001\u0000\u0000\u0000\u03a1\u0377\u0001"+
		"\u0000\u0000\u0000\u03a1\u0379\u0001\u0000\u0000\u0000\u03a1\u037b\u0001"+
		"\u0000\u0000\u0000\u03a1\u037e\u0001\u0000\u0000\u0000\u03a1\u0380\u0001"+
		"\u0000\u0000\u0000\u03a1\u0387\u0001\u0000\u0000\u0000\u03a1\u038e\u0001"+
		"\u0000\u0000\u0000\u03a1\u038f\u0001\u0000\u0000\u0000\u03a1\u0390\u0001"+
		"\u0000\u0000\u0000\u03a1\u0391\u0001\u0000\u0000\u0000\u03a1\u0392\u0001"+
		"\u0000\u0000\u0000\u03a1\u0393\u0001\u0000\u0000\u0000\u03a1\u0394\u0001"+
		"\u0000\u0000\u0000\u03a1\u0395\u0001\u0000\u0000\u0000\u03a1\u0396\u0001"+
		"\u0000\u0000\u0000\u03a1\u039b\u0001\u0000\u0000\u0000\u03a1\u03a0\u0001"+
		"\u0000\u0000\u0000\u03a2\u03e7\u0001\u0000\u0000\u0000\u03a3\u03a4\n#"+
		"\u0000\u0000\u03a4\u03a5\u0005I\u0000\u0000\u03a5\u03e6\u0003v;$\u03a6"+
		"\u03a7\n\"\u0000\u0000\u03a7\u03a8\u0005W\u0000\u0000\u03a8\u03e6\u0003"+
		"v;#\u03a9\u03aa\n!\u0000\u0000\u03aa\u03ab\u0005X\u0000\u0000\u03ab\u03e6"+
		"\u0003v;\"\u03ac\u03ad\n \u0000\u0000\u03ad\u03ae\u0005K\u0000\u0000\u03ae"+
		"\u03e6\u0003v;!\u03af\u03b0\n\u001f\u0000\u0000\u03b0\u03b1\u0005L\u0000"+
		"\u0000\u03b1\u03e6\u0003v; \u03b2\u03b3\n\u001e\u0000\u0000\u03b3\u03b4"+
		"\u0005N\u0000\u0000\u03b4\u03e6\u0003v;\u001f\u03b5\u03b6\n\u001d\u0000"+
		"\u0000\u03b6\u03b7\u0005M\u0000\u0000\u03b7\u03e6\u0003v;\u001e\u03b8"+
		"\u03b9\n\u0012\u0000\u0000\u03b9\u03ba\u0005C\u0000\u0000\u03ba\u03e6"+
		"\u0003v;\u0013\u03bb\u03bc\n\u0011\u0000\u0000\u03bc\u03bd\u0005D\u0000"+
		"\u0000\u03bd\u03e6\u0003v;\u0012\u03be\u03bf\n\u0010\u0000\u0000\u03bf"+
		"\u03c0\u0005P\u0000\u0000\u03c0\u03e6\u0003v;\u0011\u03c1\u03c2\n\u000f"+
		"\u0000\u0000\u03c2\u03c3\u0005R\u0000\u0000\u03c3\u03e6\u0003v;\u0010"+
		"\u03c4\u03c5\n\u000e\u0000\u0000\u03c5\u03c6\u0005T\u0000\u0000\u03c6"+
		"\u03e6\u0003v;\u000f\u03c7\u03c8\n\r\u0000\u0000\u03c8\u03c9\u0005S\u0000"+
		"\u0000\u03c9\u03e6\u0003v;\u000e\u03ca\u03cb\n\f\u0000\u0000\u03cb\u03cc"+
		"\u0005\u0018\u0000\u0000\u03cc\u03e6\u0003v;\r\u03cd\u03ce\n\u000b\u0000"+
		"\u0000\u03ce\u03cf\u0005\u0019\u0000\u0000\u03cf\u03e6\u0003v;\f\u03d0"+
		"\u03d1\n\n\u0000\u0000\u03d1\u03d2\u0005\u001a\u0000\u0000\u03d2\u03e6"+
		"\u0003v;\u000b\u03d3\u03d4\n\t\u0000\u0000\u03d4\u03d5\u0005\u0011\u0000"+
		"\u0000\u03d5\u03e6\u0003v;\n\u03d6\u03d7\n\b\u0000\u0000\u03d7\u03d8\u0005"+
		"\u0012\u0000\u0000\u03d8\u03e6\u0003v;\t\u03d9\u03da\n\u0007\u0000\u0000"+
		"\u03da\u03db\u0005\u0013\u0000\u0000\u03db\u03e6\u0003v;\b\u03dc\u03dd"+
		"\n\u0006\u0000\u0000\u03dd\u03de\u0005\u0015\u0000\u0000\u03de\u03e6\u0003"+
		"v;\u0007\u03df\u03e0\n\u0005\u0000\u0000\u03e0\u03e1\u0005\u0016\u0000"+
		"\u0000\u03e1\u03e6\u0003v;\u0006\u03e2\u03e3\n\u0004\u0000\u0000\u03e3"+
		"\u03e4\u0005\u0017\u0000\u0000\u03e4\u03e6\u0003v;\u0005\u03e5\u03a3\u0001"+
		"\u0000\u0000\u0000\u03e5\u03a6\u0001\u0000\u0000\u0000\u03e5\u03a9\u0001"+
		"\u0000\u0000\u0000\u03e5\u03ac\u0001\u0000\u0000\u0000\u03e5\u03af\u0001"+
		"\u0000\u0000\u0000\u03e5\u03b2\u0001\u0000\u0000\u0000\u03e5\u03b5\u0001"+
		"\u0000\u0000\u0000\u03e5\u03b8\u0001\u0000\u0000\u0000\u03e5\u03bb\u0001"+
		"\u0000\u0000\u0000\u03e5\u03be\u0001\u0000\u0000\u0000\u03e5\u03c1\u0001"+
		"\u0000\u0000\u0000\u03e5\u03c4\u0001\u0000\u0000\u0000\u03e5\u03c7\u0001"+
		"\u0000\u0000\u0000\u03e5\u03ca\u0001\u0000\u0000\u0000\u03e5\u03cd\u0001"+
		"\u0000\u0000\u0000\u03e5\u03d0\u0001\u0000\u0000\u0000\u03e5\u03d3\u0001"+
		"\u0000\u0000\u0000\u03e5\u03d6\u0001\u0000\u0000\u0000\u03e5\u03d9\u0001"+
		"\u0000\u0000\u0000\u03e5\u03dc\u0001\u0000\u0000\u0000\u03e5\u03df\u0001"+
		"\u0000\u0000\u0000\u03e5\u03e2\u0001\u0000\u0000\u0000\u03e6\u03e9\u0001"+
		"\u0000\u0000\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000\u03e7\u03e8\u0001"+
		"\u0000\u0000\u0000\u03e8w\u0001\u0000\u0000\u0000\u03e9\u03e7\u0001\u0000"+
		"\u0000\u0000;\u008e\u0090\u0096\u009d\u00b6\u00be\u00c8\u00d3\u00de\u00ee"+
		"\u00f7\u0101\u0121\u0123\u0129\u0130\u0138\u0142\u0148\u014f\u0151\u0166"+
		"\u0175\u0182\u018d\u0199\u01c9\u01cd\u01d7\u0219\u0248\u024a\u0256\u0267"+
		"\u0270\u027a\u028c\u028e\u0295\u029c\u02a1\u02a8\u02bd\u02bf\u02d8\u02dc"+
		"\u02e6\u02ed\u02f4\u0305\u030f\u031e\u0327\u032f\u0333\u033d\u03a1\u03e5"+
		"\u03e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}