package com.forum.repository.mapper;

import java.util.List;

import com.forum.repository.domain.Dictionary;
import org.apache.ibatis.annotations.Param;

public interface DictionaryMapper {
    long countByExample(Dictionary example);

    int deleteByExample(Dictionary example);

    int deleteByPrimaryKey(Long pkDictionaryId);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    List<Dictionary> selectByExample(Dictionary example);

    Dictionary selectByPrimaryKey(Long pkDictionaryId);

    int updateByExampleSelective(@Param("record") Dictionary record, @Param("example") Dictionary example);

    int updateByExample(@Param("record") Dictionary record, @Param("example") Dictionary example);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);
}