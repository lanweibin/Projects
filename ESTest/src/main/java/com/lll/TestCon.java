package com.lll;

import com.google.gson.JsonObject;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;

public class TestCon {
    private static String host = "127.0.0.1";
    private static int port = 9300;

    public static void main(String[] args) throws Exception {
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY).addTransportAddress(
                new TransportAddress(InetAddress.getByName(host),port));
        System.out.println(client);


//        JsonObject jsonObject = new JsonObject();
//        jsonObject.addProperty("name","编程思想");
//        jsonObject.addProperty("publishDate","2012-11-11");
//        jsonObject.addProperty("price","100");
//
//        IndexResponse response = client.prepareIndex("book", "java", "1")
//                .setSource(jsonObject.toString(), XContentType.JSON).get();
//
//        System.out.println("索引名称：" + response.getIndex());
//        System.out.println("类型：" + response.getType());
//        System.out.println("文档Id：" + response.getId());
//        System.out.println("当前实例状态：" + response.status());
//
//        System.out.println(response);

        client.close();
    }
}
