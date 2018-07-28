package com.neuedu.serviceImpl;

import com.neuedu.dao.OrderItemDao;
import com.neuedu.daoImpl.OrderItemDaoImpl2;
import com.neuedu.entity.OrderItem;
import com.neuedu.service.OrderItemService;

import java.util.List;

public class OrderItemServiceImpl implements OrderItemService {
    OrderItemDao orderItemDaoImpl = new OrderItemDaoImpl2();

    @Override
    public List<OrderItem> seeOrderItem() {
        // TODO Auto-generated method stub
        return orderItemDaoImpl.findAll();
    }

}
