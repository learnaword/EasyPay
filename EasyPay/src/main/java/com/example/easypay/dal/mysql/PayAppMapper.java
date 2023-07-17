package com.example.easypay.dal.mysql;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.pay.vo.PayAppPageReqVO;
import com.example.easypay.dal.dataobject.PayAppDO;
import com.example.easypay.dal.dataobject.PayOrderDO;
import com.example.easypay.dal.mysql.core.mapper.BaseMapperX;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PayAppMapper extends BaseMapperX<PayApgipDO> {
    default PageResult<PayAppDO> selectPage(PayAppPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapper<PayAppDO>()
                .orderByDesc(PayAppDO::getId));
    }
}
