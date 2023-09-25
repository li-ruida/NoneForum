package com.noneforum.noneforumforumcorecommon.model.bo.forum.property.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author lrd
 * @date 2023-09-24 21:41
 */
public enum PostTagEnum {
    UNKNOW(0, "未知标签", "未知标签");
    private Integer code;
    private String name;
    private String desc;

    PostTagEnum() {
    }

    PostTagEnum(Integer code, String name, String desc) {
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

    private static final Map<String, PostTagEnum> MAPPING;

    static {
        MAPPING = new HashMap<>(values().length, 1);
        for (PostTagEnum value : values()) {
            MAPPING.put(value.getName(), value);
        }
    }

    public static PostTagEnum of(Integer code) {
        for (PostTagEnum postTagEnum : PostTagEnum.values()) {
            if (Objects.equals(postTagEnum.getCode(), code)) {
                return postTagEnum;
            }
        }
        return PostTagEnum.UNKNOW;
    }

    public static PostTagEnum of(String name) {
        return MAPPING.getOrDefault(name, PostTagEnum.UNKNOW);
    }
}
