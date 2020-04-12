package com.chp.mybatis.mapper;

import com.chp.mybatis.pojo.Customer;
import com.chp.mybatis.pojo.CustomerParam;
import com.chp.mybatis.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerMapperTest {

    @Test
    public void getCustomerTest(){
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            Customer customer = customerMapper.getCustomer(1l);
            System.out.println(customer);
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
    public void getCustomerByMapTest(){
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            Map<String,String> map = new HashMap<String, String>();
            map.put("cusName","张");
            map.put("cusNo","1");
            List<Customer> customers = customerMapper.getCustomerByMap(map);
            System.out.println(customers);
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
    public void getCustomerByAnnTest(){
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            List<Customer> customers = customerMapper.getCustomerByAnn("张","1");
            System.out.println(customers);
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
    public void getCustomerByBeanTest(){
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            CustomerParam cusParam = new CustomerParam();
            cusParam.setCusName("张");
            cusParam.setCusNo("1");
            List<Customer> customers = customerMapper.getCustomerByBean(cusParam);
            System.out.println(customers);
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
    public void createCustomerTest(){
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            Customer cus = new Customer();
            cus.setCusName("张四");
            cus.setAge(12);
            cus.setCusNo("002");
            customerMapper.createCustomer(cus);
            System.out.println(cus);
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
    public void updateCustomerTest(){
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            Customer cus = new Customer();
            cus.setId(5l);
            cus.setCusName("张四1");
            customerMapper.updateCustomer(cus);
            System.out.println(cus);
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
    public void deleteCustomerTest(){
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            customerMapper.deleteCustomer(5l);
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
    public void getCustomerBySqlTest(){
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            Customer customer = customerMapper.getCustomerBySql(4l);
            System.out.println(customer);
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
    public void getCustomerByPrefixSqlTest(){
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        try {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            Customer customer = customerMapper.getCustomerByPrefixSql(4l);
            System.out.println(customer);
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
