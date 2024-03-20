package org.example.dao.impl;

import org.example.dao.OrderDao;
import org.springframework.core.annotation.Order;

public class OrderDaoImpl  implements OrderDao {
    @Override
    public void save() {
        System.out.println("orderDao Impl");
    }
}
