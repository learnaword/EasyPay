package com.example.easypay.controller.config;

import com.example.easypay.service.impl.PayConfigServiceImpl;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("pay/config")
public class PayConfigController {

    @Resource
    private PayConfigServiceImpl configService;
}
