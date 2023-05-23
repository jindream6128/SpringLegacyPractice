package com.bit.aop.basic4;

import com.bit.exam.test3.Cats;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        //context -> dom 이다 -> xml 돔이다
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/bit/aop/basic4/bean.xml");

        Cats myCat = context.getBean("myCat", Cats.class);
        myCat.getCatsInfo();

        System.out.println("");
    }
}
