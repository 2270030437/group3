<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/12/19
  Time: 9:04
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
<body>
<div class="app" style="padding-left: 50px;">
    <h4><strong>商品类型：</strong></h4>
    <form action="/seller/seaKind" style="margin:20px 30px;">
        <input type="search" name="goodKind" placeholder="请输入商品类型" style="border-radius: 5px;width:300px;height:30px;"/>
    </form>

    <table  class="table table-hover"style="width:900px">
        <!--第一行-->
        <tr>
            <th class="text-center info">商品编号</th>
            <th class="text-center info">商品分类</th>
            <th class="text-center info">商品名称</th>
            <th class="text-center info">商品数量</th>
            <th class="text-center info">商品单位</th>
            <th class="text-center info">商品单价</th>
            <th class="text-center info">操作</th>
        </tr>
        <!--第二行-->
        <tbody class="text-center" id="content">
        <c:forEach var="goods" items="${list}">
        <tr>
            <td align="text-center">${goods.goodId}</td>
            <td align="text-center">${goods.goodKind}</td>
            <td align="text-center">${goods.goodName}</td>
            <td align="text-center">${goods.goodCount}</td>
            <td align="text-center">${goods.goodUnit}</td>
            <td align="text-center">${goods.goodPrice}</td>
            <td align="text-center"><a  target="_blank" href="/buyer/good?goodId=${goods.goodId}">查看</a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
