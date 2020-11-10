package com.houx.Mapper;

import com.houx.pojo.EmployeeTask;

/**
 * @Author: HouX
 * @Date: 2020/11/10
 * @Description:
 */
public interface EmployeeTaskMapper {
    EmployeeTask getEmployeeTaskByEmpId(Long empId);
}
