package com.forum.repository.mapper;

import java.util.List;

import com.forum.repository.domain.MsnTemplate;
import org.apache.ibatis.annotations.Param;

public interface MsnTemplateMapper {
    long countByExample(MsnTemplate example);

    int deleteByExample(MsnTemplate example);

    int deleteByPrimaryKey(Long pkMsnTemplateId);

    int insert(MsnTemplate record);

    int insertSelective(MsnTemplate record);

    List<MsnTemplate> selectByExample(MsnTemplate example);

    MsnTemplate selectByPrimaryKey(Long pkMsnTemplateId);

    int updateByExampleSelective(@Param("record") MsnTemplate record, @Param("example") MsnTemplate example);

    int updateByExample(@Param("record") MsnTemplate record, @Param("example") MsnTemplate example);

    int updateByPrimaryKeySelective(MsnTemplate record);

    int updateByPrimaryKey(MsnTemplate record);
}