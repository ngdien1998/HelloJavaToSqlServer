package com.dien.testsqlserverjre10.models;

public class Category {

    private int categoryId;
    private String categoryName;
    private int orderNo;
    private String status;

    public Category() {
    }

    public Category(int categoryId, String categoryName, int orderNo, String status) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.orderNo = orderNo;
        this.status = status;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
