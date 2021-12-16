package com.company.service.factory;

import com.company.service.impl.AdminService;
import com.company.service.impl.HouseHoldService;
import com.company.service.impl.VehicleService;

public class ServiceFactory {
    public static Object getInstance(String name) {
        switch (name){
            case "admin":
                return new AdminService();
            case "household":
                return new HouseHoldService();
            case "vehicle":
                return new VehicleService();
            default:
                return null;
        }
    }
}
