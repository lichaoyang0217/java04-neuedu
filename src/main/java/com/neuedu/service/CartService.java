package com.neuedu.service;

import com.neuedu.entity.Cart;

import java.util.List;

public interface CartService {

    //��
    boolean addCart(Cart Cart);

    //�鿴
    List<Cart> findAllCart();

    //ɾ��
    boolean deleteCart(int id);

    //�޸�
    boolean updateCartNum(int id, int quantity);

    int idBySize();


    Cart findById(int id);
}	
