package com.noneforum.noneforumforumcorecommon.model.bo.forum.property.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author lrd
 * @date 2023-09-25 23:51
 */
public enum CommentTagEnum {
    UNKNOW(0, "未知标签", "未知标签");
    private Integer code;
    private String name;
    private String desc;

    CommentTagEnum() {
    }

    CommentTagEnum(Integer code, String name, String desc) {
        this.code = code;
        this.name = name;
        this.desc = desc;
    }

    public long getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    private static final Map<String, CommentTagEnum> MAPPING;

    static {
        MAPPING = new HashMap<>(values().length, 1);
        for (CommentTagEnum value : values()) {
            MAPPING.put(value.getName(), value);
        }
    }

    public static CommentTagEnum of(Integer code) {
        for (CommentTagEnum commentTagEnum : CommentTagEnum.values()) {
            if (Objects.equals(commentTagEnum.getCode(), code)) {
                return commentTagEnum;
            }
        }
        return CommentTagEnum.UNKNOW;
    }

    public static CommentTagEnum of(String name) {
        return MAPPING.getOrDefault(name, CommentTagEnum.UNKNOW);
    }
}
