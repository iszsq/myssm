import com.zsq.controller.BookController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zsq
 * @date 2018/11/27 - 22:41
 */
public class TestBookController {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookController bookController = (BookController) applicationContext.getBean("bookController");
        bookController.test();
    }

}
