package com.chenys.bookmanagementsystem.controller;

import com.chenys.bookmanagementsystem.exception.BusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>描述: [统一异常示例] </p>
 * <p>创建时间: 2020/6/26 </p>
 *
 * @author <a href="mailto:Chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@RestController
public class ExceptionControllerDemo {

    @RequestMapping("/")
    public String exceptionControllerDemo() {
        int i = 1 / 0;
        return "dd";
    }

    @RequestMapping("/a")
    public String exceptionControllerDemo2() throws BusinessException {
        boolean status = false;
        if (!status) {
            throw new BusinessException("参数错误");
        }
        return "dd";
    }

}
