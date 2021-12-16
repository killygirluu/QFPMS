package com.company.service.iservice;

import com.company.controller.vo.HouseHoldVO;
import com.company.controller.vo.VehicleVO;
import com.company.dao.entity.HouseHold;
import com.company.dao.entity.Vehicle;

import java.util.List;

public interface IVehicleService {
    String save(Vehicle vehicle);
    String delete(Vehicle vehicle);
    String update(Vehicle vehicle);
    List<Vehicle> findAll();
    Vehicle findById(int id);
    List<Vehicle> findQuery(VehicleVO vehicleVO);
}
