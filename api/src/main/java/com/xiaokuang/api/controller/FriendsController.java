package com.xiaokuang.api.controller;


import com.xiaokuang.api.model.Result;
import com.xiaokuang.api.service.impl.FriendsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendsController {

    @Autowired
    FriendsServiceImpl friendsService;

    @GetMapping("/friends")
    public Result friends() {
        return Result.ok("获取成功", friendsService.list());
    }

}
