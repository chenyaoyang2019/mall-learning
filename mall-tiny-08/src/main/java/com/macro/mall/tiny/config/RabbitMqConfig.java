package com.macro.mall.tiny.config;

import com.macro.mall.tiny.dto.QueueEnum;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: chenyaoyang
 * @date: 2022/8/15 11:51
 * @description: 消息队列配置
 **/
@Configuration
public class RabbitMqConfig {

    /**
     * 订单消息实际消费队列所绑定的交换机
     * @return
     */
    @Bean
    DirectExchange orderDirect() {
        return (DirectExchange) ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_ORDER_CANCLE.getExchange())
                .durable(true)
                .build();
    }

    /**
     * 订单延迟队列所绑定的交换机
     * @return
     */
    @Bean
    DirectExchange orderTtlDirect() {
        return (DirectExchange) ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_TTL_ORDER_CANCLE.getExchange())
                .durable(true)
                .build();
    }

    /**
     * 订单实际消费
     * @return
     */
    @Bean
    Queue orderQueue() {
        return new Queue(QueueEnum.QUEUE_ORDER_CANCLE.getName());
    }

    /**
     * 订单延迟队列（死信队列）
     * @return
     */
    @Bean
    Queue orderTtlQueue() {
        return QueueBuilder
                .durable(QueueEnum.QUEUE_TTL_ORDER_CANCLE.getName())
                .withArgument("x-dead-letter-exchange", QueueEnum.QUEUE_ORDER_CANCLE.getExchange()) //到期后转发的交换机
                .withArgument("x-dead-letter-routing-key", QueueEnum.QUEUE_ORDER_CANCLE.getRouteKey()) //到期后转发的路由键
                .build();
    }

    /**
     * 将订单队列绑定到交换机
     * @return
     */
    @Bean
    Binding orderBinding(DirectExchange orderExchange, Queue orderQueue) {
        return BindingBuilder
                .bind(orderQueue)
                .to(orderExchange)
                .with(QueueEnum.QUEUE_ORDER_CANCLE.getRouteKey());
    }
    /**
     * 将订单延迟队列绑定到交换机
     * @return
     */
    @Bean
    Binding orderTtlBinding(DirectExchange orderTtlExchange, Queue orderTtlQueue) {
        return BindingBuilder
                .bind(orderTtlQueue)
                .to(orderTtlExchange)
                .with(QueueEnum.QUEUE_TTL_ORDER_CANCLE.getRouteKey());
    }


}
