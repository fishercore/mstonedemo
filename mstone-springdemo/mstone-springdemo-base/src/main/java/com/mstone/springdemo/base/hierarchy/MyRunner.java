//package com.mstone.springdemo.base.hierarchy;
//
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
///**
// * @description:
// * @author: fisher
// * @create: 2019-10-31 09:19
// */
//@Component
//public class MyRunner implements ApplicationRunner {
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        ApplicationContext fooContext = new AnnotationConfigApplicationContext(FooConfig.class);
//
//        TestBean bean = fooContext.getBean("testBeanx", TestBean.class);
//        bean.hello();
//
//        ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"}, fooContext);
//        TestBean xmlBean = xmlContext.getBean("testBeanx", TestBean.class);
//        xmlBean.hello();
//
//        xmlBean = xmlContext.getBean("testBeany", TestBean.class);
//        xmlBean.hello();
//    }
//}