package com.mstone.springdemo.db.service.impl;

import com.mstone.springdemo.db.entity.CityEntity;
import com.mstone.springdemo.db.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-31 16:14
 */
@Component
public class CityTempService {

    @Autowired
    private CityRepository cityRepository;

    public void save(CityEntity city) {
        cityRepository.save(city);
    }

    @Transactional(rollbackFor = Exception.class)
    public void createCity(List<CityEntity> cityList) throws Exception {
        batchSave(cityList);
    }

    @Transactional(rollbackFor = Exception.class)
    public void batchSave(List<CityEntity> cityList) throws Exception {

        cityRepository.saveAll(cityList);

        if(1 == 1) {
            throw new Exception("1111");
        }
    }

    public List<CityEntity> findAll() {
        return (List<CityEntity>) cityRepository.findAll();
    }

    public List<CityEntity> findByName(String name) {
        List<CityEntity> city = cityRepository.findByName(name);
        return city;
    }

}