package com.example.easypay.controller.pay.VO;

import lombok.Data;

@Data
public class PayOrderSubmitReqVO {

    //订单id
    private Long orderId;

    //支付方式
    private String code;

    //payAppid
    private Long payAppid;

}
