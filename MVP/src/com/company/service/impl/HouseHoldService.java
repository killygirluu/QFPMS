package com.company.service.impl;

import com.company.comm.Const;
import com.company.controller.vo.HouseHoldVO;
import com.company.dao.entity.HouseHold;
import com.company.dao.idao.IHouseholdDao;
import com.company.dao.impl.HouseholdDao;
import com.company.service.iservice.IHouseHoldService;

import java.util.ArrayList;
import java.util.List;

public class HouseHoldService implements IHouseHoldService {
    IHouseholdDao householdDao = null;

    public HouseHoldService() {
        householdDao = new HouseholdDao();
    }

    @Override
    public String save(HouseHold houseHold) {
        String msg = Const.ERROR;
        int flag = 0;
        try {
            flag = householdDao.save(houseHold);
            if (flag == 1){
                msg = Const.SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;

    }

    @Override
    public String delete(HouseHold houseHold) {
        String msg = Const.ERROR;
        int flag = 0;
        try {
            flag = householdDao.delete(houseHold);
            if (flag == 1){
                msg = Const.SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public String update(HouseHold houseHold) {
        String msg = Const.ERROR;
        int flag = 0;
        try {
            flag = householdDao.update(houseHold);
            if (flag == 1){
                msg = Const.SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

    @Override
    public List<HouseHold> findAll() {
        List<HouseHold> houseHolds = new ArrayList<>();
        try {
            houseHolds = householdDao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return houseHolds;
    }

    @Override
    public HouseHold findById(int id) {
        HouseHold houseHold = null;
        try {
            houseHold = householdDao.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return houseHold;
    }

    @Override
    public HouseHold findByName(String username) {
        HouseHold houseHold = null;
        try {
            houseHold = householdDao.findByName(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return houseHold;
    }

    @Override
    public List<HouseHold> findQuery(HouseHoldVO houseHoldVO) {
        List<HouseHold> houseHolds = new ArrayList<>();
        try {
            houseHolds = householdDao.findQuery(houseHoldVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return houseHolds;
    }
}
