package com.utp.proyectofinal.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/students/register").setViewName("student_register");
        registry.addViewController("/students").setViewName("students");
        registry.addViewController("/teachers/register").setViewName("teacher_register");
        registry.addViewController("/teachers").setViewName("teachers");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/assignation").setViewName("assignation");
    }
}
