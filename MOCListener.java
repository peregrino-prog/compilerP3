// Generated from MOC.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MOCParser}.
 */
public interface MOCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MOCParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MOCParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MOCParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(MOCParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(MOCParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MOCParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MOCParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(MOCParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(MOCParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#listaVar}.
	 * @param ctx the parse tree
	 */
	void enterListaVar(MOCParser.ListaVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#listaVar}.
	 * @param ctx the parse tree
	 */
	void exitListaVar(MOCParser.ListaVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#varInit}.
	 * @param ctx the parse tree
	 */
	void enterVarInit(MOCParser.VarInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#varInit}.
	 * @param ctx the parse tree
	 */
	void exitVarInit(MOCParser.VarInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(MOCParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(MOCParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(MOCParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(MOCParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstr(MOCParser.InstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstr(MOCParser.InstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(MOCParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(MOCParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(MOCParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(MOCParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(MOCParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(MOCParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(MOCParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(MOCParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(MOCParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(MOCParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(MOCParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(MOCParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(MOCParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(MOCParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MOCParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MOCParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#readFunc}.
	 * @param ctx the parse tree
	 */
	void enterReadFunc(MOCParser.ReadFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#readFunc}.
	 * @param ctx the parse tree
	 */
	void exitReadFunc(MOCParser.ReadFuncContext ctx);
}