package com.zyb.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.zyb.ssm.pojo.Department;
import com.zyb.ssm.pojo.Employee;
import com.zyb.ssm.pojo.Msg;
import com.zyb.ssm.service.EmployeeService;
import com.zyb.ssm.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee/page/{pageNum}")
    @ResponseBody
    public PageInfo getPageEmployee(Model model, @PathVariable("pageNum") Integer pageNum) {
        PageInfo<Employee> employeePage = employeeService.getEmployeePage(pageNum);
//      model.addAttribute("pageInfo",employeePage);
//      return Msg.success().add("pageInfo",employeePage);
        return employeePage;
    }

    @GetMapping("/employee/to/add")
    public String toAdd() {
        return "add";
    }
    @PostMapping("/employee")
    public String addEmployee(Employee employee) {
        employeeService.addEmployee(employee);
        return "redirect:/";
    }
    @GetMapping("/employee/{id}")
    public String selectEmployee(@PathVariable("id")Integer id ,Model model){
        Employee employee = employeeService.selectEmployee(id);
        model.addAttribute("employee",employee);
        return "edit";
    }
    @PutMapping("/employee/{id}")
    public String editEmployee(Employee employee,@PathVariable Integer id){
        employee.setEmpId(id);
        employeeService.updateEmployee(employee);
        return "redirect:/";
    }
    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        employeeService.delete(id);
        return "redirect:/";
//        改成请求转发报错,先放在这
    }

}
