package com.bit.di.basic3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ServerSystemMain {

    //의존성 -> 참조하는 주소를 얻는거
    public static void main(String[] args) {
        //spring dom 객체 xml을 읽어서 메모리 할당하고 모델을 만들어놓는다
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/com/bit/di/basic3/Dbms.xml");
        ServerSystem serverSystem = (ServerSystem)applicationContext.getBean("serverSystem");
        System.out.println(serverSystem);

    }

}
