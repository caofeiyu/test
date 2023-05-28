package com.web;

import com.service.Login;
import com.service.impl.LoginImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/web/login")
public class loginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Login login = new LoginImpl();
        if (login.login(username,password)){
            HttpSession session = req.getSession();
            session.setAttribute("user",username);
            resp.sendRedirect(req.getContextPath()+"/News/Table");
        }else{
            resp.sendRedirect(req.getContextPath()+"/error.html");
        }
    }
}
