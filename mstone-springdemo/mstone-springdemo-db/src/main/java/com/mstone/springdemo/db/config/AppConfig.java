package com.mstone.springdemo.db.config;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @description:
 * @author: fisher
 * @create: 2019-11-01 10:00
 */
@Configuration
//@EnableLoadTimeWeaving(aspectjWeaving= EnableLoadTimeWeaving.AspectJWeaving.ENABLED)
@EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
public class AppConfig {

}