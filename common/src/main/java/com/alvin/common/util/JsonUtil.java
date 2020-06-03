package com.alvin.common.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Map;


/**
 * json工具类
 * https://www.yuque.com/tianyunperfect/ygzsw4/bv1mlg
 * <p>
 * JsonUtil.getObject(str,JsonHello.class)
 *
 * @author tianyunperfect
 * @date 2020/05/20
 */
public class JsonUtil {
    private static final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();;

    public JsonUtil() {
    }

    /**
     * 转换为json字符串
     *
     * @param object 对象
     * @return {@link String}
     */
    public static String toJsonStr(Object object) {
        return gson.toJson(object);
    }


    /**
     * 将json字符串 转换为 普通类
     *
     * @param jsonStr json str
     * @param clazz   clazz
     * @return {@link T}
     */
    public static <T> T getObject(String jsonStr, Class<T> clazz) {
        return gson.fromJson(jsonStr, clazz);
    }

    /**
     * 支持泛型等复杂类型
     * new TypeToken<Result<List<Integer>>>(){}
     * new TypeToken<List<Map<String, T>>>() {}
     *
     * @param jsonString json字符串
     * @param typeToken  令牌类型
     * @return {@link T}
     */
    public static <T> T getObject(String jsonString, TypeToken typeToken) {

        return gson.fromJson(jsonString, typeToken.getType());
    }

    /**
     * 转为数组
     * @param jsonString
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T[] getArray(String jsonString, Class<T> tClass) {
        return gson.fromJson(jsonString, TypeToken.getArray(tClass).getType());
    }

    /**
     * 转为list
     * @param jsonString
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> List<T> getList(String jsonString, Class<T> tClass) {
        return gson.fromJson(jsonString, new TypeToken<List<T>>() {}.getType());
    }

    /**
     * json字符串转成map的
     *
     * @param gsonString
     * @return
     */
    public static <T> Map<String, T> getMap(String gsonString) {
        return gson.fromJson(gsonString, new TypeToken<Map<String, T>>() {}.getType());
    }
}