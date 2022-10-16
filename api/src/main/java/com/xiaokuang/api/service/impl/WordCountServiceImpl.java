package com.xiaokuang.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaokuang.api.bean.WordCount;
import com.xiaokuang.api.service.WordCountService;
import com.xiaokuang.api.mapper.WordCountMapper;
import org.springframework.stereotype.Service;

/**
* @author incredible
* @description 针对表【word_count】的数据库操作Service实现
* @createDate 2022-10-16 23:42:36
*/
@Service
public class WordCountServiceImpl extends ServiceImpl<WordCountMapper, WordCount>
    implements WordCountService{

}




