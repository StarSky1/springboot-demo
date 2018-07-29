package com.yj.springbootdemo.model;

import java.util.Date;

public class t_student {
    private Integer sid;

    private String sname;

    private String ssex;

    private Integer sage;

    private Integer sclass;

    private Integer did;

    private Date sbir;

    private Integer sscore;

    private String sename;

    private String sphone;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public Integer getSclass() {
        return sclass;
    }

    public void setSclass(Integer sclass) {
        this.sclass = sclass;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Date getSbir() {
        return sbir;
    }

    public void setSbir(Date sbir) {
        this.sbir = sbir;
    }

    public Integer getSscore() {
        return sscore;
    }

    public void setSscore(Integer sscore) {
        this.sscore = sscore;
    }

    public String getSename() {
        return sename;
    }

    public void setSename(String sename) {
        this.sename = sename == null ? null : sename.trim();
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone == null ? null : sphone.trim();
    }
}