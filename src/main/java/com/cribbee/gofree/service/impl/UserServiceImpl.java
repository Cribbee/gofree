package com.cribbee.gofree.service.impl;

import com.cribbee.gofree.dao.UserRepository;
import com.cribbee.gofree.entity.User;
import com.cribbee.gofree.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * ClassName: UserServiceImpl
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/2/19、2:42 PM
 * Version: 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public User getUserBuId(Integer id)  throws Exception {
        return null;
    }

    @Override
    public User register(User user)  throws Exception{
        return null;
    }

    @Override
    public User login(String phone, String pwd)  throws Exception{
        return null;
    }

}
