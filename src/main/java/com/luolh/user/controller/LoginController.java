package com.luolh.user.controller;

import com.luolh.user.entity.TbUser;
import com.luolh.user.mapper.TbUserMapper;
import com.luolh.user.service.TbUserService;
import com.luolh.user.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * created by luolh on 20170703
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    TbUserMapper tbUserMapper;

    @Autowired
    TbUserService tbUserService;

    /**
     * 跳转到登录页面
     */
    @RequestMapping()
    public String loginPage(){
        return "login";
    }
    /**
     *
     * @param user
     * @return
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @RequestMapping(value="/check")
    @ResponseBody
    public String login(TbUser user, HttpServletRequest request) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        TbUser tbUser = tbUserService.findByUsername(user.getUsername());
        if(StringUtils.isEmpty(tbUser)){
            return "fail";
        }
        if(checkUser(user,tbUser.getPasswords())){
            request.getSession().setAttribute("userInfo",tbUser);
            return "success";
        }
        return "fail";
    }

    /**
     * 判断用户信息是否正确
     * @param user 输入信息
     * @return true 输入正确，false 输入有误
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    private boolean checkUser(TbUser user,String dbPasswords) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        boolean result = false;
        if(StringUtils.isEmpty(user)){
            return result;
        }
        result = SecurityUtils.checkPasswords(user.getPasswords(),dbPasswords);
        return result;
    }

    @RequestMapping(value = "/register", method =RequestMethod.POST)
    public String register(TbUser tbUser) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        System.out.println(tbUser.getPasswords());
        String passwords = SecurityUtils.encryption(tbUser.getPasswords());
        tbUser.setPasswords(passwords);
        tbUserMapper.insert(tbUser);
        return "login";
    }
}
