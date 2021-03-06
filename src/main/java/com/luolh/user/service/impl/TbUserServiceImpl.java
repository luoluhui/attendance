package com.luolh.user.service.impl;

import com.luolh.user.entity.TbUser;
import com.luolh.user.mapper.TbUserMapper;
import com.luolh.user.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by luolh on
 */
@Service
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    TbUserMapper tbUserMapper;

    @Override
    public TbUser findByUsername(String username) {
        return tbUserMapper.findByUsername(username);
    }
}
