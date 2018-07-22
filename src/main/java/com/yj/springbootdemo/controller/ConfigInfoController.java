package com.yj.springbootdemo.controller;

import com.yj.springbootdemo.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author starsky
 */
@Controller
public class ConfigInfoController {

    @Value("${boot.name}")
    private String name;

    @Value("${boot.location}")
    private String location;

    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping("/boot/config")
    @ResponseBody
    public String config(){
        return name+"---"+location+"\n"
                +configInfo.getName()+configInfo.getLocation();
    }

}
