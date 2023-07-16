package com.example.easypay.service;

public interface OrderService {
    public void createOrder();

    public void cancelOrder(Long orderId);
}
