package com.liujl.purchasesalestorage.dao;

import com.liujl.purchasesalestorage.domain.LabelAttribute;
import org.springframework.stereotype.Repository;

/**
 * LabelAttributeDAO继承基类
 */
@Repository
public interface LabelAttributeDAO extends MyBatisBaseDao<LabelAttribute, Integer> {
}