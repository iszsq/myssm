import com.zsq.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 测试mybatis的查询接口
 * @author zsq
 * @date 2018/11/21 - 20:00
 */
public class MyBatisTest {

    @Test
    public void selAll() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        List<Book> list = session.selectList("com.zsq.mapper.BookMapper.selAll");
        for (Book b: list) {
            System.out.println(b);
        }
        session.close();
    }

}
