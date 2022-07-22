package com.aha.springbootdemoweb.controller;

import com.aha.springbootdemoweb.Dao.EmployeeDao;
import com.aha.springbootdemoweb.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * @author Aha
 * @create 2022-07-21  23:36
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    @RequestMapping("/emps")
    public String  list(Model model){
        Collection<Employee> allEmployee = employeeDao.getAllEmployee();
        model.addAttribute("emps",allEmployee);
        return "/emp/list";
    }
}
