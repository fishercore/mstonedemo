package com.mstone.springdemo.db.service;

import com.mstone.springdemo.db.entity.CityEntity;
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
    public void testTransaction() {
        List<CityEntity> cityList = new ArrayList<>();
        cityList.add(new CityEntity(1L, "jane", "1"));
        cityList.add(new CityEntity(2L, "jone", "1"));
        cityList.add(new CityEntity(3L, "jay", "1"));
        cityList.add(new CityEntity(4L, "j", "1"));


        log.info("currentThread -----> {}", Thread.currentThread().getName());
        log.info("currentClass -----> {}", cityService.getClass().getClass());

        try {
            cityService.createCity(cityList);
        } catch (Exception e) {e.printStackTrace();}

        List resultList = cityService.findAll();
        log.info("with interface --> {}", resultList.toString());

        cityService.deleteAll();

        try {
            cityTempService.createCity(cityList);
        } catch (Exception e) {
            e.printStackTrace();
        }

        resultList = cityService.findAll();
        log.info("with out interface --> {}", resultList.toString());
    }


    @Test
    public void test02() {


        log.info("cityService ->{}", AopUtils.isAopProxy(cityService));
        log.info("cityService ->{}", AopUtils.isCglibProxy(cityService));

        log.info("cityTempService ->{}", AopUtils.isAopProxy(cityTempService));
        log.info("cityTempService ->{}", AopUtils.isCglibProxy(cityTempService));


        cityService.deleteAll();

        List<CityEntity> cityList = new ArrayList<>();
        cityList.add(new CityEntity(1L, "jane", "1"));
        cityList.add(new CityEntity(2L, "jone", "1"));
        cityList.add(new CityEntity(3L, "jay", "1"));
        cityList.add(new CityEntity(4L, "j", "1"));

        try {
            cityTempService.batchSave(cityList);
        } catch (Exception e) {
            e.printStackTrace();
        }

        List resultList = cityService.findAll();
        System.out.println(resultList);

    }

}