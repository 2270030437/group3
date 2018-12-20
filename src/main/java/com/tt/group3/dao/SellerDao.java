package com.tt.group3.dao;

import com.tt.group3.pojo.goods;
import com.tt.group3.pojo.seller;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SellerDao {
    @Insert("insert into seller(sellerNo,sellerPwd,path,sellerName) values(#{sellerNo},#{sellerPwd},#{path},#{sellerName})")
    void doSign(seller seller);

    @Select("select * from seller where sellerName=#{sellerName} and sellerPwd=#{sellerPwd}")
    seller sellerlogin(String sellerName, String sellerPwd);

    //卖家修改个人信息
    @Update("update seller set sellerName=#{sellerName},sellerPwd=#{sellerPwd} where sellerId=#{sellerId}")
    void updateseller(seller seller);

    //登录
    @Select("select * from seller where sellerName = #{sellerName} and sellerPwd = #{sellerPwd}")
    seller select(@Param("sellerName") String sellerName, @Param("sellerPwd") String sellerPwd);
    //根据ID查询出来信息
    @Select("select * from seller where sellerId=#{sellerId}")
    seller sellerById(Integer sellerId);
    @Select("select * from seller where sellerId=#{sellerId}")
    seller seller(Integer sellerId);
    @Select("select * from seller where sellerId=#{sellerId}")
    seller sellerByID(int sellerId);
    @Select("select * from goods where goodKind like CONCAT('%',#{goodKind},'%')")
    List<goods> seaKind(String goodKind);
    @Select("select * from goods where goodId=#{goodId}")
    goods getGoodsById(Integer goodId);
}
