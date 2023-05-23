package com.bit.exam.test3;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
    public void loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("[공통 기능] 핵심 기능 실행전");
         joinPoint.proceed();
        System.out.println("[공통 기능] 핵심 기능 실행 후");

    }
}
