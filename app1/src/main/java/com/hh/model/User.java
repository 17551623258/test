package com.hh.model;

/**
 * Created by pc on 2019/8/22.
 */
//用户
public class User {
    private Integer uid;
    private String uname;
    private String upass;
    private String usex;
    private Integer uage;

    public User() {
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid( Integer uid ) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname( String uname ) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass( String upass ) {
        this.upass = upass;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex( String usex ) {
        this.usex = usex;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage( Integer uage ) {
        this.uage = uage;
    }

    @Override
    public String toString() {
        return "User{" + "uid=" + uid + ", uname='" + uname + '\'' + ", upass='" + upass + '\'' + ", usex='" + usex + '\'' + ", uage=" + uage + '}';
    }
}
