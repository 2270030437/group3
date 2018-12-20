package com.tt.group3.service.impl;

import com.github.pagehelper.Page;
import com.tt.group3.dao.BuyerDao;
import com.tt.group3.pojo.buyer;
import com.tt.group3.pojo.buygoods;
import com.tt.group3.pojo.goods;
import com.tt.group3.service.BuyerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BuyerServiceImpl implements BuyerService {
    @Resource
    private BuyerDao buyerDao;

    @Override
    public void doSign(String buyerName, String buyerPwd) {
        buyerDao.doSign(buyerName,buyerPwd);
    }

    @Override
    public List<buygoods> getGoods() {
        return buyerDao.getGoods();
    }

    @Override
    public List<buygoods> getGoods2() {
        return buyerDao.getGoods2();
    }
    @Override
    public void doAddGoods(buygoods buygoods) {
        buyerDao.doAddGoods(buygoods);
    }

    @Override
    public Page<goods> findGoodsNoCriteria(int parseInt, int i, String commentNum) {
        return buyerDao.findGoodsNoCriteria(parseInt,i,commentNum);
    }

    @Override
    public buyer selectBuyer() {
        return buyerDao.selectBuyer();
    }

    @Override
    public void buyerUp(buyer buyer) {
        buyerDao.buyerUp(buyer);
    }

    @Override
    public void deleteGood(Integer goodId) {
        buyerDao.deleteGood(goodId);
    }

    @Override
    public buygoods selectById(Integer goodId) {
        return buyerDao.selectById(goodId);
    }

    @Override
    public void updateGood(buygoods buygoods) {
        buyerDao.updateGood(buygoods);
    }

    @Override
    public buyer findBuyId(String buyerName) {
        return buyerDao.findBuyId(buyerName);
    }

    @Override
    public goods getGoodsById(Integer goodId) {
        return buyerDao.getGoodsById(goodId);
    }

    @Override
    public buygoods seaName(String goodName) {
        return buyerDao.seaName(goodName);
    }

    //类型的获取
    public List<buygoods> getGoodKind() {
        return buyerDao.getGoodKind();
    }

    public buygoods seaKind(String goodKind) {
        return buyerDao.seaKind(goodKind);
    }
}
