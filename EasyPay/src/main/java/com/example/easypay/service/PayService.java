package com.example.easypay.service;

import com.alipay.api.AlipayApiException;
import com.example.easypay.controller.pay.VO.PayOrderRefundReqVO;
import com.example.easypay.controller.pay.VO.PayOrderSubmitReqVO;

public interface PayService {
    String submitOrder(PayOrderSubmitReqVO payOrderSubmitReqVo) throws AlipayApiException;
    void refundOrder(PayOrderRefundReqVO payOrderRefundReqVo);

}
