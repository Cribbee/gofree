package com.cribbee.gofree.controller;

import com.cribbee.gofree.entity.GetSightRequest;
import com.cribbee.gofree.service.SightService;
import com.cribbee.gofree.util.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sight")
public class SightController {

    @Autowired
    private SightService sightService;

    @PostMapping("gettest")
    public ResponseEntity<ResultMsg> register(@RequestBody GetSightRequest getSightRequest) {
        ResultMsg resp = sightService.getSightsByDaysAndSightNum(getSightRequest);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @RequestMapping("hello")
    public String hello() {
        return "Hello SpringBoot";
    }

}

