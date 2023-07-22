package com.example.easypay.core.client.impl.alipay;

import com.example.easypay.core.client.alipay.AlipayPayClientConfig;
import com.example.easypay.core.client.dto.refund.PayOrderRefundReqDTO;
import com.example.easypay.core.client.dto.submit.PayOrderSubmitReqDTO;
import com.example.easypay.core.enums.PayConfigEnum;
import com.example.easypay.dal.dataobject.PayConfigDO;

public class AlipayAppPayClient extends AbstractAlipyPayClient {

    public AlipayAppPayClient(Long appId, AlipayPayClientConfig payConfig) {
        super(PayConfigEnum.ALIPAY_APP.getCode(),appId,payConfig);
    }

    /*
    * 提供具体的服务调用逻辑
     */
    @Override
    protected String doSubmitOrder(PayOrderSubmitReqDTO reqDTO) {
        return "";
    }

    @Override
    protected void doRefundOrder(PayOrderRefundReqDTO reqDTO) {

    }
}
