package com.cribbee.gofree.controller;

import com.cribbee.gofree.entity.Personas;
import com.cribbee.gofree.entity.User;
import com.cribbee.gofree.service.PersonasService;
import com.cribbee.gofree.util.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: PersonasController
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/5/25、11:03 PM
 * Version: 1.0
 **/
@RestController
@RequestMapping("/personas")
public class PersonasController {

    @Autowired
    private PersonasService personasService;

    @PostMapping("register")
    public ResponseEntity<ResultMsg> register(@RequestBody Personas personas) {
        ResultMsg resp = personasService.register(personas);
        return new ResponseEntity<>(resp, HttpStatus.CREATED);
    }

}
