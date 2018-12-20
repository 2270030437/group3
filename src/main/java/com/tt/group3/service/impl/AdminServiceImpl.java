package com.tt.group3.service.impl;

import com.tt.group3.dao.AdminDao;
import com.tt.group3.pojo.admin;
import com.tt.group3.pojo.buyer;
import com.tt.group3.pojo.seller;
import com.tt.group3.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDao adminDao;

    @Override
    public admin doLogin(String adminName, String adminPwd) {
        return adminDao.doLogin(adminName,adminPwd);
    }

    @Override
    public List<buyer>  getBuyer() {
        return adminDao.getBuyer();
    }

    @Override
    public List<seller> getSeller() {
        return adminDao.getSeller();
    }

    @Override
    public void deleteBuyer(Integer buyerId) {
         adminDao.deleteBuyer(buyerId);
    }
}
