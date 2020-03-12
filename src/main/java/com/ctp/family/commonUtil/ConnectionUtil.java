package com.ctp.family.commonUtil;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * ClassName:16338
 * package:com.ctp.family.commonUtil
 * Description:TODO
 *
 * @date:2020/1/20 - 15:24
 * @Author:chaotianpeng
 */
public class ConnectionUtil {
    public static Connection getMqConnection() throws Exception {
        //定义连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置服务地址
        factory.setHost("localhost");
        //端口 AMQP的协议端口
        factory.setPort(5672);
        //设置账号信息，用户名、密码、vhost
        factory.setVirtualHost("testhost");
        factory.setUsername("ctp");
        factory.setPassword("ctp");
        // 通过工程获取连接
        Connection connection = factory.newConnection();
        return connection;
    }
}
