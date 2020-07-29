package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.server.PaymentServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zdl
 * @create 2020/7/24 12:03
 */
@Controller
@Slf4j
public class PaymentController {

    @Resource
    private PaymentServer paymentServer;

    @Autowired
    DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    @ResponseBody
    public CommonResult create(@RequestBody Payment payment) {
        int result=paymentServer.create(payment);
        log.info("*******插入结果："+result);
        if(result>0){
            return new CommonResult(200,"插入成功,serverPort"+serverPort,result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    @ResponseBody
    public CommonResult getPaymentById(@PathVariable("id") long id) {
        Payment payment=paymentServer.getPaymentById(id);
        log.info("*******查询结果："+payment);
        if(payment!=null){
            return new CommonResult(200,"查询成功,serverPort"+serverPort,payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询id："+id,null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    @ResponseBody
    public Object discovery(){
        List<String> services= discoveryClient.getServices();
        for(String element:services){
            log.info("*****element:"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for(ServiceInstance instance:instances){
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
}
