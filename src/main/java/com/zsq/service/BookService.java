package com.zsq.service;

import com.zsq.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zsq
 * @date 2018/11/27 - 22:11
 */
public interface BookService {

    List<Book> selAll();
    Book selBookById(Integer id);
    int addBook(Book book);
    int updateBook(Book book);
    int delBook(Integer id);

}
