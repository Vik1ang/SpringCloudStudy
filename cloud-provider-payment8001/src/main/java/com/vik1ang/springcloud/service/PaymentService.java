package com.vik1ang.springcloud.service;

import com.vik1ang.springcloud.entities.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
