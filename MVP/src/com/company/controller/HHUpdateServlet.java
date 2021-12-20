package com.company.controller;

import com.company.comm.Const;
import com.company.dao.entity.HouseHold;
import com.company.service.factory.ServiceFactory;
import com.company.service.iservice.IHouseHoldService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = "/update")
public class HHUpdateServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html,charset=utf-8");
        // 取值
        String name = request.getParameter("name");
        String idCard = request.getParameter("idCard");
        String mobile = request.getParameter("mobile");
        String occupation = request.getParameter("occupation");
        Date birthday=null;
        Date hiredate=null;
        try {
            birthday = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("birthday"));
            hiredate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("hiredate"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String gender = request.getParameter("gender");
        int id = Integer.parseInt(request.getParameter("id"));
        HouseHold houseHold = new HouseHold(id, name, idCard, mobile, occupation, birthday, gender, hiredate);


        // 处理
        IHouseHoldService houseHoldService = (IHouseHoldService) ServiceFactory.getInstance(Const.HOUSEHOLD);
        String msg = houseHoldService.update(houseHold);

        // 反馈
        if (Const.SUCCESS.equals(msg)){
            request.getRequestDispatcher("/findAll").forward(request,response);
        }else {
            response.sendRedirect(request.getContextPath()+"/error.jsp");
        }
    }
}
