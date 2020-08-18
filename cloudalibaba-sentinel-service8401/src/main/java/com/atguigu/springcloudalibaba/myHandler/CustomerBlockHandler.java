package com.atguigu.springcloudalibaba.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entity.CommonResult;

/**
 * @author zdl
 * @create 2020/8/18 15:54
 */
public class CustomerBlockHandler {


    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义，global handlerException-----1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义，global handlerException-----2");
    }
}
