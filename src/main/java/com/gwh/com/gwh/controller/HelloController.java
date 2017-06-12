package com.gwh.com.gwh.controller;

import com.gwh.com.gwh.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gwh1994 on 2017/5/31.
 */
@RestController
public class HelloController {

    @Autowired
    private Girl girl;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String say(){
        /*return cupSize+"..."+age;*/
        return girl.getCupSize();

    }


}
