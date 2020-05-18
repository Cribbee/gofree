package com.cribbee.gofree.controller;

import com.cribbee.gofree.dao.UserRepository;
import com.cribbee.gofree.entity.User;
import com.cribbee.gofree.service.UserService;
import com.cribbee.gofree.util.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    private UserService userService;

    @PostMapping("register")
    public ResponseEntity<ResultMsg> register(@RequestBody User user) {
        ResultMsg resp = userService.register(user);
        return new ResponseEntity<>(resp, HttpStatus.CREATED);
    }

    @PostMapping("login")
    public ResponseEntity<ResultMsg> login(@RequestBody User user) {
        ResultMsg resp = userService.login(user);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @RequestMapping("hello")
    public String hello() {
        return "Hello SpringBoot";
    }

}
