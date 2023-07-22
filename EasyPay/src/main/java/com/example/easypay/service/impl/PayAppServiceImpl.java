package com.example.easypay.service.impl;

import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.app.vo.PayAppPageReqVO;
import com.example.easypay.dal.dataobject.PayAppDO;
import com.example.easypay.dal.mysql.PayAppMapper;
import com.example.easypay.service.PayAppService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PayAppServiceImpl implements PayAppService {

    @Resource
    private PayAppMapper payAppMapper;
    @Override
    public PageResult<PayAppDO> getPayAppPage(PayAppPageReqVO payAppPageReqVO) {
        return payAppMapper.selectPage(payAppPageReqVO);
    }

    @Override
    public PayAppDO getPayAppById(Long payAppid) {
        return payAppMapper.selectById(payAppid);
    }
}
