<%--
  Created by IntelliJ IDEA.
  User: zhoushuang
  Date: 2021/12/17
  Time: 11:29 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>更新</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css" tppabs="https://www.layui.site/layui/dist/css/layui.css"
          media="all">
    <script src="${pageContext.request.contextPath}/layui/layui.js"></script>
</head>


<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>更新住户信息</legend>
</fieldset>

<form class="layui-form layui-form-pane" action="${pageContext.request.contextPath}/update" method="post">

    <div class="layui-form-item">
        <label class="layui-form-label">住户ID</label>
        <div class="layui-input-block">
            <input type="text" name="id" autocomplete="off" value="${requestScope.houseHold.id}" class="layui-input" readonly>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">住户姓名</label>
        <div class="layui-input-block">
            <input type="text" name="name" autocomplete="off" value="${requestScope.houseHold.name}" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">性别</label>
        <div class="layui-input-block">
            <input type="radio" name="gender" value="男" title="男" ${requestScope.houseHold.gender == '男' ? 'checked' : ''}>
            <input type="radio" name="gender" value="女" title="女" ${requestScope.houseHold.gender == '女' ? 'checked' : ''}>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">身份证号</label>
        <div class="layui-input-block">
            <input type="text" name="idCard" value="${requestScope.houseHold.idCard}" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">手机号</label>
        <div class="layui-input-block">
            <input type="text" name="mobile" value="${requestScope.houseHold.mobile}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">职业</label>
        <div class="layui-input-block">
            <input type="text" name="occupation" value="${requestScope.houseHold.occupation}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">生日</label>
        <div class="layui-input-block">
            <input type="text" name="birthday" id="birthday" value="${requestScope.houseHold.birthday}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">入住日期</label>
        <div class="layui-input-block">
            <input type="text" name="hiredate" id="hiredate" value="${requestScope.houseHold.hiredate}" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <button class="layui-btn" lay-submit="" onclick="return confirm('确定更新吗？')">提交</button>
    </div>

</form>
<script>
    layui.use('form',function(){
        var form = layui.form;
        //刷新界面 所有元素
        form.render();
        // 指刷新单选框
        //form.render('radio');
    });

</script>


</body>
</html>
