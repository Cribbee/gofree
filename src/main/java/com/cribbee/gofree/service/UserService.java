package com.cribbee.gofree.service;

import com.cribbee.gofree.entity.Response;
import com.cribbee.gofree.entity.User;
import com.cribbee.gofree.util.ResultMsg;

public interface UserService {

    /**
     * 根据用户id获取用户对象
     *
     * @param id
     */
    User getUserBuId(Integer id)  throws Exception;


    /**
     * 注册
     *
     * @param user
     * @return
     */
    ResultMsg register(User user);


    /**
     * 登录
     *
     * @param phone
     * @param pwd
     * @return
     */
    User login(String phone, String pwd)  throws Exception;

}
