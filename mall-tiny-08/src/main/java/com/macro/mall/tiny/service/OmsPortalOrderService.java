package com.macro.mall.tiny.service;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: chenyaoyang
 * @date: 2022/8/16 17:50
 * @description: 前台订单管理
 **/
public interface OmsPortalOrderService {

    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     * @param orderId
     */
    void cancelOrder(Long orderId);
}
