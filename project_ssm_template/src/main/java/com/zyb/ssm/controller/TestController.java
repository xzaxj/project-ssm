package com.zyb.ssm.controller;

import com.zyb.ssm.service.impl.EmployeeServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @Autowired
    private EmployeeServiceImpl impl;
    @RequestMapping("/zyb")
    public String select(){
        return "index";
    }
    @Test
    public void unit1(){
        System.out.println(impl);
        String ab=new String("dsdsd");

    }

}
