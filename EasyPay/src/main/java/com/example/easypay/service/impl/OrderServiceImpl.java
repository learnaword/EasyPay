package com.example.easypay.service.impl;
import java.time.LocalDateTime;
import java.util.Date;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.easypay.common.pojo.PageResult;
import com.example.easypay.controller.order.vo.OrderPageReqVO;
import com.example.easypay.dal.dataobject.OrderDO;
import com.example.easypay.dal.mysql.OrderMapper;
import com.example.easypay.enums.OrderStatusEnum;
import com.example.easypay.service.OrderService;
import com.example.easypay.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public void createOrder() {
        OrderDO order = new OrderDO();
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
        orderMapper.updateById(new OrderDO().setId(orderId).setStatus(OrderStatusEnum.CANCEL.getStatus()));
    }

    public PageResult<OrderDO> getOrderPage(OrderPageReqVO orderPageReqVO){
        return orderMapper.selectPage(orderPageReqVO);
    }
}
