package com.hh.model;

/**
 * Created by pc on 2019/8/22.
 */
//培训
public class Train {
    private Integer tid;
    private String tname;
    private String tdescripe;
    private Integer tdid;//培训状态是否可删除
    private Integer eid;//培训员工id

    public Train() {
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid( Integer tid ) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname( String tname ) {
        this.tname = tname;
    }

    public String getTdescripe() {
        return tdescripe;
    }

    public void setTdescripe( String tdescripe ) {
        this.tdescripe = tdescripe;
    }

    public Integer getTdid() {
        return tdid;
    }

    public void setTdid( Integer tdid ) {
        this.tdid = tdid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid( Integer eid ) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return "Train{" + "tid=" + tid + ", tname='" + tname + '\'' + ", tdescripe='" + tdescripe + '\'' + ", tdid=" + tdid + ", eid=" + eid + '}';
    }
}
