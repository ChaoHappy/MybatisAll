package com.chp.mybatis.pojo;

import com.chp.mybatis.enums.Sex;

public class Student {
    private Long id;
    private String cnname;
    private Sex sex;
    private Integer selfcardNo;
    private Sex note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Integer getSelfcardNo() {
        return selfcardNo;
    }

    public void setSelfcardNo(Integer selfcardNo) {
        this.selfcardNo = selfcardNo;
    }

    public Sex getNote() {
        return note;
    }

    public void setNote(Sex note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", cnname='" + cnname + '\'' +
                ", sex=" + sex +
                ", selfcardNo=" + selfcardNo +
                ", note=" + note +
                '}';
    }
}
