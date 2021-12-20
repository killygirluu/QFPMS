<%--
  Created by IntelliJ IDEA.
  User: zhoushuang
  Date: 2021/12/17
  Time: 9:40 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>住户信息</title>
    <link rel="stylesheet" href="layui/css/layui.css" tppabs="https://www.layui.site/layui/dist/css/layui.css"
          media="all">

</head>
<body>
<table>
    <tr>
        <label>欢迎${admin.username}! | </label>
        <button>退出</button>

    </tr>
</table>
<hr>

<div class="layui-form-item">
    <div class="layui-inline">
        <label class="layui-form-label">住户ID</label>
        <div class="layui-input-inline">
            <input type="number" name="number" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">住户姓名</label>
        <div class="layui-input-inline">
            <input type="text" name="name" id="name" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">性别</label>
        <div class="layui-input-inline">
            <select name="gender" >
                <option value="">请选择</option>
                <option value="1">男</option>
                <option value="2">女</option>
            </select>
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">身份证号</label>
        <div class="layui-input-inline">
            <input type="text" name="idCard" id="idCard" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">电话</label>
        <div class="layui-input-inline">
            <input type="text" name="mobile" id="mobile" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">职业</label>
        <div class="layui-input-inline">
            <input type="text" name="occupation" id="occupation" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">生日</label>
        <div class="layui-input-inline">
            <input type="date" name="birthday" id="birthday" lay-verify="date" placeholder="yyyy-MM-dd"
                   autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-inline">
        <label class="layui-form-label">入住日期</label>
        <div class="layui-input-inline">
            <input type="date" name="hiredate" id="hiredate" lay-verify="date" placeholder="yyyy-MM-dd"
                   autocomplete="off" class="layui-input">
        </div>
    </div>
</div>


</body>
</html>
