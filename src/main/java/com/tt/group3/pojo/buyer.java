package com.tt.group3.pojo;
/**
 *@作者：庞屿芃
 *@时间：2018/12/3 21:04
 *@描述：买家
*/
public class buyer {
    private Integer buyerId; //买家编号
    private String buyerName;//买家登录名
    private String buyerPwd;//买家密码
    private String buyerNo;//买家学号

    public String getBuyerNo() {
        return buyerNo;
    }

    public void setBuyerNo(String buyerNo) {
        this.buyerNo = buyerNo;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPwd() {
        return buyerPwd;
    }

    public void setBuyerPwd(String buyerPwd) {
        this.buyerPwd = buyerPwd;
    }

    public buyer() {
    }

    public buyer(Integer buyerId, String buyerName, String buyerPwd, String buyerNo) {
        this.buyerId = buyerId;
        this.buyerName = buyerName;
        this.buyerPwd = buyerPwd;
        this.buyerNo = buyerNo;
    }
}
