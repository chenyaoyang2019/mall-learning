package com.macro.mall.tiny.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @class: OrderTimeOutCancelTask
 * @description: 订单超时并解锁库存的定时器
 * @author: cyy
 * @create: 2022-08-10 20:52
 **/
@Component
public class OrderTimeOutCancelTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderTimeOutCancelTask.class);

    /**
     * cron 表达式：Seconds Minutes Hours DayOfMonth Months DayOfWeek [Year]
     * 每10分钟扫描一次，扫描设定超时时间之前下的订单，如果没有支付则取消该订单
     */
    @Scheduled(cron = "0 0/10 * ? * ?")
    private void cancelOrderTimeOut() {
        LOGGER.info("取消订单，并根据sku编号释放锁定库存");
    }

}
