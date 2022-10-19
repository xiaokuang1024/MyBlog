package com.xiaokuang.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaokuang.api.bean.Tag;
import com.xiaokuang.api.service.TagService;
import com.xiaokuang.api.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author incredible
* @description 针对表【tag】的数据库操作Service实现
* @createDate 2022-10-19 17:42:31
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




