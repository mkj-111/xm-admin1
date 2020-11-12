package com.jk.entity;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {
    private Integer id;

    private String goodsName;

    private String goodsStatus;

    private String goodsCaption;

    private Integer goodsVersionId;

    private String goodsImg;

    private String goodsColorId;

    private String goodsImgAll;

    private String goodsInfo;

    private Integer goodsNum;

    private Date goodsDate;

    //价格
    private Long goodsPrice;

    private String colorByName;

    private String verisonByName;

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
        this.goodsName = goodsName;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsCaption() {
        return goodsCaption;
    }

    public void setGoodsCaption(String goodsCaption) {
        this.goodsCaption = goodsCaption;
    }

    public Integer getGoodsVersionId() {
        return goodsVersionId;
    }

    public void setGoodsVersionId(Integer goodsVersionId) {
        this.goodsVersionId = goodsVersionId;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsColorId() {
        return goodsColorId;
    }

    public void setGoodsColorId(String goodsColorId) {
        this.goodsColorId = goodsColorId;
    }

    public String getGoodsImgAll() {
        return goodsImgAll;
    }

    public void setGoodsImgAll(String goodsImgAll) {
        this.goodsImgAll = goodsImgAll;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Date getGoodsDate() {
        return goodsDate;
    }

    public void setGoodsDate(Date goodsDate) {
        this.goodsDate = goodsDate;
    }

    public Long getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Long goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getColorByName() {
        return colorByName;
    }

    public void setColorByName(String colorByName) {
        this.colorByName = colorByName;
    }

    public String getVerisonByName() {
        return verisonByName;
    }

    public void setVerisonByName(String verisonByName) {
        this.verisonByName = verisonByName;
    }


    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", goodsStatus='" + goodsStatus + '\'' +
                ", goodsCaption='" + goodsCaption + '\'' +
                ", goodsVersionId=" + goodsVersionId +
                ", goodsImg='" + goodsImg + '\'' +
                ", goodsColorId='" + goodsColorId + '\'' +
                ", goodsImgAll='" + goodsImgAll + '\'' +
                ", goodsInfo='" + goodsInfo + '\'' +
                ", goodsNum=" + goodsNum +
                ", goodsDate=" + goodsDate +
                ", goodsPrice=" + goodsPrice +
                ", colorByName='" + colorByName + '\'' +
                ", verisonByName='" + verisonByName + '\'' +
                '}';
    }
}