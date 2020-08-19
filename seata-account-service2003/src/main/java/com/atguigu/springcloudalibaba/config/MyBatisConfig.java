package com.atguigu.springcloudalibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther zzyy
 * @create 2019-12-11 16:57
 */
@Configuration
@MapperScan({"com.atguigu.springcloudalibaba.dao"})
public class MyBatisConfig {
}
