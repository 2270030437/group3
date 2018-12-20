package com.tt.group3.service.impl;

import com.tt.group3.dao.loginDao;
import com.tt.group3.pojo.buyer;
import com.tt.group3.pojo.seller;
import com.tt.group3.service.loginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class loginServiceImpl implements loginService {
    @Resource
    private loginDao loginDao;

    public buyer doLoginB(String buyerName, String buyerPwd) {
        return loginDao.doLoginB(buyerName,buyerPwd);
    }

    public seller doLoginS(String sellerName, String sellerPwd) {
        return loginDao.doLoginS(sellerName,sellerPwd);
    }

    public seller select(String sellerName, String sellerPwd) {
        return loginDao.select(sellerName, sellerPwd);
    }

    public int doSign(seller seller) {
        return loginDao.doSign(seller);
    }

    public int doSignS(buyer buyer) {
        return loginDao.doSignS(buyer);
    }
}
