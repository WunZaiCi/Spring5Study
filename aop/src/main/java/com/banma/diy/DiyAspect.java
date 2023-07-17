package com.banma.diy;

/**
 * 使用自定义切面类 实现AOP
 */
public class DiyAspect {
    public void before(){
        System.out.println("-----------方法执行前————————————————");
    }

    public void after(){
        System.out.println("-----------方法执行后————————————————");
    }
}
