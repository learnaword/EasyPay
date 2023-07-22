package com.example.easypay.controller.pay;

import com.example.easypay.common.pojo.CommonResult;
import com.example.easypay.controller.pay.VO.PayOrderSubmitReqVO;
import com.example.easypay.service.impl.PayServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pay")
public class PayController {

    @Resource
    private PayServiceImpl payServiceimpl;

    @PostMapping("/submit")
    public CommonResult<String> submitOrder(PayOrderSubmitReqVO payOrderSubmitReqVO){
        return CommonResult.success(payServiceimpl.submitOrder(payOrderSubmitReqVO));
    }
}
