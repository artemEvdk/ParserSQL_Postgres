grammar PostgreSQL;

/*
это граматика для ANTLR.
ANTLR в будущем сгенерит парсер и лексер для дальнейшей разроботки
*/

parse
    : sql_script EOF
    ;

sql_script
    : (sql_statement SEMI?)*
    ;

sql_statement
    : ddl_statement
    | dml_statement
    | transaction_statement
    | other_statement
    ;

ddl_statement
    : create_table_statement
    | alter_table_statement
    | drop_table_statement
    ;

dml_statement
    : select_statement
    | insert_statement
    | update_statement
    | delete_statement
    ;

transaction_statement
    : start_transaction
    | commit_transaction
    | rollback_transaction
    ;

other_statement
    : vacuum_statement
    | analyze_statement
    ;

// DDL Statements
create_table_statement
    : CREATE TABLE table_name LPAREN column_def (COMMA column_def)* RPAREN
    ;

alter_table_statement
    : ALTER TABLE table_name alter_table_action
    ;

drop_table_statement
    : DROP TABLE table_name
    ;

alter_table_action
    : ADD COLUMN column_def
    | DROP COLUMN column_name
    | ALTER COLUMN column_name SET DATA TYPE data_type
    ;

column_def
    : column_name data_type column_constraint*
    ;

column_constraint
    : NOT NULL
    | PRIMARY KEY
    | UNIQUE
    | DEFAULT default_value
    | CHECK LPAREN expression RPAREN
    | REFERENCES table_name LPAREN column_name RPAREN
    ;

data_type
    : INT
    | BIGINT
    | VARCHAR LPAREN INT_LITERAL RPAREN
    | TEXT
    | BOOLEAN
    | TIMESTAMP
    | DATE
    | TIME
    | INTERVAL
    | JSONB
    | other_data_type
    ;

other_data_type
    : IDENTIFIER
    ;

default_value
    : literal
    | CURRENT_TIMESTAMP
    | NOW
    ;

// DML Statements
select_statement
    : SELECT select_list FROM table_expression (WHERE search_condition)? (GROUP BY column_list)? (HAVING search_condition)? (ORDER BY ordering_term_list)? (LIMIT INT_LITERAL)? (OFFSET INT_LITERAL)?
    ;

insert_statement
    : INSERT INTO table_name (LPAREN column_list RPAREN)? VALUES LPAREN value_list RPAREN
    ;

update_statement
    : UPDATE table_name SET update_assignment_list (WHERE search_condition)?
    ;

delete_statement
    : DELETE FROM table_name (WHERE search_condition)?
    ;

select_list
    : ASTERISK
    | select_sublist (COMMA select_sublist)*
    ;

select_sublist
    : expression (AS? column_alias)?
    ;

table_expression
    : table_name (AS? table_alias)?
    | LPAREN select_statement RPAREN AS? table_alias
    | table_expression join_type JOIN table_expression ON search_condition
    ;

join_type
    : INNER
    | LEFT OUTER?
    | RIGHT OUTER?
    | FULL OUTER?
    ;

search_condition
    : expression
    ;

ordering_term_list
    : ordering_term (COMMA ordering_term)*
    ;

ordering_term
    : expression (ASC | DESC)?
    ;

update_assignment_list
    : update_assignment (COMMA update_assignment)*
    ;

update_assignment
    : column_name EQUALS expression
    ;

value_list
    : literal (COMMA literal)*
    ;

column_list
    : column_name (COMMA column_name)*
    ;


start_transaction
    : BEGIN
    | START TRANSACTION
    ;

commit_transaction
    : COMMIT
    | END
    ;

rollback_transaction
    : ROLLBACK
    ;


vacuum_statement
    : VACUUM (table_name)?
    ;

analyze_statement
    : ANALYZE (table_name)?
    ;


expression
    : literal
    | column_name
    | function_call
    | LPAREN expression RPAREN
    | expression binary_operator expression
    | unary_operator expression
    | CASE case_expression (WHEN expression THEN expression)+ (ELSE expression)? END
    ;

case_expression
    : expression
    ;

function_call
    : function_name LPAREN (expression (COMMA expression)*)? RPAREN
    ;

binary_operator
    : PLUS | MINUS | ASTERISK | SLASH | EQUALS | NOT_EQUALS | GREATER_THAN | LESS_THAN | GREATER_THAN_EQUALS | LESS_THAN_EQUALS | AND | OR
    ;

unary_operator
    : PLUS | MINUS | NOT
    ;


literal
    : INT_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    | TRUE
    | FALSE
    | NULL
    ;


table_name
    : IDENTIFIER
    ;

