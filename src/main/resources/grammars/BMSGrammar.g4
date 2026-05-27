grammar BMSGrammar;

/*
 * BMS map definitions — DFHMSD (mapset), DFHMDI (map), DFHMDF (field).
 *
 * Like JCL, BMS uses continuation lines: a card ending with a comma plus an
 * 'X' in column 72 continues on the next card.  A Java-side preprocessor joins
 * those into single logical cards before this grammar runs.
 *
 * Card shape:  [LABEL] DFHxxx param=value, param=value, ...
 */

mapset      : (card | NL)* EOF ;

card        : NAME? DFH_MACRO paramList? NL? ;

paramList   : param (COMMA param)* ;

param       : NAME (EQUALS paramValue)? ;

paramValue  : LPAREN paramValue (COMMA paramValue)* RPAREN
            | NAME
            | NUMBER
            | STRING
            ;

// --- Lexer ---
DFH_MACRO   : 'DFHMSD' | 'DFHMDI' | 'DFHMDF' ;

COMMA       : ',' ;
EQUALS      : '=' ;
LPAREN      : '(' ;
RPAREN      : ')' ;

NAME        : [A-Za-z_] [A-Za-z0-9_$#@-]* ;
NUMBER      : '-'? [0-9]+ ;
STRING      : '\'' ( ~['\r\n] )* '\'' ;

COMMENT     : '*' ~[\r\n]* -> skip ;
WS          : [ \t]+ -> skip ;
NL          : ('\r'? '\n')+ ;
ANY         : . -> skip ;
