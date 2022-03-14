grammar Souffle;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
//Directives
DECL: '.decl';
FUNCTOR: '.functor';
INPUT_DECL: '.input';
OUTPUT_DECL: '.output';
PRINTSIZE_DECL:'.printsize';
LIMITSIZE_DECL:'.limitsize';
TYPE:'.type';
COMPONENT:'.comp';
INSTANSIATE:'.init';
NUMBER_TYPE:'.number_type';
SYMBOL_TYPE:'.symbol_type';
OVERRIDE:'.override';
PRAGMA:'.pragma';
PLAN:'.plan';

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
TRUE:'true';
FALSE:'false';
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
DOT:'.';
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
NUMBER:[0-9]+'.'[0-9]+'.'[0-9]+'.'[0-9]+
        | [0-9]+
        | '0b'[0-1]+
        | '0x'[a-fA-F0-9]+
        ;
FLOAT:[0-9]+[.][0-9]+;
UNSIGNED: [0-9]+'u'
        | '0b'[0-1]+'u'
        | '0x'[a-fA-F0-9]+'u'
        ;
IDENT: [?a-zA-Z]|[_?a-zA-Z][_?a-zA-Z0-9]+;
STRING: '"' (ESC | ~["\\])* '"';
fragment ESC :
'\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

COMMENT: '/*' .*? '*/'
        | '//' ~[\r\n]*
        ;
END: EOF;
