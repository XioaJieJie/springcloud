package com.huang.springCloud.controller;

import com.huang.springCloud.pojo.CommonResult;
import com.huang.springCloud.pojo.Payment;
import com.huang.springCloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult Create(Payment payment){
        int create = paymentService.Create(payment);
        log.info("*****插入结果"+create);
        if(create > 0){
            return new CommonResult(200,"插入成功");
        }else{
            return new CommonResult(400,"插入失败");
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("****查询结果"+paymentById);
        if(paymentById != null){
            return new CommonResult(200,"查询成功",paymentById);
        }else{
            return new CommonResult(400,"没有对应记录，查询ID："+id);
        }
    }
}
