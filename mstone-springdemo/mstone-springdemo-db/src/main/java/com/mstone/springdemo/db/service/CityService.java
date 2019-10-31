package com.mstone.springdemo.db.service;

import com.mstone.springdemo.db.entity.City;

import java.util.List;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 15:12
 */
public interface CityService {


    List<City> findAll();

    List<City> findByName(String name);

    void save(City city);

    void batchSave(List<City> cityList);

    void createCity(List<City> cityList);

    void deleteAll();


}