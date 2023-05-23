package com.bit.di.basic5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

public class ConfigDemoMain {
    //만약 지정을 안하면 메소드의 이름 그 자체를 Bean으로 읽어드린다.
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigDemo.class); //여기서 쌍따옴표 쓰며는 문자열로 받아서 안된다!
        //System.out.println(applicationContext.getBean("getStateServer"));
        /*System.out.println(applicationContext.getBean("sungso"));
        System.out.println(applicationContext.getBean("getDmlServer"));
        System.out.println(applicationContext.getBean("getMap"));

        Map<String,String> testmap = (Map<String, String>) applicationContext.getBean("getMap");
*/

        System.out.println(applicationContext.getBean("person2"));
        System.out.println(applicationContext.getBean("book1"));
    }
}
