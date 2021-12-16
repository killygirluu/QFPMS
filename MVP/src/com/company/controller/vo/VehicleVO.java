package com.company.controller.vo;

import java.sql.Date;

public class VehicleVO {
    private Integer id;
    private Integer hhid;
    private String licenseplate;
    private String carport;
    private Date begin;
    private Date end;

    public VehicleVO(Integer id, Integer hhid, String licenseplate, String carport, Date begin, Date end) {
        this.id = id;
        this.hhid = hhid;
        this.licenseplate = licenseplate;
        this.carport = carport;
        this.begin = begin;
        this.end = end;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHhid() {
        return hhid;
    }

    public void setHhid(Integer hhid) {
        this.hhid = hhid;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String getCarport() {
        return carport;
    }

    public void setCarport(String carport) {
        this.carport = carport;
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
