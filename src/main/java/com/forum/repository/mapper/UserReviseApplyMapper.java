package com.forum.repository.mapper;

import java.util.List;

import com.forum.repository.domain.UserReviseApply;
import org.apache.ibatis.annotations.Param;

public interface UserReviseApplyMapper {
    long countByExample(UserReviseApply example);

    int deleteByExample(UserReviseApply example);

    int insert(UserReviseApply record);

    int insertSelective(UserReviseApply record);

    List<UserReviseApply> selectByExample(UserReviseApply example);

    int updateByExampleSelective(@Param("record") UserReviseApply record, @Param("example") UserReviseApply example);

    int updateByExample(@Param("record") UserReviseApply record, @Param("example") UserReviseApply example);
}