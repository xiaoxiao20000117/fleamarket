package com.example.fleamarket.pojo;

public class ServerResult {
    public ServerResult(int state, String msg, Object data){
        this.state = state;
        this.msg = msg;
        this.data = data;

    }

    int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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

    String msg;
    Object data;
}
