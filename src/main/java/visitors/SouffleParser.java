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
		RULE_preprocessor_macro = 0, RULE_macro_args = 1, RULE_program = 2, RULE_unit = 3, 
		RULE_qualified_name = 4, RULE_type_decl = 5, RULE_record_type_list = 6, 
		RULE_union_type_list = 7, RULE_adt_branch_list = 8, RULE_adt_branch = 9, 
		RULE_relation_decl = 10, RULE_relation_names = 11, RULE_attributes_list = 12, 
		RULE_non_empty_attributes = 13, RULE_attribute = 14, RULE_relation_tags = 15, 
		RULE_non_empty_attribute_names = 16, RULE_dependency = 17, RULE_dependency_list_aux = 18, 
		RULE_dependency_list = 19, RULE_fact = 20, RULE_souffle_rule = 21, RULE_rule_def = 22, 
		RULE_head = 23, RULE_body = 24, RULE_disjunction = 25, RULE_conjunction = 26, 
		RULE_term = 27, RULE_atom = 28, RULE_constraint = 29, RULE_arg_list = 30, 
		RULE_non_empty_arg_list = 31, RULE_arg = 32, RULE_functor_built_in = 33, 
		RULE_aggregate_func = 34, RULE_aggregate_body = 35, RULE_query_plan = 36, 
		RULE_query_plan_list = 37, RULE_plan_order = 38, RULE_non_empty_plan_order_list = 39, 
		RULE_component_decl = 40, RULE_component_head = 41, RULE_component_type = 42, 
		RULE_component_type_params = 43, RULE_component_param_list = 44, RULE_component_body = 45, 
		RULE_component_init = 46, RULE_functor_decl = 47, RULE_functor_arg_type_list = 48, 
		RULE_non_empty_functor_arg_type_list = 49, RULE_functor_attribute = 50, 
		RULE_pragma = 51, RULE_directive_head = 52, RULE_directive_head_decl = 53, 
		RULE_directive_list = 54, RULE_relation_directive_list = 55, RULE_non_empty_key_value_pairs = 56, 
		RULE_kvp_value = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"preprocessor_macro", "macro_args", "program", "unit", "qualified_name", 
			"type_decl", "record_type_list", "union_type_list", "adt_branch_list", 
			"adt_branch", "relation_decl", "relation_names", "attributes_list", "non_empty_attributes", 
			"attribute", "relation_tags", "non_empty_attribute_names", "dependency", 
			"dependency_list_aux", "dependency_list", "fact", "souffle_rule", "rule_def", 
			"head", "body", "disjunction", "conjunction", "term", "atom", "constraint", 
			"arg_list", "non_empty_arg_list", "arg", "functor_built_in", "aggregate_func", 
			"aggregate_body", "query_plan", "query_plan_list", "plan_order", "non_empty_plan_order_list", 
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
			int _alt;
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(PREPROCESSOR_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(PREPROCESSOR_ID);
				setState(118);
				match(LPAREN);
				setState(119);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(PREPROCESSOR_ID);
				setState(121);
				match(LPAREN);
				setState(123); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(122);
						matchWildcard();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(125); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(127);
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
		public TerminalNode IDENT() { return getToken(SouffleParser.IDENT, 0); }
		public Macro_argsContext macro_args() {
			return getRuleContext(Macro_argsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SouffleParser.COMMA, 0); }
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
		return macro_args(0);
	}

	private Macro_argsContext macro_args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Macro_argsContext _localctx = new Macro_argsContext(_ctx, _parentState);
		Macro_argsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_macro_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(131);
			match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Macro_argsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_macro_args);
					setState(133);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(134);
					match(COMMA);
					setState(135);
					match(IDENT);
					}
					} 
				}
				setState(140);
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
		enterRule(_localctx, 4, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			unit(0);
			setState(142);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_unit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(163);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(145);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(146);
						directive_head();
						}
						break;
					case 2:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(147);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(148);
						souffle_rule();
						}
						break;
					case 3:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(149);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(150);
						fact();
						}
						break;
					case 4:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(151);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(152);
						component_decl();
						}
						break;
					case 5:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(153);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(154);
						component_init();
						}
						break;
					case 6:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(155);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(156);
						pragma();
						}
						break;
					case 7:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(157);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(158);
						type_decl();
						}
						break;
					case 8:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(159);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(160);
						functor_decl();
						}
						break;
					case 9:
						{
						_localctx = new UnitContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_unit);
						setState(161);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(162);
						relation_decl();
						}
						break;
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_qualified_name, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(169);
				match(IDENT);
				}
				break;
			case PREPROCESSOR_ID:
				{
				setState(170);
				preprocessor_macro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Qualified_nameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_qualified_name);
					setState(173);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(174);
					match(DOT);
					setState(175);
					match(IDENT);
					}
					} 
				}
				setState(180);
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
		enterRule(_localctx, 10, RULE_type_decl);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(TYPE);
				setState(182);
				match(IDENT);
				setState(183);
				match(SUBTYPE);
				setState(184);
				qualified_name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(TYPE);
				setState(186);
				match(IDENT);
				setState(187);
				match(EQUALS);
				setState(188);
				union_type_list(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(TYPE);
				setState(190);
				match(IDENT);
				setState(191);
				match(EQUALS);
				setState(192);
				record_type_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(TYPE);
				setState(194);
				match(IDENT);
				setState(195);
				match(EQUALS);
				setState(196);
				adt_branch_list(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				match(NUMBER_TYPE);
				setState(198);
				match(IDENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				match(SYMBOL_TYPE);
				setState(200);
				match(IDENT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(201);
				match(TYPE);
				setState(202);
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
		enterRule(_localctx, 12, RULE_record_type_list);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(LBRACKET);
				setState(206);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(LBRACKET);
				setState(208);
				non_empty_attributes(0);
				setState(209);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_union_type_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(214);
			qualified_name(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Union_type_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_union_type_list);
					setState(216);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(217);
					match(PIPE);
					setState(218);
					qualified_name(0);
					}
					} 
				}
				setState(223);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_adt_branch_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(225);
			adt_branch();
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Adt_branch_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_adt_branch_list);
					setState(227);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(228);
					match(PIPE);
					setState(229);
					adt_branch();
					}
					} 
				}
				setState(234);
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
		enterRule(_localctx, 18, RULE_adt_branch);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(IDENT);
				setState(236);
				match(LBRACE);
				setState(237);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(IDENT);
				setState(239);
				match(LBRACE);
				setState(240);
				non_empty_attributes(0);
				setState(241);
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
		enterRule(_localctx, 20, RULE_relation_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(DECL);
			setState(246);
			relation_names(0);
			setState(247);
			attributes_list();
			setState(248);
			relation_tags(0);
			setState(249);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_relation_names, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(252);
			match(IDENT);
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Relation_namesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relation_names);
					setState(254);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(255);
					match(COMMA);
					setState(256);
					match(IDENT);
					}
					} 
				}
				setState(261);
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
		enterRule(_localctx, 24, RULE_attributes_list);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(LPAREN);
				setState(263);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(LPAREN);
				setState(265);
				non_empty_attributes(0);
				setState(266);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_non_empty_attributes, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(271);
			attribute();
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_attributesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_attributes);
					setState(273);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(274);
					match(COMMA);
					setState(275);
					attribute();
					}
					} 
				}
				setState(280);
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
		enterRule(_localctx, 28, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(IDENT);
			setState(282);
			match(COLON);
			setState(283);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_relation_tags, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(286);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(287);
						match(OVERRIDABLE_QUALIFIER);
						}
						break;
					case 2:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(288);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(289);
						match(INLINE_QUALIFIER);
						}
						break;
					case 3:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(290);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(291);
						match(NO_INLINE_QUALIFIER);
						}
						break;
					case 4:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(292);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(293);
						match(MAGIC_QUALIFIER);
						}
						break;
					case 5:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(294);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(295);
						match(NO_MAGIC_QUALIFIER);
						}
						break;
					case 6:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(296);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(297);
						match(BRIE_QUALIFIER);
						}
						break;
					case 7:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(298);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(299);
						match(BTREE_QUALIFIER);
						}
						break;
					case 8:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(300);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(301);
						match(BTREE_DELETE_QUALIFIER);
						}
						break;
					case 9:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(302);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(303);
						match(EQREL_QUALIFIER);
						}
						break;
					case 10:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(304);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(305);
						match(OUTPUT_QUALIFIER);
						}
						break;
					case 11:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(306);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(307);
						match(INPUT_QUALIFIER);
						}
						break;
					case 12:
						{
						_localctx = new Relation_tagsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relation_tags);
						setState(308);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(309);
						match(PRINTSIZE_QUALIFIER);
						}
						break;
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_non_empty_attribute_names, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(316);
				match(IDENT);
				}
				break;
			case PREPROCESSOR_ID:
				{
				setState(317);
				preprocessor_macro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_attribute_namesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_attribute_names);
					setState(320);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(321);
					match(COMMA);
					setState(322);
					match(IDENT);
					}
					} 
				}
				setState(327);
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
		enterRule(_localctx, 34, RULE_dependency);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(IDENT);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(LPAREN);
				setState(330);
				non_empty_attribute_names(0);
				setState(331);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_dependency_list_aux, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(336);
			dependency();
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dependency_list_auxContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dependency_list_aux);
					setState(338);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(339);
					match(COMMA);
					setState(340);
					dependency();
					}
					} 
				}
				setState(345);
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
		enterRule(_localctx, 38, RULE_dependency_list);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(CHOICEDOMAIN);
				setState(348);
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
		enterRule(_localctx, 40, RULE_fact);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				atom();
				setState(352);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
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
		enterRule(_localctx, 42, RULE_souffle_rule);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				rule_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				rule_def();
				setState(359);
				query_plan();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				atom();
				setState(362);
				match(LE);
				setState(363);
				atom();
				setState(364);
				match(IF);
				setState(365);
				body();
				setState(366);
				match(DOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				atom();
				setState(369);
				match(LE);
				setState(370);
				atom();
				setState(371);
				match(IF);
				setState(372);
				body();
				setState(373);
				match(DOT);
				setState(374);
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
		enterRule(_localctx, 44, RULE_rule_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			head(0);
			setState(379);
			match(IF);
			setState(380);
			body();
			setState(381);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_head, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(384);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new HeadContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_head);
					setState(386);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(387);
					match(COMMA);
					setState(388);
					atom();
					}
					} 
				}
				setState(393);
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
		enterRule(_localctx, 48, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_disjunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(397);
			conjunction(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(404);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DisjunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_disjunction);
					setState(399);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(400);
					match(SEMICOLON);
					setState(401);
					conjunction(0);
					}
					} 
				}
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_conjunction, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(408);
			term();
			}
			_ctx.stop = _input.LT(-1);
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConjunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conjunction);
					setState(410);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(411);
					match(COMMA);
					setState(412);
					term();
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 54, RULE_term);
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				match(LPAREN);
				setState(421);
				disjunction(0);
				setState(422);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				match(EXCLAMATION);
				setState(425);
				term();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(426);
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
		enterRule(_localctx, 56, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			qualified_name(0);
			setState(430);
			match(LPAREN);
			setState(431);
			arg_list();
			setState(432);
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
		enterRule(_localctx, 58, RULE_constraint);
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				arg(0);
				setState(435);
				match(LT);
				setState(436);
				arg(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				arg(0);
				setState(439);
				match(GT);
				setState(440);
				arg(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				arg(0);
				setState(443);
				match(LE);
				setState(444);
				arg(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				arg(0);
				setState(447);
				match(GE);
				setState(448);
				arg(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(450);
				arg(0);
				setState(451);
				match(EQUALS);
				setState(452);
				arg(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(454);
				arg(0);
				setState(455);
				match(NE);
				setState(456);
				arg(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(458);
				match(TMATCH);
				setState(459);
				match(LPAREN);
				setState(460);
				arg(0);
				setState(461);
				match(COMMA);
				setState(462);
				arg(0);
				setState(463);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(465);
				match(TCONTAINS);
				setState(466);
				match(LPAREN);
				setState(467);
				arg(0);
				setState(468);
				match(COMMA);
				setState(469);
				arg(0);
				setState(470);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(472);
				match(TRUELIT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(473);
				match(FALSELIT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(474);
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
		enterRule(_localctx, 60, RULE_arg_list);
		try {
			setState(479);
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
				setState(478);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_non_empty_arg_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(482);
			arg(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_arg_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_arg_list);
					setState(484);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(485);
					match(COMMA);
					setState(486);
					arg(0);
					}
					} 
				}
				setState(491);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_arg, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(493);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(494);
				match(FLOAT);
				}
				break;
			case 3:
				{
				setState(495);
				match(UNSIGNED);
				}
				break;
			case 4:
				{
				setState(496);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(497);
				match(UNDERSCORE);
				}
				break;
			case 6:
				{
				setState(498);
				match(DOLLAR);
				}
				break;
			case 7:
				{
				setState(499);
				match(AUTOINC);
				setState(500);
				match(LPAREN);
				setState(501);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(502);
				match(IDENT);
				}
				break;
			case 9:
				{
				setState(503);
				match(NIL);
				}
				break;
			case 10:
				{
				setState(504);
				match(LBRACKET);
				setState(505);
				arg_list();
				setState(506);
				match(RBRACKET);
				}
				break;
			case 11:
				{
				setState(508);
				match(DOLLAR);
				setState(509);
				qualified_name(0);
				setState(510);
				match(LPAREN);
				setState(511);
				arg_list();
				setState(512);
				match(RPAREN);
				}
				break;
			case 12:
				{
				setState(514);
				match(LPAREN);
				setState(515);
				arg(0);
				setState(516);
				match(RPAREN);
				}
				break;
			case 13:
				{
				setState(518);
				match(AS);
				setState(519);
				match(LPAREN);
				setState(520);
				arg(0);
				setState(521);
				match(COMMA);
				setState(522);
				qualified_name(0);
				setState(523);
				match(RPAREN);
				}
				break;
			case 14:
				{
				setState(525);
				match(AT);
				setState(526);
				match(IDENT);
				setState(527);
				match(LPAREN);
				setState(528);
				arg_list();
				setState(529);
				match(RPAREN);
				}
				break;
			case 15:
				{
				setState(531);
				functor_built_in();
				setState(532);
				match(LPAREN);
				setState(533);
				arg_list();
				setState(534);
				match(RPAREN);
				}
				break;
			case 16:
				{
				setState(536);
				aggregate_func();
				setState(537);
				match(LPAREN);
				setState(538);
				arg(0);
				setState(539);
				match(COMMA);
				setState(540);
				non_empty_arg_list(0);
				setState(541);
				match(RPAREN);
				}
				break;
			case 17:
				{
				setState(543);
				match(MINUS);
				setState(544);
				arg(20);
				}
				break;
			case 18:
				{
				setState(545);
				match(BW_NOT);
				setState(546);
				arg(19);
				}
				break;
			case 19:
				{
				setState(547);
				match(L_NOT);
				setState(548);
				arg(18);
				}
				break;
			case 20:
				{
				setState(549);
				aggregate_func();
				setState(550);
				arg_list();
				setState(551);
				match(COLON);
				setState(552);
				aggregate_body();
				}
				break;
			case 21:
				{
				setState(554);
				preprocessor_macro();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(602);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(557);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(558);
						match(PLUS);
						setState(559);
						arg(18);
						}
						break;
					case 2:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(560);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(561);
						match(MINUS);
						setState(562);
						arg(17);
						}
						break;
					case 3:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(563);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(564);
						match(STAR);
						setState(565);
						arg(16);
						}
						break;
					case 4:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(566);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(567);
						match(SLASH);
						setState(568);
						arg(15);
						}
						break;
					case 5:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(569);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(570);
						match(PERCENT);
						setState(571);
						arg(14);
						}
						break;
					case 6:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(572);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(573);
						match(CARET);
						setState(574);
						arg(13);
						}
						break;
					case 7:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(575);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(576);
						match(L_AND);
						setState(577);
						arg(12);
						}
						break;
					case 8:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(578);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(579);
						match(L_OR);
						setState(580);
						arg(11);
						}
						break;
					case 9:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(581);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(582);
						match(L_XOR);
						setState(583);
						arg(10);
						}
						break;
					case 10:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(584);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(585);
						match(BW_AND);
						setState(586);
						arg(9);
						}
						break;
					case 11:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(587);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(588);
						match(BW_OR);
						setState(589);
						arg(8);
						}
						break;
					case 12:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(590);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(591);
						match(BW_XOR);
						setState(592);
						arg(7);
						}
						break;
					case 13:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(593);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(594);
						match(BW_SHIFT_L);
						setState(595);
						arg(6);
						}
						break;
					case 14:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(596);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(597);
						match(BW_SHIFT_R);
						setState(598);
						arg(5);
						}
						break;
					case 15:
						{
						_localctx = new ArgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arg);
						setState(599);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(600);
						match(BW_SHIFT_R_UNSIGNED);
						setState(601);
						arg(4);
						}
						break;
					}
					} 
				}
				setState(606);
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
		enterRule(_localctx, 66, RULE_functor_built_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
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
		enterRule(_localctx, 68, RULE_aggregate_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
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
		enterRule(_localctx, 70, RULE_aggregate_body);
		try {
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				match(LBRACE);
				setState(612);
				body();
				setState(613);
				match(RBRACE);
				}
				break;
			case IDENT:
			case PREPROCESSOR_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
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
		enterRule(_localctx, 72, RULE_query_plan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(PLAN);
			setState(619);
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_query_plan_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(622);
			match(NUMBER);
			setState(623);
			match(COLON);
			setState(624);
			plan_order();
			}
			_ctx.stop = _input.LT(-1);
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Query_plan_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_query_plan_list);
					setState(626);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(627);
					match(COMMA);
					setState(628);
					match(NUMBER);
					setState(629);
					match(COLON);
					setState(630);
					plan_order();
					}
					} 
				}
				setState(635);
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
		enterRule(_localctx, 76, RULE_plan_order);
		try {
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				match(LPAREN);
				setState(637);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(LPAREN);
				setState(639);
				non_empty_plan_order_list(0);
				setState(640);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_non_empty_plan_order_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(645);
			match(NUMBER);
			}
			_ctx.stop = _input.LT(-1);
			setState(652);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_plan_order_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_plan_order_list);
					setState(647);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(648);
					match(COMMA);
					setState(649);
					match(NUMBER);
					}
					} 
				}
				setState(654);
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
		enterRule(_localctx, 80, RULE_component_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			component_head(0);
			setState(656);
			match(LBRACE);
			setState(657);
			component_body(0);
			setState(658);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_component_head, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(661);
			match(COMPONENT);
			setState(662);
			component_type();
			}
			_ctx.stop = _input.LT(-1);
			setState(672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(670);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new Component_headContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_head);
						setState(664);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(665);
						match(COLON);
						setState(666);
						component_type();
						}
						break;
					case 2:
						{
						_localctx = new Component_headContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_head);
						setState(667);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(668);
						match(COMMA);
						setState(669);
						component_type();
						}
						break;
					}
					} 
				}
				setState(674);
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
		enterRule(_localctx, 84, RULE_component_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(IDENT);
			setState(676);
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
		enterRule(_localctx, 86, RULE_component_type_params);
		try {
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				match(LT);
				setState(680);
				component_param_list(0);
				setState(681);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_component_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(686);
				match(IDENT);
				}
				break;
			case PREPROCESSOR_ID:
				{
				setState(687);
				preprocessor_macro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(695);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Component_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_component_param_list);
					setState(690);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(691);
					match(COMMA);
					setState(692);
					match(IDENT);
					}
					} 
				}
				setState(697);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_component_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(716);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(699);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(700);
						directive_head();
						}
						break;
					case 2:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(701);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(702);
						souffle_rule();
						}
						break;
					case 3:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(703);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(704);
						fact();
						}
						break;
					case 4:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(705);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(706);
						match(OVERRIDE);
						setState(707);
						match(IDENT);
						}
						break;
					case 5:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(708);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(709);
						component_init();
						}
						break;
					case 6:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(710);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(711);
						component_decl();
						}
						break;
					case 7:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(712);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(713);
						type_decl();
						}
						break;
					case 8:
						{
						_localctx = new Component_bodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_component_body);
						setState(714);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(715);
						relation_decl();
						}
						break;
					}
					} 
				}
				setState(720);
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
		enterRule(_localctx, 92, RULE_component_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(INSTANTIATE);
			setState(722);
			match(IDENT);
			setState(723);
			match(EQUALS);
			setState(724);
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
		enterRule(_localctx, 94, RULE_functor_decl);
		try {
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				match(FUNCTOR);
				setState(727);
				match(IDENT);
				setState(728);
				match(LPAREN);
				setState(729);
				functor_arg_type_list();
				setState(730);
				match(RPAREN);
				setState(731);
				match(COLON);
				setState(732);
				qualified_name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				match(FUNCTOR);
				setState(735);
				match(IDENT);
				setState(736);
				match(LPAREN);
				setState(737);
				functor_arg_type_list();
				setState(738);
				match(RPAREN);
				setState(739);
				match(COLON);
				setState(740);
				qualified_name(0);
				setState(741);
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
		enterRule(_localctx, 96, RULE_functor_arg_type_list);
		try {
			setState(747);
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
				setState(746);
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
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_non_empty_functor_arg_type_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(750);
			functor_attribute();
			}
			_ctx.stop = _input.LT(-1);
			setState(757);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_functor_arg_type_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_functor_arg_type_list);
					setState(752);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(753);
					match(COMMA);
					setState(754);
					functor_attribute();
					}
					} 
				}
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 100, RULE_functor_attribute);
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				qualified_name(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				match(IDENT);
				setState(762);
				match(COLON);
				setState(763);
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
		enterRule(_localctx, 102, RULE_pragma);
		try {
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				match(PRAGMA);
				setState(767);
				match(STRING);
				setState(768);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				match(PRAGMA);
				setState(770);
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
		enterRule(_localctx, 104, RULE_directive_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			directive_head_decl();
			setState(774);
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
		enterRule(_localctx, 106, RULE_directive_head_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
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
		enterRule(_localctx, 108, RULE_directive_list);
		try {
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				relation_directive_list(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				relation_directive_list(0);
				setState(780);
				match(LPAREN);
				setState(781);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(783);
				relation_directive_list(0);
				setState(784);
				match(LPAREN);
				setState(785);
				non_empty_key_value_pairs(0);
				setState(786);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_relation_directive_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(791);
			qualified_name(0);
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
					_localctx = new Relation_directive_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relation_directive_list);
					setState(793);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(794);
					match(COMMA);
					setState(795);
					qualified_name(0);
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
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_non_empty_key_value_pairs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(802);
			match(IDENT);
			setState(803);
			match(EQUALS);
			setState(804);
			kvp_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(813);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Non_empty_key_value_pairsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_non_empty_key_value_pairs);
					setState(806);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(807);
					match(COMMA);
					setState(808);
					match(IDENT);
					setState(809);
					match(EQUALS);
					setState(810);
					kvp_value();
					}
					} 
				}
				setState(815);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		enterRule(_localctx, 114, RULE_kvp_value);
		try {
			setState(822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				match(STRING);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				match(IDENT);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
				match(NUMBER);
				}
				break;
			case TRUELIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(819);
				match(TRUELIT);
				}
				break;
			case FALSELIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(820);
				match(FALSELIT);
				}
				break;
			case PREPROCESSOR_ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(821);
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
		case 1:
			return macro_args_sempred((Macro_argsContext)_localctx, predIndex);
		case 3:
			return unit_sempred((UnitContext)_localctx, predIndex);
		case 4:
			return qualified_name_sempred((Qualified_nameContext)_localctx, predIndex);
		case 7:
			return union_type_list_sempred((Union_type_listContext)_localctx, predIndex);
		case 8:
			return adt_branch_list_sempred((Adt_branch_listContext)_localctx, predIndex);
		case 11:
			return relation_names_sempred((Relation_namesContext)_localctx, predIndex);
		case 13:
			return non_empty_attributes_sempred((Non_empty_attributesContext)_localctx, predIndex);
		case 15:
			return relation_tags_sempred((Relation_tagsContext)_localctx, predIndex);
		case 16:
			return non_empty_attribute_names_sempred((Non_empty_attribute_namesContext)_localctx, predIndex);
		case 18:
			return dependency_list_aux_sempred((Dependency_list_auxContext)_localctx, predIndex);
		case 23:
			return head_sempred((HeadContext)_localctx, predIndex);
		case 25:
			return disjunction_sempred((DisjunctionContext)_localctx, predIndex);
		case 26:
			return conjunction_sempred((ConjunctionContext)_localctx, predIndex);
		case 31:
			return non_empty_arg_list_sempred((Non_empty_arg_listContext)_localctx, predIndex);
		case 32:
			return arg_sempred((ArgContext)_localctx, predIndex);
		case 37:
			return query_plan_list_sempred((Query_plan_listContext)_localctx, predIndex);
		case 39:
			return non_empty_plan_order_list_sempred((Non_empty_plan_order_listContext)_localctx, predIndex);
		case 41:
			return component_head_sempred((Component_headContext)_localctx, predIndex);
		case 44:
			return component_param_list_sempred((Component_param_listContext)_localctx, predIndex);
		case 45:
			return component_body_sempred((Component_bodyContext)_localctx, predIndex);
		case 49:
			return non_empty_functor_arg_type_list_sempred((Non_empty_functor_arg_type_listContext)_localctx, predIndex);
		case 55:
			return relation_directive_list_sempred((Relation_directive_listContext)_localctx, predIndex);
		case 56:
			return non_empty_key_value_pairs_sempred((Non_empty_key_value_pairsContext)_localctx, predIndex);
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
	private boolean unit_sempred(UnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean qualified_name_sempred(Qualified_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean union_type_list_sempred(Union_type_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean adt_branch_list_sempred(Adt_branch_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_names_sempred(Relation_namesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_attributes_sempred(Non_empty_attributesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_tags_sempred(Relation_tagsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 12);
		case 16:
			return precpred(_ctx, 11);
		case 17:
			return precpred(_ctx, 10);
		case 18:
			return precpred(_ctx, 9);
		case 19:
			return precpred(_ctx, 8);
		case 20:
			return precpred(_ctx, 7);
		case 21:
			return precpred(_ctx, 6);
		case 22:
			return precpred(_ctx, 5);
		case 23:
			return precpred(_ctx, 4);
		case 24:
			return precpred(_ctx, 3);
		case 25:
			return precpred(_ctx, 2);
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_attribute_names_sempred(Non_empty_attribute_namesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean dependency_list_aux_sempred(Dependency_list_auxContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean head_sempred(HeadContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean disjunction_sempred(DisjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conjunction_sempred(ConjunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_arg_list_sempred(Non_empty_arg_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arg_sempred(ArgContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 17);
		case 34:
			return precpred(_ctx, 16);
		case 35:
			return precpred(_ctx, 15);
		case 36:
			return precpred(_ctx, 14);
		case 37:
			return precpred(_ctx, 13);
		case 38:
			return precpred(_ctx, 12);
		case 39:
			return precpred(_ctx, 11);
		case 40:
			return precpred(_ctx, 10);
		case 41:
			return precpred(_ctx, 9);
		case 42:
			return precpred(_ctx, 8);
		case 43:
			return precpred(_ctx, 7);
		case 44:
			return precpred(_ctx, 6);
		case 45:
			return precpred(_ctx, 5);
		case 46:
			return precpred(_ctx, 4);
		case 47:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean query_plan_list_sempred(Query_plan_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_plan_order_list_sempred(Non_empty_plan_order_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean component_head_sempred(Component_headContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 2);
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean component_param_list_sempred(Component_param_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean component_body_sempred(Component_bodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 8);
		case 54:
			return precpred(_ctx, 7);
		case 55:
			return precpred(_ctx, 6);
		case 56:
			return precpred(_ctx, 5);
		case 57:
			return precpred(_ctx, 4);
		case 58:
			return precpred(_ctx, 3);
		case 59:
			return precpred(_ctx, 2);
		case 60:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_functor_arg_type_list_sempred(Non_empty_functor_arg_type_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 61:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_directive_list_sempred(Relation_directive_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 62:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean non_empty_key_value_pairs_sempred(Non_empty_key_value_pairsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 63:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001d\u0339\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u00028\u00078\u00029\u00079\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000|\b\u0000"+
		"\u000b\u0000\f\u0000}\u0001\u0000\u0003\u0000\u0081\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u0089\b\u0001\n\u0001\f\u0001\u008c\t\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u00a4\b\u0003\n\u0003\f\u0003\u00a7\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ac\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u00b1\b\u0004\n\u0004\f\u0004\u00b4"+
		"\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00cc"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00d4\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00dc\b\u0007\n\u0007\f\u0007"+
		"\u00df\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u00e7\b\b\n\b\f\b\u00ea\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00f4\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u0102\b\u000b\n\u000b\f\u000b\u0105\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u010d\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0115\b\r\n\r\f\r\u0118\t\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0137\b\u000f\n\u000f\f\u000f\u013a\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u013f\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0144\b\u0010\n\u0010\f\u0010\u0147\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u014e\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u0156\b\u0012\n\u0012\f\u0012\u0159\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u015e\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0164\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0179\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0186"+
		"\b\u0017\n\u0017\f\u0017\u0189\t\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0193\b\u0019\n\u0019\f\u0019\u0196\t\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u019e\b\u001a\n"+
		"\u001a\f\u001a\u01a1\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u01ac\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u01dc\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u01e0\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u01e8\b\u001f\n\u001f\f\u001f\u01eb\t\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u022c\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u025b"+
		"\b \n \f \u025e\t \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#"+
		"\u0001#\u0001#\u0003#\u0269\b#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u0278\b%\n%"+
		"\f%\u027b\t%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0283\b"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u028b\b\'\n"+
		"\'\f\'\u028e\t\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u029f\b)\n)"+
		"\f)\u02a2\t)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u02ac\b+\u0001,\u0001,\u0001,\u0003,\u02b1\b,\u0001,\u0001,\u0001,\u0005"+
		",\u02b6\b,\n,\f,\u02b9\t,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0005-\u02cd\b-\n-\f-\u02d0\t-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u02e8\b/\u0001"+
		"0\u00010\u00030\u02ec\b0\u00011\u00011\u00011\u00011\u00011\u00011\u0005"+
		"1\u02f4\b1\n1\f1\u02f7\t1\u00012\u00012\u00012\u00012\u00032\u02fd\b2"+
		"\u00013\u00013\u00013\u00013\u00013\u00033\u0304\b3\u00014\u00014\u0001"+
		"4\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00036\u0315\b6\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00057\u031d\b7\n7\f7\u0320\t7\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00058\u032c\b8\n8\f8\u032f\t8\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00039\u0337\b9\u00019\u0001}\u0017\u0002"+
		"\u0006\b\u000e\u0010\u0016\u001a\u001e $.24>@JNRXZbnp:\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\u0000\u0003\u0002\u0000\u001e"+
		"\":=\u0003\u0000\u001d\u001d1267\u0001\u0000\u0004\u0007\u0384\u0000\u0080"+
		"\u0001\u0000\u0000\u0000\u0002\u0082\u0001\u0000\u0000\u0000\u0004\u008d"+
		"\u0001\u0000\u0000\u0000\u0006\u0090\u0001\u0000\u0000\u0000\b\u00ab\u0001"+
		"\u0000\u0000\u0000\n\u00cb\u0001\u0000\u0000\u0000\f\u00d3\u0001\u0000"+
		"\u0000\u0000\u000e\u00d5\u0001\u0000\u0000\u0000\u0010\u00e0\u0001\u0000"+
		"\u0000\u0000\u0012\u00f3\u0001\u0000\u0000\u0000\u0014\u00f5\u0001\u0000"+
		"\u0000\u0000\u0016\u00fb\u0001\u0000\u0000\u0000\u0018\u010c\u0001\u0000"+
		"\u0000\u0000\u001a\u010e\u0001\u0000\u0000\u0000\u001c\u0119\u0001\u0000"+
		"\u0000\u0000\u001e\u011d\u0001\u0000\u0000\u0000 \u013e\u0001\u0000\u0000"+
		"\u0000\"\u014d\u0001\u0000\u0000\u0000$\u014f\u0001\u0000\u0000\u0000"+
		"&\u015d\u0001\u0000\u0000\u0000(\u0163\u0001\u0000\u0000\u0000*\u0178"+
		"\u0001\u0000\u0000\u0000,\u017a\u0001\u0000\u0000\u0000.\u017f\u0001\u0000"+
		"\u0000\u00000\u018a\u0001\u0000\u0000\u00002\u018c\u0001\u0000\u0000\u0000"+
		"4\u0197\u0001\u0000\u0000\u00006\u01ab\u0001\u0000\u0000\u00008\u01ad"+
		"\u0001\u0000\u0000\u0000:\u01db\u0001\u0000\u0000\u0000<\u01df\u0001\u0000"+
		"\u0000\u0000>\u01e1\u0001\u0000\u0000\u0000@\u022b\u0001\u0000\u0000\u0000"+
		"B\u025f\u0001\u0000\u0000\u0000D\u0261\u0001\u0000\u0000\u0000F\u0268"+
		"\u0001\u0000\u0000\u0000H\u026a\u0001\u0000\u0000\u0000J\u026d\u0001\u0000"+
		"\u0000\u0000L\u0282\u0001\u0000\u0000\u0000N\u0284\u0001\u0000\u0000\u0000"+
		"P\u028f\u0001\u0000\u0000\u0000R\u0294\u0001\u0000\u0000\u0000T\u02a3"+
		"\u0001\u0000\u0000\u0000V\u02ab\u0001\u0000\u0000\u0000X\u02b0\u0001\u0000"+
		"\u0000\u0000Z\u02ba\u0001\u0000\u0000\u0000\\\u02d1\u0001\u0000\u0000"+
		"\u0000^\u02e7\u0001\u0000\u0000\u0000`\u02eb\u0001\u0000\u0000\u0000b"+
		"\u02ed\u0001\u0000\u0000\u0000d\u02fc\u0001\u0000\u0000\u0000f\u0303\u0001"+
		"\u0000\u0000\u0000h\u0305\u0001\u0000\u0000\u0000j\u0308\u0001\u0000\u0000"+
		"\u0000l\u0314\u0001\u0000\u0000\u0000n\u0316\u0001\u0000\u0000\u0000p"+
		"\u0321\u0001\u0000\u0000\u0000r\u0336\u0001\u0000\u0000\u0000t\u0081\u0005"+
		"d\u0000\u0000uv\u0005d\u0000\u0000vw\u0005E\u0000\u0000w\u0081\u0005F"+
		"\u0000\u0000xy\u0005d\u0000\u0000y{\u0005E\u0000\u0000z|\t\u0000\u0000"+
		"\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0081\u0005F\u0000\u0000\u0080t\u0001\u0000\u0000\u0000\u0080u"+
		"\u0001\u0000\u0000\u0000\u0080x\u0001\u0000\u0000\u0000\u0081\u0001\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0006\u0001\uffff\uffff\u0000\u0083\u0084"+
		"\u0005^\u0000\u0000\u0084\u008a\u0001\u0000\u0000\u0000\u0085\u0086\n"+
		"\u0001\u0000\u0000\u0086\u0087\u0005G\u0000\u0000\u0087\u0089\u0005^\u0000"+
		"\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u0003\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0003\u0006\u0003\u0000\u008e\u008f\u0005\u0000\u0000"+
		"\u0001\u008f\u0005\u0001\u0000\u0000\u0000\u0090\u00a5\u0006\u0003\uffff"+
		"\uffff\u0000\u0091\u0092\n\t\u0000\u0000\u0092\u00a4\u0003h4\u0000\u0093"+
		"\u0094\n\b\u0000\u0000\u0094\u00a4\u0003*\u0015\u0000\u0095\u0096\n\u0007"+
		"\u0000\u0000\u0096\u00a4\u0003(\u0014\u0000\u0097\u0098\n\u0006\u0000"+
		"\u0000\u0098\u00a4\u0003P(\u0000\u0099\u009a\n\u0005\u0000\u0000\u009a"+
		"\u00a4\u0003\\.\u0000\u009b\u009c\n\u0004\u0000\u0000\u009c\u00a4\u0003"+
		"f3\u0000\u009d\u009e\n\u0003\u0000\u0000\u009e\u00a4\u0003\n\u0005\u0000"+
		"\u009f\u00a0\n\u0002\u0000\u0000\u00a0\u00a4\u0003^/\u0000\u00a1\u00a2"+
		"\n\u0001\u0000\u0000\u00a2\u00a4\u0003\u0014\n\u0000\u00a3\u0091\u0001"+
		"\u0000\u0000\u0000\u00a3\u0093\u0001\u0000\u0000\u0000\u00a3\u0095\u0001"+
		"\u0000\u0000\u0000\u00a3\u0097\u0001\u0000\u0000\u0000\u00a3\u0099\u0001"+
		"\u0000\u0000\u0000\u00a3\u009b\u0001\u0000\u0000\u0000\u00a3\u009d\u0001"+
		"\u0000\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u0007\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0006"+
		"\u0004\uffff\uffff\u0000\u00a9\u00ac\u0005^\u0000\u0000\u00aa\u00ac\u0003"+
		"\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00b2\u0001\u0000\u0000\u0000\u00ad\u00ae\n\u0002"+
		"\u0000\u0000\u00ae\u00af\u0005Z\u0000\u0000\u00af\u00b1\u0005^\u0000\u0000"+
		"\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\t\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005\b\u0000\u0000\u00b6\u00b7\u0005^\u0000\u0000\u00b7\u00b8"+
		"\u0005J\u0000\u0000\u00b8\u00cc\u0003\b\u0004\u0000\u00b9\u00ba\u0005"+
		"\b\u0000\u0000\u00ba\u00bb\u0005^\u0000\u0000\u00bb\u00bc\u0005N\u0000"+
		"\u0000\u00bc\u00cc\u0003\u000e\u0007\u0000\u00bd\u00be\u0005\b\u0000\u0000"+
		"\u00be\u00bf\u0005^\u0000\u0000\u00bf\u00c0\u0005N\u0000\u0000\u00c0\u00cc"+
		"\u0003\f\u0006\u0000\u00c1\u00c2\u0005\b\u0000\u0000\u00c2\u00c3\u0005"+
		"^\u0000\u0000\u00c3\u00c4\u0005N\u0000\u0000\u00c4\u00cc\u0003\u0010\b"+
		"\u0000\u00c5\u00c6\u0005\u000b\u0000\u0000\u00c6\u00cc\u0005^\u0000\u0000"+
		"\u00c7\u00c8\u0005\f\u0000\u0000\u00c8\u00cc\u0005^\u0000\u0000\u00c9"+
		"\u00ca\u0005\b\u0000\u0000\u00ca\u00cc\u0005^\u0000\u0000\u00cb\u00b5"+
		"\u0001\u0000\u0000\u0000\u00cb\u00b9\u0001\u0000\u0000\u0000\u00cb\u00bd"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c1\u0001\u0000\u0000\u0000\u00cb\u00c5"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cc\u000b\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0005@\u0000\u0000\u00ce\u00d4\u0005A\u0000\u0000\u00cf\u00d0\u0005@"+
		"\u0000\u0000\u00d0\u00d1\u0003\u001a\r\u0000\u00d1\u00d2\u0005A\u0000"+
		"\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00cd\u0001\u0000\u0000"+
		"\u0000\u00d3\u00cf\u0001\u0000\u0000\u0000\u00d4\r\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0006\u0007\uffff\uffff\u0000\u00d6\u00d7\u0003\b\u0004\u0000"+
		"\u00d7\u00dd\u0001\u0000\u0000\u0000\u00d8\u00d9\n\u0001\u0000\u0000\u00d9"+
		"\u00da\u0005?\u0000\u0000\u00da\u00dc\u0003\b\u0004\u0000\u00db\u00d8"+
		"\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u000f"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0006\b\uffff\uffff\u0000\u00e1\u00e2\u0003\u0012\t\u0000\u00e2\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\n\u0001\u0000\u0000\u00e4\u00e5\u0005"+
		"?\u0000\u0000\u00e5\u00e7\u0003\u0012\t\u0000\u00e6\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u0011\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005^\u0000"+
		"\u0000\u00ec\u00ed\u0005U\u0000\u0000\u00ed\u00f4\u0005V\u0000\u0000\u00ee"+
		"\u00ef\u0005^\u0000\u0000\u00ef\u00f0\u0005U\u0000\u0000\u00f0\u00f1\u0003"+
		"\u001a\r\u0000\u00f1\u00f2\u0005V\u0000\u0000\u00f2\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f3\u00eb\u0001\u0000\u0000\u0000\u00f3\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f4\u0013\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u0002"+
		"\u0000\u0000\u00f6\u00f7\u0003\u0016\u000b\u0000\u00f7\u00f8\u0003\u0018"+
		"\f\u0000\u00f8\u00f9\u0003\u001e\u000f\u0000\u00f9\u00fa\u0003&\u0013"+
		"\u0000\u00fa\u0015\u0001\u0000\u0000\u0000\u00fb\u00fc\u0006\u000b\uffff"+
		"\uffff\u0000\u00fc\u00fd\u0005^\u0000\u0000\u00fd\u0103\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\n\u0001\u0000\u0000\u00ff\u0100\u0005G\u0000\u0000"+
		"\u0100\u0102\u0005^\u0000\u0000\u0101\u00fe\u0001\u0000\u0000\u0000\u0102"+
		"\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104\u0017\u0001\u0000\u0000\u0000\u0105"+
		"\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0005E\u0000\u0000\u0107\u010d"+
		"\u0005F\u0000\u0000\u0108\u0109\u0005E\u0000\u0000\u0109\u010a\u0003\u001a"+
		"\r\u0000\u010a\u010b\u0005F\u0000\u0000\u010b\u010d\u0001\u0000\u0000"+
		"\u0000\u010c\u0106\u0001\u0000\u0000\u0000\u010c\u0108\u0001\u0000\u0000"+
		"\u0000\u010d\u0019\u0001\u0000\u0000\u0000\u010e\u010f\u0006\r\uffff\uffff"+
		"\u0000\u010f\u0110\u0003\u001c\u000e\u0000\u0110\u0116\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\n\u0001\u0000\u0000\u0112\u0113\u0005G\u0000\u0000"+
		"\u0113\u0115\u0003\u001c\u000e\u0000\u0114\u0111\u0001\u0000\u0000\u0000"+
		"\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u001b\u0001\u0000\u0000\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a\u0005^\u0000\u0000\u011a"+
		"\u011b\u0005H\u0000\u0000\u011b\u011c\u0003\b\u0004\u0000\u011c\u001d"+
		"\u0001\u0000\u0000\u0000\u011d\u0138\u0006\u000f\uffff\uffff\u0000\u011e"+
		"\u011f\n\f\u0000\u0000\u011f\u0137\u0005\'\u0000\u0000\u0120\u0121\n\u000b"+
		"\u0000\u0000\u0121\u0137\u0005*\u0000\u0000\u0122\u0123\n\n\u0000\u0000"+
		"\u0123\u0137\u0005+\u0000\u0000\u0124\u0125\n\t\u0000\u0000\u0125\u0137"+
		"\u0005,\u0000\u0000\u0126\u0127\n\b\u0000\u0000\u0127\u0137\u0005-\u0000"+
		"\u0000\u0128\u0129\n\u0007\u0000\u0000\u0129\u0137\u0005.\u0000\u0000"+
		"\u012a\u012b\n\u0006\u0000\u0000\u012b\u0137\u00050\u0000\u0000\u012c"+
		"\u012d\n\u0005\u0000\u0000\u012d\u0137\u0005/\u0000\u0000\u012e\u012f"+
		"\n\u0004\u0000\u0000\u012f\u0137\u0005)\u0000\u0000\u0130\u0131\n\u0003"+
		"\u0000\u0000\u0131\u0137\u0005%\u0000\u0000\u0132\u0133\n\u0002\u0000"+
		"\u0000\u0133\u0137\u0005&\u0000\u0000\u0134\u0135\n\u0001\u0000\u0000"+
		"\u0135\u0137\u0005(\u0000\u0000\u0136\u011e\u0001\u0000\u0000\u0000\u0136"+
		"\u0120\u0001\u0000\u0000\u0000\u0136\u0122\u0001\u0000\u0000\u0000\u0136"+
		"\u0124\u0001\u0000\u0000\u0000\u0136\u0126\u0001\u0000\u0000\u0000\u0136"+
		"\u0128\u0001\u0000\u0000\u0000\u0136\u012a\u0001\u0000\u0000\u0000\u0136"+
		"\u012c\u0001\u0000\u0000\u0000\u0136\u012e\u0001\u0000\u0000\u0000\u0136"+
		"\u0130\u0001\u0000\u0000\u0000\u0136\u0132\u0001\u0000\u0000\u0000\u0136"+
		"\u0134\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138"+
		"\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139"+
		"\u001f\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0006\u0010\uffff\uffff\u0000\u013c\u013f\u0005^\u0000\u0000\u013d"+
		"\u013f\u0003\u0000\u0000\u0000\u013e\u013b\u0001\u0000\u0000\u0000\u013e"+
		"\u013d\u0001\u0000\u0000\u0000\u013f\u0145\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\n\u0002\u0000\u0000\u0141\u0142\u0005G\u0000\u0000\u0142\u0144"+
		"\u0005^\u0000\u0000\u0143\u0140\u0001\u0000\u0000\u0000\u0144\u0147\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146!\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000"+
		"\u0000\u0000\u0148\u014e\u0005^\u0000\u0000\u0149\u014a\u0005E\u0000\u0000"+
		"\u014a\u014b\u0003 \u0010\u0000\u014b\u014c\u0005F\u0000\u0000\u014c\u014e"+
		"\u0001\u0000\u0000\u0000\u014d\u0148\u0001\u0000\u0000\u0000\u014d\u0149"+
		"\u0001\u0000\u0000\u0000\u014e#\u0001\u0000\u0000\u0000\u014f\u0150\u0006"+
		"\u0012\uffff\uffff\u0000\u0150\u0151\u0003\"\u0011\u0000\u0151\u0157\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\n\u0001\u0000\u0000\u0153\u0154\u0005G"+
		"\u0000\u0000\u0154\u0156\u0003\"\u0011\u0000\u0155\u0152\u0001\u0000\u0000"+
		"\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158%\u0001\u0000\u0000\u0000"+
		"\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015e\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0005>\u0000\u0000\u015c\u015e\u0003$\u0012\u0000\u015d\u015a"+
		"\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\'\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u00038\u001c\u0000\u0160\u0161\u0005Z\u0000"+
		"\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0164\u0003\u0000\u0000"+
		"\u0000\u0163\u015f\u0001\u0000\u0000\u0000\u0163\u0162\u0001\u0000\u0000"+
		"\u0000\u0164)\u0001\u0000\u0000\u0000\u0165\u0179\u0003,\u0016\u0000\u0166"+
		"\u0167\u0003,\u0016\u0000\u0167\u0168\u0003H$\u0000\u0168\u0179\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u00038\u001c\u0000\u016a\u016b\u0005K\u0000"+
		"\u0000\u016b\u016c\u00038\u001c\u0000\u016c\u016d\u0005Y\u0000\u0000\u016d"+
		"\u016e\u00030\u0018\u0000\u016e\u016f\u0005Z\u0000\u0000\u016f\u0179\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u00038\u001c\u0000\u0171\u0172\u0005K\u0000"+
		"\u0000\u0172\u0173\u00038\u001c\u0000\u0173\u0174\u0005Y\u0000\u0000\u0174"+
		"\u0175\u00030\u0018\u0000\u0175\u0176\u0005Z\u0000\u0000\u0176\u0177\u0003"+
		"H$\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178\u0165\u0001\u0000\u0000"+
		"\u0000\u0178\u0166\u0001\u0000\u0000\u0000\u0178\u0169\u0001\u0000\u0000"+
		"\u0000\u0178\u0170\u0001\u0000\u0000\u0000\u0179+\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0003.\u0017\u0000\u017b\u017c\u0005Y\u0000\u0000\u017c\u017d"+
		"\u00030\u0018\u0000\u017d\u017e\u0005Z\u0000\u0000\u017e-\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0006\u0017\uffff\uffff\u0000\u0180\u0181\u0003"+
		"8\u001c\u0000\u0181\u0187\u0001\u0000\u0000\u0000\u0182\u0183\n\u0001"+
		"\u0000\u0000\u0183\u0184\u0005G\u0000\u0000\u0184\u0186\u00038\u001c\u0000"+
		"\u0185\u0182\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000"+
		"\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000"+
		"\u0188/\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u00032\u0019\u0000\u018b1\u0001\u0000\u0000\u0000\u018c\u018d\u0006"+
		"\u0019\uffff\uffff\u0000\u018d\u018e\u00034\u001a\u0000\u018e\u0194\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\n\u0001\u0000\u0000\u0190\u0191\u0005I"+
		"\u0000\u0000\u0191\u0193\u00034\u001a\u0000\u0192\u018f\u0001\u0000\u0000"+
		"\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u01953\u0001\u0000\u0000\u0000"+
		"\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u0198\u0006\u001a\uffff\uffff"+
		"\u0000\u0198\u0199\u00036\u001b\u0000\u0199\u019f\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\n\u0001\u0000\u0000\u019b\u019c\u0005G\u0000\u0000\u019c"+
		"\u019e\u00036\u001b\u0000\u019d\u019a\u0001\u0000\u0000\u0000\u019e\u01a1"+
		"\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a05\u0001\u0000\u0000\u0000\u01a1\u019f\u0001"+
		"\u0000\u0000\u0000\u01a2\u01ac\u00038\u001c\u0000\u01a3\u01ac\u0003:\u001d"+
		"\u0000\u01a4\u01a5\u0005E\u0000\u0000\u01a5\u01a6\u00032\u0019\u0000\u01a6"+
		"\u01a7\u0005F\u0000\u0000\u01a7\u01ac\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0005O\u0000\u0000\u01a9\u01ac\u00036\u001b\u0000\u01aa\u01ac\u0003\u0000"+
		"\u0000\u0000\u01ab\u01a2\u0001\u0000\u0000\u0000\u01ab\u01a3\u0001\u0000"+
		"\u0000\u0000\u01ab\u01a4\u0001\u0000\u0000\u0000\u01ab\u01a8\u0001\u0000"+
		"\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ac7\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0003\b\u0004\u0000\u01ae\u01af\u0005E\u0000\u0000"+
		"\u01af\u01b0\u0003<\u001e\u0000\u01b0\u01b1\u0005F\u0000\u0000\u01b19"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b3\u0003@ \u0000\u01b3\u01b4\u0005W"+
		"\u0000\u0000\u01b4\u01b5\u0003@ \u0000\u01b5\u01dc\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b7\u0003@ \u0000\u01b7\u01b8\u0005X\u0000\u0000\u01b8\u01b9"+
		"\u0003@ \u0000\u01b9\u01dc\u0001\u0000\u0000\u0000\u01ba\u01bb\u0003@"+
		" \u0000\u01bb\u01bc\u0005K\u0000\u0000\u01bc\u01bd\u0003@ \u0000\u01bd"+
		"\u01dc\u0001\u0000\u0000\u0000\u01be\u01bf\u0003@ \u0000\u01bf\u01c0\u0005"+
		"L\u0000\u0000\u01c0\u01c1\u0003@ \u0000\u01c1\u01dc\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0003@ \u0000\u01c3\u01c4\u0005N\u0000\u0000\u01c4"+
		"\u01c5\u0003@ \u0000\u01c5\u01dc\u0001\u0000\u0000\u0000\u01c6\u01c7\u0003"+
		"@ \u0000\u01c7\u01c8\u0005M\u0000\u0000\u01c8\u01c9\u0003@ \u0000\u01c9"+
		"\u01dc\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005\u001c\u0000\u0000\u01cb"+
		"\u01cc\u0005E\u0000\u0000\u01cc\u01cd\u0003@ \u0000\u01cd\u01ce\u0005"+
		"G\u0000\u0000\u01ce\u01cf\u0003@ \u0000\u01cf\u01d0\u0005F\u0000\u0000"+
		"\u01d0\u01dc\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005$\u0000\u0000\u01d2"+
		"\u01d3\u0005E\u0000\u0000\u01d3\u01d4\u0003@ \u0000\u01d4\u01d5\u0005"+
		"G\u0000\u0000\u01d5\u01d6\u0003@ \u0000\u01d6\u01d7\u0005F\u0000\u0000"+
		"\u01d7\u01dc\u0001\u0000\u0000\u0000\u01d8\u01dc\u00058\u0000\u0000\u01d9"+
		"\u01dc\u00059\u0000\u0000\u01da\u01dc\u0003\u0000\u0000\u0000\u01db\u01b2"+
		"\u0001\u0000\u0000\u0000\u01db\u01b6\u0001\u0000\u0000\u0000\u01db\u01ba"+
		"\u0001\u0000\u0000\u0000\u01db\u01be\u0001\u0000\u0000\u0000\u01db\u01c2"+
		"\u0001\u0000\u0000\u0000\u01db\u01c6\u0001\u0000\u0000\u0000\u01db\u01ca"+
		"\u0001\u0000\u0000\u0000\u01db\u01d1\u0001\u0000\u0000\u0000\u01db\u01d8"+
		"\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01da"+
		"\u0001\u0000\u0000\u0000\u01dc;\u0001\u0000\u0000\u0000\u01dd\u01e0\u0001"+
		"\u0000\u0000\u0000\u01de\u01e0\u0003>\u001f\u0000\u01df\u01dd\u0001\u0000"+
		"\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0=\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e2\u0006\u001f\uffff\uffff\u0000\u01e2\u01e3\u0003@ \u0000"+
		"\u01e3\u01e9\u0001\u0000\u0000\u0000\u01e4\u01e5\n\u0001\u0000\u0000\u01e5"+
		"\u01e6\u0005G\u0000\u0000\u01e6\u01e8\u0003@ \u0000\u01e7\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e8\u01eb\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea?\u0001\u0000"+
		"\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01ec\u01ed\u0006 \uffff"+
		"\uffff\u0000\u01ed\u022c\u0005_\u0000\u0000\u01ee\u022c\u0005\\\u0000"+
		"\u0000\u01ef\u022c\u0005]\u0000\u0000\u01f0\u022c\u0005[\u0000\u0000\u01f1"+
		"\u022c\u00055\u0000\u0000\u01f2\u022c\u0005B\u0000\u0000\u01f3\u01f4\u0005"+
		"\u0010\u0000\u0000\u01f4\u01f5\u0005E\u0000\u0000\u01f5\u022c\u0005F\u0000"+
		"\u0000\u01f6\u022c\u0005^\u0000\u0000\u01f7\u022c\u00054\u0000\u0000\u01f8"+
		"\u01f9\u0005@\u0000\u0000\u01f9\u01fa\u0003<\u001e\u0000\u01fa\u01fb\u0005"+
		"A\u0000\u0000\u01fb\u022c\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005B\u0000"+
		"\u0000\u01fd\u01fe\u0003\b\u0004\u0000\u01fe\u01ff\u0005E\u0000\u0000"+
		"\u01ff\u0200\u0003<\u001e\u0000\u0200\u0201\u0005F\u0000\u0000\u0201\u022c"+
		"\u0001\u0000\u0000\u0000\u0202\u0203\u0005E\u0000\u0000\u0203\u0204\u0003"+
		"@ \u0000\u0204\u0205\u0005F\u0000\u0000\u0205\u022c\u0001\u0000\u0000"+
		"\u0000\u0206\u0207\u00053\u0000\u0000\u0207\u0208\u0005E\u0000\u0000\u0208"+
		"\u0209\u0003@ \u0000\u0209\u020a\u0005G\u0000\u0000\u020a\u020b\u0003"+
		"\b\u0004\u0000\u020b\u020c\u0005F\u0000\u0000\u020c\u022c\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0005Q\u0000\u0000\u020e\u020f\u0005^\u0000\u0000"+
		"\u020f\u0210\u0005E\u0000\u0000\u0210\u0211\u0003<\u001e\u0000\u0211\u0212"+
		"\u0005F\u0000\u0000\u0212\u022c\u0001\u0000\u0000\u0000\u0213\u0214\u0003"+
		"B!\u0000\u0214\u0215\u0005E\u0000\u0000\u0215\u0216\u0003<\u001e\u0000"+
		"\u0216\u0217\u0005F\u0000\u0000\u0217\u022c\u0001\u0000\u0000\u0000\u0218"+
		"\u0219\u0003D\"\u0000\u0219\u021a\u0005E\u0000\u0000\u021a\u021b\u0003"+
		"@ \u0000\u021b\u021c\u0005G\u0000\u0000\u021c\u021d\u0003>\u001f\u0000"+
		"\u021d\u021e\u0005F\u0000\u0000\u021e\u022c\u0001\u0000\u0000\u0000\u021f"+
		"\u0220\u0005D\u0000\u0000\u0220\u022c\u0003@ \u0014\u0221\u0222\u0005"+
		"\u0014\u0000\u0000\u0222\u022c\u0003@ \u0013\u0223\u0224\u0005\u001b\u0000"+
		"\u0000\u0224\u022c\u0003@ \u0012\u0225\u0226\u0003D\"\u0000\u0226\u0227"+
		"\u0003<\u001e\u0000\u0227\u0228\u0005H\u0000\u0000\u0228\u0229\u0003F"+
		"#\u0000\u0229\u022c\u0001\u0000\u0000\u0000\u022a\u022c\u0003\u0000\u0000"+
		"\u0000\u022b\u01ec\u0001\u0000\u0000\u0000\u022b\u01ee\u0001\u0000\u0000"+
		"\u0000\u022b\u01ef\u0001\u0000\u0000\u0000\u022b\u01f0\u0001\u0000\u0000"+
		"\u0000\u022b\u01f1\u0001\u0000\u0000\u0000\u022b\u01f2\u0001\u0000\u0000"+
		"\u0000\u022b\u01f3\u0001\u0000\u0000\u0000\u022b\u01f6\u0001\u0000\u0000"+
		"\u0000\u022b\u01f7\u0001\u0000\u0000\u0000\u022b\u01f8\u0001\u0000\u0000"+
		"\u0000\u022b\u01fc\u0001\u0000\u0000\u0000\u022b\u0202\u0001\u0000\u0000"+
		"\u0000\u022b\u0206\u0001\u0000\u0000\u0000\u022b\u020d\u0001\u0000\u0000"+
		"\u0000\u022b\u0213\u0001\u0000\u0000\u0000\u022b\u0218\u0001\u0000\u0000"+
		"\u0000\u022b\u021f\u0001\u0000\u0000\u0000\u022b\u0221\u0001\u0000\u0000"+
		"\u0000\u022b\u0223\u0001\u0000\u0000\u0000\u022b\u0225\u0001\u0000\u0000"+
		"\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022c\u025c\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\n\u0011\u0000\u0000\u022e\u022f\u0005C\u0000\u0000"+
		"\u022f\u025b\u0003@ \u0012\u0230\u0231\n\u0010\u0000\u0000\u0231\u0232"+
		"\u0005D\u0000\u0000\u0232\u025b\u0003@ \u0011\u0233\u0234\n\u000f\u0000"+
		"\u0000\u0234\u0235\u0005P\u0000\u0000\u0235\u025b\u0003@ \u0010\u0236"+
		"\u0237\n\u000e\u0000\u0000\u0237\u0238\u0005R\u0000\u0000\u0238\u025b"+
		"\u0003@ \u000f\u0239\u023a\n\r\u0000\u0000\u023a\u023b\u0005T\u0000\u0000"+
		"\u023b\u025b\u0003@ \u000e\u023c\u023d\n\f\u0000\u0000\u023d\u023e\u0005"+
		"S\u0000\u0000\u023e\u025b\u0003@ \r\u023f\u0240\n\u000b\u0000\u0000\u0240"+
		"\u0241\u0005\u0018\u0000\u0000\u0241\u025b\u0003@ \f\u0242\u0243\n\n\u0000"+
		"\u0000\u0243\u0244\u0005\u0019\u0000\u0000\u0244\u025b\u0003@ \u000b\u0245"+
		"\u0246\n\t\u0000\u0000\u0246\u0247\u0005\u001a\u0000\u0000\u0247\u025b"+
		"\u0003@ \n\u0248\u0249\n\b\u0000\u0000\u0249\u024a\u0005\u0011\u0000\u0000"+
		"\u024a\u025b\u0003@ \t\u024b\u024c\n\u0007\u0000\u0000\u024c\u024d\u0005"+
		"\u0012\u0000\u0000\u024d\u025b\u0003@ \b\u024e\u024f\n\u0006\u0000\u0000"+
		"\u024f\u0250\u0005\u0013\u0000\u0000\u0250\u025b\u0003@ \u0007\u0251\u0252"+
		"\n\u0005\u0000\u0000\u0252\u0253\u0005\u0015\u0000\u0000\u0253\u025b\u0003"+
		"@ \u0006\u0254\u0255\n\u0004\u0000\u0000\u0255\u0256\u0005\u0016\u0000"+
		"\u0000\u0256\u025b\u0003@ \u0005\u0257\u0258\n\u0003\u0000\u0000\u0258"+
		"\u0259\u0005\u0017\u0000\u0000\u0259\u025b\u0003@ \u0004\u025a\u022d\u0001"+
		"\u0000\u0000\u0000\u025a\u0230\u0001\u0000\u0000\u0000\u025a\u0233\u0001"+
		"\u0000\u0000\u0000\u025a\u0236\u0001\u0000\u0000\u0000\u025a\u0239\u0001"+
		"\u0000\u0000\u0000\u025a\u023c\u0001\u0000\u0000\u0000\u025a\u023f\u0001"+
		"\u0000\u0000\u0000\u025a\u0242\u0001\u0000\u0000\u0000\u025a\u0245\u0001"+
		"\u0000\u0000\u0000\u025a\u0248\u0001\u0000\u0000\u0000\u025a\u024b\u0001"+
		"\u0000\u0000\u0000\u025a\u024e\u0001\u0000\u0000\u0000\u025a\u0251\u0001"+
		"\u0000\u0000\u0000\u025a\u0254\u0001\u0000\u0000\u0000\u025a\u0257\u0001"+
		"\u0000\u0000\u0000\u025b\u025e\u0001\u0000\u0000\u0000\u025c\u025a\u0001"+
		"\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025dA\u0001\u0000"+
		"\u0000\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025f\u0260\u0007\u0000"+
		"\u0000\u0000\u0260C\u0001\u0000\u0000\u0000\u0261\u0262\u0007\u0001\u0000"+
		"\u0000\u0262E\u0001\u0000\u0000\u0000\u0263\u0264\u0005U\u0000\u0000\u0264"+
		"\u0265\u00030\u0018\u0000\u0265\u0266\u0005V\u0000\u0000\u0266\u0269\u0001"+
		"\u0000\u0000\u0000\u0267\u0269\u00038\u001c\u0000\u0268\u0263\u0001\u0000"+
		"\u0000\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0269G\u0001\u0000\u0000"+
		"\u0000\u026a\u026b\u0005\u000f\u0000\u0000\u026b\u026c\u0003J%\u0000\u026c"+
		"I\u0001\u0000\u0000\u0000\u026d\u026e\u0006%\uffff\uffff\u0000\u026e\u026f"+
		"\u0005[\u0000\u0000\u026f\u0270\u0005H\u0000\u0000\u0270\u0271\u0003L"+
		"&\u0000\u0271\u0279\u0001\u0000\u0000\u0000\u0272\u0273\n\u0001\u0000"+
		"\u0000\u0273\u0274\u0005G\u0000\u0000\u0274\u0275\u0005[\u0000\u0000\u0275"+
		"\u0276\u0005H\u0000\u0000\u0276\u0278\u0003L&\u0000\u0277\u0272\u0001"+
		"\u0000\u0000\u0000\u0278\u027b\u0001\u0000\u0000\u0000\u0279\u0277\u0001"+
		"\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027aK\u0001\u0000"+
		"\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027c\u027d\u0005E\u0000"+
		"\u0000\u027d\u0283\u0005F\u0000\u0000\u027e\u027f\u0005E\u0000\u0000\u027f"+
		"\u0280\u0003N\'\u0000\u0280\u0281\u0005F\u0000\u0000\u0281\u0283\u0001"+
		"\u0000\u0000\u0000\u0282\u027c\u0001\u0000\u0000\u0000\u0282\u027e\u0001"+
		"\u0000\u0000\u0000\u0283M\u0001\u0000\u0000\u0000\u0284\u0285\u0006\'"+
		"\uffff\uffff\u0000\u0285\u0286\u0005[\u0000\u0000\u0286\u028c\u0001\u0000"+
		"\u0000\u0000\u0287\u0288\n\u0001\u0000\u0000\u0288\u0289\u0005G\u0000"+
		"\u0000\u0289\u028b\u0005[\u0000\u0000\u028a\u0287\u0001\u0000\u0000\u0000"+
		"\u028b\u028e\u0001\u0000\u0000\u0000\u028c\u028a\u0001\u0000\u0000\u0000"+
		"\u028c\u028d\u0001\u0000\u0000\u0000\u028dO\u0001\u0000\u0000\u0000\u028e"+
		"\u028c\u0001\u0000\u0000\u0000\u028f\u0290\u0003R)\u0000\u0290\u0291\u0005"+
		"U\u0000\u0000\u0291\u0292\u0003Z-\u0000\u0292\u0293\u0005V\u0000\u0000"+
		"\u0293Q\u0001\u0000\u0000\u0000\u0294\u0295\u0006)\uffff\uffff\u0000\u0295"+
		"\u0296\u0005\t\u0000\u0000\u0296\u0297\u0003T*\u0000\u0297\u02a0\u0001"+
		"\u0000\u0000\u0000\u0298\u0299\n\u0002\u0000\u0000\u0299\u029a\u0005H"+
		"\u0000\u0000\u029a\u029f\u0003T*\u0000\u029b\u029c\n\u0001\u0000\u0000"+
		"\u029c\u029d\u0005G\u0000\u0000\u029d\u029f\u0003T*\u0000\u029e\u0298"+
		"\u0001\u0000\u0000\u0000\u029e\u029b\u0001\u0000\u0000\u0000\u029f\u02a2"+
		"\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a0\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a1S\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a4\u0005^\u0000\u0000\u02a4\u02a5\u0003V+"+
		"\u0000\u02a5U\u0001\u0000\u0000\u0000\u02a6\u02ac\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a8\u0005W\u0000\u0000\u02a8\u02a9\u0003X,\u0000\u02a9\u02aa"+
		"\u0005X\u0000\u0000\u02aa\u02ac\u0001\u0000\u0000\u0000\u02ab\u02a6\u0001"+
		"\u0000\u0000\u0000\u02ab\u02a7\u0001\u0000\u0000\u0000\u02acW\u0001\u0000"+
		"\u0000\u0000\u02ad\u02ae\u0006,\uffff\uffff\u0000\u02ae\u02b1\u0005^\u0000"+
		"\u0000\u02af\u02b1\u0003\u0000\u0000\u0000\u02b0\u02ad\u0001\u0000\u0000"+
		"\u0000\u02b0\u02af\u0001\u0000\u0000\u0000\u02b1\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b3\n\u0002\u0000\u0000\u02b3\u02b4\u0005G\u0000\u0000"+
		"\u02b4\u02b6\u0005^\u0000\u0000\u02b5\u02b2\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b9\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b8Y\u0001\u0000\u0000\u0000\u02b9\u02b7"+
		"\u0001\u0000\u0000\u0000\u02ba\u02ce\u0006-\uffff\uffff\u0000\u02bb\u02bc"+
		"\n\b\u0000\u0000\u02bc\u02cd\u0003h4\u0000\u02bd\u02be\n\u0007\u0000\u0000"+
		"\u02be\u02cd\u0003*\u0015\u0000\u02bf\u02c0\n\u0006\u0000\u0000\u02c0"+
		"\u02cd\u0003(\u0014\u0000\u02c1\u02c2\n\u0005\u0000\u0000\u02c2\u02c3"+
		"\u0005\r\u0000\u0000\u02c3\u02cd\u0005^\u0000\u0000\u02c4\u02c5\n\u0004"+
		"\u0000\u0000\u02c5\u02cd\u0003\\.\u0000\u02c6\u02c7\n\u0003\u0000\u0000"+
		"\u02c7\u02cd\u0003P(\u0000\u02c8\u02c9\n\u0002\u0000\u0000\u02c9\u02cd"+
		"\u0003\n\u0005\u0000\u02ca\u02cb\n\u0001\u0000\u0000\u02cb\u02cd\u0003"+
		"\u0014\n\u0000\u02cc\u02bb\u0001\u0000\u0000\u0000\u02cc\u02bd\u0001\u0000"+
		"\u0000\u0000\u02cc\u02bf\u0001\u0000\u0000\u0000\u02cc\u02c1\u0001\u0000"+
		"\u0000\u0000\u02cc\u02c4\u0001\u0000\u0000\u0000\u02cc\u02c6\u0001\u0000"+
		"\u0000\u0000\u02cc\u02c8\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000"+
		"\u0000\u0000\u02cd\u02d0\u0001\u0000\u0000\u0000\u02ce\u02cc\u0001\u0000"+
		"\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf[\u0001\u0000\u0000"+
		"\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d1\u02d2\u0005\n\u0000\u0000"+
		"\u02d2\u02d3\u0005^\u0000\u0000\u02d3\u02d4\u0005N\u0000\u0000\u02d4\u02d5"+
		"\u0003T*\u0000\u02d5]\u0001\u0000\u0000\u0000\u02d6\u02d7\u0005\u0003"+
		"\u0000\u0000\u02d7\u02d8\u0005^\u0000\u0000\u02d8\u02d9\u0005E\u0000\u0000"+
		"\u02d9\u02da\u0003`0\u0000\u02da\u02db\u0005F\u0000\u0000\u02db\u02dc"+
		"\u0005H\u0000\u0000\u02dc\u02dd\u0003\b\u0004\u0000\u02dd\u02e8\u0001"+
		"\u0000\u0000\u0000\u02de\u02df\u0005\u0003\u0000\u0000\u02df\u02e0\u0005"+
		"^\u0000\u0000\u02e0\u02e1\u0005E\u0000\u0000\u02e1\u02e2\u0003`0\u0000"+
		"\u02e2\u02e3\u0005F\u0000\u0000\u02e3\u02e4\u0005H\u0000\u0000\u02e4\u02e5"+
		"\u0003\b\u0004\u0000\u02e5\u02e6\u0005#\u0000\u0000\u02e6\u02e8\u0001"+
		"\u0000\u0000\u0000\u02e7\u02d6\u0001\u0000\u0000\u0000\u02e7\u02de\u0001"+
		"\u0000\u0000\u0000\u02e8_\u0001\u0000\u0000\u0000\u02e9\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ea\u02ec\u0003b1\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000"+
		"\u02eb\u02ea\u0001\u0000\u0000\u0000\u02eca\u0001\u0000\u0000\u0000\u02ed"+
		"\u02ee\u00061\uffff\uffff\u0000\u02ee\u02ef\u0003d2\u0000\u02ef\u02f5"+
		"\u0001\u0000\u0000\u0000\u02f0\u02f1\n\u0001\u0000\u0000\u02f1\u02f2\u0005"+
		"G\u0000\u0000\u02f2\u02f4\u0003d2\u0000\u02f3\u02f0\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f7\u0001\u0000\u0000\u0000\u02f5\u02f3\u0001\u0000\u0000"+
		"\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6c\u0001\u0000\u0000\u0000"+
		"\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f8\u02fd\u0003\b\u0004\u0000\u02f9"+
		"\u02fa\u0005^\u0000\u0000\u02fa\u02fb\u0005H\u0000\u0000\u02fb\u02fd\u0003"+
		"\b\u0004\u0000\u02fc\u02f8\u0001\u0000\u0000\u0000\u02fc\u02f9\u0001\u0000"+
		"\u0000\u0000\u02fde\u0001\u0000\u0000\u0000\u02fe\u02ff\u0005\u000e\u0000"+
		"\u0000\u02ff\u0300\u0005_\u0000\u0000\u0300\u0304\u0005_\u0000\u0000\u0301"+
		"\u0302\u0005\u000e\u0000\u0000\u0302\u0304\u0005_\u0000\u0000\u0303\u02fe"+
		"\u0001\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0304g\u0001"+
		"\u0000\u0000\u0000\u0305\u0306\u0003j5\u0000\u0306\u0307\u0003l6\u0000"+
		"\u0307i\u0001\u0000\u0000\u0000\u0308\u0309\u0007\u0002\u0000\u0000\u0309"+
		"k\u0001\u0000\u0000\u0000\u030a\u0315\u0003n7\u0000\u030b\u030c\u0003"+
		"n7\u0000\u030c\u030d\u0005E\u0000\u0000\u030d\u030e\u0005F\u0000\u0000"+
		"\u030e\u0315\u0001\u0000\u0000\u0000\u030f\u0310\u0003n7\u0000\u0310\u0311"+
		"\u0005E\u0000\u0000\u0311\u0312\u0003p8\u0000\u0312\u0313\u0005F\u0000"+
		"\u0000\u0313\u0315\u0001\u0000\u0000\u0000\u0314\u030a\u0001\u0000\u0000"+
		"\u0000\u0314\u030b\u0001\u0000\u0000\u0000\u0314\u030f\u0001\u0000\u0000"+
		"\u0000\u0315m\u0001\u0000\u0000\u0000\u0316\u0317\u00067\uffff\uffff\u0000"+
		"\u0317\u0318\u0003\b\u0004\u0000\u0318\u031e\u0001\u0000\u0000\u0000\u0319"+
		"\u031a\n\u0001\u0000\u0000\u031a\u031b\u0005G\u0000\u0000\u031b\u031d"+
		"\u0003\b\u0004\u0000\u031c\u0319\u0001\u0000\u0000\u0000\u031d\u0320\u0001"+
		"\u0000\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031e\u031f\u0001"+
		"\u0000\u0000\u0000\u031fo\u0001\u0000\u0000\u0000\u0320\u031e\u0001\u0000"+
		"\u0000\u0000\u0321\u0322\u00068\uffff\uffff\u0000\u0322\u0323\u0005^\u0000"+
		"\u0000\u0323\u0324\u0005N\u0000\u0000\u0324\u0325\u0003r9\u0000\u0325"+
		"\u032d\u0001\u0000\u0000\u0000\u0326\u0327\n\u0001\u0000\u0000\u0327\u0328"+
		"\u0005G\u0000\u0000\u0328\u0329\u0005^\u0000\u0000\u0329\u032a\u0005N"+
		"\u0000\u0000\u032a\u032c\u0003r9\u0000\u032b\u0326\u0001\u0000\u0000\u0000"+
		"\u032c\u032f\u0001\u0000\u0000\u0000\u032d\u032b\u0001\u0000\u0000\u0000"+
		"\u032d\u032e\u0001\u0000\u0000\u0000\u032eq\u0001\u0000\u0000\u0000\u032f"+
		"\u032d\u0001\u0000\u0000\u0000\u0330\u0337\u0005_\u0000\u0000\u0331\u0337"+
		"\u0005^\u0000\u0000\u0332\u0337\u0005[\u0000\u0000\u0333\u0337\u00058"+
		"\u0000\u0000\u0334\u0337\u00059\u0000\u0000\u0335\u0337\u0003\u0000\u0000"+
		"\u0000\u0336\u0330\u0001\u0000\u0000\u0000\u0336\u0331\u0001\u0000\u0000"+
		"\u0000\u0336\u0332\u0001\u0000\u0000\u0000\u0336\u0333\u0001\u0000\u0000"+
		"\u0000\u0336\u0334\u0001\u0000\u0000\u0000\u0336\u0335\u0001\u0000\u0000"+
		"\u0000\u0337s\u0001\u0000\u0000\u00006}\u0080\u008a\u00a3\u00a5\u00ab"+
		"\u00b2\u00cb\u00d3\u00dd\u00e8\u00f3\u0103\u010c\u0116\u0136\u0138\u013e"+
		"\u0145\u014d\u0157\u015d\u0163\u0178\u0187\u0194\u019f\u01ab\u01db\u01df"+
		"\u01e9\u022b\u025a\u025c\u0268\u0279\u0282\u028c\u029e\u02a0\u02ab\u02b0"+
		"\u02b7\u02cc\u02ce\u02e7\u02eb\u02f5\u02fc\u0303\u0314\u031e\u032d\u0336";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}