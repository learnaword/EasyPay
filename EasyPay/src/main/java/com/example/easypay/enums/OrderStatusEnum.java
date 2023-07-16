package com.example.easypay.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 支付订单的通知状态枚举
 *
 * @author 芋道源码
 */
@Getter
@AllArgsConstructor
public enum OrderStatusEnum {

    NO(0, "未支付"),
    SUCCESS(1, "已支付");
    private final Integer status;
    private final String name;

}
