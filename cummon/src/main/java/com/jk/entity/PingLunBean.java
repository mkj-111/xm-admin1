package com.jk.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lx_pinglun")
public class PingLunBean {
    @Id
    private String pinglunId;       //评论ID
    private String userName;        //评论者名称
    private String userImg;         //评论者头像
    private Integer status;         //评论状态

    private String createDate;      //评论时间
    private String info;            //评论信息
    private Integer dianzan;         //评论点赞数
    private String huifuId;         //回复ID
    private Integer goodsId;        //商品Id

    public String getPinglunId() {
        return pinglunId;
    }

    public void setPinglunId(String pinglunId) {
        this.pinglunId = pinglunId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getDianzan() {
        return dianzan;
    }

    public void setDianzan(Integer dianzan) {
        this.dianzan = dianzan;
    }

    public String getHuifuId() {
        return huifuId;
    }

    public void setHuifuId(String huifuId) {
        this.huifuId = huifuId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}
