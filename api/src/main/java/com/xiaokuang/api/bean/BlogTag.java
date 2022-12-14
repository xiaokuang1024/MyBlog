package com.xiaokuang.api.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName blog_tag
 */
@TableName(value ="blog_tag")
@Data
public class BlogTag implements Serializable {
    /**
     * 
     */
    private Integer blogId;

    /**
     * 
     */
    private Integer tagId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}