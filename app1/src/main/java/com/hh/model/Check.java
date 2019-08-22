package com.hh.model;

/**
 * Created by pc on 2019/8/22.
 */
//考勤表
public class Check {
    private Integer cid;
    private Integer eid;//员工id
    private String crtime;//上班时间
    private String cltime;//下班时间

    public Check() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid( Integer cid ) {
        this.cid = cid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid( Integer eid ) {
        this.eid = eid;
    }

    public String getCrtime() {
        return crtime;
    }

    public void setCrtime( String crtime ) {
        this.crtime = crtime;
    }

    public String getCltime() {
        return cltime;
    }

    public void setCltime( String cltime ) {
        this.cltime = cltime;
    }

    @Override
    public String toString() {
        return "Check{" + "cid=" + cid + ", eid=" + eid + ", crtime='" + crtime + '\'' + ", cltime='" + cltime + '\'' + '}';
    }
}
