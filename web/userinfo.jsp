<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/10
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1px" align="center" >
        <c:forEach items="${sessionScope.userInfo}" var="user">
        <tr>
            <th colspan="2">用户信息<a href="list.jsp">返回</a></th>
        </tr>
        <tr>
            <td>用户ID</td>
            <td>${user.id}</td>
        </tr>
        <tr>
            <td>用户名</td>
            <td>${user.username}</td>
        </tr>
        <tr>
            <td>用户密码</td>
            <td>${user.password}</td>
        </tr>
        <tr>
            <td>用户性别</td>
            <td>${user.sex}</td>
        </tr>
        <tr>
            <td>出生日期</td>
            <td>${user.bornDate}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
