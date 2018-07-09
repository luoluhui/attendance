package com.luolh.attend.service.impl;

import com.luolh.attend.entity.Attend;
import com.luolh.attend.mapper.AttendMapper;
import com.luolh.attend.service.AttendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by luolh on 20180709
 */
@Service
public class AttendServiceImpl implements AttendService {

    @Autowired
    AttendMapper attendMapper;

    @Override
    public List<Attend> findAll() {
        return attendMapper.findAll();
    }
}
