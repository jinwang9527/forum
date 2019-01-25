package com.forum.repository.mapper;

import java.util.List;

import com.forum.repository.domain.Dynamic;
import org.apache.ibatis.annotations.Param;

public interface DynamicMapper {
    long countByExample(Dynamic example);

    int deleteByExample(Dynamic example);

    int deleteByPrimaryKey(Long pkDynamicId);

    int insert(Dynamic record);

    int insertSelective(Dynamic record);

    List<Dynamic> selectByExampleWithBLOBs(Dynamic example);

    List<Dynamic> selectByExample(Dynamic example);

    Dynamic selectByPrimaryKey(Long pkDynamicId);

    int updateByExampleSelective(@Param("record") Dynamic record, @Param("example") Dynamic example);

    int updateByExampleWithBLOBs(@Param("record") Dynamic record, @Param("example") Dynamic example);

    int updateByExample(@Param("record") Dynamic record, @Param("example") Dynamic example);

    int updateByPrimaryKeySelective(Dynamic record);

    int updateByPrimaryKeyWithBLOBs(Dynamic record);

    int updateByPrimaryKey(Dynamic record);
}