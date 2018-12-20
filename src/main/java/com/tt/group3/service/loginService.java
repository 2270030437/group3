package com.tt.group3.service;

import com.tt.group3.pojo.buyer;
import com.tt.group3.pojo.seller;

public interface loginService {
    buyer doLoginB(String buyerName, String buyerPwd);

    seller doLoginS(String sellerName, String sellerPwd);

    seller select(String sellerName, String sellerPwd);

    int doSign(seller seller);

    int doSignS(buyer buyer);
}
