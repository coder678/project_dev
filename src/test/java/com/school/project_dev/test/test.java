package com.school.project_dev.test;

import com.school.project_dev.mapper.UserMapper;
import com.school.project_dev.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class test {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        userMapper.insert(new User(35, "小王"));
    }



}
