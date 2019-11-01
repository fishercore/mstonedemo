package com.mstone.springdemo.db.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @description:
 * @author: fisher
 * @create: 2019-11-01 15:17
 */
@ApiModel("城市数据对象")
public class CityVO {

    @ApiModelProperty("主键")
    private Long id;

    @ApiModelProperty("城市名称")
    private String name;

    @ApiModelProperty("城市区域")
    private String state;

}