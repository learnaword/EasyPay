package com.example.easypay.service.impl;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.ObjectUtil;
import com.example.easypay.common.utils.JsonUtils;
import com.example.easypay.controller.config.vo.UpdatePayConfigReqVO;
import com.example.easypay.convert.config.PayConfigConvert;
import com.example.easypay.core.client.PayClientConfig;
import com.example.easypay.core.enums.PayConfigEnum;
import com.example.easypay.dal.dataobject.PayConfigDO;
import com.example.easypay.dal.mysql.PayConfigMapper;
import com.example.easypay.service.PayConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
public class PayConfigServiceImpl implements PayConfigService {

    @Resource
    PayConfigMapper payConfigMapper;
    @Override
    public List<PayConfigDO> getAppConfigListByAppIds(Collection<Long> appIds) {
        return payConfigMapper.selectListByAppIds(appIds);
    }
    @Override
    public PayConfigDO getPayConfigByCodeAndPayAppid(String code,Long payAppid) {
        return payConfigMapper.selectOne(
                PayConfigDO::getCode,code,
                PayConfigDO::getPayAppId,payAppid
        );
    }
    @Override
    public PayConfigDO getPayConfig(Long id) {
        return payConfigMapper.selectById(id);
    }
    @Override
    public void updatePayConfig(UpdatePayConfigReqVO updatePayConfigReqVO) {

        PayConfigDO payConfigDO = PayConfigConvert.INSTANCE.convert(updatePayConfigReqVO);

        payConfigDO.setConfig(parseConfig(updatePayConfigReqVO.getCode(),updatePayConfigReqVO.getConfig()));

        payConfigMapper.updateById(payConfigDO);
    }


    private PayClientConfig parseConfig(String code, String configStr){
        // 解析配置
        Class<? extends PayClientConfig> payClass = PayConfigEnum.getByCode(code).getConfigClass();

        PayClientConfig config = JsonUtils.parseObject2(configStr, payClass);

        return config;
    }
}
