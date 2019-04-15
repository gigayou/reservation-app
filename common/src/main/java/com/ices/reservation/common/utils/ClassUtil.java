package com.ices.reservation.common.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public class ClassUtil {
    public static <T> T mapToClass(Map map, Class<T> clazz) {
        if (map == null) return null;
        T t;
        try {
            t = JSONObject.parseObject(JSONObject.toJSONString(map), clazz);
        } catch (Exception e) {
            return null;
        }
        return t;
    }
}
