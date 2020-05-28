package com.cribbee.gofree.controller;

import com.cribbee.gofree.entity.SetItineraryRequest;
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

    @PostMapping("setItinerary")
    public ResponseEntity<ResultMsg> setItinerary(@RequestBody SetItineraryRequest setItineraryRequest) {
        ResultMsg resp = sightService.setItinerary(setItineraryRequest);
        return new ResponseEntity<>(resp, HttpStatus.CREATED);
    }

    @RequestMapping("hello")
    public String hello() {
        return "Hello SpringBoot";
    }

}

