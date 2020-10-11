<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/10
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1px" align="center">
        <form action="UserAddServlet" method="post">
            <tr>
                <th colspan="2">添加用户信息<a href="list.jsp">返回</a></th>
            </tr>
            <tr>
                <td>用户名:</td>
                <td><input type="text" placeholder="请输入用户名" name="username"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="text" placeholder="请输入密码" name="password"></td>
            </tr>
            <tr>
                <td>性别</td>
                <td>
                    <input type="radio" value="男" name="sex">男
                    <input type="radio" value="女" name="sex">女
                </td>
            </tr>
            <tr>
                <td>出生日期</td>
                <td><input type="text" placeholder="如：1999-1-1" name="bornDate"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交"></td>
            </tr>
        </form>
    </table>
</body>
</html>
