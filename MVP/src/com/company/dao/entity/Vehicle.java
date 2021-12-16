package com.company.dao.entity;

import java.util.Date;

public class Vehicle {
    private int id;
    private int hhid;
    private String licenseplate;
    private String color;
    private String desc;
    private String img;
    private String carport;
    private Date hiredate;
    private int del;

    public Vehicle(int hhid, String licenseplate, String color, String desc, String carport, Date hiredate) {
        this.hhid = hhid;
        this.licenseplate = licenseplate;
        this.color = color;
        this.desc = desc;
        this.carport = carport;
        this.hiredate = hiredate;
    }

    public Vehicle(int id, int hhid, String licenseplate, String color, String desc, String carport, Date hiredate) {
        this.id = id;
        this.hhid = hhid;
        this.licenseplate = licenseplate;
        this.color = color;
        this.desc = desc;
        this.carport = carport;
        this.hiredate = hiredate;
    }

    public Vehicle(int id, int hhid, String licenseplate, String color, String desc, String img, String carport, Date hiredate) {
        this.id = id;
        this.hhid = hhid;
        this.licenseplate = licenseplate;
        this.color = color;
        this.desc = desc;
        this.img = img;
        this.carport = carport;
        this.hiredate = hiredate;
    }

    public Vehicle(int hhid, String licenseplate, String color, String desc, String img, String carport, Date hiredate) {
        this.hhid = hhid;
        this.licenseplate = licenseplate;
        this.color = color;
        this.desc = desc;
        this.img = img;
        this.carport = carport;
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", hhid=" + hhid +
                ", licenseplate='" + licenseplate + '\'' +
                ", color='" + color + '\'' +
                ", desc='" + desc + '\'' +
                ", img='" + img + '\'' +
                ", carport='" + carport + '\'' +
                ", hiredate=" + hiredate +
                ", del=" + del +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHhid() {
        return hhid;
    }

    public void setHhid(int hhid) {
        this.hhid = hhid;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCarport() {
        return carport;
    }

    public void setCarport(String carport) {
        this.carport = carport;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }
}
