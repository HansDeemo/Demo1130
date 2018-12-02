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
            <td colspan="4">新闻标题<input type="text" name="title" value="${title}"><input type="submit" value="serch"></td>
        </tr>
        <tr>
            <td>id</td>
            <td>title</td>
            <td>content</td>
            <td>author</td>
            <td>createtime</td>
            <td>操作</td>

        </tr>
        <c:forEach items="${list}" var="list">
            <tr>
                <td>${list.id}</td>
                <td>${list.title}</td>
                <td>${list.summary}</td>
                <td>${list.author}</td>
                <td>${list.createdate}</td>
                <td><a href="/comments.do?id=${list.id}">查看评论</a>
                    <a href="/cc.do?id=${list.id}">评论</a>
                    <a href="/del.do?id=${list.id}">删除</a></td>

            </tr>
        </c:forEach>
        <tr>
            <td colspan="6">
        <input type="hidden" name = "pageNo" value="${pageBean.pageNo}">
        <input type="hidden" name="totalPage" value="${pageBean.pageTotal}">
        <a href="javascript:void(0)" onclick="first()">首页</a>
        <a href="javascript:void(0)" onclick="last()">末页</a>
        <a href="javascript:void(0)" onclick="prev(${pageBean.pageNo})">上一页</a>
        <a href="javascript:void(0)" onclick="next(${pageBean.pageNo})">下一页</a>
            </td>
        </tr>
    </table>
</form>
<script src="js/page.js"></script>
</body>
</html>
