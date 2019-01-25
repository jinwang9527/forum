package com.forum.repository.mapper;

import java.util.List;

import com.forum.repository.domain.Administrator;
import org.apache.ibatis.annotations.Param;

public interface AdministratorMapper {
    long countByExample(Administrator example);

    int deleteByExample(Administrator example);

    int deleteByPrimaryKey(Long pkAdministratorId);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    List<Administrator> selectByExample(Administrator example);

    Administrator selectByPrimaryKey(Long pkAdministratorId);

    int updateByExampleSelective(@Param("record") Administrator record, @Param("example") Administrator example);

    int updateByExample(@Param("record") Administrator record, @Param("example") Administrator example);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);
}