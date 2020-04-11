package com.chp.mybatis.mapper;

import com.chp.mybatis.enums.Sex;
import com.chp.mybatis.pojo.Role;
import com.chp.mybatis.pojo.Student;
import com.chp.mybatis.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class RoleMapperTest {

    @Test
    public void createRoleTest(){
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setRoleName("收费员1");
            role.setAdmin(Boolean.TRUE);
            roleMapper.createRole(role);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally{
            if(sqlSession != null){
                sqlSession.close();
            }
        }
    }


    @Test
    public void getAllStudentTest(){
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> students = studentMapper.getAllStudent();
            System.out.println(students);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally{
            if(sqlSession != null){
                sqlSession.close();
            }
        }
    }

    @Test
    public void createStudentTest(){
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            Student stu = new Student();
            stu.setCnname("同学A");
            stu.setSelfcardNo(0001);
            stu.setSex(Sex.MALE);
            stu.setNote(Sex.FEMALE);
            studentMapper.createStudent(stu);
            System.out.println(stu);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally{
            if(sqlSession != null){
                sqlSession.close();
            }
        }
    }
}
