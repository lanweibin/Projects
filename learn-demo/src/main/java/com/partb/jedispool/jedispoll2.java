package com.partb.jedispool;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class jedispoll2 {
    public static void main(String[] args) {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(100);
        config.setMaxIdle(10);
        JedisPool jedisPool = new JedisPool(config, "127.0.0.1", 6379);

        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.auth("root");
            jedis.set("123","连接池成功");
            String s = jedis.get("123");
            System.out.println(s);
            System.out.println(jedis);
            System.out.println(jedisPool);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (jedis != null){
                jedis.close();
                System.out.println("关闭jedis");
            }
            if (jedisPool != null){
                jedisPool.close();
                System.out.println("关闭pool");
            }
        }

    }
}
