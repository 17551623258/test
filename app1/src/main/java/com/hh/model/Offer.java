package com.hh.model;

/**
 * Created by pc on 2019/8/22.
 */
//简历
public class Offer {
    private Integer oid;
    private String oname;
    private String osex;
    private Integer oage;
    private String email;
    private String ophone;
    private String describe;
    private String education;
    private String owork;
    private String major;

    public Offer() {
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid( Integer oid ) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname( String oname ) {
        this.oname = oname;
    }

    public String getOsex() {
        return osex;
    }

    public void setOsex( String osex ) {
        this.osex = osex;
    }

    public Integer getOage() {
        return oage;
    }

    public void setOage( Integer oage ) {
        this.oage = oage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getOphone() {
        return ophone;
    }

    public void setOphone( String ophone ) {
        this.ophone = ophone;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe( String describe ) {
        this.describe = describe;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation( String education ) {
        this.education = education;
    }

    public String getOwork() {
        return owork;
    }

    public void setOwork( String owork ) {
        this.owork = owork;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor( String major ) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Offer{" + "oid=" + oid + ", oname='" + oname + '\'' + ", osex='" + osex + '\'' + ", oage=" + oage + ", email='" + email + '\'' + ", ophone='" + ophone + '\'' + ", describe='" + describe + '\'' + ", education='" + education + '\'' + ", owork='" + owork + '\'' + ", major='" + major + '\'' + '}';
    }
}
