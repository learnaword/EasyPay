package com.example.easypay.service;

import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.app.vo.PayAppPageReqVO;
import com.example.easypay.dal.dataobject.PayAppDO;

public interface PayAppService {
    PageResult<PayAppDO> getPayAppPage(PayAppPageReqVO payAppPageReqVO);
}
