package com.aijieshe.pojo;

import java.util.ArrayList;

//        String s={"code":0,"msg":"","count":1000,"data":list}
public class json {
    private  Integer code;
    private  String msg;
    private Integer count;
    private ArrayList data;

    @Override
    public String toString() {
        return "json{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ArrayList getData() {
        return data;
    }

    public void setData(ArrayList data) {
        this.data = data;
    }
}
