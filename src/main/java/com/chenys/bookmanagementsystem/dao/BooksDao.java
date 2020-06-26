package com.chenys.bookmanagementsystem.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenys.bookmanagementsystem.entity.Books;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>描述: [Books 数据访问层] </p>
 * <p>创建时间: 2020/06/26 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Mapper
public interface BooksDao extends BaseMapper<Books> {

}