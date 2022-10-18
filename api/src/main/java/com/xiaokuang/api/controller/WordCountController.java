package com.xiaokuang.api.controller;

import com.xiaokuang.api.model.Result;
import com.xiaokuang.api.service.impl.WordCountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 词频树页面
 */

@RestController
public class WordCountController {

    @Autowired
    WordCountServiceImpl wordCountService;

    @GetMapping("/word/count")
    public Result wordCount() {
        return Result.ok("获取成功", wordCountService.list());
    }

}
