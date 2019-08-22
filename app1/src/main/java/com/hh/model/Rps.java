package com.hh.model;

/**
 * Created by pc on 2019/8/22.
 */
//奖惩
public class Rps {
    private Integer rid;
    private String rdescripe;
    private Integer pid;

    public Rps() {
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid( Integer rid ) {
        this.rid = rid;
    }

    public String getRdescripe() {
        return rdescripe;
    }

    public void setRdescripe( String rdescripe ) {
        this.rdescripe = rdescripe;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid( Integer pid ) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Rps{" + "rid=" + rid + ", rdescripe='" + rdescripe + '\'' + ", pid=" + pid + '}';
    }
}
