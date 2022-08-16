package com.macro.mall.tiny.dto;

import lombok.Getter;

/**
 * @author: chenyaoyang
 * @date: 2022/8/15 11:45
 * @description: 消息队列枚举类
 **/
@Getter
public enum QueueEnum {

    /**
     * 消息通知队列
     */
    QUEUE_ORDER_CANCLE("mall.order.direct", "mall.order.cancel", "mall.order.cancel"),

    /**
     * 消息通知ttl队列
     */
    QUEUE_TTL_ORDER_CANCLE("mall.order.direct.ttl", "mall.order.cancel.ttl", "mall.order.cancel.ttl");

    /**
     * 交换名称
     */
    private String exchange;

    /**
     * 队列名称
     */
    private String name;

    /**
     * 路由键
     */
    private String routeKey;


    QueueEnum(String exchange, String name, String routeKey) {
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }

}