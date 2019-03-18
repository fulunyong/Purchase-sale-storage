package com.liujl.purchasesalestorage.dao;

import com.liujl.purchasesalestorage.domain.User;
import org.springframework.stereotype.Repository;

/**
 * UserDAO继承基类
 */
@Repository
public interface UserDAO extends MyBatisBaseDao<User, Integer> {
}