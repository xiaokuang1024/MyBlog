package com.xiaokuang.api.controller;


import com.xiaokuang.api.model.Result;
import com.xiaokuang.api.service.impl.MomentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 我的动态页面
 */

@RestController
public class MomentController {


    @Autowired
    MomentServiceImpl momentService;

    @GetMapping("/moment")
    public Result moment() {
        return Result.ok("获取成功", momentService.list());

    }
}
