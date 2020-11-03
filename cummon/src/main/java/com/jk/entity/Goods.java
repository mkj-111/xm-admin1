package com.jk.entity;

public class Goods {
    private Integer id;

    private String goodsName;

    private String goodsStatus;

    private String goodsCaption;

    private Integer goodsTypeId;

    private String goodsImg;

    private String goodsColorId;

    private String goodsVersionsId;

    private String goodsImgAll;

    private String goodsInfo;

    private Integer goodsPriceId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus == null ? null : goodsStatus.trim();
    }

    public String getGoodsCaption() {
        return goodsCaption;
    }

    public void setGoodsCaption(String goodsCaption) {
        this.goodsCaption = goodsCaption == null ? null : goodsCaption.trim();
    }

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

    public String getGoodsColorId() {
        return goodsColorId;
    }

    public void setGoodsColorId(String goodsColorId) {
        this.goodsColorId = goodsColorId == null ? null : goodsColorId.trim();
    }

    public String getGoodsVersionsId() {
        return goodsVersionsId;
    }

    public void setGoodsVersionsId(String goodsVersionsId) {
        this.goodsVersionsId = goodsVersionsId == null ? null : goodsVersionsId.trim();
    }

    public String getGoodsImgAll() {
        return goodsImgAll;
    }

    public void setGoodsImgAll(String goodsImgAll) {
        this.goodsImgAll = goodsImgAll == null ? null : goodsImgAll.trim();
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo == null ? null : goodsInfo.trim();
    }

    public Integer getGoodsPriceId() {
        return goodsPriceId;
    }

    public void setGoodsPriceId(Integer goodsPriceId) {
        this.goodsPriceId = goodsPriceId;
    }
}