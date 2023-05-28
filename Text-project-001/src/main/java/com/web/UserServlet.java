package com.web;

import com.pojo.User;
import com.service.Login;
import com.service.impl.LoginImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/web/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session!=null&&session.getAttribute("user")!=null){
            String user = (String) session.getAttribute("user");
            Login u = new LoginImpl();
            User user1 = u.selectUser(user);
            req.setAttribute("uuuu",user1);
            req.getRequestDispatcher("/user.jsp").forward(req,resp);
        }else {
            resp.sendRedirect(req.getContextPath()+"/error.html");
        }
    }
}
