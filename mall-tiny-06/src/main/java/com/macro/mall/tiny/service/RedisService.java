package com.macro.mall.tiny.service;

/**
 * @author: chenyaoyang
 * @date: 2022/8/8 12:06
 * @description: Redis操作
 *              对象和数组都以JSON形式进行存储
 **/
public interface RedisService {

    /**
     * 存储数据
     * @param key
     * @param value
     */
    void set(String key, String value);

    /**
     * 获取数据
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 是指超期时间
     * @param key
     * @param expire
     * @return
     */
    boolean expire(String key, long expire);

    /**
     * 删除数据
     * @param key
     */
    void remove(String key);

    /**
     * 自增操作
     * @param key
     * @param delta 自增步长
     * @return
     */
    Long increment(String key, long delta);

}
