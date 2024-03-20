package org.example;

import org.example.dao.BookDao;
import org.example.dao.impl.OrderDaoImpl;
import org.example.dao.impl.UserDaoImpl;
import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 创建service 对象
//        BookService service = new BookServiceImpl();
//        service.save();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取到IOC容器中的bean对象
        // bean 的作用范围
        // 在spring 中默认创建的是一个单例的对象，如果要创建非单例的对象 那么就在配置文件中 改变
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
        BookService bookService = (BookService) context.getBean("service");
        bookService.save();
        // 在这里使用的是 静态工厂创建的对象 放到了IOC容器中
        OrderDaoImpl orderDao = (OrderDaoImpl) context.getBean("orderDao");
        orderDao.save();
        // 在这里使用的是 实例化工厂创建的对象 然后把这个对象通过配置写到了 IOC 容器中
        UserDaoImpl userDao = (UserDaoImpl) context.getBean("userDao");
        userDao.save();
    }
}