package com.example.easypay.convert.config;

import com.example.easypay.controller.config.vo.UpdatePayConfigReqVO;
import com.example.easypay.dal.dataobject.PayConfigDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PayConfigConvert {
    PayConfigConvert INSTANCE = Mappers.getMapper(PayConfigConvert.class);

    @Mapping(target = "config",ignore = true)
    PayConfigDO convert(UpdatePayConfigReqVO bean);
}
