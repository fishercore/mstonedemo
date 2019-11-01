package com.mstone.springdemo.common.common;


import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.http.HttpStatus;

/**
 * 返回值数据结构
 * @author lc-pc
 * @date 2019/9/11
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "返回对象")
public class Result<T> {

    /**
     * 成功信息.
     */
    public static final String SUCCESS_MESSAGE = "操作成功";

    /**
     * 错误信息.
     */
    public static final String ERROR_MESSAGE = "内部异常";


    @ApiModelProperty(value = "返回代码")
    private int code;

    @ApiModelProperty(value = "返回信息")
    private String msg;

    @ApiModelProperty(value = "返回数据体")
    private T data;

    private Result(int code, String msg) {
        this(code, msg, null);
    }

    private Result(int code, String msg, T data) {
        this.code(code).msg(msg).data(data);
    }

    private Result<T> code(int code) {
        this.setCode(code);

        return this;
    }

    private Result<T> msg(String msg) {
        this.setMsg(msg);

        return this;
    }

    private Result<T> data(T data) {
        this.setData(data);

        return this;
    }

    public static Result ok() {
        return new Result(HttpStatus.SC_OK, SUCCESS_MESSAGE);
    }

    public static <E> Result<E> ok(String msg) {
        return new Result(HttpStatus.SC_OK, msg, null);
    }

    public static <E> Result<E> ok(E data) {
        return new Result(HttpStatus.SC_OK, SUCCESS_MESSAGE, data);
    }

    public static <E> Result<E> ok(String msg, E data) {
        return new Result(HttpStatus.SC_OK, msg, data);
    }

    public static <E> Result<E> error() {
        return new Result(HttpStatus.SC_INTERNAL_SERVER_ERROR, ERROR_MESSAGE);
    }

    public static <E> Result<E> error(int code, String msg) {
        return new Result(code, msg);
    }

    public static <E> Result<E> error(String msg) {
        return new Result(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }


}
