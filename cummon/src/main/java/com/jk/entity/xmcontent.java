package com.jk.entity;

import lombok.Data;

@Data
public class xmcontent {
    private Long id;

    private Long categoryId;

    private String contentTitle;

    private String contentUrl;

    private String contentPic;

    private String contentStatus;

    private Integer sortOrder;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle == null ? null : contentTitle.trim();
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl == null ? null : contentUrl.trim();
    }

    public String getContentPic() {
        return contentPic;
    }

    public void setContentPic(String contentPic) {
        this.contentPic = contentPic == null ? null : contentPic.trim();
    }

    public String getContentStatus() {
        return contentStatus;
    }

    public void setContentStatus(String contentStatus) {
        this.contentStatus = contentStatus == null ? null : contentStatus.trim();
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}