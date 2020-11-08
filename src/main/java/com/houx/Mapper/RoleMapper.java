package com.houx.Mapper;

import com.houx.pojo.Role;

import java.util.List;

/**
 * @Author: HouX
 * @Date: 2020/11/8
 * @Description:
 */
public interface RoleMapper {

    public int insertRole(Role role);

    public int deleteRole(int id);

    public int updateRole(Role role);

    public Role getRole(int id);

    public List<Role> findRoles(String roleName);

}
