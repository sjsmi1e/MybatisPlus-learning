package com.smile.MP_Learning.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smile.MP_Learning.mapper.bo.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author smi1e
 * Date 2019/11/8 9:18
 * Description
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
