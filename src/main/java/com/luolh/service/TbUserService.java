package com.luolh.service;

import com.luolh.entity.TbUser;

/**
 * created by luolh on
 */
public interface TbUserService {

    TbUser findByUsername(String username);
}
