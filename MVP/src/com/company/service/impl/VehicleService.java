package com.company.service.impl;

import com.company.comm.Const;
import com.company.controller.vo.VehicleVO;
import com.company.dao.entity.HouseHold;
import com.company.dao.entity.Vehicle;
import com.company.dao.factory.DaoFactory;
import com.company.dao.idao.IVehicleDao;
import com.company.service.iservice.IVehicleService;

import java.util.ArrayList;
import java.util.List;

public class VehicleService implements IVehicleService {
    IVehicleDao vehicleDao = null;

    public VehicleService() {
        vehicleDao = (IVehicleDao) DaoFactory.getInstance(Const.VEHICLE);
    }

    @Override
    public String save(Vehicle vehicle) {
        String msg = Const.ERROR;
        int flag = 0;
        try {
            flag = vehicleDao.save(vehicle);
            if (flag == 1){
                msg = Const.SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public String delete(Vehicle vehicle) {
        String msg = Const.ERROR;
        int flag = 0;
        try {
            flag = vehicleDao.delete(vehicle);
            if (flag == 1){
                msg = Const.SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public String update(Vehicle vehicle) {
        String msg = Const.ERROR;
        int flag = 0;
        try {
            flag = vehicleDao.update(vehicle);
            if (flag == 1){
                msg = Const.SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public List<Vehicle> findAll() {
        List<Vehicle> vehicles = new ArrayList<>();
        try {
            vehicles = vehicleDao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vehicles;
    }

    @Override
    public Vehicle findById(int id) {
        Vehicle vehicle = null;
        try {
            vehicle = vehicleDao.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vehicle;
    }

    @Override
    public List<Vehicle> findQuery(VehicleVO vehicleVO) {
        List<Vehicle> vehicles = new ArrayList<>();
        try {
            vehicles = vehicleDao.findQuery(vehicleVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vehicles;
    }
}
