package com.example.easypay.service;

import com.example.easypay.controller.config.vo.UpdatePayConfigReqVO;
import com.example.easypay.dal.dataobject.PayConfigDO;

import java.util.Collection;
import java.util.List;

public interface PayConfigService {
    List<PayConfigDO> getAppConfigListByAppIds(Collection<Long> appIds);

    public PayConfigDO getPayConfigByCodeAndPayAppid(String code, Long payAppid);

    public PayConfigDO getPayConfig(Long id);

    public void updatePayConfig(UpdatePayConfigReqVO updatePayConfigReqVO);
}
