package com.neuedu.input;

import com.neuedu.entity.Cart;
import com.neuedu.entity.OrderItem;

import java.util.Scanner;

public class Input {

    /*��������*/
    public static int inputInt(String input) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(input);
        return scanner.nextInt();

    }

    /*�����ַ���*/
    public static String input(String input) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(input);
        return scanner.nextLine();

    }

    public static double inputDouble(String input) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(input);
        return scanner.nextDouble();

    }

    public static OrderItem createItem(int id, long Order_no, Cart c) {


        OrderItem orderItem = new OrderItem();
        orderItem.setId(id);
        orderItem.setProduct_id(c.getProduct().getProductid());
        orderItem.setProduct_name(c.getProduct().getPname());
        orderItem.setOrderItem_no(Order_no);
        orderItem.setCurrent_unit_price(c.getProduct().getPrice());
        orderItem.setQuantity(c.getQuantity());
        orderItem.setTotal_price(c.getProduct().getPrice() * c.getQuantity());
        return orderItem;
    }


}
