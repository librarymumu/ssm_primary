<%--
  Created by IntelliJ IDEA.
  User: chenlibrary
  Date: 2021/3/3
  Time: 1:31 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="user">
        ${user.username} --- ${user.realname} --- ${user.introduce}
    </c:forEach>
    <h3></h3>
</body>
</html>
