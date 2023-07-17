package com.banma.demo;

import org.junit.Test;

public class Client{
    @Test
    public void test(){
        //真实角色
        Host host=new Host();
        //代理角色目前没有
        ProxyInvocationHandler pih= new ProxyInvocationHandler();
        //动态生成代理类
        //设置要代理的对象
        pih.setRent(host);
        Rent proxy=(Rent) pih.getProxy();//这里的proxy是动态生成的

        //!!!这里相当于执行了ProxyInvocationHandler里面的invoke()方法!!!
        //proxy对象，rent方法对象, 参数arg对象数组作为参数传入ProxyInvocationHandler里面的invoke()方法
        proxy.rent();

    }
}
