package com.liujl.purchasesalestorage.dao;

import com.liujl.purchasesalestorage.domain.Menu;
import org.springframework.stereotype.Repository;

/**
 * MenuDAO继承基类
 */
@Repository
public interface MenuDAO extends MyBatisBaseDao<Menu, Integer> {
}