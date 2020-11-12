package com.jk.entity;

import java.math.BigDecimal;

public class OrderGoods {

    private Integer id;  // 主键id
    private Integer userId;  // 用户id
    private String orderNum;  // 订单编号
    private BigDecimal orderSumPrice; // 订单总价 1
    private Integer orderStatus;//  1. 未付款  2. 待发货  3. 已发货  4. 已签收  4.1 确认收货 4.2 7天自动收货  5.待评价 5.1 评价 5.2 3天  6. 已完成
    private String receivingAddress; // 收货地址  1
    private String receivingTelephone; // 联系电话 1
    private String consignee;  // 收货人 1
    private String createTime;  // 订单创建时间
    private String serialNumber; // 交易号 / 流水号
    private String payType;  // 支付方式
    private String paymentTime; // 支付时间
    private String ordergoodsName;//商品名称
    private String goodsId;
    private String goodsNum;

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getOrdergoodsName() {
        return ordergoodsName;
    }

    public void setOrdergoodsName(String ordergoodsName) {
        this.ordergoodsName = ordergoodsName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public BigDecimal getOrderSumPrice() {
        return orderSumPrice;
    }

    public void setOrderSumPrice(BigDecimal orderSumPrice) {
        this.orderSumPrice = orderSumPrice;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getReceivingAddress() {
        return receivingAddress;
    }

    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    public String getReceivingTelephone() {
        return receivingTelephone;
    }

    public void setReceivingTelephone(String receivingTelephone) {
        this.receivingTelephone = receivingTelephone;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }
}
