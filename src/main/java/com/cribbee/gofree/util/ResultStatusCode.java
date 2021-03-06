package com.cribbee.gofree.util;

import com.cribbee.gofree.entity.Personas;

/**
 * ClassName: ResultStatusCode
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/2/19、3:16 PM
 * Version: 1.0
 **/
public enum ResultStatusCode {
    OK(0, "OK"),
    SYSTEM_ERR(500, "有错误，找网管"),

    //登录注册
    USR_NAME_OR_PASSWD_WRONG(251, "用户名或密码不正确"),
    USR_NAME_EXISTED(252, "该用户名已存在"),
    NICK_NAME_EXISTED(253, "该昵称已存在"),
    PHONE_EXISTED(254, "该手机号已存在"),
    EMAIL_EXISTED(255, "该邮箱已存在"),
    USR_NOT_EXISTED(256, "该用户不存在"),
    PERSONAS_EXISTED(257, "该用户画像已存在"),

    //行程rhythm
    BAD_RHYTHM(258, "错误的旅行节奏参数");



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

