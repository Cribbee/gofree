package com.cribbee.gofree.util;

/**
 * ClassName: ResultStatusCode
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/2/19、3:16 PM
 * Version: 1.0
 **/
public enum ResultStatusCode {
    OK(0, "OK"),
    SYSTEM_ERR(500, "有错误，找网管");

    private int code;
    private String msg;
    public int getErrcode() {
        return code;
    }

    public void setErrcode(int ecode) {
        this.code = code;
    }

    public String getErrmsg() {
        return msg;
    }

    public void setErrmsg(String msg) {
        this.msg = msg;
    }
    private ResultStatusCode(int Code, String Msg)
    {
        this.code = Code;
        this.msg = Msg;
    }
}

