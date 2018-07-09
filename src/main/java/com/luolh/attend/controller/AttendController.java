package com.luolh.attend.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.luolh.attend.entity.Attend;
import com.luolh.attend.service.AttendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * created by luolh on 20180706
 */
@Controller
@RequestMapping("/attend")
public class AttendController {

    @Autowired
    AttendService attendService;

    private final static int NAVIGATE_PAGES = 5;

    @RequestMapping()
    public String toAttend(int pageNo, Model model){
        PageHelper.startPage(pageNo, 5);
        List<Attend> attendList = attendService.findAll();
        PageInfo<?> pageInfo = new PageInfo<>(attendList,NAVIGATE_PAGES);
        model.addAttribute("attendList", attendList);
        model.addAttribute("pageInfo",pageInfo);
        return "attend";
    }
}
