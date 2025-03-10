// Generated from D:/�����/2 ����/������/ParserSQL_Postgres/src/main/java/org/example/Parser/PostgreSQL.g4 by ANTLR 4.13.2
package org.example.Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PostgreSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SELECT=2, FROM=3, WHERE=4, GROUP=5, BY=6, HAVING=7, ORDER=8, ASC=9, 
		DESC=10, LIMIT=11, OFFSET=12, DISTINCT=13, COUNT=14, MAX=15, MIN=16, AVG=17, 
		SUM=18, AS=19, NULL=20, TRUE=21, FALSE=22, OR=23, AND=24, JOIN=25, INNER=26, 
		LEFT=27, RIGHT=28, FULL=29, OUTER=30, CROSS=31, NATURAL=32, ON=33, USING=34, 
		IN=35, GT=36, LT=37, GTE=38, LTE=39, NE=40, EQ=41, PLUS=42, MINUS=43, 
		ASTERISK=44, SLASH=45, POWER=46, LPAREN=47, RPAREN=48, COMMA=49, SEMI=50, 
		STRING=51, INTEGER=52, FLOAT=53, ID=54, QUOTED_ID=55, WS=56;
	public static final int
		RULE_parse = 0, RULE_sql_script = 1, RULE_statement = 2, RULE_select_statement = 3, 
		RULE_select_list = 4, RULE_select_item = 5, RULE_aggregate_function = 6, 
		RULE_expression = 7, RULE_logical_or_expression = 8, RULE_logical_and_expression = 9, 
		RULE_comparison_expression = 10, RULE_term = 11, RULE_factor = 12, RULE_power = 13, 
		RULE_atom = 14, RULE_function_call = 15, RULE_condition = 16, RULE_group_by_expression = 17, 
		RULE_having_condition = 18, RULE_order_by_expression = 19, RULE_table_expression = 20, 
		RULE_table_reference = 21, RULE_table_primary = 22, RULE_join_clause = 23, 
		RULE_join_type = 24, RULE_join_spec = 25, RULE_column_list = 26, RULE_column_name = 27, 
		RULE_alias = 28, RULE_table_name = 29, RULE_column_ref = 30, RULE_literal = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "sql_script", "statement", "select_statement", "select_list", 
			"select_item", "aggregate_function", "expression", "logical_or_expression", 
			"logical_and_expression", "comparison_expression", "term", "factor", 
			"power", "atom", "function_call", "condition", "group_by_expression", 
			"having_condition", "order_by_expression", "table_expression", "table_reference", 
			"table_primary", "join_clause", "join_type", "join_spec", "column_list", 
			"column_name", "alias", "table_name", "column_ref", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'SELECT'", "'FROM'", "'WHERE'", "'GROUP'", "'BY'", "'HAVING'", 
			"'ORDER'", "'ASC'", "'DESC'", "'LIMIT'", "'OFFSET'", "'DISTINCT'", "'COUNT'", 
			"'MAX'", "'MIN'", "'AVG'", "'SUM'", "'AS'", "'NULL'", "'TRUE'", "'FALSE'", 
			"'OR'", "'AND'", "'JOIN'", "'INNER'", "'LEFT'", "'RIGHT'", "'FULL'", 
			"'OUTER'", "'CROSS'", "'NATURAL'", "'ON'", "'USING'", "'IN'", "'>'", 
			"'<'", "'>='", "'<='", "'<>'", "'='", "'+'", "'-'", "'*'", "'/'", "'^'", 
			"'('", "')'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SELECT", "FROM", "WHERE", "GROUP", "BY", "HAVING", "ORDER", 
			"ASC", "DESC", "LIMIT", "OFFSET", "DISTINCT", "COUNT", "MAX", "MIN", 
			"AVG", "SUM", "AS", "NULL", "TRUE", "FALSE", "OR", "AND", "JOIN", "INNER", 
			"LEFT", "RIGHT", "FULL", "OUTER", "CROSS", "NATURAL", "ON", "USING", 
			"IN", "GT", "LT", "GTE", "LTE", "NE", "EQ", "PLUS", "MINUS", "ASTERISK", 
			"SLASH", "POWER", "LPAREN", "RPAREN", "COMMA", "SEMI", "STRING", "INTEGER", 
			"FLOAT", "ID", "QUOTED_ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PostgreSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PostgreSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public Sql_scriptContext sql_script() {
			return getRuleContext(Sql_scriptContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PostgreSQLParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			sql_script();
			setState(65);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sql_scriptContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Sql_scriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterSql_script(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitSql_script(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitSql_script(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_scriptContext sql_script() throws RecognitionException {
		Sql_scriptContext _localctx = new Sql_scriptContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELECT) {
				{
				{
				setState(67);
				statement();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PostgreSQLParser.SEMI, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			select_statement();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(74);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_statementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(PostgreSQLParser.SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PostgreSQLParser.FROM, 0); }
		public Table_expressionContext table_expression() {
			return getRuleContext(Table_expressionContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(PostgreSQLParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode GROUP() { return getToken(PostgreSQLParser.GROUP, 0); }
		public List<TerminalNode> BY() { return getTokens(PostgreSQLParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(PostgreSQLParser.BY, i);
		}
		public List<Group_by_expressionContext> group_by_expression() {
			return getRuleContexts(Group_by_expressionContext.class);
		}
		public Group_by_expressionContext group_by_expression(int i) {
			return getRuleContext(Group_by_expressionContext.class,i);
		}
		public TerminalNode HAVING() { return getToken(PostgreSQLParser.HAVING, 0); }
		public Having_conditionContext having_condition() {
			return getRuleContext(Having_conditionContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(PostgreSQLParser.ORDER, 0); }
		public List<Order_by_expressionContext> order_by_expression() {
			return getRuleContexts(Order_by_expressionContext.class);
		}
		public Order_by_expressionContext order_by_expression(int i) {
			return getRuleContext(Order_by_expressionContext.class,i);
		}
		public TerminalNode LIMIT() { return getToken(PostgreSQLParser.LIMIT, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(PostgreSQLParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(PostgreSQLParser.INTEGER, i);
		}
		public TerminalNode OFFSET() { return getToken(PostgreSQLParser.OFFSET, 0); }
		public TerminalNode SEMI() { return getToken(PostgreSQLParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitSelect_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(SELECT);
			setState(78);
			select_list();
			setState(79);
			match(FROM);
			setState(80);
			table_expression();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(81);
				match(WHERE);
				setState(82);
				condition();
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(85);
				match(GROUP);
				setState(86);
				match(BY);
				setState(87);
				group_by_expression();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(88);
					match(COMMA);
					setState(89);
					group_by_expression();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(97);
				match(HAVING);
				setState(98);
				having_condition();
				}
			}

			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(101);
				match(ORDER);
				setState(102);
				match(BY);
				setState(103);
				order_by_expression();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(104);
					match(COMMA);
					setState(105);
					order_by_expression();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(113);
				match(LIMIT);
				setState(114);
				match(INTEGER);
				}
			}

			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(117);
				match(OFFSET);
				setState(118);
				match(INTEGER);
				}
			}

			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(121);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_listContext extends ParserRuleContext {
		public List<Select_itemContext> select_item() {
			return getRuleContexts(Select_itemContext.class);
		}
		public Select_itemContext select_item(int i) {
			return getRuleContext(Select_itemContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(PostgreSQLParser.ASTERISK, 0); }
		public TerminalNode DISTINCT() { return getToken(PostgreSQLParser.DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(124);
				match(DISTINCT);
				}
			}

			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
			case MAX:
			case MIN:
			case AVG:
			case SUM:
			case NULL:
			case TRUE:
			case FALSE:
			case PLUS:
			case MINUS:
			case LPAREN:
			case STRING:
			case INTEGER:
			case FLOAT:
			case ID:
			case QUOTED_ID:
				{
				setState(127);
				select_item();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(128);
					match(COMMA);
					setState(129);
					select_item();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK:
				{
				setState(135);
				match(ASTERISK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public Aggregate_functionContext aggregate_function() {
			return getRuleContext(Aggregate_functionContext.class,0);
		}
		public Select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterSelect_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitSelect_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitSelect_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_itemContext select_item() throws RecognitionException {
		Select_itemContext _localctx = new Select_itemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_select_item);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				expression();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 54043195528970240L) != 0)) {
					{
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(139);
						match(AS);
						}
					}

					setState(142);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				aggregate_function();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 54043195528970240L) != 0)) {
					{
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(146);
						match(AS);
						}
					}

					setState(149);
					alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aggregate_functionContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(PostgreSQLParser.COUNT, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public TerminalNode ASTERISK() { return getToken(PostgreSQLParser.ASTERISK, 0); }
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MAX() { return getToken(PostgreSQLParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(PostgreSQLParser.MIN, 0); }
		public TerminalNode AVG() { return getToken(PostgreSQLParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(PostgreSQLParser.SUM, 0); }
		public Aggregate_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterAggregate_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitAggregate_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitAggregate_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_functionContext aggregate_function() throws RecognitionException {
		Aggregate_functionContext _localctx = new Aggregate_functionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_aggregate_function);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(COUNT);
				setState(155);
				match(LPAREN);
				setState(156);
				match(ASTERISK);
				setState(157);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(COUNT);
				setState(159);
				match(LPAREN);
				setState(160);
				expression();
				setState(161);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(MAX);
				setState(164);
				match(LPAREN);
				setState(165);
				expression();
				setState(166);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(MIN);
				setState(169);
				match(LPAREN);
				setState(170);
				expression();
				setState(171);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(AVG);
				setState(174);
				match(LPAREN);
				setState(175);
				expression();
				setState(176);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				match(SUM);
				setState(179);
				match(LPAREN);
				setState(180);
				expression();
				setState(181);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Aggregate_functionContext aggregate_function() {
			return getRuleContext(Aggregate_functionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case TRUE:
			case FALSE:
			case PLUS:
			case MINUS:
			case LPAREN:
			case STRING:
			case INTEGER:
			case FLOAT:
			case ID:
			case QUOTED_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				logical_or_expression();
				}
				break;
			case COUNT:
			case MAX:
			case MIN:
			case AVG:
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				aggregate_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_or_expressionContext extends ParserRuleContext {
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(PostgreSQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PostgreSQLParser.OR, i);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitLogical_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitLogical_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logical_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			logical_and_expression();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(190);
				match(OR);
				setState(191);
				logical_and_expression();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_and_expressionContext extends ParserRuleContext {
		public List<Comparison_expressionContext> comparison_expression() {
			return getRuleContexts(Comparison_expressionContext.class);
		}
		public Comparison_expressionContext comparison_expression(int i) {
			return getRuleContext(Comparison_expressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(PostgreSQLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(PostgreSQLParser.AND, i);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitLogical_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitLogical_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logical_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			comparison_expression();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(198);
				match(AND);
				setState(199);
				comparison_expression();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comparison_expressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode EQ() { return getToken(PostgreSQLParser.EQ, 0); }
		public TerminalNode NE() { return getToken(PostgreSQLParser.NE, 0); }
		public TerminalNode GT() { return getToken(PostgreSQLParser.GT, 0); }
		public TerminalNode LT() { return getToken(PostgreSQLParser.LT, 0); }
		public TerminalNode GTE() { return getToken(PostgreSQLParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(PostgreSQLParser.LTE, 0); }
		public TerminalNode IN() { return getToken(PostgreSQLParser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public Comparison_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterComparison_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitComparison_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitComparison_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_expressionContext comparison_expression() throws RecognitionException {
		Comparison_expressionContext _localctx = new Comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparison_expression);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				term();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034368L) != 0)) {
					{
					setState(206);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034368L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(207);
					term();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				term();
				setState(211);
				match(IN);
				setState(212);
				match(LPAREN);
				setState(213);
				select_statement();
				setState(214);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PostgreSQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PostgreSQLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PostgreSQLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PostgreSQLParser.MINUS, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			factor();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(219);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(220);
				factor();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PostgreSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PostgreSQLParser.MINUS, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(227);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				power();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				function_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PowerContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode POWER() { return getToken(PostgreSQLParser.POWER, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			atom();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(233);
				match(POWER);
				setState(234);
				factor();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Column_refContext column_ref() {
			return getRuleContext(Column_refContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atom);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				column_ref();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(LPAREN);
				setState(241);
				expression();
				setState(242);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(PostgreSQLParser.ID, 0); }
		public TerminalNode QUOTED_ID() { return getToken(PostgreSQLParser.QUOTED_ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QUOTED_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(247);
			match(LPAREN);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69959725859979264L) != 0)) {
				{
				setState(248);
				expression();
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(249);
					match(COMMA);
					setState(250);
					expression();
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(258);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Group_by_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Group_by_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterGroup_by_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitGroup_by_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitGroup_by_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_expressionContext group_by_expression() throws RecognitionException {
		Group_by_expressionContext _localctx = new Group_by_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_group_by_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Having_conditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Having_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterHaving_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitHaving_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitHaving_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_conditionContext having_condition() throws RecognitionException {
		Having_conditionContext _localctx = new Having_conditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_having_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_by_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(PostgreSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSQLParser.DESC, 0); }
		public Order_by_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterOrder_by_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitOrder_by_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitOrder_by_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_expressionContext order_by_expression() throws RecognitionException {
		Order_by_expressionContext _localctx = new Order_by_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_order_by_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			expression();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(267);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_expressionContext extends ParserRuleContext {
		public Table_referenceContext table_reference() {
			return getRuleContext(Table_referenceContext.class,0);
		}
		public Table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterTable_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitTable_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitTable_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_expressionContext table_expression() throws RecognitionException {
		Table_expressionContext _localctx = new Table_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_table_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			table_reference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_referenceContext extends ParserRuleContext {
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public List<Join_clauseContext> join_clause() {
			return getRuleContexts(Join_clauseContext.class);
		}
		public Join_clauseContext join_clause(int i) {
			return getRuleContext(Join_clauseContext.class,i);
		}
		public Table_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterTable_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitTable_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitTable_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_referenceContext table_reference() throws RecognitionException {
		Table_referenceContext _localctx = new Table_referenceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_table_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			table_primary();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 562957436059648L) != 0)) {
				{
				{
				setState(273);
				join_clause();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_primaryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public Table_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterTable_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitTable_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitTable_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_primaryContext table_primary() throws RecognitionException {
		Table_primaryContext _localctx = new Table_primaryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_table_primary);
		int _la;
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case QUOTED_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				table_name();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 54043195528970240L) != 0)) {
					{
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(280);
						match(AS);
						}
					}

					setState(283);
					alias();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(LPAREN);
				setState(287);
				select_statement();
				setState(288);
				match(RPAREN);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 54043195528970240L) != 0)) {
					{
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(289);
						match(AS);
						}
					}

					setState(292);
					alias();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_clauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(PostgreSQLParser.JOIN, 0); }
		public Table_primaryContext table_primary() {
			return getRuleContext(Table_primaryContext.class,0);
		}
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public Join_specContext join_spec() {
			return getRuleContext(Join_specContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PostgreSQLParser.COMMA, 0); }
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_join_clause);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case CROSS:
			case NATURAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7449083904L) != 0)) {
					{
					setState(297);
					join_type();
					}
				}

				setState(300);
				match(JOIN);
				setState(301);
				table_primary();
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON || _la==USING) {
					{
					setState(302);
					join_spec();
					}
				}

				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(COMMA);
				setState(306);
				table_primary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_typeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(PostgreSQLParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(PostgreSQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(PostgreSQLParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(PostgreSQLParser.OUTER, 0); }
		public TerminalNode CROSS() { return getToken(PostgreSQLParser.CROSS, 0); }
		public TerminalNode NATURAL() { return getToken(PostgreSQLParser.NATURAL, 0); }
		public Join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterJoin_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitJoin_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitJoin_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_typeContext join_type() throws RecognitionException {
		Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_join_type);
		int _la;
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(INNER);
				}
				break;
			case LEFT:
			case RIGHT:
			case FULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(311);
					match(OUTER);
					}
				}

				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(CROSS);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				match(NATURAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Join_specContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(PostgreSQLParser.ON, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode USING() { return getToken(PostgreSQLParser.USING, 0); }
		public TerminalNode LPAREN() { return getToken(PostgreSQLParser.LPAREN, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PostgreSQLParser.RPAREN, 0); }
		public Join_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterJoin_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitJoin_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitJoin_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_specContext join_spec() throws RecognitionException {
		Join_specContext _localctx = new Join_specContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_join_spec);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(ON);
				setState(319);
				condition();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(USING);
				setState(321);
				match(LPAREN);
				setState(322);
				column_list();
				setState(323);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_listContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterColumn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitColumn_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitColumn_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			column_name();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(328);
				match(COMMA);
				setState(329);
				column_name();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLParser.ID, 0); }
		public TerminalNode QUOTED_ID() { return getToken(PostgreSQLParser.QUOTED_ID, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_column_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QUOTED_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PostgreSQLParser.ID, 0); }
		public TerminalNode QUOTED_ID() { return getToken(PostgreSQLParser.QUOTED_ID, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QUOTED_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PostgreSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostgreSQLParser.ID, i);
		}
		public List<TerminalNode> QUOTED_ID() { return getTokens(PostgreSQLParser.QUOTED_ID); }
		public TerminalNode QUOTED_ID(int i) {
			return getToken(PostgreSQLParser.QUOTED_ID, i);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QUOTED_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(340);
				match(T__0);
				setState(341);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QUOTED_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Column_refContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PostgreSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PostgreSQLParser.ID, i);
		}
		public List<TerminalNode> QUOTED_ID() { return getTokens(PostgreSQLParser.QUOTED_ID); }
		public TerminalNode QUOTED_ID(int i) {
			return getToken(PostgreSQLParser.QUOTED_ID, i);
		}
		public Column_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterColumn_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitColumn_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitColumn_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_refContext column_ref() throws RecognitionException {
		Column_refContext _localctx = new Column_refContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_column_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QUOTED_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(345);
				match(T__0);
				setState(346);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QUOTED_ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PostgreSQLParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(PostgreSQLParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(PostgreSQLParser.FLOAT, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(PostgreSQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PostgreSQLParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLListener ) ((PostgreSQLListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostgreSQLVisitor ) return ((PostgreSQLVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762598703136768L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00018\u0160\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0005\u0001E\b\u0001\n\u0001\f\u0001H\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002L\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003T\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003[\b\u0003\n\u0003\f\u0003"+
		"^\t\u0003\u0003\u0003`\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003d\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003k\b\u0003\n\u0003\f\u0003n\t\u0003\u0003\u0003p\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003t\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"x\b\u0003\u0001\u0003\u0003\u0003{\b\u0003\u0001\u0004\u0003\u0004~\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0083\b\u0004\n"+
		"\u0004\f\u0004\u0086\t\u0004\u0001\u0004\u0003\u0004\u0089\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u008d\b\u0005\u0001\u0005\u0003\u0005\u0090"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0094\b\u0005\u0001\u0005"+
		"\u0003\u0005\u0097\b\u0005\u0003\u0005\u0099\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b8\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00bc\b\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00c1\b\b\n\b\f\b\u00c4\t\b\u0001\t\u0001\t\u0001\t\u0005\t\u00c9\b"+
		"\t\n\t\f\t\u00cc\t\t\u0001\n\u0001\n\u0001\n\u0003\n\u00d1\b\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d9\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00de\b\u000b\n\u000b\f\u000b\u00e1"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e7\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00ec\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f5\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00fc"+
		"\b\u000f\n\u000f\f\u000f\u00ff\t\u000f\u0003\u000f\u0101\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u010d\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u0113\b\u0015\n"+
		"\u0015\f\u0015\u0116\t\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u011a"+
		"\b\u0016\u0001\u0016\u0003\u0016\u011d\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0123\b\u0016\u0001\u0016\u0003\u0016"+
		"\u0126\b\u0016\u0003\u0016\u0128\b\u0016\u0001\u0017\u0003\u0017\u012b"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0130\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u0134\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0139\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u013d\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0146\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u014b\b\u001a\n\u001a\f\u001a\u014e\t\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0157\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u015c\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0000\u0000 "+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>\u0000\u0006\u0001\u0000$)\u0001\u0000*+"+
		"\u0001\u000067\u0001\u0000\t\n\u0001\u0000\u001b\u001d\u0002\u0000\u0014"+
		"\u001635\u0177\u0000@\u0001\u0000\u0000\u0000\u0002F\u0001\u0000\u0000"+
		"\u0000\u0004I\u0001\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\b"+
		"}\u0001\u0000\u0000\u0000\n\u0098\u0001\u0000\u0000\u0000\f\u00b7\u0001"+
		"\u0000\u0000\u0000\u000e\u00bb\u0001\u0000\u0000\u0000\u0010\u00bd\u0001"+
		"\u0000\u0000\u0000\u0012\u00c5\u0001\u0000\u0000\u0000\u0014\u00d8\u0001"+
		"\u0000\u0000\u0000\u0016\u00da\u0001\u0000\u0000\u0000\u0018\u00e6\u0001"+
		"\u0000\u0000\u0000\u001a\u00e8\u0001\u0000\u0000\u0000\u001c\u00f4\u0001"+
		"\u0000\u0000\u0000\u001e\u00f6\u0001\u0000\u0000\u0000 \u0104\u0001\u0000"+
		"\u0000\u0000\"\u0106\u0001\u0000\u0000\u0000$\u0108\u0001\u0000\u0000"+
		"\u0000&\u010a\u0001\u0000\u0000\u0000(\u010e\u0001\u0000\u0000\u0000*"+
		"\u0110\u0001\u0000\u0000\u0000,\u0127\u0001\u0000\u0000\u0000.\u0133\u0001"+
		"\u0000\u0000\u00000\u013c\u0001\u0000\u0000\u00002\u0145\u0001\u0000\u0000"+
		"\u00004\u0147\u0001\u0000\u0000\u00006\u014f\u0001\u0000\u0000\u00008"+
		"\u0151\u0001\u0000\u0000\u0000:\u0153\u0001\u0000\u0000\u0000<\u0158\u0001"+
		"\u0000\u0000\u0000>\u015d\u0001\u0000\u0000\u0000@A\u0003\u0002\u0001"+
		"\u0000AB\u0005\u0000\u0000\u0001B\u0001\u0001\u0000\u0000\u0000CE\u0003"+
		"\u0004\u0002\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u0003\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0003\u0006\u0003\u0000JL\u0005"+
		"2\u0000\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0005"+
		"\u0001\u0000\u0000\u0000MN\u0005\u0002\u0000\u0000NO\u0003\b\u0004\u0000"+
		"OP\u0005\u0003\u0000\u0000PS\u0003(\u0014\u0000QR\u0005\u0004\u0000\u0000"+
		"RT\u0003 \u0010\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"T_\u0001\u0000\u0000\u0000UV\u0005\u0005\u0000\u0000VW\u0005\u0006\u0000"+
		"\u0000W\\\u0003\"\u0011\u0000XY\u00051\u0000\u0000Y[\u0003\"\u0011\u0000"+
		"ZX\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000_U\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000ab\u0005\u0007\u0000\u0000bd\u0003$\u0012\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000do\u0001\u0000\u0000\u0000"+
		"ef\u0005\b\u0000\u0000fg\u0005\u0006\u0000\u0000gl\u0003&\u0013\u0000"+
		"hi\u00051\u0000\u0000ik\u0003&\u0013\u0000jh\u0001\u0000\u0000\u0000k"+
		"n\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000oe\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qr\u0005"+
		"\u000b\u0000\u0000rt\u00054\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000uv\u0005\f\u0000\u0000vx\u0005"+
		"4\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001"+
		"\u0000\u0000\u0000y{\u00052\u0000\u0000zy\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{\u0007\u0001\u0000\u0000\u0000|~\u0005\r\u0000\u0000"+
		"}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0088\u0001\u0000"+
		"\u0000\u0000\u007f\u0084\u0003\n\u0005\u0000\u0080\u0081\u00051\u0000"+
		"\u0000\u0081\u0083\u0003\n\u0005\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0089\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0089\u0005,\u0000\u0000\u0088"+
		"\u007f\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\t\u0001\u0000\u0000\u0000\u008a\u008f\u0003\u000e\u0007\u0000\u008b\u008d"+
		"\u0005\u0013\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u00038\u001c\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0099\u0001\u0000\u0000\u0000\u0091\u0096\u0003"+
		"\f\u0006\u0000\u0092\u0094\u0005\u0013\u0000\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0097\u00038\u001c\u0000\u0096\u0093\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000"+
		"\u0000\u0098\u008a\u0001\u0000\u0000\u0000\u0098\u0091\u0001\u0000\u0000"+
		"\u0000\u0099\u000b\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u000e\u0000"+
		"\u0000\u009b\u009c\u0005/\u0000\u0000\u009c\u009d\u0005,\u0000\u0000\u009d"+
		"\u00b8\u00050\u0000\u0000\u009e\u009f\u0005\u000e\u0000\u0000\u009f\u00a0"+
		"\u0005/\u0000\u0000\u00a0\u00a1\u0003\u000e\u0007\u0000\u00a1\u00a2\u0005"+
		"0\u0000\u0000\u00a2\u00b8\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u000f"+
		"\u0000\u0000\u00a4\u00a5\u0005/\u0000\u0000\u00a5\u00a6\u0003\u000e\u0007"+
		"\u0000\u00a6\u00a7\u00050\u0000\u0000\u00a7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0005\u0010\u0000\u0000\u00a9\u00aa\u0005/\u0000\u0000\u00aa"+
		"\u00ab\u0003\u000e\u0007\u0000\u00ab\u00ac\u00050\u0000\u0000\u00ac\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0011\u0000\u0000\u00ae\u00af"+
		"\u0005/\u0000\u0000\u00af\u00b0\u0003\u000e\u0007\u0000\u00b0\u00b1\u0005"+
		"0\u0000\u0000\u00b1\u00b8\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0012"+
		"\u0000\u0000\u00b3\u00b4\u0005/\u0000\u0000\u00b4\u00b5\u0003\u000e\u0007"+
		"\u0000\u00b5\u00b6\u00050\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b7\u009a\u0001\u0000\u0000\u0000\u00b7\u009e\u0001\u0000\u0000\u0000"+
		"\u00b7\u00a3\u0001\u0000\u0000\u0000\u00b7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ad\u0001\u0000\u0000\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b8\r\u0001\u0000\u0000\u0000\u00b9\u00bc\u0003\u0010\b\u0000\u00ba"+
		"\u00bc\u0003\f\u0006\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bc\u000f\u0001\u0000\u0000\u0000\u00bd\u00c2"+
		"\u0003\u0012\t\u0000\u00be\u00bf\u0005\u0017\u0000\u0000\u00bf\u00c1\u0003"+
		"\u0012\t\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u0011\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c5\u00ca\u0003\u0014\n\u0000\u00c6\u00c7\u0005\u0018\u0000"+
		"\u0000\u00c7\u00c9\u0003\u0014\n\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u0013\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00d0\u0003\u0016\u000b\u0000"+
		"\u00ce\u00cf\u0007\u0000\u0000\u0000\u00cf\u00d1\u0003\u0016\u000b\u0000"+
		"\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d9\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003\u0016\u000b\u0000"+
		"\u00d3\u00d4\u0005#\u0000\u0000\u00d4\u00d5\u0005/\u0000\u0000\u00d5\u00d6"+
		"\u0003\u0006\u0003\u0000\u00d6\u00d7\u00050\u0000\u0000\u00d7\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d8\u00cd\u0001\u0000\u0000\u0000\u00d8\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d9\u0015\u0001\u0000\u0000\u0000\u00da\u00df\u0003"+
		"\u0018\f\u0000\u00db\u00dc\u0007\u0001\u0000\u0000\u00dc\u00de\u0003\u0018"+
		"\f\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u0017\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0007\u0001\u0000\u0000\u00e3\u00e7\u0003\u0018\f\u0000"+
		"\u00e4\u00e7\u0003\u001a\r\u0000\u00e5\u00e7\u0003\u001e\u000f\u0000\u00e6"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e7\u0019\u0001\u0000\u0000\u0000\u00e8"+
		"\u00eb\u0003\u001c\u000e\u0000\u00e9\u00ea\u0005.\u0000\u0000\u00ea\u00ec"+
		"\u0003\u0018\f\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u001b\u0001\u0000\u0000\u0000\u00ed\u00f5\u0003"+
		">\u001f\u0000\u00ee\u00f5\u0003<\u001e\u0000\u00ef\u00f5\u0003\u001e\u000f"+
		"\u0000\u00f0\u00f1\u0005/\u0000\u0000\u00f1\u00f2\u0003\u000e\u0007\u0000"+
		"\u00f2\u00f3\u00050\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f4\u00ee\u0001\u0000\u0000\u0000\u00f4"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f4\u00f0\u0001\u0000\u0000\u0000\u00f5"+
		"\u001d\u0001\u0000\u0000\u0000\u00f6\u00f7\u0007\u0002\u0000\u0000\u00f7"+
		"\u0100\u0005/\u0000\u0000\u00f8\u00fd\u0003\u000e\u0007\u0000\u00f9\u00fa"+
		"\u00051\u0000\u0000\u00fa\u00fc\u0003\u000e\u0007\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0101\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u00f8\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u00050\u0000\u0000\u0103\u001f\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0003\u000e\u0007\u0000\u0105!\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0003\u000e\u0007\u0000\u0107#\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0003\u000e\u0007\u0000\u0109%\u0001\u0000\u0000\u0000\u010a"+
		"\u010c\u0003\u000e\u0007\u0000\u010b\u010d\u0007\u0003\u0000\u0000\u010c"+
		"\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\'\u0001\u0000\u0000\u0000\u010e\u010f\u0003*\u0015\u0000\u010f)\u0001"+
		"\u0000\u0000\u0000\u0110\u0114\u0003,\u0016\u0000\u0111\u0113\u0003.\u0017"+
		"\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000"+
		"\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115+\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000"+
		"\u0117\u011c\u0003:\u001d\u0000\u0118\u011a\u0005\u0013\u0000\u0000\u0119"+
		"\u0118\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011d\u00038\u001c\u0000\u011c\u0119"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u0128"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0005/\u0000\u0000\u011f\u0120\u0003"+
		"\u0006\u0003\u0000\u0120\u0125\u00050\u0000\u0000\u0121\u0123\u0005\u0013"+
		"\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0126\u00038\u001c"+
		"\u0000\u0125\u0122\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000"+
		"\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0117\u0001\u0000\u0000"+
		"\u0000\u0127\u011e\u0001\u0000\u0000\u0000\u0128-\u0001\u0000\u0000\u0000"+
		"\u0129\u012b\u00030\u0018\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0005\u0019\u0000\u0000\u012d\u012f\u0003,\u0016\u0000\u012e\u0130"+
		"\u00032\u0019\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u012f\u0130\u0001"+
		"\u0000\u0000\u0000\u0130\u0134\u0001\u0000\u0000\u0000\u0131\u0132\u0005"+
		"1\u0000\u0000\u0132\u0134\u0003,\u0016\u0000\u0133\u012a\u0001\u0000\u0000"+
		"\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134/\u0001\u0000\u0000\u0000"+
		"\u0135\u013d\u0005\u001a\u0000\u0000\u0136\u0138\u0007\u0004\u0000\u0000"+
		"\u0137\u0139\u0005\u001e\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000"+
		"\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013d\u0001\u0000\u0000\u0000"+
		"\u013a\u013d\u0005\u001f\u0000\u0000\u013b\u013d\u0005 \u0000\u0000\u013c"+
		"\u0135\u0001\u0000\u0000\u0000\u013c\u0136\u0001\u0000\u0000\u0000\u013c"+
		"\u013a\u0001\u0000\u0000\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d"+
		"1\u0001\u0000\u0000\u0000\u013e\u013f\u0005!\u0000\u0000\u013f\u0146\u0003"+
		" \u0010\u0000\u0140\u0141\u0005\"\u0000\u0000\u0141\u0142\u0005/\u0000"+
		"\u0000\u0142\u0143\u00034\u001a\u0000\u0143\u0144\u00050\u0000\u0000\u0144"+
		"\u0146\u0001\u0000\u0000\u0000\u0145\u013e\u0001\u0000\u0000\u0000\u0145"+
		"\u0140\u0001\u0000\u0000\u0000\u01463\u0001\u0000\u0000\u0000\u0147\u014c"+
		"\u00036\u001b\u0000\u0148\u0149\u00051\u0000\u0000\u0149\u014b\u00036"+
		"\u001b\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000"+
		"\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d5\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0007\u0002\u0000\u0000\u01507\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0007\u0002\u0000\u0000\u01529\u0001\u0000\u0000\u0000\u0153"+
		"\u0156\u0007\u0002\u0000\u0000\u0154\u0155\u0005\u0001\u0000\u0000\u0155"+
		"\u0157\u0007\u0002\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0001\u0000\u0000\u0000\u0157;\u0001\u0000\u0000\u0000\u0158\u015b"+
		"\u0007\u0002\u0000\u0000\u0159\u015a\u0005\u0001\u0000\u0000\u015a\u015c"+
		"\u0007\u0002\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0001\u0000\u0000\u0000\u015c=\u0001\u0000\u0000\u0000\u015d\u015e\u0007"+
		"\u0005\u0000\u0000\u015e?\u0001\u0000\u0000\u0000/FKS\\_closwz}\u0084"+
		"\u0088\u008c\u008f\u0093\u0096\u0098\u00b7\u00bb\u00c2\u00ca\u00d0\u00d8"+
		"\u00df\u00e6\u00eb\u00f4\u00fd\u0100\u010c\u0114\u0119\u011c\u0122\u0125"+
		"\u0127\u012a\u012f\u0133\u0138\u013c\u0145\u014c\u0156\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}