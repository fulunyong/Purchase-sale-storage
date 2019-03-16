package com.liujl.purchasesalestorage.controller;
import com.liujl.purchasesalestorage.domain.User;
import com.liujl.purchasesalestorage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //依赖注入
    @Autowired
    UserService userService;

    @RequestMapping(value = "find")
    public User findUserByName() {
        //调用dao层
        User user = userService.selectUserByName("zs");
        return user;//返回的是Json数据，因为RestController注解中有@ResponseBody的作用
    }

}
