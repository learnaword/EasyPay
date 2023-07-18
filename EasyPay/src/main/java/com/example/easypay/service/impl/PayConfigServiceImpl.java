package com.example.easypay.service.impl;

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
}
