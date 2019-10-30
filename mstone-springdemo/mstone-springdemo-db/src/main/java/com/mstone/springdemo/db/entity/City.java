package com.mstone.springdemo.db.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 15:06
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String state;

}