package com.bit.aop.basic3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SearchMain {
    public static void main(String[] args) {
        //context -> dom 이다 -> xml 돔이다
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/bit/aop/basic3/bean.xml");
        //context. 하면 xml로 만든거를 사용할수 있는것이다. -> 객체는 데이터이다 -> 기능을 가지고있는 데이터이다
        Search search = (Search) context.getBean("adminSearch"); //xml로 만든객체를 가지고온다.

      /*  search.domSaxSearch();
        System.out.println("");

        search.fileSearch();
        System.out.println("");*/

        search.xmlParsing();
        System.out.println("");
    }
}
