package com.cyy.mall.tiny.common.api;

/**
 * @author: chenyaoyang
 * @date: 2022/1/21 11:17
 * @description: 封装API的错误码
 **/
public interface IErrorCode {
    long getCode();

    String getMessage();
}
