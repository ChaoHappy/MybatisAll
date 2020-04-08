package com.chp.mybatis.mapper;

import com.chp.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User getUser(Long id);
    void createUser(User user);
    void updateUser(@Param("id")Long id,@Param("name") String name);
    void deleteUser(Long id);
}
