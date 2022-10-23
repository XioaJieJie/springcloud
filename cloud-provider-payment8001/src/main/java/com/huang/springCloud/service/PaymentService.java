package com.huang.springCloud.service;

import com.huang.springCloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    int Create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
