package com.aha.springbootdemoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Aha
 * @create 2022-07-21  16:48
 */
@Controller
public class IndexController {
    @RequestMapping({"/","index.html"})
    public String index(){
        return "index";
    }
}
