package com.example.easypay.dal.mysql;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.order.vo.OrderPageReqVO;
import com.example.easypay.dal.dataobject.OrderDO;
import com.example.easypay.dal.mysql.core.mapper.BaseMapperX;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapperX<OrderDO> {
    default PageResult<OrderDO> selectPage(OrderPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapper<OrderDO>()
                .orderByDesc(OrderDO::getId));
    }
}
