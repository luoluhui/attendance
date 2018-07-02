package com.luolh.service.impl;

import com.luolh.entity.Test;
import com.luolh.mapper.TestMapper;
import com.luolh.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by luolh on
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper testMapper;
    @Override
    public List<Test> findAll() {
        return testMapper.findAll();
    }
}
