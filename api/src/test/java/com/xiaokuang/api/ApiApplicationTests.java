package com.xiaokuang.api;

import com.xiaokuang.api.bean.About;
import com.xiaokuang.api.mapper.AboutMapper;
import com.xiaokuang.api.service.impl.AboutServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ApiApplicationTests {

    @Autowired
    AboutServiceImpl aboutService;

    @Test
    void contextLoads() {
        List<About> list = aboutService.list();
        HashMap<String, String> map = new HashMap<>();
        for (About about : list) {
            map.put(about.getNameEn(),about.getValue());
        }
        System.out.println(map);
    }

}
