package com.bit.aop.basic1;

public class AfterAdvice implements org.springframework.aop.AfterAdvice {

    public void AfterMethod(){
        System.out.println("Connection Check AfterAdvice................ After");
    }
}
