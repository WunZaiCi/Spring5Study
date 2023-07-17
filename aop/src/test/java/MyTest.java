import com.banma.service.UserService;
import com.banma.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //！！！注意点：动态代理代理的是接口 需要返回接口类的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        userService.update();
        userService.delete();
        userService.select();

    }
}
