package com.forum.repository.mapper;


import com.forum.repository.domain.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageMapper {
    long countByExample(Message example);

    int deleteByExample(Message example);

    int deleteByPrimaryKey(Long pkMessageId);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(Message example);

    Message selectByPrimaryKey(Long pkMessageId);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") Message example);

    int updateByExample(@Param("record") Message record, @Param("example") Message example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}