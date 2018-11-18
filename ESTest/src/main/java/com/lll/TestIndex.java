package com.lll;

import com.google.gson.JsonObject;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.InetAddress;

public class TestIndex {
    private static String host = "127.0.0.1";
    private static int port = 9300;

    private TransportClient client = null;

    @Before
    public void getClient() throws Exception{
        client = client = new PreBuiltTransportClient(Settings.EMPTY).addTransportAddress(
                new TransportAddress(InetAddress.getByName(host),port));
    }

    @After
    public void close() {
        if (client != null) {
            client.close();
        }
    }


    /**
     *
     * @throws Exception
     */

    @Test
    public void testIndex() throws Exception {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name","编程思想");
        jsonObject.addProperty("publishDate","2012-11-11");
        jsonObject.addProperty("price","100");

        IndexResponse response = client.prepareIndex("book", "java", "1")
                .setSource(jsonObject.toString(), XContentType.JSON).get();

        System.out.println("索引名称：" + response.getIndex());
        System.out.println("类型：" + response.getType());
        System.out.println("文档Id：" + response.getId());
        System.out.println("当前实例状态：" + response.status());
    }

    @Test
    public void testGet() throws Exception{
        GetResponse response = client.prepareGet("book", "java", "1").get();
        System.out.println(response.getSourceAsString());
    }

    @Test
    public void testUpdate() throws  Exception{
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name","编程思想2");
        jsonObject.addProperty("publishDate","2012-11-12");
        jsonObject.addProperty("price","1020");

        UpdateResponse response = client.prepareUpdate("book", "java", "1").setDoc(jsonObject.toString(),XContentType.JSON).get();

        System.out.println("索引名称：" + response.getIndex());
        System.out.println("类型：" + response.getType());
        System.out.println("文档Id：" + response.getId());
        System.out.println("当前实例状态：" + response.status());
    }


    @Test
    public void testDelete() throws Exception{
        DeleteResponse response = client.prepareDelete("book", "java", "1").get();
    }
}
