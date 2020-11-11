package com.houx.Mapper;

import com.houx.param.PageParams;
import com.houx.param.RoleParams;
import com.houx.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author: HouX
 * @Date: 2020/11/8
 * @Description:
 */
public interface RoleMapper {

    public Role getRole(Long id);

    public List<Role> findRolesByMap(Map<String, Object> parameterMap);

    public List<Role> findRolesByAnnotation(@Param("roleName") String rolename, @Param("note") String note);

    public List<Role> findRolesByBean(RoleParams roleParam);

    public List<Role> findByMix(@Param("params") RoleParams roleParams, @Param("page") PageParams PageParam);

    public Role getRoleUseResultMap(Long id);

    public int insertRole(Role role);

    public int insertRole2(Role role);

    public int updateRole(Role role);

    public int deleteRole(Long id);

}
