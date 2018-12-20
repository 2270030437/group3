<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/12/18
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>信息管理</title>
    <!-- Bootstrap必须使用的CSS -->
    <link href="/static/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap中table的插件的css -->
    <link href="/static/css/bootstrap-table.css" rel="stylesheet">
    <!-- 小图标的css(非必须的) -->
    <!--<link th:href="@{/static/css/font-awesome.min.css}" rel="stylesheet">-->
    <!--自己使用的css放到后面-->
    <link href="/static/css/style.css" rel="stylesheet">
    <!--配置IE版本兼容，其中解决兼容性的js可以放到 页面内容的前面 -->
    <link href="/static/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <script src="/static/js/lib/ie8-responsive-file-warning.js"></script>
    <script src="/static/js/lib/ie-emulation-modes-warning.js"></script>
    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="/static/js/lib/html5shiv.min.js"></script>
    <script src="/static/js/lib/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<!--1.前端提供的table，一会将使用bootstrap框架进行ajax异步请求，将数据渲染到table中-->
<table id="table_good" data-toggle="table" data-height="400" style="border:0px;">
</table>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    编辑
                </h4>
            </div>
            <div class="modal-body">

                <form name="placeOrder" method="POST" action="/stu/updateStu">
                    <input type="hidden" value="" id="bhId">
                    <div class="form-group">
                        <label for="stuNo">学号</label>
                        <input type="text" class="form-control" id="stuNo" name="stuNo" placeholder="学号" required
                               readonly>
                    </div>
                    <div class="form-group">
                        <label for="stuName">姓名</label>
                        <input type="text" class="form-control" id="stuName" name="stuName" placeholder="姓名" required>
                    </div>
                    <div class="form-group">
                        <label for="stuPwd">密码</label>
                        <input type="text" class="form-control" id="stuPwd" name="stuPwd" placeholder="密码" required>
                    </div>
                    <div class="form-group">
                        <label for="stuPhone">电话</label>
                        <input type="text" class="form-control" id="stuPhone" name="stuPhone" placeholder="电话" required>
                    </div>

                    <button type="submit" class="btn btn-primary">提交</button>
                </form>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
            </div>
        </div>
    </div>
</div>



</body>
<!-- 不是兼容性的js放到页面内容后面 -->
<!--所有的前段页面，肯定要用jquery放在第一行  -->
<script src="/static/js/lib/jquery-1.12.4.js"></script>
<!--bootstrap要用的js -->
<script src="/static/js/lib/bootstrap.min.js"></script>
<!--bootstrap使用的2个table插件 -->
<script src="/static/js/lib/bootstrap-table.js"></script>
<script src="/static/js/lib/bootstrap-table-zh-CN.js"></script>
<!-- 分页会用到的js -->
<script src="/static/js/lib/holder.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="/static/js/lib/ie10-viewport-bug-workaround.js"></script>
<script>
    //3.前端提供的绑定事件myselfEvents
    window.myselfEvents = {
        "click .edit":function(e,value,row,index){

        },
        "click .delete":function(e,value,row,index) {


        }
    }

    function findGoodFu() {
        $("#table_good").bootstrapTable({
            url:"/buyer/getGoodsList",
            type:"GET",
            dataType:"json",
            pagination:true,//分页
            search:true,//模糊搜索
            showRefresh:true,//刷新
            pageSize:5,
            pageList:[1,2,3,4,5],
            columns:[
                {
                    field:"goodId",
                    title:"商品编号",
                    align:"center",
                    valign:"middle",
                    searchable:true
                },
                {
                    field:"goodName",
                    title:"商品名称",
                    align:"center",
                    valign:"middle",
                    searchable:true
                },{
                    field:"goodKind",
                    title:"商品类型",
                    align:"center",
                    valign:"middle",
                    searchable:true
                },{
                    field:"goodCount",
                    title:"商品数量",
                    align:"center",
                    valign:"middle",
                    searchable:true
                },{
                    field:"goodInfo",
                    title:"商品信息",
                    align:"center",
                    valign:"middle",
                    searchable:true
                },{
                    field:"goodDate",
                    title:"商品发布日期",
                    align:"center",
                    valign:"middle",
                    searchable:true
                }
            ]

            }
        )
    }

    findGoodFu();

    //4.前端提供编辑按钮两个，需要加如自己的绑定事件myselfEvents
    function delEdit(value,row,index){
        return [
            "<a class='btn btn-primary btn-sm edit' data-target='#myModal'>编辑</a> " +
            "<a class='btn btn-primary btn-sm delete'>删除</a>"].join('');

    }

</script>

</html>
