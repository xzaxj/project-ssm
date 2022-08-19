package com.zyb.ssm.test;

import com.zyb.ssm.mapper.DepartmentMapper;
import com.zyb.ssm.mapper.EmployeeMapper;
import com.zyb.ssm.pojo.Department;
import com.zyb.ssm.pojo.Employee;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc.xml","classpath:spring.xml"})
public class Test {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    @org.junit.Test
    public void unit1(){
        List<Employee> employees = employeeMapper.selectWithDept();
        Employee employee = employees.get(0);
        System.out.println(employees);


    }

}
