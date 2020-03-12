package com.ctp.family.rabbitMq;

import com.ctp.family.commonUtil.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.QueueingConsumer;

/**
 * ClassName:16338
 * package:com.ctp.family.rabbitMq
 * Description:TODO
 *
 * @date:2020/1/20 - 16:00
 * @Author:chaotianpeng
 */
public class Consume {
    private final static String QUEUE_NAME = "q_test_01";
    public static void main(String[] args) {
        Connection mqConnection = null;
        try {
            mqConnection = ConnectionUtil.getMqConnection();
            Channel channel = mqConnection.createChannel();
            channel.queueDeclare(QUEUE_NAME,false,false,false,null);
            QueueingConsumer queueingConsumer = new QueueingConsumer(channel);
            channel.basicConsume(QUEUE_NAME,queueingConsumer);
            // 获取消息
            while (true) {
                QueueingConsumer.Delivery delivery = queueingConsumer.nextDelivery();
                String message = new String(delivery.getBody());
                System.out.println(" [x] Received '" + message + "'");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
