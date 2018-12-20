<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/12/17
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/assets/css/amazeui.css"/>
    <link rel="stylesheet" href="/static/assets/css/common.min.css"/>
    <link rel="stylesheet" href="/static/assets/css/bottom.css"/>
    <script src="/static/assets/js/jquery-1.12.4.js"></script>
   <style type="text/css">
       #con2-phone{
           width: 1000px;
           margin: 0 auto;
           height: 710px;
       }
       #con2-phone p:nth-of-type(1){
           font-size: 22px;
           height: 70px;
           padding-top: 20px;
           line-height: 70px;
       }
       #con2-phone p:nth-of-type(1)>span{
           float: right;
           font-size: 18px;
           color: #424242;
       }
       #con2-phone p:nth-of-type(1)>span>img{
           vertical-align: middle;
           margin-left: 5px;
           margin-bottom: 5px;
       }
       #con2-phone p:nth-of-type(2){
           float: left;
       }
       #con2-phone>ul{
           width: 235px;
           height: 300px;
           background:white;
           float: left;
           margin-left: 5px;
           margin-bottom: 12px;
           text-align: center;
           padding-top: 20px;
           transition:all 0.5s;
           box-sizing: border-box;
           position: relative;
       }
       #con2-phone>ul:hover{
           box-shadow: 3px 3px 50px #999999;
           transform:translate(0,-5px);
       }
       #con2-phone>ul>li:nth-of-type(1)>img{
           width:154px;
           height:165px;
       }
       #con2-phone>ul>li:nth-of-type(2){
           position: absolute;
           bottom: 110px;
           left:30px;
           width:235px;
           text-align: center;
           font-size: 14px;
       }
       #con2-phone>ul>li:nth-of-type(3){
           font-size: 14px;
           color: #b0b0b0;
           position: absolute;
           bottom: 80px;
           width:235px;
           text-align: center;
       }
       #con2-phone>ul>li:nth-of-type(4){
           font-size: 14px;
           color: #ff6700;
           position: absolute;
           bottom: 60px;
           width:235px;
           text-align: center;

       }
       #lateButtom{
           position: absolute;
           bottom:30px;
           text-align: center;
       }

   </style>
</head>

