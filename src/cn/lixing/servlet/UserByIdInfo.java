package cn.lixing.servlet;

import cn.lixing.entity.User;
import cn.lixing.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/UserByIdInfo")
public class UserByIdInfo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        UserServiceImpl usi = new UserServiceImpl();
        HttpSession session = request.getSession();
        String id = request.getParameter("id");
        int userID = Integer.parseInt(id);
        try {
            List<User> userInfo = usi.findByIdUserInfo(userID);
            session.setAttribute("userInfo",userInfo);
            response.sendRedirect("userinfo.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
