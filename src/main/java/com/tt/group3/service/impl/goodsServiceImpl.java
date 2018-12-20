package com.tt.group3.service.impl;

import com.tt.group3.dao.goodsDao;
import com.tt.group3.pojo.goods;
import com.tt.group3.service.goodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class goodsServiceImpl implements goodsService {
    @Resource
    private goodsDao goodsDao;

    public List<goods> doselectGoodsAll() {
        return goodsDao.doselectGoodsAll();
    }

    public int addGoods(goods goods) {
        return goodsDao.addGoods(goods);
    }

    public int deleteGood(Integer goodId) {
        return goodsDao.deleteGood(goodId);
    }

    public goods selectGoodsById(Integer goodId) {
        return goodsDao.selectGoodsById(goodId);
    }

    @Override
    public int updateGood(goods goods) {
        return goodsDao.updateGood(goods);
    }

    @Override
    public List<goods> getGoodKind() {
        return goodsDao.getGoodKind();
    }

    @Override
    public List<goods> getGoodUnit() {
        return goodsDao.getGoodUnit();
    }
}
