package com.liujl.purchasesalestorage.dao;

import com.liujl.purchasesalestorage.domain.Unit;
import org.springframework.stereotype.Repository;

/**
 * UnitDAO继承基类
 */
@Repository
public interface UnitDAO extends MyBatisBaseDao<Unit, Integer> {
}