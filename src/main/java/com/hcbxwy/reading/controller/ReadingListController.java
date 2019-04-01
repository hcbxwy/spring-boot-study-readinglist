/*
 * <ul>
 * <li>项目名称：study</li>
 * <li>文件名称：ReadingListController.java</li>
 * <li>日期：2019/3/29 17:40</li>
 * <li>Copyright ©2016-2019 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.reading.controller;

import com.hcbxwy.reading.entity.Book;
import com.hcbxwy.reading.service.ReadingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 阅读列表controller
 *
 * @author Billson
 * @since 2019/3/29 17:40
 */
@Controller
@RequestMapping("/")
public class ReadingListController {

    private ReadingListService readingListService;

    @Autowired
    public ReadingListController(ReadingListService readingListService) {
        this.readingListService = readingListService;
    }

    /**
     * 根据用户名称查找阅读列表
     *
     * @param reader	读者
     * @param model	 视图对象
     * @return java.lang.String
     * @author Billson
     * @since 2019/3/29 18:15
     */
    @GetMapping("/{reader}")
    public String readersBooks(@PathVariable("reader") String reader, Model model) {
        List<Book> readingList = readingListService.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }

    /**
     * 添加书籍
     *
     * @param reader 读者
     * @param book	书名
     * @return java.lang.String
     * @author Billson
     * @since 2019/3/29 18:17
     */
    @PostMapping("/{reader}")
    public String addToReadingList(@PathVariable("reader") String reader, Book book) {
        book.setReader(reader);
        readingListService.save(book);
        return "redirect:/{reader}";
    }
}
