package com.zxr.model;

import java.util.List;

public class Teacher {
    private String ���ڰ༶;

    private String ѧУ;

    private Integer ���;

    private List<Student> list;

    public List<Student> getList() {return list; }

    public void setList(List<Student> list) {this.list = list;}

    public String get���ڰ༶() {
        return ���ڰ༶;
    }

    public void set���ڰ༶(String ���ڰ༶) {
        this.���ڰ༶ = ���ڰ༶ == null ? null : ���ڰ༶.trim();
    }

    public String getѧУ() {
        return ѧУ;
    }

    public void setѧУ(String ѧУ) {
        this.ѧУ = ѧУ == null ? null : ѧУ.trim();
    }

    public Integer get���() {
        return ���;
    }

    public void set���(Integer ���) {
        this.��� = ���;
    }
}