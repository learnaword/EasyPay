package com.example.easypay.convert.app;

import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.app.vo.PayAppPageRespVO;
import com.example.easypay.controller.order.vo.PayOrderPageRespVO;
import com.example.easypay.dal.dataobject.PayAppDO;
import com.example.easypay.dal.dataobject.PayOrderDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 支付应用信息 Convert
 *
 */
@Mapper
public interface AppConvert {

    AppConvert INSTANCE = Mappers.getMapper(AppConvert.class);

    PageResult<PayAppPageRespVO> convertPage(PageResult<PayAppDO> page);


}
