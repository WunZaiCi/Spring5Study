package com.banma.diy;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 使用注解方式实现AOP
 *
 */
@Aspect //注解标注的这个类是一个切面
public class AnnotationAspect {//也是声明式事务
    //需要传入切入点
    @Before("execution(* com.banma.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("-----------方法执行前————————————————");
    }

    @After("execution(* com.banma.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("-----------方法执行后————————————————");
    }

    //在环绕增强中，我们可以给定一个参数 代表我们要获取处理切入的点
    @Around("execution(* com.banma.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("环绕前");
        //获得签名
        Signature signature = pjp.getSignature();
        System.out.println(signature);
        //执行方法
        Object proceed = pjp.proceed();//这个的前后是before()和after()  均被环绕包裹
        System.out.println("环绕后");
        System.out.println(proceed);

    }
}
