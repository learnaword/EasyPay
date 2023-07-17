package com.example.easypay.controller.app;

import com.example.easypay.common.pojo.CommonResult;
import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.app.vo.PayAppPageReqVO;
import com.example.easypay.controller.app.vo.PayAppPageRespVO;
import com.example.easypay.convert.app.AppConvert;
import com.example.easypay.dal.dataobject.PayAppDO;
import com.example.easypay.service.impl.PayAppServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

import static com.example.easypay.common.pojo.CommonResult.success;

@RestController
@RequestMapping("/payApp")
public class PayAppController {

    @Resource
    private PayAppServiceImpl payAppService;

    @RequestMapping("/list")
    public CommonResult<PageResult<PayAppPageRespVO>> getPayAppPage(@Valid PayAppPageReqVO payAppPageReqVO){
        PageResult<PayAppDO> pageResult = payAppService.getPayAppPage(payAppPageReqVO);

        return success(AppConvert.INSTANCE.convertPage(pageResult));
    }


}
