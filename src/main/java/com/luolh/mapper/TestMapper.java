package com.luolh.mapper;

import com.luolh.entity.Test;

import java.util.List;

/**
 * created by luolh on
 */
public interface TestMapper {

    int insert(Test test);

    List<Test> findAll();
}
