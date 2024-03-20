package org.example.factory;

import org.example.dao.impl.OrderDaoImpl;

public class OrderFactory {
    public static OrderDaoImpl getOrderBean(){
        return new OrderDaoImpl();
    }
}
