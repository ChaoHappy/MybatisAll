package com.chp.mybatis.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BooleanTypeHandler  implements TypeHandler<Boolean> {
    public void setParameter(PreparedStatement preparedStatement, int i, Boolean aBoolean, JdbcType jdbcType) throws SQLException {
        Boolean flag = (Boolean) aBoolean;
        String value = flag == true ? "Y" : "N";
        preparedStatement.setString(i, value);
    }

    public Boolean getResult(ResultSet resultSet, String s) throws SQLException {
        String str = resultSet.getString(s);
        Boolean flag = Boolean.FALSE;
        if(str.equalsIgnoreCase("Y")){
            flag = Boolean.TRUE;
        }
        return flag;
    }

    public Boolean getResult(ResultSet resultSet, int i) throws SQLException {
        String str = resultSet.getString(i);
        Boolean flag = Boolean.FALSE;
        if(str.equalsIgnoreCase("Y")){
            flag = Boolean.TRUE;
        }
        return flag;
    }

    public Boolean getResult(CallableStatement callableStatement, int i) throws SQLException {
        String str = callableStatement.getString(i);
        Boolean flag = Boolean.FALSE;
        if(str.equalsIgnoreCase("Y")){
            flag = Boolean.TRUE;
        }
        return flag;
    }
}
