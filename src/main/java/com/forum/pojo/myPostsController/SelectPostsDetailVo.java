package com.forum.pojo.myPostsController;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class SelectPostsDetailVo {


    /**
     * 主键
     */
    @NotEmpty
    @ApiModelProperty(value = "主键" , required = true)
    private Long pkPostsId;
}
