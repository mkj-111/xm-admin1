package com.jk.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lx_huifu")
public class HuiFuBean {
    @Id
    private String huifuId;     //回复Id
    private String huifuName;   //回复者名称
    private String huifuImg;    //回复者头像
    private String huifuInfo;   //回复信息
    private Integer huifuCount;  //回复点赞数
    private String pinglunId;   //评论ID

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public String getHuifuName() {
        return huifuName;
    }

    public void setHuifuName(String huifuName) {
        this.huifuName = huifuName;
    }

    public String getHuifuImg() {
        return huifuImg;
    }

    public void setHuifuImg(String huifuImg) {
        this.huifuImg = huifuImg;
    }

    public String getHuifuInfo() {
        return huifuInfo;
    }

    public void setHuifuInfo(String huifuInfo) {
        this.huifuInfo = huifuInfo;
    }

    public Integer getHuifuCount() {
        return huifuCount;
    }

    public void setHuifuCount(Integer huifuCount) {
        this.huifuCount = huifuCount;
    }

    public String getPinglunId() {
        return pinglunId;
    }

    public void setPinglunId(String pinglunId) {
        this.pinglunId = pinglunId;
    }
}
