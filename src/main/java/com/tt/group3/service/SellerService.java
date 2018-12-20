package com.tt.group3.service;

import com.tt.group3.pojo.goods;
import com.tt.group3.pojo.seller;

import java.util.List;

public interface SellerService {

    void doSign(seller seller);


    //卖家修改密码
    void updateseller(seller seller);

    //卖家登录
    seller select(String sellerName, String sellerPwd);
    seller sellerlogin(String sellerName, String sellerPwd);
    //根据ID查询出来信息
    seller sellerById(Integer sellerId);

    seller seller(Integer sellerId);

    seller sellerByID(int i);

    List<goods> seaKind(String goodKind);

    goods getGoodsById(Integer goodId);
}
