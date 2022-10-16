package com.xiaokuang.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaokuang.api.bean.Moment;
import com.xiaokuang.api.service.MomentService;
import com.xiaokuang.api.mapper.MomentMapper;
import org.springframework.stereotype.Service;

/**
* @author incredible
* @description 针对表【moment】的数据库操作Service实现
* @createDate 2022-10-16 23:09:27
*/
@Service
public class MomentServiceImpl extends ServiceImpl<MomentMapper, Moment>
    implements MomentService{

}




