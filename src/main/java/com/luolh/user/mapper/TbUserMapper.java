package com.luolh.user.mapper;

import com.luolh.user.entity.TbUser;
import org.springframework.stereotype.Repository;

@Repository
public interface TbUserMapper {

    /**
     * 通过用户名查找
     * @return TbUser实体
     */
    TbUser findByUsername(String username);

    int insert(TbUser tbUser);
}
