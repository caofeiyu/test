package com.web;

import com.pojo.News;
import com.service.TableNewsService;
import com.service.impl.TableNewsServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet({"/News/Table","/News/insert","/News/detail","/News/delete","/News/revise"})
public class NewsServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session!=null&&session.getAttribute("user")!=null){
            String servletPath = req.getServletPath();
            if ("/News/Table".equals(servletPath)) {
                selectList(req, resp);
            } else if ("/News/insert".equals(servletPath)) {
                insertNews(req,resp);
            }else if("/News/detail".equals(servletPath)){
                detail(req,resp);
            }else if ("/News/delete".equals(servletPath)){
                deleteByTitle(req,resp);
            }else if ("/News/revise".equals(servletPath)){
                reviseByTitle(req,resp);
            }
        }
    }

    private void reviseByTitle(HttpServletRequest req, HttpServletResponse resp) {
        String title = req.getParameter("title");
        HttpSession session = req.getSession(false);
        String user = (String) session.getAttribute("user");
    }

    private void deleteByTitle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        HttpSession session = req.getSession(false);
        String user = (String) session.getAttribute("user");
        TableNewsService tableNewsService = new TableNewsServiceImpl();
        if (tableNewsService.deleteByTitle(user, title)) {
            resp.sendRedirect(req.getContextPath()+"/News/Table");
        }else {
            resp.sendRedirect(req.getContextPath()+"/error.html");
        }
    }

    private void detail(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException  {
        String title = req.getParameter("tt");
        HttpSession session = req.getSession(false);
        String user = (String) session.getAttribute("user");
        TableNewsService tableNewsService = new TableNewsServiceImpl();
        List<News> news = tableNewsService.TableById(user, title);
        req.setAttribute("NNNN",news);
        req.getRequestDispatcher("/detail.jsp").forward(req,resp);
    }

    private void insertNews(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        String date = req.getParameter("date");
        String text = req.getParameter("text");
        String temperature = req.getParameter("temperature");
        HttpSession session = req.getSession(false);
        String user = (String)session.getAttribute("user");
        News news = new News(title,text,date,author,user,temperature);
        TableNewsService tableNewsService = new TableNewsServiceImpl();
        if (tableNewsService.insertNews(news)) {
            resp.sendRedirect(req.getContextPath()+"/News/Table");
        }else {
            resp.sendRedirect(req.getContextPath()+"/error.html");
        }

    }

    private void selectList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TableNewsService news = new TableNewsServiceImpl();
        HttpSession session = req.getSession(false);
        String user = (String) session.getAttribute("user");
        List<News> table = news.Table(user);
        req.setAttribute("tables",table);
        req.getRequestDispatcher("/List.jsp").forward(req,resp);
    }
}