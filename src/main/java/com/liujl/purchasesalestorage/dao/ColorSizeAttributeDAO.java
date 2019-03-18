package com.liujl.purchasesalestorage.dao;

import com.liujl.purchasesalestorage.domain.ColorSizeAttribute;
import org.springframework.stereotype.Repository;

/**
 * ColorSizeAttributeDAO继承基类
 */
@Repository
public interface ColorSizeAttributeDAO extends MyBatisBaseDao<ColorSizeAttribute, Integer> {
}