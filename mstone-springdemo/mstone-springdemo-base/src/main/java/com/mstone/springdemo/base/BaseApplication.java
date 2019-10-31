package com.mstone.springdemo.base;

import com.mstone.springdemo.base.hierarchy.FooConfig;
import com.mstone.springdemo.base.hierarchy.TestBean;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 10:57
 */
@SpringBootApplication
public class BaseApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ApplicationContext fooContext = new AnnotationConfigApplicationContext(FooConfig.class);

        TestBean bean = fooContext.getBean("testBeanx", TestBean.class);
        bean.hello();

        ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"}, fooContext);
        TestBean xmlBean = xmlContext.getBean("testBeanx", TestBean.class);
        xmlBean.hello();

        xmlBean = xmlContext.getBean("testBeany", TestBean.class);
        xmlBean.hello();
    }



}