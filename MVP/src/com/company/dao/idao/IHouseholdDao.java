package com.company.dao.idao;

import com.company.controller.vo.HouseHoldVO;
import com.company.dao.entity.HouseHold;

import java.util.List;

public interface IHouseholdDao {
    int save(HouseHold houseHold) throws Exception;

    int delete(HouseHold houseHold) throws Exception;

    int update(HouseHold houseHold) throws Exception;

    List<HouseHold> findAll() throws Exception;

    HouseHold findById(int id) throws Exception;

    HouseHold findByName(String username) throws Exception;

    List<HouseHold> findQuery(HouseHoldVO houseHoldVO) throws Exception;
}
