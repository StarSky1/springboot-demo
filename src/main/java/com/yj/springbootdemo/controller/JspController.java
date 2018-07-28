package com.yj.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller     //负责jsp页面跳转controller
public class JspController {

    @RequestMapping("/boot/index")
    public String index(Model model){
        model.addAttribute("name","Spring boot 集成 JSP。");
        return "index";
    }
}
