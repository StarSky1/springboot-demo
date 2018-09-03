package com.yj.springbootdemo.config;


import com.yj.springbootdemo.intercepter.LoginIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Author 76355
 * @Date 2018/9/3 22:54
 * @Description web相关配置类
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport{
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //被拦截的路径
        String[] addPathPatterns={
                "/boot/**"
        };
        //不被拦截的路径
        String[] excludePathPatterns={
                "/boot/index",
                "/boot/hello"
        };
        registry.addInterceptor(new LoginIntercepter()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
