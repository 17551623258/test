package com.hh.model;

/**
 * Created by pc on 2019/8/22.
 */
public class Job {
    private Integer jid;
    private String jname;
    private String jdescripe;

    public Job() {
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid( Integer jid ) {
        this.jid = jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJname( String jname ) {
        this.jname = jname;
    }

    public String getJdescripe() {
        return jdescripe;
    }

    public void setJdescripe( String jdescripe ) {
        this.jdescripe = jdescripe;
    }

    @Override
    public String toString() {
        return "Job{" + "jid=" + jid + ", jname='" + jname + '\'' + ", jdescripe='" + jdescripe + '\'' + '}';
    }
}
