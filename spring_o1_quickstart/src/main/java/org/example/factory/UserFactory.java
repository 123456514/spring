package org.example.factory;

import org.example.dao.impl.UserDaoImpl;

public class UserFactory {
    public UserDaoImpl getUserDaoBean(){
        return new UserDaoImpl();
    }
}
