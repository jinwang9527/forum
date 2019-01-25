package com.forum.repository.mapper;

import java.util.List;

import com.forum.repository.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(User example);

    int deleteByExample(User example);

    int deleteByPrimaryKey(Long pkUserId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(User example);

    User selectByPrimaryKey(Long pkUserId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") User example);

    int updateByExample(@Param("record") User record, @Param("example") User example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}