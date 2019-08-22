package com.hh.model;

/**
 * Created by pc on 2019/8/22.
 */
//管理员
public class Aadmin {
    private Integer aid;
    private String aname;
    private String apass;

    public Aadmin() {
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid( Integer aid ) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname( String aname ) {
        this.aname = aname;
    }

    public String getApass() {
        return apass;
    }

    public void setApass( String apass ) {
        this.apass = apass;
    }

    @Override
    public String toString() {
        return "Aadmin{" + "aid=" + aid + ", aname='" + aname + '\'' + ", apass='" + apass + '\'' + '}';
    }
}
