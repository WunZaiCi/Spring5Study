import com.banma.config.BanmaConfig;
import com.banma.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void  test(){
        //如果完全使用了配置类方式去做 我们就只能通过AnnotationConfig上下文来获取容器 通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(BanmaConfig.class);
        User user = (User) context.getBean("user");
        System.out.println(user.toString());
    }

}
