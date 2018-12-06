<%--
  Created by IntelliJ IDEA.
  ss: scw
  Date: 2018/1/3 0003
  Time: 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
<h1>欢迎使用</h1>
<form method="post" action="/login">
    用户名<input name="account" type="text" value="admin">
    密码<input type="text" name="password" value="111111">
    <input type="checkbox" name="remember" style="margin-top: 2px;">记住我
    <input type="submit" value="提交">
</form>
</body>
</html>
