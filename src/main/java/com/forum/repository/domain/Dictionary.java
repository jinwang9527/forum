package com.forum.repository.domain;

import java.util.Date;

public class Dictionary {
    private Long pkDictionaryId;

    private String tableName;

    private String fieldName;

    private Integer dictionaryValue;

    private String dictionaryText;

    private Date createTime;

    private Date updateTime;

    private Boolean isDel;

    public Long getPkDictionaryId() {
        return pkDictionaryId;
    }

    public void setPkDictionaryId(Long pkDictionaryId) {
        this.pkDictionaryId = pkDictionaryId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    public Integer getDictionaryValue() {
        return dictionaryValue;
    }

    public void setDictionaryValue(Integer dictionaryValue) {
        this.dictionaryValue = dictionaryValue;
    }

    public String getDictionaryText() {
        return dictionaryText;
    }

    public void setDictionaryText(String dictionaryText) {
        this.dictionaryText = dictionaryText == null ? null : dictionaryText.trim();
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