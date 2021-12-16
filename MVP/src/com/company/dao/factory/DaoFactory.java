package com.company.dao.factory;

import com.company.dao.entity.Vehicle;
import com.company.dao.idao.IAdminDao;
import com.company.dao.impl.AdminDao;
import com.company.dao.impl.HouseholdDao;
import com.company.dao.impl.VehicleDao;

public class DaoFactory {
    public static Object getInstance(String name) {
        switch (name){
            case "admin":
                return new AdminDao();
            case "household":
                return new HouseholdDao();
            case "vehicle":
                return new VehicleDao();
            default:
                return null;
        }
    }
}
