package com.mstone.springdemo.db.service;

import com.mstone.springdemo.db.entity.CityEntity;

import java.util.List;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 15:12
 */
public interface CityService {

    List<CityEntity> findAll();

    List<CityEntity> findByName(String name);

    void save(CityEntity city);

    void batchSave(List<CityEntity> cityList);

    void createCity(List<CityEntity> cityList);

    void deleteAll();


}