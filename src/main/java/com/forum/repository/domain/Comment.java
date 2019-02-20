
package com.forum.repository.domain;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    /**
     * 主键
     */
    private Long pkCommentId;

    /**
     * 评论人
     */
    private Long fkUserId;

    /**
     * 帖子id
     */
    private Long fkPostsId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 假删除
     */
    private String isDel;

    private static final long serialVersionUID = 1L;

    public Long getPkCommentId() {
        return pkCommentId;
    }

    public void setPkCommentId(Long pkCommentId) {
        this.pkCommentId = pkCommentId;
    }

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }

    public Long getFkPostsId() {
        return fkPostsId;
    }

    public void setFkPostsId(Long fkPostsId) {
        this.fkPostsId = fkPostsId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }
}