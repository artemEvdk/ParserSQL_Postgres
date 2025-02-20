/*
package org.example.Parser;

class CustomListener extends PostgreSQLBaseListener {
    @Override
    public void enterSelect_statement(PostgreSQLParser.Select_statementContext ctx) {
        System.out.println("Entered select_statement");
    }

    @Override
    public void exitSelect_statement(PostgreSQLParser.Select_statementContext ctx) {
        System.out.println("Exited select_statement");
    }
}*/
//SELECT DISTINCT department, COUNT(employee_id) AS emp_count, AVG(salary) FROM employees WHERE salary > 50000 GROUP BY department HAVING COUNT(employee_id) > 5 ORDER BY AVG(salary) DESC LIMIT 10;