package com.chp.mybatis.pojo;

public class Customer {
    private Long id;
    private String cusName;
    private Integer age;
    private String cusNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCusNo() {
        return cusNo;
    }

    public void setCusNo(String cusNo) {
        this.cusNo = cusNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", cusName='" + cusName + '\'' +
                ", age=" + age +
                ", cusNo='" + cusNo + '\'' +
                '}';
    }
}
