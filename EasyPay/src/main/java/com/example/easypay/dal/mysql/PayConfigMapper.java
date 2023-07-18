package com.example.easypay.dal.mysql;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.app.vo.PayAppPageReqVO;
import com.example.easypay.dal.dataobject.PayConfigDO;
import com.example.easypay.dal.mysql.core.mapper.BaseMapperX;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper
public interface PayConfigMapper extends BaseMapperX<PayConfigDO> {
    default PageResult<PayConfigDO> selectPage(PayAppPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapper<PayConfigDO>()
                .orderByDesc(PayConfigDO::getId));
    }

    default List<PayConfigDO> selectListByAppIds(Collection<Long> appIds){
        return selectList(PayConfigDO::getPayAppId, appIds);
    }
}
