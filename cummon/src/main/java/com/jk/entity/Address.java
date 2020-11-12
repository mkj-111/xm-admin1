package com.jk.entity;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "t_address")
public class Address {

    private String id;
    private String name;
    private String phone;
    private String sheng;
    private String shi;
    private String xian;
    private String info;
    private Integer userId;

    @Transient
    private String shengId;
    @Transient
    private String shiId;
    @Transient
    private String xianId;

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShengId() {
        return shengId;
    }

    public void setShengId(String shengId) {
        this.shengId = shengId;
    }

    public String getShiId() {
        return shiId;
    }

    public void setShiId(String shiId) {
        this.shiId = shiId;
    }

    public String getXianId() {
        return xianId;
    }

    public void setXianId(String xianId) {
        this.xianId = xianId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
