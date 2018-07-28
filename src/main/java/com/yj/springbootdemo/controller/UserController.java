package com.yj.springbootdemo.controller;

import com.yj.springbootdemo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController  // RestController 等价于 Controller + ResponseBody注解 下面的方法可以不加Responsebody，返回值是字符串或json数据
public class UserController {


    @GetMapping("/boot/getuser1")
    // GetMapping 等价于 RequestMapping + RequestMethod.GET
    // 即@RequestMapping(value = "/boot/getuser1",method = RequestMethod.GET)
    public User getUser1(){
        User user=new User();
        user.setId(1);
        user.setName("开心的小孩子1");
        return user;
    }

    @PostMapping("/boot/getuser2") //等价于 RequestMapping + RequestMethod.POST
    public User getUser2(){
        User user=new User();
        user.setId(2);
        user.setName("开心的小孩子2");
        return user;
    }

    @PutMapping("/boot/getuser3")
    public User getUser3(){
        User user=new User();
        user.setId(3);
        user.setName("开心的小孩子3");
        return user;
    }

    @DeleteMapping("/boot/getuser4")
    public User getUser4(){
        User user=new User();
        user.setId(4);
        user.setName("开心的小孩子4");
        return user;
    }
}
