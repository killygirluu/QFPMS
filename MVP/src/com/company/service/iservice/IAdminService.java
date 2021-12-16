package com.company.service.iservice;

import com.company.dao.entity.Admin;

public interface IAdminService {
    Admin checkUserByName(String username, String password);

    Admin checkUserByPhone(String phone, String password);

    Admin checkUserByEmail(String email, String password);

    int countUserByName(String username);

    int countUserByPhone(String phone);

    int countUserByEmail(String email);

}
