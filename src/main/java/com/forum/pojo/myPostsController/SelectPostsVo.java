package com.forum.pojo.myPostsController;

import com.forum.pojo.AbstractVo;
import lombok.Data;

@Data
public class SelectPostsVo extends AbstractVo {

    //查所有
    public String All;

    //查自己
    public  String myPosts;


}
