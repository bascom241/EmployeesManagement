package com.example.Employees.contoller;

import com.example.Employees.model.Employee;
import com.example.Employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployess();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return  employeeService.addEmployee(employee);
    }

    @GetMapping("/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        return employeeService.getEmployee(employeeId);
    }

}
