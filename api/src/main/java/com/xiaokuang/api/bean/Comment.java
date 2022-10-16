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
 * @TableName comment
 */
@TableName(value ="comment")
@Data
public class Comment implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 昵称
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 头像链接
     */
    private String avatar;

    /**
     * 评论时间
     */
    private Date time;

    /**
     * 评论者ip
     */
    private String ip;

    /**
     * 公开或隐藏
     */
    private Integer isPublished;

    /**
     * 0普通文章1关于我页面2友链页面
     */
    private Integer page;

    /**
     * 所属文章id
     */
    private Integer blogId;

    /**
     * 父评论id，-1为根评论
     */
    private Integer parentCommentId;

    /**
     * 个人网站
     */
    private String website;

    /**
     * 如果评论人昵称写QQ号会自动生成QQ网名和QQ头像并设置为昵称和头像
     */
    private String qq;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}