package com.forum.repository.domain;

import java.util.Date;

public class User {
    private Long pkUserId;

    private String account;

    private String name;

    private String password;

    private Boolean sex;

    private String headerImage;

    private String nickName;

    private String qq;

    private String phone;

    private Date birthday;

    private Integer totalTotal;

    private Integer dynamicTotal;

    private Boolean isTourist;

    private Boolean isDel;

    private Date createTime;

    private Date updateTime;

    public Long getPkUserId() {
        return pkUserId;
    }

    public void setPkUserId(Long pkUserId) {
        this.pkUserId = pkUserId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage == null ? null : headerImage.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getTotalTotal() {
        return totalTotal;
    }

    public void setTotalTotal(Integer totalTotal) {
        this.totalTotal = totalTotal;
    }

    public Integer getDynamicTotal() {
        return dynamicTotal;
    }

    public void setDynamicTotal(Integer dynamicTotal) {
        this.dynamicTotal = dynamicTotal;
    }

    public Boolean getIsTourist() {
        return isTourist;
    }

    public void setIsTourist(Boolean isTourist) {
        this.isTourist = isTourist;
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
}