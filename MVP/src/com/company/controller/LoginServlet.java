package com.company.controller;

import com.company.comm.Const;
import com.company.dao.entity.Admin;
import com.company.service.factory.ServiceFactory;
import com.company.service.iservice.IAdminService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // 处理
        IAdminService adminService = (IAdminService) ServiceFactory.getInstance(Const.ADMIN);
        Admin admin = null;
        if (!username.equals("")){
            admin = adminService.checkUserByName(username,password);
        }else if(!phone.equals("")){
            admin = adminService.checkUserByPhone(phone,password);
        }else if(!email.equals("")){
            admin = adminService.checkUserByEmail(email,password);
        }


       // 反馈
       if (admin != null){
           // 登录成功跳到主页
           request.setAttribute("admin",admin);
           request.getRequestDispatcher("/homepage.jsp").forward(request,response);
       }else {
           response.sendRedirect(request.getContextPath()+"/error.jsp");
       }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
