package com.cribbee.gofree.service;

import com.cribbee.gofree.entity.User;

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
    User register(User user)  throws Exception;


    /**
     * 登录
     *
     * @param phone
     * @param pwd
     * @return
     */
    User login(String phone, String pwd)  throws Exception;

}
