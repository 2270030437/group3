package com.tt.group3.dao;

import com.tt.group3.pojo.buyer;
import com.tt.group3.pojo.seller;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface loginDao {
    @Select("select * from buyer where buyerName=#{buyerName} and buyerPwd=#{buyerPwd}")
    buyer doLoginB(@Param("buyerName") String buyerName, @Param("buyerPwd") String buyerPwd);
    @Select("select * from seller where sellerName=#{sellerName} and sellerPwd=#{sellerPwd}")
    seller doLoginS(@Param("sellerName") String sellerName,@Param("sellerPwd") String sellerPwd);
    @Select("select * from seller where sellerName = #{sellerName} and sellerPwd = #{sellerPwd}")
    seller select(@Param("sellerName") String sellerName, @Param("sellerPwd") String sellerPwd);
    @Insert("insert into seller(sellerNo,sellerName,sellerPwd,sellerPhone,path,sellerBuild,sellerBuildNo,sellerSex) values(#{sellerNo},#{sellerName},#{sellerPwd},#{sellerPhone},#{path},#{sellerBuild},#{sellerBuildNo},#{sellerSex})")
    int doSign(seller seller);
    @Insert("insert into buyer(buyerName,buyerPwd,buyerNo) values(#{buyerName},#{buyerPwd},#{buyerNo})")
    int doSignS(buyer buyer);
}
