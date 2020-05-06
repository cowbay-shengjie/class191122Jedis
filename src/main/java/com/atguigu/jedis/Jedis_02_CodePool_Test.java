package com.atguigu.jedis;

import com.sun.org.apache.xpath.internal.SourceTree;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Protocol;

import java.awt.image.PixelInterleavedSampleModel;
import java.util.List;

public class Jedis_02_CodePool_Test {
    public static void main(String[] args) {
        //创建redis连接
        String addAppress = "192.168.1.102";
        int poot = Protocol.DEFAULT_PORT;
        //创建连接池对象
        JedisPool jedisPool = new JedisPool(addAppress, poot);

        //获取Jedis对象连接redis
        Jedis jedis = jedisPool.getResource();
        //执行具体操作
        String ping = jedis.ping();
        System.out.println(ping);
        System.out.println("-===================");
        Long lpush = jedis.lpush("nihao", "zaiganma", "zaizhe");

        List<String> nihao = jedis.lrange("nihao", 0, -1);
        for (String s : nihao) {
            System.out.println(s);
        }

        //关闭连接
        jedis.close();

        //关闭池连接
        jedisPool.close();



    }
}
