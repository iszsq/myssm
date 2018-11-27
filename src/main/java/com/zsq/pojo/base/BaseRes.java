package com.zsq.pojo.base;

/**
 * @author zsq
 * @date 2018/11/28 - 0:34
 */
public class BaseRes {

    public static final int SUCCESS = 200;
    public static final int FAIL = -1;

    private int code;
    private String msg;
    private Object data;

    public BaseRes(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseRes(int code, String msg, Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static BaseRes success(Object body){
        return new BaseRes(SUCCESS,"操作成功",body);
    }
    public static BaseRes fail(Object body){
        return new BaseRes(FAIL,"操作失败");
    }

    public static BaseRes success(String msg){
        return new BaseRes(SUCCESS,msg);
    }
    public static BaseRes fail(String msg){
        return new BaseRes(FAIL,msg);
    }

    public static BaseRes success(Object body, String msg){
        return new BaseRes(SUCCESS,msg,body);
    }
    public static BaseRes fail(Object body, String msg){
        return new BaseRes(FAIL,msg);
    }
}
