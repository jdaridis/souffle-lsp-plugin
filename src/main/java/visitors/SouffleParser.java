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
		PREPROCESSOR=98, PREPROCESSOR_MULTILINE=99;
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
			"FLOAT", "UNSIGNED", "IDENT", "STRING", "COMMENT", "LINE_COMMENT", "PREPROCESSOR", 
			"PREPROCESSOR_MULTILINE"
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
			setState(112);
			unit(0);
			setState(113);
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
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(116);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(117);
						directive_head();
						}
						break;
					case 2:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(118);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(119);
						souffle_rule();
						}
						break;
					case 3:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(120);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(121);
						fact();
						}
						break;
					case 4:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(122);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(123);
						component_decl();
						}
						break;
					case 5:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(124);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(125);
						component_init();
						}
						break;
					case 6:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(126);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(127);
						pragma();
						}
						break;
					case 7:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(128);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(129);
						type_decl();
						}
						break;
					case 8:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(130);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(131);
						functor_decl();
						}
						break;
					case 9:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(132);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(133);
						relation_decl();
						}
						break;
					}
					} 
				}
				setState(138);
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
			setState(140);
			match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
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
					setState(142);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(143);
					match(DOT);
					setState(144);
					match(IDENT);
					}
					} 
				}
				setState(149);
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
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(TYPE);
				setState(151);
				match(IDENT);
				setState(152);
				match(SUBTYPE);
				setState(153);
				qualified_name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(TYPE);
				setState(155);
				match(IDENT);
				setState(156);
				match(EQUALS);
				setState(157);
				union_type_list(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(TYPE);
				setState(159);
				match(IDENT);
				setState(160);
				match(EQUALS);
				setState(161);
				record_type_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(TYPE);
				setState(163);
				match(IDENT);
				setState(164);
				match(EQUALS);
				setState(165);
				adt_branch_list(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(NUMBER_TYPE);
				setState(167);
				match(IDENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				match(SYMBOL_TYPE);
				setState(169);
				match(IDENT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				match(TYPE);
				setState(171);
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
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(LBRACKET);
				setState(175);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(LBRACKET);
				setState(177);
				non_empty_attributes(0);
				setState(178);
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
			setState(183);
			qualified_name(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
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
					setState(185);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(186);
					match(PIPE);
					setState(187);
					qualified_name(0);
					}
					} 
				}
				setState(192);
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
			setState(194);
			adt_branch();
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
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
					setState(196);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(197);
					match(PIPE);
					setState(198);
					adt_branch();
					}
					} 
				}
				setState(203);
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
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(IDENT);
				setState(205);
				match(LBRACE);
				setState(206);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(IDENT);
				setState(208);
				match(LBRACE);
				setState(209);
				non_empty_attributes(0);
				setState(210);
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
			setState(214);
			match(DECL);
			setState(215);
			relation_names(0);
			setState(216);
			attributes_list();
			setState(217);
			relation_tags(0);
			setState(218);
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
			setState(221);
			match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
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
					setState(223);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(224);
					match(COMMA);
					setState(225);
					match(IDENT);
					}
					} 
				}
				setState(230);
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
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(LPAREN);
				setState(232);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(LPAREN);
				setState(234);
				non_empty_attributes(0);
				setState(235);
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
			setState(240);
			attribute();
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
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
					setState(242);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(243);
					match(COMMA);
					setState(244);
					attribute();
					}
					} 
				}
				setState(249);
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
			setState(250);
			match(IDENT);
			setState(251);
			match(COLON);
			setState(252);
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
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(279);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(255);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(256);
						match(OVERRIDABLE_QUALIFIER);
						}
						break;
					case 2:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(257);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(258);
						match(INLINE_QUALIFIER);
						}
						break;
					case 3:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(259);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(260);
						match(NO_INLINE_QUALIFIER);
						}
						break;
					case 4:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(261);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(262);
						match(MAGIC_QUALIFIER);
						}
						break;
					case 5:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(263);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(264);
						match(NO_MAGIC_QUALIFIER);
						}
						break;
					case 6:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(265);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(266);
						match(BRIE_QUALIFIER);
						}
						break;
					case 7:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(267);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(268);
						match(BTREE_QUALIFIER);
						}
						break;
					case 8:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(269);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(270);
						match(BTREE_DELETE_QUALIFIER);
						}
						break;
					case 9:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(271);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(272);
						match(EQREL_QUALIFIER);
						}
						break;
					case 10:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(273);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(274);
						match(OUTPUT_QUALIFIER);
						}
						break;
					case 11:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(275);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(276);
						match(INPUT_QUALIFIER);
						}
						break;
					case 12:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(277);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(278);
						match(PRINTSIZE_QUALIFIER);
						}
						break;
					}
					} 
				}
				setState(283);
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
			setState(285);
			match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
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
					setState(287);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(288);
					match(COMMA);
					setState(289);
					match(IDENT);
					}
					} 
				}
				setState(294);
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
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(IDENT);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(LPAREN);
				setState(297);
				non_empty_attribute_names(0);
				setState(298);
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
			setState(303);
			dependency();
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
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
					setState(305);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(306);
					match(COMMA);
					setState(307);
					dependency();
					}
					} 
				}
				setState(312);
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
			setState(316);
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
				setState(314);
				match(CHOICEDOMAIN);
				setState(315);
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
			setState(318);
			atom();
			setState(319);
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
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				rule_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				rule_def();
				setState(323);
				query_plan();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				atom();
				setState(326);
				match(LE);
				setState(327);
				atom();
				setState(328);
				match(IF);
				setState(329);
				body();
				setState(330);
				match(DOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				atom();
				setState(333);
				match(LE);
				setState(334);
				atom();
				setState(335);
				match(IF);
				setState(336);
				body();
				setState(337);
				match(DOT);
				setState(338);
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
			setState(342);
			head(0);
			setState(343);
			match(IF);
			setState(344);
			body();
			setState(345);
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
			setState(348);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(355);
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
					setState(350);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(351);
					match(COMMA);
					setState(352);
					atom();
					}
					} 
				}
				setState(357);
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
			setState(358);
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
			setState(361);
			conjunction(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
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
					setState(363);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(364);
					match(SEMICOLON);
					setState(365);
					conjunction(0);
					}
					} 
				}
				setState(370);
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
			setState(372);
			term();
			}
			_ctx.stop = _input.LT(-1);
			setState(379);
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
					setState(374);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(375);
					match(COMMA);
					setState(376);
					term();
					}
					} 
				}
				setState(381);
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
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				match(LPAREN);
				setState(385);
				disjunction(0);
				setState(386);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				match(EXCLAMATION);
				setState(389);
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
			setState(392);
			qualified_name(0);
			setState(393);
			match(LPAREN);
			setState(394);
			arg_list();
			setState(395);
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
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				arg(0);
				setState(398);
				match(LT);
				setState(399);
				arg(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				arg(0);
				setState(402);
				match(GT);
				setState(403);
				arg(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				arg(0);
				setState(406);
				match(LE);
				setState(407);
				arg(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				arg(0);
				setState(410);
				match(GE);
				setState(411);
				arg(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(413);
				arg(0);
				setState(414);
				match(EQUALS);
				setState(415);
				arg(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(417);
				arg(0);
				setState(418);
				match(NE);
				setState(419);
				arg(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(421);
				match(TMATCH);
				setState(422);
				match(LPAREN);
				setState(423);
				arg(0);
				setState(424);
				match(COMMA);
				setState(425);
				arg(0);
				setState(426);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(428);
				match(TCONTAINS);
				setState(429);
				match(LPAREN);
				setState(430);
				arg(0);
				setState(431);
				match(COMMA);
				setState(432);
				arg(0);
				setState(433);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(435);
				match(TRUELIT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(436);
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
			setState(441);
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
				setState(440);
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
			setState(444);
			arg(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(451);
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
					setState(446);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(447);
					match(COMMA);
					setState(448);
					arg(0);
					}
					} 
				}
				setState(453);
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
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(455);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(456);
				match(FLOAT);
				}
				break;
			case 3:
				{
				setState(457);
				match(UNSIGNED);
				}
				break;
			case 4:
				{
				setState(458);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(459);
				match(UNDERSCORE);
				}
				break;
			case 6:
				{
				setState(460);
				match(DOLLAR);
				}
				break;
			case 7:
				{
				setState(461);
				match(AUTOINC);
				setState(462);
				match(LPAREN);
				setState(463);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(464);
				match(IDENT);
				}
				break;
			case 9:
				{
				setState(465);
				match(NIL);
				}
				break;
			case 10:
				{
				setState(466);
				match(LBRACKET);
				setState(467);
				arg_list();
				setState(468);
				match(RBRACKET);
				}
				break;
			case 11:
				{
				setState(470);
				match(DOLLAR);
				setState(471);
				qualified_name(0);
				setState(472);
				match(LPAREN);
				setState(473);
				arg_list();
				setState(474);
				match(RPAREN);
				}
				break;
			case 12:
				{
				setState(476);
				match(LPAREN);
				setState(477);
				arg(0);
				setState(478);
				match(RPAREN);
				}
				break;
			case 13:
				{
				setState(480);
				match(AS);
				setState(481);
				match(LPAREN);
				setState(482);
				arg(0);
				setState(483);
				match(COMMA);
				setState(484);
				qualified_name(0);
				setState(485);
				match(RPAREN);
				}
				break;
			case 14:
				{
				setState(487);
				match(AT);
				setState(488);
				match(IDENT);
				setState(489);
				match(LPAREN);
				setState(490);
				arg_list();
				setState(491);
				match(RPAREN);
				}
				break;
			case 15:
				{
				setState(493);
				functor_built_in();
				setState(494);
				match(LPAREN);
				setState(495);
				arg_list();
				setState(496);
				match(RPAREN);
				}
				break;
			case 16:
				{
				setState(498);
				aggregate_func();
				setState(499);
				match(LPAREN);
				setState(500);
				arg(0);
				setState(501);
				match(COMMA);
				setState(502);
				non_empty_arg_list(0);
				setState(503);
				match(RPAREN);
				}
				break;
			case 17:
				{
				setState(505);
				match(MINUS);
				setState(506);
				arg(19);
				}
				break;
			case 18:
				{
				setState(507);
				match(BW_NOT);
				setState(508);
				arg(18);
				}
				break;
			case 19:
				{
				setState(509);
				match(L_NOT);
				setState(510);
				arg(17);
				}
				break;
			case 20:
				{
				setState(511);
				aggregate_func();
				setState(512);
				arg_list();
				setState(513);
				match(COLON);
				setState(514);
				aggregate_body();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(563);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(518);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(519);
						match(PLUS);
						setState(520);
						arg(17);
						}
						break;
					case 2:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(521);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(522);
						match(MINUS);
						setState(523);
						arg(16);
						}
						break;
					case 3:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(524);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(525);
						match(STAR);
						setState(526);
						arg(15);
						}
						break;
					case 4:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(527);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(528);
						match(SLASH);
						setState(529);
						arg(14);
						}
						break;
					case 5:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(530);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(531);
						match(PERCENT);
						setState(532);
						arg(13);
						}
						break;
					case 6:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(533);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(534);
						match(CARET);
						setState(535);
						arg(12);
						}
						break;
					case 7:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(536);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(537);
						match(L_AND);
						setState(538);
						arg(11);
						}
						break;
					case 8:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(539);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(540);
						match(L_OR);
						setState(541);
						arg(10);
						}
						break;
					case 9:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(542);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(543);
						match(L_XOR);
						setState(544);
						arg(9);
						}
						break;
					case 10:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(545);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(546);
						match(BW_AND);
						setState(547);
						arg(8);
						}
						break;
					case 11:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(548);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(549);
						match(BW_OR);
						setState(550);
						arg(7);
						}
						break;
					case 12:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(551);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(552);
						match(BW_XOR);
						setState(553);
						arg(6);
						}
						break;
					case 13:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(554);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(555);
						match(BW_SHIFT_L);
						setState(556);
						arg(5);
						}
						break;
					case 14:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(557);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(558);
						match(BW_SHIFT_R);
						setState(559);
						arg(4);
						}
						break;
					case 15:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(560);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(561);
						match(BW_SHIFT_R_UNSIGNED);
						setState(562);
						arg(3);
						}
						break;
					}
					} 
				}
				setState(567);
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
			setState(568);
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
			setState(570);
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
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				match(LBRACE);
				setState(573);
				body();
				setState(574);
				match(RBRACE);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
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
			setState(579);
			match(PLAN);
			setState(580);
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
			setState(583);
			match(NUMBER);
			setState(584);
			match(COLON);
			setState(585);
			plan_order();
			}
			_ctx.stop = _input.LT(-1);
			setState(594);
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
					setState(587);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(588);
					match(COMMA);
					setState(589);
					match(NUMBER);
					setState(590);
					match(COLON);
					setState(591);
					plan_order();
					}
					} 
				}
				setState(596);
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
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(LPAREN);
				setState(598);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				match(LPAREN);
				setState(600);
				non_empty_plan_order_list(0);
				setState(601);
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
			setState(606);
			match(NUMBER);
			}
			_ctx.stop = _input.LT(-1);
			setState(613);
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
					setState(608);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(609);
					match(COMMA);
					setState(610);
					match(NUMBER);
					}
					} 
				}
				setState(615);
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
			setState(616);
			component_head(0);
			setState(617);
			match(LBRACE);
			setState(618);
			component_body(0);
			setState(619);
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
			setState(622);
			match(COMPONENT);
			setState(623);
			component_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(631);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new Component_headContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_head);
						setState(625);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(626);
						match(COLON);
						setState(627);
						component_type();
						}
						break;
					case 2:
						{
						_localctx = new Component_headContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_head);
						setState(628);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(629);
						match(COMMA);
						setState(630);
						component_type();
						}
						break;
					}
					} 
				}
				setState(635);
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
			setState(636);
			match(IDENT);
			setState(637);
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
			setState(644);
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
				setState(640);
				match(LT);
				setState(641);
				component_param_list(0);
				setState(642);
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
			setState(647);
			match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(654);
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
					setState(649);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(650);
					match(COMMA);
					setState(651);
					match(IDENT);
					}
					} 
				}
				setState(656);
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
			setState(677);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(675);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(658);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(659);
						directive_head();
						}
						break;
					case 2:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(660);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(661);
						souffle_rule();
						}
						break;
					case 3:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(662);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(663);
						fact();
						}
						break;
					case 4:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(664);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(665);
						match(OVERRIDE);
						setState(666);
						match(IDENT);
						}
						break;
					case 5:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(667);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(668);
						component_init();
						}
						break;
					case 6:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(669);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(670);
						component_decl();
						}
						break;
					case 7:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(671);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(672);
						type_decl();
						}
						break;
					case 8:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(673);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(674);
						relation_decl();
						}
						break;
					}
					} 
				}
				setState(679);
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
			setState(680);
			match(INSTANTIATE);
			setState(681);
			match(IDENT);
			setState(682);
			match(EQUALS);
			setState(683);
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
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(685);
				match(FUNCTOR);
				setState(686);
				match(IDENT);
				setState(687);
				match(LPAREN);
				setState(688);
				functor_arg_type_list();
				setState(689);
				match(RPAREN);
				setState(690);
				match(COLON);
				setState(691);
				qualified_name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				match(FUNCTOR);
				setState(694);
				match(IDENT);
				setState(695);
				match(LPAREN);
				setState(696);
				functor_arg_type_list();
				setState(697);
				match(RPAREN);
				setState(698);
				match(COLON);
				setState(699);
				qualified_name(0);
				setState(700);
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
			setState(706);
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
				setState(705);
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
			setState(709);
			functor_attribute();
			}
			_ctx.stop = _input.LT(-1);
			setState(716);
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
					setState(711);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(712);
					match(COMMA);
					setState(713);
					functor_attribute();
					}
					} 
				}
				setState(718);
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
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				qualified_name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				match(IDENT);
				setState(721);
				match(COLON);
				setState(722);
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
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				match(PRAGMA);
				setState(726);
				match(STRING);
				setState(727);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				match(PRAGMA);
				setState(729);
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
			setState(732);
			directive_head_decl();
			setState(733);
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
			setState(735);
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
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				relation_directive_list(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				relation_directive_list(0);
				setState(739);
				match(LPAREN);
				setState(740);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(742);
				relation_directive_list(0);
				setState(743);
				match(LPAREN);
				setState(744);
				non_empty_key_value_pairs(0);
				setState(745);
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
			setState(750);
			qualified_name(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(757);
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
					setState(752);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(753);
					match(COMMA);
					setState(754);
					qualified_name(0);
					}
					} 
				}
				setState(759);
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
			setState(761);
			match(IDENT);
			setState(762);
			match(EQUALS);
			setState(763);
			kvp_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(772);
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
					setState(765);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(766);
					match(COMMA);
					setState(767);
					match(IDENT);
					setState(768);
					match(EQUALS);
					setState(769);
					kvp_value();
					}
					} 
				}
				setState(774);
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
			setState(775);
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
		"\u0004\u0001c\u030a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0087"+
		"\b\u0001\n\u0001\f\u0001\u008a\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0092\b\u0002\n\u0002"+
		"\f\u0002\u0095\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00ad\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00b5\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00bd\b\u0005"+
		"\n\u0005\f\u0005\u00c0\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c8\b\u0006\n\u0006\f\u0006"+
		"\u00cb\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d5\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00e3\b\t\n\t\f\t\u00e6\t\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ee\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00f6\b\u000b"+
		"\n\u000b\f\u000b\u00f9\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0118\b\r\n"+
		"\r\f\r\u011b\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0123\b\u000e\n\u000e\f\u000e\u0126\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u012d\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0135\b\u0010\n\u0010\f\u0010\u0138\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u013d\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0155\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0162\b\u0015\n"+
		"\u0015\f\u0015\u0165\t\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u016f"+
		"\b\u0017\n\u0017\f\u0017\u0172\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u017a\b\u0018\n\u0018"+
		"\f\u0018\u017d\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0187\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01b6\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01ba\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01c2\b\u001d\n\u001d"+
		"\f\u001d\u01c5\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0205\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0234\b\u001e\n\u001e"+
		"\f\u001e\u0237\t\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u0242\b!\u0001\"\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005"+
		"#\u0251\b#\n#\f#\u0254\t#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u025c\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u0264\b%\n"+
		"%\f%\u0267\t%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0278"+
		"\b\'\n\'\f\'\u027b\t\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u0285\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005"+
		"*\u028d\b*\n*\f*\u0290\t*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0005+\u02a4\b+\n+\f+\u02a7\t+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u02bf\b-\u0001"+
		".\u0001.\u0003.\u02c3\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0005"+
		"/\u02cb\b/\n/\f/\u02ce\t/\u00010\u00010\u00010\u00010\u00030\u02d4\b0"+
		"\u00011\u00011\u00011\u00011\u00011\u00031\u02db\b1\u00012\u00012\u0001"+
		"2\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00034\u02ec\b4\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00055\u02f4\b5\n5\f5\u02f7\t5\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00056\u0303\b6\n6\f6\u0306\t6\u00017\u0001"+
		"7\u00017\u0000\u0016\u0002\u0004\n\f\u0012\u0016\u001a\u001c *.0:<FJN"+
		"TV^jl8\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjln\u0000\u0004"+
		"\u0002\u0000\u001e\":=\u0003\u0000\u001d\u001d1267\u0001\u0000\u0004\u0007"+
		"\u0003\u000089[[^_\u0347\u0000p\u0001\u0000\u0000\u0000\u0002s\u0001\u0000"+
		"\u0000\u0000\u0004\u008b\u0001\u0000\u0000\u0000\u0006\u00ac\u0001\u0000"+
		"\u0000\u0000\b\u00b4\u0001\u0000\u0000\u0000\n\u00b6\u0001\u0000\u0000"+
		"\u0000\f\u00c1\u0001\u0000\u0000\u0000\u000e\u00d4\u0001\u0000\u0000\u0000"+
		"\u0010\u00d6\u0001\u0000\u0000\u0000\u0012\u00dc\u0001\u0000\u0000\u0000"+
		"\u0014\u00ed\u0001\u0000\u0000\u0000\u0016\u00ef\u0001\u0000\u0000\u0000"+
		"\u0018\u00fa\u0001\u0000\u0000\u0000\u001a\u00fe\u0001\u0000\u0000\u0000"+
		"\u001c\u011c\u0001\u0000\u0000\u0000\u001e\u012c\u0001\u0000\u0000\u0000"+
		" \u012e\u0001\u0000\u0000\u0000\"\u013c\u0001\u0000\u0000\u0000$\u013e"+
		"\u0001\u0000\u0000\u0000&\u0154\u0001\u0000\u0000\u0000(\u0156\u0001\u0000"+
		"\u0000\u0000*\u015b\u0001\u0000\u0000\u0000,\u0166\u0001\u0000\u0000\u0000"+
		".\u0168\u0001\u0000\u0000\u00000\u0173\u0001\u0000\u0000\u00002\u0186"+
		"\u0001\u0000\u0000\u00004\u0188\u0001\u0000\u0000\u00006\u01b5\u0001\u0000"+
		"\u0000\u00008\u01b9\u0001\u0000\u0000\u0000:\u01bb\u0001\u0000\u0000\u0000"+
		"<\u0204\u0001\u0000\u0000\u0000>\u0238\u0001\u0000\u0000\u0000@\u023a"+
		"\u0001\u0000\u0000\u0000B\u0241\u0001\u0000\u0000\u0000D\u0243\u0001\u0000"+
		"\u0000\u0000F\u0246\u0001\u0000\u0000\u0000H\u025b\u0001\u0000\u0000\u0000"+
		"J\u025d\u0001\u0000\u0000\u0000L\u0268\u0001\u0000\u0000\u0000N\u026d"+
		"\u0001\u0000\u0000\u0000P\u027c\u0001\u0000\u0000\u0000R\u0284\u0001\u0000"+
		"\u0000\u0000T\u0286\u0001\u0000\u0000\u0000V\u0291\u0001\u0000\u0000\u0000"+
		"X\u02a8\u0001\u0000\u0000\u0000Z\u02be\u0001\u0000\u0000\u0000\\\u02c2"+
		"\u0001\u0000\u0000\u0000^\u02c4\u0001\u0000\u0000\u0000`\u02d3\u0001\u0000"+
		"\u0000\u0000b\u02da\u0001\u0000\u0000\u0000d\u02dc\u0001\u0000\u0000\u0000"+
		"f\u02df\u0001\u0000\u0000\u0000h\u02eb\u0001\u0000\u0000\u0000j\u02ed"+
		"\u0001\u0000\u0000\u0000l\u02f8\u0001\u0000\u0000\u0000n\u0307\u0001\u0000"+
		"\u0000\u0000pq\u0003\u0002\u0001\u0000qr\u0005\u0000\u0000\u0001r\u0001"+
		"\u0001\u0000\u0000\u0000s\u0088\u0006\u0001\uffff\uffff\u0000tu\n\t\u0000"+
		"\u0000u\u0087\u0003d2\u0000vw\n\b\u0000\u0000w\u0087\u0003&\u0013\u0000"+
		"xy\n\u0007\u0000\u0000y\u0087\u0003$\u0012\u0000z{\n\u0006\u0000\u0000"+
		"{\u0087\u0003L&\u0000|}\n\u0005\u0000\u0000}\u0087\u0003X,\u0000~\u007f"+
		"\n\u0004\u0000\u0000\u007f\u0087\u0003b1\u0000\u0080\u0081\n\u0003\u0000"+
		"\u0000\u0081\u0087\u0003\u0006\u0003\u0000\u0082\u0083\n\u0002\u0000\u0000"+
		"\u0083\u0087\u0003Z-\u0000\u0084\u0085\n\u0001\u0000\u0000\u0085\u0087"+
		"\u0003\u0010\b\u0000\u0086t\u0001\u0000\u0000\u0000\u0086v\u0001\u0000"+
		"\u0000\u0000\u0086x\u0001\u0000\u0000\u0000\u0086z\u0001\u0000\u0000\u0000"+
		"\u0086|\u0001\u0000\u0000\u0000\u0086~\u0001\u0000\u0000\u0000\u0086\u0080"+
		"\u0001\u0000\u0000\u0000\u0086\u0082\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0003"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0006\u0002\uffff\uffff\u0000\u008c\u008d\u0005^\u0000\u0000\u008d\u0093"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\n\u0001\u0000\u0000\u008f\u0090\u0005"+
		"Z\u0000\u0000\u0090\u0092\u0005^\u0000\u0000\u0091\u008e\u0001\u0000\u0000"+
		"\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0005\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0097\u0005\b\u0000\u0000"+
		"\u0097\u0098\u0005^\u0000\u0000\u0098\u0099\u0005J\u0000\u0000\u0099\u00ad"+
		"\u0003\u0004\u0002\u0000\u009a\u009b\u0005\b\u0000\u0000\u009b\u009c\u0005"+
		"^\u0000\u0000\u009c\u009d\u0005N\u0000\u0000\u009d\u00ad\u0003\n\u0005"+
		"\u0000\u009e\u009f\u0005\b\u0000\u0000\u009f\u00a0\u0005^\u0000\u0000"+
		"\u00a0\u00a1\u0005N\u0000\u0000\u00a1\u00ad\u0003\b\u0004\u0000\u00a2"+
		"\u00a3\u0005\b\u0000\u0000\u00a3\u00a4\u0005^\u0000\u0000\u00a4\u00a5"+
		"\u0005N\u0000\u0000\u00a5\u00ad\u0003\f\u0006\u0000\u00a6\u00a7\u0005"+
		"\u000b\u0000\u0000\u00a7\u00ad\u0005^\u0000\u0000\u00a8\u00a9\u0005\f"+
		"\u0000\u0000\u00a9\u00ad\u0005^\u0000\u0000\u00aa\u00ab\u0005\b\u0000"+
		"\u0000\u00ab\u00ad\u0005^\u0000\u0000\u00ac\u0096\u0001\u0000\u0000\u0000"+
		"\u00ac\u009a\u0001\u0000\u0000\u0000\u00ac\u009e\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a2\u0001\u0000\u0000\u0000\u00ac\u00a6\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a8\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ad\u0007\u0001\u0000\u0000\u0000\u00ae\u00af\u0005@\u0000\u0000\u00af"+
		"\u00b5\u0005A\u0000\u0000\u00b0\u00b1\u0005@\u0000\u0000\u00b1\u00b2\u0003"+
		"\u0016\u000b\u0000\u00b2\u00b3\u0005A\u0000\u0000\u00b3\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b4\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b5\t\u0001\u0000\u0000\u0000\u00b6\u00b7\u0006\u0005\uffff"+
		"\uffff\u0000\u00b7\u00b8\u0003\u0004\u0002\u0000\u00b8\u00be\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\n\u0001\u0000\u0000\u00ba\u00bb\u0005?\u0000"+
		"\u0000\u00bb\u00bd\u0003\u0004\u0002\u0000\u00bc\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u000b\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0006\u0006\uffff"+
		"\uffff\u0000\u00c2\u00c3\u0003\u000e\u0007\u0000\u00c3\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\n\u0001\u0000\u0000\u00c5\u00c6\u0005?\u0000"+
		"\u0000\u00c6\u00c8\u0003\u000e\u0007\u0000\u00c7\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\r\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005^\u0000\u0000\u00cd"+
		"\u00ce\u0005U\u0000\u0000\u00ce\u00d5\u0005V\u0000\u0000\u00cf\u00d0\u0005"+
		"^\u0000\u0000\u00d0\u00d1\u0005U\u0000\u0000\u00d1\u00d2\u0003\u0016\u000b"+
		"\u0000\u00d2\u00d3\u0005V\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d4\u00cc\u0001\u0000\u0000\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d5\u000f\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0002\u0000\u0000"+
		"\u00d7\u00d8\u0003\u0012\t\u0000\u00d8\u00d9\u0003\u0014\n\u0000\u00d9"+
		"\u00da\u0003\u001a\r\u0000\u00da\u00db\u0003\"\u0011\u0000\u00db\u0011"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0006\t\uffff\uffff\u0000\u00dd\u00de"+
		"\u0005^\u0000\u0000\u00de\u00e4\u0001\u0000\u0000\u0000\u00df\u00e0\n"+
		"\u0001\u0000\u0000\u00e0\u00e1\u0005G\u0000\u0000\u00e1\u00e3\u0005^\u0000"+
		"\u0000\u00e2\u00df\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e5\u0013\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0005E\u0000\u0000\u00e8\u00ee\u0005F\u0000\u0000\u00e9"+
		"\u00ea\u0005E\u0000\u0000\u00ea\u00eb\u0003\u0016\u000b\u0000\u00eb\u00ec"+
		"\u0005F\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00e7\u0001"+
		"\u0000\u0000\u0000\u00ed\u00e9\u0001\u0000\u0000\u0000\u00ee\u0015\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0006\u000b\uffff\uffff\u0000\u00f0\u00f1"+
		"\u0003\u0018\f\u0000\u00f1\u00f7\u0001\u0000\u0000\u0000\u00f2\u00f3\n"+
		"\u0001\u0000\u0000\u00f3\u00f4\u0005G\u0000\u0000\u00f4\u00f6\u0003\u0018"+
		"\f\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u0017\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005^\u0000\u0000\u00fb\u00fc\u0005H\u0000\u0000\u00fc"+
		"\u00fd\u0003\u0004\u0002\u0000\u00fd\u0019\u0001\u0000\u0000\u0000\u00fe"+
		"\u0119\u0006\r\uffff\uffff\u0000\u00ff\u0100\n\f\u0000\u0000\u0100\u0118"+
		"\u0005\'\u0000\u0000\u0101\u0102\n\u000b\u0000\u0000\u0102\u0118\u0005"+
		"*\u0000\u0000\u0103\u0104\n\n\u0000\u0000\u0104\u0118\u0005+\u0000\u0000"+
		"\u0105\u0106\n\t\u0000\u0000\u0106\u0118\u0005,\u0000\u0000\u0107\u0108"+
		"\n\b\u0000\u0000\u0108\u0118\u0005-\u0000\u0000\u0109\u010a\n\u0007\u0000"+
		"\u0000\u010a\u0118\u0005.\u0000\u0000\u010b\u010c\n\u0006\u0000\u0000"+
		"\u010c\u0118\u00050\u0000\u0000\u010d\u010e\n\u0005\u0000\u0000\u010e"+
		"\u0118\u0005/\u0000\u0000\u010f\u0110\n\u0004\u0000\u0000\u0110\u0118"+
		"\u0005)\u0000\u0000\u0111\u0112\n\u0003\u0000\u0000\u0112\u0118\u0005"+
		"%\u0000\u0000\u0113\u0114\n\u0002\u0000\u0000\u0114\u0118\u0005&\u0000"+
		"\u0000\u0115\u0116\n\u0001\u0000\u0000\u0116\u0118\u0005(\u0000\u0000"+
		"\u0117\u00ff\u0001\u0000\u0000\u0000\u0117\u0101\u0001\u0000\u0000\u0000"+
		"\u0117\u0103\u0001\u0000\u0000\u0000\u0117\u0105\u0001\u0000\u0000\u0000"+
		"\u0117\u0107\u0001\u0000\u0000\u0000\u0117\u0109\u0001\u0000\u0000\u0000"+
		"\u0117\u010b\u0001\u0000\u0000\u0000\u0117\u010d\u0001\u0000\u0000\u0000"+
		"\u0117\u010f\u0001\u0000\u0000\u0000\u0117\u0111\u0001\u0000\u0000\u0000"+
		"\u0117\u0113\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000"+
		"\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u001b\u0001\u0000\u0000\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u011d\u0006\u000e\uffff\uffff"+
		"\u0000\u011d\u011e\u0005^\u0000\u0000\u011e\u0124\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\n\u0001\u0000\u0000\u0120\u0121\u0005G\u0000\u0000\u0121"+
		"\u0123\u0005^\u0000\u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0123\u0126"+
		"\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0001\u0000\u0000\u0000\u0125\u001d\u0001\u0000\u0000\u0000\u0126\u0124"+
		"\u0001\u0000\u0000\u0000\u0127\u012d\u0005^\u0000\u0000\u0128\u0129\u0005"+
		"E\u0000\u0000\u0129\u012a\u0003\u001c\u000e\u0000\u012a\u012b\u0005F\u0000"+
		"\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u0127\u0001\u0000\u0000"+
		"\u0000\u012c\u0128\u0001\u0000\u0000\u0000\u012d\u001f\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0006\u0010\uffff\uffff\u0000\u012f\u0130\u0003\u001e"+
		"\u000f\u0000\u0130\u0136\u0001\u0000\u0000\u0000\u0131\u0132\n\u0001\u0000"+
		"\u0000\u0132\u0133\u0005G\u0000\u0000\u0133\u0135\u0003\u001e\u000f\u0000"+
		"\u0134\u0131\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000"+
		"\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137!\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139"+
		"\u013d\u0001\u0000\u0000\u0000\u013a\u013b\u0005>\u0000\u0000\u013b\u013d"+
		"\u0003 \u0010\u0000\u013c\u0139\u0001\u0000\u0000\u0000\u013c\u013a\u0001"+
		"\u0000\u0000\u0000\u013d#\u0001\u0000\u0000\u0000\u013e\u013f\u00034\u001a"+
		"\u0000\u013f\u0140\u0005Z\u0000\u0000\u0140%\u0001\u0000\u0000\u0000\u0141"+
		"\u0155\u0003(\u0014\u0000\u0142\u0143\u0003(\u0014\u0000\u0143\u0144\u0003"+
		"D\"\u0000\u0144\u0155\u0001\u0000\u0000\u0000\u0145\u0146\u00034\u001a"+
		"\u0000\u0146\u0147\u0005K\u0000\u0000\u0147\u0148\u00034\u001a\u0000\u0148"+
		"\u0149\u0005Y\u0000\u0000\u0149\u014a\u0003,\u0016\u0000\u014a\u014b\u0005"+
		"Z\u0000\u0000\u014b\u0155\u0001\u0000\u0000\u0000\u014c\u014d\u00034\u001a"+
		"\u0000\u014d\u014e\u0005K\u0000\u0000\u014e\u014f\u00034\u001a\u0000\u014f"+
		"\u0150\u0005Y\u0000\u0000\u0150\u0151\u0003,\u0016\u0000\u0151\u0152\u0005"+
		"Z\u0000\u0000\u0152\u0153\u0003D\"\u0000\u0153\u0155\u0001\u0000\u0000"+
		"\u0000\u0154\u0141\u0001\u0000\u0000\u0000\u0154\u0142\u0001\u0000\u0000"+
		"\u0000\u0154\u0145\u0001\u0000\u0000\u0000\u0154\u014c\u0001\u0000\u0000"+
		"\u0000\u0155\'\u0001\u0000\u0000\u0000\u0156\u0157\u0003*\u0015\u0000"+
		"\u0157\u0158\u0005Y\u0000\u0000\u0158\u0159\u0003,\u0016\u0000\u0159\u015a"+
		"\u0005Z\u0000\u0000\u015a)\u0001\u0000\u0000\u0000\u015b\u015c\u0006\u0015"+
		"\uffff\uffff\u0000\u015c\u015d\u00034\u001a\u0000\u015d\u0163\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\n\u0001\u0000\u0000\u015f\u0160\u0005G\u0000"+
		"\u0000\u0160\u0162\u00034\u001a\u0000\u0161\u015e\u0001\u0000\u0000\u0000"+
		"\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0001\u0000\u0000\u0000\u0164+\u0001\u0000\u0000\u0000\u0165"+
		"\u0163\u0001\u0000\u0000\u0000\u0166\u0167\u0003.\u0017\u0000\u0167-\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0006\u0017\uffff\uffff\u0000\u0169\u016a"+
		"\u00030\u0018\u0000\u016a\u0170\u0001\u0000\u0000\u0000\u016b\u016c\n"+
		"\u0001\u0000\u0000\u016c\u016d\u0005I\u0000\u0000\u016d\u016f\u00030\u0018"+
		"\u0000\u016e\u016b\u0001\u0000\u0000\u0000\u016f\u0172\u0001\u0000\u0000"+
		"\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000"+
		"\u0000\u0171/\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0006\u0018\uffff\uffff\u0000\u0174\u0175\u00032\u0019\u0000"+
		"\u0175\u017b\u0001\u0000\u0000\u0000\u0176\u0177\n\u0001\u0000\u0000\u0177"+
		"\u0178\u0005G\u0000\u0000\u0178\u017a\u00032\u0019\u0000\u0179\u0176\u0001"+
		"\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c1\u0001\u0000"+
		"\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u0187\u00034\u001a"+
		"\u0000\u017f\u0187\u00036\u001b\u0000\u0180\u0181\u0005E\u0000\u0000\u0181"+
		"\u0182\u0003.\u0017\u0000\u0182\u0183\u0005F\u0000\u0000\u0183\u0187\u0001"+
		"\u0000\u0000\u0000\u0184\u0185\u0005O\u0000\u0000\u0185\u0187\u00032\u0019"+
		"\u0000\u0186\u017e\u0001\u0000\u0000\u0000\u0186\u017f\u0001\u0000\u0000"+
		"\u0000\u0186\u0180\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000"+
		"\u0000\u01873\u0001\u0000\u0000\u0000\u0188\u0189\u0003\u0004\u0002\u0000"+
		"\u0189\u018a\u0005E\u0000\u0000\u018a\u018b\u00038\u001c\u0000\u018b\u018c"+
		"\u0005F\u0000\u0000\u018c5\u0001\u0000\u0000\u0000\u018d\u018e\u0003<"+
		"\u001e\u0000\u018e\u018f\u0005W\u0000\u0000\u018f\u0190\u0003<\u001e\u0000"+
		"\u0190\u01b6\u0001\u0000\u0000\u0000\u0191\u0192\u0003<\u001e\u0000\u0192"+
		"\u0193\u0005X\u0000\u0000\u0193\u0194\u0003<\u001e\u0000\u0194\u01b6\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u0003<\u001e\u0000\u0196\u0197\u0005K\u0000"+
		"\u0000\u0197\u0198\u0003<\u001e\u0000\u0198\u01b6\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0003<\u001e\u0000\u019a\u019b\u0005L\u0000\u0000\u019b\u019c"+
		"\u0003<\u001e\u0000\u019c\u01b6\u0001\u0000\u0000\u0000\u019d\u019e\u0003"+
		"<\u001e\u0000\u019e\u019f\u0005N\u0000\u0000\u019f\u01a0\u0003<\u001e"+
		"\u0000\u01a0\u01b6\u0001\u0000\u0000\u0000\u01a1\u01a2\u0003<\u001e\u0000"+
		"\u01a2\u01a3\u0005M\u0000\u0000\u01a3\u01a4\u0003<\u001e\u0000\u01a4\u01b6"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005\u001c\u0000\u0000\u01a6\u01a7"+
		"\u0005E\u0000\u0000\u01a7\u01a8\u0003<\u001e\u0000\u01a8\u01a9\u0005G"+
		"\u0000\u0000\u01a9\u01aa\u0003<\u001e\u0000\u01aa\u01ab\u0005F\u0000\u0000"+
		"\u01ab\u01b6\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005$\u0000\u0000\u01ad"+
		"\u01ae\u0005E\u0000\u0000\u01ae\u01af\u0003<\u001e\u0000\u01af\u01b0\u0005"+
		"G\u0000\u0000\u01b0\u01b1\u0003<\u001e\u0000\u01b1\u01b2\u0005F\u0000"+
		"\u0000\u01b2\u01b6\u0001\u0000\u0000\u0000\u01b3\u01b6\u00058\u0000\u0000"+
		"\u01b4\u01b6\u00059\u0000\u0000\u01b5\u018d\u0001\u0000\u0000\u0000\u01b5"+
		"\u0191\u0001\u0000\u0000\u0000\u01b5\u0195\u0001\u0000\u0000\u0000\u01b5"+
		"\u0199\u0001\u0000\u0000\u0000\u01b5\u019d\u0001\u0000\u0000\u0000\u01b5"+
		"\u01a1\u0001\u0000\u0000\u0000\u01b5\u01a5\u0001\u0000\u0000\u0000\u01b5"+
		"\u01ac\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b67\u0001\u0000\u0000\u0000\u01b7\u01ba"+
		"\u0001\u0000\u0000\u0000\u01b8\u01ba\u0003:\u001d\u0000\u01b9\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01ba9\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0006\u001d\uffff\uffff\u0000\u01bc\u01bd\u0003"+
		"<\u001e\u0000\u01bd\u01c3\u0001\u0000\u0000\u0000\u01be\u01bf\n\u0001"+
		"\u0000\u0000\u01bf\u01c0\u0005G\u0000\u0000\u01c0\u01c2\u0003<\u001e\u0000"+
		"\u01c1\u01be\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c4;\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c7\u0006\u001e\uffff\uffff\u0000\u01c7\u0205\u0005_\u0000\u0000\u01c8"+
		"\u0205\u0005\\\u0000\u0000\u01c9\u0205\u0005]\u0000\u0000\u01ca\u0205"+
		"\u0005[\u0000\u0000\u01cb\u0205\u00055\u0000\u0000\u01cc\u0205\u0005B"+
		"\u0000\u0000\u01cd\u01ce\u0005\u0010\u0000\u0000\u01ce\u01cf\u0005E\u0000"+
		"\u0000\u01cf\u0205\u0005F\u0000\u0000\u01d0\u0205\u0005^\u0000\u0000\u01d1"+
		"\u0205\u00054\u0000\u0000\u01d2\u01d3\u0005@\u0000\u0000\u01d3\u01d4\u0003"+
		"8\u001c\u0000\u01d4\u01d5\u0005A\u0000\u0000\u01d5\u0205\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d7\u0005B\u0000\u0000\u01d7\u01d8\u0003\u0004\u0002\u0000"+
		"\u01d8\u01d9\u0005E\u0000\u0000\u01d9\u01da\u00038\u001c\u0000\u01da\u01db"+
		"\u0005F\u0000\u0000\u01db\u0205\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005"+
		"E\u0000\u0000\u01dd\u01de\u0003<\u001e\u0000\u01de\u01df\u0005F\u0000"+
		"\u0000\u01df\u0205\u0001\u0000\u0000\u0000\u01e0\u01e1\u00053\u0000\u0000"+
		"\u01e1\u01e2\u0005E\u0000\u0000\u01e2\u01e3\u0003<\u001e\u0000\u01e3\u01e4"+
		"\u0005G\u0000\u0000\u01e4\u01e5\u0003\u0004\u0002\u0000\u01e5\u01e6\u0005"+
		"F\u0000\u0000\u01e6\u0205\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005Q\u0000"+
		"\u0000\u01e8\u01e9\u0005^\u0000\u0000\u01e9\u01ea\u0005E\u0000\u0000\u01ea"+
		"\u01eb\u00038\u001c\u0000\u01eb\u01ec\u0005F\u0000\u0000\u01ec\u0205\u0001"+
		"\u0000\u0000\u0000\u01ed\u01ee\u0003>\u001f\u0000\u01ee\u01ef\u0005E\u0000"+
		"\u0000\u01ef\u01f0\u00038\u001c\u0000\u01f0\u01f1\u0005F\u0000\u0000\u01f1"+
		"\u0205\u0001\u0000\u0000\u0000\u01f2\u01f3\u0003@ \u0000\u01f3\u01f4\u0005"+
		"E\u0000\u0000\u01f4\u01f5\u0003<\u001e\u0000\u01f5\u01f6\u0005G\u0000"+
		"\u0000\u01f6\u01f7\u0003:\u001d\u0000\u01f7\u01f8\u0005F\u0000\u0000\u01f8"+
		"\u0205\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005D\u0000\u0000\u01fa\u0205"+
		"\u0003<\u001e\u0013\u01fb\u01fc\u0005\u0014\u0000\u0000\u01fc\u0205\u0003"+
		"<\u001e\u0012\u01fd\u01fe\u0005\u001b\u0000\u0000\u01fe\u0205\u0003<\u001e"+
		"\u0011\u01ff\u0200\u0003@ \u0000\u0200\u0201\u00038\u001c\u0000\u0201"+
		"\u0202\u0005H\u0000\u0000\u0202\u0203\u0003B!\u0000\u0203\u0205\u0001"+
		"\u0000\u0000\u0000\u0204\u01c6\u0001\u0000\u0000\u0000\u0204\u01c8\u0001"+
		"\u0000\u0000\u0000\u0204\u01c9\u0001\u0000\u0000\u0000\u0204\u01ca\u0001"+
		"\u0000\u0000\u0000\u0204\u01cb\u0001\u0000\u0000\u0000\u0204\u01cc\u0001"+
		"\u0000\u0000\u0000\u0204\u01cd\u0001\u0000\u0000\u0000\u0204\u01d0\u0001"+
		"\u0000\u0000\u0000\u0204\u01d1\u0001\u0000\u0000\u0000\u0204\u01d2\u0001"+
		"\u0000\u0000\u0000\u0204\u01d6\u0001\u0000\u0000\u0000\u0204\u01dc\u0001"+
		"\u0000\u0000\u0000\u0204\u01e0\u0001\u0000\u0000\u0000\u0204\u01e7\u0001"+
		"\u0000\u0000\u0000\u0204\u01ed\u0001\u0000\u0000\u0000\u0204\u01f2\u0001"+
		"\u0000\u0000\u0000\u0204\u01f9\u0001\u0000\u0000\u0000\u0204\u01fb\u0001"+
		"\u0000\u0000\u0000\u0204\u01fd\u0001\u0000\u0000\u0000\u0204\u01ff\u0001"+
		"\u0000\u0000\u0000\u0205\u0235\u0001\u0000\u0000\u0000\u0206\u0207\n\u0010"+
		"\u0000\u0000\u0207\u0208\u0005C\u0000\u0000\u0208\u0234\u0003<\u001e\u0011"+
		"\u0209\u020a\n\u000f\u0000\u0000\u020a\u020b\u0005D\u0000\u0000\u020b"+
		"\u0234\u0003<\u001e\u0010\u020c\u020d\n\u000e\u0000\u0000\u020d\u020e"+
		"\u0005P\u0000\u0000\u020e\u0234\u0003<\u001e\u000f\u020f\u0210\n\r\u0000"+
		"\u0000\u0210\u0211\u0005R\u0000\u0000\u0211\u0234\u0003<\u001e\u000e\u0212"+
		"\u0213\n\f\u0000\u0000\u0213\u0214\u0005T\u0000\u0000\u0214\u0234\u0003"+
		"<\u001e\r\u0215\u0216\n\u000b\u0000\u0000\u0216\u0217\u0005S\u0000\u0000"+
		"\u0217\u0234\u0003<\u001e\f\u0218\u0219\n\n\u0000\u0000\u0219\u021a\u0005"+
		"\u0018\u0000\u0000\u021a\u0234\u0003<\u001e\u000b\u021b\u021c\n\t\u0000"+
		"\u0000\u021c\u021d\u0005\u0019\u0000\u0000\u021d\u0234\u0003<\u001e\n"+
		"\u021e\u021f\n\b\u0000\u0000\u021f\u0220\u0005\u001a\u0000\u0000\u0220"+
		"\u0234\u0003<\u001e\t\u0221\u0222\n\u0007\u0000\u0000\u0222\u0223\u0005"+
		"\u0011\u0000\u0000\u0223\u0234\u0003<\u001e\b\u0224\u0225\n\u0006\u0000"+
		"\u0000\u0225\u0226\u0005\u0012\u0000\u0000\u0226\u0234\u0003<\u001e\u0007"+
		"\u0227\u0228\n\u0005\u0000\u0000\u0228\u0229\u0005\u0013\u0000\u0000\u0229"+
		"\u0234\u0003<\u001e\u0006\u022a\u022b\n\u0004\u0000\u0000\u022b\u022c"+
		"\u0005\u0015\u0000\u0000\u022c\u0234\u0003<\u001e\u0005\u022d\u022e\n"+
		"\u0003\u0000\u0000\u022e\u022f\u0005\u0016\u0000\u0000\u022f\u0234\u0003"+
		"<\u001e\u0004\u0230\u0231\n\u0002\u0000\u0000\u0231\u0232\u0005\u0017"+
		"\u0000\u0000\u0232\u0234\u0003<\u001e\u0003\u0233\u0206\u0001\u0000\u0000"+
		"\u0000\u0233\u0209\u0001\u0000\u0000\u0000\u0233\u020c\u0001\u0000\u0000"+
		"\u0000\u0233\u020f\u0001\u0000\u0000\u0000\u0233\u0212\u0001\u0000\u0000"+
		"\u0000\u0233\u0215\u0001\u0000\u0000\u0000\u0233\u0218\u0001\u0000\u0000"+
		"\u0000\u0233\u021b\u0001\u0000\u0000\u0000\u0233\u021e\u0001\u0000\u0000"+
		"\u0000\u0233\u0221\u0001\u0000\u0000\u0000\u0233\u0224\u0001\u0000\u0000"+
		"\u0000\u0233\u0227\u0001\u0000\u0000\u0000\u0233\u022a\u0001\u0000\u0000"+
		"\u0000\u0233\u022d\u0001\u0000\u0000\u0000\u0233\u0230\u0001\u0000\u0000"+
		"\u0000\u0234\u0237\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236=\u0001\u0000\u0000\u0000"+
		"\u0237\u0235\u0001\u0000\u0000\u0000\u0238\u0239\u0007\u0000\u0000\u0000"+
		"\u0239?\u0001\u0000\u0000\u0000\u023a\u023b\u0007\u0001\u0000\u0000\u023b"+
		"A\u0001\u0000\u0000\u0000\u023c\u023d\u0005U\u0000\u0000\u023d\u023e\u0003"+
		",\u0016\u0000\u023e\u023f\u0005V\u0000\u0000\u023f\u0242\u0001\u0000\u0000"+
		"\u0000\u0240\u0242\u00034\u001a\u0000\u0241\u023c\u0001\u0000\u0000\u0000"+
		"\u0241\u0240\u0001\u0000\u0000\u0000\u0242C\u0001\u0000\u0000\u0000\u0243"+
		"\u0244\u0005\u000f\u0000\u0000\u0244\u0245\u0003F#\u0000\u0245E\u0001"+
		"\u0000\u0000\u0000\u0246\u0247\u0006#\uffff\uffff\u0000\u0247\u0248\u0005"+
		"[\u0000\u0000\u0248\u0249\u0005H\u0000\u0000\u0249\u024a\u0003H$\u0000"+
		"\u024a\u0252\u0001\u0000\u0000\u0000\u024b\u024c\n\u0001\u0000\u0000\u024c"+
		"\u024d\u0005G\u0000\u0000\u024d\u024e\u0005[\u0000\u0000\u024e\u024f\u0005"+
		"H\u0000\u0000\u024f\u0251\u0003H$\u0000\u0250\u024b\u0001\u0000\u0000"+
		"\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252\u0250\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253G\u0001\u0000\u0000\u0000"+
		"\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u0256\u0005E\u0000\u0000\u0256"+
		"\u025c\u0005F\u0000\u0000\u0257\u0258\u0005E\u0000\u0000\u0258\u0259\u0003"+
		"J%\u0000\u0259\u025a\u0005F\u0000\u0000\u025a\u025c\u0001\u0000\u0000"+
		"\u0000\u025b\u0255\u0001\u0000\u0000\u0000\u025b\u0257\u0001\u0000\u0000"+
		"\u0000\u025cI\u0001\u0000\u0000\u0000\u025d\u025e\u0006%\uffff\uffff\u0000"+
		"\u025e\u025f\u0005[\u0000\u0000\u025f\u0265\u0001\u0000\u0000\u0000\u0260"+
		"\u0261\n\u0001\u0000\u0000\u0261\u0262\u0005G\u0000\u0000\u0262\u0264"+
		"\u0005[\u0000\u0000\u0263\u0260\u0001\u0000\u0000\u0000\u0264\u0267\u0001"+
		"\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0265\u0266\u0001"+
		"\u0000\u0000\u0000\u0266K\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000"+
		"\u0000\u0000\u0268\u0269\u0003N\'\u0000\u0269\u026a\u0005U\u0000\u0000"+
		"\u026a\u026b\u0003V+\u0000\u026b\u026c\u0005V\u0000\u0000\u026cM\u0001"+
		"\u0000\u0000\u0000\u026d\u026e\u0006\'\uffff\uffff\u0000\u026e\u026f\u0005"+
		"\t\u0000\u0000\u026f\u0270\u0003P(\u0000\u0270\u0279\u0001\u0000\u0000"+
		"\u0000\u0271\u0272\n\u0002\u0000\u0000\u0272\u0273\u0005H\u0000\u0000"+
		"\u0273\u0278\u0003P(\u0000\u0274\u0275\n\u0001\u0000\u0000\u0275\u0276"+
		"\u0005G\u0000\u0000\u0276\u0278\u0003P(\u0000\u0277\u0271\u0001\u0000"+
		"\u0000\u0000\u0277\u0274\u0001\u0000\u0000\u0000\u0278\u027b\u0001\u0000"+
		"\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000"+
		"\u0000\u0000\u027aO\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000"+
		"\u0000\u027c\u027d\u0005^\u0000\u0000\u027d\u027e\u0003R)\u0000\u027e"+
		"Q\u0001\u0000\u0000\u0000\u027f\u0285\u0001\u0000\u0000\u0000\u0280\u0281"+
		"\u0005W\u0000\u0000\u0281\u0282\u0003T*\u0000\u0282\u0283\u0005X\u0000"+
		"\u0000\u0283\u0285\u0001\u0000\u0000\u0000\u0284\u027f\u0001\u0000\u0000"+
		"\u0000\u0284\u0280\u0001\u0000\u0000\u0000\u0285S\u0001\u0000\u0000\u0000"+
		"\u0286\u0287\u0006*\uffff\uffff\u0000\u0287\u0288\u0005^\u0000\u0000\u0288"+
		"\u028e\u0001\u0000\u0000\u0000\u0289\u028a\n\u0001\u0000\u0000\u028a\u028b"+
		"\u0005G\u0000\u0000\u028b\u028d\u0005^\u0000\u0000\u028c\u0289\u0001\u0000"+
		"\u0000\u0000\u028d\u0290\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000"+
		"\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028fU\u0001\u0000\u0000"+
		"\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0291\u02a5\u0006+\uffff\uffff"+
		"\u0000\u0292\u0293\n\b\u0000\u0000\u0293\u02a4\u0003d2\u0000\u0294\u0295"+
		"\n\u0007\u0000\u0000\u0295\u02a4\u0003&\u0013\u0000\u0296\u0297\n\u0006"+
		"\u0000\u0000\u0297\u02a4\u0003$\u0012\u0000\u0298\u0299\n\u0005\u0000"+
		"\u0000\u0299\u029a\u0005\r\u0000\u0000\u029a\u02a4\u0005^\u0000\u0000"+
		"\u029b\u029c\n\u0004\u0000\u0000\u029c\u02a4\u0003X,\u0000\u029d\u029e"+
		"\n\u0003\u0000\u0000\u029e\u02a4\u0003L&\u0000\u029f\u02a0\n\u0002\u0000"+
		"\u0000\u02a0\u02a4\u0003\u0006\u0003\u0000\u02a1\u02a2\n\u0001\u0000\u0000"+
		"\u02a2\u02a4\u0003\u0010\b\u0000\u02a3\u0292\u0001\u0000\u0000\u0000\u02a3"+
		"\u0294\u0001\u0000\u0000\u0000\u02a3\u0296\u0001\u0000\u0000\u0000\u02a3"+
		"\u0298\u0001\u0000\u0000\u0000\u02a3\u029b\u0001\u0000\u0000\u0000\u02a3"+
		"\u029d\u0001\u0000\u0000\u0000\u02a3\u029f\u0001\u0000\u0000\u0000\u02a3"+
		"\u02a1\u0001\u0000\u0000\u0000\u02a4\u02a7\u0001\u0000\u0000\u0000\u02a5"+
		"\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6"+
		"W\u0001\u0000\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a8\u02a9"+
		"\u0005\n\u0000\u0000\u02a9\u02aa\u0005^\u0000\u0000\u02aa\u02ab\u0005"+
		"N\u0000\u0000\u02ab\u02ac\u0003P(\u0000\u02acY\u0001\u0000\u0000\u0000"+
		"\u02ad\u02ae\u0005\u0003\u0000\u0000\u02ae\u02af\u0005^\u0000\u0000\u02af"+
		"\u02b0\u0005E\u0000\u0000\u02b0\u02b1\u0003\\.\u0000\u02b1\u02b2\u0005"+
		"F\u0000\u0000\u02b2\u02b3\u0005H\u0000\u0000\u02b3\u02b4\u0003\u0004\u0002"+
		"\u0000\u02b4\u02bf\u0001\u0000\u0000\u0000\u02b5\u02b6\u0005\u0003\u0000"+
		"\u0000\u02b6\u02b7\u0005^\u0000\u0000\u02b7\u02b8\u0005E\u0000\u0000\u02b8"+
		"\u02b9\u0003\\.\u0000\u02b9\u02ba\u0005F\u0000\u0000\u02ba\u02bb\u0005"+
		"H\u0000\u0000\u02bb\u02bc\u0003\u0004\u0002\u0000\u02bc\u02bd\u0005#\u0000"+
		"\u0000\u02bd\u02bf\u0001\u0000\u0000\u0000\u02be\u02ad\u0001\u0000\u0000"+
		"\u0000\u02be\u02b5\u0001\u0000\u0000\u0000\u02bf[\u0001\u0000\u0000\u0000"+
		"\u02c0\u02c3\u0001\u0000\u0000\u0000\u02c1\u02c3\u0003^/\u0000\u02c2\u02c0"+
		"\u0001\u0000\u0000\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c3]\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c5\u0006/\uffff\uffff\u0000\u02c5\u02c6\u0003"+
		"`0\u0000\u02c6\u02cc\u0001\u0000\u0000\u0000\u02c7\u02c8\n\u0001\u0000"+
		"\u0000\u02c8\u02c9\u0005G\u0000\u0000\u02c9\u02cb\u0003`0\u0000\u02ca"+
		"\u02c7\u0001\u0000\u0000\u0000\u02cb\u02ce\u0001\u0000\u0000\u0000\u02cc"+
		"\u02ca\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd"+
		"_\u0001\u0000\u0000\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02cf\u02d4"+
		"\u0003\u0004\u0002\u0000\u02d0\u02d1\u0005^\u0000\u0000\u02d1\u02d2\u0005"+
		"H\u0000\u0000\u02d2\u02d4\u0003\u0004\u0002\u0000\u02d3\u02cf\u0001\u0000"+
		"\u0000\u0000\u02d3\u02d0\u0001\u0000\u0000\u0000\u02d4a\u0001\u0000\u0000"+
		"\u0000\u02d5\u02d6\u0005\u000e\u0000\u0000\u02d6\u02d7\u0005_\u0000\u0000"+
		"\u02d7\u02db\u0005_\u0000\u0000\u02d8\u02d9\u0005\u000e\u0000\u0000\u02d9"+
		"\u02db\u0005_\u0000\u0000\u02da\u02d5\u0001\u0000\u0000\u0000\u02da\u02d8"+
		"\u0001\u0000\u0000\u0000\u02dbc\u0001\u0000\u0000\u0000\u02dc\u02dd\u0003"+
		"f3\u0000\u02dd\u02de\u0003h4\u0000\u02dee\u0001\u0000\u0000\u0000\u02df"+
		"\u02e0\u0007\u0002\u0000\u0000\u02e0g\u0001\u0000\u0000\u0000\u02e1\u02ec"+
		"\u0003j5\u0000\u02e2\u02e3\u0003j5\u0000\u02e3\u02e4\u0005E\u0000\u0000"+
		"\u02e4\u02e5\u0005F\u0000\u0000\u02e5\u02ec\u0001\u0000\u0000\u0000\u02e6"+
		"\u02e7\u0003j5\u0000\u02e7\u02e8\u0005E\u0000\u0000\u02e8\u02e9\u0003"+
		"l6\u0000\u02e9\u02ea\u0005F\u0000\u0000\u02ea\u02ec\u0001\u0000\u0000"+
		"\u0000\u02eb\u02e1\u0001\u0000\u0000\u0000\u02eb\u02e2\u0001\u0000\u0000"+
		"\u0000\u02eb\u02e6\u0001\u0000\u0000\u0000\u02eci\u0001\u0000\u0000\u0000"+
		"\u02ed\u02ee\u00065\uffff\uffff\u0000\u02ee\u02ef\u0003\u0004\u0002\u0000"+
		"\u02ef\u02f5\u0001\u0000\u0000\u0000\u02f0\u02f1\n\u0001\u0000\u0000\u02f1"+
		"\u02f2\u0005G\u0000\u0000\u02f2\u02f4\u0003\u0004\u0002\u0000\u02f3\u02f0"+
		"\u0001\u0000\u0000\u0000\u02f4\u02f7\u0001\u0000\u0000\u0000\u02f5\u02f3"+
		"\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6k\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f8\u02f9\u0006"+
		"6\uffff\uffff\u0000\u02f9\u02fa\u0005^\u0000\u0000\u02fa\u02fb\u0005N"+
		"\u0000\u0000\u02fb\u02fc\u0003n7\u0000\u02fc\u0304\u0001\u0000\u0000\u0000"+
		"\u02fd\u02fe\n\u0001\u0000\u0000\u02fe\u02ff\u0005G\u0000\u0000\u02ff"+
		"\u0300\u0005^\u0000\u0000\u0300\u0301\u0005N\u0000\u0000\u0301\u0303\u0003"+
		"n7\u0000\u0302\u02fd\u0001\u0000\u0000\u0000\u0303\u0306\u0001\u0000\u0000"+
		"\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000"+
		"\u0000\u0305m\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000"+
		"\u0307\u0308\u0007\u0003\u0000\u0000\u0308o\u0001\u0000\u0000\u0000.\u0086"+
		"\u0088\u0093\u00ac\u00b4\u00be\u00c9\u00d4\u00e4\u00ed\u00f7\u0117\u0119"+
		"\u0124\u012c\u0136\u013c\u0154\u0163\u0170\u017b\u0186\u01b5\u01b9\u01c3"+
		"\u0204\u0233\u0235\u0241\u0252\u025b\u0265\u0277\u0279\u0284\u028e\u02a3"+
		"\u02a5\u02be\u02c2\u02cc\u02d3\u02da\u02eb\u02f5\u0304";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}