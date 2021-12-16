package com.company.dao.entity;

import java.util.Date;

public class Admin {
    private int id;
    private String username;
    public String realname;
    public String password;
    public String phone;
    public String email;
    public Date hiredate;
    public String type;
    public String img;
    public int del;

    public Admin(int id, String username, String realname, String password, String phone, String email, Date hiredate, String type, String img, int del) {
        this.id = id;
        this.username = username;
        this.realname = realname;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.hiredate = hiredate;
        this.type = type;
        this.img = img;
        this.del = del;
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", hiredate=" + hiredate +
                ", type='" + type + '\'' +
                ", img='" + img + '\'' +
                ", del=" + del +
                '}';
    }
}
