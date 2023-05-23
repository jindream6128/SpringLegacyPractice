package com.bit.di.basic1;

public class Person {
    private String name;
    private int age;
    private String address;

    public void initPerson(){
        System.out.println("initperson");
    }

    public void destroyPerson(){
        System.out.println("destroy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        super();
        this.name = name;
    }

    public Person() {
        System.out.println("Person() 생성자 불림");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

}
