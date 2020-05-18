package com.cribbee.gofree.service.impl;

import com.cribbee.gofree.dao.UserRepository;
import com.cribbee.gofree.entity.User;
import com.cribbee.gofree.service.UserService;
import com.cribbee.gofree.util.ResultMsg;
import com.cribbee.gofree.util.ResultStatusCode;
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
    public User getUserBuId(Integer id) {
        return null;
    }

    @Override
    @Transactional
    public User findUserByUsrNameAndPwd(String usr_name, String pwd) {
        return null;
    }


    @Override
    public ResultMsg register(User user) {
        User savedUser = userRepository.save(user);
        ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), savedUser);
        return resultMsg;
    }

    @Override
    public ResultMsg login(User user) {

        String usr_name = user.getUsr_name();
        String passwd = user.getPasswd();
        User user_repo = findUserByUsrNameAndPwd(usr_name, passwd);
        if (user_repo != null) {
            ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), user_repo);
            return resultMsg;
        } else
            return new ResultMsg(ResultStatusCode.SYSTEM_ERR.getErrcode(), ResultStatusCode.SYSTEM_ERR.getErrmsg(), user);
    }

}

