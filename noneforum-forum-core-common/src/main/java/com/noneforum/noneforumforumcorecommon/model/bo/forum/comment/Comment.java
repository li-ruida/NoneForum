package com.noneforum.noneforumforumcorecommon.model.bo.forum.comment;

/**
 * @author lrd
 * @date 2023-09-25 23:16
 * 评论基础信息
 */
public class Comment {
    /*
    帖子基础信息
     */
    private long commentId;
    private long replyCommentId;//回复评论ID
    private long postId;
    private long authorId;
    private String content;
    private long createTime;
    private long updateTime;
    /*
    帖子属性
     */
    private long hidingTime;//隐藏时间
    private int visibleState;//可见状态
    private int commentState;//允许评论状态
    private int auditStatus;//审核状态
    private int type;//评论类型
    private int subType;//评论子类型
    private String commentTag;//评论标签 List
    private String achievements;//成就
    private int label;//设置标签
    /*
    评论层级
     */
    private int seriesId;//评论归属层级 0外层 1 2 最多两层,两层之后堆叠不分层
    private long seriesRankId;//层级顺序
    private String extraInfo;
}
