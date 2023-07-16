package com.example.easypay.controller.order.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@ToString(callSuper = true)
public class OrderPageRespVO{
    private Long id;

    //商品标题
    private String subject;

    //订单编号
    private String orderNo;

    //订单金额
    private Long totalAmount;

    //商品描述
    private String description;

    //下单时间
    private Timestamp createTime;

    //更新时间
    private Timestamp updateTime;
}
