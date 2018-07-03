package com.luolh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by luolh on 20180703
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }
}
