package com.liujl.purchasesalestorage.dao;

import com.liujl.purchasesalestorage.domain.Role;
import org.springframework.stereotype.Repository;

/**
 * RoleDAO继承基类
 */
@Repository
public interface RoleDAO extends MyBatisBaseDao<Role, Integer> {
}