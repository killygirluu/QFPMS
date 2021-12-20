package com.company.dao.impl;

import com.company.controller.vo.VehicleVO;
import com.company.dao.entity.Vehicle;
import com.company.dao.idao.IVehicleDao;
import com.company.dao.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VehicleDao implements IVehicleDao {
    @Override
    public int save(Vehicle vehicle)  throws Exception{
        Connection conn = DBUtil.getConnection();
        String sql = "INSERT INTO vehicle(hhid,licenseplate,color,`desc`,carport,hiredate) VALUES (?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, vehicle.getHhid());
        pstmt.setString(2, vehicle.getLicenseplate());
        pstmt.setString(3, vehicle.getColor());
        pstmt.setString(4, vehicle.getDesc());
        pstmt.setString(5, vehicle.getCarport());
        pstmt.setDate(6, new java.sql.Date(vehicle.getHiredate().getTime()));
        int flag = pstmt.executeUpdate();
        DBUtil.close(null, pstmt, conn);
        return flag;
    }

    @Override
    public int delete(Vehicle vehicle) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql = "UPDATE vehicle SET del = 1 WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, vehicle.getId());
        int flag = pstmt.executeUpdate();
        DBUtil.close(null, pstmt, conn);
        return flag;
    }

    @Override
    public int update(Vehicle vehicle) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql = "UPDATE vehicle SET hhid=? AND licenseplate=? AND color=? AND `desc`=? AND carport=? AND hiredate=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, vehicle.getHhid());
        pstmt.setString(2, vehicle.getLicenseplate());
        pstmt.setString(3, vehicle.getColor());
        pstmt.setString(4, vehicle.getDesc());
        pstmt.setString(5, vehicle.getCarport());
        pstmt.setDate(6, new java.sql.Date(vehicle.getHiredate().getTime()));
        pstmt.setInt(7, vehicle.getId());
        int flag = pstmt.executeUpdate();
        DBUtil.close(null, pstmt, conn);
        return flag;
    }

    @Override
    public List<Vehicle> findAll() throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql = "SELECT id,hhid,licenseplate,color,`desc`,carport,hiredate FROM vehicle WHERE del=0";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Vehicle> vehicles = new ArrayList<>();
        while (rs.next()) {
            Vehicle vehicle = new Vehicle(
                    rs.getInt("id"),
                    rs.getInt("hhid"),
                    rs.getString("licenseplate"),
                    rs.getString("color"),
                    rs.getString("desc"),
                    rs.getString("carport"),
                    rs.getDate("hiredate"));
            vehicles.add(vehicle);
        }
        DBUtil.close(rs, pstmt, conn);
        return vehicles;
    }

    @Override
    public Vehicle findById(int id) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql = "SELECT hhid,licenseplate,color,`desc`,carport,hiredate FROM vehicle WHERE del=0 AND id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        Vehicle vehicle = null;
        if (rs.next()) {
            vehicle = new Vehicle(
                    rs.getInt("hhid"),
                    rs.getString("licenseplate"),
                    rs.getString("color"),
                    rs.getString("desc"),
                    rs.getString("carport"),
                    rs.getDate("hiredate"));
        }
        DBUtil.close(rs, pstmt, conn);
        return vehicle;
    }

    @Override
    public List<Vehicle> findQuery(VehicleVO vehicleVO) throws Exception {
        Connection conn = DBUtil.getConnection();
        StringBuilder sql = new StringBuilder("SELECT id,hhid,licenseplate,color,desc,carport,hiredate " +
                " FROM vehicle WHERE del=0 ");

        if (vehicleVO.getId() != null){
            sql.append("AND id = ? ");
        }
        if (vehicleVO.getHhid() != null){
            sql.append("AND hhid = ? ");
        }
        if (vehicleVO.getLicenseplate() != null){
            sql.append("AND licenseplate = ? ");
        }
        if (vehicleVO.getCarport() != null){
            sql.append("AND carport = ? ");
        }
        if (vehicleVO.getBegin() != null && vehicleVO.getEnd() != null){
            sql.append("AND hiredate between ? AND ? ");
        }
        PreparedStatement pstmt = conn.prepareStatement(sql.toString());
        int i = 0;
        if (vehicleVO.getId() != null){
            i++;
            pstmt.setInt(i,vehicleVO.getId());
        }
        if (vehicleVO.getHhid() != null){
            i++;
            pstmt.setInt(i,vehicleVO.getHhid());
        }
        if (vehicleVO.getLicenseplate() != null){
            i++;
            pstmt.setString(i,vehicleVO.getLicenseplate());
        }
        if (vehicleVO.getCarport() != null){
            i++;
            pstmt.setString(i,vehicleVO.getCarport());
        }
        if (vehicleVO.getBegin() != null && vehicleVO.getEnd() != null){
            i++;
            pstmt.setDate(i,vehicleVO.getBegin());
            i++;
            pstmt.setDate(i,vehicleVO.getEnd());
        }
        List<Vehicle> vehicles = new ArrayList<>();
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            Vehicle vehicle = new Vehicle(
                    rs.getInt("id"),
                    rs.getInt("hhid"),
                    rs.getString("licenseplate"),
                    rs.getString("color"),
                    rs.getString("desc"),
                    rs.getString("carport"),
                    rs.getDate("hiredate"));
            vehicles.add(vehicle);
        }
        DBUtil.close(rs,pstmt,conn);
        return vehicles;
    }
}
