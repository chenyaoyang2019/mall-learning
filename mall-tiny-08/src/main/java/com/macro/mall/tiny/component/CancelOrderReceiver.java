package com.macro.mall.tiny.component;

import com.macro.mall.tiny.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: chenyaoyang
 * @date: 2022/8/16 17:47
 * @description: 取消订单消息的处理者
 **/
@Component
@RabbitListener(queues = "mall.order.cancel")
public class CancelOrderReceiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(CancelOrderSender.class);

    @Autowired
    private OmsPortalOrderService portalOrderService;

    @RabbitHandler
    public void handle(Long orderId) {
        LOGGER.info("receive delay message orderId:{}", orderId);
        portalOrderService.cancelOrder(orderId);
    }


}
