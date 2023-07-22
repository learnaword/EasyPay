package com.example.easypay.core.client.impl;

import com.alipay.api.AlipayApiException;
import com.example.easypay.core.client.PayClient;
import com.example.easypay.core.client.PayClientConfig;
import com.example.easypay.core.client.dto.refund.PayOrderRefundReqDTO;
import com.example.easypay.core.client.dto.refund.PayOrderRefundRespDTO;
import com.example.easypay.core.client.dto.submit.PayOrderSubmitReqDTO;
import com.example.easypay.core.client.dto.submit.PayOrderSubmitRespDTO;
import com.sun.javaws.jnl.IconDesc;


public abstract class AbstractPayClient implements PayClient {

    private String code;

    private Long appId;

    protected PayClientConfig payClientConfig;

    public AbstractPayClient(String code,Long appId,PayClientConfig payClientConfig){
        this.payClientConfig = payClientConfig;
        this.appId = appId;
        this.code = code;
    }

    /**
     * 提交订单
     * @param reqDTO
     * @return
     */
    @Override
    public String submitOrder(PayOrderSubmitReqDTO reqDTO){

        try {
            return doSubmitOrder(reqDTO);
        } catch (AlipayApiException e) {
            throw new RuntimeException(e);
        }
        //提交逻辑有子类来实现
    }

    /**
     * 提交订单
     * @param reqDTO
     * @return
     */
    @Override
    public PayOrderRefundRespDTO refundOrder(PayOrderRefundReqDTO reqDTO) {

        doRefundOrder(reqDTO);
        //提交逻辑有子类来实现
        return null;
    }

    /**
     * 由子类提供提交实现
     * @param reqDTO
     */
    protected abstract String doSubmitOrder(PayOrderSubmitReqDTO reqDTO) throws AlipayApiException;

    /**
     * 由子类提供退款逻辑实现
     * @param reqDTO
     */
    protected abstract void doRefundOrder(PayOrderRefundReqDTO reqDTO);

}
