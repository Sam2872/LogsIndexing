import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.util.List;

public class EvalExpr {
    String attr, operator, value;
    List<Hit<ObjectNode>> list = null;
    public EvalExpr(String attr, String operator, String value) {
        this.attr =attr;
        this.operator = operator;
        this.value = value.replace("\"","" );
    }

    public List<Hit<ObjectNode>> evalFunc(){
        int page = Page.getPaginate();
        if (operator.trim().equals("!=")) {
            value = "NOT "+value;
        }else if(operator.toLowerCase().trim().equals("contains")){
            value = "*"+value+"*";
        }

        ElasticsearchClient client =new ConnectEs().getClient();
        final String temp = value;

        try {
            SearchResponse s = client.search(se -> se
                            .index("records")
                            .query(q->q
                                    .queryString(qs->qs
                                            .defaultField(attr)
                                            .query(temp)))
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
