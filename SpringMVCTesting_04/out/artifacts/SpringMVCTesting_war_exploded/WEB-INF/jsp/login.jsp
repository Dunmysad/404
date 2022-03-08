<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login">
    <span>用户名：</span>
    <input type="text" name="username"/><br>
    <span>密码：</span>
    <input type="text" name="psd"/><br>
    <input type="submit" value="登录">
</form>

</body>
</html>