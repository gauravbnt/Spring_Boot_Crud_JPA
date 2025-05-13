package com.example.Employee.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Employee.entity.Employee;
import com.example.Employee.repository.EmployeeRepository;
import com.example.Employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;
    
    @Autowired
    EmployeeRepository employeeRepository1;
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }
    public Employee getEmployeeById(Integer id){
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }
    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee updateEmployee(Employee employee,Integer id)
    {
        Employee emp=getEmployeeById(id);
        emp.setName(employee.getName());
        emp.setSalary(employee.getSalary());
        return employeeRepository.save(emp);
    }
    public void deleteEmployee(Integer id)
    {
        employeeRepository1.deleteById(id);
    }
}
