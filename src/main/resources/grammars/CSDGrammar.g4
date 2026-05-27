grammar CSDGrammar;

/*
 * CICS System Definition (DFHCSDUP) language.
 * Covers DEFINE for PROGRAM/TRANSACTION/MAPSET/FILE/LIBRARY/TYPETERM/TDQUEUE/TSMODEL
 * plus their attribute pairs of the form `KEY(VALUE)`.
 *
 * No continuation handling needed — CSD DEFINE statements are typically all on
 * one line per resource in CardDemo, though grammar accepts a `terminator` for
 * dialects that use `.` to end a definition.
 */

csdFile     : (defineStmt | NL)* EOF ;

defineStmt  : DEFINE resourceType LPAREN NAME RPAREN attrPair* terminator? NL? ;

resourceType : 'PROGRAM' | 'TRANSACTION' | 'MAPSET' | 'FILE' | 'LIBRARY'
             | 'TYPETERM' | 'TDQUEUE' | 'TSMODEL' | 'JOURNALMODEL' | 'PROFILE'
             | 'LSRPOOL'  | 'CONNECTION' | 'SESSIONS' | 'PARTITIONSET'
             | 'PARTNER'  | 'REQUESTMODEL' | 'TCPIPSERVICE' | 'PIPELINE'
             | 'URIMAP'   | 'DOCTEMPLATE' | 'PROCESSTYPE'
             ;

attrPair    : NAME LPAREN value? RPAREN ;

// Permissive value: any sequence of tokens until matching ')'.
// Lets us swallow dates like 22/05/13 12:56:44, paths, version strings, etc.
value       : valueToken+ ;
valueToken  : NAME | NUMBER | STRING | DOT | SLASH | COLON | COMMA | DASH ;

terminator  : DOT ;

// --- Lexer ---
DEFINE      : 'DEFINE' ;

LPAREN      : '(' ;
RPAREN      : ')' ;
DOT         : '.' ;
COMMA       : ',' ;
SLASH       : '/' ;
COLON       : ':' ;
DASH        : '-' ;

NAME        : [A-Za-z_$] [A-Za-z0-9_$#@]* ;
NUMBER      : [0-9]+ ;
STRING      : '\'' ( ~['\r\n] | '\'\'' )* '\'' ;

COMMENT_AST : '*' ~[\r\n]* -> skip ;
COMMENT_SL  : '//*' ~[\r\n]* -> skip ;
WS          : [ \t]+ -> skip ;
NL          : ('\r'? '\n')+ ;
ANY         : . -> skip ;
