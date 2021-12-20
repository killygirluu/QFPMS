<%--
  Created by IntelliJ IDEA.
  User: zhoushuang
  Date: 2021/12/16
  Time: 12:56 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <style>
        body {
            background-image: url("/img/regist_bg.jpg");
        }

        /*元素选择器 针对的是所有的div*/
        div {
            width: 300px;
            height: 200px;
            background: white;
            border: solid 5px #ccc;
            margin: 200px auto;
        }
        form{
            margin: 30px 35px;
        }
    </style>


</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <table>
            <tr>
                <td align="right">用户名：</td>
                <td align="left"><input type="text" name="loginInfo"></td>
            </tr>
            <tr>
                <td align="right">密码：</td>
                <td align="left"><input type="password" name="password"></td>
            </tr>
            <tr></tr>
            <tr>
                <td align="right"></td>
                <td align="left">
                    <input type="submit" value="登录"/>
                    <a href="${pageContext.request.contextPath}/reg.jsp">注册</a>
                </td>
            </tr>
            <tr></tr>
            <tr>
                <td></td>
                <td style="font-size: x-small">忘记密码？</td>
            </tr>

        </table>

    </form>

</div>

</body>
</html>
