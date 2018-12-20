package com.tt.group3.controller;

import com.tt.group3.pojo.buyer;
import com.tt.group3.pojo.seller;
import com.tt.group3.service.loginService;
import javafx.application.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/login")
public class loginController {
    @Resource
    private loginService loginService;
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/buyIndex")
    public String buyIndex(HttpSession session) {
        String buyerName=(String)session.getAttribute("buyerName");
        if(buyerName!=null){return "/buyer/buyerIndex";}
       return "forward:/login/login";

    }
    //买家的登录
    @PostMapping("/doLoginB")
    public String doLoginB(HttpServletRequest request, HttpSession session,buyer buyer, Model model) {
        buyer = loginService.doLoginB(buyer.getBuyerName(), buyer.getBuyerPwd());
        session.setAttribute("buyerName",buyer.getBuyerName());
        if (buyer != null) {
            model.addAttribute("buyer", buyer);
            return "buyer/buyerIndex";
        }
        return "forward:/buyer/login";
    }
    //卖家登录的方法
    @PostMapping("/doLoginS")
    public String doLoginS(@ModelAttribute seller seller, Model model){
        seller=loginService.doLoginS(seller.getSellerName(),seller.getSellerPwd());
        seller seller1=loginService.select(seller.getSellerName(),seller.getSellerPwd());
        if(seller!=null){
            model.addAttribute("seller",seller);
            model.addAttribute("seller1",seller1);
            return "seller/sellerIndex";
        }
        return "forward:/seller/login";
    }

    @RequestMapping("/sign")
    public String sign(){
        return "sign";
    }

    @PostMapping(value = "/doSign")
    public String doSign(HttpServletRequest request, @ModelAttribute seller seller, Model model) throws IOException {
        if (!seller.getSellerphoto().isEmpty()){
            //1.path：为上传的目录，参数可以改为项目要求的(可改)
            String path = request.getServletContext().getRealPath("/upload/");
            //2.可以打印出，自己去检测是否正确(不可改)
            System.out.println(path);
            //3.查看原文件的名称(不可改)
            String fileName = seller.getSellerphoto().getOriginalFilename();
            //4.根据目录和文件名，进行判断和创建(不可改)
            File filePath = new File(path,fileName);
            if (!filePath.getParentFile().exists()){
                filePath.getParentFile().mkdirs();
            }
            //5.将前端接收的file文件并传入user对象中，传入刚创建的目录文件中(不可改)
            seller.getSellerphoto().transferTo(new File(path+File.separator+fileName));
            //6.可以将user存放到request,session等请求中，进行其他操作(可改)
            seller.setPath(path+File.separator+fileName);
            request.getSession().setAttribute("seller",seller);
            model.addAttribute("seller",seller);
            loginService.doSign(seller);
            //7.上传成功跳转的页面(可改)
            return "ok";
        }
        //8.上传失败跳转的页面(可改)
        return "no";
    }





    @RequestMapping("/bSign")
    public String bSign(){
        return "bSign";
    }
    @PostMapping("/doSignS")
    public String doSignS(buyer buyer) {
        int result = loginService.doSignS(buyer);
        return "forward:/login/login";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/join")
    public String join(){
        return "join";
    }
    @RequestMapping("/aboutus")
    public String aboutus(){
        return "aboutus";
    }
}
