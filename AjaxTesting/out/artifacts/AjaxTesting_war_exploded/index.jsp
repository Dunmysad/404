<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
  <%--    导入jquery ， 可以使用在线的CDN ， 也可以下载导入--%>
  <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
  <%-- <script type="text/javascript" src="static/js/jquery-3.2.1.min.js"></script>--%>
  <script>
    function test() {
      $.post({
        url: "${pageContext.request.contextPath}/test",
        data: {'name': $("#name").val()},
        success: function (data) {
          alert(data)
        }
      })
    }
  </script>
</head>
<body>

<%--onblur：失去焦点触发事件--%>
<input type="text" id="name" onblur="test()">
</body>
</html>