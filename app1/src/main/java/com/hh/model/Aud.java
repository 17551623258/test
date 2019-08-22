package com.hh.model;

/**
 * Created by pc on 2019/8/22.
 */
//面试
public class Aud {
    private Integer aid;
    private Integer uid;
    private Integer auid;//面试状态是否通过

    public Aud() {
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid( Integer aid ) {
        this.aid = aid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid( Integer uid ) {
        this.uid = uid;
    }

    public Integer getAuid() {
        return auid;
    }

    public void setAuid( Integer auid ) {
        this.auid = auid;
    }

    @Override
    public String toString() {
        return "Aud{" + "aid=" + aid + ", uid=" + uid + ", auid=" + auid + '}';
    }
}
