grammar Preprocessor;


NEW_LINE: [\n\r];
WS : [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines
INCLUDE: '#include';
DEFINE: '#define';
IF_PRE: '#if';
ELSE: '#else';
IFNDEF: '#ifndef';
IFDEF: '#ifdef';
ENDIF : '#endif' ;

MACRO_BODY: (BACKSLASH .+? NEW_LINE)+ .? NEW_LINE;
LPAREN:'(';
RPAREN:')';
BACKSLASH : '\\';
IDENT: [?a-zA-Z]|[_?a-zA-Z][_?a-zA-Z0-9]+;

DECL: '.decl'WS -> skip;
FUNCTOR: '.functor'WS-> skip;
INPUT_DECL: '.input'WS-> skip;
OUTPUT_DECL: '.output'WS-> skip;
PRINTSIZE_DECL:'.printsize'WS -> skip;
LIMITSIZE_DECL:'.limitsize'WS -> skip;
TYPE:'.type'WS -> skip;
COMPONENT:'.comp'WS -> skip;
INSTANTIATE:'.init'WS-> skip;
NUMBER_TYPE:'.number_type'WS-> skip;
SYMBOL_TYPE:'.symbol_type'WS-> skip;
OVERRIDE:'.override'WS-> skip;
PRAGMA:'.pragma'WS-> skip;
PLAN:'.plan'WS-> skip;

PIPE:'|' -> skip;
LBRACKET:'[' -> skip;
RBRACKET:']' -> skip;
DOLLAR:'$' -> skip;
PLUS:'+' -> skip;
MINUS:'-' -> skip;
COMMA:',';
COLON:':' -> skip;
SEMICOLON:';' -> skip;
SUBTYPE:'<:' -> skip;
LE:'<=' -> skip;
GE:'>=' -> skip;
NE:'!=' -> skip;
EQUALS:'=' -> skip;
EXCLAMATION:'!' -> skip;
STAR:'*' -> skip;
AT:'@' -> skip;
SLASH:'/' -> skip;
CARET:'^' -> skip;
PERCENT:'%' -> skip;
LBRACE:'{' -> skip;
RBRACE:'}' -> skip;
LT:'<' -> skip;
GT:'>' -> skip;
IF:':-' -> skip;
DOT:'.' -> skip;
NUMBER: ([0-9]+'.'[0-9]+'.'[0-9]+'.'[0-9]+
        | [0-9]+
        | '0b'[0-1]+
        | '0x'HEX+);

FLOAT:[0-9]+[.][0-9]+;
UNSIGNED:([0-9]+'u'
        | '0b'[0-1]+'u'
        | '0x'[a-fA-F0-9]+'u') -> skip;


//Keywords
AUTOINC:'autoinc'-> skip;
BW_AND:'band'-> skip;
BW_OR:'bor'-> skip;
BW_XOR:'bxor'-> skip;
BW_NOT:'bnot'-> skip;
BW_SHIFT_L:'bshl'-> skip;
BW_SHIFT_R:'bshr'-> skip;
BW_SHIFT_R_UNSIGNED:'bshru'-> skip;
L_AND:'land'-> skip;
L_OR:'lor'-> skip;
L_XOR:'lxor'-> skip;
L_NOT:'lnot'-> skip;
TMATCH:'match'-> skip;
MEAN:'mean'-> skip;
CAT:'cat'-> skip;
ORD:'ord'-> skip;
RANGE:'range'-> skip;
STRLEN:'strlen'-> skip;
SUBSTR:'substr'-> skip;
STATEFUL:'stateful'-> skip;
TCONTAINS:'contains'-> skip;
OUTPUT_QUALIFIER:'output'-> skip;
INPUT_QUALIFIER:'input'-> skip;
OVERRIDABLE_QUALIFIER:'overridable'-> skip;
PRINTSIZE_QUALIFIER:'printsize'-> skip;
EQREL_QUALIFIER:'eqrel'-> skip;
INLINE_QUALIFIER:'inline'-> skip;
NO_INLINE_QUALIFIER:'no_inline'-> skip;
MAGIC_QUALIFIER:'magic'-> skip;
NO_MAGIC_QUALIFIER:'no_magic'-> skip;
BRIE_QUALIFIER:'brie'-> skip;
BTREE_DELETE_QUALIFIER:'btree_delete'-> skip;
BTREE_QUALIFIER:'btree'-> skip;
MIN:'min'-> skip;
MAX:'max'-> skip;
AS:'as'-> skip;
NIL:'nil'-> skip;
UNDERSCORE:'_'-> skip;
COUNT:'count'-> skip;
SUM:'sum'-> skip;
TRUELIT:'true'-> skip;
FALSELIT:'false'-> skip;
TOFLOAT:'to_float'-> skip;
TONUMBER:'to_number'-> skip;
TOSTRING:'to_string'-> skip;
TOUNSIGNED:'to_unsigned'-> skip;
CHOICEDOMAIN:'choice-domain'-> skip;
STRING: '"' (ESC | ~["\\])* '"';

fragment ESC :
'\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
ANY_TEXT: .+?;

//
//DIRECTIVE: '#'INCLUDE
//
//
//directive:

program: program_text EOF;
program_text:
             |(IDENT
             |LPAREN
             |RPAREN
             |STRING
             |COLON
             |SEMICOLON
             |COMMA
             |DOT
             |UNDERSCORE
             |LBRACE
             |RBRACE
             |LE
             |GE
             |TRUELIT
             |FALSELIT
             |NUMBER
             |UNSIGNED
             |FLOAT
             |LT
             |GT
             |EQUALS
             |PLUS
             |MINUS
             |AT
             |DOLLAR
             |RBRACKET
             |LBRACKET
             |STAR
             |EXCLAMATION
             |PERCENT
             |SLASH
             |CARET
             |NEW_LINE
             |non_empty_directive_list)+;

//
//directive_list:
//                | non_empty_directive_list;

non_empty_directive_list: define_directive+
                        | include_directive+
                        | ifdef_directive+;

ifdef_directive: IFNDEF IDENT program_text ENDIF
                | IFDEF IDENT program_text ENDIF
                | IF_PRE IDENT program_text ENDIF
                | ELSE program_text ENDIF;


include_directive: INCLUDE STRING NEW_LINE*;

define_directive : DEFINE macro_def NEW_LINE*;

macro_def: IDENT LPAREN RPAREN macro_body
         | IDENT LPAREN macro_args RPAREN macro_body
         | IDENT (NUMBER | IDENT | STRING | FLOAT);

macro_body : MACRO_BODY
            |(IDENT
            |LPAREN
            |RPAREN
            |STRING
            |COLON
            |SEMICOLON
            |COMMA
            |DOT
            |UNDERSCORE
            |LBRACE
            |RBRACE
            |LE
            |GE
            |TRUELIT
            |FALSELIT
            |NUMBER
            |UNSIGNED
            |FLOAT
            |LT
            |GT
            |EQUALS
            |PLUS
            |MINUS
            |AT
            |DOLLAR
            |RBRACKET
            |LBRACKET
            |STAR
            |EXCLAMATION
            |PERCENT
            |SLASH
            |CARET)+ NEW_LINE;

//macro_body: .+? NEW_LINE
//           | BACKSLASH macro_body;



macro_args: IDENT
          | macro_args COMMA IDENT;

//          | INCLUDE;

