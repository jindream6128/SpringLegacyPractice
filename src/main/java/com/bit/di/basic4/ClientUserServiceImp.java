package com.bit.di.basic4;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ClientUserServiceImp implements UserService{
    @Resource(name = "jdbcDaoImp")
    private UserDao dao;//이렇게만 하면 의존은 하고있지만 의존성은 없다. -> 실질적으로 주입하진 않음

    @Override
    public void register() {
        dao.selectAllUser();
    }

    @Override
    public void findUser() {

    }
}
