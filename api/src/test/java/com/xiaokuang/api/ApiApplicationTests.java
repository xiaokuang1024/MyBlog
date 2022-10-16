package com.xiaokuang.api;

import com.xiaokuang.api.bean.About;
import com.xiaokuang.api.mapper.AboutMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApiApplicationTests {

    @Autowired
    AboutMapper aboutMapper;
    @Test
    void contextLoads() {
        List<About> list = aboutMapper.selectList(null);
        list.forEach(System.out::println);
    }

}
