import co.elastic.clients.elasticsearch.core.search.Hit;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.json.simple.*;

public class Home extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int count = 0;
        String source = req.getParameter("res");
        int  page = Integer.parseInt(req.getParameter("Page"));
        Page.setPaginate(page);
        gLexer Lexer = new gLexer(CharStreams.fromString(source));
        CommonTokenStream tokens = new CommonTokenStream(Lexer);
        gParser parser = new gParser(tokens);
        ParseTree tree = parser.input();
        MyVisitor visitor = new MyVisitor();

        visitor.visit(tree);
        List<Hit<ObjectNode>> hits = visitor.result();
        JSONArray array = new JSONArray();
        if(hits!=null) {

            for (Hit<ObjectNode> hit : hits) {
                ObjectNode json = hit.source();
                JSONObject obj = new JSONObject();
                obj.put("level", json.get("level").asText());
                obj.put("levelValue",json.get("levelValue").asText());
                obj.put("message", json.get("message").asText());
                obj.put("date", json.get("date").asText());
                obj.put("className", json.get("className").asText());
                obj.put("methodName", json.get("methodName").asText());
                array.add(obj);
                count++;
            }
        }
        if(count != 0){
            resp.setContentType("application/json");
            resp.setCharacterEncoding("UTF-8");
            resp.getWriter().write(array.toJSONString());
        }
        else if(count == 0 && hits == null){
            resp.getWriter().write("Error");
        }
        else{
            resp.getWriter().write("");
        }


    }
}
