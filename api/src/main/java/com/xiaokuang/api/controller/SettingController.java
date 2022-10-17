package com.xiaokuang.api.controller;

import com.xiaokuang.api.bean.Setting;
import com.xiaokuang.api.model.Result;
import com.xiaokuang.api.service.impl.SettingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class SettingController {

    @Autowired
    SettingServiceImpl settingService;

    @GetMapping("/setting")
    public Result setting(){
        HashMap<String, String> data = new HashMap<>();
        for (Setting setting : settingService.list()) {
            data.put(setting.getNameEn(),setting.getValue());
        }
        return Result.ok("获取成功",data);
    }
}
