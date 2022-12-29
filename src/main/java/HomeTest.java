import co.elastic.clients.elasticsearch.core.search.Hit;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.List;

public class HomeTest {
    public static void main(String[] args) {
        try {
            int count = 0;
            String source =  "(message = severe and level = 900) or level = 1000";
            int page = Integer.parseInt("0");
            Page.setPaginate(page);

            gLexer Lexer = new gLexer(CharStreams.fromString(source));
            CommonTokenStream tokens = new CommonTokenStream(Lexer);
            gParser parser = new gParser(tokens);
            ParseTree tree = parser.input();
            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);
     List<Hit<ObjectNode>> hits = visitor.result();
     System.out.println(hits);
                    if(hits!=null) {

                        for (Hit<ObjectNode> hit : hits) {
                            ObjectNode json = hit.source();
                            System.out.println(json.get("level").asText());
                            System.out.println(json.get("message").asText());
                    System.out.println(json.get("className").asText());
                    System.out.println(json.get("date").asText());
                    System.out.println(json.get("levelValue").asText());
                    count++;
                }
            }
            if(count == 0 && hits==null) {
                System.out.print("Error");
            }else if(count == 0){
                System.out.println("No result");
            }
        }catch (Exception e){
                System.out.println(e);
        }

    }
}
