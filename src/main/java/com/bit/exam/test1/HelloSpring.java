package com.bit.exam.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/bit/test1/bean.xml");

        Calc bean;
        // "add" 빈을 가져와서 calculate() 호출
        bean = (Calc) context.getBean("add");
        int addResult = bean.calculate();
        System.out.println("25 + 36= " + addResult);

        // "mul" 빈을 가져와서 calculate() 호출
        bean = (Calc) context.getBean("mul");
        int mulResult = bean.calculate();
        System.out.println("25 * 36= " + mulResult);
    }
}
