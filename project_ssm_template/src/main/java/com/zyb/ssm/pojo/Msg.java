package com.zyb.ssm.pojo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Msg {
    private Map<String,Object> extend=new HashMap<>();
    private int code;
    private String msg;

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
    @Test
    public void unit1(){
        Msg add = Msg.success().add("dd", "ddd");
        System.out.println(add.getExtend().get("dd"));

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

    public static Msg success(){
        Msg result = new Msg();
        result.setCode(100);
        result.setMsg("请求处理成功");
        return result;
    }
    public static Msg failed(){
        Msg result = new Msg();
        result.setCode(200);
        result.setMsg("请求处理失败");
        return result;
    }
    public Msg add(String key,Object value){
         this.getExtend().put(key,value);
         return this;
    }

}
