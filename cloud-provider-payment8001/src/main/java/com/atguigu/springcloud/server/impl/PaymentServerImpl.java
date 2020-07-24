package com.atguigu.springcloud.server.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.server.PaymentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zdl
 * @create 2020/7/24 12:01
 */
@Service
public class PaymentServerImpl implements PaymentServer {

    @Autowired
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
