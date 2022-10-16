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
 * @TableName blog
 */
@TableName(value ="blog")
@Data
public class Blog implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章首图，用于文章展示
     */
    private String header;

    /**
     * 文章正文
     */
    private String content;

    /**
     * 文章描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 文章字数
     */
    private Integer words;

    /**
     * 浏览次数
     */
    private Integer counts;

    /**
     * 阅读时长(分钟)
     */
    private Integer readTime;

    /**
     * 是否置顶
     */
    private Integer isTop;

    /**
     * 公开或隐藏
     */
    private Integer isPublished;

    /**
     * 是否推荐
     */
    private Integer isRecommend;

    /**
     * 评论开关
     */
    private Integer isCommentEnabled;

    /**
     * 文章分类
     */
    private Integer categoryId;

    /**
     * 文章作者
     */
    private Integer userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}