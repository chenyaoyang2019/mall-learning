package com.cyy.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: chenyaoyang
 * @date: 2022/1/20 18:01
 * @description: MyBatis配置类
 **/
@Configuration
@MapperScan("com.cyy.mall.tiny.mbg.mapper")
public class MyBatisConfig {
}
