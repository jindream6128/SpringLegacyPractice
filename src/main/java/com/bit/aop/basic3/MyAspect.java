package com.bit.aop.basic3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
public class MyAspect {

    @Before("execution(public * com.bit.aop.basic3.Search*.*(..))")
    public void dataAttributeSearch(JoinPoint joinPoint) { //Before
        System.out.println("@BeforeAdvice");
        //signature은 매칭되는 메서드를 가지고옴
        Signature signature = joinPoint.getSignature();
        String methodName = (signature.getName());

        //System.out.println("signature: "+signature.getName());
        Date date = new Date();


    }

   @After("execution(public * com.bit.aop.basic3.Search*.*(..))") //정상적으로 종료하던, 비정상적으로 종료하던
    public void AfterAttributeSearch(JoinPoint joinPoint) { //Before
        Signature signature = joinPoint.getSignature();
        System.out.println("@After");
    }



}
