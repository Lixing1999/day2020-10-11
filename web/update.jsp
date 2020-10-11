<%@ page import="cn.lixing.entity.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/11
  Time: 8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>修改用户信息</title>
</head>
<body>
<form action="UpdateUserInfo" method="post">
    <table>
        <tr>
            <th colspan="2">用户修改信息</th>
        </tr>
        <c:forEach items="${requestScope.user}" var="user">
            <tr>
                <td>用户id</td>
                <td>${user.id}</td>
            </tr>
            <tr>
                <td>用户名</td>
                <td><input type="text" placeholder="${user.username}" name="username"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="text" placeholder="${user.password}" name="password"></td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input type="radio" value="男" name="sex">男 <input type="radio" value="女" name="sex">女</td>
            </tr>
            <tr>
                <td>出生日期</td>
                <td><input type="text" placeholder="原信息：${user.bornDate}" name="bornDate"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交"></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
