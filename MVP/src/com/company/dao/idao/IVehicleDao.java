package com.company.dao.idao;

import com.company.controller.vo.VehicleVO;
import com.company.dao.entity.Vehicle;

import java.util.List;

public interface IVehicleDao {
    int save(Vehicle vehicle) throws Exception;

    int delete(Vehicle vehicle) throws Exception;

    int update(Vehicle vehicle) throws Exception;

    List<Vehicle> findAll() throws Exception;

    Vehicle findById(int id) throws Exception;

    List<Vehicle> findQuery(VehicleVO vehicleVO) throws Exception;
}

