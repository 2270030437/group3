package com.tt.group3.pojo;

import org.springframework.web.multipart.MultipartFile;

/**
 *@作者：庞屿芃
 *@时间：2018/12/3 20:56
 *@描述：卖家
*/
public class seller {
    private Integer sellerId;//卖家编号
    private String sellerName;//卖家登录名
    private String sellerPwd;//卖家密码
    private String sellerNo;//卖家学号
    private MultipartFile sellerphoto;//'卖家学生证照片',
    private Integer sellerBuild;//卖家宿舍楼号',
    private Integer sellerBuildNo;//卖家宿舍号',
    private String sellerSex;//性别',
    private String sellerPhone;//卖家手机号',
    private String path;//路径

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerPwd() {
        return sellerPwd;
    }

    public void setSellerPwd(String sellerPwd) {
        this.sellerPwd = sellerPwd;
    }

    public String getSellerNo() {
        return sellerNo;
    }

    public void setSellerNo(String sellerNo) {
        this.sellerNo = sellerNo;
    }

    public MultipartFile getSellerphoto() {
        return sellerphoto;
    }

    public void setSellerphoto(MultipartFile sellerphoto) {
        this.sellerphoto = sellerphoto;
    }

    public Integer getSellerBuild() {
        return sellerBuild;
    }

    public void setSellerBuild(Integer sellerBuild) {
        this.sellerBuild = sellerBuild;
    }

    public Integer getSellerBuildNo() {
        return sellerBuildNo;
    }

    public void setSellerBuildNo(Integer sellerBuildNo) {
        this.sellerBuildNo = sellerBuildNo;
    }

    public String getSellerSex() {
        return sellerSex;
    }

    public void setSellerSex(String sellerSex) {
        this.sellerSex = sellerSex;
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public seller(Integer sellerId, String sellerName, String sellerPwd, String sellerNo, MultipartFile sellerphoto, Integer sellerBuild, Integer sellerBuildNo, String sellerSex, String sellerPhone, String path) {
        this.sellerId = sellerId;
        this.sellerName = sellerName;
        this.sellerPwd = sellerPwd;
        this.sellerNo = sellerNo;
        this.sellerphoto = sellerphoto;
        this.sellerBuild = sellerBuild;
        this.sellerBuildNo = sellerBuildNo;
        this.sellerSex = sellerSex;
        this.sellerPhone = sellerPhone;
        this.path = path;
    }

    public seller() {
    }
}
