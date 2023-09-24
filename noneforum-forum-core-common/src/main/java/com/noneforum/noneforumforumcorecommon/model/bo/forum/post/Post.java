package com.noneforum.noneforumforumcorecommon.model.bo.forum.post;


import java.util.List;

/**
 * @author lrd
 * @date 2023-09-24 20:50
 * 帖子基础信息
 */
public class Post {
    /*
    帖子基础信息
     */
    private long postId;
    private String title;
    private String content;
    private String digest;//摘要
    private long numberOfWords;//字数
    private long author;
    private long createTime;
    private long updateTime;
    /*
    帖子属性
     */
    private long hidingTime;//隐藏时间
    private int visibleState;//可见状态
    private int commentState;//允许评论状态
    private int auditStatus;//审核状态
    private int type;//帖子类型
    private int subType;//帖子子类型
    private int themeId;//主题归属
    private String postTag;//帖子标签 List
    private String events;//参与活动
    private int copyright;//转载级别
    private String Achievements;//成就
    private int label;//设置标签
    private long seriesId;//帖子归属集合
    private long seriesRankId;//集合排序
    private String extraInfo;
}
