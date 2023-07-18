package com.example.easypay.dal.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.example.easypay.dal.dataobject.BaseDO;
import lombok.*;
import lombok.experimental.Accessors;

/**
 *
 * @TableName pay_config
 */
@TableName(value ="pay_config")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PayConfigDO extends BaseDO {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 支付类型
     */
    private String code;

    /**
     * 是否开启
     */
    private Integer status;

    /**
     * 与pay_app进行关联
     */
    private Long payAppId;

    /**
     * 描述
     */
    private String remark;

    /**
     * 配置数据
     */
    private String config;
}
