//MOCVisitorImpl.java

import java.util.*;

public class MOCVisitorImpl extends MOCBaseVisitor<Void> {

    private Map<String, String> tabelaSimbolos = new HashMap<>();

    @Override
    public Void visitDecl(MOCParser.DeclContext ctx) {
        String tipo = ctx.tipo().getText();

        for (MOCParser.VarInitContext var : ctx.listaVar().varInit()) {
            String nomeVar = var.ID().getText();

            if (tabelaSimbolos.containsKey(nomeVar)) {
                System.err.println("Erro Semântico: Variável '" + nomeVar + "' já declarada.");
            } else {
                tabelaSimbolos.put(nomeVar, tipo);
            }
        }
        return null;
    }

    @Override
    public Void visitAtribuicao(MOCParser.AtribuicaoContext ctx) {
        String nomeVar = ctx.ID().getText();

        if (!tabelaSimbolos.containsKey(nomeVar)) {
            System.err.println("Erro Semântico: Variável '" + nomeVar + "' não declarada.");
        }
        return visitChildren(ctx);
    }

    @Override
    public Void visitExpr(MOCParser.ExprContext ctx) {
        if (ctx.ID() != null) {
            String nomeVar = ctx.ID().getText();

            if (!tabelaSimbolos.containsKey(nomeVar)) {
                System.err.println("Erro Semântico: Variável '" + nomeVar + "' não declarada.");
            }
        }
        return visitChildren(ctx);
    }
}
