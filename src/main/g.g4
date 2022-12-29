grammar g;


input : phrase EOF| expr EOF| logic EOF;

phrase : STRING;

expr : attribute operator value|
       attribute relational_operator num|
       attribute EQ range;

range : LBRACK left = (FIELD|DIGIT) TO right = (FIELD|DIGIT) RBRACK;

logic: left  = expr logical_op  right = expr
        |expr logical_op lp expr rp
        |lp expr logical_op  expr rp logical_op expr
        |expr logical_op lp  expr logical_op expr rp ;


attribute : FIELD;
value : STRING|NUMBER|DIGIT|FIELD;

operator: EQ|NE|CONTAINS;

relational_operator: |GT|LT|GTE|LTE;

logical_op: AND|OR|NOT;
lp : LPAREN;
rp : RPAREN;
num : DIGIT | NUMBER;


DIGIT : [0-9];
NUMBER : DIGIT(DIGIT*)  ;
STRING : '"'+FIELD+'"'
          |'"'+FIELD+ WS + (FIELD)+'"' ;

EQ : '=' ;
NE : '!=';
GT : '>' ;
LT : '<' ;
GTE : '>=' ;
LTE : '<=' ;

AND : [Aa][Nn][Dd] ;
OR : [Oo][Rr] ;
NOT : [Nn][Oo][Tt] ;
TO : [Tt][Oo];
CONTAINS : [Cc][Oo][Nn][Tt][Aa][Ii][Nn][Ss];
FIELD :  [A-Za-z0-9@.*?_]+((':'|'_')[A-Za-z]*)* ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACK : '[';
RBRACK : ']';

WS : [ \t\r\n]+ -> skip;



