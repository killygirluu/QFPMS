package com.company.dao.entity;

import java.util.Date;

public class HouseHould {
    public int id;
    public String name;
    public String idcard;
    public String mobile;
    public String occupation;
    public Date birthday;
    public String gender;
    public String hiredate;
    public int del;

    public HouseHould(int id, String name, String idcard, String mobile, String occupation, Date birthday, String gender, String hiredate, int del) {
        this.id = id;
        this.name = name;
        this.idcard = idcard;
        this.mobile = mobile;
        this.occupation = occupation;
        this.birthday = birthday;
        this.gender = gender;
        this.hiredate = hiredate;
        this.del = del;
    }

    public HouseHould(String name, String idcard, String mobile, String occupation, Date birthday, String gender, String hiredate, int del) {
        this.name = name;
        this.idcard = idcard;
        this.mobile = mobile;
        this.occupation = occupation;
        this.birthday = birthday;
        this.gender = gender;
        this.hiredate = hiredate;
        this.del = del;
    }

    @Override
    public String toString() {
        return "HouseHould{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idcard='" + idcard + '\'' +
                ", mobile='" + mobile + '\'' +
                ", occupation='" + occupation + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", hiredate='" + hiredate + '\'' +
                ", del=" + del +
                '}';
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

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }
}
