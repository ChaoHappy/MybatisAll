package com.chp.mybatis.mapper;

import com.chp.mybatis.pojo.Customer;
import com.chp.mybatis.pojo.CustomerParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CustomerMapper {

    Customer getCustomer(Long id);

    List<Customer> getCustomerByMap(Map<String,String> params);

    List<Customer> getCustomerByAnn(@Param("cusName") String cusName,@Param("cusNo") String cusNo);

    List<Customer> getCustomerByBean(CustomerParam cusParam);

    int createCustomer(Customer customer);

    void updateCustomer(Customer cus);

    void deleteCustomer(Long id);

    Customer getCustomerBySql(Long id);

    Customer getCustomerByPrefixSql(Long id);


}
