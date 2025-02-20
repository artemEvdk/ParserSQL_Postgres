grammar PostgreSQL;

parse
    : sql_script EOF
    ;

sql_script
    : statement*
    ;

statement
    : select_statement SEMI?
    ;

select_statement
    : SELECT select_list
      FROM table_expression
      (WHERE condition)?
      (GROUP BY group_by_expression (',' group_by_expression)* )?
      (HAVING having_condition)?
      (ORDER BY order_by_expression (',' order_by_expression)* )?
      (LIMIT INTEGER)?
      (OFFSET INTEGER)?
      SEMI?
    ;

select_list
    : DISTINCT? (select_item (',' select_item)* | '*')
    ;

select_item
    : expression (AS? alias)?
    | aggregate_function (AS? alias)?
    ;

aggregate_function
    : COUNT '(' '*' ')'
    | COUNT '(' expression ')'
    | MAX '(' expression ')'
    | MIN '(' expression ')'
    | AVG '(' expression ')'
    | SUM '(' expression ')'
    ;

expression
    : logical_or_expression
    | aggregate_function
    ;

logical_or_expression
    : logical_and_expression (OR logical_and_expression)*
    ;

logical_and_expression
    : comparison_expression (AND comparison_expression)*
    ;

comparison_expression
    : term ( ( EQ | NE | GT | LT | GTE | LTE ) term )?
    ;

term
    : factor ( ( PLUS | MINUS ) factor )*
    ;

factor
    : ( PLUS | MINUS ) factor
    | power
    | function_call
    ;

power
    : atom (POWER factor)?
    ;

atom
    : literal
    | column_ref
    | function_call
    | '(' expression ')'
    ;

function_call
    : (ID | QUOTED_ID) '(' ( expression ( ',' expression )* )? ')'
    ;

condition
    : expression
    ;

group_by_expression
    : expression
    ;

having_condition
    : expression
    ;

order_by_expression
    : expression ( ASC | DESC )?
    ;

table_expression
    : table_reference
    ;

table_reference
    : table_primary (join_clause)*
    ;

table_primary
    : table_name (AS? alias)?
    | '(' select_statement ')' (AS? alias)?
    ;

join_clause
    : (join_type)? JOIN table_primary join_spec?
    | ',' table_primary
    ;

join_type
    : INNER
    | ( LEFT | RIGHT | FULL ) OUTER?
    | CROSS
    | NATURAL
    ;

join_spec
    : ON condition
    | USING '(' column_list ')'
    ;

column_list
    : column_name (',' column_name)*
    ;

column_name
    : ID | QUOTED_ID
    ;

alias
    : ID | QUOTED_ID
    ;

table_name
    : (ID | QUOTED_ID) ( '.' (ID | QUOTED_ID) )?
    ;

column_ref
    : (ID | QUOTED_ID) ( '.' (ID | QUOTED_ID) )?
    ;

literal
    : STRING
    | INTEGER
    | FLOAT
    | NULL
    | TRUE
    | FALSE
    ;

// Lexer Rules
SELECT : 'SELECT';
FROM : 'FROM';
WHERE : 'WHERE';
GROUP : 'GROUP';
BY : 'BY';
HAVING : 'HAVING';
ORDER : 'ORDER';
ASC : 'ASC';
DESC : 'DESC';
LIMIT : 'LIMIT';
OFFSET : 'OFFSET';
DISTINCT : 'DISTINCT';
COUNT : 'COUNT';
MAX : 'MAX';
MIN : 'MIN';
AVG : 'AVG';
SUM : 'SUM';
AS : 'AS';
NULL : 'NULL';
TRUE : 'TRUE';
FALSE : 'FALSE';
OR : 'OR';
AND : 'AND';
JOIN : 'JOIN';
INNER : 'INNER';
LEFT : 'LEFT';
RIGHT : 'RIGHT';
FULL : 'FULL';
OUTER : 'OUTER';
CROSS : 'CROSS';
NATURAL : 'NATURAL';
ON : 'ON';
USING : 'USING';
GT : '>';
LT : '<';
GTE : '>=';
LTE : '<=';
NE : '<>';
EQ : '=';
PLUS : '+';
MINUS : '-';
ASTERISK : '*';
SLASH : '/';
POWER : '^';
LPAREN : '(';
RPAREN : ')';
COMMA : ',';
SEMI : ';';
STRING : '\'' (~'\'' | '\'\'')* '\'';
INTEGER : [0-9]+;
FLOAT : [0-9]+ '.' [0-9]*;
ID : [a-z_][a-z_0-9]*;
QUOTED_ID : '"' ( ~'"' | '""' )* '"';
WS : [ \t\r\n]+ -> skip;