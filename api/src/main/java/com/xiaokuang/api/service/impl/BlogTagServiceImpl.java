package com.xiaokuang.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaokuang.api.bean.BlogTag;
import com.xiaokuang.api.service.BlogTagService;
import com.xiaokuang.api.mapper.BlogTagMapper;
import org.springframework.stereotype.Service;

/**
* @author incredible
* @description 针对表【blog_tag】的数据库操作Service实现
* @createDate 2022-10-19 17:42:31
*/
@Service
public class BlogTagServiceImpl extends ServiceImpl<BlogTagMapper, BlogTag>
    implements BlogTagService{

}




