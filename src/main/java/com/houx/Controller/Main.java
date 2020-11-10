package com.houx.Controller;

import com.houx.Mapper.EmployeeMapper;
import com.houx.Mapper.RoleMapper;
import com.houx.Mapper.RoleParamsMapper;
import com.houx.pojo.Employee;
import com.houx.pojo.Role;
import com.houx.pojo.RoleParams;
import com.houx.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: HouX
 * @Date: 2020/11/8
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class);

        SqlSession sqlSession = null;

        try {
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.getEmployee(1L);

            logger.info(employee.getBirthday());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
