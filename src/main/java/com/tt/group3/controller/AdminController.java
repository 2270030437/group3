package com.tt.group3.controller;

import com.tt.group3.pojo.admin;
import com.tt.group3.pojo.buyer;
import com.tt.group3.pojo.seller;
import com.tt.group3.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("gadmin")
public class AdminController {
    @Resource
    private AdminService adminService;

    @RequestMapping("/login")
    public String login(){
        return "admin/Glogin";
    }
    @PostMapping("/doLogin")
    public String doLogin(@RequestParam String adminName, @RequestParam String adminPwd, Model model){
        admin admin=adminService.doLogin(adminName,adminPwd);
        model.addAttribute("admin",admin);
        if(admin!=null){
            return "admin/adminIndex";
        }
        return "forward:/login";
    }
    @RequestMapping("/getBuyer")
    public String getBuyer(Model model){
        List<buyer> buyer=adminService.getBuyer();
        model.addAttribute("buyer",buyer);
        return "admin/getBuyer";
    }
    @RequestMapping("/getSeller")
    public String getSeller(Model model){
        List<seller> seller=adminService.getSeller();
        model.addAttribute("seller",seller);
        return "admin/getSeller";
    }
    //删除买家
    @RequestMapping("/deleteBuyer/{buyerId}")
    public String deleteBuyer(@PathVariable Integer buyerId){
        adminService.deleteBuyer(buyerId);
        return "forward:/gadmin/getBuyer";
    }

}
