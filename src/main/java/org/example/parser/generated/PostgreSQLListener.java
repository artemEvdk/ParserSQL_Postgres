// Generated from D:/�����/2 ����/������/ParserSQL_Postgres/src/main/java/org/example/Parser/PostgreSQL.g4 by ANTLR 4.13.2
package org.example.parser.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostgreSQLParser}.
 */
public interface PostgreSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(PostgreSQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(PostgreSQLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void enterSql_script(PostgreSQLParser.Sql_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void exitSql_script(PostgreSQLParser.Sql_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PostgreSQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PostgreSQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(PostgreSQLParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(PostgreSQLParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(PostgreSQLParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(PostgreSQLParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#select_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_item(PostgreSQLParser.Select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#select_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_item(PostgreSQLParser.Select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function(PostgreSQLParser.Aggregate_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function(PostgreSQLParser.Aggregate_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PostgreSQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PostgreSQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(PostgreSQLParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(PostgreSQLParser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(PostgreSQLParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(PostgreSQLParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison_expression(PostgreSQLParser.Comparison_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison_expression(PostgreSQLParser.Comparison_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PostgreSQLParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PostgreSQLParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PostgreSQLParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PostgreSQLParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(PostgreSQLParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(PostgreSQLParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PostgreSQLParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PostgreSQLParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(PostgreSQLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(PostgreSQLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PostgreSQLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PostgreSQLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#group_by_expression}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_expression(PostgreSQLParser.Group_by_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#group_by_expression}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_expression(PostgreSQLParser.Group_by_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#having_condition}.
	 * @param ctx the parse tree
	 */
	void enterHaving_condition(PostgreSQLParser.Having_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#having_condition}.
	 * @param ctx the parse tree
	 */
	void exitHaving_condition(PostgreSQLParser.Having_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expression(PostgreSQLParser.Order_by_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expression(PostgreSQLParser.Order_by_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_expression}.
	 * @param ctx the parse tree
	 */
	void enterTable_expression(PostgreSQLParser.Table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_expression}.
	 * @param ctx the parse tree
	 */
	void exitTable_expression(PostgreSQLParser.Table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void enterTable_reference(PostgreSQLParser.Table_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void exitTable_reference(PostgreSQLParser.Table_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_primary}.
	 * @param ctx the parse tree
	 */
	void enterTable_primary(PostgreSQLParser.Table_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_primary}.
	 * @param ctx the parse tree
	 */
	void exitTable_primary(PostgreSQLParser.Table_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(PostgreSQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(PostgreSQLParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(PostgreSQLParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(PostgreSQLParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#join_spec}.
	 * @param ctx the parse tree
	 */
	void enterJoin_spec(PostgreSQLParser.Join_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#join_spec}.
	 * @param ctx the parse tree
	 */
	void exitJoin_spec(PostgreSQLParser.Join_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#column_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list(PostgreSQLParser.Column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#column_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list(PostgreSQLParser.Column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(PostgreSQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(PostgreSQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(PostgreSQLParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(PostgreSQLParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(PostgreSQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(PostgreSQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#column_ref}.
	 * @param ctx the parse tree
	 */
	void enterColumn_ref(PostgreSQLParser.Column_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#column_ref}.
	 * @param ctx the parse tree
	 */
	void exitColumn_ref(PostgreSQLParser.Column_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PostgreSQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PostgreSQLParser.LiteralContext ctx);
}