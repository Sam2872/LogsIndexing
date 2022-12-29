import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;

import java.util.List;

public class EvalGroupQuery {
    String query;
    public EvalGroupQuery(String query) {
        if(!query.contains("=")){
            String temp = "*"+query+"*";
            this.query = temp.replace("\"","");
        }
        else {

            this.query = query.replace("\"", " ")
                    .replace("=", ":")
                    .replace("TO", " TO ");
        }
    }




    public List<Hit<ObjectNode>> getResult(){
        int page = Page.getPaginate();
        ElasticsearchClient client = new ConnectEs().getClient();
        SearchResponse se = null;


        System.out.println(query);
        {
            try {
                se = client.search(s -> s
                                .index("records")
                                .query(q->q
                                        .queryString(qs->qs
                                                .query(query)))
                                .size(10)
                                .from(page)
                        , ObjectNode.class
                );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        List<Hit<ObjectNode>> hits = se.hits().hits();

        return hits;
    }



}
