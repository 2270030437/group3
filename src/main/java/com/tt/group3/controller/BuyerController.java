package com.tt.group3.controller;

import com.tt.group3.pojo.buyer;
import com.tt.group3.pojo.buygoods;
import com.tt.group3.pojo.goods;
import com.tt.group3.service.BuyerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/buyer")
public class BuyerController {
    @Resource
    private BuyerService buyerService;

    @RequestMapping("/sign")
    public String sign() {
        return "buyer/sign";
    }

    @RequestMapping("/good")
    public String good(Model model,@RequestParam Integer goodId) {
        goods goods=buyerService.getGoodsById(goodId);
        model.addAttribute("goods",goods);
        return "buyer/good";
    }
    @PostMapping("/doSign")
    public String doSign(String buyerName, String buyerPwd) {
        buyerService.doSign(buyerName, buyerPwd);
        return "forward:/buyer/login";
    }

    @RequestMapping("/getGoods")
    public String getGoods(Model model, HttpSession session) {
        List<buygoods> list = buyerService.getGoods();
        model.addAttribute("list", list);
        List<buygoods> list2 = buyerService.getGoods2();
        session.setAttribute("list2", list2);
        return "buyer/buyerGoods";
    }
    //bootstrapTable
    @RequestMapping(value = "/getGoodsList",method = RequestMethod.GET)
    @ResponseBody
    public Object getGoodsList(){
        List<buygoods> list = buyerService.getGoods();
        return list;
    }

    @RequestMapping("/getGoods1")
    public String getGoods1(Model model, HttpSession session) {
        List<buygoods> list = buyerService.getGoods();
        model.addAttribute("list", list);
        List<buygoods> list2 = buyerService.getGoods2();
        session.setAttribute("list2", list2);
        return "seller/getGoods";
    }
    @RequestMapping("/addGoods")
    public String addGoods(Model model) {
        List<buygoods> buygoods=buyerService.getGoodKind();
        model.addAttribute("buygoods",buygoods);
        return "buyer/addGoods";
    }

    @RequestMapping("/doAddGoods")
    public String doAddGoods(@ModelAttribute buygoods buygoods, BindingResult bindingResult) {
        buyerService.doAddGoods(buygoods);
        return "forward:/buyer/getGoods";
    }
    @RequestMapping("/deleteGood/{goodId}")
     public String deleteGood(@PathVariable Integer goodId){
        buyerService.deleteGood(goodId);
        return "forward:/buyer/getGoods";
     }
    //根据ID查找
    @RequestMapping("/selectById/{goodId}")
    public ModelAndView selectById(@PathVariable Integer goodId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("buyer/selectById");
        buygoods buygoods = buyerService.selectById(goodId);
        modelAndView.addObject("buygoods", buygoods);
        return modelAndView;
    }
    @RequestMapping("/updateGood/{goodId}")
    public String updateGood(buygoods buygoods, @PathVariable Integer goodId) {
        buyerService.updateGood(buygoods);
        return "forward:/buyer/getGoods";
    }

    @RequestMapping("/ok")
    public String ok(){
        return "ok";
    }


    @RequestMapping("/buyer/{buyerName}")
    public String buyer(Model model, @PathVariable String buyerName){
        buyer buyer=buyerService.findBuyId(buyerName);
        model.addAttribute("buyer",buyer);
        //buyer buyer = new buyer(buyerService.selectBuyer().getBuyerId(), buyerService.selectBuyer().getBuyerName(), buyerService.selectBuyer().getBuyerPwd());
        // model.addAttribute("buyer", buyer);
        return "buyer/buyer";
    }
    @RequestMapping("/buyerUp/{buyerId}")
    public String buyerUp(@PathVariable Integer buyerId,buyer buyer){
        buyer.setBuyerId(buyerId);
        buyerService.buyerUp(buyer);
       return "ok";
    }

    //通过ID查询，显示在商品详情页
    @RequestMapping("/getGoodsById/{goodId}")
    public String getGoodsById(@PathVariable Integer goodId,Model model){
        goods goods=buyerService.getGoodsById(goodId);
        model.addAttribute("goods",goods);
        return "goods/xiangqing";
    }

    //搜索
    @RequestMapping("/seaName")
    public String seaName(@RequestParam String goodName,Model model){
        buygoods buygoods=buyerService.seaName(goodName);
        model.addAttribute("buygoods",buygoods);
        return "buyer/getGoodsById";
    }


}
