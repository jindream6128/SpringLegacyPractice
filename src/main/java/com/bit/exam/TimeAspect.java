package com.bit.exam;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
public class TimeAspect {

    //전처리
    @Before("execution(public int com.bit.basic*.*(..))")
    public void BeforeAdvice(JoinPoint joinPoint){
        System.out.println("@BeforeAdvice");
        Signature signature = joinPoint.getSignature();
        System.out.println("---------------------------------");
        System.out.println("Target:   " + joinPoint.getTarget());
        System.out.println("Signature:   "+joinPoint.getSignature());
        System.out.println("SignatureMehodName:    "+joinPoint.getSignature().getName());
        System.out.println("signatureTypeName:   "+joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("---------------------------------");

        Date date = new Date();
        System.out.println(date);
    }

//    @After("execution(public int com.bit.basic*.*(..))")
//    public void Aftes


}
