<%--
  Created by IntelliJ IDEA.
  User: zhoushuang
  Date: 2021/12/17
  Time: 9:40 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>住户信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css" tppabs="https://www.layui.site/layui/dist/css/layui.css"
          media="all">
    <script type="text/javascript" src="layui/layui.js"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>

<table>
    <tr>
        <label>欢迎${admin.username}! | </label>
        <button>退出</button>

    </tr>
</table>
<hr>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend align="center"> 住户信息表</legend>
</fieldset>

<div class="layui-form">
    <table class="layui-table" lay-even lay-size="sm">
        <thead>
        <tr>
            <th>住户ID</th>
            <th>住户姓名</th>
            <th>性别</th>
            <th>身份证号</th>
            <th>手机号</th>
            <th>职业</th>
            <th>生日</th>
            <th>入住日期</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${requestScope.houseHolds}" var="household">
        <tr>
            <td>${household.id}</td>
            <td>${household.name}</td>
            <td>${household.gender}</td>
            <td>${household.idCard}</td>
            <td>${household.mobile}</td>
            <td>${household.occupation}</td>
            <td>${household.birthday}</td>
            <td>${household.hiredate}</td>
            <td>
                <a href="${pageContext.request.contextPath}/findMore?id=${household.id}" tppabs="https://www.layui.site/doc/element/button.html" class="layui-btn layui-btn-xs" target="_blank">查看</a>
                <a href="${pageContext.request.contextPath}/findById?id=${household.id}" tppabs="https://www.layui.site/doc/element/button.html" class="layui-btn layui-btn-xs" target="_blank" >更新</a>
                <a href="${pageContext.request.contextPath}/delete?id=${household.id}" tppabs="https://www.layui.site/doc/element/button.html" class="layui-btn layui-btn-xs layui-btn-danger" id="delete" target="_blank" onclick="return confirm('确定删除吗？')">删除</a>
            </td>

        </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%--<script>--%>



<%--    $(function (){--%>
<%--        //--%>
<%--        $("#delete").click(function (){--%>
<%--            layer.confirm('is not?', function(index){--%>
<%--                //do something--%>

<%--                layer.close(index);--%>
<%--            });--%>

<%--        });--%>
<%--    });--%>
<%--</script>--%>

</body>
</html>
