package com.luolh.attend.mapper;

import com.luolh.attend.entity.Attend;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendMapper {

    List<Attend> findAll();
}
