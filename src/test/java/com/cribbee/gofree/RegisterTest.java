package com.cribbee.gofree;

import com.alibaba.fastjson.JSONObject;
import com.cribbee.gofree.entity.User;
import java.sql.Timestamp;

public class RegisterTest {

    public static final String ADD_URL = "http://localhost:8081/user/register";


    public static void main(String[] args) {
        User user=new User();
        user.setUsr_name("root");
        user.setPasswd("123456");
        user.setNick_name("nick_root");
        user.setPhone("110");
        user.setEmail("123456@root.com");
        user.setAddr("HERE");
        user.setCreatetime(new Timestamp(System.currentTimeMillis()));
        user.setUpdatetime(new Timestamp(System.currentTimeMillis()));
        String s= JSONObject.toJSONString(user);
        String s1 = PostMethod.doPostJson(ADD_URL, s);
        System.out.println(s1);
    }
}
