<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/12/19
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/商品详情页.css"/>

</head>
<body>
<div id="all">
    <div class="left">
        <img src="/static/images/图片.jpg" width="350" height="250"/>
    </div>
    <div class="right">
        <ul>
            <li>商品编号:<span>${goods.goodId}</span></li>
            <li>卖家编号:<span>${goods.sellerId}</span></li>
            <li>商品名字:<span>${goods.goodName}</span></li>
            <li>商品价格:<span>${goods.goodPrice}</span></li>
            <li>商品单位:<span>${goods.goodUnit}</span></li>
            <li>商品数量:<span>${goods.goodCount}</span></li>
            <li>商品种类:<span>${goods.goodKind}</span></li>
            <li>商品生产日期:<span>${goods.goodDate}</span></li>
            <li>商品信息:<span>${goods.goodInfo}</span></li>
        </ul>
    </div>
    <form action="/seller/sellerById">
        <div class="bottom">
            <input type="submit" value="购买" id="determine" style="height:40px; width:120px;"/>
            <input type="button" value="取消" style="height:40px; width:100px;" onClick="cancel()"/>
        </div>
    </form>
</div>
</body>
</html>
