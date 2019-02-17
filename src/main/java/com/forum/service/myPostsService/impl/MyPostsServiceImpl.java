package com.forum.service.myPostsService.impl;

import com.forum.common.model.ResultModel;
import com.forum.common.utils.ObjectUtil;
import com.forum.common.utils.TokenUtil;
import com.forum.pojo.dto.SelectPostsDto;
import com.forum.pojo.myPostsController.AddPostsVo;
import com.forum.pojo.myPostsController.SelectPostsVo;
import com.forum.repository.domain.Posts;
import com.forum.repository.domain.User;
import com.forum.repository.mapper.PostsMapper;
import com.forum.repository.mapper.UserMapper;
import com.forum.service.myPostsService.MyPostsService;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;

@Service
public class MyPostsServiceImpl implements MyPostsService {

    @Autowired
    private PostsMapper postsMapper;

    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional
    public ResultModel addPosts(AddPostsVo addPostsVo) throws Exception {
        Posts posts = new Posts();
        ObjectUtil.annotationToObject(addPostsVo, posts);
        posts.setFkUserId(TokenUtil.getUserId());

        if (postsMapper.insertSelective(posts) <= 0) throw new Exception("添加失败");
        return responseSuccess();
    }

    @Override
    @Transactional
    public ResultModel selectPosts(SelectPostsVo selectPostsVo) throws Exception {
        Posts posts = new Posts();
        if (selectPostsVo.getMyPosts() != null) posts.setFkUserId(TokenUtil.getUserId());
        posts.setIsDel(false);


        PageList<Posts> post = postsMapper.selectObjectListByWhere(posts, ofPageBounds(selectPostsVo));


        LinkedList<SelectPostsDto> selectPostsDtos = new LinkedList<>();


        for (Posts pos : post) {
            SelectPostsDto selectPostsDto = new SelectPostsDto();
            ObjectUtil.annotationToObject(pos, selectPostsDto);
            User user = userMapper.selectByPrimaryKey(pos.getFkUserId());
            selectPostsDto.setNickName(user.getNickName());
            selectPostsDtos.add(selectPostsDto);
        }


        return responseSuccess(selectPostsDtos,post.getPaginator());
    }


}
