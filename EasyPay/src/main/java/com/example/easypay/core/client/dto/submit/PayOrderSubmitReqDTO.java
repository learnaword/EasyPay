package com.example.easypay.core.client.dto.submit;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
public class PayOrderSubmitReqDTO {

    private String NotifyUrl;

    private String returnUrl;

    private String outTradeNo;

    private Integer totalAmount;

   private String subject;

}
