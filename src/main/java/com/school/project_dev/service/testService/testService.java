package com.school.project_dev.service.testService;

import com.school.project_dev.mapper.UserMapper;
import com.school.project_dev.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testService {
    @Autowired
    private UserMapper userMapper;

    public void addtest() {

        List<User> list =  userMapper.selectAll();
        userMapper.insert(new User(list.size() + 1,"小花"));
    }



}
