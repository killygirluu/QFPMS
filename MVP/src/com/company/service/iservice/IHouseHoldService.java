package com.company.service.iservice;

import com.company.controller.vo.HouseHoldVO;
import com.company.dao.entity.HouseHold;

import java.util.List;

public interface IHouseHoldService {
    String save(HouseHold houseHold);
    String delete(HouseHold houseHold);
    String update(HouseHold houseHold);
    List<HouseHold> findAll();
    HouseHold findById(int id);
    HouseHold findByName(String username);
    List<HouseHold> findQuery(HouseHoldVO houseHoldVO);




}
