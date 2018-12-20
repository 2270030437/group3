package com.tt.group3.service;

import com.tt.group3.pojo.goods;

import java.util.List;

public interface goodsService {
    List<goods> doselectGoodsAll();

    int addGoods(goods goods);

    int deleteGood(Integer goodId);

    goods selectGoodsById(Integer goodId);

    int updateGood(goods goods);
   //类型的获取
    List<goods> getGoodKind();
   //单位的获取
    List<goods> getGoodUnit();
}
