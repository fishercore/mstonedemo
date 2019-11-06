package com.mstone.springdemo.db.service.impl;

import com.mstone.springdemo.db.entity.CityEntity;
import com.mstone.springdemo.db.repository.CityRepository;
import com.mstone.springdemo.db.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 15:12
 */
@Slf4j
@Component
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public void save(CityEntity city) {
        cityRepository.save(city);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void createCity(List<CityEntity> cityList) {

        log.info("current --> {}", ((CityService) AopContext.currentProxy()).getClass());


        ((CityService) AopContext.currentProxy()).batchSave(cityList);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void batchSave(List<CityEntity> cityList) {

        cityRepository.saveAll(cityList);

        throw new RuntimeException("111");
    }

    @Override
    public List<CityEntity> findAll() {
        return (List<CityEntity>) cityRepository.findAll();
    }

    @Override
    public List<CityEntity> findByName(String name) {
        List<CityEntity> city = cityRepository.findByName(name);
        return city;
    }

    @Override
    public void deleteAll() {
        cityRepository.deleteAll();
    }

}