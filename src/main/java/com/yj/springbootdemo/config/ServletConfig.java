package com.yj.springbootdemo.config;

import com.yj.springbootdemo.filter.HeFilter;
import com.yj.springbootdemo.servlet.HeServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @Author 76355
 * @Date 2018/9/4 23:03
 * @Description springboot没有xml，@@Configuration 可以表示一个spring的配置文件
 * 比如：applicationContext.xml
 */
@Configuration
public class ServletConfig {
    /**
     * 等价于<bean id="heServletRegistrationBean" class="org.springframework.boot.web.servlet.ServletRegistrationBean">
     *
     *  </bean>
     * @return
     */
    @Bean
    public ServletRegistrationBean heServletRegistrationBean(){
        ServletRegistrationBean registrationBean=new ServletRegistrationBean(new HeServlet(),"/heServlet");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean heFilterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean(new HeFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

    /**
     * 注册springWeb提供的 字符编码过滤器
     * 相当于 以前 在spring 项目中的web.xml配置 字符编码过滤器
     * 注意事项：只有当spring.http.encoding.enabled=false ，这个过滤器才会起作用
     * @return
     */
    @Bean
    public FilterRegistrationBean characterEncodingFilterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean();
        CharacterEncodingFilter characterEncodingFilter=new CharacterEncodingFilter();
        characterEncodingFilter.setForceEncoding(true);
        characterEncodingFilter.setEncoding("utf-8");
        filterRegistrationBean.setFilter(characterEncodingFilter);
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
}
