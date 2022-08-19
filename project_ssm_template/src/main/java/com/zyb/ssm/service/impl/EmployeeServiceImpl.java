package com.zyb.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zyb.ssm.mapper.EmployeeMapper;
import com.zyb.ssm.pojo.Employee;
import com.zyb.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        PageHelper.startPage(pageNum,7);
        List<Employee> employees = employeeMapper.selectWithDept();
        PageInfo<Employee> pageInfo = new PageInfo<>(employees, 5);
        return pageInfo;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeMapper.insert(employee);
    }

    @Override
    public Employee selectEmployee(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateByPrimaryKey(employee);
    }

    @Override
    public void delete(Integer id) {
        employeeMapper.deleteByPrimaryKey(id);
    }
}
