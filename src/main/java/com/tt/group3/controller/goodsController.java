package com.tt.group3.controller;

import com.tt.group3.pojo.goods;
import com.tt.group3.pojo.seller;
import com.tt.group3.service.SellerService;
import com.tt.group3.service.goodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 *@作者：庞屿芃
 *@时间：2018/12/5 10:15
 *@描述：商品的控制器
*/
@Controller
@RequestMapping("/goods")
public class goodsController {
    @Resource
    private goodsService goodsService;
    @Resource
    private SellerService sellerService;

    @RequestMapping("/index")
    public String index(Model model) {
        List<goods> list = goodsService.doselectGoodsAll();
        model.addAttribute("list",list);
        return "index";
    }

    @RequestMapping(value = "/doselectGoodsAll")
    public Object doselectGoodsAll(Model model) {
        List<goods> list = goodsService.doselectGoodsAll();
        model.addAttribute("list",list);
        return "seller/doselectGoodsAll";
    }

    @RequestMapping(value = "/doselectGoodsAll1")
    public Object doselectGoodsAll1(Model model) {
        List<goods> list = goodsService.doselectGoodsAll();
        model.addAttribute("list",list);
        return "buyer/doselectGoodsAll";
    }


    @RequestMapping(value = "/doselectGoodsById")
    public Object doselectGoodsById(Model model) {
        List<goods> list = goodsService.doselectGoodsAll();
        model.addAttribute("list",list);
        return "seller/doselectGoodsById";
    }
    @RequestMapping("/aGoods/{sellerId}")
    public String aGoods(@PathVariable Integer sellerId,Model model) {
        seller seller = sellerService.seller(sellerId);
        model.addAttribute("seller",seller);
        List<goods> list = goodsService.getGoodKind();
        model.addAttribute("goods1",list);
        List<goods> list2 = goodsService.getGoodUnit();
        model.addAttribute("goods2",list2);
        return "/seller/addGoods";
    }
    @RequestMapping("/addGoods")
    public String addGoods(@ModelAttribute goods goods,Model model){
        int resule = goodsService.addGoods(goods);
        if (resule>0){
            return "forward:/goods/doselectGoodsById";
        }else {
            return "";
        }
    }

    @RequestMapping("/deleteGood/{goodId}")
    public String deleteGood(@PathVariable Integer goodId) {
        int result = goodsService.deleteGood(goodId);
        return "forward:/goods/doselectGoodsAll";
    }

    @RequestMapping("/selectById/{goodId}")
    public String selectById(@PathVariable Integer goodId,Model model) {
        goods goods = goodsService.selectGoodsById(goodId);
        model.addAttribute("goods",goods);
        return "seller/selectById";
    }

    @RequestMapping("/updateGood/{goodId}")
    public String updateGood(@PathVariable Integer goodId,Model model,goods goods) {
        goods.setGoodId(goodId);
        int result = goodsService.updateGood(goods);
        return "forward:/goods/doselectGoodsAll";
    }
}
