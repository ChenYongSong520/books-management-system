package com.chenys.bookmanagementsystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenys.bookmanagementsystem.dao.BooksDao;
import com.chenys.bookmanagementsystem.entity.Books;
import com.chenys.bookmanagementsystem.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>描述: [Books 服务实现层] </p>
 * <p>创建时间: 2020/06/26 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Service
public class BooksServiceImpl extends ServiceImpl<BooksDao, Books> implements BooksService {

    private BooksDao booksDao;

    @Autowired
    public BooksServiceImpl(BooksDao booksDao) {
        this.booksDao = booksDao;
    }

}