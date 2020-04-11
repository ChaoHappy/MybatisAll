package com.chp.mybatis.mapper;

import com.chp.mybatis.pojo.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> getAllStudent();

    int createStudent(Student stu);
}
