package com.mstone.springdemo.db.repository;

import com.mstone.springdemo.db.entity.CityEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 15:08
 */
public interface CityRepository extends CrudRepository<CityEntity, Long> {


    List<CityEntity> findByName(String name);

    CityEntity findById(long id);
}