package com.zxr.model;

public class Kkeys {
    private String 型号;

    private String 厂商;

    private Integer 编号;
    public Locks locks;

    public Locks getLocks() { return locks;}

    public void setLocks(Locks locks) {this.locks = locks;}

    public String get型号() {
        return 型号;
    }

    public void set型号(String 型号) {
        this.型号 = 型号 == null ? null : 型号.trim();
    }

    public String get厂商() {
        return 厂商;
    }

    public void set厂商(String 厂商) {
        this.厂商 = 厂商 == null ? null : 厂商.trim();
    }

    public Integer get编号() {
        return 编号;
    }

    public void set编号(Integer 编号) {
        this.编号 = 编号;
    }
}