package com.how2java.aop;
import org.aspectj.lang.ProceedingJoinPoint;
 
public class Logging {
 
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start process:" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end process:" + joinPoint.getSignature().getName());
        return object;
    }
}