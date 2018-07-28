package com.neuedu.daoImpl;

import com.neuedu.dao.OrderDao;
import com.neuedu.data.OrderData;
import com.neuedu.entity.Order;

import java.util.List;

public class OrderDaoImpl implements OrderDao {
    OrderData orderdata = new OrderData();

    @Override
    public boolean addOrder(Order order) {
        // TODO Auto-generated method stub
        return OrderData.orders.add(order);
    }

    @Override
    public List<Order> findAll() {
        // TODO Auto-generated method stub
        return OrderData.orders;
    }

    @Override
    public boolean deleteOrder(int id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean updateOrder(Order Cart) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int idBySize() {
        // TODO Auto-generated method stub
        return OrderData.orders.size() + 1;
    }

}
