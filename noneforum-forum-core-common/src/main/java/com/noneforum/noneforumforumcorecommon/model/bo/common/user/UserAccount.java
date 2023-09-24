package com.noneforum.noneforumforumcorecommon.model.bo.common.user;

import java.math.BigInteger;

/**
 * @author lrd
 * @date 2023-09-24 19:22
 * 用户登录验证信息
 */
public class UserAccount {
    /*
    基础信息
     */
    private long userId;
    private String account;
    private String password;
    private String lastUsedPassword;
    private int loginStatus;//允许登录状态
    private int loginType;//登录方式
    /*
    其他信息
     */
    private long createTime;
    private long updateTime;
    private String extraInfo;
}
