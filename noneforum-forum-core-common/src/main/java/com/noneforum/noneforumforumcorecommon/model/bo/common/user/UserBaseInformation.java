package com.noneforum.noneforumforumcorecommon.model.bo.common.user;

/**
 * @author lrd
 * @date 2023-09-24 19:28
 * 用户基础信息/展示信息
 */
public class UserBaseInformation {
    /*
    基础信息
     */
    private long userId;
    private String name;//主名字,比如个人主页名字
    private String nickName;//展示名字
    private String avatarLink;//头像地址
    private String authentication;//认证信息
    private int level;//等级
    private int exp;//经验值
    /*
    状态信息
     */
    private int displayState;//展示状态
    private boolean searchState;//允许被搜状态
    /*
    其他信息
     */
    private long createTime;
    private long updateTime;
    private String extraInfo;
}
