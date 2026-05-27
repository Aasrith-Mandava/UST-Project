grammar JCLGrammar;

/*
 * JCL grammar — sufficient for graph extraction from CardDemo corpus.
 *
 * Two-pass approach: a Java-side preprocessor joins continuation lines
 * (lines whose previous card ended with comma, plus the `//   continued` lines
 * that follow) into single logical cards before this grammar sees them.
 * That keeps the grammar tractable.  This grammar therefore consumes one
 * logical card per line.
 *
 * Card shape:  // [NAME] OP [paramList]
 *   where OP is JOB | EXEC | DD | PROC | PEND | SET | INCLUDE | IF | ELSE | ENDIF
 */

jclFile     : (card | NL)* EOF ;

card        : SLASHSLASH NAME? OP paramList? NL? ;

paramList   : param (COMMA param)* ;

param       : NAME (EQUALS paramValue)?         # kvParam
            | paramValue                         # positionalParam
            ;

paramValue  : LPAREN paramValue (COMMA paramValue)* RPAREN
            | NAME (DOT NAME)*
            | NUMBER
            | STRING
            | AMP NAME
            ;

// --- Lexer ---
// OP keywords must precede generic NAME so the lexer prefers them.
OP          : 'JOB' | 'EXEC' | 'DD' | 'PROC' | 'PEND' | 'SET' | 'INCLUDE'
            | 'IF' | 'ELSE' | 'ENDIF' ;

SLASHSLASH  : '//' ;
COMMA       : ',' ;
EQUALS      : '=' ;
LPAREN      : '(' ;
RPAREN      : ')' ;
DOT         : '.' ;
AMP         : '&' ;

NAME        : [A-Za-z@#$] [A-Za-z0-9@#$_-]* ;
NUMBER      : [0-9]+ ;
STRING      : '\'' ( ~['\r\n] | '\'\'' )* '\'' ;

COMMENT     : '//*' ~[\r\n]* -> skip ;
WS          : [ \t]+ -> skip ;
NL          : ('\r'? '\n')+ ;
ANY         : . -> skip ;
