package com.partb.jedispool;

import redis.clients.jedis.Jedis;

public class jedisPool {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.auth("root");
        jedis.set("myket", "1233");
        String a = jedis.get("myket");
        System.out.println(a);
        jedis.close();
    }
}
