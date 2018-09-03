package com.yj.springbootdemo.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 76355
 * @Date 2018/9/3 22:48
 * @Description 登录 拦截器
 */
public class LoginIntercepter implements HandlerInterceptor{

    //进入controller之前，会调用该方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入了登录拦截器.....");
        //放置一些业务逻辑代码
        return true;    //true 表示通过拦截器，进入controller
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
