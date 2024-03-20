package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.dao.impl.BookDaoImpl;
import org.example.service.BookService;

public class BookServiceImpl implements BookService {
    // 得到数据层的 dao
    // 删除业务层中使用new的方式创建出的dao 对象
   // private BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;
    public void setBookDao(BookDao bookDao){
        this.bookDao = bookDao;
    }
    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();;
    }
}
