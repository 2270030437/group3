<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/12/18
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/dist/css/bootstrap.css">
    <script src="/static/dist/js/jquery-1.12.4.js"></script>
    <script src="/static/dist/js/bootstrap.js"></script>
</head>
<body style="position: relative;">


<div class="container" style="background-color:#ffffff;
background-size: contain;
    opacity: 0.8;
    margin-bottom: 20px;
    height: 1300px;
    padding-top: 8px;
    border-radius: 18px;position:absolute;top:0px;width: 100%;
">

    <div class="row">
        <!--左侧栏-->
        <div class="col-lg-3">
            <!--左侧栏-->
            <div class="left" style="width: 246px;height: 700px;opacity: 0.8;background:#ffffff;margin-top: 10px;">
                <!--左侧用户栏-->
                <div class="text-center">
                    <img name="photo" class="img-circle" src="/static/images/2.jpg" width="116px" height="116px"
                         style="margin-top: 15px"/>
                    <div class="caption text-center">
                        <h3 style="color:#000000">${buyer.buyerName}个人中心</h3>
                    </div>
                </div>
                <!--左侧导航项-->
                <div class="caozuo">
                    <ul class="nav nav-pills nav-stacked text-center"
                        style="width: 209px; height: 328px;font-size: 16px;">
                        <li role="presentation"><a href="/goods/doselectGoodsAll1"
                                                   target="test"
                                                   style="color:#000;margin-top: 30px">商品信息</a></li>
                        <li role="presentation"><a href="/buyer/getGoods"
                                                   target="test"
                                                   style="color:#000;margin-top: 30px">已发布的求购商品</a></li>
                        <li role="presentation"><a href="${pageContext.request.contextPath}/buyer/addGoods"
                                                   target="test"
                                                   style="color:#000;margin-top: 30px">发布的求购商品</a></li>
                        <li role="presentation"><a href="" target="test"
                                                   style="color:#000;margin-top:40px">修改个人信息</a></li>
                    </ul>
                </div>
                <p><a href="/login/login" class="btn btn-primary" role="button"
                      style="width:80px;margin:10px 70px;text-align: center;">注销账号</a></p>
            </div><!--左侧用户栏-->
            <!--右侧标题-->
            <!--右侧标题-->
            <div class="col-lg-9" style="width:1000px;height:100%;position: absolute;top:10px;left:620px;">
                <div class="header" style="border-bottom: 1px solid #f5f5f5; margin-top: 30px;padding-bottom: 10px">
                    <h1 class="pull-left"></h1>
                    <div class="pull-right" style="position: relative;margin-bottom: 30px;">
                        <a href="/login/login"><img src="/static/images/12345.jpg" alt="退出系统" onClick="close()"
                                                    style="width:20px;height:20px;position: absolute;top:20px;right:80px;"/></a>
                        <span id="clock"></span>
                    </div>
                    <script type="text/javascript">
                        var clock = new Clock();
                        clock.display(document.getElementById("clock"));

                        function Clock() {
                            var date = new Date();
                            this.year = date.getFullYear();
                            this.month = date.getMonth() + 1;
                            this.date = date.getDate();
                            this.day = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六")[date.getDay()];
                            this.hour = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
                            this.minute = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
                            this.second = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();
                            this.toString = function () {
                                return this.year + "年" + this.month + "月" + this.date + "日 " + this.hour + ":" + this.minute + ":" + this.second + " " + this.day;
                            };

                            this.toSimpleDate = function () {
                                return this.year + "-" + this.month + "-" + this.date;
                            };

                            this.toDetailDate = function () {
                                return this.year + "-" + this.month + "-" + this.date + " " + this.hour + ":" + this.minute + ":" + this.second;
                            };

                            this.display = function (ele) {
                                var clock = new Clock();
                                ele.innerHTML = clock.toString();
                                window.setTimeout(function () {
                                    clock.display(ele);
                                }, 1000);
                            };
                        }

                        function close() {
                            var isOK = window.confirm('您真的要关闭吗？');
                            if (isOK == true) {
                                window.close();
                            } else {
                                alert('关闭失败');
                            }
                        }
                    </script>
                </div>
                <!--标题右侧图标-->
                <iframe width="1300px" height="800px;" frameborder="0" name="test" style="margin-left: -300px;margin-bottom: 20px;"></iframe>
            </div>
        </div>
    </div>
</div>
</div>
</div>
</div>
</body>
</html>
