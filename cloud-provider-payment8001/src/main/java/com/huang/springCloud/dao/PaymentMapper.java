package com.huang.springCloud.dao;

import com.huang.springCloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PaymentMapper {
    int Create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
