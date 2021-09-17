package com.zxr.model;

public class Retailers {
    private String 零售商名字;

    private String 提供货品;

    private Integer 编号;

    public String get零售商名字() {
        return 零售商名字;
    }

    public void set零售商名字(String 零售商名字) {
        this.零售商名字 = 零售商名字 == null ? null : 零售商名字.trim();
    }

    public String get提供货品() {
        return 提供货品;
    }

    public void set提供货品(String 提供货品) {
        this.提供货品 = 提供货品 == null ? null : 提供货品.trim();
    }

    public Integer get编号() {
        return 编号;
    }

    public void set编号(Integer 编号) {
        this.编号 = 编号;
    }
}