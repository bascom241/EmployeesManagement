package com.example.Employees.model;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int employeeSalary;

    // Initializing the empty values of the employee details
    public Employee (int employeeId, String employeeName , int employeeSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
}
