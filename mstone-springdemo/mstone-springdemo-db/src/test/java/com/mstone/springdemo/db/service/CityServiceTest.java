package com.mstone.springdemo.db.service;

import com.mstone.springdemo.db.entity.City;
import com.mstone.springdemo.db.service.impl.CityTempService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
class CityServiceTest {

    @Autowired
    private CityService cityService;

    @Autowired
    private CityTempService cityTempService;

    @Test
    public void test01() {
        List<City> cityList = new ArrayList<>();
        cityList.add(new City(1L, "jane", "1"));
        cityList.add(new City(2L, "jone", "1"));
        cityList.add(new City(3L, "jay", "1"));
        cityList.add(new City(4L, "j", "1"));

        try {
//            cityService.createCity(cityList);
            cityService.batchSave(cityList);
        } catch (Exception e) {e.printStackTrace();}

        List resultList = cityService.findAll();
        System.out.println(resultList);

    }


    @Test
    public void test02() {


        log.info("cityService ->", AopUtils.isAopProxy(cityService));
        log.info("cityService ->", AopUtils.isCglibProxy(cityService));

        log.info("cityTempService ->", AopUtils.isAopProxy(cityService));
        log.info("cityTempService ->", AopUtils.isCglibProxy(cityService));


        cityService.deleteAll();

        List<City> cityList = new ArrayList<>();
        cityList.add(new City(1L, "jane", "1"));
        cityList.add(new City(2L, "jone", "1"));
        cityList.add(new City(3L, "jay", "1"));
        cityList.add(new City(4L, "j", "1"));

        try {
            cityTempService.batchSave(cityList);
        } catch (Exception e) {
            e.printStackTrace();
        }

        List resultList = cityService.findAll();
        System.out.println(resultList);

    }

}