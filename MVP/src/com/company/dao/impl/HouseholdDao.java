package com.company.dao.impl;

import com.company.controller.vo.HouseHoldVO;
import com.company.dao.entity.HouseHold;
import com.company.dao.idao.IHouseholdDao;
import com.company.dao.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class HouseholdDao implements IHouseholdDao {
    @Override
    public int save(HouseHold houseHold) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql = "INSERT INTO household(name,idcard,mobile,occupation,birthday,gender,hiredate) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,houseHold.getName());
        pstmt.setString(2,houseHold.getIdcard());
        pstmt.setString(3,houseHold.getMobile());
        pstmt.setString(4,houseHold.getOccupation());
        pstmt.setDate(5,(java.sql.Date)houseHold.getBirthday());
        pstmt.setString(6,houseHold.getGender());
        pstmt.setDate(7,(java.sql.Date)houseHold.getHiredate());
        int flag = pstmt.executeUpdate();
        DBUtil.close(null,pstmt,conn);
        return flag;
    }

    @Override
    public int delete(HouseHold houseHold) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql = "UPDATE household SET del = 1 WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,houseHold.getId());
        int flag = pstmt.executeUpdate();
        DBUtil.close(null,pstmt,conn);
        return flag;
    }

    @Override
    public int update(HouseHold houseHold) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql = "UPDATE household SET name=? AND idcard=? AND mobile=? AND occupation=? AND birthday=? AND gender=? AND hiredate=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,houseHold.getName());
        pstmt.setString(2,houseHold.getIdcard());
        pstmt.setString(3,houseHold.getMobile());
        pstmt.setString(4,houseHold.getOccupation());
        pstmt.setDate(5,(java.sql.Date)houseHold.getBirthday());
        pstmt.setString(6,houseHold.getIdcard());
        pstmt.setString(7,houseHold.getIdcard());
        pstmt.setString(8,houseHold.getIdcard());



        return 0;
    }

    @Override
    public List<HouseHold> findAll() throws Exception {
        return null;
    }

    @Override
    public HouseHold findById(int id) throws Exception {
        return null;
    }

    @Override
    public HouseHold findByName(String username) throws Exception {
        return null;
    }

    @Override
    public List<HouseHold> findQuery(HouseHoldVO houseHoldVO) throws Exception {
        return null;
    }
}
