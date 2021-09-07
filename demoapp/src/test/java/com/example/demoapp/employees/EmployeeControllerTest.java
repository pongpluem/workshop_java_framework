package com.example.demoapp.employees;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void listEmployee() {
        // Act
        EmployeeResponse[] results
                = restTemplate.getForObject("/employees", EmployeeResponse[].class);
        // Assert
        assertEquals(2, results.length);
        assertEquals(1, results[0].getId());
        assertEquals("Name1", results[0].getName());
    }

    @Test
    public void listEmployeeById() {
        //Arrange
        int id = 1;
        Employee employee100=new Employee();
        employee100.setName("Name1");
        employeeRepository.save(employee100);

        // Act
        EmployeeResponse result
                = restTemplate.getForObject("/employees/"+id, EmployeeResponse.class);
        // Assert
        assertEquals(1, result.getId());
        assertEquals("Name1", result.getName());
    }
}