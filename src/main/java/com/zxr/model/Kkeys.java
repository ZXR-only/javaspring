package com.zxr.model;

public class Kkeys {
    private String �ͺ�;

    private String ����;

    private Integer ���;
    public Locks locks;

    public Locks getLocks() { return locks;}

    public void setLocks(Locks locks) {this.locks = locks;}

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