package com.zxr.model;

public class Locks {
    private String �ͺ�;

    private String ����;

    private Integer ���;

    public Kkeys kkeys;

    public Kkeys getKkeys() {return kkeys; }

    public void setKkeys(Kkeys kkeys) {this.kkeys = kkeys;}

    public String get�ͺ�() {
        return �ͺ�;
    }

    public void set�ͺ�(String �ͺ�) {
        this.�ͺ� = �ͺ� == null ? null : �ͺ�.trim();
    }

    public String get����() {
        return ����;
    }

    public void set����(String ����) {
        this.���� = ���� == null ? null : ����.trim();
    }

    public Integer get���() {
        return ���;
    }

    public void set���(Integer ���) {
        this.��� = ���;
    }
}