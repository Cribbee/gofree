package com.cribbee.gofree.util;

import lombok.Data;

/**
 * ClassName: ResultMsg
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/2/19、3:16 PM
 * Version: 1.0
 **/

@Data
public class ResultMsg {
    private int code;
    private String msg;
    private Object data;

    public ResultMsg(){

    }

    public ResultMsg(int Code, String Msg, Object Data)
    {
        this.code = Code;
        this.msg = Msg;
        this.data = Data;
    }

}
