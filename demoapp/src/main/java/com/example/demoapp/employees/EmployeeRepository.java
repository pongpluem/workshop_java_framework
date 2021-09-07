package com.example.demoapp.employees;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //    List<Employee> findAllByIdAndName(int id,String name);
    // select * from employee where id=? ans name=?
}
