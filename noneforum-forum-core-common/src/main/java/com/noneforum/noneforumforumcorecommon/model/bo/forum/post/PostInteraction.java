package com.noneforum.noneforumforumcorecommon.model.bo.forum.post;

import java.math.BigDecimal;

/**
 * @author lrd
 * @date 2023-09-25 1:06
 * 帖子点赞 收藏 浏览量 赞助金额
 */
public class PostInteraction {
    private long postId;
    private long casVersion;//cas版本号
    private long updateTime;
    private long lastUpdateTime;//上一次实时数据写入时间
    /*
    总数据量
     */
    private long likes;
    private long dislike;
    private long views;
    private long stars;
    private long shares;
    private BigDecimal sponsorshipAmount;//赞助金额
    private double score;//得分
    /*
    实时数据量
     */
    private long likesGap;
    private long dislikeGap;
    private long viewsGap;
    private long starsGap;
    private long sharesGap;
    private BigDecimal sponsorshipAmountGap;
    private double scoreGap;
    /*
    权重数据
     */
    private int level;//推广等级
    private int subLevel;//推广等级
    private int weight;
    private int subWeight;
    private int weightType;//权重模型
    private int subWeightType;//子权重模型
    private String extraInfo;
}
