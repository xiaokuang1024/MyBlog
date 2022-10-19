package com.xiaokuang.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaokuang.api.bean.Category;
import com.xiaokuang.api.service.CategoryService;
import com.xiaokuang.api.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author incredible
* @description 针对表【category】的数据库操作Service实现
* @createDate 2022-10-19 17:42:31
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




