package com.chenys.bookmanagementsystem.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>描述: [Books 实体类] </p>
 * <p>创建时间: 2020/06/26 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books implements Serializable {
    private static final long serialVersionUID = -71611625354860115L;
    /**
     * 主键（UUID）
     */
    private String id;
    /**
     * 图书编号
     */
    private String bookNum;
    /**
     * 图书名称
     */
    private String bookName;
    /**
     * 图书类别
     */
    private String bookLabel;
    /**
     * 图书库存
     */
    private Integer bookCount;
    /**
     * 图书描述
     */
    private String bookDescription;
    /**
     * 图书封面
     */
    private Byte[] bookImg;
    /**
     * 是否下架（1-是，0-否）
     */
    @TableField("is_disable") private Integer disable;
    /**
     * 创建人ID
     */
    private String createId;
    /**
     * 创建人姓名
     */
    private String createName;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改人ID
     */
    private String updateId;
    /**
     * 修改人姓名
     */
    private String updateName;
    /**
     * 修改时间
     */
    private Date updateTime;

}