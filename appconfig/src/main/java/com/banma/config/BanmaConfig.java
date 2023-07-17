package com.banma.config;

import com.banma.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


//这个类也会被Spring容器托管 因为@Configuration本来就是一个@Component
//@Configuration代表这是一个配置类 就是之前的beans.xml
@Configuration
@ComponentScan("com.banma.pojo")
@Import(BanmaConfig2.class)
public class BanmaConfig {

    //就相当与在配置文件中注册一个bean标签
    //方法的名字就相当与bean标签的id属性
    //返回值就相当于class属性
    @Bean
    public User user(){
        return new User();
    }
}
