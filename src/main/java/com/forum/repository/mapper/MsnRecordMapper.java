package com.forum.repository.mapper;

import java.util.List;

import com.forum.repository.domain.MsnRecord;
import org.apache.ibatis.annotations.Param;

public interface MsnRecordMapper {
    long countByExample(MsnRecord example);

    int deleteByExample(MsnRecord example);

    int deleteByPrimaryKey(Long pkMsnRecordId);

    int insert(MsnRecord record);

    int insertSelective(MsnRecord record);

    List<MsnRecord> selectByExample(MsnRecord example);

    MsnRecord selectByPrimaryKey(Long pkMsnRecordId);

    int updateByExampleSelective(@Param("record") MsnRecord record, @Param("example") MsnRecord example);

    int updateByExample(@Param("record") MsnRecord record, @Param("example") MsnRecord example);

    int updateByPrimaryKeySelective(MsnRecord record);

    int updateByPrimaryKey(MsnRecord record);
}