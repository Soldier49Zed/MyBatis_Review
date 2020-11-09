package com.houx.Mapper;

import com.houx.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

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

    //public Integer countUserByFirstName(String firstName);

    public List<Role> findRolesByMap(Map<String, Object> parameterMap);

    public List<Role> findRolesByAnnotation(@Param("roleName") String roleName, @Param("note") String note);

    public List<Role> findByRowBounds(@Param("roleName") String roleName,
                                      @Param("note") String note, RowBounds rowBounds);

}
