package com.example.Employees.service;

import com.example.Employees.model.Employee;
import com.example.Employees.reprository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployess(){
        return employeeRepository.getEmployees();
    }
    public Employee addEmployee(Employee employee){
        return employeeRepository.addEmployee(employee);
    }
    public Employee getEmployee(int employeeId){
        return employeeRepository.getEmployee(employeeId);
    }
}
