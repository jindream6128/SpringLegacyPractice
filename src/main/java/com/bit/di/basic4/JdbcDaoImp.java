package com.bit.di.basic4;

import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImp implements UserDao{
    @Override
    public void selectAllUser() {
        System.out.println("JdbcDaoImp selectAllUser()");
    }

    @Override
    public void updateUser() {
        System.out.println("JdbcDaoImp updateUser()");
    }

    @Override
    public void deleteUser() {
        System.out.println("JdbcDaoImp deleteUser()");
    }
}
