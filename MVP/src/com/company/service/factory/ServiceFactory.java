package com.company.service.factory;

import com.company.service.impl.AdminService;
import com.company.service.impl.HouseHoldService;

public class ServiceFactory {
    public static Object getInstance(String name) {
        switch (name){
            case "admin":
                return new AdminService();
            case "household":
                return new HouseHoldService();
            default:
                return null;
        }
    }
}
