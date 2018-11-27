package com.zsq.controller;

import com.zsq.bean.People;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Arrays;
import java.util.List;

/**
 * @author zsq
 * @date 2018/11/20 - 17:15
 */

@Controller
public class AntController{

    @RequestMapping("add")
    public String demo(@RequestParam("username") String username,@RequestParam(defaultValue = "3") int pageIndex){
        System.out.println(username+"demo()");
        return "main.jsp";
    }

    @RequestMapping("demo2")
    public String demo2(@RequestParam(required = true) String name){
        System.out.println("demo2()");
        return "main.jsp";
    }

    /**
     * 复选框传递参数时
     * @param list
     * @return
     */
    @RequestMapping("demo3")
    public String demo3(@RequestParam("hover") List<String> list){
        System.out.println(Arrays.toString(list.toArray()));
        return "main.jsp";
    }

//     * forward
//     * redirect

    @RequestMapping("demo04")
    @ResponseBody   //返回字符串
    public People demo4(){
        return new People("中文","123");
    }

    @RequestMapping(value="demo05", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String demo5(){
        return "哈哈哈";
    }
}
