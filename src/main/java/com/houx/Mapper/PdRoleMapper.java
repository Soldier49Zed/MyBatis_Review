package com.houx.Mapper;

import com.houx.param.PdCountRoleParams;
import com.houx.param.PdFindRoleParams;

public interface PdRoleMapper {

	public void countRole(PdCountRoleParams pdCountRoleParams);
	
	public void findRole(PdFindRoleParams pdFindRoleParams);
}
