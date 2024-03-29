//package com.mstone.springdemo.db.config;
//
//import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import java.text.SimpleDateFormat;
//import java.util.List;
//
///**
// * @description:
// * @author: fisher
// * @create: 2019-11-01 08:16
// */
//@Configuration
//public class DbMvcConfig implements WebMvcConfigurer {
//
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder()
//                .indentOutput(true)
//                .dateFormat(new SimpleDateFormat("yyyy-MM-dd"))
//                .modulesToInstall(new ParameterNamesModule());
//
//        converters.add(new MappingJackson2HttpMessageConverter(builder.build()));
//        converters.add(new MappingJackson2XmlHttpMessageConverter(builder.createXmlMapper(true).build()));
//    }
//}