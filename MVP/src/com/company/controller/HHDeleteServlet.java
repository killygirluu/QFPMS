package com.company.controller;

import com.company.comm.Const;
import com.company.dao.entity.HouseHold;
import com.company.service.factory.ServiceFactory;
import com.company.service.iservice.IHouseHoldService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class HHDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 取值
        int id = Integer.parseInt(request.getParameter("id"));
        // 处理
        IHouseHoldService houseHoldService = (IHouseHoldService) ServiceFactory.getInstance(Const.HOUSEHOLD);
        HouseHold houseHold = new HouseHold(id);
        String msg = houseHoldService.delete(houseHold);

        // 反馈
        if (Const.SUCCESS.equals(msg)){
            request.getRequestDispatcher("/findAll").forward(request,response);
        }else {
            response.sendRedirect(request.getContextPath() + "/error.jsp");
        }

    }


}
