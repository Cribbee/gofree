package com.cribbee.gofree.controller;

import com.cribbee.gofree.dao.UserRepository;
import com.cribbee.gofree.entity.User;
import com.cribbee.gofree.service.UserService;
import com.cribbee.gofree.util.ResultMsg;
import com.cribbee.gofree.util.ResultStatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: UserController
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/2/19、2:43 PM
 * Version: 1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Object register(
            @RequestParam(name = "usr_name") String usr_name,
            @RequestParam(name = "pwd") String pwd,
            @RequestParam(name = "phone") String phone,
            @RequestParam(name = "nick_name") String nick_name,
            @RequestParam(name = "addr") String addr,
            @RequestParam(name = "email") String email) throws Exception {

        User user = new User();
        user.setUsr_name(usr_name);
        user.setPasswd(pwd);
        user.setPhone(phone);
        user.setNick_name(nick_name);
        user.setAddr(addr);
        user.setEmail(email);

        User createUser = userService.register(user);
        userRepository.save(createUser);
        ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), user);
        return resultMsg;


    }

}
