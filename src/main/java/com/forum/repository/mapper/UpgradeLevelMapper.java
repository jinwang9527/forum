package com.forum.repository.mapper;

import java.util.List;

import com.forum.repository.domain.UpgradeLevel;
import org.apache.ibatis.annotations.Param;

public interface UpgradeLevelMapper {
    long countByExample(UpgradeLevel example);

    int deleteByExample(UpgradeLevel example);

    int deleteByPrimaryKey(Long pkUpgradeLevelId);

    int insert(UpgradeLevel record);

    int insertSelective(UpgradeLevel record);

    List<UpgradeLevel> selectByExample(UpgradeLevel example);

    UpgradeLevel selectByPrimaryKey(Long pkUpgradeLevelId);

    int updateByExampleSelective(@Param("record") UpgradeLevel record, @Param("example") UpgradeLevel example);

    int updateByExample(@Param("record") UpgradeLevel record, @Param("example") UpgradeLevel example);

    int updateByPrimaryKeySelective(UpgradeLevel record);

    int updateByPrimaryKey(UpgradeLevel record);
}