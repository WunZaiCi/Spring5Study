import com.banma.pojo.Hello;
import com.banma.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
   public void  test(){
       //获取spring上下文对象
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       //我们的对象下能在都在spring·中管理了，我们要使用，直接取出来就可以了
       People people = context.getBean("people", People.class);
       people.getDog().shout();
       people.getCat().shout();


   }
}
