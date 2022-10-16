package com.xiaokuang.api.controller;

import com.xiaokuang.api.model.Result;
import com.xiaokuang.api.service.impl.AboutServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 关于我页面
 */

@RestController
public class AboutController {
    @Autowired
    AboutServiceImpl aboutService;

    @GetMapping("/about")
    public Result about(){
        return Result.ok("获取成功",aboutService.list());
    }

}
