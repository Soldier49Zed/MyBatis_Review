package com.houx.Controller;

import com.houx.Mapper.EmployeeMapper;
import com.houx.Mapper.PdRoleMapper;
import com.houx.Mapper.RoleMapper;
import com.houx.Mapper2.RoleMapper2;
import com.houx.Mapper2.UserMapper2;
import com.houx.param.PageParams;
import com.houx.param.PdCountRoleParams;
import com.houx.param.PdFindRoleParams;
import com.houx.param.RoleParams;
import com.houx.pojo.Employee;
import com.houx.pojo.Role;
import com.houx.pojo2.Role2;
import com.houx.pojo2.User2;
import com.houx.utils.SqlSessionFactoryUtils;
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
        testGetRole();
        //testFindRolesByMap();
    }

    public static void testGetRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            System.out.println(role.getRoleName());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testFindRolesByMap() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Map<String, Object> parameterMap = new HashMap<String, Object>();
            parameterMap.put("roleName", "1");
            parameterMap.put("note", "1");
            List<Role> roles = roleMapper.findRolesByMap(parameterMap);
            System.out.println(roles.size());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testFindRolesByAnnotation() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            List<Role> roles = roleMapper.findRolesByAnnotation("1", "1");
            System.out.println(roles.size());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }


    public static void testFindRolesByBean() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            RoleParams roleParam = new RoleParams();
            roleParam.setNote("1");
            roleParam.setRoleName("1");
            List<Role> roles = roleMapper.findRolesByBean(roleParam);
            System.out.println(roles.size());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testFindByMix() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            RoleParams roleParam = new RoleParams();
            roleParam.setNote("1");
            roleParam.setRoleName("1");
            PageParams pageParams = new PageParams();
            pageParams.setStart(0);
            pageParams.setLimit(100);
            List<Role> roles = roleMapper.findByMix(roleParam, pageParams);
            System.out.println(roles.size());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testGetRoleUseResultMap() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRoleUseResultMap(1L);
            System.out.println(role.getRoleName());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testInsertRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setRoleName("role_name_5");
            role.setNote("note_5");
            roleMapper.insertRole(role);
            //回填
            System.out.println(role.getId());
            sqlSession.commit();
        } catch (Exception ex) {
            sqlSession.rollback();
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testInsertRole2() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setRoleName("role_name");
            role.setNote("note");
            roleMapper.insertRole2(role);
            //回填
            System.out.println(role.getId());
            sqlSession.commit();
        } catch (Exception ex) {
            sqlSession.rollback();
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testUpdateRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setRoleName("role_name_1_update");
            role.setNote("note_1_update");
            role.setId(1L);
            roleMapper.updateRole(role);
            sqlSession.commit();
        } catch (Exception ex) {
            sqlSession.rollback();
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testDeleteRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            roleMapper.deleteRole(3L);
            sqlSession.commit();
        } catch (Exception ex) {
            sqlSession.rollback();
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testGetEmployee() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.getEmployee(1L);
            System.out.println(employee.getWorkCard().getPosition());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testGetEmployee2() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = employeeMapper.getEmployee2(1L);
            System.out.println(employee.getWorkCard().getPosition());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testUserRole() {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper2 roleMapper2 = sqlSession.getMapper(RoleMapper2.class);
            Role2 role2 = roleMapper2.getRole(1L);
            System.out.println(role2.getUserList().size());
            UserMapper2 userMapper2 = sqlSession.getMapper(UserMapper2.class);
            User2 user2 = userMapper2.getUser(1L);
            System.out.println(user2.getRoleList().size());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testOneLevelCache() {
        SqlSession sqlSession = null;
        Logger logger = Logger.getLogger(Main.class);
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            logger.info("再获取一次POJO......");
            Role role2 = roleMapper.getRole(1L);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testOneLevelCache2() {
        SqlSession sqlSession = null;
        SqlSession sqlSession2 = null;
        Logger logger = Logger.getLogger(Main.class);
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            sqlSession2 = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            //需要提交，如果是一级缓存，MyBatis才会缓存对象到SqlSessionFactory层面
            sqlSession.commit();
            logger.info("不同sqlSession再获取一次POJO......");
            RoleMapper roleMapper2 = sqlSession2.getMapper(RoleMapper.class);
            Role role2 = roleMapper2.getRole(1L);
            //需要提交，MyBatis才缓存对象到SQLSessionFactory
            sqlSession2.commit();
        } catch (Exception e) {
            logger.info(e.getMessage(), e);
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
            if (sqlSession2 != null) {
                sqlSession.close();
            }
        }
    }

    public static void testPdCountRole() {
        PdCountRoleParams params = new PdCountRoleParams();
        SqlSession sqlSession = null;
        try {
            Logger logger = Logger.getLogger(Main.class);
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            PdRoleMapper roleMapper = sqlSession.getMapper(PdRoleMapper.class);
            params.setRoleName("role_name");
            roleMapper.countRole(params);
            logger.info(params.getTotal());
            logger.info(params.getExecDate());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    public static void testPdFindRole() {
        PdFindRoleParams params = new PdFindRoleParams();
        SqlSession sqlSession = null;
        try {
            Logger logger = Logger.getLogger(Main.class);
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            PdRoleMapper roleMapper = sqlSession.getMapper(PdRoleMapper.class);
            params.setRoleName("role_name");
            params.setStart(0);
            params.setEnd(100);
            roleMapper.findRole(params);
            logger.info(params.getRoleList().size());
            logger.info(params.getTotal());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}