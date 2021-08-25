package com.vik1ang.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfoOk(Integer id) {
        return "---- PaymentFallbackService fallback paymentInfoOk";
    }

    @Override
    public String paymentInfoTimeout(Integer id) {
        return "---- PaymentFallbackService fallback paymentInfoTimeout";
    }
}
