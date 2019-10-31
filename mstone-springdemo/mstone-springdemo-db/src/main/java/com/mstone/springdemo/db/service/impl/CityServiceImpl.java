package com.mstone.springdemo.db.service.impl;

import com.mstone.springdemo.db.entity.City;
import com.mstone.springdemo.db.repository.CityRepository;
import com.mstone.springdemo.db.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 15:12
 */
@Component
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public void save(City city) {
        cityRepository.save(city);
    }

    @Override
    public void createCity(List<City> cityList) {
        batchSave(cityList);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void batchSave(List<City> cityList) {

        cityRepository.saveAll(cityList);

        throw new RuntimeException("111");
    }

    @Override
    public List<City> findAll() {
        return (List<City>) cityRepository.findAll();
    }

    @Override
    public List<City> findByName(String name) {
        List<City> city = cityRepository.findByName(name);
        return city;
    }

    @Override
    public void deleteAll() {
        cityRepository.deleteAll();
    }

}