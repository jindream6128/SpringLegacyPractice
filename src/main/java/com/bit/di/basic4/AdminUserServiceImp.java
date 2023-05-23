package com.bit.di.basic4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AdminUserServiceImp implements UserService{

    //@Resource 는 필드랑, 메서드에서만 먹힌다. 생성자에서는 안먹힘
    @Resource(name="myBatisDaoImp")
    //private UserDao dao = new MyBatisDaoImp();
    private UserDao myBatisDaoImp;

/*    @Resource(name="jpaDaoImp")
    private UserDao jpaDaoImp;*/

    @Override
    public void register() {
        myBatisDaoImp.selectAllUser();
    }

    @Override
    public void findUser() {
        //jpaDaoImp.updateUser();
    }
}
