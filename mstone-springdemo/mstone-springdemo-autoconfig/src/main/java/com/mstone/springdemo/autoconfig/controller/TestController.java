package com.mstone.springdemo.autoconfig.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: fisher
 * @create: 2019-11-04 11:17
 */
@Controller
@Slf4j
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Student add(Student student) {

        log.info(student.toString());

        student.setName(student.getName() + "...");

        return student;
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student {
    private int id;

    private String name;
}