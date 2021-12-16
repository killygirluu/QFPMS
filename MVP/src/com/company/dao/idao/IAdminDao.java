package com.company.dao.idao;

import com.company.dao.entity.Admin;

public interface IAdminDao {
    Admin checkUserByName(String username, String password) throws Exception;

    Admin checkUserByPhone(String phone, String password) throws Exception;

    Admin checkUserByEmail(String email, String password) throws Exception;
}
