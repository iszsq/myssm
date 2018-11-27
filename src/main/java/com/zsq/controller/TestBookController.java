package com.zsq.controller;

import com.zsq.dao.BookDao;
import com.zsq.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author zsq
 * @date 2018/11/27 - 22:19
 */
@Controller("testBookController")
public class TestBookController {
    @Autowired
    private BookDao bookDao;

    public void test() {
        //查询一个用户
        System.out.println("selBookById");
        Book book = bookDao.selBookById(1);
        System.out.println(book);
        System.out.println("================");

        //添加一个用户
        Book book2 = new Book();
        book2.setName("Jave EE 框架整合");
        book2.setPrice(54.00);
        int add = bookDao.addBook(book2);
        System.out.println("添加了" + add + "条记录");
        System.out.println("================");

        //修改一个用户
        Book book3 = new Book();
        book3.setId(1);
        book3.setName("thinking in php");
        book3.setPrice(100.00);
        int update = bookDao.updateBook(book3);
        System.out.println("修改了" + update + "条记录");
        System.out.println("================");

        //删除一个用户
        int dl = bookDao.delBook(3);
        System.out.println("删除了" + dl + "条记录");
        System.out.println("================");

        //查询全部用户
        List<Book> books = bookDao.selAll();
        for(Book b : books){
            System.out.println(b);
        }

    }
}
