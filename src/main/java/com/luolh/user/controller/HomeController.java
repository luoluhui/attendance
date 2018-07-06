package com.luolh.user.controller;

import com.luolh.user.entity.TbUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * created by luolh on 20180703
 */
@Controller
public class HomeController {

    /**
     * 进入home页面
     * @return
     */
    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }

    @RequestMapping(value="/userInfo")
    @ResponseBody
    public TbUser findUser(HttpSession session){
        TbUser user = (TbUser) session.getAttribute("userInfo");
        System.out.println(user.getUsername());
        return user;
    }
}
