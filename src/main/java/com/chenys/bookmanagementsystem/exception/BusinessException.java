package com.chenys.bookmanagementsystem.exception;

/**
 * <p>描述: [业务异常] </p>
 * <p>创建时间: 2020/6/26 </p>
 *
 * @author <a href="mailto:Chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
public class BusinessException extends Exception {
    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }
}
