package com.luolh.user.service;

import com.luolh.user.entity.TbUser;

/**
 * created by luolh on
 */
public interface TbUserService {

    TbUser findByUsername(String username);
}
