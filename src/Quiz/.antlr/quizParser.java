// Generated from /home/xuldir/Desktop/CompilationsProjectations/quiz-comp-05/src/Quiz/quiz.g4 by ANTLR 4.8

    package Quiz;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class quizParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, CORRECT=48, NUMBER=49, FLOAT=50, NAME=51, STRING=52, 
		COMMENT=53, NEWLINE=54, MULTICOMM=55, WS=56;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_expr = 2, RULE_quiz = 3, RULE_createReport = 4, 
		RULE_add = 5, RULE_sub_question = 6, RULE_sub_groups = 7, RULE_load = 8, 
		RULE_remove = 9, RULE_defineAnswer = 10, RULE_defineMark = 11, RULE_mark = 12, 
		RULE_showGroup = 13, RULE_showOpt = 14, RULE_evaluation = 15, RULE_multichoice = 16, 
		RULE_multichoiceoption = 17, RULE_matching = 18, RULE_matchingoption = 19, 
		RULE_match = 20, RULE_import_expr = 21, RULE_plist = 22, RULE_p = 23, 
		RULE_show = 24, RULE_question = 25, RULE_ques_opt = 26, RULE_shuffle = 27, 
		RULE_getAnswer = 28, RULE_getChoice = 29, RULE_getAnswerToChoice = 30, 
		RULE_shortQuestion = 31, RULE_numeric = 32, RULE_essay = 33, RULE_option = 34, 
		RULE_optionMult = 35, RULE_finishQuiz = 36, RULE_variable = 37, RULE_title = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "expr", "quiz", "createReport", "add", "sub_question", 
			"sub_groups", "load", "remove", "defineAnswer", "defineMark", "mark", 
			"showGroup", "showOpt", "evaluation", "multichoice", "multichoiceoption", 
			"matching", "matchingoption", "match", "import_expr", "plist", "p", "show", 
			"question", "ques_opt", "shuffle", "getAnswer", "getChoice", "getAnswerToChoice", 
			"shortQuestion", "numeric", "essay", "option", "optionMult", "finishQuiz", 
			"variable", "title"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create quiz'", "'title'", "'='", "'pass'", "'auto-corrective'", 
			"'create'", "'report'", "'add group'", "','", "'add'", "'to'", "'all'", 
			"'group'", "'load'", "'as'", "'remove'", "'from'", "'define-answer'", 
			"'define-mark'", "'if'", "'wrong'", "'show'", "'repeat'", "'times'", 
			"'discount'", "'{'", "'}'", "'evaluation'", "'multi-choice'", "'id'", 
			"'text'", "'option'", "'matching'", "'side'", "'match'", "'import'", 
			"'and'", "'with'", "'shuffle'", "'get'", "'answer'", "'choice'", "'short-question'", 
			"'numeric-question'", "'essay-question'", "'option-multi'", "'finish quiz'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"CORRECT", "NUMBER", "FLOAT", "NAME", "STRING", "COMMENT", "NEWLINE", 
			"MULTICOMM", "WS"
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
	public String getGrammarFileName() { return "quiz.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public quizParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(quizParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__21) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << NAME) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(78);
				stat();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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

	public static class StatContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__21) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << NAME))) != 0)) {
				{
				{
				setState(86);
				expr();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(NEWLINE);
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

	public static class ExprContext extends ParserRuleContext {
		public QuizContext quiz() {
			return getRuleContext(QuizContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public MultichoiceContext multichoice() {
			return getRuleContext(MultichoiceContext.class,0);
		}
		public MatchingContext matching() {
			return getRuleContext(MatchingContext.class,0);
		}
		public EvaluationContext evaluation() {
			return getRuleContext(EvaluationContext.class,0);
		}
		public RemoveContext remove() {
			return getRuleContext(RemoveContext.class,0);
		}
		public DefineAnswerContext defineAnswer() {
			return getRuleContext(DefineAnswerContext.class,0);
		}
		public ShowGroupContext showGroup() {
			return getRuleContext(ShowGroupContext.class,0);
		}
		public Import_exprContext import_expr() {
			return getRuleContext(Import_exprContext.class,0);
		}
		public ShowOptContext showOpt() {
			return getRuleContext(ShowOptContext.class,0);
		}
		public LoadContext load() {
			return getRuleContext(LoadContext.class,0);
		}
		public ShortQuestionContext shortQuestion() {
			return getRuleContext(ShortQuestionContext.class,0);
		}
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public EssayContext essay() {
			return getRuleContext(EssayContext.class,0);
		}
		public CreateReportContext createReport() {
			return getRuleContext(CreateReportContext.class,0);
		}
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public FinishQuizContext finishQuiz() {
			return getRuleContext(FinishQuizContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				quiz();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				add();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				multichoice();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				matching();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				evaluation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				remove();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				defineAnswer();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(101);
				showGroup();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(102);
				import_expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(103);
				showOpt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(104);
				load();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(105);
				shortQuestion();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(106);
				numeric();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(107);
				essay();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(108);
				createReport();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(109);
				option();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(110);
				finishQuiz();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(111);
				variable();
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

	public static class QuizContext extends ParserRuleContext {
		public QuizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quiz; }
	 
		public QuizContext() { }
		public void copyFrom(QuizContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateQuizCorrectionContext extends QuizContext {
		public List<TerminalNode> STRING() { return getTokens(quizParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(quizParser.STRING, i);
		}
		public TerminalNode NUMBER() { return getToken(quizParser.NUMBER, 0); }
		public CreateQuizCorrectionContext(QuizContext ctx) { copyFrom(ctx); }
	}
	public static class CreateQuizContext extends QuizContext {
		public List<TerminalNode> STRING() { return getTokens(quizParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(quizParser.STRING, i);
		}
		public CreateQuizContext(QuizContext ctx) { copyFrom(ctx); }
	}

	public final QuizContext quiz() throws RecognitionException {
		QuizContext _localctx = new QuizContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_quiz);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new CreateQuizContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(T__0);
				setState(115);
				match(T__1);
				setState(116);
				match(T__2);
				setState(117);
				match(STRING);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(118);
					match(T__3);
					setState(119);
					match(T__2);
					setState(120);
					match(STRING);
					}
				}

				}
				break;
			case 2:
				_localctx = new CreateQuizCorrectionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(T__0);
				setState(124);
				match(T__1);
				setState(125);
				match(T__2);
				setState(126);
				match(STRING);
				setState(127);
				match(T__4);
				setState(128);
				match(NUMBER);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(129);
					match(T__3);
					setState(130);
					match(T__2);
					setState(131);
					match(STRING);
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

	public static class CreateReportContext extends ParserRuleContext {
		public CreateReportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createReport; }
	}

	public final CreateReportContext createReport() throws RecognitionException {
		CreateReportContext _localctx = new CreateReportContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createReport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__5);
			setState(137);
			match(T__6);
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

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	 
		public AddContext() { }
		public void copyFrom(AddContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddOptionContext extends AddContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public Sub_questionContext sub_question() {
			return getRuleContext(Sub_questionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public AddOptionContext(AddContext ctx) { copyFrom(ctx); }
	}
	public static class CreateGroupContext extends AddContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public CreateGroupContext(AddContext ctx) { copyFrom(ctx); }
	}
	public static class AddAllContext extends AddContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public AddAllContext(AddContext ctx) { copyFrom(ctx); }
	}
	public static class CreateMultiGroupContext extends AddContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public CreateMultiGroupContext(AddContext ctx) { copyFrom(ctx); }
	}
	public static class AddQuestion2GroupContext extends AddContext {
		public Sub_questionContext sub_question() {
			return getRuleContext(Sub_questionContext.class,0);
		}
		public Sub_groupsContext sub_groups() {
			return getRuleContext(Sub_groupsContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public AddQuestion2GroupContext(AddContext ctx) { copyFrom(ctx); }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_add);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new CreateGroupContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(T__7);
				setState(140);
				match(NAME);
				setState(141);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new CreateMultiGroupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__7);
				setState(143);
				match(NAME);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(144);
					match(T__8);
					setState(145);
					match(NAME);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new AddOptionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(T__9);
				setState(153);
				match(NAME);
				setState(154);
				match(T__10);
				setState(155);
				sub_question();
				setState(156);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new AddAllContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(T__9);
				setState(159);
				match(NAME);
				setState(160);
				match(T__10);
				setState(161);
				match(T__11);
				setState(162);
				match(NEWLINE);
				}
				break;
			case 5:
				_localctx = new AddQuestion2GroupContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(T__9);
				setState(164);
				sub_question();
				setState(165);
				match(T__10);
				setState(166);
				match(T__12);
				setState(167);
				sub_groups();
				setState(168);
				match(NEWLINE);
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

	public static class Sub_questionContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public Sub_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_question; }
	}

	public final Sub_questionContext sub_question() throws RecognitionException {
		Sub_questionContext _localctx = new Sub_questionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sub_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(NAME);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(173);
				match(T__8);
				setState(174);
				match(NAME);
				}
				}
				setState(179);
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

	public static class Sub_groupsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public Sub_groupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_groups; }
	}

	public final Sub_groupsContext sub_groups() throws RecognitionException {
		Sub_groupsContext _localctx = new Sub_groupsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sub_groups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(NAME);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(181);
				match(T__8);
				setState(182);
				match(NAME);
				}
				}
				setState(187);
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

	public static class LoadContext extends ParserRuleContext {
		public LoadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load; }
	 
		public LoadContext() { }
		public void copyFrom(LoadContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoadBancoContext extends LoadContext {
		public TerminalNode STRING() { return getToken(quizParser.STRING, 0); }
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public LoadBancoContext(LoadContext ctx) { copyFrom(ctx); }
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_load);
		try {
			_localctx = new LoadBancoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__13);
			setState(189);
			match(STRING);
			setState(190);
			match(T__14);
			setState(191);
			match(NAME);
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

	public static class RemoveContext extends ParserRuleContext {
		public RemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove; }
	 
		public RemoveContext() { }
		public void copyFrom(RemoveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EliminarContext extends RemoveContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public EliminarContext(RemoveContext ctx) { copyFrom(ctx); }
	}

	public final RemoveContext remove() throws RecognitionException {
		RemoveContext _localctx = new RemoveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_remove);
		try {
			_localctx = new EliminarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__15);
			setState(194);
			match(NAME);
			setState(195);
			match(T__16);
			setState(196);
			match(NAME);
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

	public static class DefineAnswerContext extends ParserRuleContext {
		public DefineAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineAnswer; }
	 
		public DefineAnswerContext() { }
		public void copyFrom(DefineAnswerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefinirRespostaContext extends DefineAnswerContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public Sub_questionContext sub_question() {
			return getRuleContext(Sub_questionContext.class,0);
		}
		public DefinirRespostaContext(DefineAnswerContext ctx) { copyFrom(ctx); }
	}

	public final DefineAnswerContext defineAnswer() throws RecognitionException {
		DefineAnswerContext _localctx = new DefineAnswerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defineAnswer);
		try {
			_localctx = new DefinirRespostaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__17);
			setState(199);
			match(NAME);
			setState(200);
			match(T__10);
			setState(201);
			sub_question();
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

	public static class DefineMarkContext extends ParserRuleContext {
		public DefineMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineMark; }
	 
		public DefineMarkContext() { }
		public void copyFrom(DefineMarkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefinirCotacaoMudaPerguntaContext extends DefineMarkContext {
		public MarkContext mark() {
			return getRuleContext(MarkContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public DefinirCotacaoMudaPerguntaContext(DefineMarkContext ctx) { copyFrom(ctx); }
	}
	public static class DefinirCotacaoSemDescontoContext extends DefineMarkContext {
		public MarkContext mark() {
			return getRuleContext(MarkContext.class,0);
		}
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public DefinirCotacaoSemDescontoContext(DefineMarkContext ctx) { copyFrom(ctx); }
	}
	public static class DefinirCotacaoDescontarContext extends DefineMarkContext {
		public List<MarkContext> mark() {
			return getRuleContexts(MarkContext.class);
		}
		public MarkContext mark(int i) {
			return getRuleContext(MarkContext.class,i);
		}
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(quizParser.NUMBER, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public DefinirCotacaoDescontarContext(DefineMarkContext ctx) { copyFrom(ctx); }
	}

	public final DefineMarkContext defineMark() throws RecognitionException {
		DefineMarkContext _localctx = new DefineMarkContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defineMark);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new DefinirCotacaoSemDescontoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(T__18);
				setState(204);
				mark();
				setState(205);
				match(T__10);
				setState(206);
				match(NAME);
				setState(207);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new DefinirCotacaoMudaPerguntaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__18);
				setState(210);
				mark();
				setState(211);
				match(T__10);
				setState(212);
				match(NAME);
				setState(213);
				match(T__19);
				setState(214);
				match(T__20);
				setState(215);
				match(T__21);
				setState(216);
				match(NAME);
				setState(217);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new DefinirCotacaoDescontarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(T__18);
				setState(220);
				mark();
				setState(221);
				match(T__10);
				setState(222);
				match(NAME);
				setState(223);
				match(T__19);
				setState(224);
				match(T__20);
				setState(225);
				match(T__22);
				setState(226);
				match(NUMBER);
				setState(227);
				match(T__23);
				setState(228);
				match(T__24);
				setState(229);
				match(T__2);
				setState(230);
				mark();
				setState(231);
				match(NEWLINE);
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

	public static class MarkContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(quizParser.FLOAT, 0); }
		public TerminalNode NUMBER() { return getToken(quizParser.NUMBER, 0); }
		public MarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mark; }
	}

	public final MarkContext mark() throws RecognitionException {
		MarkContext _localctx = new MarkContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mark);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==FLOAT) ) {
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

	public static class ShowGroupContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(quizParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(quizParser.NEWLINE, i);
		}
		public List<ShowOptContext> showOpt() {
			return getRuleContexts(ShowOptContext.class);
		}
		public ShowOptContext showOpt(int i) {
			return getRuleContext(ShowOptContext.class,i);
		}
		public ShowGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showGroup; }
	}

	public final ShowGroupContext showGroup() throws RecognitionException {
		ShowGroupContext _localctx = new ShowGroupContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_showGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__21);
			setState(238);
			match(T__12);
			setState(239);
			match(NAME);
			setState(240);
			match(T__25);
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(241);
				match(NEWLINE);
				}
				break;
			}
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__38) | (1L << T__39))) != 0)) {
				{
				{
				setState(244);
				showOpt();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(250);
				match(NEWLINE);
				}
			}

			setState(253);
			match(T__26);
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

	public static class ShowOptContext extends ParserRuleContext {
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public ShuffleContext shuffle() {
			return getRuleContext(ShuffleContext.class,0);
		}
		public GetAnswerContext getAnswer() {
			return getRuleContext(GetAnswerContext.class,0);
		}
		public GetChoiceContext getChoice() {
			return getRuleContext(GetChoiceContext.class,0);
		}
		public GetAnswerToChoiceContext getAnswerToChoice() {
			return getRuleContext(GetAnswerToChoiceContext.class,0);
		}
		public ShowOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showOpt; }
	}

	public final ShowOptContext showOpt() throws RecognitionException {
		ShowOptContext _localctx = new ShowOptContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_showOpt);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				show();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				shuffle();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				getAnswer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				getChoice();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				getAnswerToChoice();
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

	public static class EvaluationContext extends ParserRuleContext {
		public EvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluation; }
	 
		public EvaluationContext() { }
		public void copyFrom(EvaluationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AvaliarContext extends EvaluationContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public List<DefineMarkContext> defineMark() {
			return getRuleContexts(DefineMarkContext.class);
		}
		public DefineMarkContext defineMark(int i) {
			return getRuleContext(DefineMarkContext.class,i);
		}
		public AvaliarContext(EvaluationContext ctx) { copyFrom(ctx); }
	}

	public final EvaluationContext evaluation() throws RecognitionException {
		EvaluationContext _localctx = new EvaluationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_evaluation);
		int _la;
		try {
			_localctx = new AvaliarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__27);
			setState(263);
			match(T__12);
			setState(264);
			match(NAME);
			setState(265);
			match(T__25);
			setState(266);
			match(NEWLINE);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(267);
				defineMark();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(T__26);
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

	public static class MultichoiceContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public List<MultichoiceoptionContext> multichoiceoption() {
			return getRuleContexts(MultichoiceoptionContext.class);
		}
		public MultichoiceoptionContext multichoiceoption(int i) {
			return getRuleContext(MultichoiceoptionContext.class,i);
		}
		public MultichoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multichoice; }
	}

	public final MultichoiceContext multichoice() throws RecognitionException {
		MultichoiceContext _localctx = new MultichoiceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multichoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__28);
			setState(276);
			match(T__29);
			setState(277);
			match(T__2);
			setState(278);
			match(NAME);
			setState(279);
			match(T__30);
			setState(280);
			match(T__2);
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(281);
				title();
				}
				break;
			case NAME:
				{
				setState(282);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(285);
			match(T__25);
			setState(286);
			match(NEWLINE);
			setState(288); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(287);
				multichoiceoption();
				}
				}
				setState(290); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__31 );
			setState(292);
			match(T__26);
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

	public static class MultichoiceoptionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(quizParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public MultichoiceoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multichoiceoption; }
	}

	public final MultichoiceoptionContext multichoiceoption() throws RecognitionException {
		MultichoiceoptionContext _localctx = new MultichoiceoptionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multichoiceoption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__31);
			setState(295);
			match(T__29);
			setState(296);
			match(T__2);
			setState(297);
			match(NAME);
			setState(298);
			match(T__30);
			setState(299);
			match(T__2);
			setState(300);
			match(STRING);
			setState(301);
			match(NEWLINE);
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

	public static class MatchingContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public List<MatchingoptionContext> matchingoption() {
			return getRuleContexts(MatchingoptionContext.class);
		}
		public MatchingoptionContext matchingoption(int i) {
			return getRuleContext(MatchingoptionContext.class,i);
		}
		public MatchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching; }
	}

	public final MatchingContext matching() throws RecognitionException {
		MatchingContext _localctx = new MatchingContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_matching);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__32);
			setState(304);
			match(T__29);
			setState(305);
			match(T__2);
			setState(306);
			match(NAME);
			setState(307);
			match(T__30);
			setState(308);
			match(T__2);
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(309);
				title();
				}
				break;
			case NAME:
				{
				setState(310);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(313);
			match(T__25);
			setState(314);
			match(NEWLINE);
			setState(316); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(315);
				matchingoption();
				}
				}
				setState(318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__31 );
			setState(320);
			match(T__26);
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

	public static class MatchingoptionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode CORRECT() { return getToken(quizParser.CORRECT, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public MatchingoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchingoption; }
	}

	public final MatchingoptionContext matchingoption() throws RecognitionException {
		MatchingoptionContext _localctx = new MatchingoptionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_matchingoption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__31);
			setState(323);
			match(T__29);
			setState(324);
			match(T__2);
			setState(325);
			match(NAME);
			setState(326);
			match(T__30);
			setState(327);
			match(T__2);
			setState(328);
			title();
			setState(329);
			match(T__33);
			setState(330);
			match(T__2);
			setState(331);
			match(CORRECT);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(332);
				match(T__34);
				setState(333);
				match(T__2);
				setState(334);
				match();
				}
			}

			setState(337);
			match(NEWLINE);
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

	public static class MatchContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(NAME);
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

	public static class Import_exprContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public PlistContext plist() {
			return getRuleContext(PlistContext.class,0);
		}
		public Import_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_expr; }
	}

	public final Import_exprContext import_expr() throws RecognitionException {
		Import_exprContext _localctx = new Import_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_import_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__16);
			setState(342);
			match(NAME);
			setState(343);
			match(T__35);
			setState(344);
			plist();
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

	public static class PlistContext extends ParserRuleContext {
		public List<PContext> p() {
			return getRuleContexts(PContext.class);
		}
		public PContext p(int i) {
			return getRuleContext(PContext.class,i);
		}
		public PlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plist; }
	}

	public final PlistContext plist() throws RecognitionException {
		PlistContext _localctx = new PlistContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_plist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			p();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(347);
				match(T__8);
				setState(348);
				p();
				}
				}
				setState(353);
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

	public static class PContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_p);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(NAME);
				setState(356);
				match(T__14);
				setState(357);
				match(NAME);
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

	public static class ShowContext extends ParserRuleContext {
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	 
		public ShowContext() { }
		public void copyFrom(ShowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowQuestionMultiOptandQuestionContext extends ShowContext {
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public ShowQuestionMultiOptandQuestionContext(ShowContext ctx) { copyFrom(ctx); }
	}
	public static class ShowQuestionMultiOptContext extends ShowContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public Ques_optContext ques_opt() {
			return getRuleContext(Ques_optContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public ShowQuestionMultiOptContext(ShowContext ctx) { copyFrom(ctx); }
	}
	public static class ShowQuestionBasicContext extends ShowContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public ShowQuestionBasicContext(ShowContext ctx) { copyFrom(ctx); }
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_show);
		int _la;
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new ShowQuestionBasicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(T__21);
				setState(361);
				match(NAME);
				setState(362);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new ShowQuestionMultiOptContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(T__21);
				setState(364);
				match(NAME);
				setState(365);
				ques_opt();
				setState(366);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new ShowQuestionMultiOptandQuestionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				match(T__21);
				setState(369);
				question();
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__36) {
					{
					{
					setState(370);
					match(T__36);
					setState(371);
					question();
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(377);
				match(NEWLINE);
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

	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public Ques_optContext ques_opt() {
			return getRuleContext(Ques_optContext.class,0);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(NAME);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(382);
				ques_opt();
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

	public static class Ques_optContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public Ques_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ques_opt; }
	}

	public final Ques_optContext ques_opt() throws RecognitionException {
		Ques_optContext _localctx = new Ques_optContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ques_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(385);
			match(T__37);
			setState(386);
			match(NAME);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(387);
				match(T__8);
				setState(388);
				match(NAME);
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ShuffleContext extends ParserRuleContext {
		public ShuffleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shuffle; }
	 
		public ShuffleContext() { }
		public void copyFrom(ShuffleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShuffleQuestionContext extends ShuffleContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public ShuffleQuestionContext(ShuffleContext ctx) { copyFrom(ctx); }
	}

	public final ShuffleContext shuffle() throws RecognitionException {
		ShuffleContext _localctx = new ShuffleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_shuffle);
		try {
			_localctx = new ShuffleQuestionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(T__38);
			setState(395);
			match(NAME);
			setState(396);
			match(NEWLINE);
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

	public static class GetAnswerContext extends ParserRuleContext {
		public GetAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getAnswer; }
	 
		public GetAnswerContext() { }
		public void copyFrom(GetAnswerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetAnswerNumContext extends GetAnswerContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public GetAnswerNumContext(GetAnswerContext ctx) { copyFrom(ctx); }
	}

	public final GetAnswerContext getAnswer() throws RecognitionException {
		GetAnswerContext _localctx = new GetAnswerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_getAnswer);
		try {
			_localctx = new GetAnswerNumContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(T__39);
			setState(399);
			match(T__40);
			setState(400);
			match(T__10);
			setState(401);
			match(NAME);
			setState(402);
			match(NEWLINE);
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

	public static class GetChoiceContext extends ParserRuleContext {
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public GetChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getChoice; }
	}

	public final GetChoiceContext getChoice() throws RecognitionException {
		GetChoiceContext _localctx = new GetChoiceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_getChoice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__39);
			setState(405);
			match(T__41);
			setState(406);
			question();
			setState(407);
			match(T__36);
			setState(408);
			question();
			setState(409);
			match(NEWLINE);
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

	public static class GetAnswerToChoiceContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public GetAnswerToChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getAnswerToChoice; }
	}

	public final GetAnswerToChoiceContext getAnswerToChoice() throws RecognitionException {
		GetAnswerToChoiceContext _localctx = new GetAnswerToChoiceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_getAnswerToChoice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(T__39);
			setState(412);
			match(T__40);
			setState(413);
			match(T__10);
			setState(414);
			match(T__41);
			setState(415);
			match(NEWLINE);
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

	public static class ShortQuestionContext extends ParserRuleContext {
		public ShortQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortQuestion; }
	 
		public ShortQuestionContext() { }
		public void copyFrom(ShortQuestionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RespostaCurtaContext extends ShortQuestionContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(quizParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(quizParser.STRING, i);
		}
		public RespostaCurtaContext(ShortQuestionContext ctx) { copyFrom(ctx); }
	}

	public final ShortQuestionContext shortQuestion() throws RecognitionException {
		ShortQuestionContext _localctx = new ShortQuestionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_shortQuestion);
		int _la;
		try {
			_localctx = new RespostaCurtaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(T__42);
			setState(418);
			match(T__29);
			setState(419);
			match(T__2);
			setState(420);
			match(NAME);
			setState(421);
			match(T__30);
			setState(422);
			match(T__2);
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(423);
				title();
				}
				break;
			case NAME:
				{
				setState(424);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(427);
				match(T__40);
				setState(428);
				match(T__2);
				setState(429);
				match(STRING);
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(430);
					match(T__8);
					setState(431);
					match(T__40);
					setState(432);
					match(T__2);
					setState(433);
					match(STRING);
					}
					}
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(441);
			match(NEWLINE);
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

	public static class NumericContext extends ParserRuleContext {
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
	 
		public NumericContext() { }
		public void copyFrom(NumericContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumericQuestionContext extends NumericContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public MarkContext mark() {
			return getRuleContext(MarkContext.class,0);
		}
		public NumericQuestionContext(NumericContext ctx) { copyFrom(ctx); }
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_numeric);
		int _la;
		try {
			_localctx = new NumericQuestionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(T__43);
			setState(444);
			match(T__29);
			setState(445);
			match(T__2);
			setState(446);
			match(NAME);
			setState(447);
			match(T__30);
			setState(448);
			match(T__2);
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(449);
				title();
				}
				break;
			case NAME:
				{
				setState(450);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(453);
				match(T__40);
				setState(454);
				match(T__2);
				setState(455);
				mark();
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

	public static class EssayContext extends ParserRuleContext {
		public EssayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_essay; }
	 
		public EssayContext() { }
		public void copyFrom(EssayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EssayQuestionContext extends EssayContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public EssayQuestionContext(EssayContext ctx) { copyFrom(ctx); }
	}

	public final EssayContext essay() throws RecognitionException {
		EssayContext _localctx = new EssayContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_essay);
		try {
			_localctx = new EssayQuestionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(T__44);
			setState(459);
			match(T__29);
			setState(460);
			match(T__2);
			setState(461);
			match(NAME);
			setState(462);
			match(T__30);
			setState(463);
			match(T__2);
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(464);
				title();
				}
				break;
			case NAME:
				{
				setState(465);
				match(NAME);
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

	public static class OptionContext extends ParserRuleContext {
		public OptionMultContext optionMult() {
			return getRuleContext(OptionMultContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			optionMult();
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

	public static class OptionMultContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(quizParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public OptionMultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionMult; }
	}

	public final OptionMultContext optionMult() throws RecognitionException {
		OptionMultContext _localctx = new OptionMultContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_optionMult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(T__45);
			setState(471);
			match(T__29);
			setState(472);
			match(T__2);
			setState(473);
			match(NAME);
			setState(474);
			match(T__30);
			setState(475);
			match(T__2);
			setState(476);
			match(STRING);
			setState(477);
			match(NEWLINE);
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

	public static class FinishQuizContext extends ParserRuleContext {
		public FinishQuizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finishQuiz; }
	}

	public final FinishQuizContext finishQuiz() throws RecognitionException {
		FinishQuizContext _localctx = new FinishQuizContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_finishQuiz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(T__46);
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

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberVariableContext extends VariableContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public MarkContext mark() {
			return getRuleContext(MarkContext.class,0);
		}
		public NumberVariableContext(VariableContext ctx) { copyFrom(ctx); }
	}
	public static class TextVariableContext extends VariableContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(quizParser.STRING, 0); }
		public TextVariableContext(VariableContext ctx) { copyFrom(ctx); }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variable);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new NumberVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(NAME);
				setState(482);
				match(T__2);
				setState(483);
				mark();
				}
				break;
			case 2:
				_localctx = new TextVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(NAME);
				setState(485);
				match(T__2);
				setState(486);
				match(STRING);
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(quizParser.STRING, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(STRING);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\2\3\2\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4s\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5|\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u0087\n\5\5\5\u0089\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u0095\n\7\f\7\16\7\u0098\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ad\n\7\3\b\3\b\3\b\7\b\u00b2"+
		"\n\b\f\b\16\b\u00b5\13\b\3\t\3\t\3\t\7\t\u00ba\n\t\f\t\16\t\u00bd\13\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ec\n\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00f5\n\17\3\17\7\17\u00f8\n\17\f\17\16"+
		"\17\u00fb\13\17\3\17\5\17\u00fe\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0107\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u010f\n\21\f\21\16"+
		"\21\u0112\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u011e\n\22\3\22\3\22\3\22\6\22\u0123\n\22\r\22\16\22\u0124\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u013a\n\24\3\24\3\24\3\24\6\24\u013f\n\24\r\24\16"+
		"\24\u0140\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0152\n\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\7\30\u0160\n\30\f\30\16\30\u0163\13\30\3\31\3\31"+
		"\3\31\3\31\5\31\u0169\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u0177\n\32\f\32\16\32\u017a\13\32\3\32\3\32\5\32"+
		"\u017e\n\32\3\33\3\33\5\33\u0182\n\33\3\34\3\34\3\34\3\34\7\34\u0188\n"+
		"\34\f\34\16\34\u018b\13\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\5!\u01ac\n!\3!\3!\3!\3!\3!\3!\3!\7!\u01b5\n!\f!\16!\u01b8"+
		"\13!\5!\u01ba\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01c6\n\"\3"+
		"\"\3\"\3\"\5\"\u01cb\n\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01d5\n#\3$\3$\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01ea\n\'\3"+
		"(\3(\3(\2\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLN\2\3\3\2\63\64\2\u0200\2S\3\2\2\2\4[\3\2\2\2\6r\3\2\2\2"+
		"\b\u0088\3\2\2\2\n\u008a\3\2\2\2\f\u00ac\3\2\2\2\16\u00ae\3\2\2\2\20\u00b6"+
		"\3\2\2\2\22\u00be\3\2\2\2\24\u00c3\3\2\2\2\26\u00c8\3\2\2\2\30\u00eb\3"+
		"\2\2\2\32\u00ed\3\2\2\2\34\u00ef\3\2\2\2\36\u0106\3\2\2\2 \u0108\3\2\2"+
		"\2\"\u0115\3\2\2\2$\u0128\3\2\2\2&\u0131\3\2\2\2(\u0144\3\2\2\2*\u0155"+
		"\3\2\2\2,\u0157\3\2\2\2.\u015c\3\2\2\2\60\u0168\3\2\2\2\62\u017d\3\2\2"+
		"\2\64\u017f\3\2\2\2\66\u0183\3\2\2\28\u018c\3\2\2\2:\u0190\3\2\2\2<\u0196"+
		"\3\2\2\2>\u019d\3\2\2\2@\u01a3\3\2\2\2B\u01bd\3\2\2\2D\u01cc\3\2\2\2F"+
		"\u01d6\3\2\2\2H\u01d8\3\2\2\2J\u01e1\3\2\2\2L\u01e9\3\2\2\2N\u01eb\3\2"+
		"\2\2PR\5\4\3\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2"+
		"\2\2VW\7\2\2\3W\3\3\2\2\2XZ\5\6\4\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3"+
		"\2\2\2\\^\3\2\2\2][\3\2\2\2^_\78\2\2_\5\3\2\2\2`s\5\b\5\2as\5\f\7\2bs"+
		"\5\"\22\2cs\5&\24\2ds\5 \21\2es\5\24\13\2fs\5\26\f\2gs\5\34\17\2hs\5,"+
		"\27\2is\5\36\20\2js\5\22\n\2ks\5@!\2ls\5B\"\2ms\5D#\2ns\5\n\6\2os\5F$"+
		"\2ps\5J&\2qs\5L\'\2r`\3\2\2\2ra\3\2\2\2rb\3\2\2\2rc\3\2\2\2rd\3\2\2\2"+
		"re\3\2\2\2rf\3\2\2\2rg\3\2\2\2rh\3\2\2\2ri\3\2\2\2rj\3\2\2\2rk\3\2\2\2"+
		"rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\7\3\2\2"+
		"\2tu\7\3\2\2uv\7\4\2\2vw\7\5\2\2w{\7\66\2\2xy\7\6\2\2yz\7\5\2\2z|\7\66"+
		"\2\2{x\3\2\2\2{|\3\2\2\2|\u0089\3\2\2\2}~\7\3\2\2~\177\7\4\2\2\177\u0080"+
		"\7\5\2\2\u0080\u0081\7\66\2\2\u0081\u0082\7\7\2\2\u0082\u0086\7\63\2\2"+
		"\u0083\u0084\7\6\2\2\u0084\u0085\7\5\2\2\u0085\u0087\7\66\2\2\u0086\u0083"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088t\3\2\2\2\u0088"+
		"}\3\2\2\2\u0089\t\3\2\2\2\u008a\u008b\7\b\2\2\u008b\u008c\7\t\2\2\u008c"+
		"\13\3\2\2\2\u008d\u008e\7\n\2\2\u008e\u008f\7\65\2\2\u008f\u00ad\78\2"+
		"\2\u0090\u0091\7\n\2\2\u0091\u0096\7\65\2\2\u0092\u0093\7\13\2\2\u0093"+
		"\u0095\7\65\2\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u00ad\78\2\2\u009a\u009b\7\f\2\2\u009b\u009c\7\65\2\2\u009c\u009d\7\r"+
		"\2\2\u009d\u009e\5\16\b\2\u009e\u009f\78\2\2\u009f\u00ad\3\2\2\2\u00a0"+
		"\u00a1\7\f\2\2\u00a1\u00a2\7\65\2\2\u00a2\u00a3\7\r\2\2\u00a3\u00a4\7"+
		"\16\2\2\u00a4\u00ad\78\2\2\u00a5\u00a6\7\f\2\2\u00a6\u00a7\5\16\b\2\u00a7"+
		"\u00a8\7\r\2\2\u00a8\u00a9\7\17\2\2\u00a9\u00aa\5\20\t\2\u00aa\u00ab\7"+
		"8\2\2\u00ab\u00ad\3\2\2\2\u00ac\u008d\3\2\2\2\u00ac\u0090\3\2\2\2\u00ac"+
		"\u009a\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ad\r\3\2\2\2"+
		"\u00ae\u00b3\7\65\2\2\u00af\u00b0\7\13\2\2\u00b0\u00b2\7\65\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\17\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00bb\7\65\2\2\u00b7\u00b8"+
		"\7\13\2\2\u00b8\u00ba\7\65\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2"+
		"\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\21\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00be\u00bf\7\20\2\2\u00bf\u00c0\7\66\2\2\u00c0\u00c1\7\21\2"+
		"\2\u00c1\u00c2\7\65\2\2\u00c2\23\3\2\2\2\u00c3\u00c4\7\22\2\2\u00c4\u00c5"+
		"\7\65\2\2\u00c5\u00c6\7\23\2\2\u00c6\u00c7\7\65\2\2\u00c7\25\3\2\2\2\u00c8"+
		"\u00c9\7\24\2\2\u00c9\u00ca\7\65\2\2\u00ca\u00cb\7\r\2\2\u00cb\u00cc\5"+
		"\16\b\2\u00cc\27\3\2\2\2\u00cd\u00ce\7\25\2\2\u00ce\u00cf\5\32\16\2\u00cf"+
		"\u00d0\7\r\2\2\u00d0\u00d1\7\65\2\2\u00d1\u00d2\78\2\2\u00d2\u00ec\3\2"+
		"\2\2\u00d3\u00d4\7\25\2\2\u00d4\u00d5\5\32\16\2\u00d5\u00d6\7\r\2\2\u00d6"+
		"\u00d7\7\65\2\2\u00d7\u00d8\7\26\2\2\u00d8\u00d9\7\27\2\2\u00d9\u00da"+
		"\7\30\2\2\u00da\u00db\7\65\2\2\u00db\u00dc\78\2\2\u00dc\u00ec\3\2\2\2"+
		"\u00dd\u00de\7\25\2\2\u00de\u00df\5\32\16\2\u00df\u00e0\7\r\2\2\u00e0"+
		"\u00e1\7\65\2\2\u00e1\u00e2\7\26\2\2\u00e2\u00e3\7\27\2\2\u00e3\u00e4"+
		"\7\31\2\2\u00e4\u00e5\7\63\2\2\u00e5\u00e6\7\32\2\2\u00e6\u00e7\7\33\2"+
		"\2\u00e7\u00e8\7\5\2\2\u00e8\u00e9\5\32\16\2\u00e9\u00ea\78\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00cd\3\2\2\2\u00eb\u00d3\3\2\2\2\u00eb\u00dd\3\2"+
		"\2\2\u00ec\31\3\2\2\2\u00ed\u00ee\t\2\2\2\u00ee\33\3\2\2\2\u00ef\u00f0"+
		"\7\30\2\2\u00f0\u00f1\7\17\2\2\u00f1\u00f2\7\65\2\2\u00f2\u00f4\7\34\2"+
		"\2\u00f3\u00f5\78\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f9"+
		"\3\2\2\2\u00f6\u00f8\5\36\20\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2"+
		"\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00fe\78\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\7\35\2\2\u0100\35\3\2\2\2\u0101\u0107\5\62"+
		"\32\2\u0102\u0107\58\35\2\u0103\u0107\5:\36\2\u0104\u0107\5<\37\2\u0105"+
		"\u0107\5> \2\u0106\u0101\3\2\2\2\u0106\u0102\3\2\2\2\u0106\u0103\3\2\2"+
		"\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\37\3\2\2\2\u0108\u0109"+
		"\7\36\2\2\u0109\u010a\7\17\2\2\u010a\u010b\7\65\2\2\u010b\u010c\7\34\2"+
		"\2\u010c\u0110\78\2\2\u010d\u010f\5\30\r\2\u010e\u010d\3\2\2\2\u010f\u0112"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0114\7\35\2\2\u0114!\3\2\2\2\u0115\u0116\7\37\2"+
		"\2\u0116\u0117\7 \2\2\u0117\u0118\7\5\2\2\u0118\u0119\7\65\2\2\u0119\u011a"+
		"\7!\2\2\u011a\u011d\7\5\2\2\u011b\u011e\5N(\2\u011c\u011e\7\65\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7\34"+
		"\2\2\u0120\u0122\78\2\2\u0121\u0123\5$\23\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0127\7\35\2\2\u0127#\3\2\2\2\u0128\u0129\7\"\2\2\u0129\u012a"+
		"\7 \2\2\u012a\u012b\7\5\2\2\u012b\u012c\7\65\2\2\u012c\u012d\7!\2\2\u012d"+
		"\u012e\7\5\2\2\u012e\u012f\7\66\2\2\u012f\u0130\78\2\2\u0130%\3\2\2\2"+
		"\u0131\u0132\7#\2\2\u0132\u0133\7 \2\2\u0133\u0134\7\5\2\2\u0134\u0135"+
		"\7\65\2\2\u0135\u0136\7!\2\2\u0136\u0139\7\5\2\2\u0137\u013a\5N(\2\u0138"+
		"\u013a\7\65\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3"+
		"\2\2\2\u013b\u013c\7\34\2\2\u013c\u013e\78\2\2\u013d\u013f\5(\25\2\u013e"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7\35\2\2\u0143\'\3\2\2\2\u0144\u0145"+
		"\7\"\2\2\u0145\u0146\7 \2\2\u0146\u0147\7\5\2\2\u0147\u0148\7\65\2\2\u0148"+
		"\u0149\7!\2\2\u0149\u014a\7\5\2\2\u014a\u014b\5N(\2\u014b\u014c\7$\2\2"+
		"\u014c\u014d\7\5\2\2\u014d\u0151\7\62\2\2\u014e\u014f\7%\2\2\u014f\u0150"+
		"\7\5\2\2\u0150\u0152\5*\26\2\u0151\u014e\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\78\2\2\u0154)\3\2\2\2\u0155\u0156\7\65\2\2"+
		"\u0156+\3\2\2\2\u0157\u0158\7\23\2\2\u0158\u0159\7\65\2\2\u0159\u015a"+
		"\7&\2\2\u015a\u015b\5.\30\2\u015b-\3\2\2\2\u015c\u0161\5\60\31\2\u015d"+
		"\u015e\7\13\2\2\u015e\u0160\5\60\31\2\u015f\u015d\3\2\2\2\u0160\u0163"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162/\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0169\7\65\2\2\u0165\u0166\7\65\2\2\u0166\u0167\7"+
		"\21\2\2\u0167\u0169\7\65\2\2\u0168\u0164\3\2\2\2\u0168\u0165\3\2\2\2\u0169"+
		"\61\3\2\2\2\u016a\u016b\7\30\2\2\u016b\u016c\7\65\2\2\u016c\u017e\78\2"+
		"\2\u016d\u016e\7\30\2\2\u016e\u016f\7\65\2\2\u016f\u0170\5\66\34\2\u0170"+
		"\u0171\78\2\2\u0171\u017e\3\2\2\2\u0172\u0173\7\30\2\2\u0173\u0178\5\64"+
		"\33\2\u0174\u0175\7\'\2\2\u0175\u0177\5\64\33\2\u0176\u0174\3\2\2\2\u0177"+
		"\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2"+
		"\2\2\u017a\u0178\3\2\2\2\u017b\u017c\78\2\2\u017c\u017e\3\2\2\2\u017d"+
		"\u016a\3\2\2\2\u017d\u016d\3\2\2\2\u017d\u0172\3\2\2\2\u017e\63\3\2\2"+
		"\2\u017f\u0181\7\65\2\2\u0180\u0182\5\66\34\2\u0181\u0180\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\65\3\2\2\2\u0183\u0184\7(\2\2\u0184\u0189\7\65\2"+
		"\2\u0185\u0186\7\13\2\2\u0186\u0188\7\65\2\2\u0187\u0185\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\67\3\2\2"+
		"\2\u018b\u0189\3\2\2\2\u018c\u018d\7)\2\2\u018d\u018e\7\65\2\2\u018e\u018f"+
		"\78\2\2\u018f9\3\2\2\2\u0190\u0191\7*\2\2\u0191\u0192\7+\2\2\u0192\u0193"+
		"\7\r\2\2\u0193\u0194\7\65\2\2\u0194\u0195\78\2\2\u0195;\3\2\2\2\u0196"+
		"\u0197\7*\2\2\u0197\u0198\7,\2\2\u0198\u0199\5\64\33\2\u0199\u019a\7\'"+
		"\2\2\u019a\u019b\5\64\33\2\u019b\u019c\78\2\2\u019c=\3\2\2\2\u019d\u019e"+
		"\7*\2\2\u019e\u019f\7+\2\2\u019f\u01a0\7\r\2\2\u01a0\u01a1\7,\2\2\u01a1"+
		"\u01a2\78\2\2\u01a2?\3\2\2\2\u01a3\u01a4\7-\2\2\u01a4\u01a5\7 \2\2\u01a5"+
		"\u01a6\7\5\2\2\u01a6\u01a7\7\65\2\2\u01a7\u01a8\7!\2\2\u01a8\u01ab\7\5"+
		"\2\2\u01a9\u01ac\5N(\2\u01aa\u01ac\7\65\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01aa\3\2\2\2\u01ac\u01b9\3\2\2\2\u01ad\u01ae\7+\2\2\u01ae\u01af\7\5"+
		"\2\2\u01af\u01b6\7\66\2\2\u01b0\u01b1\7\13\2\2\u01b1\u01b2\7+\2\2\u01b2"+
		"\u01b3\7\5\2\2\u01b3\u01b5\7\66\2\2\u01b4\u01b0\3\2\2\2\u01b5\u01b8\3"+
		"\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b9\u01ad\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bc\78\2\2\u01bcA\3\2\2\2\u01bd\u01be\7.\2\2\u01be\u01bf"+
		"\7 \2\2\u01bf\u01c0\7\5\2\2\u01c0\u01c1\7\65\2\2\u01c1\u01c2\7!\2\2\u01c2"+
		"\u01c5\7\5\2\2\u01c3\u01c6\5N(\2\u01c4\u01c6\7\65\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01ca\3\2\2\2\u01c7\u01c8\7+\2\2\u01c8"+
		"\u01c9\7\5\2\2\u01c9\u01cb\5\32\16\2\u01ca\u01c7\3\2\2\2\u01ca\u01cb\3"+
		"\2\2\2\u01cbC\3\2\2\2\u01cc\u01cd\7/\2\2\u01cd\u01ce\7 \2\2\u01ce\u01cf"+
		"\7\5\2\2\u01cf\u01d0\7\65\2\2\u01d0\u01d1\7!\2\2\u01d1\u01d4\7\5\2\2\u01d2"+
		"\u01d5\5N(\2\u01d3\u01d5\7\65\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2"+
		"\2\2\u01d5E\3\2\2\2\u01d6\u01d7\5H%\2\u01d7G\3\2\2\2\u01d8\u01d9\7\60"+
		"\2\2\u01d9\u01da\7 \2\2\u01da\u01db\7\5\2\2\u01db\u01dc\7\65\2\2\u01dc"+
		"\u01dd\7!\2\2\u01dd\u01de\7\5\2\2\u01de\u01df\7\66\2\2\u01df\u01e0\78"+
		"\2\2\u01e0I\3\2\2\2\u01e1\u01e2\7\61\2\2\u01e2K\3\2\2\2\u01e3\u01e4\7"+
		"\65\2\2\u01e4\u01e5\7\5\2\2\u01e5\u01ea\5\32\16\2\u01e6\u01e7\7\65\2\2"+
		"\u01e7\u01e8\7\5\2\2\u01e8\u01ea\7\66\2\2\u01e9\u01e3\3\2\2\2\u01e9\u01e6"+
		"\3\2\2\2\u01eaM\3\2\2\2\u01eb\u01ec\7\66\2\2\u01ecO\3\2\2\2$S[r{\u0086"+
		"\u0088\u0096\u00ac\u00b3\u00bb\u00eb\u00f4\u00f9\u00fd\u0106\u0110\u011d"+
		"\u0124\u0139\u0140\u0151\u0161\u0168\u0178\u017d\u0181\u0189\u01ab\u01b6"+
		"\u01b9\u01c5\u01ca\u01d4\u01e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}