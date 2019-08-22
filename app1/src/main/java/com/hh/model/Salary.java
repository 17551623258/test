package com.hh.model;

/**
 * Created by pc on 2019/8/22.
 */
//工资
public class Salary {
    private Integer sid;
    private Integer eid;//员工id
    private double esmoney;//社保
    private double emoney;//实际工资
    private double eimoney;//违规扣除

    public Salary() {
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid( Integer sid ) {
        this.sid = sid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid( Integer eid ) {
        this.eid = eid;
    }

    public double getEsmoney() {
        return esmoney;
    }

    public void setEsmoney( double esmoney ) {
        this.esmoney = esmoney;
    }

    public double getEmoney() {
        return emoney;
    }

    public void setEmoney( double emoney ) {
        this.emoney = emoney;
    }

    public double getEimoney() {
        return eimoney;
    }

    public void setEimoney( double eimoney ) {
        this.eimoney = eimoney;
    }

    @Override
    public String toString() {
        return "Salary{" + "sid=" + sid + ", eid=" + eid + ", esmoney=" + esmoney + ", emoney=" + emoney + ", eimoney=" + eimoney + '}';
    }
}
