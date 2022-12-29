import co.elastic.clients.elasticsearch.core.search.Hit;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;
import java.util.stream.Collectors;

public class MyVisitor extends gBaseVisitor<ObjectNode> {


    List<Hit<ObjectNode>> hits = null;

    @Override
    public ObjectNode visitInput(gParser.InputContext ctx) {
        String json = null;
        if(ctx.logic() != null) {
            visit(ctx.logic());
        }
        else if(ctx.expr()!= null && ctx.logic() == null){
            visit(ctx.expr());
        } else if (ctx.phrase()!=null) {
            visit(ctx.phrase());
        }
        return null;

    }


    @Override
    public ObjectNode visitExpr(gParser.ExprContext ctx) {

        if(ctx.range()!=null){
            String attr = ctx.attribute().getText();
            String left = ctx.range().left.getText();
            String right = ctx.range().right.getText();
            hits = new Range(attr, left, right).getRange();
        }
        else {
            String attr = ctx.attribute().getText();
            String value = "";
            if(ctx.value()!=null){
                value = ctx.value().getText();
            }
            else if(ctx.num()!=null){
                value = ctx.num().getText();
            }
            String op = "";

            if(ctx.relational_operator()!=null){
                op = ctx.relational_operator().getText();
            }
            if(ctx.operator()!=null){
                op = ctx.operator().getText();
            }

            boolean contains = op.toLowerCase().trim().equals("contains");

            if (!op.equals("=") && !op.equals("!=") && !contains) {
                EvalRelation eval = new EvalRelation(attr, op, value);
                hits = eval.evalFunc();
            }  else {
                EvalExpr eval = new EvalExpr(attr, op, value);
                hits = eval.evalFunc();
            }
        }

        return super.visitExpr(ctx);
    }

    @Override
    public ObjectNode visitLogic(gParser.LogicContext ctx) {

        String left_attr = ctx.left.attribute().getText();
        String left_val = ctx.left.value().getText();
        String right_attr = ctx.right.attribute().getText();
        String right_val = ctx.right.value().getText();
        String op  = ctx.logical_op().get(0).getText();
        hits = new EvalLogic(left_attr,left_val,right_attr,right_val,op).getLogic();
        return null;
    }


    @Override
    public ObjectNode visitPhrase(gParser.PhraseContext ctx) {
        String tem = ctx.getText();
        hits = new EvalGroupQuery(tem).getResult();
        return null;
    }

    @Override
    public ObjectNode visitLogical_op(gParser.Logical_opContext ctx) {
        ctx.children.stream().map(m->m.toString().toUpperCase());
        return super.visitLogical_op(ctx);
    }

    public List<Hit<ObjectNode>> result() {
        return hits;

    }
}
