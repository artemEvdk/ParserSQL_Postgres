// Generated from D:/�����/2 ����/������/ParserSQL_Postgres/src/main/java/org/example/Parser/PostgreSQL.g4 by ANTLR 4.13.2
package org.example.parser.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PostgreSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PostgreSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(PostgreSQLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#sql_script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_script(PostgreSQLParser.Sql_scriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PostgreSQLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(PostgreSQLParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(PostgreSQLParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#select_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_item(PostgreSQLParser.Select_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#aggregate_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_function(PostgreSQLParser.Aggregate_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PostgreSQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_expression(PostgreSQLParser.Logical_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_expression(PostgreSQLParser.Logical_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_expression(PostgreSQLParser.Comparison_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PostgreSQLParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PostgreSQLParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(PostgreSQLParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(PostgreSQLParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(PostgreSQLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PostgreSQLParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#group_by_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_expression(PostgreSQLParser.Group_by_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#having_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_condition(PostgreSQLParser.Having_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#order_by_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expression(PostgreSQLParser.Order_by_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_expression(PostgreSQLParser.Table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_reference(PostgreSQLParser.Table_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_primary(PostgreSQLParser.Table_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(PostgreSQLParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(PostgreSQLParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#join_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_spec(PostgreSQLParser.Join_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(PostgreSQLParser.Column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(PostgreSQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(PostgreSQLParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(PostgreSQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#column_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_ref(PostgreSQLParser.Column_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PostgreSQLParser.LiteralContext ctx);
}