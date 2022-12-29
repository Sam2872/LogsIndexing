import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import com.fasterxml.jackson.databind.node.ObjectNode;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EvalLogic {
    String left_attribute, left_value, right_attribute, right_value, op;

    public EvalLogic(String left_attribute, String left_value, String right_attribute, String right_value, String op) {
        this.left_attribute = left_attribute;
        this.left_value = left_value;
        this.right_attribute = right_attribute;
        this.right_value = right_value;
        this.op = op;
    }


    public List<Hit<ObjectNode>> getLogic() {
        int page = Page.getPaginate();

        ElasticsearchClient client = new ConnectEs().getClient();
        SearchResponse s = null;

            String res_query = left_attribute + " : (" + left_value+ ") "+ op.toUpperCase() +" "+ right_attribute+ " : (" + right_value+ ")";
            System.out.println(res_query.replace("\"",""));
            try {
                s = client.search(se -> se
                                .index("records")
                                .query(q -> q.queryString(qs -> qs
                                        .query(res_query))
                                )
                                .size(10)
                                .from(page)
                        , ObjectNode.class);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            List<Hit<ObjectNode>> list = s.hits().hits();
            return list;
        }
    }
