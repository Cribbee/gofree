package com.cribbee.gofree.util;

/**
 * ClassName: ResultMsg
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/2/19、3:16 PM
 * Version: 1.0
 **/
public class ResultMsg {
    private int code;
    private String msg;
    private Object data;

    public ResultMsg(int Code, String Msg, Object Data)
    {
        this.code = Code;
        this.msg = Msg;
        this.data = Data;
    }
    public int getErrcode() {
        return code;
    }
    public void setErrcode(int code) {
        this.code = code;
    }
    public String getErrmsg() {
        return msg;
    }
    public void setErrmsg(String msg) {
        this.msg = msg;
    }
    public Object getP2pdata() {
        return data;
    }
    public void setP2pdata(Object data) {
        this.data = data;
    }
}
