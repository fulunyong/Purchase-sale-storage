package com.liujl.purchasesalestorage.service.impl;

import com.liujl.purchasesalestorage.dao.UserDao;
import com.liujl.purchasesalestorage.domain.User;
import com.liujl.purchasesalestorage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User selectUserByName(String name) {
        return userDao.selectUserByName(name);
    }
}
