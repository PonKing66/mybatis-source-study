package com.ponking.handler;

import com.sun.istack.internal.logging.Logger;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author ponking
 * @Date 2021/1/5 23:28
 */
public class MyTypeHandler extends BaseTypeHandler<String> {

    private final Logger log = Logger.getLogger(MyTypeHandler.class);

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        log.info("自定义typeHandler setNonNullParameter");
        ps.setString(i, parameter);
    }

    @Override
    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        log.info("自定义typeHandler getNullableResult: columnName {}", new Object[]{columnName});
        return rs.getString(columnName);
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        log.info("自定义typeHandler getNullableResult: columnIndex {}", new Object[]{columnIndex});
        return rs.getString(columnIndex);
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        log.info("自定义typeHandler getNullableResult: columnIndex {}", new Object[]{columnIndex});
        return cs.getString(columnIndex);
    }
}
