package com.neuedu.dao;

import com.neuedu.entity.OrderItem;

import java.util.List;

public interface OrderItemDao {

    //��
    boolean addOrderItem(List<OrderItem> orderItem);

    //�鿴
    List<OrderItem> findAll();

    //ɾ��
    boolean deleteOrderItem(int id);

    //�޸�
    boolean updateOrderItem(OrderItem orderItem);

    int idBySize();


}
