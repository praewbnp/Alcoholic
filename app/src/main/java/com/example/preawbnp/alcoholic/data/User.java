package com.example.preawbnp.alcoholic.data;

/**
 * Created by preawbnp on 6/5/2017 AD.
 */

public class User {
    private OrderRepository orderRepository;

    public User(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderRepository getOrderRepository(){
        return orderRepository;
    }
}
