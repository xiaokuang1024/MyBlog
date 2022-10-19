package com.xiaokuang.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaokuang.api.bean.Blog;
import com.xiaokuang.api.service.BlogService;
import com.xiaokuang.api.mapper.BlogMapper;
import org.springframework.stereotype.Service;

/**
* @author incredible
* @description 针对表【blog】的数据库操作Service实现
* @createDate 2022-10-19 17:42:31
*/
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog>
    implements BlogService{

}




