package com.mstone.springdemo.db.repository;

import com.mstone.springdemo.db.entity.City;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 15:08
 */
public interface CityRepository extends CrudRepository<City, Long> {


    List<City> findByName(String name);

    City findById(long id);
}