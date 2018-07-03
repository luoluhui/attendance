package com.luolh.mapper;

import com.luolh.entity.TbUser;

public interface TbUserMapper {

    /**
     * 通过用户名查找
     * @return TbUser实体
     */
    TbUser findByUsername(String username);

    int insert(TbUser tbUser);
}
