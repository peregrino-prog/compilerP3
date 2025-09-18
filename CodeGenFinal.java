//CodeGenFinal.java

import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

public class CodeGenFinal extends MOCBaseVisitor<String> {

    private int tempCount = 0;
    private List<String> code = new ArrayList<>();

    private String newTemp() {
        return "t" + (tempCount++);
    }

    public List<String> getCode() {
        return code;
    }

    @Override
    public String visitPrograma(MOCParser.ProgramaContext ctx) {
        if (ctx.decls() != null)
            visit(ctx.decls());
        if (ctx.main() != null)
            visitMain(ctx.main());
        return null;
    }

    @Override
    public String visitMain(MOCParser.MainContext ctx) {
        if (ctx.bloco() != null)
            visitBloco(ctx.bloco());
        return null;
    }

    @Override
    public String visitBloco(MOCParser.BlocoContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof MOCParser.InstrContext)
                visitInstr((MOCParser.InstrContext) child);
            else
                visit(child);
        }
        return null;
    }

    @Override
    public String visitInstr(MOCParser.InstrContext ctx) {
        if (ctx.atribuicao() != null)
            return visitAtribuicao(ctx.atribuicao());
        else if (ctx.leitura() != null)
            return visitLeitura(ctx.leitura());
        else if (ctx.escrita() != null)
            return visitEscrita(ctx.escrita());
        else if (ctx.ifelse() != null)
            return visitIfelse(ctx.ifelse());
        else if (ctx.whileloop() != null)
            return visitWhileloop(ctx.whileloop());
        else if (ctx.forloop() != null)
            return visitForloop(ctx.forloop());
        return null;
    }

    @Override
    public String visitAtribuicao(MOCParser.AtribuicaoContext ctx) {
        String id = ctx.ID().getText();
        String expr = visitExpr(ctx.expr());
        code.add(id + " = " + expr);
        return null;
    }

    @Override
    public String visitExpr(MOCParser.ExprContext ctx) {
        if (ctx.op != null && ctx.expr().size() == 2) {
            String e1 = visitExpr(ctx.expr(0));
            String e2 = visitExpr(ctx.expr(1));
            String t = newTemp();
            code.add(t + " = " + e1 + " " + ctx.op.getText() + " " + e2);
            return t;
        }

        if (ctx.ID() != null)
            return ctx.ID().getText();
        if (ctx.NUM_INT() != null)
            return ctx.NUM_INT().getText();
        if (ctx.NUM_DOUBLE() != null)
            return ctx.NUM_DOUBLE().getText();

        if (ctx.readFunc() != null) {
            String func = ctx.readFunc().getText();
            String t = newTemp();
            code.add(t + " = " + func.toUpperCase());
            return t;
        }

        return "0";
    }

    @Override
    public String visitLeitura(MOCParser.LeituraContext ctx) {
        String id = ctx.ID().getText();
        String func = ctx.getChild(2).getText();
        String t = newTemp();
        code.add(t + " = " + func.substring(0, func.indexOf('(')).toUpperCase());
        code.add(id + " = " + t);
        return null;
    }

    @Override
    public String visitEscrita(MOCParser.EscritaContext ctx) {
        String expr = visitExpr(ctx.expr());
        code.add("WRITE " + expr);
        return null;
    }

    @Override
    public String visitIfelse(MOCParser.IfelseContext ctx) {
        String cond = visitCondicao(ctx.condicao());
        String labelElse = "L" + tempCount++;
        String labelEnd = "L" + tempCount++;
        code.add("IF_FALSE " + cond + " GOTO " + labelElse);
        visitBloco(ctx.bloco(0));
        code.add("GOTO " + labelEnd);
        code.add(labelElse + ":");
        if (ctx.ELSE() != null)
            visitBloco(ctx.bloco(1));
        code.add(labelEnd + ":");
        return null;
    }

    @Override
    public String visitCondicao(MOCParser.CondicaoContext ctx) {
        if (ctx.OPCOND() != null) {
            String e1 = visitExpr(ctx.expr(0));
            String e2 = visitExpr(ctx.expr(1));
            return e1 + " " + ctx.OPCOND().getText() + " " + e2;
        } else {
            return visitExpr(ctx.expr(0));
        }
    }

    @Override
    public String visitWhileloop(MOCParser.WhileloopContext ctx) {
        String labelStart = "L" + tempCount++;
        String labelEnd = "L" + tempCount++;
        code.add(labelStart + ":");
        String cond = visitCondicao(ctx.condicao());
        code.add("IF_FALSE " + cond + " GOTO " + labelEnd);
        visitBloco(ctx.bloco());
        code.add("GOTO " + labelStart);
        code.add(labelEnd + ":");
        return null;
    }

    @Override
    public String visitForloop(MOCParser.ForloopContext ctx) {
        visitAtribuicao(ctx.atribuicao(0));
        String labelStart = "L" + tempCount++;
        String labelEnd = "L" + tempCount++;
        code.add(labelStart + ":");
        String cond = visitCondicao(ctx.condicao());
        code.add("IF_FALSE " + cond + " GOTO " + labelEnd);
        visitBloco(ctx.bloco());
        visitAtribuicao(ctx.atribuicao(1));
        code.add("GOTO " + labelStart);
        code.add(labelEnd + ":");
        return null;
    }
}
