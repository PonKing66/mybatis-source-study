package com.ponking.mapper;

import com.ponking.entiry.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author PengGuang
 * @date 2020/12/24-18:19
 **/
public interface RoleMapper {

    Role getRole(@Param("id") long id);

    Role findRole(@Param("roleName") String roleName);

    Role insertRole(Role role);

    Role deleteRole(@Param("id") long id);

    List<Role> findAll(@Param("ids") List<Long> ids);
}
