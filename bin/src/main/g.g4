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
value : STRING|NUMBER|DIGIT;

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

AND : [A][N][D] ;
OR : [O][R] ;
NOT : [N][O][T] ;
TO : [Tt][Oo];
CONTAINS : [Cc][Oo][Nn][Tt][Aa][Ii][Nn][Ss];
FIELD :  [A-Za-z0-9@.*?_]+((':'|'_')[A-Za-z]*)* ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACK : '[';
RBRACK : ']';

WS : [ \t\r\n]+ -> skip;




//message: index_cmd
//        | document_cmd EOF;

//index_cmd : index attribute index_pointer index_name
//            |index index_name
//            EOF;
//
//index : DELETE
//        |PUT;
//
//document_cmd :  action attribute pointer index_name condition  EOF;
//action:
//    GET
//    |POST
//    |UPDATE
//    |DELETE;
//
//attribute :
//          |DOC
//          |STRING;
//
//index_pointer : INTO;
//
//pointer: FROM;
//
//
//index_name : WORD;
//
//condition: |WHERE compare logic_op;
//
//compare: left roperator right
//         |left in  message  ;
//
//left : WORD;
//
//right : STRING|NUMBER;
//
//roperator : NE|GT|LT|GTE|LTE|CHECK_EQ;
//
//in: IN ;
//
//logic_op : |LOGIC_OP compare;
//
//lp : LPAREN;
//rp : RPAREN;
//
//
//
//SUBJECT1: 'JOHN' ;
//SUBJECT2: 'JUDY';
//OBJECT:'ANTLER' | 'DESIGNING';
//OBECT2: 'DESIGNING';
//
//CREATE : [Cc][Rr][Ee][Aa][Tt][Ee];
//SELECT : [Ss][Ee][Ll][Ee][Cc][Tt] ;
//GET : [Gg][Ee][Tt];
//POST : [Pp][Oo][Ss][Tt];
//PUT : [Pp][Uu][Tt];
//DELETE : [Dd][Ee][Ll][Ee][Tt][Ee];
//UPDATE : [Uu][Pp][Dd][Aa][Tt][Ee];
//FROM : [Ff][Rr][Oo][Mm];
//INTO : [Ii][Nn][Tt][Oo];
//WHERE : [Ww][Hh][Ee][Rr][Ee] ;
//DOC: [Dd][Oo][Cc];
//LOGIC_OP : AND|OR|NOT;
//AND : [Aa][Nn][Dd] ;
//OR : [Oo][Rr] ;
//NOT : [Nn][Oo][Tt] ;
//DESCRIBE : [Dd][Ee][Ss][Cc][Rr][Ii][Bb][Ee] ;
//MATCHES : [Mm][Aa][Tt][Cc][Hh][Ee][Ss] ;
//BETWEEN : [Bb][Ee][Tt][Ww][Ee][Ee][Nn] ;
//LIKE : [Ll][Ii][Kk][Ee] ;
//LIMIT : [Ll][Ii][Mm][Ii][Tt] ;
//
//

//IN : [Ii][Nn];
//SPLAT : '*';

//DIGIT : [0-9] ;
//NUMBER : DIGIT(DIGIT*) ;

//DATE_SEP : [-/] ;
//DATE : (NUMBER+(DATE_SEP)?)+;
//
//STRING : '"'+WORD+'"' ;
//WORD : [A-Za-z]+((':'|'_')[0-9]*[A-Za-z]*)* ;
//PATH : '\''([A-Za-z]':')?('/')?((~[/])+'/')+ '\'';
//TERM : '\''(~[' *?])*'\'' ;
//PHRASE : '\''(~['*?])*'\'' ;
//WILD_CARD :'\''(~[' ])*'\'' ;
//MULTI_PHRASE : '\''(~[' *?])+(~['])+'\'';
//DB_QUOTE_STRING_LIT : ('"'(~["])*);
//
//COMMA : ',' ;
//LPAREN : '(' ;
//RPAREN : ')' ;
//
//WS : [ \t\r\n]+ -> skip;