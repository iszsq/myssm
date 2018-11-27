package com.zsq.controller;

import com.zsq.pojo.base.BaseRes;
import com.zsq.pojo.Book;
import com.zsq.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zsq
 * @date 2018/11/28 - 0:30
 */
@Controller()
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @ResponseBody
    @RequestMapping("add")
    public BaseRes add(Book book){
        int res = bookService.addBook(book);
        String msg = res >= 1?"书本添加成功":"书本添加失败";

        return BaseRes.success(msg);
    }

}
