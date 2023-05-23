package com.bit.di.basic4;

import org.springframework.stereotype.Component;

@Component(value = "myBatisDaoImp")
public class MyBatisDaoImp implements UserDao{
    @Override
    public void selectAllUser() {
        System.out.println("MyBatisDaoImp selectAllUser()");
    }

    @Override
    public void updateUser() {
        System.out.println("MyBatisDaoImp updateUser()");
    }

    @Override
    public void deleteUser() {
        System.out.println("MyBatisDaoImp deleteUser()");
    }
}
