package com.liujl.purchasesalestorage.dao;

import com.liujl.purchasesalestorage.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    User selectUserByName(String name);
}
