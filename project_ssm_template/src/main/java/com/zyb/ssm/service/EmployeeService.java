package com.zyb.ssm.service;

import com.github.pagehelper.PageInfo;
import com.zyb.ssm.pojo.Employee;

public interface EmployeeService {
    public PageInfo<Employee> getEmployeePage(Integer pageNum);

    void addEmployee(Employee employee);

    Employee selectEmployee(Integer id);

    void updateEmployee(Employee employee);

    void delete(Integer id);
}
