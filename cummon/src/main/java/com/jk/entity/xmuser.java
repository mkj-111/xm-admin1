package com.jk.entity;

import lombok.Data;

@Data
public class xmuser {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userAccount;

    private Integer areaId;

    private String phone;

    private String userStatus;

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public String getPhone() {
        return phone;
    }

    public String getUserStatus() {
        return userStatus;
    }
}