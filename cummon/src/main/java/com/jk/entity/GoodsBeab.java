package com.jk.entity;

import lombok.Data;

@Data
public class GoodsBeab {
    private Integer id;
    private String goodsname;
    private String goodsstatus;
    private String goodscaption;
    private Integer goodstypeid;
    private String goodsimg;
    private String goodscolorid;
    private String goodsimgall;
    private String goodsinfo;
    private Integer goodsnum;
    private String goodsdate;

    //业务字段
    private String versionname;
    private Double goodsprice;
    private String colorname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsstatus() {
        return goodsstatus;
    }

    public void setGoodsstatus(String goodsstatus) {
        this.goodsstatus = goodsstatus;
    }

    public String getGoodscaption() {
        return goodscaption;
    }

    public void setGoodscaption(String goodscaption) {
        this.goodscaption = goodscaption;
    }

    public Integer getGoodstypeid() {
        return goodstypeid;
    }

    public void setGoodstypeid(Integer goodstypeid) {
        this.goodstypeid = goodstypeid;
    }

    public String getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg;
    }

    public String getGoodscolorid() {
        return goodscolorid;
    }

    public void setGoodscolorid(String goodscolorid) {
        this.goodscolorid = goodscolorid;
    }

    public String getGoodsimgall() {
        return goodsimgall;
    }

    public void setGoodsimgall(String goodsimgall) {
        this.goodsimgall = goodsimgall;
    }

    public String getGoodsinfo() {
        return goodsinfo;
    }

    public void setGoodsinfo(String goodsinfo) {
        this.goodsinfo = goodsinfo;
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public String getGoodsdate() {
        return goodsdate;
    }

    public void setGoodsdate(String goodsdate) {
        this.goodsdate = goodsdate;
    }

    public String getVersionname() {
        return versionname;
    }

    public void setVersionname(String versionname) {
        this.versionname = versionname;
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getColorname() {
        return colorname;
    }

    public void setColorname(String colorname) {
        this.colorname = colorname;
    }
}
