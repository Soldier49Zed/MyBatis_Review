package com.houx.Mapper;

import com.houx.pojo.Role;
import com.houx.pojo.RoleParams;

import java.util.List;

/**
 * @Author: HouX
 * @Date: 2020/11/9
 * @Description:
 */
public interface RoleParamsMapper {
    public List<Role> findRolesByBean(RoleParams roleParams);
}
