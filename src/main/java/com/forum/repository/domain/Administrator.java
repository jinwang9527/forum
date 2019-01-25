package com.forum.repository.domain;

import java.util.Date;

public class Administrator {
    private Long pkAdministratorId;

    private String account;

    private String password;

    private Boolean isDel;

    private String salt;

    private Date createTime;

    private Date updateTime;

    public Long getPkAdministratorId() {
        return pkAdministratorId;
    }

    public void setPkAdministratorId(Long pkAdministratorId) {
        this.pkAdministratorId = pkAdministratorId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
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
}