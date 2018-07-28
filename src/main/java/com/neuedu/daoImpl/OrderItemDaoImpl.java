package com.neuedu.daoImpl;

import com.neuedu.dao.OrderItemDao;
import com.neuedu.data.OrderItemData;
import com.neuedu.entity.OrderItem;

import java.util.List;

public class OrderItemDaoImpl implements OrderItemDao {
    OrderItemData orderItemData = new OrderItemData();

    @Override
    public boolean addOrderItem(List<OrderItem> orderItem) {
        // TODO Auto-generated method stub
        return OrderItemData.OrderItems.addAll(orderItem);
    }

    @Override
    public List<OrderItem> findAll() {
        // TODO Auto-generated method stub
        return OrderItemData.OrderItems;
    }

    @Override
    public boolean deleteOrderItem(int id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean updateOrderItem(OrderItem orderItem) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int idBySize() {
        // TODO Auto-generated method stub
        return 0;
    }

}
