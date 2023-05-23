package com.bit.aop.basic2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UnitMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/com/bit/aop/basic2/unit.xml");
        Unit unit = (Unit) applicationContext.getBean("marine");
        unit.doCommend();

    }
}
