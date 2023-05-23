package com.bit.aop.basic1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DaoMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/com/bit/aop/basic1/dao.xml");
        //Dao dao1 = (Dao)applicationContext.getBean("oracleDao");
        Dao dao = (Dao)applicationContext.getBean("mysqlDao");
        dao.select();
        //dao.update(10);


    }
}
