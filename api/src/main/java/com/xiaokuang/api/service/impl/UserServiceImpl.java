package com.xiaokuang.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaokuang.api.bean.User;
import com.xiaokuang.api.service.UserService;
import com.xiaokuang.api.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author incredible
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-10-19 17:42:31
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




