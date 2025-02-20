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
		SUM=18, AS=19, NULL=20, TRUE=21, FALSE=22, OR=23, AND=24, GT=25, LT=26, 
		GTE=27, LTE=28, NE=29, EQ=30, PLUS=31, MINUS=32, ASTERISK=33, SLASH=34, 
		POWER=35, LPAREN=36, RPAREN=37, COMMA=38, SEMI=39, STRING=40, INTEGER=41, 
		FLOAT=42, ID=43, QUOTED_ID=44, WS=45;
	public static final int
		RULE_parse = 0, RULE_sql_script = 1, RULE_statement = 2, RULE_select_statement = 3, 
		RULE_select_list = 4, RULE_select_item = 5, RULE_aggregate_function = 6, 
		RULE_expression = 7, RULE_logical_or_expression = 8, RULE_logical_and_expression = 9, 
		RULE_comparison_expression = 10, RULE_term = 11, RULE_factor = 12, RULE_power = 13, 
		RULE_atom = 14, RULE_function_call = 15, RULE_condition = 16, RULE_group_by_expression = 17, 
		RULE_having_condition = 18, RULE_order_by_expression = 19, RULE_table_expression = 20, 
		RULE_table_reference = 21, RULE_table_name = 22, RULE_column_ref = 23, 
		RULE_literal = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "sql_script", "statement", "select_statement", "select_list", 
			"select_item", "aggregate_function", "expression", "logical_or_expression", 
			"logical_and_expression", "comparison_expression", "term", "factor", 
			"power", "atom", "function_call", "condition", "group_by_expression", 
			"having_condition", "order_by_expression", "table_expression", "table_reference", 
			"table_name", "column_ref", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'SELECT'", "'FROM'", "'WHERE'", "'GROUP'", "'BY'", "'HAVING'", 
			"'ORDER'", "'ASC'", "'DESC'", "'LIMIT'", "'OFFSET'", "'DISTINCT'", "'COUNT'", 
			"'MAX'", "'MIN'", "'AVG'", "'SUM'", "'AS'", "'NULL'", "'TRUE'", "'FALSE'", 
			"'OR'", "'AND'", "'>'", "'<'", "'>='", "'<='", "'<>'", "'='", "'+'", 
			"'-'", "'*'", "'/'", "'^'", "'('", "')'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "SELECT", "FROM", "WHERE", "GROUP", "BY", "HAVING", "ORDER", 
			"ASC", "DESC", "LIMIT", "OFFSET", "DISTINCT", "COUNT", "MAX", "MIN", 
			"AVG", "SUM", "AS", "NULL", "TRUE", "FALSE", "OR", "AND", "GT", "LT", 
			"GTE", "LTE", "NE", "EQ", "PLUS", "MINUS", "ASTERISK", "SLASH", "POWER", 
			"LPAREN", "RPAREN", "COMMA", "SEMI", "STRING", "INTEGER", "FLOAT", "ID", 
			"QUOTED_ID", "WS"
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
			setState(50);
			sql_script();
			setState(51);
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
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELECT) {
				{
				{
				setState(53);
				statement();
				}
				}
				setState(58);
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
			setState(59);
			select_statement();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(60);
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
			setState(63);
			match(SELECT);
			setState(64);
			select_list();
			setState(65);
			match(FROM);
			setState(66);
			table_expression();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(67);
				match(WHERE);
				setState(68);
				condition();
				}
			}

			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(71);
				match(GROUP);
				setState(72);
				match(BY);
				setState(73);
				group_by_expression();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(74);
					match(COMMA);
					setState(75);
					group_by_expression();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(83);
				match(HAVING);
				setState(84);
				having_condition();
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(87);
				match(ORDER);
				setState(88);
				match(BY);
				setState(89);
				order_by_expression();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(90);
					match(COMMA);
					setState(91);
					order_by_expression();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(99);
				match(LIMIT);
				setState(100);
				match(INTEGER);
				}
			}

			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(103);
				match(OFFSET);
				setState(104);
				match(INTEGER);
				}
			}

			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(107);
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
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(110);
				match(DISTINCT);
				}
			}

			setState(122);
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
				setState(113);
				select_item();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(114);
					match(COMMA);
					setState(115);
					select_item();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK:
				{
				setState(121);
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
		public TerminalNode ID() { return getToken(PostgreSQLParser.ID, 0); }
		public TerminalNode QUOTED_ID() { return getToken(PostgreSQLParser.QUOTED_ID, 0); }
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				expression();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26388279590912L) != 0)) {
					{
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(125);
						match(AS);
						}
					}

					setState(128);
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				aggregate_function();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26388279590912L) != 0)) {
					{
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(132);
						match(AS);
						}
					}

					setState(135);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(COUNT);
				setState(141);
				match(LPAREN);
				setState(142);
				match(ASTERISK);
				setState(143);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(COUNT);
				setState(145);
				match(LPAREN);
				setState(146);
				expression();
				setState(147);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(MAX);
				setState(150);
				match(LPAREN);
				setState(151);
				expression();
				setState(152);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(MIN);
				setState(155);
				match(LPAREN);
				setState(156);
				expression();
				setState(157);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				match(AVG);
				setState(160);
				match(LPAREN);
				setState(161);
				expression();
				setState(162);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
				match(SUM);
				setState(165);
				match(LPAREN);
				setState(166);
				expression();
				setState(167);
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
			setState(173);
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
				setState(171);
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
				setState(172);
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
			setState(175);
			logical_and_expression();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(176);
				match(OR);
				setState(177);
				logical_and_expression();
				}
				}
				setState(182);
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
			setState(183);
			comparison_expression();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(184);
				match(AND);
				setState(185);
				comparison_expression();
				}
				}
				setState(190);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			term();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2113929216L) != 0)) {
				{
				setState(192);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2113929216L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(193);
				term();
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
			setState(196);
			factor();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(197);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(198);
				factor();
				}
				}
				setState(203);
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
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(205);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				power();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
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
			setState(210);
			atom();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(211);
				match(POWER);
				setState(212);
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				column_ref();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(LPAREN);
				setState(219);
				expression();
				setState(220);
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
			setState(224);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QUOTED_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(225);
			match(LPAREN);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34160030236672L) != 0)) {
				{
				setState(226);
				expression();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(227);
					match(COMMA);
					setState(228);
					expression();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(236);
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
			setState(238);
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
			setState(240);
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
			setState(242);
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
			setState(244);
			expression();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(245);
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
		public List<Table_referenceContext> table_reference() {
			return getRuleContexts(Table_referenceContext.class);
		}
		public Table_referenceContext table_reference(int i) {
			return getRuleContext(Table_referenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			table_reference();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(249);
				match(COMMA);
				setState(250);
				table_reference();
				}
				}
				setState(255);
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
	public static class Table_referenceContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode ID() { return getToken(PostgreSQLParser.ID, 0); }
		public TerminalNode QUOTED_ID() { return getToken(PostgreSQLParser.QUOTED_ID, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
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
			setState(256);
			table_name();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26388279590912L) != 0)) {
				{
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(257);
					match(AS);
					}
				}

				setState(260);
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
		enterRule(_localctx, 44, RULE_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QUOTED_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(264);
				match(T__0);
				setState(265);
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
		enterRule(_localctx, 46, RULE_column_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QUOTED_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(269);
				match(T__0);
				setState(270);
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
		enterRule(_localctx, 48, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7696588734464L) != 0)) ) {
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
		"\u0004\u0001-\u0114\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u00017\b\u0001"+
		"\n\u0001\f\u0001:\t\u0001\u0001\u0002\u0001\u0002\u0003\u0002>\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003F\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003M\b\u0003\n\u0003\f\u0003P\t\u0003\u0003\u0003"+
		"R\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003V\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003]\b\u0003\n\u0003"+
		"\f\u0003`\t\u0003\u0003\u0003b\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"f\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003j\b\u0003\u0001\u0003\u0003"+
		"\u0003m\b\u0003\u0001\u0004\u0003\u0004p\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004u\b\u0004\n\u0004\f\u0004x\t\u0004\u0001\u0004"+
		"\u0003\u0004{\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u007f\b\u0005"+
		"\u0001\u0005\u0003\u0005\u0082\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0086\b\u0005\u0001\u0005\u0003\u0005\u0089\b\u0005\u0003\u0005\u008b"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00aa\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00ae\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u00b3\b\b\n\b\f\b\u00b6\t\b\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u00bb\b\t\n\t\f\t\u00be\t\t\u0001\n\u0001\n\u0001\n"+
		"\u0003\n\u00c3\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00c8"+
		"\b\u000b\n\u000b\f\u000b\u00cb\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u00d1\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u00d6\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00df\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00e6\b\u000f\n\u000f\f\u000f\u00e9\t\u000f\u0003"+
		"\u000f\u00eb\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00f7\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00fc"+
		"\b\u0014\n\u0014\f\u0014\u00ff\t\u0014\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0103\b\u0015\u0001\u0015\u0003\u0015\u0106\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u010b\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0110\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0000"+
		"\u0000\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0005\u0001\u0000+,\u0001\u0000"+
		"\u0019\u001e\u0001\u0000\u001f \u0001\u0000\t\n\u0002\u0000\u0014\u0016"+
		"(*\u0125\u00002\u0001\u0000\u0000\u0000\u00028\u0001\u0000\u0000\u0000"+
		"\u0004;\u0001\u0000\u0000\u0000\u0006?\u0001\u0000\u0000\u0000\bo\u0001"+
		"\u0000\u0000\u0000\n\u008a\u0001\u0000\u0000\u0000\f\u00a9\u0001\u0000"+
		"\u0000\u0000\u000e\u00ad\u0001\u0000\u0000\u0000\u0010\u00af\u0001\u0000"+
		"\u0000\u0000\u0012\u00b7\u0001\u0000\u0000\u0000\u0014\u00bf\u0001\u0000"+
		"\u0000\u0000\u0016\u00c4\u0001\u0000\u0000\u0000\u0018\u00d0\u0001\u0000"+
		"\u0000\u0000\u001a\u00d2\u0001\u0000\u0000\u0000\u001c\u00de\u0001\u0000"+
		"\u0000\u0000\u001e\u00e0\u0001\u0000\u0000\u0000 \u00ee\u0001\u0000\u0000"+
		"\u0000\"\u00f0\u0001\u0000\u0000\u0000$\u00f2\u0001\u0000\u0000\u0000"+
		"&\u00f4\u0001\u0000\u0000\u0000(\u00f8\u0001\u0000\u0000\u0000*\u0100"+
		"\u0001\u0000\u0000\u0000,\u0107\u0001\u0000\u0000\u0000.\u010c\u0001\u0000"+
		"\u0000\u00000\u0111\u0001\u0000\u0000\u000023\u0003\u0002\u0001\u0000"+
		"34\u0005\u0000\u0000\u00014\u0001\u0001\u0000\u0000\u000057\u0003\u0004"+
		"\u0002\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009\u0003\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000;=\u0003\u0006\u0003\u0000<>\u0005\'\u0000"+
		"\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0005\u0001"+
		"\u0000\u0000\u0000?@\u0005\u0002\u0000\u0000@A\u0003\b\u0004\u0000AB\u0005"+
		"\u0003\u0000\u0000BE\u0003(\u0014\u0000CD\u0005\u0004\u0000\u0000DF\u0003"+
		" \u0010\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FQ\u0001"+
		"\u0000\u0000\u0000GH\u0005\u0005\u0000\u0000HI\u0005\u0006\u0000\u0000"+
		"IN\u0003\"\u0011\u0000JK\u0005&\u0000\u0000KM\u0003\"\u0011\u0000LJ\u0001"+
		"\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000QG\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RU\u0001\u0000"+
		"\u0000\u0000ST\u0005\u0007\u0000\u0000TV\u0003$\u0012\u0000US\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000Va\u0001\u0000\u0000\u0000WX\u0005"+
		"\b\u0000\u0000XY\u0005\u0006\u0000\u0000Y^\u0003&\u0013\u0000Z[\u0005"+
		"&\u0000\u0000[]\u0003&\u0013\u0000\\Z\u0001\u0000\u0000\u0000]`\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000aW\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000cd\u0005\u000b"+
		"\u0000\u0000df\u0005)\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fi\u0001\u0000\u0000\u0000gh\u0005\f\u0000\u0000hj\u0005)"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001"+
		"\u0000\u0000\u0000km\u0005\'\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000m\u0007\u0001\u0000\u0000\u0000np\u0005\r\u0000\u0000"+
		"on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pz\u0001\u0000\u0000"+
		"\u0000qv\u0003\n\u0005\u0000rs\u0005&\u0000\u0000su\u0003\n\u0005\u0000"+
		"tr\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000w{\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000y{\u0005!\u0000\u0000zq\u0001\u0000\u0000\u0000zy\u0001\u0000"+
		"\u0000\u0000{\t\u0001\u0000\u0000\u0000|\u0081\u0003\u000e\u0007\u0000"+
		"}\u007f\u0005\u0013\u0000\u0000~}\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0007"+
		"\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u008b\u0001\u0000\u0000\u0000\u0083\u0088\u0003\f\u0006"+
		"\u0000\u0084\u0086\u0005\u0013\u0000\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0089\u0007\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000"+
		"\u0000\u008a|\u0001\u0000\u0000\u0000\u008a\u0083\u0001\u0000\u0000\u0000"+
		"\u008b\u000b\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u000e\u0000\u0000"+
		"\u008d\u008e\u0005$\u0000\u0000\u008e\u008f\u0005!\u0000\u0000\u008f\u00aa"+
		"\u0005%\u0000\u0000\u0090\u0091\u0005\u000e\u0000\u0000\u0091\u0092\u0005"+
		"$\u0000\u0000\u0092\u0093\u0003\u000e\u0007\u0000\u0093\u0094\u0005%\u0000"+
		"\u0000\u0094\u00aa\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u000f\u0000"+
		"\u0000\u0096\u0097\u0005$\u0000\u0000\u0097\u0098\u0003\u000e\u0007\u0000"+
		"\u0098\u0099\u0005%\u0000\u0000\u0099\u00aa\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005\u0010\u0000\u0000\u009b\u009c\u0005$\u0000\u0000\u009c\u009d"+
		"\u0003\u000e\u0007\u0000\u009d\u009e\u0005%\u0000\u0000\u009e\u00aa\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005\u0011\u0000\u0000\u00a0\u00a1\u0005"+
		"$\u0000\u0000\u00a1\u00a2\u0003\u000e\u0007\u0000\u00a2\u00a3\u0005%\u0000"+
		"\u0000\u00a3\u00aa\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0012\u0000"+
		"\u0000\u00a5\u00a6\u0005$\u0000\u0000\u00a6\u00a7\u0003\u000e\u0007\u0000"+
		"\u00a7\u00a8\u0005%\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9"+
		"\u008c\u0001\u0000\u0000\u0000\u00a9\u0090\u0001\u0000\u0000\u0000\u00a9"+
		"\u0095\u0001\u0000\u0000\u0000\u00a9\u009a\u0001\u0000\u0000\u0000\u00a9"+
		"\u009f\u0001\u0000\u0000\u0000\u00a9\u00a4\u0001\u0000\u0000\u0000\u00aa"+
		"\r\u0001\u0000\u0000\u0000\u00ab\u00ae\u0003\u0010\b\u0000\u00ac\u00ae"+
		"\u0003\f\u0006\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u000f\u0001\u0000\u0000\u0000\u00af\u00b4\u0003"+
		"\u0012\t\u0000\u00b0\u00b1\u0005\u0017\u0000\u0000\u00b1\u00b3\u0003\u0012"+
		"\t\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u0011\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b7\u00bc\u0003\u0014\n\u0000\u00b8\u00b9\u0005\u0018\u0000\u0000"+
		"\u00b9\u00bb\u0003\u0014\n\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u0013\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c2\u0003\u0016\u000b\u0000\u00c0"+
		"\u00c1\u0007\u0001\u0000\u0000\u00c1\u00c3\u0003\u0016\u000b\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3"+
		"\u0015\u0001\u0000\u0000\u0000\u00c4\u00c9\u0003\u0018\f\u0000\u00c5\u00c6"+
		"\u0007\u0002\u0000\u0000\u00c6\u00c8\u0003\u0018\f\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u0017\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0007"+
		"\u0002\u0000\u0000\u00cd\u00d1\u0003\u0018\f\u0000\u00ce\u00d1\u0003\u001a"+
		"\r\u0000\u00cf\u00d1\u0003\u001e\u000f\u0000\u00d0\u00cc\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1\u0019\u0001\u0000\u0000\u0000\u00d2\u00d5\u0003\u001c\u000e"+
		"\u0000\u00d3\u00d4\u0005#\u0000\u0000\u00d4\u00d6\u0003\u0018\f\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d6\u001b\u0001\u0000\u0000\u0000\u00d7\u00df\u00030\u0018\u0000\u00d8"+
		"\u00df\u0003.\u0017\u0000\u00d9\u00df\u0003\u001e\u000f\u0000\u00da\u00db"+
		"\u0005$\u0000\u0000\u00db\u00dc\u0003\u000e\u0007\u0000\u00dc\u00dd\u0005"+
		"%\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00d7\u0001\u0000"+
		"\u0000\u0000\u00de\u00d8\u0001\u0000\u0000\u0000\u00de\u00d9\u0001\u0000"+
		"\u0000\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00df\u001d\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0007\u0000\u0000\u0000\u00e1\u00ea\u0005$\u0000"+
		"\u0000\u00e2\u00e7\u0003\u000e\u0007\u0000\u00e3\u00e4\u0005&\u0000\u0000"+
		"\u00e4\u00e6\u0003\u000e\u0007\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00e2\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0005%\u0000\u0000\u00ed\u001f\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0003\u000e\u0007\u0000\u00ef!\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0003\u000e\u0007\u0000\u00f1#\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003"+
		"\u000e\u0007\u0000\u00f3%\u0001\u0000\u0000\u0000\u00f4\u00f6\u0003\u000e"+
		"\u0007\u0000\u00f5\u00f7\u0007\u0003\u0000\u0000\u00f6\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\'\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fd\u0003*\u0015\u0000\u00f9\u00fa\u0005&\u0000\u0000\u00fa"+
		"\u00fc\u0003*\u0015\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00ff"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe)\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u0100\u0105\u0003,\u0016\u0000\u0101\u0103\u0005\u0013"+
		"\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0106\u0007\u0000"+
		"\u0000\u0000\u0105\u0102\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000"+
		"\u0000\u0000\u0106+\u0001\u0000\u0000\u0000\u0107\u010a\u0007\u0000\u0000"+
		"\u0000\u0108\u0109\u0005\u0001\u0000\u0000\u0109\u010b\u0007\u0000\u0000"+
		"\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b-\u0001\u0000\u0000\u0000\u010c\u010f\u0007\u0000\u0000\u0000"+
		"\u010d\u010e\u0005\u0001\u0000\u0000\u010e\u0110\u0007\u0000\u0000\u0000"+
		"\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000"+
		"\u0110/\u0001\u0000\u0000\u0000\u0111\u0112\u0007\u0004\u0000\u0000\u0112"+
		"1\u0001\u0000\u0000\u0000$8=ENQU^aeilovz~\u0081\u0085\u0088\u008a\u00a9"+
		"\u00ad\u00b4\u00bc\u00c2\u00c9\u00d0\u00d5\u00de\u00e7\u00ea\u00f6\u00fd"+
		"\u0102\u0105\u010a\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}