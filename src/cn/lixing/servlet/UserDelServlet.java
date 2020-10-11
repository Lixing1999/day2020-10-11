package cn.lixing.servlet;

import cn.lixing.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserDelServlet")
public class UserDelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        UserServiceImpl usi = new UserServiceImpl();
        String id = request.getParameter("id");
        int  userID = Integer.parseInt(id);
        int i = usi.deleteUserInfo(userID);
        if (i>0){
            response.sendRedirect("list.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
