package com.zsq.controller;

import com.zsq.core.push.SpringWebSocketHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.socket.TextMessage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 定义一个控制器用来做连接标识和发送消息
 * @author zsq
 * @date 2018/11/28 - 11:13
 */
@Controller
public class WebsocketController {

    @Bean //这个注解会从Spring容器拿出Bean
    public SpringWebSocketHandler infoHandler() {
        return new SpringWebSocketHandler();
    }

    @RequestMapping("/websocket/login")
    public String login(HttpServletRequest request) throws Exception {
        String username = request.getParameter("username");
        System.out.println(username+"登录");
        HttpSession session = request.getSession();
        session.setAttribute("SESSION_USERNAME", username);
        //response.sendRedirect("/quicksand/jsp/websocket.jsp");
        return "redirect:views/chatroom.html";
    }

    @RequestMapping("/websocket/send")
    @ResponseBody
    public String send(HttpServletRequest request) {
        String username = request.getParameter("username");
        infoHandler().sendMessageToUser(username, new TextMessage("你好，测试！！！！"));
        return null;
    }

}
