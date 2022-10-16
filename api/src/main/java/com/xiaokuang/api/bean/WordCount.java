package com.xiaokuang.api.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName word_count
 */
@TableName(value ="word_count")
@Data
public class WordCount implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 词汇
     */
    private String word;

    /**
     * 词汇数量
     */
    private Integer count;

    /**
     * 提交人
     */
    private String submitter;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}