package com.jk.entity;

import java.math.BigDecimal;

public class Cart {

    private Long productId;

    private String fullName;

    private String specificationValueIds;

    private String specificationValueNames;

    private Integer number;

    private String image;

    private BigDecimal price;


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSpecificationValueIds() {
        return specificationValueIds;
    }

    public void setSpecificationValueIds(String specificationValueIds) {
        this.specificationValueIds = specificationValueIds;
    }

    public String getSpecificationValueNames() {
        return specificationValueNames;
    }

    public void setSpecificationValueNames(String specificationValueNames) {
        this.specificationValueNames = specificationValueNames;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "productId=" + productId +
                ", fullName='" + fullName + '\'' +
                ", specificationValueIds='" + specificationValueIds + '\'' +
                ", specificationValueNames='" + specificationValueNames + '\'' +
                ", number=" + number +
                ", image='" + image + '\'' +
                ", price=" + price +
                '}';
    }
}
