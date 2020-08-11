package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author zdl
 * @create 2020/8/3 15:09
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_ok(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo-ok";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo-timeout";
    }
}
