package com.neuedu.serviceImpl;

import com.neuedu.dao.CartDao;
import com.neuedu.daoImpl.CartDaoImpl2;
import com.neuedu.entity.Cart;
import com.neuedu.service.CartService;

import java.util.List;

public class CartServiceImpl implements CartService {
    CartDao cartdao = new CartDaoImpl2();

    @Override
    public boolean addCart(Cart Cart) {
        // TODO Auto-generated method stub
        return cartdao.addCart(Cart);
    }

    @Override
    public List<Cart> findAllCart() {
        // TODO Auto-generated method stub
        return cartdao.findAllCart();
    }

    @Override
    public boolean deleteCart(int id) {
        // TODO Auto-generated method stub
        return cartdao.deleteCart(id);
    }

    @Override
    public boolean updateCartNum(int id, int quantity) {
        // TODO Auto-generated method stub
        return cartdao.updateCartNum(id, quantity);
    }

    @Override
    public int idBySize() {
        // TODO Auto-generated method stub
        return cartdao.idBySize();
    }

    @Override
    public Cart findById(int id) {
        // TODO Auto-generated method stub

        return cartdao.findById(id);
    }

}
