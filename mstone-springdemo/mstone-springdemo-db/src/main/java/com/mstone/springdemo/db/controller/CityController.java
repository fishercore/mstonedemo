package com.mstone.springdemo.db.controller;

import com.mstone.springdemo.common.common.Result;
import com.mstone.springdemo.db.dto.CityDTO;
import com.mstone.springdemo.db.query.CityQuery;
import com.mstone.springdemo.db.service.CityService;
import com.mstone.springdemo.db.vo.CityVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: fisher
 * @create: 2019-10-30 11:28
 */
@Api("城市接口")
@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private CityService cityService;

    @ApiOperation("创建城市")
    @RequestMapping(value = "/saveCity", method = RequestMethod.POST)
    public Result save(@RequestBody CityDTO city) {
        try {

        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @ApiOperation("修改城市")
    @RequestMapping(value = "/updateCity", method = RequestMethod.POST)
    public Result update(@RequestBody CityDTO city) {

        return null;
    }


    @ApiOperation("删除城市")
    @RequestMapping(value = "/deleteCity", method = RequestMethod.GET)
    public Result delete(@RequestParam long id) {

        return null;
    }


    @ApiOperation("查询城市")
    @RequestMapping(value = "/queryCity", method = RequestMethod.GET)
    public Result<CityVO> queryCity(@RequestParam CityQuery city) {

        return null;
    }

}