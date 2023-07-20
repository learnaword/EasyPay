package com.example.easypay.service;

import com.example.easypay.dal.dataobject.PayOrderDO;

public interface PayOrderService {
    public void createOrder();

    public void cancelOrder(Long orderId);

    public PayOrderDO getOrderById(Long orderId);

}
