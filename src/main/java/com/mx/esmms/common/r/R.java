package com.mx.esmms.common.r;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 *
 * @author analysis
 * @email analysis@163.com
 * @date 2018年05月27日 下午9:59:27
 */
public class R extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public R() {
        put("code", ResultCode.SUCCESS);
        put("msg", "success");
    }

    public static R error() {
        return error(ResultCode.ERROR, "失败");
    }

    public static R error(String msg) {
        return error(ResultCode.ERROR, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R ok() {
        return new R();
    }

    public R code(Integer code) {
        super.put("code", code);
        return this;
    }

    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
