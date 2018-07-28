package com.neuedu.daoImpl;

import com.neuedu.dao.CartDao;
import com.neuedu.data.CartData;
import com.neuedu.entity.Cart;

import java.util.List;


public class CartDaoImpl implements CartDao {
    CartData cartdata = new CartData();

    @Override
    public boolean addCart(Cart Cart) {
        // TODO Auto-generated method stub
        return CartData.carts.add(Cart);
    }

    @Override
    public List<Cart> findAllCart() {
        // TODO Auto-generated method stub
        return CartData.carts;
    }

    @Override
    public boolean deleteCart(int id) {
        // TODO Auto-generated method stub
        List<Cart> c = CartData.carts;
        for (int i = 0; i < c.size(); i++) {
            Cart carts = c.get(i);
            int _id = carts.getId();
            if (_id == id) {
                c.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateCartNum(int id, int quantity) {
        // TODO Auto-generated method stub

        List<Cart> c = CartData.carts;
        for (int i = 0; i < c.size(); i++) {
            Cart carts = c.get(i);
            int _id = carts.getId();
            if (_id == carts.getId()) {
                carts.setQuantity(quantity);
                return true;
            }
        }
        return false;

    }

    @Override
    public int idBySize() {
        // TODO Auto-generated method stub
        return CartData.carts.size() + 1;
    }

    @Override
    public void clearCart() {
        // TODO Auto-generated method stub
        CartData.carts.clear();
    }


    @Override
    public Cart findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

}
