package com.smile.MP_Learning;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.smile.MP_Learning.mapper.EmployeeMapper;
import com.smile.MP_Learning.mapper.UserMapper;
import com.smile.MP_Learning.mapper.bo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = MpLearningApplication.class)
class MpLearningApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    void contextLoads() {
//		List<Employee> employees = employeeMapper.selectList(new QueryWrapper<Employee>().between("age",20,30)
//		.eq("gender",1));
//		System.out.println(employees);
        Employee employee = new Employee();
        employee.setAge(40);
        employee.setEmail("test@163.com");
        employee.setGender(1);
        employee.setLastName("lololol");
//        System.out.println(employee.insert());

        employee.setId(5);
        employee.updateById();

    }

}
