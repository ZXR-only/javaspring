package com.zxr.model;

public class Student {
    private String �༶;

    private String ���ڰ༶;

    private String ѧУ;

    private Integer ���;

    public Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String get�༶() {
        return �༶;
    }

    public void set�༶(String �༶) {
        this.�༶ = �༶ == null ? null : �༶.trim();
    }

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