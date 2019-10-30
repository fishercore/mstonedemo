package com.mstone.springdemo.db.service.impl;

import com.mstone.springdemo.db.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 15:12
 */
@Component
public class CityServiceImpl {

    @Autowired
    private CityRepository cityRepository;


    public void test() {
        cityRepository.findAll(null);
    }
}