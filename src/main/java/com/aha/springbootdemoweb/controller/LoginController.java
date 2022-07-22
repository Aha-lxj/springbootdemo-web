package com.aha.springbootdemoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * @author Aha
 * @create 2022-07-21  22:47
 */
@Controller
public class LoginController {
    @RequestMapping("/user/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model,
            HttpSession httpSessions){
        if(!(StringUtils.isEmpty(username))&&("123456".equals(password))) {
            httpSessions.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","用户名或密码错误！");
            return "index";
        }
    }

    @RequestMapping("/signOut")
    public String signOut(HttpSession session){
        session.invalidate();
        return "redirect:/index.html";

    }
}
