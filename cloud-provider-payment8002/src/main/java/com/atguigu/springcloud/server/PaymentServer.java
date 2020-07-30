package com.atguigu.springcloud.server;

import com.atguigu.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author zdl
 * @create 2020/7/24 12:00
 */
public interface PaymentServer {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") long id);
}
