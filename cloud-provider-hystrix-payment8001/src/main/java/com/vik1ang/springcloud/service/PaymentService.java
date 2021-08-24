package com.vik1ang.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {
    public String paymentInfoOk(Integer id) {
        return "线程池: " + Thread.currentThread().getName() + " paymentInfoOk, id: " + id;
    }

    public String paymentInfoTimeout(Integer id) {

        int sleep = 3;
        try {
            TimeUnit.SECONDS.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "线程池: " + Thread.currentThread().getName() + " paymentInfoTimeout, id: " + id + " using " + sleep + " seconds";
    }
}
