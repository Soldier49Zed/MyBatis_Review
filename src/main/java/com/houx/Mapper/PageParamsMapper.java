package com.houx.Mapper;

import com.houx.pojo.PageParams;
import com.houx.pojo.Role;
import com.houx.pojo.RoleParams;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @Author: HouX
 * @Date: 2020/11/9
 * @Description:
 */
public interface PageParamsMapper {
    public List<Role> findByMix(@Param("Params") RoleParams roleParams, @Param("page") PageParams pageParams);

    // public List<Role> findByRowBounds(@Param("roleName") String roleName, @Param("note") String note, RowBounds rowBounds);
}
