package com.zxr.model;

import java.util.List;

public class Phones {
    private Integer pid;

    private String pname;

    private List<Watches> watches;

    public List<Watches> getWatches() {
        return watches;
    }

    public void setWatches(List<Watches> watches) {
        this.watches = watches;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }
}