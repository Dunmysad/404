<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/upload2" enctype="multipart/form-data" method="post">
  <input type="file" name="file"/>
  <input type="submit" value="上传">
</form>
${msg}
${info}
${path}
<a href="${pageContext.request.contextPath}/download">点击下载</a>
</body>
</html>