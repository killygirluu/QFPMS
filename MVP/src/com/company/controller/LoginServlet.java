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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loginInfo = request.getParameter("loginInfo");
        String password = request.getParameter("password");

        // 判断用户输入的是手机号还是邮箱还是用户名？这个应该在那一层判断
        // 处理
        IAdminService adminService = (IAdminService) ServiceFactory.getInstance(Const.ADMIN);
        Admin admin = null;
        if (!loginInfo.equals("")){
            admin = adminService.checkUserByName(loginInfo,password);
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
}
