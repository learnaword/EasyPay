package com.example.easypay.controller.config;

import com.example.easypay.common.pojo.CommonResult;
import com.example.easypay.controller.config.vo.CreatePayConfigReqVO;
import com.example.easypay.controller.config.vo.UpdatePayConfigReqVO;
import com.example.easypay.dal.dataobject.PayConfigDO;
import com.example.easypay.service.impl.PayConfigServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/config")
public class PayConfigController {

    @Resource
    private PayConfigServiceImpl payConfigService;

    @RequestMapping("/get")
    public CommonResult<PayConfigDO> getPayConfig(@RequestParam(value = "id", required = false) Long id,
                                                  @RequestParam(value = "payAppid", required = false) Long appId,
                                                  @RequestParam(value = "code", required = false) String code){
        PayConfigDO payConfig = null;
        if( id != null ){
            payConfig = payConfigService.getPayConfig(id);
        }

        if(appId != null&&code != null){
            payConfig = payConfigService.getPayConfigByCodeAndpayAppid(code,appId);
        }

        return CommonResult.success(payConfig);
    }

    @RequestMapping("/update")
    public CommonResult<Boolean> updatePayConfig(UpdatePayConfigReqVO updatePayConfigReqVO){
        PayConfigDO payConfig = payConfigService.getPayConfig(111l);

        payConfigService.updatePayConfig(updatePayConfigReqVO);
        return CommonResult.success(true);
    }

    @RequestMapping("/create")
    public CommonResult<Boolean> createPayConfig(CreatePayConfigReqVO createPayConfigReqVO){

        payConfigService.createPayConfig(createPayConfigReqVO);
        return CommonResult.success(true);
    }
}
