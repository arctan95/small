package com.classpark.small.product.exception;

import com.classpark.small.common.exception.BizCodeEnum;
import com.classpark.small.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MallExceptionControllerAdvice
 * @Description 集中处理所有异常
 * @Author classpark
 * @Date 2020/10/27 9:31
 * @Version 1.0
 **/
@Slf4j
@RestControllerAdvice(basePackages = "coma.classpark.small.product.controller")
public class MallExceptionControllerAdvice {


    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e) {
        log.error("数据校验异常{},异常类型{}", e.getMessage(), e.getClass());
        BindingResult result = e.getBindingResult();
        Map<String, String> map = new HashMap<>();
        // 获取校验的错误结果
        result.getFieldErrors().forEach((item) -> {
            //FieldError  获取到错误提示
            String message = item.getDefaultMessage();
            //获取错误对应的属性名
            String field = item.getField();
            map.put(field, message);
        });
        return R.error(BizCodeEnum.VAILD_EXCEPTION.getCode(), BizCodeEnum.VAILD_EXCEPTION.getMsg()).put("data", map);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleValidException(Throwable throwable) {
        return R.error(BizCodeEnum.UNKNOW_EXCEPTION.getCode(), BizCodeEnum.UNKNOW_EXCEPTION.getMsg());
    }
}
