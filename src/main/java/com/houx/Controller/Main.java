package com.houx.Controller;

import com.houx.Mapper.RoleMapper;
import com.houx.pojo.Role;
import com.houx.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.List;

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
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

            List<Role> role = roleMapper.findRoles("houx1");
            logger.info(role);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
