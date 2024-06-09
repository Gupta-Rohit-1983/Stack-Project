package com.stack.project;

public class MobileEntity {

    private int serialNumber;
    private String brandName;
    private String os;
    private int price;


    public MobileEntity() {
    }


    public MobileEntity(int serialNumber, String brandName, String os, int price) {
        this.serialNumber = serialNumber;
        this.brandName = brandName;
        this.os = os;
        this.price = price;
    }


    public int getSerialNumber() {
        return serialNumber;
    }


    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }


    public String getBrandName() {
        return brandName;
    }


    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    public String getOs() {
        return os;
    }


    public void setOs(String os) {
        this.os = os;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "MobileEntity [serialNumber=" + serialNumber + ", brandName=" + brandName + ", os=" + os + ", price="
                + price + "]";
    }


}
