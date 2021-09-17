package com.zxr.model;

public class Test {
    private Integer useid;

    private String usename;

    private Integer useage;

    private Integer usesalary;

    private String uselevel;

    public Integer getUseid() {
        return useid;
    }

    public void setUseid(Integer useid) {
        this.useid = useid;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename == null ? null : usename.trim();
    }

    public Integer getUseage() {
        return useage;
    }

    public void setUseage(Integer useage) {
        this.useage = useage;
    }

    public Integer getUsesalary() {
        return usesalary;
    }

    public void setUsesalary(Integer usesalary) {
        this.usesalary = usesalary;
    }

    public String getUselevel() {
        return uselevel;
    }

    public void setUselevel(String uselevel) {
        this.uselevel = uselevel == null ? null : uselevel.trim();
    }
}