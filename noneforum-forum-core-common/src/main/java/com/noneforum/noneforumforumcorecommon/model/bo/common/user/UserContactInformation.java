package com.noneforum.noneforumforumcorecommon.model.bo.common.user;

/**
 * @author lrd
 * @date 2023-09-24 20:26
 * 用户验证相关信息/联系方式
 */
public class UserContactInformation {
    /*
    基础信息
     */
    private long userId;
    private String email;
    private long phoneNumber;
    private int phoneType;
    /*
    其他信息
     */
    private long createTime;
    private long updateTime;
    private String extraInfo;
}
