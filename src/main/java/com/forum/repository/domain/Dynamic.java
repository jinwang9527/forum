package com.forum.repository.domain;

import java.util.Date;

public class Dynamic {
    private Long pkDynamicId;

    private Long fkUserId;

    private String dynamicTitle;

    private Long fkAdministratorId;

    private Boolean isDel;

    private Date createTime;

    private Date updateTime;

    private String dynamicContent;

    public Long getPkDynamicId() {
        return pkDynamicId;
    }

    public void setPkDynamicId(Long pkDynamicId) {
        this.pkDynamicId = pkDynamicId;
    }

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }

    public String getDynamicTitle() {
        return dynamicTitle;
    }

    public void setDynamicTitle(String dynamicTitle) {
        this.dynamicTitle = dynamicTitle == null ? null : dynamicTitle.trim();
    }

    public Long getFkAdministratorId() {
        return fkAdministratorId;
    }

    public void setFkAdministratorId(Long fkAdministratorId) {
        this.fkAdministratorId = fkAdministratorId;
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

    public String getDynamicContent() {
        return dynamicContent;
    }

    public void setDynamicContent(String dynamicContent) {
        this.dynamicContent = dynamicContent == null ? null : dynamicContent.trim();
    }
}