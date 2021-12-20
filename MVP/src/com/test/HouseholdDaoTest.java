package com.test;

import com.company.comm.Const;
import com.company.dao.entity.HouseHold;
import com.company.dao.factory.DaoFactory;
import com.company.dao.idao.IHouseholdDao;
import com.company.service.factory.ServiceFactory;
import com.company.service.iservice.IHouseHoldService;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.*;

public class HouseholdDaoTest {
    IHouseholdDao householdDao = null;

    @Before
    public void setUp(){
        householdDao = (IHouseholdDao) DaoFactory.getInstance(Const.HOUSEHOLD);
    }








    @Test
    public void update() throws Exception {
        HouseHold houseHold = new HouseHold(3,"王五","420901199910021122","12312341234","歌手",
                new SimpleDateFormat("yyyy-MM-dd").parse("1999-10-02"),"男",
                new SimpleDateFormat("yyyy-MM-dd").parse("2021-10-02"));
        int update = householdDao.update(houseHold);
        System.out.println("update"+update);

    }
}