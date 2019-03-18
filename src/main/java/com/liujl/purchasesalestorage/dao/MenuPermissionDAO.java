package com.liujl.purchasesalestorage.dao;

import com.liujl.purchasesalestorage.domain.MenuPermission;
import org.springframework.stereotype.Repository;

/**
 * MenuPermissionDAO继承基类
 */
@Repository
public interface MenuPermissionDAO extends MyBatisBaseDao<MenuPermission, Integer> {
}