// Generated from MOC.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MOCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT=2, DOUBLE=3, VOID=4, READ=5, READC=6, READS=7, WRITE=8, WRITEC=9, 
		WRITEV=10, WRITES=11, IF=12, ELSE=13, WHILE=14, FOR=15, ADD=16, SUB=17, 
		MUL=18, DIV=19, MOD=20, ASSIGN=21, LPAREN=22, RPAREN=23, LBRACE=24, RBRACE=25, 
		SEMI=26, COMMA=27, ID=28, NUM_INT=29, NUM_DOUBLE=30, WS=31, LINE_COMMENT=32, 
		OPCOND=33;
	public static final int
		RULE_programa = 0, RULE_decls = 1, RULE_decl = 2, RULE_tipo = 3, RULE_listaVar = 4, 
		RULE_varInit = 5, RULE_main = 6, RULE_bloco = 7, RULE_instr = 8, RULE_atribuicao = 9, 
		RULE_leitura = 10, RULE_escrita = 11, RULE_ifelse = 12, RULE_whileloop = 13, 
		RULE_forloop = 14, RULE_condicao = 15, RULE_expr = 16, RULE_readFunc = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "decls", "decl", "tipo", "listaVar", "varInit", "main", "bloco", 
			"instr", "atribuicao", "leitura", "escrita", "ifelse", "whileloop", "forloop", 
			"condicao", "expr", "readFunc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'int'", "'double'", "'void'", "'read'", "'readc'", "'reads'", 
			"'write'", "'writec'", "'writev'", "'writes'", "'if'", "'else'", "'while'", 
			"'for'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'('", "')'", "'{'", 
			"'}'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INT", "DOUBLE", "VOID", "READ", "READC", "READS", "WRITE", 
			"WRITEC", "WRITEV", "WRITES", "IF", "ELSE", "WHILE", "FOR", "ADD", "SUB", 
			"MUL", "DIV", "MOD", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"SEMI", "COMMA", "ID", "NUM_INT", "NUM_DOUBLE", "WS", "LINE_COMMENT", 
			"OPCOND"
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
	public String getGrammarFileName() { return "MOC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MOCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			decls();
			setState(37);
			main();
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
	public static class DeclsContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(MOCParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MOCParser.SEMI, i);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitDecls(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==DOUBLE) {
				{
				{
				setState(39);
				decl();
				setState(40);
				match(SEMI);
				}
				}
				setState(46);
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
	public static class DeclContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ListaVarContext listaVar() {
			return getRuleContext(ListaVarContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			tipo();
			setState(48);
			listaVar();
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MOCParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(MOCParser.DOUBLE, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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
	public static class ListaVarContext extends ParserRuleContext {
		public List<VarInitContext> varInit() {
			return getRuleContexts(VarInitContext.class);
		}
		public VarInitContext varInit(int i) {
			return getRuleContext(VarInitContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MOCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MOCParser.COMMA, i);
		}
		public ListaVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterListaVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitListaVar(this);
		}
	}

	public final ListaVarContext listaVar() throws RecognitionException {
		ListaVarContext _localctx = new ListaVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			varInit();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(53);
				match(COMMA);
				setState(54);
				varInit();
				}
				}
				setState(59);
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
	public static class VarInitContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MOCParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MOCParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterVarInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitVarInit(this);
		}
	}

	public final VarInitContext varInit() throws RecognitionException {
		VarInitContext _localctx = new VarInitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ID);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(61);
				match(ASSIGN);
				setState(62);
				expr(0);
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
	public static class MainContext extends ParserRuleContext {
		public List<TerminalNode> VOID() { return getTokens(MOCParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(MOCParser.VOID, i);
		}
		public TerminalNode LPAREN() { return getToken(MOCParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MOCParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(VOID);
			setState(66);
			match(T__0);
			setState(67);
			match(LPAREN);
			setState(68);
			match(VOID);
			setState(69);
			match(RPAREN);
			setState(70);
			bloco();
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
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MOCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MOCParser.RBRACE, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(LBRACE);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268492544L) != 0)) {
				{
				{
				setState(73);
				instr();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(RBRACE);
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
	public static class InstrContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MOCParser.SEMI, 0); }
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitInstr(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instr);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				atribuicao();
				setState(82);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				leitura();
				setState(85);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				escrita();
				setState(88);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				ifelse();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				whileloop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				forloop();
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MOCParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MOCParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ID);
			setState(96);
			match(ASSIGN);
			setState(97);
			expr(0);
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
	public static class LeituraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MOCParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MOCParser.ASSIGN, 0); }
		public TerminalNode READ() { return getToken(MOCParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(MOCParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MOCParser.RPAREN, 0); }
		public TerminalNode READC() { return getToken(MOCParser.READC, 0); }
		public TerminalNode READS() { return getToken(MOCParser.READS, 0); }
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitLeitura(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
			match(ASSIGN);
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				{
				setState(101);
				match(READ);
				setState(102);
				match(LPAREN);
				setState(103);
				match(RPAREN);
				}
				break;
			case READC:
				{
				setState(104);
				match(READC);
				setState(105);
				match(LPAREN);
				setState(106);
				match(RPAREN);
				}
				break;
			case READS:
				{
				setState(107);
				match(READS);
				setState(108);
				match(LPAREN);
				setState(109);
				match(RPAREN);
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
	public static class EscritaContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MOCParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MOCParser.RPAREN, 0); }
		public TerminalNode WRITE() { return getToken(MOCParser.WRITE, 0); }
		public TerminalNode WRITEC() { return getToken(MOCParser.WRITEC, 0); }
		public TerminalNode WRITEV() { return getToken(MOCParser.WRITEV, 0); }
		public TerminalNode WRITES() { return getToken(MOCParser.WRITES, 0); }
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitEscrita(this);
		}
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_escrita);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3840L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(113);
			match(LPAREN);
			setState(114);
			expr(0);
			setState(115);
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
	public static class IfelseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MOCParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MOCParser.LPAREN, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MOCParser.RPAREN, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MOCParser.ELSE, 0); }
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitIfelse(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(IF);
			setState(118);
			match(LPAREN);
			setState(119);
			condicao();
			setState(120);
			match(RPAREN);
			setState(121);
			bloco();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(122);
				match(ELSE);
				setState(123);
				bloco();
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
	public static class WhileloopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MOCParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MOCParser.LPAREN, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MOCParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterWhileloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitWhileloop(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(WHILE);
			setState(127);
			match(LPAREN);
			setState(128);
			condicao();
			setState(129);
			match(RPAREN);
			setState(130);
			bloco();
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
	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MOCParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(MOCParser.LPAREN, 0); }
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(MOCParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MOCParser.SEMI, i);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MOCParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitForloop(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(FOR);
			setState(133);
			match(LPAREN);
			setState(134);
			atribuicao();
			setState(135);
			match(SEMI);
			setState(136);
			condicao();
			setState(137);
			match(SEMI);
			setState(138);
			atribuicao();
			setState(139);
			match(RPAREN);
			setState(140);
			bloco();
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
	public static class CondicaoContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPCOND() { return getToken(MOCParser.OPCOND, 0); }
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			expr(0);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPCOND) {
				{
				setState(143);
				match(OPCOND);
				setState(144);
				expr(0);
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
	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LPAREN() { return getToken(MOCParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MOCParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(MOCParser.ID, 0); }
		public TerminalNode NUM_INT() { return getToken(MOCParser.NUM_INT, 0); }
		public TerminalNode NUM_DOUBLE() { return getToken(MOCParser.NUM_DOUBLE, 0); }
		public ReadFuncContext readFunc() {
			return getRuleContext(ReadFuncContext.class,0);
		}
		public TerminalNode ADD() { return getToken(MOCParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MOCParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(MOCParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MOCParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MOCParser.MOD, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(148);
				match(LPAREN);
				setState(149);
				expr(0);
				setState(150);
				match(RPAREN);
				}
				break;
			case ID:
				{
				setState(152);
				match(ID);
				}
				break;
			case NUM_INT:
				{
				setState(153);
				match(NUM_INT);
				}
				break;
			case NUM_DOUBLE:
				{
				setState(154);
				match(NUM_DOUBLE);
				}
				break;
			case READ:
			case READC:
			case READS:
				{
				setState(155);
				readFunc();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(159);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(162);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadFuncContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(MOCParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(MOCParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MOCParser.RPAREN, 0); }
		public TerminalNode READC() { return getToken(MOCParser.READC, 0); }
		public TerminalNode READS() { return getToken(MOCParser.READS, 0); }
		public ReadFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterReadFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitReadFunc(this);
		}
	}

	public final ReadFuncContext readFunc() throws RecognitionException {
		ReadFuncContext _localctx = new ReadFuncContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_readFunc);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(READ);
				setState(170);
				match(LPAREN);
				setState(171);
				match(RPAREN);
				}
				break;
			case READC:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(READC);
				setState(173);
				match(LPAREN);
				setState(174);
				match(RPAREN);
				}
				break;
			case READS:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(READS);
				setState(176);
				match(LPAREN);
				setState(177);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u00b5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001+\b\u0001"+
		"\n\u0001\f\u0001.\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00048\b\u0004"+
		"\n\u0004\f\u0004;\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"@\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007K\b\u0007"+
		"\n\u0007\f\u0007N\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b^\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\no\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f}\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0092"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u009d\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00a5\b\u0010\n\u0010\f\u0010\u00a8\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00b3\b\u0011\u0001\u0011\u0000\u0001 \u0012"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"\u0000\u0004\u0001\u0000\u0002\u0003\u0001\u0000\b\u000b"+
		"\u0001\u0000\u0010\u0011\u0001\u0000\u0012\u0014\u00b7\u0000$\u0001\u0000"+
		"\u0000\u0000\u0002,\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000"+
		"\u00062\u0001\u0000\u0000\u0000\b4\u0001\u0000\u0000\u0000\n<\u0001\u0000"+
		"\u0000\u0000\fA\u0001\u0000\u0000\u0000\u000eH\u0001\u0000\u0000\u0000"+
		"\u0010]\u0001\u0000\u0000\u0000\u0012_\u0001\u0000\u0000\u0000\u0014c"+
		"\u0001\u0000\u0000\u0000\u0016p\u0001\u0000\u0000\u0000\u0018u\u0001\u0000"+
		"\u0000\u0000\u001a~\u0001\u0000\u0000\u0000\u001c\u0084\u0001\u0000\u0000"+
		"\u0000\u001e\u008e\u0001\u0000\u0000\u0000 \u009c\u0001\u0000\u0000\u0000"+
		"\"\u00b2\u0001\u0000\u0000\u0000$%\u0003\u0002\u0001\u0000%&\u0003\f\u0006"+
		"\u0000&\u0001\u0001\u0000\u0000\u0000\'(\u0003\u0004\u0002\u0000()\u0005"+
		"\u001a\u0000\u0000)+\u0001\u0000\u0000\u0000*\'\u0001\u0000\u0000\u0000"+
		"+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-\u0003\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0003"+
		"\u0006\u0003\u000001\u0003\b\u0004\u00001\u0005\u0001\u0000\u0000\u0000"+
		"23\u0007\u0000\u0000\u00003\u0007\u0001\u0000\u0000\u000049\u0003\n\u0005"+
		"\u000056\u0005\u001b\u0000\u000068\u0003\n\u0005\u000075\u0001\u0000\u0000"+
		"\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:\t\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<?\u0005"+
		"\u001c\u0000\u0000=>\u0005\u0015\u0000\u0000>@\u0003 \u0010\u0000?=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u000b\u0001\u0000\u0000"+
		"\u0000AB\u0005\u0004\u0000\u0000BC\u0005\u0001\u0000\u0000CD\u0005\u0016"+
		"\u0000\u0000DE\u0005\u0004\u0000\u0000EF\u0005\u0017\u0000\u0000FG\u0003"+
		"\u000e\u0007\u0000G\r\u0001\u0000\u0000\u0000HL\u0005\u0018\u0000\u0000"+
		"IK\u0003\u0010\b\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000OP\u0005\u0019\u0000\u0000P\u000f\u0001"+
		"\u0000\u0000\u0000QR\u0003\u0012\t\u0000RS\u0005\u001a\u0000\u0000S^\u0001"+
		"\u0000\u0000\u0000TU\u0003\u0014\n\u0000UV\u0005\u001a\u0000\u0000V^\u0001"+
		"\u0000\u0000\u0000WX\u0003\u0016\u000b\u0000XY\u0005\u001a\u0000\u0000"+
		"Y^\u0001\u0000\u0000\u0000Z^\u0003\u0018\f\u0000[^\u0003\u001a\r\u0000"+
		"\\^\u0003\u001c\u000e\u0000]Q\u0001\u0000\u0000\u0000]T\u0001\u0000\u0000"+
		"\u0000]W\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u0011\u0001\u0000\u0000\u0000"+
		"_`\u0005\u001c\u0000\u0000`a\u0005\u0015\u0000\u0000ab\u0003 \u0010\u0000"+
		"b\u0013\u0001\u0000\u0000\u0000cd\u0005\u001c\u0000\u0000dn\u0005\u0015"+
		"\u0000\u0000ef\u0005\u0005\u0000\u0000fg\u0005\u0016\u0000\u0000go\u0005"+
		"\u0017\u0000\u0000hi\u0005\u0006\u0000\u0000ij\u0005\u0016\u0000\u0000"+
		"jo\u0005\u0017\u0000\u0000kl\u0005\u0007\u0000\u0000lm\u0005\u0016\u0000"+
		"\u0000mo\u0005\u0017\u0000\u0000ne\u0001\u0000\u0000\u0000nh\u0001\u0000"+
		"\u0000\u0000nk\u0001\u0000\u0000\u0000o\u0015\u0001\u0000\u0000\u0000"+
		"pq\u0007\u0001\u0000\u0000qr\u0005\u0016\u0000\u0000rs\u0003 \u0010\u0000"+
		"st\u0005\u0017\u0000\u0000t\u0017\u0001\u0000\u0000\u0000uv\u0005\f\u0000"+
		"\u0000vw\u0005\u0016\u0000\u0000wx\u0003\u001e\u000f\u0000xy\u0005\u0017"+
		"\u0000\u0000y|\u0003\u000e\u0007\u0000z{\u0005\r\u0000\u0000{}\u0003\u000e"+
		"\u0007\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0019"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005\u000e\u0000\u0000\u007f\u0080\u0005"+
		"\u0016\u0000\u0000\u0080\u0081\u0003\u001e\u000f\u0000\u0081\u0082\u0005"+
		"\u0017\u0000\u0000\u0082\u0083\u0003\u000e\u0007\u0000\u0083\u001b\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005\u000f\u0000\u0000\u0085\u0086\u0005"+
		"\u0016\u0000\u0000\u0086\u0087\u0003\u0012\t\u0000\u0087\u0088\u0005\u001a"+
		"\u0000\u0000\u0088\u0089\u0003\u001e\u000f\u0000\u0089\u008a\u0005\u001a"+
		"\u0000\u0000\u008a\u008b\u0003\u0012\t\u0000\u008b\u008c\u0005\u0017\u0000"+
		"\u0000\u008c\u008d\u0003\u000e\u0007\u0000\u008d\u001d\u0001\u0000\u0000"+
		"\u0000\u008e\u0091\u0003 \u0010\u0000\u008f\u0090\u0005!\u0000\u0000\u0090"+
		"\u0092\u0003 \u0010\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u001f\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0006\u0010\uffff\uffff\u0000\u0094\u0095\u0005\u0016\u0000\u0000\u0095"+
		"\u0096\u0003 \u0010\u0000\u0096\u0097\u0005\u0017\u0000\u0000\u0097\u009d"+
		"\u0001\u0000\u0000\u0000\u0098\u009d\u0005\u001c\u0000\u0000\u0099\u009d"+
		"\u0005\u001d\u0000\u0000\u009a\u009d\u0005\u001e\u0000\u0000\u009b\u009d"+
		"\u0003\"\u0011\u0000\u009c\u0093\u0001\u0000\u0000\u0000\u009c\u0098\u0001"+
		"\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a6\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\n\u0007\u0000\u0000\u009f\u00a0\u0007\u0002"+
		"\u0000\u0000\u00a0\u00a5\u0003 \u0010\b\u00a1\u00a2\n\u0006\u0000\u0000"+
		"\u00a2\u00a3\u0007\u0003\u0000\u0000\u00a3\u00a5\u0003 \u0010\u0007\u00a4"+
		"\u009e\u0001\u0000\u0000\u0000\u00a4\u00a1\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7!\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0005\u0000\u0000\u00aa\u00ab"+
		"\u0005\u0016\u0000\u0000\u00ab\u00b3\u0005\u0017\u0000\u0000\u00ac\u00ad"+
		"\u0005\u0006\u0000\u0000\u00ad\u00ae\u0005\u0016\u0000\u0000\u00ae\u00b3"+
		"\u0005\u0017\u0000\u0000\u00af\u00b0\u0005\u0007\u0000\u0000\u00b0\u00b1"+
		"\u0005\u0016\u0000\u0000\u00b1\u00b3\u0005\u0017\u0000\u0000\u00b2\u00a9"+
		"\u0001\u0000\u0000\u0000\u00b2\u00ac\u0001\u0000\u0000\u0000\u00b2\u00af"+
		"\u0001\u0000\u0000\u0000\u00b3#\u0001\u0000\u0000\u0000\f,9?L]n|\u0091"+
		"\u009c\u00a4\u00a6\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}