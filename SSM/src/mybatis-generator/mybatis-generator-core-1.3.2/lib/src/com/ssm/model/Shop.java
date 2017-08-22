package com.ssm.model;

public class Shop {
    private Integer id;

    private String shopName;

    private String shopValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopValue() {
        return shopValue;
    }

    public void setShopValue(String shopValue) {
        this.shopValue = shopValue == null ? null : shopValue.trim();
    }
}