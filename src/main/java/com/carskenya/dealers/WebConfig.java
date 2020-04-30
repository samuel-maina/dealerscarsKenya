package com.carskenya.dealers;

import java.io.IOException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.
DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.
WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.
InternalResourceViewResolver;
@Configuration
@EnableWebMvc

@ComponentScan("com.carskenya.dealers.controllers,com.carskenya.dealers.businessObject,com.carskenya.dealers.dataAcess")
public class WebConfig
extends WebMvcConfigurerAdapter {

@Bean
public ViewResolver viewResolver() {
InternalResourceViewResolver resolver =
new InternalResourceViewResolver();
resolver.setPrefix("/WEB-INF/jsp/");
resolver.setSuffix(".jsp");
resolver.setExposeContextBeansAsAttributes(true);
return resolver;
}
@Override
public void configureDefaultServletHandling(
DefaultServletHandlerConfigurer configurer) {
configurer.enable();
}
@Override
public void addResourceHandlers(ResourceHandlerRegistry registry){
registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
}
@Bean(name="multipartResolver")
public MultipartResolver multipartResolver(){
CommonsMultipartResolver resolver= new CommonsMultipartResolver();
return resolver;
}
}