package com.example.easypay.controller.app;

import cn.hutool.core.collection.CollUtil;
import com.example.easypay.common.pojo.CommonResult;
import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.app.vo.PayAppPageReqVO;
import com.example.easypay.controller.app.vo.PayAppPageRespVO;
import com.example.easypay.convert.app.AppConvert;
import com.example.easypay.dal.dataobject.PayAppDO;
import com.example.easypay.dal.dataobject.PayConfigDO;
import com.example.easypay.service.impl.PayConfigServiceImpl;
import com.example.easypay.service.impl.PayAppServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.example.easypay.common.pojo.CommonResult.success;

@RestController
@RequestMapping("/payApp")
public class PayAppController {

    @Resource
    private PayAppServiceImpl payAppService;
    @Resource
    private PayConfigServiceImpl payAppConfigService;

    @RequestMapping("/list")
    public CommonResult<PageResult<PayAppPageRespVO>> getPayAppPage(@Valid PayAppPageReqVO payAppPageReqVO){

        //获取app信息
        PageResult<PayAppDO> pageResult = payAppService.getPayAppPage(payAppPageReqVO);

        //获取app对应的配置信息
        Collection<Long> appIds = convertList(pageResult.getList(), PayAppDO::getId);
        List<PayConfigDO> payAppConfigs= payAppConfigService.getAppConfigListByAppIds(appIds);



        return success(AppConvert.INSTANCE.convertPage(pageResult, payAppConfigs));
    }

    public static <T, U> List<U> convertList(Collection<T> from, Function<T, U> func) {
        if (CollUtil.isEmpty(from)) {
            return new ArrayList<>();
        }

        return from.stream().map(func).filter(Objects::nonNull).collect(Collectors.toList());
    }


}
