// Generated from MOC.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MOCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MOCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MOCParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(MOCParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(MOCParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MOCParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(MOCParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#listaVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaVar(MOCParser.ListaVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#varInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInit(MOCParser.VarInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(MOCParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(MOCParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr(MOCParser.InstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(MOCParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#leitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeitura(MOCParser.LeituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#escrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscrita(MOCParser.EscritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(MOCParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#whileloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop(MOCParser.WhileloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(MOCParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#condicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao(MOCParser.CondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MOCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MOCParser.ExprContext ctx);
}