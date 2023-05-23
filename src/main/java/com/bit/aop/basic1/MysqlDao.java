package com.bit.aop.basic1;

public class MysqlDao implements Dao{

    @Override
    public void update(int x) {
        System.out.println("MysqlDao update");
    }

    @Override
    public void select() {
        System.out.println("Mysql select");

    }
}