column_name
    : IDENTIFIER
    ;

table_alias
    : IDENTIFIER
    ;

column_alias
    : IDENTIFIER
    ;

function_name
    : IDENTIFIER
    ;


IDENTIFIER
    : [a-zA-Z_] [a-zA-Z_0-9]*
    ;

INT_LITERAL
    : [0-9]+
    ;

FLOAT_LITERAL
    : [0-9]+ '.' [0-9]*
    | '.' [0-9]+
    ;

STRING_LITERAL
    : '\'' (~'\'' | '\'\'')* '\''
    ;

SEMI
    : ';'
    ;

WS
    : [ \t\r\n]+ -> skip
    ;


CREATE
    : 'CREATE'
    ;

TABLE
    : 'TABLE'
    ;

ALTER
    : 'ALTER'
    ;

DROP
    : 'DROP'
    ;

ADD
    : 'ADD'
    ;

COLUMN
    : 'COLUMN'
    ;

SET
    : 'SET'
    ;

DATA
    : 'DATA'
    ;

TYPE
    : 'TYPE'
    ;

NOT
    : 'NOT'
    ;

NULL
    : 'NULL'
    ;

PRIMARY
    : 'PRIMARY'
    ;

KEY
    : 'KEY'
    ;

UNIQUE
    : 'UNIQUE'
    ;

DEFAULT
    : 'DEFAULT'
    ;

CHECK
    : 'CHECK'
    ;

REFERENCES
    : 'REFERENCES'
    ;

INSERT
    : 'INSERT'
    ;

INTO
    : 'INTO'
    ;

VALUES
    : 'VALUES'
    ;

SELECT
    : 'SELECT'
    ;

FROM
    : 'FROM'
    ;

WHERE
    : 'WHERE'
    ;

GROUP
    : 'GROUP'
    ;

BY
    : 'BY'
    ;

HAVING
    : 'HAVING'
    ;

ORDER
    : 'ORDER'
    ;

ASC
    : 'ASC'
    ;

DESC
    : 'DESC'
    ;

LIMIT
    : 'LIMIT'
    ;

OFFSET
    : 'OFFSET'
    ;

UPDATE
    : 'UPDATE'
    ;

DELETE
    : 'DELETE'
    ;

BEGIN
    : 'BEGIN'
    ;

START
    : 'START'
    ;

TRANSACTION
    : 'TRANSACTION'
    ;

COMMIT
    : 'COMMIT'
    ;

END
    : 'END'
    ;

ROLLBACK
    : 'ROLLBACK'
    ;

VACUUM
    : 'VACUUM'
    ;

ANALYZE
    : 'ANALYZE'
    ;

TRUE
    : 'TRUE'
    ;

FALSE
    : 'FALSE'
    ;

AND
    : 'AND'
    ;

OR
    : 'OR'
    ;

CASE
    : 'CASE'
    ;

WHEN
    : 'WHEN'
    ;

THEN
    : 'THEN'
    ;

ELSE
    : 'ELSE'
    ;

AS
    : 'AS'
    ;

INNER
    : 'INNER'
    ;

LEFT
    : 'LEFT'
    ;

RIGHT
    : 'RIGHT'
    ;

FULL
    : 'FULL'
    ;

OUTER
    : 'OUTER'
    ;

JOIN
    : 'JOIN'
    ;

ON
    : 'ON'
    ;

NOW
    : 'NOW'
    ;

CURRENT_TIMESTAMP
    : 'CURRENT_TIMESTAMP'
    ;

INT
    : 'INT'
    ;

BIGINT
    : 'BIGINT'
    ;

VARCHAR
    : 'VARCHAR'
    ;

TEXT
    : 'TEXT'
    ;

BOOLEAN
    : 'BOOLEAN'
    ;

TIMESTAMP
    : 'TIMESTAMP'
    ;

DATE
    : 'DATE'
    ;

TIME
    : 'TIME'
    ;

INTERVAL
    : 'INTERVAL'
    ;

JSONB
    : 'JSONB'
    ;


PLUS
    : '+'
    ;

MINUS
    : '-'
    ;

ASTERISK
    : '*'
    ;

SLASH
    : '/'
    ;

EQUALS
    : '='
    ;

NOT_EQUALS
    : '<>'
    ;

GREATER_THAN
    : '>'
    ;

LESS_THAN
    : '<'
    ;

GREATER_THAN_EQUALS
    : '>='
    ;

LESS_THAN_EQUALS
    : '<='
    ;

LPAREN
    : '('
    ;

RPAREN
    : ')'
    ;

COMMA
    : ','
    ;