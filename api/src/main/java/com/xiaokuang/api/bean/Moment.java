package com.xiaokuang.api.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName moment
 */
@TableName(value ="moment")
@Data
public class Moment implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 动态内容
     */
    private String content;

    /**
     * 创建时间
     */
    private Date time;

    /**
     * 点赞数量
     */
    private Integer likes;

    /**
     * 公开或隐藏
     */
    private Integer isPublished;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}