package com.xiaokuang.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaokuang.api.bean.Setting;
import com.xiaokuang.api.service.SettingService;
import com.xiaokuang.api.mapper.SettingMapper;
import org.springframework.stereotype.Service;

/**
* @author incredible
* @description 针对表【setting】的数据库操作Service实现
* @createDate 2022-10-19 17:42:31
*/
@Service
public class SettingServiceImpl extends ServiceImpl<SettingMapper, Setting>
    implements SettingService{

}




