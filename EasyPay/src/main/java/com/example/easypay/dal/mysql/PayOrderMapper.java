package com.example.easypay.dal.mysql;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.order.vo.PayOrderPageReqVO;
import com.example.easypay.dal.dataobject.PayOrderDO;
import com.example.easypay.dal.mysql.core.mapper.BaseMapperX;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PayOrderMapper extends BaseMapperX<PayOrderDO> {
    default PageResult<PayOrderDO> selectPage(PayOrderPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapper<PayOrderDO>()
                .orderByDesc(PayOrderDO::getId));
    }
}
