<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h1>登录成功页面</h1>
${user}

<a href="${pageContext.request.contextPath}/goOut">注销</a>

</body>
</html>