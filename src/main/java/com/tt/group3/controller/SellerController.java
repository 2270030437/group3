package com.tt.group3.controller;

import com.tt.group3.pojo.buyer;
import com.tt.group3.pojo.goods;
import com.tt.group3.pojo.seller;
import com.tt.group3.service.SellerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/seller")
public class SellerController {
    @Resource
    private SellerService sellerService;

    //修改个人信息的请求
    @RequestMapping("/seller/{sellerId}")
    public String seller(@PathVariable Integer sellerId,Model model) {
        seller seller = sellerService.seller(sellerId);
        model.addAttribute("seller",seller);
        return "seller/selectByIdseller";
    }
    //修改个人信息的方法
    @RequestMapping("/updateseller/{sellerId}")
    public String updateseller(@PathVariable Integer sellerId, seller seller) {
        seller.setSellerId(sellerId);
        sellerService.updateseller(seller);
        return "ok";
    }
    @RequestMapping("/sellerIndex")
    public String sellerIndex(){
        return "sellerIndex";
    }


    @RequestMapping("/sellerById")
    public String sellerById(Model model){
        seller seller=sellerService.sellerByID(1);
        model.addAttribute("seller",seller);
        return "seller/sellerById";
    }
    //搜索
    @RequestMapping("/seaKind")
    public String seaName(@RequestParam String goodKind,Model model){
        List<goods> goods=sellerService.seaKind(goodKind);
        model.addAttribute("goods",goods);
        return "seller/getGoodsById";
    }


    //通过ID查询，显示在商品详情页
    @RequestMapping("/getGoodsById/{goodId}")
    public String getGoodsById(@PathVariable Integer goodId,Model model){
        goods goods=sellerService.getGoodsById(goodId);
        model.addAttribute("goods",goods);
        return "goods/xiangqing1";
    }


    @RequestMapping("/sellerByID")
    public String buyerById(Model model){
        seller seller=sellerService.sellerByID(1);
        model.addAttribute("seller",seller);
        return "seller/sellerByID2";
    }

}
