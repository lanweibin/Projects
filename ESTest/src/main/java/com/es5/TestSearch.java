package com.es5;

import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.sort.SortOrder;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.InetAddress;

public class TestSearch {
    private static String host = "127.0.0.1";
    private static int port = 9300;

    private TransportClient client = null;

    @Before
    public void getClient() throws Exception {
        client = new PreBuiltTransportClient(Settings.EMPTY).addTransportAddress(
                new TransportAddress(InetAddress.getByName(host), port));
    }

    @After
    public void close() {
        if (client != null) {
            client.close();
        }
    }


    @Test
    public void searchAll() throws Exception {
        SearchRequestBuilder srb = client.prepareSearch("film").setTypes("dongzuo");
        SearchResponse sr = srb.setQuery(QueryBuilders.matchAllQuery())
                .execute()
                .actionGet();
        SearchHits hits = sr.getHits();
        for (SearchHit hit : hits) {
            System.out.println(hit.getSourceAsString());
        }
    }

    @Test
    public void searchPaging() throws Exception {
        SearchRequestBuilder srb = client.prepareSearch("film").setTypes("dongzuo");
        SearchResponse sr = srb.setQuery(QueryBuilders.matchAllQuery())
                .setSize(2)
                .setFrom(1)
                .execute()
                .actionGet();
        SearchHits hits = sr.getHits();
        for (SearchHit hit : hits) {
            System.out.println(hit.getSourceAsString());
        }
    }

    @Test
    public void serachOrdr() throws Exception{
        SearchRequestBuilder srb = client.prepareSearch("film").setTypes("dongzuo");
        SearchResponse sb = srb.setQuery(QueryBuilders.matchAllQuery())
                .addSort("publishDate", SortOrder.DESC)
                .execute()
                .actionGet();
        SearchHits hits = sb.getHits();
        for (SearchHit hit : hits ){
            System.out.println(hit.getSourceAsString());
        }
    }
}
