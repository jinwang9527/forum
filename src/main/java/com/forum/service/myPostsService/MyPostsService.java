package com.forum.service.myPostsService;

import com.forum.common.model.ResultModel;
import com.forum.pojo.myPostsController.AddPostsVo;
import com.forum.pojo.myPostsController.SelectPostsDetailVo;
import com.forum.pojo.myPostsController.SelectPostsVo;
import com.forum.pojo.myPostsController.AddPostsDetailVo;
import com.forum.service.BaseService;


public interface MyPostsService extends BaseService {

    ResultModel addPosts(AddPostsVo addPostsVo) throws Exception;

    ResultModel selectPosts(SelectPostsVo selectPostsVo) throws Exception;


    ResultModel selectPostsDetail(SelectPostsDetailVo selectPostsDetailVo) throws Exception;

    ResultModel addPostsDetail(AddPostsDetailVo addPostsDetailVo) throws Exception;
}
