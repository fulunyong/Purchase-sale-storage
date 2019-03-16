package com.liujl.purchasesalestorage.service;

import com.liujl.purchasesalestorage.domain.User;

public interface UserService {
    User selectUserByName(String name);
}
