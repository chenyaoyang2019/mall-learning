package com.macro.mall.tiny.service;

import com.macro.mall.tiny.common.api.CommonResult;

/**
 * @author: chenyaoyang
 * @date: 2022/8/8 12:27
 * @description: 会员管理
 **/
public interface UmsMemberService {

    /**
     * 生成验证码
     * @return
     */
    CommonResult generateAutoCode(String telephone);

    /**
     * 判断验证码和手机号是否匹配
     * @param telephone
     * @param authoCode
     * @return
     */
    CommonResult verifyAuthCode(String telephone, String authoCode);
}
