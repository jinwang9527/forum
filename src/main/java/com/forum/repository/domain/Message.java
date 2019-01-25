package com.forum.repository.domain;

import java.util.Date;

public class Message {
    private Long pkMessageId;

    private Long fkAdministratorId;

    private Long fkUserId;

    private String content;

    private Boolean isDelivery;

    private Boolean isRead;

    private Boolean delStatus;

    private Date createTime;

    private Date updateTime;

    private Boolean isDel;

    public Long getPkMessageId() {
        return pkMessageId;
    }

    public void setPkMessageId(Long pkMessageId) {
        this.pkMessageId = pkMessageId;
    }

    public Long getFkAdministratorId() {
        return fkAdministratorId;
    }

    public void setFkAdministratorId(Long fkAdministratorId) {
        this.fkAdministratorId = fkAdministratorId;
    }

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Boolean getIsDelivery() {
        return isDelivery;
    }

    public void setIsDelivery(Boolean isDelivery) {
        this.isDelivery = isDelivery;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public Boolean getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Boolean delStatus) {
        this.delStatus = delStatus;
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