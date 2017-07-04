package com.boot.controller;

//import org.springframework.web.bind.annotation.RestController;

import  org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Babu_2 on 02-07-2017.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hi welcome to first Springboot Rest application ";
    }
}
