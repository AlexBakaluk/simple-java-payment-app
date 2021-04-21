package com.javastart.springhomework.controller;

import com.javastart.springhomework.controller.dto.PaymentRequestDTO;
import com.javastart.springhomework.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payments")
    public Object pay(@RequestBody PaymentRequestDTO requestDTO) {
        return paymentService.pay(requestDTO.getAccountId(), requestDTO.getAmount());
    }

    @PostMapping("/deposits")
    public Object deposit(@RequestBody PaymentRequestDTO requestDTO) {
        return paymentService.deposit(requestDTO.getAccountId(), requestDTO.getAmount());
    }
}
