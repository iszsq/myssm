package com.zsq.dao;

import com.zsq.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zsq
 * @date 2018/11/27 - 22:11
 */
@Repository("bookDao")
@Mapper
/*使用Spring自动扫描MyBatis的接口并装配
（Spring将指定包中所有被@Mapper注解标注的接口自动装配为MyBatis的映射接口）
 */
public interface BookDao {

    /**
     * 接口方法对应SQL映射文件BookMapper.xml中的id
     */
    List<Book> selAll();
    Book selBookById(Integer id);
    int addBook(Book book);
    int updateBook(Book book);
    int delBook(Integer id);

}
