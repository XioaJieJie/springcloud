package com.huang.springCloud.service.impl;

import com.huang.springCloud.dao.PaymentMapper;
import com.huang.springCloud.pojo.Payment;
import com.huang.springCloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int Create(Payment payment) {
        return paymentMapper.Create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
