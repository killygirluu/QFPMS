package com.company.controller;

import com.company.comm.Const;
import com.company.dao.entity.HouseHold;
import com.company.service.factory.ServiceFactory;
import com.company.service.iservice.IHouseHoldService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/findAll")
public class HHFindAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 取值
        // 处理
        IHouseHoldService houseHoldService = (IHouseHoldService) ServiceFactory.getInstance(Const.HOUSEHOLD);
        List<HouseHold> houseHolds = houseHoldService.findAll();

        // 反馈
        if (houseHolds != null && houseHolds.size()>0){
            request.setAttribute("houseHolds",houseHolds);
            request.getRequestDispatcher("/households.jsp").forward(request,response);
        }else {
            response.sendRedirect(request.getContextPath()+"/error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
