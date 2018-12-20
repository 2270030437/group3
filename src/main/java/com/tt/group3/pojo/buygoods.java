package com.tt.group3.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class buygoods implements Serializable {
    private Integer goodId;//商品编号
    private String goodName;//商品名称
    private String goodKind;//商品分类
    private double goodCount;//商品数量
    private String goodInfo;//商品信息/留言
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date goodDate;


    public Date getGoodDate() {
        return goodDate;
    }

    public void setGoodDate(Date goodDate) {
        this.goodDate = goodDate;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
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


    public double getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(double goodCount) {
        this.goodCount = goodCount;
    }

    public String getGoodInfo() {
        return goodInfo;
    }

    public void setGoodInfo(String goodInfo) {
        this.goodInfo = goodInfo;
    }

    public buygoods() {
    }

    public buygoods(Date goodDate,Integer goodId, String goodName, String goodKind, double goodCount, String goodInfo) {
        this.goodDate=goodDate;
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodKind = goodKind;
        this.goodCount = goodCount;
        this.goodInfo = goodInfo;
    }
}
