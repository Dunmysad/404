<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script>
        function getUsers() {
            $.post("${pageContext.request.contextPath}/test2", function (data) {
                    console.log(data)
                    var html = "";
                    for (var i = 0; i < data.length; i++) {
                        html += "<tr>" +
                            "<td>" + data[i].name + "</td>" +
                            "<td>" + data[i].age + "</td>" +
                            "<td>" + data[i].sex + "</td>" +
                            "</tr>"
                    }
                    $("#content").html(html);
                }
            )
        }
    </script>
</head>
<body>
<input type="button" value="获取数据" onclick="getUsers()">
<table>
    <tr>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
    </tr>
    <tbody id="content"></tbody>
</table>

</body>
</html>