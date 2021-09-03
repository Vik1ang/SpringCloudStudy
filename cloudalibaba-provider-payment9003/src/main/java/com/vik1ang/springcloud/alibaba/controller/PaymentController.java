package com.vik1ang.springcloud.alibaba.controller;

import com.vik1ang.springcloud.entities.CommonResult;
import com.vik1ang.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1L, new Payment(1L, "ea4bc787-d7a3-47aa-a1ce-a1144e467e23"));
        hashMap.put(2L, new Payment(2L, "b0c497ea-e8a4-4f5b-a33b-8419bd3810cb"));
        hashMap.put(3L, new Payment(3L, "6d3cd570-6df4-472b-bf27-32e4563ea6f4"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        return new CommonResult<>(200, "from mysql, serverPort: " + serverPort, payment);
    }

}
