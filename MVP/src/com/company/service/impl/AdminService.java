package com.company.service.impl;

import com.company.comm.Const;
import com.company.dao.entity.Admin;
import com.company.dao.factory.DaoFactory;
import com.company.dao.idao.IAdminDao;
import com.company.service.iservice.IAdminService;

public class AdminService implements IAdminService {
    IAdminDao adminDao = null;

    public AdminService() {
        adminDao = (IAdminDao) DaoFactory.getInstance(Const.ADMIN);
    }


    @Override
    public Admin checkUserByName(String username, String password) {
        Admin admin = null;
        try {
            admin = adminDao.checkUserByName(username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return admin;
    }

    @Override
    public Admin checkUserByPhone(String phone, String password) {
        Admin admin = null;
        try {
            admin = adminDao.checkUserByPhone(phone, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return admin;
    }

    @Override
    public Admin checkUserByEmail(String email, String password) {
        Admin admin = null;
        try {
            admin = adminDao.checkUserByEmail(email, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return admin;
    }

    @Override
    public int countUserByName(String username) {
        return 0;
    }

    @Override
    public int countUserByPhone(String phone) {
        return 0;
    }

    @Override
    public int countUserByEmail(String email) {
        return 0;
    }
}
