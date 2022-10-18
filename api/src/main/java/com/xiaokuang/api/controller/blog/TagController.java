package com.xiaokuang.api.controller.blog;

import com.xiaokuang.api.model.Result;
import com.xiaokuang.api.service.impl.TagServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 博客标签
 */

@RestController
public class TagController {


    @Autowired
    TagServiceImpl tagService;

    @GetMapping("/tag/list")
    public Result tagList() {
        return Result.ok("获取成功", tagService.list());
    }
}
