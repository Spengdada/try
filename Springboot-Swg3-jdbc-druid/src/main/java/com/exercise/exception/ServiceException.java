package com.exercise.exception;

import lombok.Getter;

/*
    @author: rasa
    @date:2024/10/8下午3:20
*/
@Getter
public final class ServiceException extends RuntimeException {

    //错误码
    private final Integer code;

    public ServiceException(ServiceExceptionEnum serviceExceptionEnum) {
        // 使用父类的 message 字段
        super(serviceExceptionEnum.getMessage());
        // 设置错误码
        this.code = serviceExceptionEnum.getCode();
    }

}