package com.tt.group3.service.impl;

import com.tt.group3.dao.SellerDao;
import com.tt.group3.pojo.goods;
import com.tt.group3.pojo.seller;
import com.tt.group3.service.SellerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SellerServiceImpl implements SellerService {
    @Resource
    private SellerDao sellerDao;

    @Override
    public void doSign(seller seller) {
        sellerDao.doSign(seller);
    }

    @Override
    public seller sellerlogin(String sellerName, String sellerPwd) {
        return sellerDao.sellerlogin(sellerName,sellerPwd);
    }

    //根据ID查询出来信息
    public seller sellerById(Integer sellerId) {
        return sellerDao.sellerById(sellerId);
    }

    @Override
    public seller seller(Integer sellerId) {
        return sellerDao.seller(sellerId);
    }

    @Override
    public seller sellerByID(int i) {
        return sellerDao.sellerByID(i);
    }

    @Override
    public List<goods> seaKind(String goodKind) {
        return sellerDao.seaKind(goodKind);
    }

    @Override
    public goods getGoodsById(Integer goodId) {
        return sellerDao.getGoodsById(goodId);
    }

    //卖家修改个人信息
    public void updateseller(seller seller) {
        sellerDao.updateseller(seller);
    }

    public seller select(String sellerName, String sellerPwd) {
        return sellerDao.select(sellerName,sellerPwd);
    }


}
