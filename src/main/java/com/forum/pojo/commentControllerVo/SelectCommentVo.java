package com.forum.pojo.commentControllerVo;

import com.forum.pojo.AbstractVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SelectCommentVo extends AbstractVo {


    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Long pkCommentId;


}
