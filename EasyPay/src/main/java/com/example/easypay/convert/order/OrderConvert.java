package com.example.easypay.convert.order;

import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.order.vo.PayOrderPageRespVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.example.easypay.dal.dataobject.PayOrderDO;

/**
 * 支付应用信息 Convert
 *
 */
@Mapper
public interface OrderConvert {

    OrderConvert INSTANCE = Mappers.getMapper(OrderConvert.class);

    PageResult<PayOrderPageRespVO> convertPage(PageResult<PayOrderDO> page);


}
