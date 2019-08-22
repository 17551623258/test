package com.hh.model;

/**
 * Created by pc on 2019/8/22.
 */
//职位
public class Postion {
    private Integer pid;
    private String pname;
    private Integer pdid;//做删除时判断
   /*
   判断


   */

    public Postion() {
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid( Integer pid ) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname( String pname ) {
        this.pname = pname;
    }

    public Integer getPdid() {
        return pdid;
    }

    public void setPdid( Integer pdid ) {
        this.pdid = pdid;
    }

    @Override
    public String toString() {
        return "Postion{" + "pid=" + pid + ", pname='" + pname + '\'' + ", pdid=" + pdid + '}';
    }
}
