package com.xiaokuang.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaokuang.api.bean.Friends;
import com.xiaokuang.api.service.FriendsService;
import com.xiaokuang.api.mapper.FriendsMapper;
import org.springframework.stereotype.Service;

/**
* @author incredible
* @description 针对表【friends】的数据库操作Service实现
* @createDate 2022-10-16 23:09:27
*/
@Service
public class FriendsServiceImpl extends ServiceImpl<FriendsMapper, Friends>
    implements FriendsService{

}




