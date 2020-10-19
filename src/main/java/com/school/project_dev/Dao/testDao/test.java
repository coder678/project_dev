package com.school.project_dev.Dao.testDao;

import com.school.project_dev.mapper.UserAnsMapper;
import com.school.project_dev.mapper.UserMapper;
import com.school.project_dev.pojo.User;
import com.school.project_dev.pojo.UserAns;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class test {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserAnsMapper userAnsMapper;

    @Test
    public void test() {
        userMapper.insert(new User(4, "小王"));
    }

    @Test
    public void test1() {
        userAnsMapper.insert(new UserAns(2, 1, 1));
    }

    @Value("${spring.datasource.name}")
    String name;

    @Test
    public void test2() {

        System.out.println(name);


    }


}
