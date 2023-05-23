package com.bit.di.basic1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.*;

public class PersonMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/java/com/bit/di/basic/person.xml");

    /*Person person1 = (Person)applicationContext.getBean("person1") ; //싱글톤
        Person person2 = (Person)applicationContext.getBean("person2") ; //프로토타입
        System.out.println(person1);
        System.out.println(person2);

        person1.setName("kim");
        System.out.println(person1.getName());
        person2.setName("Oh");
        System.out.println(person2.getName());
*/

       /* Person person1 = ((Person)applicationContext.getBean("person1"));
        person1.setName("재웅");*/

       /* ((Person)applicationContext.getBean("person1")).setName("재웅");

        System.out.println(((Person)applicationContext.getBean("person1")).getName());*/


        /*System.out.println(person1.getName());
         */
  /*      ((Person)applicationContext.getBean("person2")).setName("재웅");
        System.out.println(((Person)applicationContext.getBean("person2")).getName());

        ((Person)applicationContext.getBean("person1")).setName("재웅");
        System.out.println(((Person)applicationContext.getBean("person1")).getName());*/

        /* Person person1 = (Person)applicationContext.getBean("person1"); //싱글 이도경
         Person person2 = (Person)applicationContext.getBean("person2"); //프로토타입 김가영
         Person person3 = (Person)applicationContext.getBean("person3"); //싱글톤 name,age생성자 석진성

         System.out.println(person1);
         System.out.println(person2);
         System.out.println(person3);
*/
        //PersonCollection pc1 = (PersonCollection) applicationContext.getBean("pc1");
        //System.out.println(pc1.getList());

        /*List<Person> list = pc1.getList();
        System.out.println(list);
        for(Person p: list)
        {
            System.out.println(p);
        }*/

//        PersonCollection pc1 = (PersonCollection) applicationContext.getBean("pc1");

//        List<Person> list = pc1.getList();
//
//        Set<Person> set = pc1.getSet();
//
//        Properties properties = pc1.getProperties();
//
//        Map<Integer,Person> map = pc1.getMap();
//
//        System.out.println();
//        System.out.println("list: "+ list);
//        System.out.println();
//        System.out.println("set: "+ set);
//        System.out.println();
//        System.out.println("properties: "+ properties);
//        System.out.println();
//        System.out.println("map: "+ map);

        PersonCollection pc1 = (PersonCollection) applicationContext.getBean("pc1");

       /* Iterator iter = pc1.getProperties().entrySet().iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        Properties prop = pc1.getProperties();
        Iterator<Map.Entry<Object, Object>> iterator = prop.entrySet().iterator();


        Set<Person> set = pc1.getSet();
        for(Person p :set){
            System.out.println(p);
        }*/


        Map<Integer,Person> map = pc1.getMap();

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Integer j = iterator.next();

            System.out.println("key: " + j+ " valuie: "+map.get(j));
        }
        }

    }

