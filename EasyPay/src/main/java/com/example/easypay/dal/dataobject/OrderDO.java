package com.example.easypay.dal.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.easypay.enums.OrderStatusEnum;
import lombok.*;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

@TableName("t_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class OrderDO extends BaseDO{
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

    /**
     * 订单状态
     *
     * 枚举{@link OrderStatusEnum}
     */
    private Integer status;

}
