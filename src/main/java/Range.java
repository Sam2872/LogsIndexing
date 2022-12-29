import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.util.List;

public class Range {
    String attr, left , right;
    public Range(String attr, String left,String right) {
        this.attr = attr;
        this.left = left;
        this.right = right;
    }



    public List<Hit<ObjectNode>> getRange(){
        int page = Page.getPaginate();
        List<Hit<ObjectNode>> hits = null;
        ElasticsearchClient client = new ConnectEs().getClient();
        String temp = "["+left+" TO "+ right+"]";
        try {
            SearchResponse<ObjectNode> s = client.search(se->se
                            .query(q->q
                                    .queryString(qs->qs
                                            .defaultField(attr)
                                            .query(temp)))
                            .size(10)
                            .from(page)

                    , ObjectNode.class);
            hits =s.hits().hits();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return hits;
    }
}
