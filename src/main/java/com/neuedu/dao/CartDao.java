package com.neuedu.dao;

import com.neuedu.entity.Cart;

import java.util.List;

public interface CartDao {

    //��
    boolean addCart(Cart Cart);

    //�鿴
    List<Cart> findAllCart();

    //ɾ��
    boolean deleteCart(int id);

    //�޸�
    boolean updateCartNum(int id, int quantity);

    int idBySize();

    void clearCart();

    Cart findById(int id);


}
