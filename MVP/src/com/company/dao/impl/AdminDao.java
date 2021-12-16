package com.company.dao.impl;

import com.company.dao.entity.Admin;
import com.company.dao.idao.IAdminDao;
import com.company.dao.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDao implements IAdminDao {
    @Override
    public Admin checkUserByName(String username, String password) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql = "SELECT username,password,`type` FROM admin WHERE del=0 AND username=? AND password=md5(?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,username);
        pstmt.setString(2,password);
        ResultSet rs = pstmt.executeQuery();
        Admin admin = null;
        if (rs.next()){
            admin = new Admin(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getInt(3));
        }
        DBUtil.close(rs,pstmt,conn);
        return admin;
    }

    @Override
    public Admin checkUserByPhone(String phone, String password) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql = "SELECT phone,password,`type` FROM admin WHERE del=0 AND phone=? AND password=md5(?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,phone);
        pstmt.setString(2,password);
        ResultSet rs = pstmt.executeQuery();
        Admin admin = null;
        if (rs.next()){
            admin = new Admin(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getInt(3));
        }
        DBUtil.close(rs,pstmt,conn);
        return admin;
    }

    @Override
    public Admin checkUserByEmail(String email, String password) throws Exception {
        Connection conn = DBUtil.getConnection();
        String sql = "SELECT email,password,`type` FROM admin WHERE del=0 AND email=? AND password=md5(?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,email);
        pstmt.setString(2,password);
        ResultSet rs = pstmt.executeQuery();
        Admin admin = null;
        if (rs.next()){
            admin = new Admin(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getInt(3));
        }
        DBUtil.close(rs,pstmt,conn);
        return admin;
    }
}
