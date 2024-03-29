package com.atguigu.amqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** 自动配置
 *  1、RabbitAutoConfiguration
 *  2、自动配置了连接工厂ConnectionFactory
 *  3、RabbitProperties封装了RabbitMQ的配置
 *  4、RabbitTemplate：给RabbitMQ发送和接收消息
 *  5、AmqpAdmin：是rabbitmq的系统管理组件
 *      AmqpAdmin：创建和删除Queue、Exchange、Bingding
 *  6、@EnableRabbit+@RabbitListener将监听消息队列的内容
 *
 */
@EnableRabbit  //开启基于注解的RabbitMQ
@SpringBootApplication
public class Springboot02AmqpApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02AmqpApplication.class, args);
    }

}

