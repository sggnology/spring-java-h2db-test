package com.h2dbtest.h2dbtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Component
@ComponentScan("com.h2dbtest.h2dbtest")
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/view/");
        bean.setSuffix(".html");
        return bean;
    }
}
