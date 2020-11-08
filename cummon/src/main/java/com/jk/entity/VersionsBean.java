package com.jk.entity;

public class VersionsBean {
    private Integer versionsId;

    private String versionName;

    private String colorId;

    private Long goodsPrice;

    public Integer getVersionsId() {
        return versionsId;
    }

    public void setVersionsId(Integer versionsId) {
        this.versionsId = versionsId;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName == null ? null : versionName.trim();
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId == null ? null : colorId.trim();
    }

    public Long getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Long goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}