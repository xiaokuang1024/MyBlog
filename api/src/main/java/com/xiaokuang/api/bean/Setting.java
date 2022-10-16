package com.xiaokuang.api.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName setting
 */
@TableName(value ="setting")
@Data
public class Setting implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String nameEn;

    /**
     * 
     */
    private String nameZh;

    /**
     * 
     */
    private String value;

    /**
     * 1基础设置2资料卡
     */
    private Integer type;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}