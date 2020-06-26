package com.chenys.bookmanagementsystem.controller;

import com.chenys.bookmanagementsystem.entity.Books;
import com.chenys.bookmanagementsystem.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>描述: [Books 控制层] </p>
 * <p>创建时间: 2020/06/26 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@RestController
@RequestMapping("/books")
public class BooksController {

    /**
     * (Books)服务
     */
    private BooksService booksService;

    @Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @RequestMapping("/")
    public List<Books> test() {
        return booksService.list();
    }

}