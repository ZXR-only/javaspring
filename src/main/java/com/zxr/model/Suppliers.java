package com.zxr.model;

public class Suppliers {
    private String ��Ӧ������;

    private String ������Ʒ;

    private Integer ���;

    public String get��Ӧ������() {
        return ��Ӧ������;
    }

    public void set��Ӧ������(String ��Ӧ������) {
        this.��Ӧ������ = ��Ӧ������ == null ? null : ��Ӧ������.trim();
    }

    public String get������Ʒ() {
        return ������Ʒ;
    }

    public void set������Ʒ(String ������Ʒ) {
        this.������Ʒ = ������Ʒ == null ? null : ������Ʒ.trim();
    }

    public Integer get���() {
        return ���;
    }

    public void set���(Integer ���) {
        this.��� = ���;
    }
}