package com.mstone.springdemo.db.repository;

import com.mstone.springdemo.db.entity.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 15:08
 */
public interface CityRepository extends Repository<City, Long> {


    Page<City> findAll(Pageable pageable);

    City findByNameAndStateAllIgnoreCase(String name, String state);
}