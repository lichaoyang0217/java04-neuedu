package com.neuedu.serviceImpl;

import com.neuedu.dao.CartDao;
import com.neuedu.dao.OrderDao;
import com.neuedu.dao.OrderItemDao;
import com.neuedu.daoImpl.CartDaoImpl2;
import com.neuedu.daoImpl.OrderDaoImpl2;
import com.neuedu.daoImpl.OrderItemDaoImpl2;
import com.neuedu.daoImpl.ProductDaoImpl2;
import com.neuedu.entity.Cart;
import com.neuedu.entity.Order;
import com.neuedu.entity.OrderItem;
import com.neuedu.entity.Product;
import com.neuedu.input.Input;
import com.neuedu.service.OrderService;

import java.util.ArrayList;
import java.util.List;


public class OrderServiceImpl implements OrderService {
    OrderDao orderDaoImpl = new OrderDaoImpl2();
    OrderItemDao orderItemDao = new OrderItemDaoImpl2();
    CartDao CartDao = new CartDaoImpl2();

    public static Order createOrder() {
        OrderDao orderDaoImpl = new OrderDaoImpl2();
        Order order = new Order();
        order.setId(orderDaoImpl.idBySize());
        order.setOrder_no(System.currentTimeMillis());
        order.setCreate_time(System.currentTimeMillis());
        return order;

    }

    @Override
    public boolean addOrder() {
        // TODO Auto-generated method stub
        //�����ﳵ��Ϣ����������
        List<Cart> carts = CartDao.findAllCart();
        if (carts == null || carts.size() <= 0) {
            return false;
        }
        Order order = createOrder();

        List<OrderItem> orderitems = new ArrayList<OrderItem>();
        for (int i = 0; i < carts.size(); i++) {
            Cart c = carts.get(i);
            OrderItem orderItemImpl = Input.createItem(order.getId(), order.getOrder_no(), c);
            if (orderItemImpl.getQuantity() <= c.getProduct().getStock()) {
                orderitems.add(orderItemImpl);
            } else {
                return false;
            }
        }
        order.setPayment(payment(orderitems));

        //�µ�
        orderDaoImpl.addOrder(order);
        orderItemDao.addOrderItem(orderitems);
        //���㶩���ܼ۸�
        //����
        for (int i = 0; i < carts.size(); i++) {
            Cart cart = carts.get(i);
            Product p = cart.getProduct();

            int leftStock = p.getStock() - cart.getQuantity();
            p.setStock(leftStock);
            ProductDaoImpl2 productDaoImpl2 = new ProductDaoImpl2();
            boolean issucc = productDaoImpl2.updateProductStock(p);
            if (issucc) {
                System.out.println("����");
            } else {
                return false;
            }

        }
        //��չ��ﳵ
        CartDao.clearCart();
        return true;
    }

    //�鿴����
    @Override
    public List<Order> seeOrder() {
        // TODO Auto-generated method stub
        return orderDaoImpl.findAll();
    }

    //���㶩���۸�
    public double payment(List<OrderItem> orderitems) {
        double payments = 0.0;
        for (int i = 0; i < orderitems.size(); i++) {
            payments += orderitems.get(i).getTotal_price();
        }
        return payments;
    }
}
