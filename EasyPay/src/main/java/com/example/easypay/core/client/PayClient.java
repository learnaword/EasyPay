package com.example.easypay.core.client;

import com.alipay.api.AlipayApiException;
import com.example.easypay.core.client.dto.refund.PayOrderRefundReqDTO;
import com.example.easypay.core.client.dto.refund.PayOrderRefundRespDTO;
import com.example.easypay.core.client.dto.submit.PayOrderSubmitReqDTO;
import com.example.easypay.core.client.dto.submit.PayOrderSubmitRespDTO;

public interface PayClient {

    /**
     * 提交订单
     * @param reqDTO
     * @return
     */
    String submitOrder(PayOrderSubmitReqDTO reqDTO);

    /*
    *退款接口
     */
    PayOrderRefundRespDTO refundOrder(PayOrderRefundReqDTO reqDTO);


}
