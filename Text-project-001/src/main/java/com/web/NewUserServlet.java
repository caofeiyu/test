package com.web;

import com.pojo.User;
import com.service.Login;
import com.service.impl.LoginImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/login/user")
public class NewUserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        String email = req.getParameter("email");
        String password1 = req.getParameter("password1");
        String password2 = req.getParameter("password2");
        String user1 = req.getParameter("user");
        if (!password1.equals(password2)){
            req.getRequestDispatcher("/newUser.jsp").forward(req,resp);
            req.setAttribute("error","密码不一致");
        }
        if (email!=""&&password1!=""&&password2!=""){
            User user = new User(null,name,sex,email,password2,user1);
            Login login = new LoginImpl();
            if(login.newUser(user)){
                HttpSession session = req.getSession();
                session.setAttribute("user",user1);
                req.setAttribute("username",email);
                req.getRequestDispatcher("/News/Table").forward(req,resp);
            }
        }else {
            req.getRequestDispatcher("/newUser.jsp").forward(req,resp);
            req.setAttribute("error","邮箱或密码为空");
        }


    }
}
