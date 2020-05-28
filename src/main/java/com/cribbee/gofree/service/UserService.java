package com.cribbee.gofree.service;


import com.cribbee.gofree.entity.User;
import com.cribbee.gofree.util.ResultMsg;

public interface UserService {


    /**
     * 注册
     *
     * @param user
     * @return
     */
    ResultMsg register(User user);


    /**
     * @param user
     * @return
     * @throws Exception
     */
    ResultMsg login(User user);

}
