package com.jk.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "2004_aa", type = "type")
public class Goods {

    @Id   // 数据id 和 索引id 一致
    private Integer id;

    @Field( type = FieldType.Keyword, analyzer = "ik_synonym", store = true)
    private String goodsName;

    private String goodsStatus;

    private String goodsCaption;

    private Integer goodsVersionId;

    private Integer goodsTypeid;

    private String goodsImg;

    private String goodsColorId;

    private String goodsImgAll;

    private String goodsInfo;

    private Integer goodsNum;

    private Date goodsDate;

    private Integer goodsRemen;

    //价格
    private Long goodsPrice;

    public Long getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Long goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

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

    public Integer getGoodsVersionId() {
        return goodsVersionId;
    }

    public void setGoodsVersionId(Integer goodsVersionId) {
        this.goodsVersionId = goodsVersionId;
    }

    public Integer getGoodsTypeid() {
        return goodsTypeid;
    }

    public void setGoodsTypeid(Integer goodsTypeid) {
        this.goodsTypeid = goodsTypeid;
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

    public Integer getGoodsRemen() {
        return goodsRemen;
    }

    public void setGoodsRemen(Integer goodsRemen) {
        this.goodsRemen = goodsRemen;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", goodsStatus='" + goodsStatus + '\'' +
                ", goodsCaption='" + goodsCaption + '\'' +
                ", goodsVersionId=" + goodsVersionId +
                ", goodsTypeid=" + goodsTypeid +
                ", goodsImg='" + goodsImg + '\'' +
                ", goodsColorId='" + goodsColorId + '\'' +
                ", goodsImgAll='" + goodsImgAll + '\'' +
                ", goodsInfo='" + goodsInfo + '\'' +
                ", goodsNum=" + goodsNum +
                ", goodsDate=" + goodsDate +
                ", goodsRemen=" + goodsRemen +
                ", goodsPrice=" + goodsPrice +
                '}';
    }
}