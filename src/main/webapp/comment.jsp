<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/30 0030
  Time: 下午 3:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-1.7.2.min.js"></script>

</head>
<body>
<form action="list.do" method="post">
    <table border="1px">
        <tr>
            <td colspan="4">评论列表<input type="button" id="alpha" value="back"> </td>
        </tr>
        <tr>
            <td>id</td>
            <td>content</td>
            <td>author</td>
            <td>createtime</td>

        </tr>
        <c:forEach items="${list}" var="list">
            <tr>
                <td>${list.id}</td>
                <td>${list.content}</td>
                <td>${list.author}</td>
                <td>${list.createdate}</td>

            </tr>
        </c:forEach>
    </table>
</form>
<script>
    $(function () {
        $("#alpha").click(function () {
            window.location.href="list.do"
        })
    })
</script>
</body>
</html>
