package com.bit.aop.basic1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAdvice {
    public void loggerProcess(ProceedingJoinPoint jp) throws Throwable{
        jp.proceed(); //핵심로직
        System.out.println("-----------------------");
        for(Object o:jp.getArgs()){
            System.out.println(o);
        }
        System.out.println("-----------------------");
        System.out.println("Target:   " + jp.getTarget());
        System.out.println("Signature:   "+jp.getSignature());
        System.out.println("SignatureMehodName:    "+jp.getSignature().getName());
        System.out.println("signatureTypeName:   "+jp.getSignature().getDeclaringTypeName());
        System.out.println("type: " + jp.getSignature().getDeclaringType());
        System.out.println("-----------------------");


        long start = System.currentTimeMillis();
        System.out.println("start: "+start);
        for(int i=0;i<(int)(Math.random())*10000000;i++){

        }
        long end = System.currentTimeMillis();
        System.out.println("end: "+end);
        System.out.println("time: " + (end-start));


    }
}
