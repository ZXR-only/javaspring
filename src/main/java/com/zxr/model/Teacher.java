package com.zxr.model;

import java.util.List;

public class Teacher {
    private String 所在班级;

    private String 学校;

    private Integer 编号;

    private List<Student> list;

    public List<Student> getList() {return list; }

    public void setList(List<Student> list) {this.list = list;}

    public String get所在班级() {
        return 所在班级;
    }

    public void set所在班级(String 所在班级) {
        this.所在班级 = 所在班级 == null ? null : 所在班级.trim();
    }

    public String get学校() {
        return 学校;
    }

    public void set学校(String 学校) {
        this.学校 = 学校 == null ? null : 学校.trim();
    }

    public Integer get编号() {
        return 编号;
    }

    public void set编号(Integer 编号) {
        this.编号 = 编号;
    }
}