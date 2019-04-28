package com.myfund.wxapplet.config;

import com.myfund.wxapplet.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * 添加自定义的拦截器
 * 通过@Configuration声明配置类，实现WebMvcConfigurer 接口中的 addInterceptors（）添加自定义的拦截器
 *
 * @author: haocheng
 * @date: 2019-04-28 16:56
 * 
 */
@Configuration
//    @Component
public class MvcConfig implements WebMvcConfigurer {

    //   注入拦截器
    @Bean
    public MyInterceptor getMyInterceptor(){
        return new MyInterceptor();
    }

    //   把自定义的拦截器添加到mvc 配置中
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.getMyInterceptor()).addPathPatterns("/**");
    }
}
