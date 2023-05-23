package com.bit.exam.test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/bit/test3/bean.xml");

        Cats myCat = context.getBean("myCat", Cats.class);
        myCat.getCatsInfo();
    }
}
