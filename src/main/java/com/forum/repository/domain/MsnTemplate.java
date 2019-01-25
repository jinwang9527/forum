package com.forum.repository.domain;

import java.util.Date;

public class MsnTemplate {
    private Long pkMsnTemplateId;

    private String title;

    private String content;

    private Boolean isGlobal;

    private Long creator;

    private Date createTime;

    private Date updateTime;

    private Boolean isDel;

    public Long getPkMsnTemplateId() {
        return pkMsnTemplateId;
    }

    public void setPkMsnTemplateId(Long pkMsnTemplateId) {
        this.pkMsnTemplateId = pkMsnTemplateId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Boolean getIsGlobal() {
        return isGlobal;
    }

    public void setIsGlobal(Boolean isGlobal) {
        this.isGlobal = isGlobal;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
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

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }
}