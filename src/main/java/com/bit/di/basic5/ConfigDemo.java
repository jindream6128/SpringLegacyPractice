package com.bit.di.basic5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.HashMap;
import java.util.Map;

//importresource -> 여러개를 가지고올수있음 xml
//XML 대신 -> 자바로 할수있도록 해준다 -> xml로 하던 작업들을 !
@Configuration
@ImportResource({"person.xml","book.xml"})

public class ConfigDemo {
    //만약 지정을 안하면 메소드의 이름 그 자체를 Bean으로 읽어드린다.
    @Bean
    public StateServer getStateServer(){
        return new StateServer("127.0.0.1:8080:mysql;", 7777 , "scott", "tiger");

    }
    @Bean
    public DmlServer getDmlServer(){
        return new DmlServer(new StateServer("127.0.0.1:80:oracel;", 8888 , "bit", "bit1234"));
    }

    @Bean
    public Map<String, String> getMap(){
        HashMap<String, String>map = new HashMap<String,String>();
        map.put("1","딸기");
        map.put("2","수박");
        map.put("3","멜론");
        map.put("4","키위");
        map.put("5","사과");
        return map;
    }
}
