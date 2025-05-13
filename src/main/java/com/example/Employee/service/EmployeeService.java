package com.example.Employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Employee.entity.Employee;

@Service
public interface EmployeeService {
    public List<Employee> getAll();
    public Employee getEmployeeById(Integer id);
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(Employee employee,Integer id);
    public void deleteEmployee(Integer id);    
} 
