package com.bit.di.basic2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BookMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/com/bit/di/basic2/book.xml");
        //여기서 해당경로의 xml파일을 사용하겠다 ! -> xml파일을 읽어서 -> Bean을 생성한다 (DI 아님)

        BookStore bookStore = (BookStore) applicationContext.getBean("bookStore");

        System.out.println(bookStore);

    }
}
