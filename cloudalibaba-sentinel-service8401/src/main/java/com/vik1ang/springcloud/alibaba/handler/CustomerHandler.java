package com.vik1ang.springcloud.alibaba.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.vik1ang.springcloud.entities.CommonResult;
import com.vik1ang.springcloud.entities.Payment;

public class CustomerHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客户自定义, global handler ----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义, global handler ----2");
    }
}
