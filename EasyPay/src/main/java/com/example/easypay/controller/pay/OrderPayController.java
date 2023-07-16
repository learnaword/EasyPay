package com.example.easypay.controller.pay;

import com.example.easypay.common.pojo.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.easypay.common.pojo.CommonResult.success;

@RestController
@RequestMapping("/pay")
public class OrderPayController {

    @RequestMapping("closeTrade")
    public CommonResult<Boolean> closeTrade(){
        return success(true);
    }

    @RequestMapping("refund")
    public CommonResult<Boolean> refund(){
        return success(true);
    }

    @RequestMapping("pay")
    public CommonResult<Boolean> pay(){
        return success(true);
    }
}
