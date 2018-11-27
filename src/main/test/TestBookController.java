import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试spring和mybatis的整合
 * 从spring中获得sqlsession工厂和session实例，进行数据库的持久化访问
 * @author zsq
 * @date 2018/11/27 - 22:41
 */
public class TestBookController {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        com.zsq.controller.TestBookController bookController = (com.zsq.controller.TestBookController) applicationContext.getBean("testBookController");
        bookController.test();
    }

}
