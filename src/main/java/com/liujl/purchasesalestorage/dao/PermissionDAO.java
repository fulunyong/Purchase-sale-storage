package com.liujl.purchasesalestorage.dao;

import com.liujl.purchasesalestorage.domain.Permission;
import org.springframework.stereotype.Repository;

/**
 * PermissionDAO继承基类
 */
@Repository
public interface PermissionDAO extends MyBatisBaseDao<Permission, Integer> {
}