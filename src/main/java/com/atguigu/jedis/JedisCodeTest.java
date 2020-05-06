package com.atguigu.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Protocol;

import java.util.List;

public class JedisCodeTest {
    public static void main(String[] args) {
        //准备连接信息
        String ipAddress ="192.168.1.102";
        int port = Protocol.DEFAULT_PORT;

        //指定redi服务器的IP和端口号
        Jedis jedis = new Jedis(ipAddress, port);


        //执行ping命令
        String ping = jedis.ping();
        System.out.println(ping);
        Long pushResult = jedis.lpush("animal", "cat", "dog", "tiger");

        System.out.println(pushResult);

        List<String> animal = jedis.lrange("animal", 0, -1);
        for (String s : animal) {
            System.out.println(s);
        }

        //关闭连接
        jedis.close();

        //在fhotfix分支所做的修改(happy分支）
        //在fhotfix分支所做的修改（Master)
        //合并两个分支解决冲突
        //new libe。。。
        //测试分支和远程库协同操作（happy分支）
    }
}
