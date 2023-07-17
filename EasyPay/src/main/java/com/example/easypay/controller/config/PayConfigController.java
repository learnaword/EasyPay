package com.example.easypay.controller.config;

import com.example.easypay.service.impl.ConfigServiceImpl;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/config")
public class PayConfigController {

    @Resource
    private ConfigServiceImpl configService;
}
