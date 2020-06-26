package com.chenys.bookmanagementsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * <p>描述: [统一异常处理类] </p>
 * <p>创建时间: 2020/6/26 </p>
 *
 * @author <a href="mailto:Chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@ControllerAdvice
@ResponseBody
public class BaseException {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String handleException() {
        return "统一异常处理";
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String handleException2(BusinessException exception) {
        return exception.getMessage();
    }
}
