package com.vik1ang.springcloud.service.impl;

import com.vik1ang.springcloud.dao.PaymentDao;
import com.vik1ang.springcloud.entities.Payment;
import com.vik1ang.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }


}
