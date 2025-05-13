package com.example.Employee.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.entity.Employee;
import com.example.Employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService service;  

    @GetMapping("/getAll")
    public List<Employee> getAll()
    {
        return service.getAll();
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee emp)
    {
        return service.addEmployee(emp);
    }

    @GetMapping("/get/{id}")
    public Employee getEmployee(@PathVariable Integer id)
    {
        return service.getEmployeeById(id);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee,@PathVariable Integer id)
    {
        return service.updateEmployee(employee, id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id)
    {
        service.deleteEmployee(id);
        return "Employee deleted successfully...";
    }
}
