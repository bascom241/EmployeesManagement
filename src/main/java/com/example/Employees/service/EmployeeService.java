package com.example.Employees.service;

import com.example.Employees.model.Employee;
import com.example.Employees.reprository.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployess(){
        return employeeRepository.getEmployees();
    }
    public Employee addEmployee(Employee employee){
        return employeeRepository.addEmployee(employee);
    }
}
