package com.luolh.controller;

import com.luolh.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by luolh on
 */
@Controller
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/test")
    public String findAll(Model model){
        model.addAttribute("list", testService.findAll());
        return "test";
    }
}
