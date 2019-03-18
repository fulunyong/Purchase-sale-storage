package com.liujl.purchasesalestorage.dao;

import com.liujl.purchasesalestorage.domain.UserRole;
import org.springframework.stereotype.Repository;

/**
 * UserRoleDAO继承基类
 */
@Repository
public interface UserRoleDAO extends MyBatisBaseDao<UserRole, Integer> {
}