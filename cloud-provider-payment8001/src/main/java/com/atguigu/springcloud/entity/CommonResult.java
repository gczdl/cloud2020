package com.atguigu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zdl
 * @create 2020/7/24 11:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
