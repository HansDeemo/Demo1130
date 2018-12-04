<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/1 0001
  Time: 下午 5:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-1.7.2.min.js"></script>
</head>
<body>
<form action="add.do" method="post">
    <input type="text" value="${id}" name="newsid">
    <table>
        <tr><td colspan="2">addComment</td></tr>
        <tr>
            <td>content</td>
            <td><textarea name="content" id="" cols="30" rows="10"></textarea></td></tr>
        <tr>
            <td>author</td>
            <td><input type="text" name="author"></td></tr>
        <tr><td colspan="2"><input type="submit" value="submit">
            <input type="button" value="back">
        </td></tr>
    </table>
</form>
<script>
    $(function () {
        $("[name=back]").click(function () {
            window.location.href="list.do"
        })
    })
</script>
</body>
</html>
