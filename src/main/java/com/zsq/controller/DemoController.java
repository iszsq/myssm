package com.zsq.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zsq
 * @date 2018/11/20 - 17:15
 */
public class DemoController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("执行了");
        ModelAndView ModelAndView = new ModelAndView("main.jsp");
        return ModelAndView;
    }
}
