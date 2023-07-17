package com.example.easypay.controller.app.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.example.easypay.enums.OrderStatusEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString(callSuper = true)
public class PayAppPageRespVO {
    /**
     * 业务模块id
     */
    private Long id;

    /**
     * 业务昵称
     */
    private String name;

    /**
     * 回调地址
     */
    private String notifyUrl;

    /**
     * 退款通知
     */
    private String notifyRefundUrl;

    /**
     * 是否开启
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

}
