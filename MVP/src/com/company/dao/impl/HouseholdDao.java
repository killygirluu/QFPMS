package com.company.dao.impl;

import com.company.controller.vo.HouseHoldVO;
import com.company.dao.entity.HouseHold;
import com.company.dao.idao.IHouseholdDao;
import com.company.dao.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HouseholdDao implements IHouseholdDao {
    @Override
    public int save(HouseHold houseHold) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql = "INSERT INTO household(name,idCard,mobile,occupation,birthday,gender,hiredate) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, houseHold.getName());
        pstmt.setString(2, houseHold.getIdCard());
        pstmt.setString(3, houseHold.getMobile());
        pstmt.setString(4, houseHold.getOccupation());
        pstmt.setDate(5, new java.sql.Date(houseHold.getBirthday().getTime()));
        pstmt.setString(6, houseHold.getGender());
        pstmt.setDate(7, new java.sql.Date(houseHold.getHiredate().getTime()));
        int flag = pstmt.executeUpdate();
        DBUtil.close(null, pstmt, conn);
        return flag;
    }

    @Override
    public int delete(HouseHold houseHold) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql = "UPDATE household SET del = 1 WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, houseHold.getId());
        int flag = pstmt.executeUpdate();
        DBUtil.close(null, pstmt, conn);
        return flag;
    }

    @Override
    public int update(HouseHold houseHold) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql = "UPDATE household SET name=? ,idCard=? ,mobile=?,occupation=?,birthday=? , gender=? , hiredate=? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, houseHold.getName());
        pstmt.setString(2, houseHold.getIdCard());
        pstmt.setString(3, houseHold.getMobile());
        pstmt.setString(4, houseHold.getOccupation());
        pstmt.setDate(5, new java.sql.Date(houseHold.getBirthday().getTime()));
        pstmt.setString(6, houseHold.getGender());
        pstmt.setDate(7, new java.sql.Date(houseHold.getHiredate().getTime()));
        pstmt.setInt(8, houseHold.getId());
        int flag = pstmt.executeUpdate();
        DBUtil.close(null, pstmt, conn);
        return flag;

    }

    @Override
    public List<HouseHold> findAll() throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql = "SELECT id,name,idCard,mobile,occupation,birthday,gender,hiredate FROM household WHERE del=0";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<HouseHold> houseHolds = new ArrayList<>();
        while (rs.next()) {
            HouseHold houseHold = new HouseHold(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("idCard"),
                    rs.getString("mobile"),
                    rs.getString("occupation"),
                    rs.getDate("birthday"),
                    rs.getString("gender"),
                    rs.getDate("hiredate"));
            houseHolds.add(houseHold);
        }
        DBUtil.close(rs, pstmt, conn);
        return houseHolds;
    }

    @Override
    public HouseHold findById(int id) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql = "SELECT id,name,idCard,mobile,occupation,birthday,gender,hiredate FROM household WHERE del=0 AND id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        HouseHold houseHold = null;
        if (rs.next()) {
            houseHold = new HouseHold(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("idCard"),
                    rs.getString("mobile"),
                    rs.getString("occupation"),
                    rs.getDate("birthday"),
                    rs.getString("gender"),
                    rs.getDate("hiredate"));
        }
        DBUtil.close(rs, pstmt, conn);
        return houseHold;
    }

    @Override
    public HouseHold findByName(String username) throws Exception {
        return null;
    }

    @Override
    public List<HouseHold> findQuery(HouseHoldVO houseHoldVO) throws Exception {
        Connection conn = DBUtil.getConnection();
        StringBuilder sql = new StringBuilder("SELECT id,name,idCard,mobile,occupation,birthday,gender,`begin`,`end` " +
                " FROM household WHERE del=0 ");

        if (houseHoldVO.getId() != null){
            sql.append("AND id = ? ");
        }
        if (houseHoldVO.getName() != null){
            sql.append("AND name LIKE CONCAT('%',?,'%') ");
        }
        if (houseHoldVO.getIdCard() != null){
            sql.append("AND idCard = ? ");
        }
        if (houseHoldVO.getMobile() != null){
            sql.append("AND mobile = ? ");
        }
        if (houseHoldVO.getOccupation() != null){
            sql.append("AND occupation = ? ");
        }
        if (houseHoldVO.getBirthday() != null){
            sql.append("AND birthday = ? ");
        }
        if (houseHoldVO.getGender() != null){
            sql.append("AND gender = ? ");
        }
        if (houseHoldVO.getBegin() != null && houseHoldVO.getEnd() != null){
            sql.append("AND hiredate between ? AND ? ");
        }
        PreparedStatement pstmt = conn.prepareStatement(sql.toString());
        int i = 0;
        if (houseHoldVO.getId() != null){
            i++;
            pstmt.setInt(i,houseHoldVO.getId());
        }
        if (houseHoldVO.getName() != null){
            i++;
            pstmt.setString(i,houseHoldVO.getName());
        }
        if (houseHoldVO.getIdCard() != null){
            i++;
            pstmt.setString(i,houseHoldVO.getIdCard());
        }
        if (houseHoldVO.getMobile() != null){
            i++;
            pstmt.setString(i,houseHoldVO.getMobile());
        }
        if (houseHoldVO.getOccupation() != null){
            i++;
            pstmt.setString(i,houseHoldVO.getOccupation());
        }
        if (houseHoldVO.getBirthday() != null){
            i++;
            pstmt.setDate(i,new java.sql.Date(houseHoldVO.getBirthday().getTime()));
        }
        if (houseHoldVO.getGender() != null){
            i++;
            pstmt.setString(i,houseHoldVO.getGender());
        }
        if (houseHoldVO.getBegin() != null && houseHoldVO.getEnd() != null){
            i++;
            pstmt.setDate(i,new java.sql.Date(houseHoldVO.getBegin().getTime()));
            i++;
            pstmt.setDate(i,new java.sql.Date(houseHoldVO.getEnd().getTime()));
        }
        List<HouseHold> houseHolds = new ArrayList<>();
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            HouseHold houseHold = new HouseHold(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("idCard"),
                    rs.getString("mobile"),
                    rs.getString("occupation"),
                    rs.getDate("birthday"),
                    rs.getString("gender"),
                    rs.getDate("hiredate")
            );
            houseHolds.add(houseHold);
        }
        DBUtil.close(rs,pstmt,conn);
        return houseHolds;
    }
}
