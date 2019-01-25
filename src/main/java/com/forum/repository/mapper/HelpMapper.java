package com.forum.repository.mapper;

import java.util.List;

import com.forum.repository.domain.Help;
import org.apache.ibatis.annotations.Param;

public interface HelpMapper {
    long countByExample(Help example);

    int deleteByExample(Help example);

    int deleteByPrimaryKey(Long pkHelpId);

    int insert(Help record);

    int insertSelective(Help record);

    List<Help> selectByExample(Help example);

    Help selectByPrimaryKey(Long pkHelpId);

    int updateByExampleSelective(@Param("record") Help record, @Param("example") Help example);

    int updateByExample(@Param("record") Help record, @Param("example") Help example);

    int updateByPrimaryKeySelective(Help record);

    int updateByPrimaryKey(Help record);
}