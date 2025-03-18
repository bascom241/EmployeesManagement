package com.example.Employees.reprository;

import com.example.Employees.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeRepository(){
        employees.add(new Employee(1, "jade", 5000));
        employees.add(new Employee(2, "jane", 8000));
        employees.add(new Employee(3,"kane", 8500));
        employees.add(new Employee(4, "toba", 3500));
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    public Employee addEmployee(Employee employee){
        employees.add(employee);
        return employee;
    }
}
