package com.example.easypay.service.impl;

import com.example.easypay.dal.dataobject.PayConfigDO;
import com.example.easypay.dal.mysql.PayConfigMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Service
public class PayConfigServiceImpl {

    @Resource
    PayConfigMapper payConfigMapper;
    public List<PayConfigDO> getAppConfigListByAppIds(Collection<Long> appIds) {
        return payConfigMapper.selectListByAppIds(appIds);
    }
}
