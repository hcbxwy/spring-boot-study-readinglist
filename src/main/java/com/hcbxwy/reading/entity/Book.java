/*
 * <ul>
 * <li>项目名称：study</li>
 * <li>文件名称：Book.java</li>
 * <li>日期：2019/3/29 17:04</li>
 * <li>Copyright ©2016-2019 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.reading.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 书实体对象
 *
 * @author Billson
 * @since 2019/3/29 17:04
 */
@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;
}
