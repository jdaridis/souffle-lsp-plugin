// Generated from /home/john/IdeaProjects/Souffle Ide Plugin/grammar/Souffle.g4 by ANTLR 4.9.2
package visitors;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SouffleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		FLOAT=92, UNSIGNED=93, IDENT=94, STRING=95, PREPROCESSOR=96, COMMENT=97, 
		LINE_COMMENT=98, END=99;
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
		RULE_non_empty_key_value_pairs = 54, RULE_kvp_value = 55;
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
			"FLOAT", "UNSIGNED", "IDENT", "STRING", "PREPROCESSOR", "COMMENT", "LINE_COMMENT", 
			"END"
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
			setState(112);
			unit(0);
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
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(133);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(115);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(116);
						directive_head();
						}
						break;
					case 2:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(117);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(118);
						souffle_rule();
						}
						break;
					case 3:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(119);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(120);
						fact();
						}
						break;
					case 4:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(121);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(122);
						component_decl();
						}
						break;
					case 5:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(123);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(124);
						component_init();
						}
						break;
					case 6:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(125);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(126);
						pragma();
						}
						break;
					case 7:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(127);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(128);
						type_decl();
						}
						break;
					case 8:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(129);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(130);
						functor_decl();
						}
						break;
					case 9:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(131);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(132);
						relation_decl();
						}
						break;
					}
					} 
				}
				setState(137);
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
			{
			setState(139);
			match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Qualified_nameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_qualified_name);
					setState(141);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(142);
					match(DOT);
					setState(143);
					match(IDENT);
					}
					} 
				}
				setState(148);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(TYPE);
				setState(150);
				match(IDENT);
				setState(151);
				match(SUBTYPE);
				setState(152);
				qualified_name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(TYPE);
				setState(154);
				match(IDENT);
				setState(155);
				match(EQUALS);
				setState(156);
				union_type_list(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(TYPE);
				setState(158);
				match(IDENT);
				setState(159);
				match(EQUALS);
				setState(160);
				record_type_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(TYPE);
				setState(162);
				match(IDENT);
				setState(163);
				match(EQUALS);
				setState(164);
				adt_branch_list(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(NUMBER_TYPE);
				setState(166);
				match(IDENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				match(SYMBOL_TYPE);
				setState(168);
				match(IDENT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(169);
				match(TYPE);
				setState(170);
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
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(LBRACKET);
				setState(174);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(LBRACKET);
				setState(176);
				non_empty_attributes(0);
				setState(177);
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
			setState(182);
			qualified_name(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Union_type_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_union_type_list);
					setState(184);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(185);
					match(PIPE);
					setState(186);
					qualified_name(0);
					}
					} 
				}
				setState(191);
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
			setState(193);
			adt_branch();
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
					_localctx = new Adt_branch_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_adt_branch_list);
					setState(195);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(196);
					match(PIPE);
					setState(197);
					adt_branch();
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
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(IDENT);
				setState(204);
				match(LBRACE);
				setState(205);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(IDENT);
				setState(207);
				match(LBRACE);
				setState(208);
				non_empty_attributes(0);
				setState(209);
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
			setState(213);
			match(DECL);
			setState(214);
			relation_names(0);
			setState(215);
			attributes_list();
			setState(216);
			relation_tags(0);
			setState(217);
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
			setState(220);
			match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Relation_namesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relation_names);
					setState(222);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(223);
					match(COMMA);
					setState(224);
					match(IDENT);
					}
					} 
				}
				setState(229);
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
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(LPAREN);
				setState(231);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(LPAREN);
				setState(233);
				non_empty_attributes(0);
				setState(234);
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
			setState(239);
			attribute();
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_attributesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_attributes);
					setState(241);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(242);
					match(COMMA);
					setState(243);
					attribute();
					}
					} 
				}
				setState(248);
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
			setState(249);
			match(IDENT);
			setState(250);
			match(COLON);
			setState(251);
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
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(254);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(255);
						match(OVERRIDABLE_QUALIFIER);
						}
						break;
					case 2:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(256);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(257);
						match(INLINE_QUALIFIER);
						}
						break;
					case 3:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(258);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(259);
						match(NO_INLINE_QUALIFIER);
						}
						break;
					case 4:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(260);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(261);
						match(MAGIC_QUALIFIER);
						}
						break;
					case 5:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(262);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(263);
						match(NO_MAGIC_QUALIFIER);
						}
						break;
					case 6:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(264);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(265);
						match(BRIE_QUALIFIER);
						}
						break;
					case 7:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(266);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(267);
						match(BTREE_QUALIFIER);
						}
						break;
					case 8:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(268);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(269);
						match(BTREE_DELETE_QUALIFIER);
						}
						break;
					case 9:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(270);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(271);
						match(EQREL_QUALIFIER);
						}
						break;
					case 10:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(272);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(273);
						match(OUTPUT_QUALIFIER);
						}
						break;
					case 11:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(274);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(275);
						match(INPUT_QUALIFIER);
						}
						break;
					case 12:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(276);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(277);
						match(PRINTSIZE_QUALIFIER);
						}
						break;
					}
					} 
				}
				setState(282);
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

	public static class Non_empty_attribute_namesContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
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
			{
			setState(284);
			match(IDENT);
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
					{
					_localctx = new Non_empty_attribute_namesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_attribute_names);
					setState(286);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(287);
					match(COMMA);
					setState(288);
					match(IDENT);
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
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(IDENT);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(LPAREN);
				setState(296);
				non_empty_attribute_names(0);
				setState(297);
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
			setState(302);
			dependency();
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dependency_list_auxContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dependency_list_aux);
					setState(304);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(305);
					match(COMMA);
					setState(306);
					dependency();
					}
					} 
				}
				setState(311);
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
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(CHOICEDOMAIN);
				setState(314);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			atom();
			setState(318);
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
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				rule_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				rule_def();
				setState(322);
				query_plan();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				atom();
				setState(325);
				match(LE);
				setState(326);
				atom();
				setState(327);
				match(IF);
				setState(328);
				body();
				setState(329);
				match(DOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				atom();
				setState(332);
				match(LE);
				setState(333);
				atom();
				setState(334);
				match(IF);
				setState(335);
				body();
				setState(336);
				match(DOT);
				setState(337);
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
			setState(341);
			head(0);
			setState(342);
			match(IF);
			setState(343);
			body();
			setState(344);
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
			setState(347);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new HeadContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_head);
					setState(349);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(350);
					match(COMMA);
					setState(351);
					atom();
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			setState(357);
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
			setState(360);
			conjunction(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DisjunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_disjunction);
					setState(362);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(363);
					match(SEMICOLON);
					setState(364);
					conjunction(0);
					}
					} 
				}
				setState(369);
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
			setState(371);
			term();
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConjunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conjunction);
					setState(373);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(374);
					match(COMMA);
					setState(375);
					term();
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				match(LPAREN);
				setState(384);
				disjunction(0);
				setState(385);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				match(EXCLAMATION);
				setState(388);
				term();
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
			setState(391);
			qualified_name(0);
			setState(392);
			match(LPAREN);
			setState(393);
			arg_list();
			setState(394);
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
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				arg(0);
				setState(397);
				match(LT);
				setState(398);
				arg(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				arg(0);
				setState(401);
				match(GT);
				setState(402);
				arg(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				arg(0);
				setState(405);
				match(LE);
				setState(406);
				arg(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				arg(0);
				setState(409);
				match(GE);
				setState(410);
				arg(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(412);
				arg(0);
				setState(413);
				match(EQUALS);
				setState(414);
				arg(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(416);
				arg(0);
				setState(417);
				match(NE);
				setState(418);
				arg(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(420);
				match(TMATCH);
				setState(421);
				match(LPAREN);
				setState(422);
				arg(0);
				setState(423);
				match(COMMA);
				setState(424);
				arg(0);
				setState(425);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(427);
				match(TCONTAINS);
				setState(428);
				match(LPAREN);
				setState(429);
				arg(0);
				setState(430);
				match(COMMA);
				setState(431);
				arg(0);
				setState(432);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(434);
				match(TRUELIT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(435);
				match(FALSELIT);
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
			setState(440);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
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
			setState(443);
			arg(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_arg_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_arg_list);
					setState(445);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(446);
					match(COMMA);
					setState(447);
					arg(0);
					}
					} 
				}
				setState(452);
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
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(454);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(455);
				match(FLOAT);
				}
				break;
			case 3:
				{
				setState(456);
				match(UNSIGNED);
				}
				break;
			case 4:
				{
				setState(457);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(458);
				match(UNDERSCORE);
				}
				break;
			case 6:
				{
				setState(459);
				match(DOLLAR);
				}
				break;
			case 7:
				{
				setState(460);
				match(AUTOINC);
				setState(461);
				match(LPAREN);
				setState(462);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(463);
				match(IDENT);
				}
				break;
			case 9:
				{
				setState(464);
				match(NIL);
				}
				break;
			case 10:
				{
				setState(465);
				match(LBRACKET);
				setState(466);
				arg_list();
				setState(467);
				match(RBRACKET);
				}
				break;
			case 11:
				{
				setState(469);
				match(DOLLAR);
				setState(470);
				qualified_name(0);
				setState(471);
				match(LPAREN);
				setState(472);
				arg_list();
				setState(473);
				match(RPAREN);
				}
				break;
			case 12:
				{
				setState(475);
				match(LPAREN);
				setState(476);
				arg(0);
				setState(477);
				match(RPAREN);
				}
				break;
			case 13:
				{
				setState(479);
				match(AS);
				setState(480);
				match(LPAREN);
				setState(481);
				arg(0);
				setState(482);
				match(COMMA);
				setState(483);
				qualified_name(0);
				setState(484);
				match(RPAREN);
				}
				break;
			case 14:
				{
				setState(486);
				match(AT);
				setState(487);
				match(IDENT);
				setState(488);
				match(LPAREN);
				setState(489);
				arg_list();
				setState(490);
				match(RPAREN);
				}
				break;
			case 15:
				{
				setState(492);
				functor_built_in();
				setState(493);
				match(LPAREN);
				setState(494);
				arg_list();
				setState(495);
				match(RPAREN);
				}
				break;
			case 16:
				{
				setState(497);
				aggregate_func();
				setState(498);
				match(LPAREN);
				setState(499);
				arg(0);
				setState(500);
				match(COMMA);
				setState(501);
				non_empty_arg_list(0);
				setState(502);
				match(RPAREN);
				}
				break;
			case 17:
				{
				setState(504);
				match(MINUS);
				setState(505);
				arg(19);
				}
				break;
			case 18:
				{
				setState(506);
				match(BW_NOT);
				setState(507);
				arg(18);
				}
				break;
			case 19:
				{
				setState(508);
				match(L_NOT);
				setState(509);
				arg(17);
				}
				break;
			case 20:
				{
				setState(510);
				aggregate_func();
				setState(511);
				arg_list();
				setState(512);
				match(COLON);
				setState(513);
				aggregate_body();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(562);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(517);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(518);
						match(PLUS);
						setState(519);
						arg(17);
						}
						break;
					case 2:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(520);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(521);
						match(MINUS);
						setState(522);
						arg(16);
						}
						break;
					case 3:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(523);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(524);
						match(STAR);
						setState(525);
						arg(15);
						}
						break;
					case 4:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(526);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(527);
						match(SLASH);
						setState(528);
						arg(14);
						}
						break;
					case 5:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(529);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(530);
						match(PERCENT);
						setState(531);
						arg(13);
						}
						break;
					case 6:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(532);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(533);
						match(CARET);
						setState(534);
						arg(12);
						}
						break;
					case 7:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(535);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(536);
						match(L_AND);
						setState(537);
						arg(11);
						}
						break;
					case 8:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(538);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(539);
						match(L_OR);
						setState(540);
						arg(10);
						}
						break;
					case 9:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(541);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(542);
						match(L_XOR);
						setState(543);
						arg(9);
						}
						break;
					case 10:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(544);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(545);
						match(BW_AND);
						setState(546);
						arg(8);
						}
						break;
					case 11:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(547);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(548);
						match(BW_OR);
						setState(549);
						arg(7);
						}
						break;
					case 12:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(550);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(551);
						match(BW_XOR);
						setState(552);
						arg(6);
						}
						break;
					case 13:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(553);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(554);
						match(BW_SHIFT_L);
						setState(555);
						arg(5);
						}
						break;
					case 14:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(556);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(557);
						match(BW_SHIFT_R);
						setState(558);
						arg(4);
						}
						break;
					case 15:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(559);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(560);
						match(BW_SHIFT_R_UNSIGNED);
						setState(561);
						arg(3);
						}
						break;
					}
					} 
				}
				setState(566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
			setState(567);
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
			setState(569);
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
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				match(LBRACE);
				setState(572);
				body();
				setState(573);
				match(RBRACE);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
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
			setState(578);
			match(PLAN);
			setState(579);
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
			setState(582);
			match(NUMBER);
			setState(583);
			match(COLON);
			setState(584);
			plan_order();
			}
			_ctx.stop = _input.LT(-1);
			setState(593);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Query_plan_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_query_plan_list);
					setState(586);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(587);
					match(COMMA);
					setState(588);
					match(NUMBER);
					setState(589);
					match(COLON);
					setState(590);
					plan_order();
					}
					} 
				}
				setState(595);
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
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				match(LPAREN);
				setState(597);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				match(LPAREN);
				setState(599);
				non_empty_plan_order_list(0);
				setState(600);
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
			setState(605);
			match(NUMBER);
			}
			_ctx.stop = _input.LT(-1);
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_plan_order_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_plan_order_list);
					setState(607);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(608);
					match(COMMA);
					setState(609);
					match(NUMBER);
					}
					} 
				}
				setState(614);
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
			setState(615);
			component_head(0);
			setState(616);
			match(LBRACE);
			setState(617);
			component_body(0);
			setState(618);
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
			setState(621);
			match(COMPONENT);
			setState(622);
			component_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(632);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(630);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new Component_headContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_head);
						setState(624);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(625);
						match(COLON);
						setState(626);
						component_type();
						}
						break;
					case 2:
						{
						_localctx = new Component_headContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_head);
						setState(627);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(628);
						match(COMMA);
						setState(629);
						component_type();
						}
						break;
					}
					} 
				}
				setState(634);
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
		enterRule(_localctx, 80, RULE_component_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(IDENT);
			setState(636);
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
		enterRule(_localctx, 82, RULE_component_type_params);
		try {
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				match(LT);
				setState(640);
				component_param_list(0);
				setState(641);
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
			{
			setState(646);
			match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Component_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_component_param_list);
					setState(648);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(649);
					match(COMMA);
					setState(650);
					match(IDENT);
					}
					} 
				}
				setState(655);
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
			setState(676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(674);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(657);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(658);
						directive_head();
						}
						break;
					case 2:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(659);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(660);
						souffle_rule();
						}
						break;
					case 3:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(661);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(662);
						fact();
						}
						break;
					case 4:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(663);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(664);
						match(OVERRIDE);
						setState(665);
						match(IDENT);
						}
						break;
					case 5:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(666);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(667);
						component_init();
						}
						break;
					case 6:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(668);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(669);
						component_decl();
						}
						break;
					case 7:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(670);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(671);
						type_decl();
						}
						break;
					case 8:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(672);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(673);
						relation_decl();
						}
						break;
					}
					} 
				}
				setState(678);
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
			setState(679);
			match(INSTANTIATE);
			setState(680);
			match(IDENT);
			setState(681);
			match(EQUALS);
			setState(682);
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
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				match(FUNCTOR);
				setState(685);
				match(IDENT);
				setState(686);
				match(LPAREN);
				setState(687);
				functor_arg_type_list();
				setState(688);
				match(RPAREN);
				setState(689);
				match(COLON);
				setState(690);
				qualified_name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				match(FUNCTOR);
				setState(693);
				match(IDENT);
				setState(694);
				match(LPAREN);
				setState(695);
				functor_arg_type_list();
				setState(696);
				match(RPAREN);
				setState(697);
				match(COLON);
				setState(698);
				qualified_name(0);
				setState(699);
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
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
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
			setState(708);
			functor_attribute();
			}
			_ctx.stop = _input.LT(-1);
			setState(715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_functor_arg_type_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_functor_arg_type_list);
					setState(710);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(711);
					match(COMMA);
					setState(712);
					functor_attribute();
					}
					} 
				}
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				qualified_name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				match(IDENT);
				setState(720);
				match(COLON);
				setState(721);
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
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				match(PRAGMA);
				setState(725);
				match(STRING);
				setState(726);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
				match(PRAGMA);
				setState(728);
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
			setState(731);
			directive_head_decl();
			setState(732);
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
			setState(734);
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
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				relation_directive_list(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				relation_directive_list(0);
				setState(738);
				match(LPAREN);
				setState(739);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(741);
				relation_directive_list(0);
				setState(742);
				match(LPAREN);
				setState(743);
				non_empty_key_value_pairs(0);
				setState(744);
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
			setState(749);
			qualified_name(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(756);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Relation_directive_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relation_directive_list);
					setState(751);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(752);
					match(COMMA);
					setState(753);
					qualified_name(0);
					}
					} 
				}
				setState(758);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
			setState(760);
			match(IDENT);
			setState(761);
			match(EQUALS);
			setState(762);
			kvp_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(771);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_key_value_pairsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_key_value_pairs);
					setState(764);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(765);
					match(COMMA);
					setState(766);
					match(IDENT);
					setState(767);
					match(EQUALS);
					setState(768);
					kvp_value();
					}
					} 
				}
				setState(773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (TRUELIT - 56)) | (1L << (FALSELIT - 56)) | (1L << (NUMBER - 56)) | (1L << (IDENT - 56)) | (1L << (STRING - 56)))) != 0)) ) {
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
			return precpred(_ctx, 1);
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
			return precpred(_ctx, 1);
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
			return precpred(_ctx, 16);
		case 33:
			return precpred(_ctx, 15);
		case 34:
			return precpred(_ctx, 14);
		case 35:
			return precpred(_ctx, 13);
		case 36:
			return precpred(_ctx, 12);
		case 37:
			return precpred(_ctx, 11);
		case 38:
			return precpred(_ctx, 10);
		case 39:
			return precpred(_ctx, 9);
		case 40:
			return precpred(_ctx, 8);
		case 41:
			return precpred(_ctx, 7);
		case 42:
			return precpred(_ctx, 6);
		case 43:
			return precpred(_ctx, 5);
		case 44:
			return precpred(_ctx, 4);
		case 45:
			return precpred(_ctx, 3);
		case 46:
			return precpred(_ctx, 2);
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
			return precpred(_ctx, 1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3e\u030b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0088"+
		"\n\3\f\3\16\3\u008b\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0093\n\4\f\4\16"+
		"\4\u0096\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ae\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u00b6\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00be\n\7\f\7\16\7\u00c1\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c9\n\b\f\b\16\b\u00cc\13\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d6\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00e4\n\13\f\13\16\13\u00e7\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00ef\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00f7\n\r\f\r"+
		"\16\r\u00fa\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u0119\n\17\f\17\16\17\u011c\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u0124\n\20\f\20\16\20\u0127\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u012e\n\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0136"+
		"\n\22\f\22\16\22\u0139\13\22\3\23\3\23\3\23\5\23\u013e\n\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0156\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0163\n\27\f\27\16\27\u0166\13\27"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0170\n\31\f\31\16\31\u0173"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u017b\n\32\f\32\16\32\u017e"+
		"\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0188\n\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u01b7\n\35\3\36\3\36\5\36\u01bb\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\7\37\u01c3\n\37\f\37\16\37\u01c6\13\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0206\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0235\n \f \16 \u0238\13 \3!"+
		"\3!\3\"\3\"\3#\3#\3#\3#\3#\5#\u0243\n#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\7%\u0252\n%\f%\16%\u0255\13%\3&\3&\3&\3&\3&\3&\5&\u025d\n&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\7\'\u0265\n\'\f\'\16\'\u0268\13\'\3(\3(\3(\3(\3("+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0279\n)\f)\16)\u027c\13)\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\5+\u0286\n+\3,\3,\3,\3,\3,\3,\7,\u028e\n,\f,\16,\u0291\13"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u02a5\n-\f"+
		"-\16-\u02a8\13-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\5/\u02c0\n/\3\60\3\60\5\60\u02c4\n\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\7\61\u02cc\n\61\f\61\16\61\u02cf\13\61\3\62\3\62\3\62\3\62"+
		"\5\62\u02d5\n\62\3\63\3\63\3\63\3\63\3\63\5\63\u02dc\n\63\3\64\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u02ed"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u02f5\n\67\f\67\16\67\u02f8\13"+
		"\67\38\38\38\38\38\38\38\38\38\38\78\u0304\n8\f8\168\u0307\138\39\39\3"+
		"9\2\30\4\6\f\16\24\30\34\36\",\60\62<>HLPVX`ln:\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\6"+
		"\4\2 $<?\5\2\37\37\63\6489\3\2\6\t\5\2:;]]`a\2\u0348\2r\3\2\2\2\4t\3\2"+
		"\2\2\6\u008c\3\2\2\2\b\u00ad\3\2\2\2\n\u00b5\3\2\2\2\f\u00b7\3\2\2\2\16"+
		"\u00c2\3\2\2\2\20\u00d5\3\2\2\2\22\u00d7\3\2\2\2\24\u00dd\3\2\2\2\26\u00ee"+
		"\3\2\2\2\30\u00f0\3\2\2\2\32\u00fb\3\2\2\2\34\u00ff\3\2\2\2\36\u011d\3"+
		"\2\2\2 \u012d\3\2\2\2\"\u012f\3\2\2\2$\u013d\3\2\2\2&\u013f\3\2\2\2(\u0155"+
		"\3\2\2\2*\u0157\3\2\2\2,\u015c\3\2\2\2.\u0167\3\2\2\2\60\u0169\3\2\2\2"+
		"\62\u0174\3\2\2\2\64\u0187\3\2\2\2\66\u0189\3\2\2\28\u01b6\3\2\2\2:\u01ba"+
		"\3\2\2\2<\u01bc\3\2\2\2>\u0205\3\2\2\2@\u0239\3\2\2\2B\u023b\3\2\2\2D"+
		"\u0242\3\2\2\2F\u0244\3\2\2\2H\u0247\3\2\2\2J\u025c\3\2\2\2L\u025e\3\2"+
		"\2\2N\u0269\3\2\2\2P\u026e\3\2\2\2R\u027d\3\2\2\2T\u0285\3\2\2\2V\u0287"+
		"\3\2\2\2X\u0292\3\2\2\2Z\u02a9\3\2\2\2\\\u02bf\3\2\2\2^\u02c3\3\2\2\2"+
		"`\u02c5\3\2\2\2b\u02d4\3\2\2\2d\u02db\3\2\2\2f\u02dd\3\2\2\2h\u02e0\3"+
		"\2\2\2j\u02ec\3\2\2\2l\u02ee\3\2\2\2n\u02f9\3\2\2\2p\u0308\3\2\2\2rs\5"+
		"\4\3\2s\3\3\2\2\2t\u0089\b\3\1\2uv\f\13\2\2v\u0088\5f\64\2wx\f\n\2\2x"+
		"\u0088\5(\25\2yz\f\t\2\2z\u0088\5&\24\2{|\f\b\2\2|\u0088\5N(\2}~\f\7\2"+
		"\2~\u0088\5Z.\2\177\u0080\f\6\2\2\u0080\u0088\5d\63\2\u0081\u0082\f\5"+
		"\2\2\u0082\u0088\5\b\5\2\u0083\u0084\f\4\2\2\u0084\u0088\5\\/\2\u0085"+
		"\u0086\f\3\2\2\u0086\u0088\5\22\n\2\u0087u\3\2\2\2\u0087w\3\2\2\2\u0087"+
		"y\3\2\2\2\u0087{\3\2\2\2\u0087}\3\2\2\2\u0087\177\3\2\2\2\u0087\u0081"+
		"\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\5\3\2\2\2\u008b\u0089\3\2\2\2"+
		"\u008c\u008d\b\4\1\2\u008d\u008e\7`\2\2\u008e\u0094\3\2\2\2\u008f\u0090"+
		"\f\3\2\2\u0090\u0091\7\\\2\2\u0091\u0093\7`\2\2\u0092\u008f\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\7\3\2\2\2"+
		"\u0096\u0094\3\2\2\2\u0097\u0098\7\n\2\2\u0098\u0099\7`\2\2\u0099\u009a"+
		"\7L\2\2\u009a\u00ae\5\6\4\2\u009b\u009c\7\n\2\2\u009c\u009d\7`\2\2\u009d"+
		"\u009e\7P\2\2\u009e\u00ae\5\f\7\2\u009f\u00a0\7\n\2\2\u00a0\u00a1\7`\2"+
		"\2\u00a1\u00a2\7P\2\2\u00a2\u00ae\5\n\6\2\u00a3\u00a4\7\n\2\2\u00a4\u00a5"+
		"\7`\2\2\u00a5\u00a6\7P\2\2\u00a6\u00ae\5\16\b\2\u00a7\u00a8\7\r\2\2\u00a8"+
		"\u00ae\7`\2\2\u00a9\u00aa\7\16\2\2\u00aa\u00ae\7`\2\2\u00ab\u00ac\7\n"+
		"\2\2\u00ac\u00ae\7`\2\2\u00ad\u0097\3\2\2\2\u00ad\u009b\3\2\2\2\u00ad"+
		"\u009f\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00a9\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ae\t\3\2\2\2\u00af\u00b0\7B\2\2\u00b0\u00b6"+
		"\7C\2\2\u00b1\u00b2\7B\2\2\u00b2\u00b3\5\30\r\2\u00b3\u00b4\7C\2\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\13\3\2\2"+
		"\2\u00b7\u00b8\b\7\1\2\u00b8\u00b9\5\6\4\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb"+
		"\f\3\2\2\u00bb\u00bc\7A\2\2\u00bc\u00be\5\6\4\2\u00bd\u00ba\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\r\3\2\2\2"+
		"\u00c1\u00bf\3\2\2\2\u00c2\u00c3\b\b\1\2\u00c3\u00c4\5\20\t\2\u00c4\u00ca"+
		"\3\2\2\2\u00c5\u00c6\f\3\2\2\u00c6\u00c7\7A\2\2\u00c7\u00c9\5\20\t\2\u00c8"+
		"\u00c5\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\17\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7`\2\2\u00ce\u00cf"+
		"\7W\2\2\u00cf\u00d6\7X\2\2\u00d0\u00d1\7`\2\2\u00d1\u00d2\7W\2\2\u00d2"+
		"\u00d3\5\30\r\2\u00d3\u00d4\7X\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00cd\3\2"+
		"\2\2\u00d5\u00d0\3\2\2\2\u00d6\21\3\2\2\2\u00d7\u00d8\7\4\2\2\u00d8\u00d9"+
		"\5\24\13\2\u00d9\u00da\5\26\f\2\u00da\u00db\5\34\17\2\u00db\u00dc\5$\23"+
		"\2\u00dc\23\3\2\2\2\u00dd\u00de\b\13\1\2\u00de\u00df\7`\2\2\u00df\u00e5"+
		"\3\2\2\2\u00e0\u00e1\f\3\2\2\u00e1\u00e2\7I\2\2\u00e2\u00e4\7`\2\2\u00e3"+
		"\u00e0\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\25\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7G\2\2\u00e9\u00ef"+
		"\7H\2\2\u00ea\u00eb\7G\2\2\u00eb\u00ec\5\30\r\2\u00ec\u00ed\7H\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ef\27\3\2\2"+
		"\2\u00f0\u00f1\b\r\1\2\u00f1\u00f2\5\32\16\2\u00f2\u00f8\3\2\2\2\u00f3"+
		"\u00f4\f\3\2\2\u00f4\u00f5\7I\2\2\u00f5\u00f7\5\32\16\2\u00f6\u00f3\3"+
		"\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\31\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7`\2\2\u00fc\u00fd\7J\2\2"+
		"\u00fd\u00fe\5\6\4\2\u00fe\33\3\2\2\2\u00ff\u011a\b\17\1\2\u0100\u0101"+
		"\f\16\2\2\u0101\u0119\7)\2\2\u0102\u0103\f\r\2\2\u0103\u0119\7,\2\2\u0104"+
		"\u0105\f\f\2\2\u0105\u0119\7-\2\2\u0106\u0107\f\13\2\2\u0107\u0119\7."+
		"\2\2\u0108\u0109\f\n\2\2\u0109\u0119\7/\2\2\u010a\u010b\f\t\2\2\u010b"+
		"\u0119\7\60\2\2\u010c\u010d\f\b\2\2\u010d\u0119\7\62\2\2\u010e\u010f\f"+
		"\7\2\2\u010f\u0119\7\61\2\2\u0110\u0111\f\6\2\2\u0111\u0119\7+\2\2\u0112"+
		"\u0113\f\5\2\2\u0113\u0119\7\'\2\2\u0114\u0115\f\4\2\2\u0115\u0119\7("+
		"\2\2\u0116\u0117\f\3\2\2\u0117\u0119\7*\2\2\u0118\u0100\3\2\2\2\u0118"+
		"\u0102\3\2\2\2\u0118\u0104\3\2\2\2\u0118\u0106\3\2\2\2\u0118\u0108\3\2"+
		"\2\2\u0118\u010a\3\2\2\2\u0118\u010c\3\2\2\2\u0118\u010e\3\2\2\2\u0118"+
		"\u0110\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0114\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\35\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\b\20\1\2\u011e\u011f\7`\2"+
		"\2\u011f\u0125\3\2\2\2\u0120\u0121\f\3\2\2\u0121\u0122\7I\2\2\u0122\u0124"+
		"\7`\2\2\u0123\u0120\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\37\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012e\7`\2\2"+
		"\u0129\u012a\7G\2\2\u012a\u012b\5\36\20\2\u012b\u012c\7H\2\2\u012c\u012e"+
		"\3\2\2\2\u012d\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012e!\3\2\2\2\u012f"+
		"\u0130\b\22\1\2\u0130\u0131\5 \21\2\u0131\u0137\3\2\2\2\u0132\u0133\f"+
		"\3\2\2\u0133\u0134\7I\2\2\u0134\u0136\5 \21\2\u0135\u0132\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138#\3\2\2\2"+
		"\u0139\u0137\3\2\2\2\u013a\u013e\3\2\2\2\u013b\u013c\7@\2\2\u013c\u013e"+
		"\5\"\22\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013e%\3\2\2\2\u013f"+
		"\u0140\5\66\34\2\u0140\u0141\7\\\2\2\u0141\'\3\2\2\2\u0142\u0156\5*\26"+
		"\2\u0143\u0144\5*\26\2\u0144\u0145\5F$\2\u0145\u0156\3\2\2\2\u0146\u0147"+
		"\5\66\34\2\u0147\u0148\7M\2\2\u0148\u0149\5\66\34\2\u0149\u014a\7[\2\2"+
		"\u014a\u014b\5.\30\2\u014b\u014c\7\\\2\2\u014c\u0156\3\2\2\2\u014d\u014e"+
		"\5\66\34\2\u014e\u014f\7M\2\2\u014f\u0150\5\66\34\2\u0150\u0151\7[\2\2"+
		"\u0151\u0152\5.\30\2\u0152\u0153\7\\\2\2\u0153\u0154\5F$\2\u0154\u0156"+
		"\3\2\2\2\u0155\u0142\3\2\2\2\u0155\u0143\3\2\2\2\u0155\u0146\3\2\2\2\u0155"+
		"\u014d\3\2\2\2\u0156)\3\2\2\2\u0157\u0158\5,\27\2\u0158\u0159\7[\2\2\u0159"+
		"\u015a\5.\30\2\u015a\u015b\7\\\2\2\u015b+\3\2\2\2\u015c\u015d\b\27\1\2"+
		"\u015d\u015e\5\66\34\2\u015e\u0164\3\2\2\2\u015f\u0160\f\3\2\2\u0160\u0161"+
		"\7I\2\2\u0161\u0163\5\66\34\2\u0162\u015f\3\2\2\2\u0163\u0166\3\2\2\2"+
		"\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165-\3\2\2\2\u0166\u0164\3"+
		"\2\2\2\u0167\u0168\5\60\31\2\u0168/\3\2\2\2\u0169\u016a\b\31\1\2\u016a"+
		"\u016b\5\62\32\2\u016b\u0171\3\2\2\2\u016c\u016d\f\3\2\2\u016d\u016e\7"+
		"K\2\2\u016e\u0170\5\62\32\2\u016f\u016c\3\2\2\2\u0170\u0173\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\61\3\2\2\2\u0173\u0171\3\2\2"+
		"\2\u0174\u0175\b\32\1\2\u0175\u0176\5\64\33\2\u0176\u017c\3\2\2\2\u0177"+
		"\u0178\f\3\2\2\u0178\u0179\7I\2\2\u0179\u017b\5\64\33\2\u017a\u0177\3"+
		"\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\63\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0188\5\66\34\2\u0180\u0188\58\35"+
		"\2\u0181\u0182\7G\2\2\u0182\u0183\5\60\31\2\u0183\u0184\7H\2\2\u0184\u0188"+
		"\3\2\2\2\u0185\u0186\7Q\2\2\u0186\u0188\5\64\33\2\u0187\u017f\3\2\2\2"+
		"\u0187\u0180\3\2\2\2\u0187\u0181\3\2\2\2\u0187\u0185\3\2\2\2\u0188\65"+
		"\3\2\2\2\u0189\u018a\5\6\4\2\u018a\u018b\7G\2\2\u018b\u018c\5:\36\2\u018c"+
		"\u018d\7H\2\2\u018d\67\3\2\2\2\u018e\u018f\5> \2\u018f\u0190\7Y\2\2\u0190"+
		"\u0191\5> \2\u0191\u01b7\3\2\2\2\u0192\u0193\5> \2\u0193\u0194\7Z\2\2"+
		"\u0194\u0195\5> \2\u0195\u01b7\3\2\2\2\u0196\u0197\5> \2\u0197\u0198\7"+
		"M\2\2\u0198\u0199\5> \2\u0199\u01b7\3\2\2\2\u019a\u019b\5> \2\u019b\u019c"+
		"\7N\2\2\u019c\u019d\5> \2\u019d\u01b7\3\2\2\2\u019e\u019f\5> \2\u019f"+
		"\u01a0\7P\2\2\u01a0\u01a1\5> \2\u01a1\u01b7\3\2\2\2\u01a2\u01a3\5> \2"+
		"\u01a3\u01a4\7O\2\2\u01a4\u01a5\5> \2\u01a5\u01b7\3\2\2\2\u01a6\u01a7"+
		"\7\36\2\2\u01a7\u01a8\7G\2\2\u01a8\u01a9\5> \2\u01a9\u01aa\7I\2\2\u01aa"+
		"\u01ab\5> \2\u01ab\u01ac\7H\2\2\u01ac\u01b7\3\2\2\2\u01ad\u01ae\7&\2\2"+
		"\u01ae\u01af\7G\2\2\u01af\u01b0\5> \2\u01b0\u01b1\7I\2\2\u01b1\u01b2\5"+
		"> \2\u01b2\u01b3\7H\2\2\u01b3\u01b7\3\2\2\2\u01b4\u01b7\7:\2\2\u01b5\u01b7"+
		"\7;\2\2\u01b6\u018e\3\2\2\2\u01b6\u0192\3\2\2\2\u01b6\u0196\3\2\2\2\u01b6"+
		"\u019a\3\2\2\2\u01b6\u019e\3\2\2\2\u01b6\u01a2\3\2\2\2\u01b6\u01a6\3\2"+
		"\2\2\u01b6\u01ad\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7"+
		"9\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01bb\5<\37\2\u01ba\u01b8\3\2\2\2"+
		"\u01ba\u01b9\3\2\2\2\u01bb;\3\2\2\2\u01bc\u01bd\b\37\1\2\u01bd\u01be\5"+
		"> \2\u01be\u01c4\3\2\2\2\u01bf\u01c0\f\3\2\2\u01c0\u01c1\7I\2\2\u01c1"+
		"\u01c3\5> \2\u01c2\u01bf\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2"+
		"\2\u01c4\u01c5\3\2\2\2\u01c5=\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8"+
		"\b \1\2\u01c8\u0206\7a\2\2\u01c9\u0206\7^\2\2\u01ca\u0206\7_\2\2\u01cb"+
		"\u0206\7]\2\2\u01cc\u0206\7\67\2\2\u01cd\u0206\7D\2\2\u01ce\u01cf\7\22"+
		"\2\2\u01cf\u01d0\7G\2\2\u01d0\u0206\7H\2\2\u01d1\u0206\7`\2\2\u01d2\u0206"+
		"\7\66\2\2\u01d3\u01d4\7B\2\2\u01d4\u01d5\5:\36\2\u01d5\u01d6\7C\2\2\u01d6"+
		"\u0206\3\2\2\2\u01d7\u01d8\7D\2\2\u01d8\u01d9\5\6\4\2\u01d9\u01da\7G\2"+
		"\2\u01da\u01db\5:\36\2\u01db\u01dc\7H\2\2\u01dc\u0206\3\2\2\2\u01dd\u01de"+
		"\7G\2\2\u01de\u01df\5> \2\u01df\u01e0\7H\2\2\u01e0\u0206\3\2\2\2\u01e1"+
		"\u01e2\7\65\2\2\u01e2\u01e3\7G\2\2\u01e3\u01e4\5> \2\u01e4\u01e5\7I\2"+
		"\2\u01e5\u01e6\5\6\4\2\u01e6\u01e7\7H\2\2\u01e7\u0206\3\2\2\2\u01e8\u01e9"+
		"\7S\2\2\u01e9\u01ea\7`\2\2\u01ea\u01eb\7G\2\2\u01eb\u01ec\5:\36\2\u01ec"+
		"\u01ed\7H\2\2\u01ed\u0206\3\2\2\2\u01ee\u01ef\5@!\2\u01ef\u01f0\7G\2\2"+
		"\u01f0\u01f1\5:\36\2\u01f1\u01f2\7H\2\2\u01f2\u0206\3\2\2\2\u01f3\u01f4"+
		"\5B\"\2\u01f4\u01f5\7G\2\2\u01f5\u01f6\5> \2\u01f6\u01f7\7I\2\2\u01f7"+
		"\u01f8\5<\37\2\u01f8\u01f9\7H\2\2\u01f9\u0206\3\2\2\2\u01fa\u01fb\7F\2"+
		"\2\u01fb\u0206\5> \25\u01fc\u01fd\7\26\2\2\u01fd\u0206\5> \24\u01fe\u01ff"+
		"\7\35\2\2\u01ff\u0206\5> \23\u0200\u0201\5B\"\2\u0201\u0202\5:\36\2\u0202"+
		"\u0203\7J\2\2\u0203\u0204\5D#\2\u0204\u0206\3\2\2\2\u0205\u01c7\3\2\2"+
		"\2\u0205\u01c9\3\2\2\2\u0205\u01ca\3\2\2\2\u0205\u01cb\3\2\2\2\u0205\u01cc"+
		"\3\2\2\2\u0205\u01cd\3\2\2\2\u0205\u01ce\3\2\2\2\u0205\u01d1\3\2\2\2\u0205"+
		"\u01d2\3\2\2\2\u0205\u01d3\3\2\2\2\u0205\u01d7\3\2\2\2\u0205\u01dd\3\2"+
		"\2\2\u0205\u01e1\3\2\2\2\u0205\u01e8\3\2\2\2\u0205\u01ee\3\2\2\2\u0205"+
		"\u01f3\3\2\2\2\u0205\u01fa\3\2\2\2\u0205\u01fc\3\2\2\2\u0205\u01fe\3\2"+
		"\2\2\u0205\u0200\3\2\2\2\u0206\u0236\3\2\2\2\u0207\u0208\f\22\2\2\u0208"+
		"\u0209\7E\2\2\u0209\u0235\5> \23\u020a\u020b\f\21\2\2\u020b\u020c\7F\2"+
		"\2\u020c\u0235\5> \22\u020d\u020e\f\20\2\2\u020e\u020f\7R\2\2\u020f\u0235"+
		"\5> \21\u0210\u0211\f\17\2\2\u0211\u0212\7T\2\2\u0212\u0235\5> \20\u0213"+
		"\u0214\f\16\2\2\u0214\u0215\7V\2\2\u0215\u0235\5> \17\u0216\u0217\f\r"+
		"\2\2\u0217\u0218\7U\2\2\u0218\u0235\5> \16\u0219\u021a\f\f\2\2\u021a\u021b"+
		"\7\32\2\2\u021b\u0235\5> \r\u021c\u021d\f\13\2\2\u021d\u021e\7\33\2\2"+
		"\u021e\u0235\5> \f\u021f\u0220\f\n\2\2\u0220\u0221\7\34\2\2\u0221\u0235"+
		"\5> \13\u0222\u0223\f\t\2\2\u0223\u0224\7\23\2\2\u0224\u0235\5> \n\u0225"+
		"\u0226\f\b\2\2\u0226\u0227\7\24\2\2\u0227\u0235\5> \t\u0228\u0229\f\7"+
		"\2\2\u0229\u022a\7\25\2\2\u022a\u0235\5> \b\u022b\u022c\f\6\2\2\u022c"+
		"\u022d\7\27\2\2\u022d\u0235\5> \7\u022e\u022f\f\5\2\2\u022f\u0230\7\30"+
		"\2\2\u0230\u0235\5> \6\u0231\u0232\f\4\2\2\u0232\u0233\7\31\2\2\u0233"+
		"\u0235\5> \5\u0234\u0207\3\2\2\2\u0234\u020a\3\2\2\2\u0234\u020d\3\2\2"+
		"\2\u0234\u0210\3\2\2\2\u0234\u0213\3\2\2\2\u0234\u0216\3\2\2\2\u0234\u0219"+
		"\3\2\2\2\u0234\u021c\3\2\2\2\u0234\u021f\3\2\2\2\u0234\u0222\3\2\2\2\u0234"+
		"\u0225\3\2\2\2\u0234\u0228\3\2\2\2\u0234\u022b\3\2\2\2\u0234\u022e\3\2"+
		"\2\2\u0234\u0231\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237?\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\t\2\2\2"+
		"\u023aA\3\2\2\2\u023b\u023c\t\3\2\2\u023cC\3\2\2\2\u023d\u023e\7W\2\2"+
		"\u023e\u023f\5.\30\2\u023f\u0240\7X\2\2\u0240\u0243\3\2\2\2\u0241\u0243"+
		"\5\66\34\2\u0242\u023d\3\2\2\2\u0242\u0241\3\2\2\2\u0243E\3\2\2\2\u0244"+
		"\u0245\7\21\2\2\u0245\u0246\5H%\2\u0246G\3\2\2\2\u0247\u0248\b%\1\2\u0248"+
		"\u0249\7]\2\2\u0249\u024a\7J\2\2\u024a\u024b\5J&\2\u024b\u0253\3\2\2\2"+
		"\u024c\u024d\f\3\2\2\u024d\u024e\7I\2\2\u024e\u024f\7]\2\2\u024f\u0250"+
		"\7J\2\2\u0250\u0252\5J&\2\u0251\u024c\3\2\2\2\u0252\u0255\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254I\3\2\2\2\u0255\u0253\3\2\2\2"+
		"\u0256\u0257\7G\2\2\u0257\u025d\7H\2\2\u0258\u0259\7G\2\2\u0259\u025a"+
		"\5L\'\2\u025a\u025b\7H\2\2\u025b\u025d\3\2\2\2\u025c\u0256\3\2\2\2\u025c"+
		"\u0258\3\2\2\2\u025dK\3\2\2\2\u025e\u025f\b\'\1\2\u025f\u0260\7]\2\2\u0260"+
		"\u0266\3\2\2\2\u0261\u0262\f\3\2\2\u0262\u0263\7I\2\2\u0263\u0265\7]\2"+
		"\2\u0264\u0261\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267"+
		"\3\2\2\2\u0267M\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026a\5P)\2\u026a\u026b"+
		"\7W\2\2\u026b\u026c\5X-\2\u026c\u026d\7X\2\2\u026dO\3\2\2\2\u026e\u026f"+
		"\b)\1\2\u026f\u0270\7\13\2\2\u0270\u0271\5R*\2\u0271\u027a\3\2\2\2\u0272"+
		"\u0273\f\4\2\2\u0273\u0274\7J\2\2\u0274\u0279\5R*\2\u0275\u0276\f\3\2"+
		"\2\u0276\u0277\7I\2\2\u0277\u0279\5R*\2\u0278\u0272\3\2\2\2\u0278\u0275"+
		"\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"Q\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027e\7`\2\2\u027e\u027f\5T+\2\u027f"+
		"S\3\2\2\2\u0280\u0286\3\2\2\2\u0281\u0282\7Y\2\2\u0282\u0283\5V,\2\u0283"+
		"\u0284\7Z\2\2\u0284\u0286\3\2\2\2\u0285\u0280\3\2\2\2\u0285\u0281\3\2"+
		"\2\2\u0286U\3\2\2\2\u0287\u0288\b,\1\2\u0288\u0289\7`\2\2\u0289\u028f"+
		"\3\2\2\2\u028a\u028b\f\3\2\2\u028b\u028c\7I\2\2\u028c\u028e\7`\2\2\u028d"+
		"\u028a\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2"+
		"\2\2\u0290W\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u02a6\b-\1\2\u0293\u0294"+
		"\f\n\2\2\u0294\u02a5\5f\64\2\u0295\u0296\f\t\2\2\u0296\u02a5\5(\25\2\u0297"+
		"\u0298\f\b\2\2\u0298\u02a5\5&\24\2\u0299\u029a\f\7\2\2\u029a\u029b\7\17"+
		"\2\2\u029b\u02a5\7`\2\2\u029c\u029d\f\6\2\2\u029d\u02a5\5Z.\2\u029e\u029f"+
		"\f\5\2\2\u029f\u02a5\5N(\2\u02a0\u02a1\f\4\2\2\u02a1\u02a5\5\b\5\2\u02a2"+
		"\u02a3\f\3\2\2\u02a3\u02a5\5\22\n\2\u02a4\u0293\3\2\2\2\u02a4\u0295\3"+
		"\2\2\2\u02a4\u0297\3\2\2\2\u02a4\u0299\3\2\2\2\u02a4\u029c\3\2\2\2\u02a4"+
		"\u029e\3\2\2\2\u02a4\u02a0\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a8\3\2"+
		"\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7Y\3\2\2\2\u02a8\u02a6"+
		"\3\2\2\2\u02a9\u02aa\7\f\2\2\u02aa\u02ab\7`\2\2\u02ab\u02ac\7P\2\2\u02ac"+
		"\u02ad\5R*\2\u02ad[\3\2\2\2\u02ae\u02af\7\5\2\2\u02af\u02b0\7`\2\2\u02b0"+
		"\u02b1\7G\2\2\u02b1\u02b2\5^\60\2\u02b2\u02b3\7H\2\2\u02b3\u02b4\7J\2"+
		"\2\u02b4\u02b5\5\6\4\2\u02b5\u02c0\3\2\2\2\u02b6\u02b7\7\5\2\2\u02b7\u02b8"+
		"\7`\2\2\u02b8\u02b9\7G\2\2\u02b9\u02ba\5^\60\2\u02ba\u02bb\7H\2\2\u02bb"+
		"\u02bc\7J\2\2\u02bc\u02bd\5\6\4\2\u02bd\u02be\7%\2\2\u02be\u02c0\3\2\2"+
		"\2\u02bf\u02ae\3\2\2\2\u02bf\u02b6\3\2\2\2\u02c0]\3\2\2\2\u02c1\u02c4"+
		"\3\2\2\2\u02c2\u02c4\5`\61\2\u02c3\u02c1\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c4"+
		"_\3\2\2\2\u02c5\u02c6\b\61\1\2\u02c6\u02c7\5b\62\2\u02c7\u02cd\3\2\2\2"+
		"\u02c8\u02c9\f\3\2\2\u02c9\u02ca\7I\2\2\u02ca\u02cc\5b\62\2\u02cb\u02c8"+
		"\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"a\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d5\5\6\4\2\u02d1\u02d2\7`\2\2\u02d2"+
		"\u02d3\7J\2\2\u02d3\u02d5\5\6\4\2\u02d4\u02d0\3\2\2\2\u02d4\u02d1\3\2"+
		"\2\2\u02d5c\3\2\2\2\u02d6\u02d7\7\20\2\2\u02d7\u02d8\7a\2\2\u02d8\u02dc"+
		"\7a\2\2\u02d9\u02da\7\20\2\2\u02da\u02dc\7a\2\2\u02db\u02d6\3\2\2\2\u02db"+
		"\u02d9\3\2\2\2\u02dce\3\2\2\2\u02dd\u02de\5h\65\2\u02de\u02df\5j\66\2"+
		"\u02dfg\3\2\2\2\u02e0\u02e1\t\4\2\2\u02e1i\3\2\2\2\u02e2\u02ed\5l\67\2"+
		"\u02e3\u02e4\5l\67\2\u02e4\u02e5\7G\2\2\u02e5\u02e6\7H\2\2\u02e6\u02ed"+
		"\3\2\2\2\u02e7\u02e8\5l\67\2\u02e8\u02e9\7G\2\2\u02e9\u02ea\5n8\2\u02ea"+
		"\u02eb\7H\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02e2\3\2\2\2\u02ec\u02e3\3\2"+
		"\2\2\u02ec\u02e7\3\2\2\2\u02edk\3\2\2\2\u02ee\u02ef\b\67\1\2\u02ef\u02f0"+
		"\5\6\4\2\u02f0\u02f6\3\2\2\2\u02f1\u02f2\f\3\2\2\u02f2\u02f3\7I\2\2\u02f3"+
		"\u02f5\5\6\4\2\u02f4\u02f1\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2"+
		"\2\2\u02f6\u02f7\3\2\2\2\u02f7m\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02fa"+
		"\b8\1\2\u02fa\u02fb\7`\2\2\u02fb\u02fc\7P\2\2\u02fc\u02fd\5p9\2\u02fd"+
		"\u0305\3\2\2\2\u02fe\u02ff\f\3\2\2\u02ff\u0300\7I\2\2\u0300\u0301\7`\2"+
		"\2\u0301\u0302\7P\2\2\u0302\u0304\5p9\2\u0303\u02fe\3\2\2\2\u0304\u0307"+
		"\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306o\3\2\2\2\u0307"+
		"\u0305\3\2\2\2\u0308\u0309\t\5\2\2\u0309q\3\2\2\2\60\u0087\u0089\u0094"+
		"\u00ad\u00b5\u00bf\u00ca\u00d5\u00e5\u00ee\u00f8\u0118\u011a\u0125\u012d"+
		"\u0137\u013d\u0155\u0164\u0171\u017c\u0187\u01b6\u01ba\u01c4\u0205\u0234"+
		"\u0236\u0242\u0253\u025c\u0266\u0278\u027a\u0285\u028f\u02a4\u02a6\u02bf"+
		"\u02c3\u02cd\u02d4\u02db\u02ec\u02f6\u0305";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}