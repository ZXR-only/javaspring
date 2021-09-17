package com.zxr.model;

public class Suppliers {
    private String 供应商名字;

    private String 生产货品;

    private Integer 编号;

    public String get供应商名字() {
        return 供应商名字;
    }

    public void set供应商名字(String 供应商名字) {
        this.供应商名字 = 供应商名字 == null ? null : 供应商名字.trim();
    }

    public String get生产货品() {
        return 生产货品;
    }

    public void set生产货品(String 生产货品) {
        this.生产货品 = 生产货品 == null ? null : 生产货品.trim();
    }

    public Integer get编号() {
        return 编号;
    }

    public void set编号(Integer 编号) {
        this.编号 = 编号;
    }
}