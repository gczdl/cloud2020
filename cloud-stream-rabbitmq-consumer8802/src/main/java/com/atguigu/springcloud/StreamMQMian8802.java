package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zdl
 * @create 2020/8/11 15:55
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMian8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMian8802.class,args);
    }
}
