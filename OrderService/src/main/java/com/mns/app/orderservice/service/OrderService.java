package com.mns.app.orderservice.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public String placeOrder() {
        return "Order placed successfully";
    }
    public String cancelOrder() {
        return "Order cancelled successfully";
    }
}
