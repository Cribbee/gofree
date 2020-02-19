package com.cribbee.gofree;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: hello
 * Description: TODO
 * Author: Cribbee
 * Date: 2020/2/17、2:21 PM
 * Version: 1.0
 **/
@RestController
public class hello {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(@RequestParam("id") Integer myId){
        return "id: " + myId;
    }
}
