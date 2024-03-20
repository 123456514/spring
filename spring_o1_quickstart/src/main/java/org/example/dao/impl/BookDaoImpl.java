package org.example.dao.impl;

import org.example.dao.BookDao;

public class BookDaoImpl implements BookDao {
//    public BookDaoImpl(int i){
//        System.out.println("hello dao");
//    }
    public BookDaoImpl(){
        System.out.println("Hello dao");
    }
    @Override
    public void save() {
        System.out.println("book save");
    }
}
