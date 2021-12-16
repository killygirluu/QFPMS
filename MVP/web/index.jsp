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
    <title>登录</title>


  </head>
  <body>
<form action="/login" method="post">
  <table>
    <tr>
      <td>用户名：</td>
      <td><label>
        <input type="text">
      </label></td>
    </tr>
    <tr>
      <td>密码：</td>
      <td><label>
        <input type="text">
      </label></td>
    </tr>
    <tr>
      <td><input type="submit" value="登录"/> </td>
      <td><a href="${pageContext.request.contextPath}/reg.jsp">注册</a></td>
    </tr>

  </table>

</form>
  </body>
</html>
