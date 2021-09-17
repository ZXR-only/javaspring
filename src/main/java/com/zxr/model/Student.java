package com.zxr.model;

public class Student {
    private String 班级;

    private String 所在班级;

    private String 学校;

    private Integer 编号;

    public Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String get班级() {
        return 班级;
    }

    public void set班级(String 班级) {
        this.班级 = 班级 == null ? null : 班级.trim();
    }

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