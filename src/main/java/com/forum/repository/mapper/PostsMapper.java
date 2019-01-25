package com.forum.repository.mapper;

import java.util.List;

import com.forum.repository.domain.Posts;
import org.apache.ibatis.annotations.Param;

public interface PostsMapper {
    long countByExample(Posts example);

    int deleteByExample(Posts example);

    int deleteByPrimaryKey(Long pkPostsId);

    int insert(Posts record);

    int insertSelective(Posts record);

    List<Posts> selectByExampleWithBLOBs(Posts example);

    List<Posts> selectByExample(Posts example);

    Posts selectByPrimaryKey(Long pkPostsId);

    int updateByExampleSelective(@Param("record") Posts record, @Param("example") Posts example);

    int updateByExampleWithBLOBs(@Param("record") Posts record, @Param("example") Posts example);

    int updateByExample(@Param("record") Posts record, @Param("example") Posts example);

    int updateByPrimaryKeySelective(Posts record);

    int updateByPrimaryKeyWithBLOBs(Posts record);

    int updateByPrimaryKey(Posts record);
}