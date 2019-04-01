/*
 * <ul>
 * <li>项目名称：study</li>
 * <li>文件名称：ReadingListService.java</li>
 * <li>日期：2019/3/29 17:08</li>
 * <li>Copyright ©2016-2019 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.reading.service;

import com.hcbxwy.reading.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 阅读列表接口
 *
 * @author Billson
 * @since 2019/3/29 17:08
 */
public interface ReadingListService extends JpaRepository<Book, Long> {
    /**
     * 根据读者名称查找阅读列表
     *
     * @param reader 读者名称
     * @return java.util.List<com.hcbxwy.reading.entity.Book>
     * @author Billson
     * @since 2019/3/29 17:38
     */
    List<Book> findByReader(String reader);
}
