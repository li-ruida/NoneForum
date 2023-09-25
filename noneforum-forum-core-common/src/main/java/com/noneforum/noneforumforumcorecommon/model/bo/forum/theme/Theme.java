package com.noneforum.noneforumforumcorecommon.model.bo.forum.theme;

import java.util.List;

/**
 * @author lrd
 * @date 2023-09-25 23:48
 * 板块基础信息
 */
public class Theme {
    private long themeId;
    private String name;
    private String desc;
    private boolean display;
    private int publishPermissions;//发布权限
    private long createTime;
    private long updateTime;
}
