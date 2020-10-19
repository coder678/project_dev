package com.school.project_dev.Controller.testController;


import com.school.project_dev.pojo.User;
import com.school.project_dev.service.testService.testService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
    @Autowired
    testService testService;


    @GetMapping("/hello")
    @ResponseBody
    @ApiOperation(value = "用来验证连接远程数据库的")
    public String hello() {
        System.out.println("hello");

        testService.addtest();
        return "hello";
    }

    @GetMapping("/login")
    @ApiOperation(value = "登录端口")
    public String login() {
        return "login";
    }

}
