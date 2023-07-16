package com.example.easypay.convert.order;

import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.order.vo.OrderPageRespVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.example.easypay.dal.dataobject.OrderDO;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 支付应用信息 Convert
 *
 * @author 芋艿
 */
@Mapper
public interface OrderConvert {

    OrderConvert INSTANCE = Mappers.getMapper(OrderConvert.class);

    PageResult<OrderPageRespVO> convertPage(PageResult<OrderDO> page);


}
