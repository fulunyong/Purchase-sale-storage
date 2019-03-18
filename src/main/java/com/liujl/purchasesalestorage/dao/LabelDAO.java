package com.liujl.purchasesalestorage.dao;

import com.liujl.purchasesalestorage.domain.Label;
import org.springframework.stereotype.Repository;

/**
 * LabelDAO继承基类
 */
@Repository
public interface LabelDAO extends MyBatisBaseDao<Label, Integer> {
}