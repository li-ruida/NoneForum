package com.noneforum.noneforumforumcorecommon.model.bo.forum.theme;

import java.math.BigDecimal;

/**
 * @author lrd
 * @date 2023-09-25 23:56
 * 主题交互数据
 */
public class ThemeInteraction {
    private long themeId;
    private long casVersion;//cas版本号
    private long updateTime;
    private long lastTotalUpdateTime;//上一次实时数据写入时间 累计数据
    private long lastGapUpdateTime;//上一次实时数据写入时间 变化时间
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
    private long posts;
    private long comments;//评论数量
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
    private long commentsGap;
    private long postsGap;
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
