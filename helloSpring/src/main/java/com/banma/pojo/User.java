package com.banma.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//组件注释 等价于<bean id="user" class="com.banma.pojo.User"/>
@Component
public class User {

    @Value("aa")
    public String name;   //等价于public String name = "aa";   <property name="name" value="aa"/>

}
