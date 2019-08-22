package com.hh.model;

/**
 * Created by pc on 2019/8/22.
 */
//部门
public class Dept {
    private Integer did;
    private Integer dname;

    public Dept() {
    }

    public Integer getDid() {
        return did;
    }

    public void setDid( Integer did ) {
        this.did = did;
    }

    public Integer getDname() {
        return dname;
    }

    public void setDname( Integer dname ) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" + "did=" + did + ", dname=" + dname + '}';
    }
}
