package com.tt.group3.service;

import com.github.pagehelper.Page;
import com.tt.group3.pojo.buyer;
import com.tt.group3.pojo.buygoods;
import com.tt.group3.pojo.goods;

import java.util.List;

public interface BuyerService {
    void doSign(String buyerName, String buyerPwd);
    List<buygoods> getGoods();
    List<buygoods> getGoods2();


    void doAddGoods(buygoods buygoods);


    Page<goods> findGoodsNoCriteria(int parseInt, int i, String commentNum);

    buyer selectBuyer();

    void buyerUp(buyer buyer);

    void deleteGood(Integer goodId);
   //通过Id查询
    buygoods selectById(Integer goodId);
   //修改
    void updateGood(buygoods buygoods);
   //通过ID查询买家
    buyer findBuyId(String buyerName);

    goods getGoodsById(Integer goodId);

    buygoods seaName(String goodName);
    //类型的获取
    List<buygoods> getGoodKind();



}
