/*
 * <ul>
 * <li>项目名称：study</li>
 * <li>文件名称：ReaderService.java</li>
 * <li>日期：2019/3/30 11:58</li>
 * <li>Copyright ©2016-2019 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.reading.service;

import com.hcbxwy.reading.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 读者接口
 *
 * @author Billson
 * @since 2019/3/30 11:58
 */
public interface ReaderService extends JpaRepository<Reader, String> {
}
