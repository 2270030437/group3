package com.tt.group3.service;

import com.tt.group3.pojo.admin;
import com.tt.group3.pojo.buyer;
import com.tt.group3.pojo.seller;

import java.util.List;

public interface AdminService {
    //管理员登陆
    admin doLogin(String adminName, String adminPwd);

    List<buyer> getBuyer();

    List<seller> getSeller();
  //删除买家
    void deleteBuyer(Integer buyerId);
}
