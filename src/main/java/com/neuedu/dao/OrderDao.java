package com.neuedu.dao;

import com.neuedu.entity.Order;

import java.util.List;


public interface OrderDao {


    //��
    boolean addOrder(Order order);

    //�鿴
    List<Order> findAll();

    //ɾ��
    boolean deleteOrder(int id);

    //�޸�
    boolean updateOrder(Order Cart);

    int idBySize();


}
