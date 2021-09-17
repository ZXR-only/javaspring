package com.zxr.model;

public class IntermediariesKey {
    private String 供应商名字;

    private String 零售商名字;

    public String get供应商名字() {
        return 供应商名字;
    }

    public void set供应商名字(String 供应商名字) {
        this.供应商名字 = 供应商名字 == null ? null : 供应商名字.trim();
    }

    public String get零售商名字() {
        return 零售商名字;
    }

    public void set零售商名字(String 零售商名字) {
        this.零售商名字 = 零售商名字 == null ? null : 零售商名字.trim();
    }
}