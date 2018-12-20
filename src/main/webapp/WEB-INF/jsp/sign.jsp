<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/12/18
  Time: 8:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/sign.css" type="text/css"/>
    <style>

        /*滑块验证*/
        #box {
            position: relative;
            top: 500px;
            width: 350px;
            height: 40px;
            margin: 0 auto;
            margin-top: 10px;
            background-color: #e8e8e8;
            box-shadow: 1px 1px 5px rgba(0, 0, 0, 0.2);
        }

        .bgColor {
            position: absolute;
            left: 0;
            top: 0;
            width: 40px;
            height: 40px;
            background-color: lightblue;
        }

        .txt {
            position: absolute;
            width: 100%;
            height: 40px;
            line-height: 40px;
            font-size: 14px;
            color: #000;
            text-align: center;
        }

        .slider {
            position: absolute;
            left: 0;
            top: 0;
            width: 50px;
            height: 38px;
            border: 1px solid #ccc;
            background: #fff;
            text-align: center;
            cursor: move;
        }

        .slider > i {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
        }

        .slider.active > i {
            color: #4bad4b;
        }
    </style>
</head>
<script type="text/javascript">
    function double() {
        window.location.href = "http://localhost:8080/login/bSign"
    }

    function checkPass() {
        var psd1 = document.getElementById("sellerPwd").value;
        var psd2 = document.getElementById("sellerPwd1").value;
        var psd11 = document.getElementById("sellerPhone").value;
        var psd22 = document.getElementById("sellerPhone1").value;
        if (psd1 != psd2 || psd11 != psd22) {
            alert("密码或者手机号不一致，请重新输入！");
            return false;
        }
        return true;
    }
</script>
<body>
<h1 ondblclick="double()">卖 家 注 册</h1>
<div class="sellerPost">
    <div class="seller">
        <form action="/login/doSign" method="post" modelAttribute="seller" enctype="multipart/form-data" style="position: relative;">
            <!--学号最大长度为10位-->
            <input type="text" name="sellerNo" id="sellerNo" placeholder="学号" required maxlength="10">
            <input type="text" name="sellerName" id="sellerName" placeholder="用户名" required>
            <!--密码最大长度为8位-->
            <input type="password" name="sellerPwd" id="sellerPwd" placeholder="密码" required maxlength="8">
            <input type="password" name="sellerPwd1" id="sellerPwd1" placeholder="请再次输入密码" required maxlength="8">
            <input type="text" name="sellerPhone" id="sellerPhone" placeholder="手机号" required maxlength="11">
            <input type="text" name="sellerPhone1" id="sellerPhone1" placeholder="请再次确定手机号" required>
            <!-- 学生证照片<input type="file" name="sellerphoto" id="sellerphoto">-->
            <!--验证非0的正整数-->
            <input type="text" name="sellerBuild" placeholder="请填入宿舍楼号">
            <input type="text" name="sellerBuildNo" placeholder="请填入宿舍号">
            <!--正则表达式有问题-->
           <div style="position: absolute;left:10px;bottom: 130px;">性别：<input type="radio" name="sellerSex" value="男"/>男<input type="radio" name="sellerSex" value="女"/>女</div>
            <div id="box" onselectstart="return false;">
                <div class="bgColor"></div>
                <div class="txt">滑动验证</div>
                <!--给i标签添加上相应字体图标的类名即可-->
                <div class="slider"><i class="iconfont icon-double-right"></i></div>
            </div>
            <script>
                //一、定义了一个获取元素的方法
                function getEle(selector) {
                    return document.querySelector(selector);
                }

                //二、获取到需要用到的DOM元素
                var box = getEle("#box"),//容器
                    bgColor = getEle(".bgColor"),//背景色
                    txt = getEle(".txt"),//文本
                    slider = getEle(".slider"),//滑块
                    icon = getEle(".slider>i"),
                    successMoveDistance = box.offsetWidth - slider.offsetWidth,//解锁需要滑动的距离
                    downX,//用于存放鼠标按下时的位置
                    isSuccess = false;//是否解锁成功的标志，默认不成功

                //三、给滑块添加鼠标按下事件
                slider.onmousedown = mousedownHandler;

                //3.1鼠标按下事件的方法实现
                function mousedownHandler(e) {
                    bgColor.style.transition = "";
                    slider.style.transition = "";
                    var e = e || window.event || e.which;
                    downX = e.clientX;
                    //在鼠标按下时，分别给鼠标添加移动和松开事件
                    document.onmousemove = mousemoveHandler;
                    document.onmouseup = mouseupHandler;
                };

                //四、定义一个获取鼠标当前需要移动多少距离的方法
                function getOffsetX(offset, min, max) {
                    if (offset < min) {
                        offset = min;
                    } else if (offset > max) {
                        offset = max;
                    }
                    return offset;
                }

                //3.1.1鼠标移动事件的方法实现
                function mousemoveHandler(e) {
                    var e = e || window.event || e.which;
                    var moveX = e.clientX;
                    var offsetX = getOffsetX(moveX - downX, 0, successMoveDistance);
                    bgColor.style.width = offsetX + "px";
                    slider.style.left = offsetX + "px";

                    if (offsetX == successMoveDistance) {
                        success();
                    }
                    //如果不设置滑块滑动时会出现问题（目前还不知道为什么）
                    e.preventDefault();
                };

                //3.1.2鼠标松开事件的方法实现
                function mouseupHandler(e) {
                    if (!isSuccess) {
                        bgColor.style.width = 0 + "px";
                        slider.style.left = 0 + "px";
                        bgColor.style.transition = "width 0.8s linear";
                        slider.style.transition = "left 0.8s linear";
                    }
                    document.onmousemove = null;
                    document.onmouseup = null;
                };

                //五、定义一个滑块解锁成功的方法
                function success() {
                    isSuccess = true;
                    txt.innerHTML = "验证成功";
                    bgColor.style.backgroundColor = "lightgreen";
                    slider.className = "slider active";
                    icon.className = "iconfont icon-xuanzhong";
                    //滑动成功时，移除鼠标按下事件和鼠标移动事件
                    slider.onmousedown = null;
                    document.onmousemove = null;
                };
            </script>
            <div class="send-button" style="padding-top: 100px;clear: both;">
                <input type="submit" value="免费注册" onclick="checkPass()"><a href="/login/sign">
                <input type="reset" value="重置"></a>
            </div>
        </form>
        <div class="clear"></div>
    </div>

</div>

<div class="clear"></div>

</div>

</body>
</html>
