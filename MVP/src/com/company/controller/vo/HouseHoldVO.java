package com.company.controller.vo;

import java.util.Date;

public class HouseHoldVO {
    private Integer id;
    private String name;
    private String idCard;
    private String mobile;
    private String occupation;
    private Date birthday;
    private String gender;
    private Date begin;
    private Date end;

    public HouseHoldVO(Integer id, String name, String idCard, String mobile, String occupation, Date birthday, String gender, Date begin, Date end) {
        this.id = id;
        this.name = name;
        this.idCard = idCard;
        this.mobile = mobile;
        this.occupation = occupation;
        this.birthday = birthday;
        this.gender = gender;
        this.begin = begin;
        this.end = end;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
