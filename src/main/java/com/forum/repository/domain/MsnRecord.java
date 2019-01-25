package com.forum.repository.domain;

import java.util.Date;

public class MsnRecord {
    private Long pkMsnRecordId;

    private String title;

    private String content;

    private String note;

    private Long sender;

    private Long senderType;

    private Long receiver;

    private Integer receiverType;

    private Date createTime;

    private Date updateTime;

    private Boolean isDel;

    public Long getPkMsnRecordId() {
        return pkMsnRecordId;
    }

    public void setPkMsnRecordId(Long pkMsnRecordId) {
        this.pkMsnRecordId = pkMsnRecordId;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Long getSender() {
        return sender;
    }

    public void setSender(Long sender) {
        this.sender = sender;
    }

    public Long getSenderType() {
        return senderType;
    }

    public void setSenderType(Long senderType) {
        this.senderType = senderType;
    }

    public Long getReceiver() {
        return receiver;
    }

    public void setReceiver(Long receiver) {
        this.receiver = receiver;
    }

    public Integer getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(Integer receiverType) {
        this.receiverType = receiverType;
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