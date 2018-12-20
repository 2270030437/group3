<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/12/18
  Time: 8:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/login.css" type="text/css">

</head>
<script type="text/javascript">
    function double() {
        window.location.href = "http://localhost:8080/gadmin/login"
    }
</script>
<body>
<h1>登 录</h1>

<script type="text/javascript">
    //密码显示和隐藏
    var isShow = true;

    function change() {
        var v = document.getElementById("pwd");
        if (isShow) {
            v.type = "text";
            isShow = false;
        } else {
            v.type = "password";
            isShow = true;
        }
    }


    //买家密码
    var isShow1 = true;

    function change1() {
        var v1 = document.getElementById("pwd1");
        if (isShow1) {
            v1.type = "text";
            isShow1 = false;
        } else {
            v1.type = "password";
            isShow1 = true;
        }
    };
</script>
<div class="sellerLogin">
    <div class="seller">
        <a href="" ondblclick="double()"><h2>卖 家 登 录</h2></a>
        <form action="/login/doLoginS" method="post" style="position: relative;">
            <input type="text" Name="sellerName" placeholder="用户名" required>
            <input type="password" Name="sellerPwd" id="pwd" placeholder="密码" required>
            <sapn><input class="btn btn-default" type="button" value="see" onclick="change();" style="border-radius:2px;position: absolute;top:60px;right:20px;opacity: 0.8;"></sapn>


            <div class="send-button">
                <input type="submit" value="登录"><a href="/login/sign"><input type="button" value="注册"></a>
            </div>
        </form>
        <div class="clear"></div>
    </div>
    <div class="buyer">
        <a href="" ondblclick="double()"><h2>买 家 登 录</h2></a>
        <form action="${pageContext.request.contextPath}/login/doLoginB" method="post" style="position: relative;">
            <input type="text" name="buyerName" placeholder="用户名" required>
            <input type="password" name="buyerPwd" id="pwd1" placeholder="密码" required>
            <sapn><input class="btn btn-default" type="button" value="see" onclick="change1();" style="border-radius:2px;position: absolute;top:60px;right:20px;opacity: 0.8;"></sapn>
            <div class="send-button">
                <input type="submit" value="登录"><a href="/login/bSign">
                <input type="button" value="注册" href="/login/bSign"/></a>
            </div>
        </form>
        <div class="clear">

        </div>
    </div>

    <div class="clear"></div>

</div>
</body>
</html>
