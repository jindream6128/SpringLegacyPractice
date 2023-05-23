package com.bit.aop.basic4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
public class LogAop {

    @Before("execution(public * com.bit.aop.basic4.logger*(..))")
    public void loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("[공통 기능] 핵심 기능 실행전");
        joinPoint.proceed();
        System.out.println("[공통 기능] 핵심 기능 실행 후");

    }

   @After("execution(public * com.bit.aop.basic4.logger*(..))") //정상적으로 종료하던, 비정상적으로 종료하던
   public void loggerAop2(ProceedingJoinPoint joinPoint) throws Throwable{
       System.out.println("[공통 기능] 핵심 기능 실행전");
       joinPoint.proceed();
       System.out.println("[공통 기능] 핵심 기능 실행 후");

   }



}
