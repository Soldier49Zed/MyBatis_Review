package com.houx.Mapper2;

import java.util.List;

import com.houx.pojo2.Role2;

public interface RoleMapper2 {
	
	public Role2 getRole(Long id);
	
	public List<Role2> findRoleByUserId(Long userId);
}
