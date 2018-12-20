package com.tt.group3.dao;

import com.tt.group3.pojo.goods;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Repository
public interface goodsDao {
    @Select("select * from goods")
    List<goods> doselectGoodsAll();

    @Insert("INSERT INTO `goods`(`goodDate`,`sellerId`,`goodName`,`goodKind`,`goodUnit`,`goodCount`,`goodInfo`,`goodPrice`)VALUES(#{goodDate},#{sellerId},#{goodName},#{goodKind},#{goodUnit},#{goodCount},#{goodInfo},#{goodPrice})")
    int addGoods(goods goods);

    @Delete("delete from goods where goodId=#{goodId}")
    int deleteGood(Integer goodId);

    @Select("select * from goods where goodId=#{goodId}")
    goods selectGoodsById(Integer goodId);

    @Update("update  goods set goodName=#{goodName},goodKind=#{goodKind},goodUnit=#{goodUnit},goodCount=#{goodCount},goodInfo=#{goodInfo},goodPrice=#{goodPrice},goodPhoto=#{goodPhoto} WHERE goodId =#{goodId}")
    int updateGood(goods goods);
    @Select("select distinct(goodKind) from goods")
    List<goods> getGoodKind();
   @Select("select distinct(goodUnit) from goods")
    List<goods> getGoodUnit();
}
