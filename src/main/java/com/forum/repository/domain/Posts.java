package com.forum.repository.domain;

import java.util.Date;

public class Posts {
    private Long pkPostsId;

    private Long fkUserId;

    private Long fkAdministratorId;

    private String postsTitle;

    private Boolean isDel;

    private Date createTime;

    private Date updateTime;

    private String postsContent;

    public Long getPkPostsId() {
        return pkPostsId;
    }

    public void setPkPostsId(Long pkPostsId) {
        this.pkPostsId = pkPostsId;
    }

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }

    public Long getFkAdministratorId() {
        return fkAdministratorId;
    }

    public void setFkAdministratorId(Long fkAdministratorId) {
        this.fkAdministratorId = fkAdministratorId;
    }

    public String getPostsTitle() {
        return postsTitle;
    }

    public void setPostsTitle(String postsTitle) {
        this.postsTitle = postsTitle == null ? null : postsTitle.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
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

    public String getPostsContent() {
        return postsContent;
    }

    public void setPostsContent(String postsContent) {
        this.postsContent = postsContent == null ? null : postsContent.trim();
    }
}