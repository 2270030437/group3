package com.tt.group3.dao;

import com.github.pagehelper.Page;
import com.tt.group3.pojo.buyer;
import com.tt.group3.pojo.buygoods;
import com.tt.group3.pojo.goods;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BuyerDao {
    @Insert("insert into buyer(buyerName,buyerPwd) values(#{buyerName},#{buyerPwd})")
    void doSign(@Param("buyerName") String buyerName, @Param("buyerPwd") String buyerPwd);
    @Select("select * from buygoods")
    List<buygoods> getGoods();
    @Select("select goodName from buygoods")
    List<buygoods> getGoods2();
     @Insert("insert into buygoods(goodDate,goodId,goodName,goodKind,goodCount,goodInfo) values(#{goodDate, jdbcType=DATE},#{goodId},#{goodName},#{goodKind},#{goodCount},#{goodInfo})")
    void doAddGoods(buygoods buygoods);
    @Select("select * from goods order by goodsId desc limit #{parseInt},#{i}")
    Page<goods> findGoodsNoCriteria(@Param("parseInt") int parseInt, @Param("i") int i, @Param("commentNum") String commentNum);
    @Select("select * from buyer")
    buyer selectBuyer();
    @Update("UPDATE `group3`.`buyer` SET `buyerPwd`=#{buyerPwd} WHERE `buyerId`=#{buyerId}")
    void buyerUp(buyer buyer);
    @Delete("delete from buygoods where goodId=#{goodId}")
    void deleteGood(Integer goodId);
    @Select("select * from buygoods where goodId=#{goodId}")
    buygoods selectById(Integer goodId);
    @Select("select * from buyer where buyerName=#{buyerName}")
    buyer findBuyId(String buyerName);
    @Update("update buygoods set goodName=#{goodName},goodKind=#{goodKind},goodCount=#{goodCount},goodInfo=#{goodInfo} where goodId=#{goodId}")
    void updateGood(buygoods buygoods);
    //商品详情

    @Select("select * from goods where goodId=#{goodId}")
    goods getGoodsById(Integer goodId);
    @Select("select * from buygoods where goodName like CONCAT('%',#{goodName},'%')")
    buygoods seaName(String goodName);
    @Select("select * from buygoods  where goodKind=#{goodKind}")
    buygoods seaKind(String goodKind);
    @Select("select distinct(goodKind) from `buygoods`")
    List<buygoods> getGoodKind();
}
