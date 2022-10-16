package com.xiaokuang.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaokuang.api.bean.Comment;
import com.xiaokuang.api.service.CommentService;
import com.xiaokuang.api.mapper.CommentMapper;
import org.springframework.stereotype.Service;

/**
* @author incredible
* @description 针对表【comment】的数据库操作Service实现
* @createDate 2022-10-16 23:09:27
*/
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
    implements CommentService{

}




