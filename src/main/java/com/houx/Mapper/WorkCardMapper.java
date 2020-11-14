package com.houx.Mapper;

import com.houx.pojo.WorkCard;

/**
 * @Author: HouX
 * @Date: 2020/11/10
 * @Description:
 */
public interface WorkCardMapper {
    WorkCard getWorkCardByEmpId(Long empId);
}
