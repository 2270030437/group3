package com.tt.group3.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 *@作者：庞屿芃
 *@时间：2018/12/3 21:05
 *@描述：商品
*/
public class goods {
    private Integer goodId;//商品编号
    private String sellerId;//卖家编号
    private String goodName;//商品名称
    private String goodKind;//商品分类
    private String goodUnit;//商品单位
    private String goodCount;//商品数量
    private String goodInfo;//商品信息/留言
    private double goodPrice; //商品单价
    private String goodPhoto; //商品照片
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date goodDate;//商品生产日期


    public Date getGoodDate() {
        return goodDate;
    }

    public void setGoodDate(Date goodDate) {
        this.goodDate = goodDate;
    }

    public String getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(String goodCount) {
        this.goodCount = goodCount;
    }

    public String getGoodPhoto() {
        return goodPhoto;
    }

    public void setGoodPhoto(String goodPhoto) {
        this.goodPhoto = goodPhoto;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodKind() {
        return goodKind;
    }

    public void setGoodKind(String goodKind) {
        this.goodKind = goodKind;
    }

    public String getGoodUnit() {
        return goodUnit;
    }

    public void setGoodUnit(String goodUnit) {
        this.goodUnit = goodUnit;
    }

    public String getGoodInfo() {
        return goodInfo;
    }

    public void setGoodInfo(String goodInfo) {
        this.goodInfo = goodInfo;
    }

    public goods() {
    }

    public goods(Date goodDate,Integer goodId, String sellerId, String goodName, String goodKind, String goodUnit, String goodCount, String goodInfo, double goodPrice, String goodPhoto) {
        this.goodDate=goodDate;
        this.goodId = goodId;
        this.sellerId = sellerId;
        this.goodName = goodName;
        this.goodKind = goodKind;
        this.goodUnit = goodUnit;
        this.goodCount = goodCount;
        this.goodInfo = goodInfo;
        this.goodPrice = goodPrice;
        this.goodPhoto = goodPhoto;
    }
}
