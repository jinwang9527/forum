package com.forum.repository.domain;

import java.util.Date;

public class UpgradeLevel {
    private Long pkUpgradeLevelId;

    private Long fkUserId;

    private Integer level;

    private Date createTime;

    private Date updateTime;

    private Boolean isDel;

    public Long getPkUpgradeLevelId() {
        return pkUpgradeLevelId;
    }

    public void setPkUpgradeLevelId(Long pkUpgradeLevelId) {
        this.pkUpgradeLevelId = pkUpgradeLevelId;
    }

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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