<body>
<div class="layout">
    <!--===========layout-header================-->
    <div class="layout-header am-hide-sm-only">
        <!--topbar start-->
        <div class="topbar">
            <div class="container">
                <div class="am-g">
                    <div class="am-u-md-3">
                        <div class="topbar-left"><i class="am-icon-globe"></i>
                            <div class="am-dropdown" data-am-dropdown>
                                <button class="am-btn am-btn-primary am-dropdown-toggle" data-am-dropdown-toggle>所在学院
                                    <span
                                            class="am-icon-caret-down"></span></button>
                                <ul class="am-dropdown-content">
                                    <li><a href="http://www.sxglzyxy.com.cn/">山西管理学院</a></li>
                                    <li class="am-divider"></li>
                                    <li><a href="http://www.sxnu.edu.cn/">山西师范大学</a></li>
                                </ul>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="am-u-md-9">
                        <div class="topbar-right am-text-right am-fr"> Follow us <i class="am-icon-facebook"></i> <i
                                class="am-icon-twitter"></i> <i class="am-icon-google-plus"></i> <i
                                class="am-icon-pinterest"></i> <i class="am-icon-instagram"></i> <i
                                class="am-icon-linkedin"></i> <i class="am-icon-youtube-play"></i> <i
                                class="am-icon-rss"></i>
                            <a href="${pageContext.request.contextPath}/login/login">登录</a> <a href="${pageContext.request.contextPath}/login/sign">注册</a></div>
                    </div>
                </div>
            </div>
        </div>
        <!--topbar end-->
        <div class="header-box" data-am-sticky>
            <!--header start-->
            <div class="container">
                <div class="header">
                    <div class="am-g">
                        <div class="am-u-lg-2 am-u-sm-12">
                            <div class="logo"><a href="简介.html"><img src="/static/assets/images/商标.png" width="20"
                                                                     height="55"/></a>
                            </div>
                        </div>
                        <div class="am-u-md-10">
                            <div class="header-right am-fr">
                                <div class="header-contact">
                                    <div class="header_contacts--item">
                                        <div class="contact_mini"><i style="color:#7c6aa6"
                                                                     class="contact-icon am-icon-phone"></i>
                                            <strong>0357-3102088</strong> <span>周一~周五, 8:00 - 20:00</span></div>
                                    </div>
                                    <div class="header_contacts--item">
                                        <div class="contact_mini"><i style="color:#7c6aa6"
                                                                     class="contact-icon am-icon-envelope-o"></i>
                                            <strong>MisterLv@163.com</strong>
                                            <span>随时欢迎您的来信！</span></div>
                                    </div>
                                    <div class="header_contacts--item">
                                        <div class="contact_mini"><i style="color:#7c6aa6"
                                                                     class="contact-icon am-icon-map-marker"></i>
                                            <strong>临
                                                汾,</strong> <span>滨河街道</span></div>
                                    </div>
                                </div>
                                <button type="button" class="am-btn am-btn-secondary am-radius">联系我们</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--header end-->

            <div class="nav-contain">
                <div class="nav-inner">
                    <ul class="am-nav am-nav-pills am-nav-justify">
                        <li><a href="">首页</a></li>
                        <li><a href="">洗护用品</a></li>
                        <li><a href="">男女箱包</a></li>
                        <li><a href="">居家用品</a></li>
                        <li><a href="">男女配饰</a></li>
                        <li><a href="">数码家电</a></li>
                        <li><a href="/login/aboutus">关于我们</a></li>
                        <li><a href="/login/join">加入我们</a></li>
                    </ul>
                    <div class="none"><img src="/static/images/jpeg.jpg" width="1000px" height="500"/></div>
                    <!--header end-->
                    <div id="content-2">
                        <div id="con2-phone">
                            <c:forEach items="${list}" var="goods">
                                <ul>
                                    <li><img src="${goods.goodPhoto}"/></li>
                                    <li>${goods.goodName}</li>
                                    <li>${goods.goodInfo}</li>
                                    <li>￥${goods.goodPrice}</li>
                                    <input type="button" id="lateButtom" value="购买">
                                    <p id="showtime"></p>
                                </ul>
                            </c:forEach>
                        </div>
                    </div>

                    <div class="nav-inner">
                        <iframe name="test" width="1100px" height="500px" id="isss">
                            <img src="center.jpg" width="1024" height="395">
                        </iframe>
                    </div>

                </div>
            </div>
        </div>
    </div>


    <!--底部代码-->
    <div id="footer" style="margin-left:400px;">
        <div class="footer-top">
            <dl>
                <dt><a href="#">新手指南</a></dt>
                <dd><a href="#">注册新用户</a></dd>
                <dd><a href="#">网站订购流程</a></dd>
            </dl>
            <dl>
                <dt><a href="#">如何付款/退款</a></dt>
                <dd><a href="#">支付方式</a></dd>
                <dd><a href="#">如何办理退款</a></dd>
                <dd><a href="#">发票制度说明</a></dd>
            </dl>
            <dl>
                <dt><a href="#">配送方式</a></dt>
                <dd><a href="#">配送范围及配送时间</a></dd>
                <dd><a href="#">配送费收取标准</a></dd>
            </dl>
            <dl>
                <dt><a href="#">售后服务</a></dt>
                <dd><a href="#">退换货政策</a></dd>
                <dd><a href="#">如何办理退换货</a></dd>
            </dl>
            <dl>
                <dt><a href="#">帮助中心</a></dt>
                <dd><a href="#">常见热点问题</a></dd>
                <dd><a href="#">联系我们</a></dd>
                <dd><a href="#">投诉与建议</a></dd>
            </dl>
        </div>
        <div class="footer-center">
            <p class="p1"><a href="#">首页</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="#">客户服务</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a
                    href="#">品牌合作</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="#">网站联盟</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="#">投诉与建议</a>
            </p>
            <p class="p2"><a href="#">Copyright&copy;2011 vjia.com All Righths Reserved 京ICP备08000757号
                京公网安备110105005926</a></p>
        </div>
        <div class="footer-bottom">
            <img src="/static/assets/images/btm_logo_1.gif"/>
            <img src="/static/assets/images/btm_logo_2.gif"/>
        </div>
    </div>


    <script src="/static/assets/js/jquery-2.1.0.js" charset="utf-8"></script>
    <script src="/static/assets/js/amazeui.js" charset="utf-8"></script>
    <script src="/static/assets/js/common.js" charset="utf-8"></script>

</div>
</body>
<script type="text/javascript">
    $(function () {
        var time = null;
        $("#lateButtom").click(function () {
            var a = confirm("5秒后获取卖家信息");
            if (a) {
                var c = 2;
                time = setInterval(function () {
                    c--;
                    // document.getElementById('showtime').innerHTML=c;
                    if (c == 0) {
                        clearInterval(time);
                        window.location.href = "http://localhost:8080/seller/sellerByID";//为跳转地址
                    }
                }, 1000);
            }
        })
    })
</script>
</html>
