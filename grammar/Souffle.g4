//Adopted from original souffle lexer and grammar (bison) at:
//https://github.com/souffle-lang/souffle/tree/master/src/parser

grammar Souffle;

tokens { PREPROCESSOR_ID }

@lexer::header{
    import java.util.*;
}
@lexer::members {
Set<String> defines;
public SouffleLexer(CharStream input, Set<String> defines){
    this(input);
    this.defines = defines;
}
}


WS : [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines

//Directives
DECL: '.decl'WS;
FUNCTOR: '.functor'WS;
INPUT_DECL: '.input'WS;
OUTPUT_DECL: '.output'WS;
PRINTSIZE_DECL:'.printsize'WS;
LIMITSIZE_DECL:'.limitsize'WS;
TYPE:'.type'WS;
COMPONENT:'.comp'WS;
INSTANTIATE:'.init'WS;
NUMBER_TYPE:'.number_type'WS;
SYMBOL_TYPE:'.symbol_type'WS;
OVERRIDE:'.override'WS;
PRAGMA:'.pragma'WS;
PLAN:'.plan'WS;

//Keywords
AUTOINC:'autoinc';
BW_AND:'band';
BW_OR:'bor';
BW_XOR:'bxor';
BW_NOT:'bnot';
BW_SHIFT_L:'bshl';
BW_SHIFT_R:'bshr';
BW_SHIFT_R_UNSIGNED:'bshru';
L_AND:'land';
L_OR:'lor';
L_XOR:'lxor';
L_NOT:'lnot';
TMATCH:'match';
MEAN:'mean';
CAT:'cat';
ORD:'ord';
RANGE:'range';
STRLEN:'strlen';
SUBSTR:'substr';
STATEFUL:'stateful';
TCONTAINS:'contains';
OUTPUT_QUALIFIER:'output';
INPUT_QUALIFIER:'input';
OVERRIDABLE_QUALIFIER:'overridable';
PRINTSIZE_QUALIFIER:'printsize';
EQREL_QUALIFIER:'eqrel';
INLINE_QUALIFIER:'inline';
NO_INLINE_QUALIFIER:'no_inline';
MAGIC_QUALIFIER:'magic';
NO_MAGIC_QUALIFIER:'no_magic';
BRIE_QUALIFIER:'brie';
BTREE_DELETE_QUALIFIER:'btree_delete';
BTREE_QUALIFIER:'btree';
MIN:'min';
MAX:'max';
AS:'as';
NIL:'nil';
UNDERSCORE:'_';
COUNT:'count';
SUM:'sum';
TRUELIT:'true';
FALSELIT:'false';
TOFLOAT:'to_float';
TONUMBER:'to_number';
TOSTRING:'to_string';
TOUNSIGNED:'to_unsigned';
CHOICEDOMAIN:'choice-domain';

//Symbols
PIPE:'|';
LBRACKET:'[';
RBRACKET:']';
DOLLAR:'$';
PLUS:'+';
MINUS:'-';
LPAREN:'(';
RPAREN:')';
COMMA:',';
COLON:':';
SEMICOLON:';';
SUBTYPE:'<:';
LE:'<=';
GE:'>=';
NE:'!=';
EQUALS:'=';
EXCLAMATION:'!';
STAR:'*';
AT:'@';
SLASH:'/';
CARET:'^';
PERCENT:'%';
LBRACE:'{';
RBRACE:'}';
LT:'<';
GT:'>';
IF:':-';
DOT:'.';
NUMBER:[0-9]+'.'[0-9]+'.'[0-9]+'.'[0-9]+
        | [0-9]+
        | '0b'[0-1]+
        | '0x'HEX+
        ;
FLOAT:[0-9]+[.][0-9]+;
UNSIGNED: [0-9]+'u'
        | '0b'[0-1]+'u'
        | '0x'[a-fA-F0-9]+'u'
        ;
IDENT: [?a-zA-Z]|[_?a-zA-Z][_?a-zA-Z0-9]+ {if(defines.contains(getText())) setType(SouffleParser.PREPROCESSOR_ID);} ;
STRING: '"' (ESC | ~["\\])* '"';

fragment ESC :
'\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

COMMENT: '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN)
        ;

INCLUDE: '#include' STRING [\r\n]*-> skip;
PREPROCESSOR_PRAGMA: '#pragma' IDENT [\r\n]*-> skip;
PREPROCESSOR_DEFINE: '#define' .+? [\n\r]-> skip;
PREPROCESSOR_MULTILINE: '#define' .+? (.*? '\\')* [\n\r]-> skip;
PREPROCESSOR_MULTILINE_CONT: PREPROCESSOR_MULTILINE .*? [\n\r]+-> skip;
PREPROCESSOR: '#' .+? [\r\n]+-> skip;


program
  : unit EOF
  ;

/**
 * Top-level Program Elements
 */
unit
  :
  | unit directive_head
  | unit souffle_rule
  | unit fact
  | unit component_decl
  | unit component_init
  | unit pragma
  | unit type_decl
  | unit functor_decl
  | unit relation_decl
  ;

/**
 * A Qualified Name
 */

qualified_name
  : IDENT
  | qualified_name DOT IDENT
  | preprocessor_macro
  ;

/**
 * Type Declarations
 */
type_decl
  : TYPE IDENT SUBTYPE qualified_name
  | TYPE IDENT EQUALS union_type_list
  | TYPE IDENT EQUALS record_type_list
  | TYPE IDENT EQUALS adt_branch_list
       /* Deprecated Type Declarations */
  | NUMBER_TYPE IDENT
  | SYMBOL_TYPE IDENT
  | TYPE IDENT
  ;

/* Attribute definition of a relation */
/* specific wrapper to ensure the err msg says "expected ',' or ')'" */
record_type_list
  : LBRACKET RBRACKET
  | LBRACKET non_empty_attributes RBRACKET
  ;

/* Union type argument declarations */
union_type_list
  : qualified_name
  | union_type_list PIPE qualified_name
  ;

adt_branch_list
  : adt_branch
  | adt_branch_list PIPE adt_branch
  ;

adt_branch
  : IDENT LBRACE RBRACE
  | IDENT LBRACE non_empty_attributes RBRACE
  ;

/**
 * Relations
 */

/**
 * Relation Declaration
 */
relation_decl
  : DECL relation_names attributes_list relation_tags dependency_list
  ;

/**
 * Relation Names
 */
relation_names
  : IDENT
  | relation_names COMMA IDENT
  ;

/**
 * Attributes
 */
attributes_list
  : LPAREN RPAREN
  | LPAREN non_empty_attributes RPAREN
  ;

non_empty_attributes
  : attribute
  | non_empty_attributes COMMA attribute
  ;

attribute
  : IDENT COLON qualified_name
  ;

/**
 * Relation Tags
 */
relation_tags
  :
  | relation_tags OVERRIDABLE_QUALIFIER
  | relation_tags INLINE_QUALIFIER
  | relation_tags NO_INLINE_QUALIFIER
  | relation_tags MAGIC_QUALIFIER
  | relation_tags NO_MAGIC_QUALIFIER
  | relation_tags BRIE_QUALIFIER
  | relation_tags BTREE_QUALIFIER
  | relation_tags BTREE_DELETE_QUALIFIER
  | relation_tags EQREL_QUALIFIER
     /* Deprecated Qualifiers */
  | relation_tags OUTPUT_QUALIFIER
  | relation_tags INPUT_QUALIFIER
  | relation_tags PRINTSIZE_QUALIFIER
  ;

/**
 * Attribute Name List
 */
non_empty_attribute_names
  : IDENT
  | non_empty_attribute_names COMMA IDENT
  | preprocessor_macro
  ;

/**
 * Functional Dependency Constraint
 */
dependency
  : IDENT
  | LPAREN non_empty_attribute_names RPAREN
  ;

dependency_list_aux
  : dependency
  | dependency_list_aux COMMA dependency
  ;

dependency_list
  :
  | CHOICEDOMAIN dependency_list_aux
  ;

/**
 * Datalog Rule Structure
 */

/**
 * Fact
 */
fact
  : atom DOT
  | preprocessor_macro DOT?
  ;

/**
 * Rule
 */
souffle_rule
  : rule_def
  | rule_def query_plan
  | atom LE atom IF body DOT
  | atom LE atom IF body DOT query_plan
  ;

/**
 * Rule Definition
 */
rule_def
  : head IF body DOT
  ;

/**
 * Rule Head
 */
head
  : atom
  | head COMMA atom
  ;

/**
 * Rule Body
 */
body
  : disjunction
   ;

disjunction
  : conjunction
  | disjunction SEMICOLON conjunction
  ;

conjunction
  : term
  | conjunction COMMA term
  ;

/**
 * Terms in Rule Bodies
 */
term
  : atom
  | constraint
  | LPAREN disjunction RPAREN
  | EXCLAMATION term
  | preprocessor_macro
  ;

/**
 * Rule body atom
 */
atom
  : qualified_name LPAREN arg_list RPAREN
  ;

/**
 * Literal Constraints
 */
constraint
    /* binary infix constraints */
  : arg LT arg
  | arg GT arg
  | arg LE arg
  | arg GE arg
  | arg EQUALS arg
  | arg NE arg
  /* binary prefix constraints */
  | TMATCH LPAREN arg COMMA arg RPAREN
  | TCONTAINS LPAREN arg COMMA arg RPAREN
  /* zero-arity constraints */
  | TRUELIT
  | FALSELIT
  | preprocessor_macro
   ;

/**
 * Argument List
 */
arg_list
  :
  | non_empty_arg_list
  ;

non_empty_arg_list
  : arg
  | non_empty_arg_list COMMA arg
  ;

/**
 * Atom argument
 */
arg
  : STRING
  | FLOAT
  | UNSIGNED
  | NUMBER
  | UNDERSCORE
  | DOLLAR
  | AUTOINC LPAREN RPAREN
  | IDENT
  | NIL
  | LBRACKET arg_list RBRACKET
  | DOLLAR qualified_name LPAREN arg_list RPAREN
  | LPAREN arg RPAREN
  | AS LPAREN arg COMMA qualified_name RPAREN
  | AT IDENT LPAREN arg_list RPAREN
  | functor_built_in LPAREN arg_list RPAREN
   /* some aggregates have the same name as functors */
  | aggregate_func LPAREN arg COMMA non_empty_arg_list RPAREN
   /* -- intrinsic functor -- */
   /* unary functors */
  | MINUS arg
  | BW_NOT  arg
  | L_NOT arg
  /* binary infix functors */
  | arg PLUS arg
  | arg MINUS arg
  | arg STAR arg
  | arg SLASH arg
  | arg PERCENT arg
  | arg CARET arg
  | arg L_AND arg
  | arg L_OR arg
  | arg L_XOR arg
  | arg BW_AND arg
  | arg BW_OR arg
  | arg BW_XOR arg
  | arg BW_SHIFT_L arg
  | arg BW_SHIFT_R arg
  | arg BW_SHIFT_R_UNSIGNED arg
    /* -- aggregators -- */
  | aggregate_func arg_list COLON aggregate_body
  | preprocessor_macro
  ;

functor_built_in
  : CAT
  | ORD
  | RANGE
  | STRLEN
  | SUBSTR
  | TOFLOAT
  | TONUMBER
  | TOSTRING
  | TOUNSIGNED
  ;

aggregate_func
  : COUNT
  | MAX
  | MEAN
  | MIN
  | SUM
  ;

aggregate_body
  : LBRACE body RBRACE
  | atom
  ;

/**
 * Query Plan
 */
query_plan
  : PLAN query_plan_list
  ;

query_plan_list
  : NUMBER COLON plan_order
  | query_plan_list COMMA NUMBER COLON plan_order
  ;

plan_order
  : LPAREN RPAREN
  | LPAREN non_empty_plan_order_list RPAREN
  ;

non_empty_plan_order_list
  : NUMBER
  | non_empty_plan_order_list COMMA NUMBER
  ;

/**
 * Components
 */

/**
 * Component Declaration
 */
component_decl
  : component_head LBRACE component_body RBRACE
  ;

/**
 * Component Head
 */
component_head
  : COMPONENT component_type
  | component_head COLON component_type
  | component_head COMMA component_type
  ;

/**
 * Component Type
 */
component_type
  : IDENT component_type_params
  | PREPROCESSOR_ID component_type_params
  ;

/**
 * Component Parameters
 */
component_type_params
  :
  | LT component_param_list GT
  ;

/**
 * Component Parameter List
 */
component_param_list
  : IDENT
  | component_param_list COMMA IDENT
  | preprocessor_macro
  ;

/**
 * Component body
 */
component_body
  :
  | component_body directive_head
  | component_body souffle_rule
  | component_body fact
  | component_body OVERRIDE IDENT
  | component_body component_init
  | component_body component_decl
  | component_body type_decl
  | component_body relation_decl
  ;

/**
 * Component Initialisation
 */
component_init
  : INSTANTIATE IDENT EQUALS component_type
  ;

/**
 * User-Defined Functors
 */

/**
 * Functor declaration
 */
functor_decl
  : FUNCTOR IDENT LPAREN functor_arg_type_list RPAREN COLON qualified_name
  | FUNCTOR IDENT LPAREN functor_arg_type_list RPAREN COLON qualified_name STATEFUL
  ;

/**
 * Functor argument list type
 */
functor_arg_type_list
  :
  | non_empty_functor_arg_type_list
  ;

non_empty_functor_arg_type_list
  : functor_attribute
  | non_empty_functor_arg_type_list COMMA functor_attribute
  ;

functor_attribute
  : qualified_name
  | IDENT COLON qualified_name
  ;

/**
 * Other Directives
 */

/**
 * Pragma Directives
 */
pragma
  : PRAGMA STRING STRING
  | PRAGMA STRING
  ;

/**
 * Directives
 */
directive_head
  : directive_head_decl directive_list
  ;

directive_head_decl
  : INPUT_DECL
  | OUTPUT_DECL
  | PRINTSIZE_DECL
  | LIMITSIZE_DECL
  ;

/**
 * Directive List
 */
directive_list
  : relation_directive_list
  | relation_directive_list LPAREN RPAREN
  | relation_directive_list LPAREN non_empty_key_value_pairs RPAREN
  ;

/**
 * Directive List
 */
relation_directive_list
  : qualified_name
  | relation_directive_list COMMA qualified_name
  ;

/**
 * Key-value Pairs
 */
non_empty_key_value_pairs
  : IDENT EQUALS kvp_value
  | non_empty_key_value_pairs COMMA IDENT EQUALS kvp_value
  ;

kvp_value
  : STRING
  | IDENT
  | NUMBER
  | TRUELIT
  | FALSELIT
  | preprocessor_macro
  ;
preprocessor_macro: PREPROCESSOR_ID
                   | PREPROCESSOR_ID LPAREN macro_args RPAREN;

macro_args:
            | non_empty_macro_args;

non_empty_macro_args: macro_arg
                    | non_empty_macro_args COMMA macro_arg;

macro_arg:   STRING
             | FLOAT
             | UNSIGNED
             | NUMBER
             | UNDERSCORE
             | DOLLAR
             | AUTOINC LPAREN RPAREN
             | IDENT
             | NIL
             | LBRACKET macro_args RBRACKET
             | DOLLAR qualified_name LPAREN macro_args RPAREN
             | LPAREN macro_args RPAREN
             | AS LPAREN macro_arg COMMA qualified_name RPAREN
             | AT IDENT LPAREN macro_args RPAREN
             | functor_built_in LPAREN macro_args RPAREN
              /* some aggregates have the same name as functors */
             | aggregate_func LPAREN macro_arg COMMA non_empty_arg_list RPAREN
              /* -- intrinsic functor -- */
              /* unary functors */
             | MINUS macro_arg
             | BW_NOT  macro_arg
             | L_NOT macro_arg
             | EXCLAMATION macro_arg
             | IDENT DOT macro_arg
             | AT IDENT
             | macro_arg SEMICOLON macro_arg
             | macro_arg LT macro_arg
             | macro_arg GT macro_arg
             | macro_arg LE macro_arg
             | macro_arg GE macro_arg
             | macro_arg EQUALS macro_arg
             | macro_arg NE macro_arg
             /* binary prefix constraints */
             | TMATCH LPAREN macro_arg COMMA macro_arg RPAREN
             | TCONTAINS LPAREN macro_arg COMMA macro_arg RPAREN
             /* zero-arity constraints */
             | TRUELIT
             | FALSELIT
             | EQUALS
             | LE
             | GE
             | LT
             | GT
             | NE
             /* binary infix functors */
             | macro_arg PLUS macro_arg
             | macro_arg MINUS macro_arg
             | macro_arg STAR macro_arg
             | macro_arg SLASH macro_arg
             | macro_arg PERCENT macro_arg
             | macro_arg CARET macro_arg
             | macro_arg L_AND macro_arg
             | macro_arg L_OR macro_arg
             | macro_arg L_XOR macro_arg
             | macro_arg BW_AND macro_arg
             | macro_arg BW_OR macro_arg
             | macro_arg BW_XOR macro_arg
             | macro_arg BW_SHIFT_L macro_arg
             | macro_arg BW_SHIFT_R macro_arg
             | macro_arg BW_SHIFT_R_UNSIGNED macro_arg
               /* -- aggregators -- */
             | aggregate_func macro_args COLON aggregate_body
             | IDENT LPAREN macro_args RPAREN
             | preprocessor_macro;