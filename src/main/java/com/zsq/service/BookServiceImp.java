package com.zsq.service;

import com.zsq.dao.BookDao;
import com.zsq.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zsq
 * @date 2018/11/28 - 0:24
 */
@Service("bookService")
@Transactional
/**
 * 加上@Transactional注解可以指定这个类需要受spring的事务管理，
 * 注意@Transactional只能针对public属性范围内的方法添加
 */
public class BookServiceImp implements BookService{

    @Autowired
    private BookDao bookDao;
    @Override
    public List<Book> selAll() {
        return bookDao.selAll();
    }

    @Override
    public Book selBookById(Integer id) {
        return bookDao.selBookById(id);
    }

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public int delBook(Integer id) {
        return bookDao.delBook(id);
    }
}
