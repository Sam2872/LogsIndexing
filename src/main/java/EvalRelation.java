import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.util.List;
public class EvalRelation {
    String attr, operator, value;
    List<Hit<ObjectNode>> list = null;
    public EvalRelation(String attr, String operator, String value) {
        this.attr =attr;
        this.operator = operator;
        this.value = value;
    }

    public List<Hit<ObjectNode>> evalFunc(){

        int page = Page.getPaginate();

        ConnectEs connection = new ConnectEs();
        ElasticsearchClient client = connection.getClient();
        try {
            SearchResponse<ObjectNode>  s  = null;
            String temp = "";

            if(this.operator.trim().equals(">")) {
                temp = "{"+value+" TO *}";
            }else if(this.operator.trim().equals("<")) {
                temp = "{* TO "+value+"}";
            }else if(this.operator.trim().equals(">=")) {
                temp = "["+value+" TO *]";
            }else if(this.operator.trim().equals("<=")) {
                temp = "[* TO "+value+"]";
            }

            final String st = temp;
            s = client.search(se -> se
                            .index("records")
                            .query(qe -> qe
                                    .queryString(qs -> qs
                                            .defaultField(attr)
                                            .query(st)))
                            .size(10)
                            .from(page)

                    , ObjectNode.class);

            list = s.hits().hits();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return list;
    }
}