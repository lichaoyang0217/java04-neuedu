package com.neuedu.service;

import com.neuedu.entity.Order;

import java.util.List;

public interface OrderService {

    boolean addOrder();

    List<Order> seeOrder();

}
