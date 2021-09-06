package com.example.demoapp.employees;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/employees")
    public EmployeeResponse[] listEmployee(){
        EmployeeResponse employeeResponse1 = new EmployeeResponse(1,"Name1");
        EmployeeResponse employeeResponse2 = new EmployeeResponse(1,"Name2");
        return new EmployeeResponse[]{employeeResponse1,employeeResponse1};
    }
}
