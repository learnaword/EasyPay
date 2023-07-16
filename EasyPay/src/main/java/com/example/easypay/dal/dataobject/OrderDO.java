package com.example.easypay.dal.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("t_order")
public class OrderDO {
    //商品id
    @TableId(value="id",type= IdType.AUTO)
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
