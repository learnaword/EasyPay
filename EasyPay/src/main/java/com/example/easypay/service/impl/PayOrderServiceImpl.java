package com.example.easypay.service.impl;
import java.time.LocalDateTime;

import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.order.vo.PayOrderPageReqVO;
import com.example.easypay.dal.dataobject.PayOrderDO;
import com.example.easypay.dal.mysql.PayOrderMapper;
import com.example.easypay.enums.OrderStatusEnum;
import com.example.easypay.service.PayOrderService;
import com.example.easypay.utils.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PayOrderServiceImpl implements PayOrderService {

    @Resource
    private PayOrderMapper orderMapper;

    @Override
    public void createOrder() {
        PayOrderDO order = new PayOrderDO();
        order.setOrderNo(StringUtils.createOrderNum());
        order.setSubject("测试数据");
        order.setTotalAmount(1L);
        order.setDescription("这是测试订单");
        order.setStatus(OrderStatusEnum.NO.getStatus());
        order.setCreateTime(LocalDateTime.now());
        order.setUpdateTime(LocalDateTime.now());
        orderMapper.insert(order);
    }

    @Override
    public void cancelOrder(Long orderId) {
        orderMapper.updateById(new PayOrderDO().setId(orderId).setStatus(OrderStatusEnum.CANCEL.getStatus()));
    }

    public PageResult<PayOrderDO> getOrderPage(PayOrderPageReqVO orderPageReqVO){
        return orderMapper.selectPage(orderPageReqVO);
    }

    public PayOrderDO getOrderById(Long orderId) {
        return orderMapper.selectOne(PayOrderDO::getId,orderId);
    }
}
