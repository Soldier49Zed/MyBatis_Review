package com.houx.Mapper;

import com.houx.pojo.Employee;

/**
 * @Author: HouX
 * @Date: 2020/11/10
 * @Description:
 */
public interface EmployeeMapper {
    public Employee getEmployee(Long id);

    public Employee getEmployee2(Long id);
}
