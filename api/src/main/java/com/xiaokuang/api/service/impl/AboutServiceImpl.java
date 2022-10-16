package com.xiaokuang.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaokuang.api.bean.About;
import com.xiaokuang.api.service.AboutService;
import com.xiaokuang.api.mapper.AboutMapper;
import org.springframework.stereotype.Service;

/**
* @author incredible
* @description 针对表【about】的数据库操作Service实现
* @createDate 2022-10-16 23:06:30
*/
@Service
public class AboutServiceImpl extends ServiceImpl<AboutMapper, About>
    implements AboutService{

}




