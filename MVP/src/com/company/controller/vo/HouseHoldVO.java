package com.company.controller.vo;

import java.util.Date;

public class HouseHoldVO {
    private int id;
    private String name;
    private String idcard;
    private String mpbile;
    private String occupation;
    private Date birthday;
    private String gender;
    private Date begin;
    private Date end;

    public HouseHoldVO(int id, String name, String idcard, String mpbile, String occupation, Date birthday, String gender, Date begin, Date end) {
        this.id = id;
        this.name = name;
        this.idcard = idcard;
        this.mpbile = mpbile;
        this.occupation = occupation;
        this.birthday = birthday;
        this.gender = gender;
        this.begin = begin;
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getMpbile() {
        return mpbile;
    }

    public void setMpbile(String mpbile) {
        this.mpbile = mpbile;
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
